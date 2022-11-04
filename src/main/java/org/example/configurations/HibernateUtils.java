package org.example.configurations;


import org.example.Entities.Bus;
import org.example.Entities.Itinineraris;
import org.example.Entities.Station;
import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {
    private  static SessionFactory sessionFactory;

    public  static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            Configuration configuration= new Configuration();
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            configuration.addAnnotatedClass(Station.class);
            configuration.addAnnotatedClass(Bus.class);
            configuration.addAnnotatedClass(Itinineraris.class);

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);


        }
        return sessionFactory;
    }
}
