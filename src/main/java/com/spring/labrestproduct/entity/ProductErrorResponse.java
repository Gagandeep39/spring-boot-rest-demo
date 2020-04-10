/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-10 23:29:32
 * @modify date 2020-04-10 23:29:32
 * @desc Reponse entity used to respond during an exception
 */
package com.spring.labrestproduct.entity;

public class ProductErrorResponse {

    private int status;
    private String message;
    private long timeStamp;

    public ProductErrorResponse(){}

    public ProductErrorResponse(int status, String message, long timestamp){
        this.status = status;
        this.message = message;
        this.timeStamp = timestamp;
    }

    public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

}