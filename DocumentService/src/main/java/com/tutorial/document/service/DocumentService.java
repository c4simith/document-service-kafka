package com.tutorial.document.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.tutorial.document.model.Document;

@Service
public class DocumentService {
	
    private KafkaTemplate<String, Document> kafkaTemplate;
    public DocumentService(KafkaTemplate<String, Document> kafkaTemplate) {
    	this.kafkaTemplate = kafkaTemplate;
    }

	public void sendMessage(Document document) {
		kafkaTemplate.send("bank_docs", document);
	}
	
	@KafkaListener(topics = "bank_docs")
	public void consume(String message) {
		System.out.println("Consumed Message : " + message);
	}
}
