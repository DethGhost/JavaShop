package org.ua.deth.entitys;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.ua.deth.dao.ClientImpl;

import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by DethGhost on 15.09.2016.
 */
public class Main {
    public static void main(String[] aa) {

        SessionFactory sessionFactory = (SessionFactory) Persistence.createEntityManagerFactory("JavaShop");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.cfg.xml");
        ClientImpl client = new ClientImpl();







        List<Client> stream = client.showAll();
        for (int i = 0; i < stream.size(); i++) {
            System.out.println(stream.get(i));
        }

    }
}
