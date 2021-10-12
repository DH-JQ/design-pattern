package org.hugh.creating.builder;

public abstract class AbstractBuilder {
    int id;
    String name;

    public AbstractBuilder() {
    }

    public AbstractBuilder(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * build方法中，进行参数的校验
     * @return IProduct
     */
    public abstract IProduct build();
}
