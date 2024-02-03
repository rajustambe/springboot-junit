package com.example.demo.request;

public class UserRequest {

    private String alias;
    private String name;
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserRequest(String alias, String name) {
		this.alias = alias;
		this.name = name;
	}
	public UserRequest() {
	
	}
    
    
}
