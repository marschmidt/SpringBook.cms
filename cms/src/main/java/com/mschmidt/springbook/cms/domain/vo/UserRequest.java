package com.mschmidt.springbook.cms.domain.vo;

import com.mschmidt.springbook.cms.domain.models.Role;

import lombok.Data;

@Data
public class UserRequest {

	String identity;

	String name;

	Role role;
}