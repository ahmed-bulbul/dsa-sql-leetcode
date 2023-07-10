package com.bulbul.advancedjava.fles;

import java.io.File;
import java.io.FileFilter;

public class FileExample {
    File file = new File("./");

    File[] files = file.listFiles(new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            return pathname.isFile();
        }
    });

    //Using Lambda
    File[] files2 = file.listFiles(pathname -> pathname.isFile());
}
