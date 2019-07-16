package com.st.spring.c_lifecycle;

public class HelloSpring {
    private  String info = "生命周期";

    public void initBean(){
        System.out.println("数据库连接配置完成！");
    }

    public  void destroyBean(){
        System.out.println("当前数据库连接已被关闭！");
    }

    public String getInfo() {
        return info;
    }
}
