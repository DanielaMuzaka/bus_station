package org.example;

import org.example.Entities.Bus;
import org.example.Entities.Itinineraris;
import org.example.Entities.Station;
import org.example.configurations.HibernateUtils;
import org.example.repositories.BusRepository;
import org.example.repositories.ItinerariesRepository;
import org.example.repositories.StationRepository;
import org.hibernate.Session;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtils.getSessionFactory().openSession();
        BusRepository busRepository = new BusRepository(session);
        StationRepository stationRepository = new StationRepository(session);
//        Bus bus = new Bus("Bus1",true);
//        busRepository.save(bus);



        ItinerariesRepository itinerariesRepository = new ItinerariesRepository(session);
        Itinineraris itinineraris = new Itinineraris();
        itinineraris.setName("Tirane-Paris");
        itinineraris.setStartLocation("tirane");
        itinineraris.setEndDestination("Paris");
        itinineraris.setStartTime(LocalDateTime.of(2022, 11, 4, 11, 30));
        itinineraris.setEndTime(LocalDateTime.of(2022, 11, 4, 15, 0));
        List<Bus> buses = busRepository.findAll();

        List<Bus> itineraryBuses = new ArrayList<>();
        buses.forEach(bus-> {
            if(bus.getStatus()&& itineraryBuses.size()<2)
                itineraryBuses.add(bus);
        });
        itinineraris.setBuses(itineraryBuses);
        itinerariesRepository.save(itinineraris);
        System.out.println();


    }

}
