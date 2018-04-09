/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.List;
import javafx.event.Event;

/**
 * 
 * @author Guillaume
 */
public class User {
    
    private int id;
    private String login;
    private String password;
    private String name;
    private String firstName;
    private List<Event> events;
    
    public User(String l, String p, String n, String f)//, List<Event> es
    {
        this.login = l;
        this.password = p;
        this.name = n;
        this.firstName = f;
        //this.events = es;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

   
    
}
