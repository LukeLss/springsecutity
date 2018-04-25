package com.gree.lss.springsecurity.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class RoleEntity implements Serializable{
    private static final long serialVersionUID = -5653862830639678688L;

    private Long id;
    private String name;
}
