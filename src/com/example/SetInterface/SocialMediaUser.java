package com.example.SetInterface;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class SocialMediaUser implements Comparable<SocialMediaUser> {
    private String username;

    public SocialMediaUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    @Override
    public int compareTo(SocialMediaUser other) {
        return this.username.compareTo(other.username);
    }
}

