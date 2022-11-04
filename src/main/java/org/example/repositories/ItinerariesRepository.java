package org.example.repositories;

import org.example.Entities.Itinineraris;
import org.hibernate.Session;

public class ItinerariesRepository extends Repository<Itinineraris>{
    private final Session session;

    public ItinerariesRepository(Session session){
        super(session,Itinineraris.class);
        this.session=session;
    }

}
