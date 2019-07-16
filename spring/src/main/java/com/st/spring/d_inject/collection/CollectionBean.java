package com.st.spring.d_inject.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {
    private List<String> list;

    @Override
    public String toString() {
        return "CollectionBean{" +
                "list=" + list +
                ", array=" + Arrays.toString(array) +
                ", set=" + set +
                ", map=" + map +
                '}';
    }

    private String[] array;

    private Set<String> set;
    private Map<String,String> map;

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

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }
}
