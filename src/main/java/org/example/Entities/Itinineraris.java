package org.example.Entities;
import org.example.Entities.Bus;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Itinineraris {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itId;
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String startLocation;
    private  String endDestination;
    @ManyToMany()
    @JoinTable(name = "bus_itineraris",
            joinColumns = {@JoinColumn(name = "itinerary")},
            inverseJoinColumns = {@JoinColumn(name= "bus")})
    List<Bus> buses;

    public Long getItId() {
        return itId;
    }

    public void setItId(Long itId) {
        this.itId = itId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndDestination() {
        return endDestination;
    }

    public void setEndDestination(String endDestination) {
        this.endDestination = endDestination;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    @Override
    public String toString() {
        return "Itinineraris{" +
                "itId=" + itId +
                ", name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", startLocation='" + startLocation + '\'' +
                ", endDestination='" + endDestination + '\'' +
                ", buses=" + buses +
                '}';
    }
}
