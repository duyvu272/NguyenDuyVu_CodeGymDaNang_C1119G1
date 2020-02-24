package com.example.demo.model;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "blog")
@NamedQuery(name = "Find all Blog" ,query ="Select c from Blog c where  c.name LIKE :name" )
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Lob
    private String context;

    @Column
    private  String author;


    public Date datePublish;


    public Blog() {
    }

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(Date datePublish) {
        this.datePublish = datePublish;
    }

    @Override
    public String toString() {
        return "Blog{}";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
