package com.example.crud_operation_on_user.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Data
@Entity //this is an indicating to JPA to convert this entity in to table
public class User {
@GeneratedValue(strategy = GenerationType.IDENTITY) //Defines the types of primary key generation strategies.
@Id //for primary key
private int id;
private String name;
private String email;
private int age;
}
