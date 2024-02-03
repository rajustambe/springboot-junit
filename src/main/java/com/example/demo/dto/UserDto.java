package com.example.demo.dto;

public class UserDto {

    private int id;
    private String alias;
    private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public UserDto(int id, String alias, String name) {
		super();
		this.id = id;
		this.alias = alias;
		this.name = name;
	}
	public UserDto() {
	
	}
    
    
}
