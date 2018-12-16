package com.techmahindra.SpringBootWebApp.Bean;

/**
 * Created by Anurag Mishra on 10-12-2018.
 */
public class User {
    private Long id;
    private String name;

    public User(){
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
