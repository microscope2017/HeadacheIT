package com.headacheit.dataAPI;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HeadacheUser {
    @Id
    private int id;
    private String username;
    private String nickname;
    private String password;

    //생성자
    public HeadacheUser(int id, String username, String nickname, String password){
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
    }

    //getter
    public int getId(){
        return this.id;
    }
    public String getUsername(){
        return this.username;
    }
    public String getNickname(){
        return this.nickname;
    }
    public String getPassword(){
        return this.password;
    }
}
