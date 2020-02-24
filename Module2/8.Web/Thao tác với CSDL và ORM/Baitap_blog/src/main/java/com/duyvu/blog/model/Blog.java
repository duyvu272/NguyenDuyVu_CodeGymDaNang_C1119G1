package com.duyvu.blog.model;


import javax.persistence.*;

@Entity
@Table(name = "blog")
@NamedQuery(name = "Find all Blog" ,query ="Select c from Blog c where  c.name LIKE :name" )
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String context;

    public Blog() {
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
