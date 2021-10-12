package org.hugh.creating.builder;

public class Builder extends AbstractBuilder{
    public Builder() {
    }

    public Builder(int id, String name) {
        super(id, name);
    }

    @Override
    public IProduct build() {
        if (this.id < 0) {
            throw new IllegalArgumentException("id错误");
        }
        return new ConcreteProduct(this);
    }
}
