package org.example.Entities;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "roi_bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long busId;

    private String name;
    private Boolean status;
    @ManyToOne
    @JoinColumn(name = "station")
    private Station station;

    @ManyToMany(mappedBy = "buses")
    List<Itinineraris> itininerarises;

    public Bus(String name, Boolean status){
        this.name=name;
        this.status=status;
    }

    public Bus(){}

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId = busId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busId=" + busId +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", station=" + station +
                '}';
    }
}
