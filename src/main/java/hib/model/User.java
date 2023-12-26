package hib.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
//@NamedQuery(name = "User.getAll", query = "SELECT c from User c")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String LastName;
    @Column(name = "age")
    private int age;

    public User() {
    }

    public User(String name, String lastName, int age) {
        this.name = name;
        LastName = lastName;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }
}

