package org.example.google2;

import org.springframework.data.neo4j.core.schema.*;
//test
@Node("User")
public class AppUser {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;

    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }

    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
}
