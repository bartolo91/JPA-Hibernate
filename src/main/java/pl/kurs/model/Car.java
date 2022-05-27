package pl.kurs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

//@Entity
public class Car implements Serializable {

    private static final long serialVersionUID = 1654775676576859578L;

    @Id
    @GeneratedValue
    private Long id;
    private String producer;
    private String model;
    private String color;
    private Integer productionYear;

    public Car() {

    }

    public Car(String producer, String model, String color, Integer productionYear) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

    public Long getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != null ? !id.equals(car.id) : car.id != null) return false;
        if (producer != null ? !producer.equals(car.producer) : car.producer != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (color != null ? !color.equals(car.color) : car.color != null) return false;
        return productionYear != null ? productionYear.equals(car.productionYear) : car.productionYear == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (productionYear != null ? productionYear.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
