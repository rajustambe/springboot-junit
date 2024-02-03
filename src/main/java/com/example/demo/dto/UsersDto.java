package com.example.demo.dto;

import java.util.List;

public class UsersDto {

    List<UserDto> userDtos;

	public List<UserDto> getUserDtos() {
		return userDtos;
	}

	public void setUserDtos(List<UserDto> userDtos) {
		this.userDtos = userDtos;
	}

	public UsersDto(List<UserDto> userDtos) {
		this.userDtos = userDtos;
	}

	public UsersDto() {
		
	}
    
    
}
