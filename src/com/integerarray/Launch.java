package com.integerarray;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Launch {
    public static void main(String[] args) throws IOException {
        int[] anArray = {5, 16, 13, 1, 72};
        List<Integer> aList = new ArrayList();
        for (int i = 0; i < anArray.length; i++) {
            aList.add(anArray[i]);
        }
        File file = new File("./Storage.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < aList.size(); i++) {
            bw.write(aList.get(i).toString());
        }
        bw.flush();
        bw.close();
    }
}
