package org.stepdef;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test2 {

    @Test(dataProvider = "loginCreds", dataProviderClass = Test1.class)
    public void testExternalData(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    @Test
    public void problem1() {
        String[] input = {"flower", "flow", "fly", "flight"};
        int temp = input[0].length();
        String smaller = "";
        for (int i = 0; i < input.length; i++) {
            if (input[i].length() < temp) {

                temp = input[i].length();
                smaller = input[i];
            }
        }
        int k = 0;
        for (int i = 0; i < input.length; ) {
            if (input[i].contains(smaller.substring(0, smaller.length() - k))) {
                i++;
            } else {
                i = 0;
                k++;
            }
        }
        System.out.println(smaller.substring(0, smaller.length() - k));


    }

    @Test
    public void problem2() {
        String input = "aaaaafggkll";
        //output = a5f1g2k1l2;
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Character c : map.keySet()) {
            System.out.print(c + "" + map.get(c));
        }

    }


    @Test
    public void problem3() {
        int[] input = {1, 4, 5, 7, 3, 9, 0, 10};


    }


}
