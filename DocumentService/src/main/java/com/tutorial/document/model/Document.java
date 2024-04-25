package com.tutorial.document.model;

public class Document {

	private String documentId;
	private String docName;
	private String docCategory;
	private String timestamp;
	
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocCategory() {
		return docCategory;
	}
	public void setDocCategory(String docCategory) {
		this.docCategory = docCategory;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
