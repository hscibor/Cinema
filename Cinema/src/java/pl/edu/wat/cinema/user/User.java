package pl.edu.wat.cinema.user;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kamil
 */
public class User {

    private Long user_id;
    private String first_name;
    private String last_name;
    private String login;
    private String password;
    private String email;
    private String phone;

    public User() {
    }

    public User(Long user_id, String first_name, String last_name, String login, String password, String email, String phone) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public User(String first_name, String last_name, String login, String password, String email, String phone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

}
