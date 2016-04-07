package entity;

import javax.persistence.*;


/**
 * Created by psok on 4/7/2016.
 */

@Entity
@Table(name = "cars")
@NamedQuery(name = "Car.getAll", query = "SELECT c from Car c")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", length = 32)
    private String name;

    @Column(name = "cost")
    private float cost;

    public Car() {
    }

    public Car(String name, float cost) {
        this.name = name;
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost;
    }
}
