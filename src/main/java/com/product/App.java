package com.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(productConfig.class);
        product product1= context.getBean("product1",product.class);
        System.out.println(product1);

        product product2= context.getBean("product2",product.class);
        System.out.println(product2);

        product product3= context.getBean("product3",product.class);
        System.out.println(product3);
    }
}
