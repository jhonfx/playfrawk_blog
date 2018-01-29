package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	public String title;
	public String comment;
	public Date publicDate;
	public String author;
	public String category;
	public String image;
	
	@Override
	public String toString() {
		return "Post{" +
                "title='" + title + '\'' +
                ", comment='" + comment + '\'' +
                ", author='" + author + '\'' +
                ", date='" + publicDate + '\'' +
                ", category='" + category + '\'' +
                '}';
	}

}
