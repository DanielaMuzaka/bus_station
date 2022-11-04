package org.example.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
    private Long stationId;
    @Column(name = "station_name" , nullable = false, length = 20)
    private String name;

    @OneToMany(mappedBy = "station")  //station-emri i objektit.
    List<Bus> buses;

    public Long getStation() {
        return stationId;
    }

    public void setStation(Long station) {
        this.stationId = station;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Station(){};
    public Station(Long station, String name) {
        this.stationId = station;
        this.name = name;
    }

    public Station(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Station{" +
                "station=" + stationId +
                ", name='" + name + '\'' +
                '}';
    }
}
