package org.hugh.creating.builder;

public class Director {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setId(10);
        builder.setName("hugh");
        IProduct pro = builder.build();
    }
}
