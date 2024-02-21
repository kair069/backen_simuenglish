package com.example.contactanos.Progreso;

import com.example.contactanos.perfilusuario.UserProfile;

import javax.persistence.*;

@Entity
public class Progress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int lessonsCompleted;
    private int quizzesCompleted;
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

    public int getLessonsCompleted() {
        return lessonsCompleted;
    }

    public void setLessonsCompleted(int lessonsCompleted) {
        this.lessonsCompleted = lessonsCompleted;
    }

    public int getQuizzesCompleted() {
        return quizzesCompleted;
    }

    public void setQuizzesCompleted(int quizzesCompleted) {
        this.quizzesCompleted = quizzesCompleted;
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public Progress(int lessonsCompleted, int quizzesCompleted, UserProfile user) {
        this.lessonsCompleted = lessonsCompleted;
        this.quizzesCompleted = quizzesCompleted;
        this.user = user;
    }
}
