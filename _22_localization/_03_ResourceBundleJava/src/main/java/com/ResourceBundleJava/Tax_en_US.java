package com.ResourceBundleJava;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * #20210310_0815_303
 */
public class Tax_en_US extends ListResourceBundle {

    protected Object[][] getContents() {
        return new Object[][] { { "tax", 1 } };
    }

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("com.ResourceBundleJava.Tax", Locale.US);
        System.out.println(rb.getObject("tax"));
    }
}
