package com.bulbul.interview;


class Test<T> {
    T obj;
    Test(T obj){
        this.obj = obj;
    }

    public T getObject (){
        return this.obj;
    }
}
public class Generics {

    public static void main(String[] args) {

        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test<String> sObj
                = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}
