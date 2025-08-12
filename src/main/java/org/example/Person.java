package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@Builder
@ToString
public class Person {
    private String name;
    private double height;
    private double weight;


}
