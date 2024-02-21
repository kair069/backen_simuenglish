package com.example.contactanos.perfilusuario;

import com.example.contactanos.Notificacion.Notification;
import com.example.contactanos.Progreso.Progress;

import javax.persistence.*;
import java.util.Set;

@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;
    // Otros campos según tus necesidades, como nombre, apellido, etc.

    // Relaciones
    @OneToMany(mappedBy = "user")
    private Set<Progress> progress;

    @OneToMany(mappedBy = "user")
    private Set<Notification> notifications;

    public UserProfile(Long id, String username, String email, String password, Set<Progress> progress, Set<Notification> notifications) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.progress = progress;
        this.notifications = notifications;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Progress> getProgress() {
        return progress;
    }

    public void setProgress(Set<Progress> progress) {
        this.progress = progress;
    }

    public Set<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(Set<Notification> notifications) {
        this.notifications = notifications;
    }
}
