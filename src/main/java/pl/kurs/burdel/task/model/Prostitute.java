package pl.kurs.burdel.task.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class Prostitute implements Serializable {

    private static final long serialVersionUID = 1654775676576859578L;

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String preference;
    private int age;
    boolean hasHIV;

    public Prostitute() {
    }

    public Prostitute(String firstName, String lastName, String preference, int age, boolean hasHIV) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.preference = preference;
        this.age = age;
        this.hasHIV = hasHIV;
    }

    @Override
    public String toString() {
        return "Prostitute{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", preference='" + preference + '\'' +
                ", age=" + age +
                ", hasHIV=" + hasHIV +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getPreference() {
        return preference;
    }

    public int getAge() {
        return age;
    }

    public boolean isHasHIV() {
        return hasHIV;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prostitute that = (Prostitute) o;

        if (age != that.age) return false;
        if (hasHIV != that.hasHIV) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        return preference != null ? preference.equals(that.preference) : that.preference == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (preference != null ? preference.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (hasHIV ? 1 : 0);
        return result;
    }
}
