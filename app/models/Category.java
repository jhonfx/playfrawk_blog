package models;


import javax.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;
    public String name;

    @Override
    public String toString() {
        return "Category: {" +
                "name= '" + name + '\'' +
                "}";
    }

}
