package com.MessageFormat;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class MessageFormatTest {

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("Zoo");
        String format = rb.getString("hello");
        String formatted = MessageFormat.format(format, "Oleg");
        System.out.println(formatted);
    }
}
