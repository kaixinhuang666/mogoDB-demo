package com.hkx.mongo.mongodemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Document("users")
public class User {
    @Id
    private String id;
    private String name;
    private Integer age;
    private List<String> hobbies = new ArrayList<>();
}
