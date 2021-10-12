package org.hugh.behavior.template;

/**
 * @author Hao Du
 * @version 1.0
 * @since 2021/10/10
 */
public class Client {
    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteImpl();
        template.templateMethod();

    }
}
