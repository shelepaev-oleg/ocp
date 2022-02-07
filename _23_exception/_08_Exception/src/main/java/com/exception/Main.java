package com.exception;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String... __) {
//        throw new Exception(); // does not compile, т.к. не объявлено в методе
        try {}
        catch (Exception e){}

        try {
            throw new FileNotFoundException();
        }
        catch (FileNotFoundException e){} // does not compile, т.к. не объявлено в методе
    }
}
