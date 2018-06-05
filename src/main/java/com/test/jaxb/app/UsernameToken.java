/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.jaxb.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author RC$
 */
@XmlRootElement(name = "UsernameToken")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class UsernameToken {

    private String userInfo;

    @XmlElement(name = "UserInfo")
    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public UsernameToken(String user, String corr) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");

        // Set timestamp.
        String timestamp = now.format(dateFormatter);

        // Construct user info content.
        this.userInfo = String.format("USER=%1s;CORR=%2s;TIMESTAMP=%3s", user, corr, timestamp);
    }

    public UsernameToken() {
    }

}
