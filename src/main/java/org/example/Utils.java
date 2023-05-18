package org.example;

import java.util.ArrayList;

public class Utils {
    static String[] lst = {"S1", "S2", "S3", "S4"};

    public static ArrayList<String> playThreeSongs(){
        ArrayList<String> emp=new ArrayList<>();
        for(int i=0; i<3; i++){
            emp.add(lst[i]);
        }
        return emp;
    }

    public static ArrayList<String> songList(String song, ArrayList<String> snglst1){
        ArrayList<String> snglist1=snglst1;
        snglist1.set(0, snglist1.get(1));
        snglist1.set(1, snglist1.get(2));
        snglist1.set(2, song);
        return snglist1;
    }
}
