package models;

import java.sql.Date;
import javax.persistence.*;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	public String name;
	public String lastname;
	public String username;
	public String password;
	public Date postDate;
	
	@Override
	public String toString() {
		 return "User{" +
	                "name='" + name + '\'' +
	                ", username='" + username + '\'' +
	                ", password='" + password + '\'' +
	                '}';
	}

}
