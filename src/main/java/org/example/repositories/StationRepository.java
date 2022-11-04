package org.example.repositories;

import org.hibernate.Session;
import org.example.Entities.Station;


public class StationRepository extends Repository<Station>{
    public StationRepository(Session session){
        super(session, Station.class);
    }
}
