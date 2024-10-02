package com.example.basestructure.dto;

public class DtoRequest {
	
	private String requestId;
    private String requestData;

    // Constructors
    public DtoRequest() {
    }

    public DtoRequest(String requestId, String requestData) {
        this.requestId = requestId;
        this.requestData = requestData;
    }

    // Getters and Setters
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "DtoRequest{" +
                "requestId='" + requestId + '\'' +
                ", requestData='" + requestData + '\'' +
                '}';
    }

}
