package com.example.contactanos.Notificacion;

import com.example.contactanos.perfilusuario.UserProfile;

import javax.persistence.*;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int score;
    // Otros campos según tus necesidades

    // Relaciones
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserProfile user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public Notification(Long id, String title, int score, UserProfile user) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.user = user;
    }
}
