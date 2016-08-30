package com.mycompany.camel.producer;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.kafka.KafkaConstants;

public class MyProcessor implements Processor {
	  public void process(Exchange exchange) throws Exception {
		  
		  exchange.getIn().setHeader(KafkaConstants.PARTITION_KEY, 1);
          exchange.getIn().setHeader(KafkaConstants.KEY, "1");
	  }
}