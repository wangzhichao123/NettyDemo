package com.wzc.netty.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -905636993551474335L;

    private String id;

    private String name;

}
