package com.st.spring.b_di;

public class HelloSpring {

    private DiSpring info;

    public DiSpring getInfo() {
        return info;
    }
    public void setInfo(DiSpring info) {
        this.info = info;
    }
    public  String  helloDi(){
        info.setInfo1("hello everybody");
       return info.getInfo1();
    }
}
