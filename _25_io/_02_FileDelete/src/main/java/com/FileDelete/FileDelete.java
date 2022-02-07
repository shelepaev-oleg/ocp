package com.FileDelete;

import java.io.File;

/**
 * #20210409_0719_345/1
 */
public class FileDelete {
    public static void main(String[] args) {
        deleteTree(new File("test"));
    }

    public static void deleteTree(File file) {
        if(!file.isFile())
            for(File entry: file.listFiles())
                deleteTree(entry);
            else file.delete();
    }
}
