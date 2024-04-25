package com.tutorial.document.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.document.model.Document;
import com.tutorial.document.service.DocumentService;

@RestController
public class DocumentController {

	private DocumentService documentService;
	public DocumentController(DocumentService documentService) {
		this.documentService = documentService;
	}
	
	@PostMapping("/produce")
	public void sendMessage(@RequestBody Document document) {
		documentService.sendMessage(document);
	}
	
}
