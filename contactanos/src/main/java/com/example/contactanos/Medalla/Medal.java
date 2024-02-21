package com.example.contactanos.Medalla;

import com.example.contactanos.perfilusuario.UserProfile;

import javax.persistence.*;

@Entity
public class Medal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    // Otros campos según tus necesidades

    // Relaciones
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserProfile user;

    // Constructor, getters y setters
    // ...

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserProfile getUser() {
        return user;
    }


    public void setUser(UserProfile user) {
        this.user = user;
    }

    public Medal(String name, String description, UserProfile user) {
        this.name = name;
        this.description = description;
        this.user = user;
    }

    public Medal() {
    }
}
