package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nameCategory;

    public Category() {
    }


    @OneToMany(targetEntity = Blog.class)
    private List<Blog> blog;


    public List<Blog> getBlogs() {
        return blog;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blog = blogs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
