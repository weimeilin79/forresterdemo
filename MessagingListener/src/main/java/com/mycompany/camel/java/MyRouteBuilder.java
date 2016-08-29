package com.mycompany.camel.java;

import java.util.HashMap;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.amqp.AMQPComponent;
import org.apache.camel.component.olingo2.Olingo2Component;
import org.apache.camel.component.olingo2.Olingo2Configuration;

import com.mycompany.camel.producer.MQTTParser;

/**
 * MSG Listener
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {        
    	
    	Olingo2Component olingo2Component = new Olingo2Component();
    	
    	HashMap<String, String> myHttpHeaders = new HashMap<String, String>();
    	myHttpHeaders.put("Authorization", "Basic dGVpaWRVc2VyOlJlZGhhdDEh");
    	myHttpHeaders.put("Accept", "*/*");
    	myHttpHeaders.put("ContentType", "application/atom+xml;charset=utf-8");
    	
    	Olingo2Configuration configuration = new Olingo2Configuration();
    	configuration.setHttpHeaders(myHttpHeaders);
    	configuration.setServiceUri("http://ec2-52-38-217-15.us-west-2.compute.amazonaws.com:8080/odata/customer_vdb");
 
    	olingo2Component.setConfiguration(configuration);
    	getContext().addComponent("odata", olingo2Component);
    	
    	
    	//MQTT
    	
    	MQTTParser myParser = new MQTTParser();
    	
    	from("mqtt:mqttforrester?subscribeTopicName=test.mqtt.topic&host=tcp://127.0.0.1:1883&userName=admin&password=admin")
    	.bean(myParser)
    	.log("receiving---> "+body())
    	.to("odata://create/customer_view.customer");
    	
    	//AMQP
    	AMQPComponent authorizedAmqp = AMQPComponent.amqpComponent("amqp://127.0.0.1:5672", "admin", "admin");
    	getContext().addComponent("amqp", authorizedAmqp);
    	
    	from("amqp:queue:forresterQ")
    	.log("AMPQ receiving---> "+body())
    	.to("odata://create/customer_view.customer");
    	
    	//KAFKA
    	    	
    	//from("kafka:localhost:2181?groupId=foo-group&autoOffsetReset=earliest&topic=forresterKafka")
    	//.log("KAFKA receiving---> "+body());
    	
    

    }

}
