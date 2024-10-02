package com.example.basestructure.dto;

public class DtoResponse {
	
	private String responseId;
    private String responseData;
    private String status;

    // Constructors
    public DtoResponse() {
    }

    public DtoResponse(String responseId, String responseData, String status) {
        this.responseId = responseId;
        this.responseData = responseData;
        this.status = status;
    }

    // Getters and Setters
    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "DtoResponse{" +
                "responseId='" + responseId + '\'' +
                ", responseData='" + responseData + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
