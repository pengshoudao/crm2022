package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;

public class SomeServiceImpl implements SomeService {

    public SomeServiceImpl() {
        System.out.println("SomeServiceImpl的无参数构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("执行了SomeServiceImpl的doSome()方法");
    }

    public void doOther(){
        System.out.println("需要做其它的功能");
    }

    public  void doView(){}

    public void createCatVo(){}



    public void createXMVO(){}

    public void doJob(){}

    public void doADF(){}
}
