package com.rulesexception;

import java.io.FileNotFoundException;

/**
 * #20210930_0657_408/1
 */
class Parent extends RuntimeException{}
class Child extends Parent{}

public class ExceptionRules {

    public static void main(String... __) {
        try {}
        catch (Parent e) {}
//        catch (Child e) {} // does not compile, т.к. дочерний класс не может быть после родительского

        int j;
        try {
            String s;
            System.out.println(1);
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println(2);
            throw new RuntimeException();
//        } catch (ArithmeticException e) {} // does not compile, т.к. дочерний класс не может быть после родительского
//        } catch (Exception __) { // does not compile, т.к. переменная уже объявлена
//        } catch (Exception j) { // does not compile, т.к. переменная уже объявлена
        } catch (Exception s) { // ok
        } finally {
            System.out.println(3);
        }

        try {}
        catch (Error | RuntimeException e) {}

        try {}
        catch (Error | Exception e) {}

//        try {}
//        catch (Error | FileNotFoundException e) {} // does not compile, т.к. FileNotFoundException не объявлен в методе
    }

    // Метод может возвращать Error и Exception
    void test() throws Error{}
    Error test2() throws Error{
        return new Error();
    }
    Exception test3() throws Exception{
        return new Exception();
    }
    Throwable test4(){
//        throw new Exception();
        return new Exception();
    }
    Throwable test5(){
//        throw new Error();
        return new Error();
    }
}
