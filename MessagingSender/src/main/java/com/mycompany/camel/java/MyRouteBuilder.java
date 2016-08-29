package com.mycompany.camel.java;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.amqp.AMQPComponent;

import com.mycompany.camel.producer.CustomerGenerator;

/**
 * MSG Sender!
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {        
    	CustomerGenerator customerGenerator = new CustomerGenerator();
    	
    	//MQTT
    	
    	from("timer://foo?repeatCount=100&period=3000")
    	.bean(customerGenerator,"randomCustomer")
    	.log("sendingMQTT---> "+body().toString())
    	.convertBodyTo(java.lang.String.class)
    	.to("mqtt:mqttforrester?publishTopicName=test.mqtt.topic&host=tcp://127.0.0.1:1883&userName=admin&password=admin");
    	
    	
    	
    	AMQPComponent authorizedAmqp = AMQPComponent.amqpComponent("amqp://127.0.0.1:5672", "admin", "admin");
    	getContext().addComponent("amqp", authorizedAmqp);
    	
    	//AMQP
    	
    	from("timer://foo?repeatCount=5&period=3000")
    	.bean(customerGenerator,"randomCustomer")
    	.log("AMQP sending---> "+body().toString())
    	.to("amqp:queue:forresterQ");
    	
    	
    	
    	//KAFKA
    
    	//from("timer://foo?repeatCount=1&period=3000")
    	//.process(new Processor() {
        //            @Override
        //            public void process(Exchange exchange) throws Exception {
        //                exchange.getIn().setHeader(KafkaConstants.PARTITION_KEY, 1);
        //               exchange.getIn().setHeader(KafkaConstants.KEY, "1");
        //            }
        //        })
    	//.bean(customerGenerator,"randomCustomer")
    	//.log("Kafka sending---> "+body().toString())
    	//.to("kafka:localhost:2181?groupId=foo-group&autoOffsetReset=earliest&topic=forresterKafka&exchangePattern=InOut");
    	
    

    }

}
