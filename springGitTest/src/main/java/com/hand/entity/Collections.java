package com.hand.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 集合注入
 */
public class Collections {
    private String[] args;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;

    @Override
    public String toString() {
        return "Collections{" +
                "args=" + Arrays.toString(args) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }

    public Collections(String[] args, List<String> list, Set<String> set, Map<String, String> map) {
        this.args = args;
        this.list = list;
        this.set = set;
        this.map = map;
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Collections() {
    }
}
