package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) {
        MyClass ob = new MyClass( 1,"Gaurav");
        // reflection made here
        Class copy= ob.getClass();
        // method arr to get all methods of class
        Method [] marr = copy.getMethods();
//        for(Method m:marr){
//            System.out.println(m.getName());
//            System.out.println(m.getReturnType());
//        }
        //------------------ Constructors---------------
//        Constructor [] carr = copy.getConstructors();
//        for(Constructor c : carr){
//            System.out.println(c.getName());
//            System.out.println(c.getParameterCount());
//        }
        // ------------Fields--------------
        Field []farr = copy.getDeclaredFields();
        for(Field f:farr){
            System.out.println(f.getName());
            System.out.println(f.getType());
        }

        farr[1].setAccessible(true);
        try {
            System.out.println(ob);
            farr[1].set(ob,"Deepak");
            System.out.println(ob);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Method m;
        try {
            m= copy.getDeclaredMethod("cube",int.class);
            System.out.println(m.invoke(ob,2));
            System.out.println();
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
