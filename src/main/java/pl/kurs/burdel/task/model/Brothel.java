package pl.kurs.burdel.task.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class Brothel implements Serializable {

    private static final long serialVersionUID = 1654775676576859578L;

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String brothelMamaNickName;

    public Brothel() {
    }

    public Brothel(Long id, String name, String brothelMamaNickName) {
        this.id = id;
        this.name = name;
        this.brothelMamaNickName = brothelMamaNickName;
    }

    @Override
    public String toString() {
        return "Brothel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brothelMamaNickName='" + brothelMamaNickName + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrothelMamaNickName() {
        return brothelMamaNickName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Brothel brothel = (Brothel) o;

        if (id != null ? !id.equals(brothel.id) : brothel.id != null) return false;
        if (name != null ? !name.equals(brothel.name) : brothel.name != null) return false;
        return brothelMamaNickName != null ? brothelMamaNickName.equals(brothel.brothelMamaNickName) : brothel.brothelMamaNickName == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (brothelMamaNickName != null ? brothelMamaNickName.hashCode() : 0);
        return result;
    }
}
