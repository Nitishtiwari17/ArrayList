package com.company;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<String>();
        list.add("Python");
        list.add("PHP");
        list.add("C#");
        list.add("c++");
        list.add("Perl");
        String[] my_array=new String[list.size()];
        list.toArray(my_array);
        for(String string:my_array)
        {
            System.out.println(string);
        }
	// write your code here
    }
}
