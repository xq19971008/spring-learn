package com.hihonor.learn;

import java.util.*;

public class User {
    private String Name;

    private int id;

    private String[] strs;

    private Set<String> sets;

    private Map<String,String> maps;


    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    private List<String> lists;

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public String[] getStrs() {
        return strs;
    }

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String name) {
        Name = name;
    }

    public User() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                ", strs=" + Arrays.toString(strs) +
                ", sets=" + sets +
                ", maps=" + maps +
                ", lists=" + lists +
                '}';
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }
}
