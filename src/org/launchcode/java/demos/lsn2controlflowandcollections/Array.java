package org.launchcode.java.demos.lsn2controlflowandcollections;

public class Array {

    public static void main (String [] args) {
        int newArray[] = {1, 1, 2, 3, 5, 8};

        for (int i : newArray) {
            System.out.println(i);
        }

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i]%2!=0) {
                System.out.println(newArray[i]);
            }
        }

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arraySentence = str.split(" ");

        for (String a : arraySentence)
        System.out.println(Arrays.toString(arraySentence));
    }


}
