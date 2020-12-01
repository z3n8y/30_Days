package day_16_exception;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            int I = Integer.parseInt(S);
            System.out.println(I);
            }
        catch(Exception e) {
            System.out.println("Bad String");
            }
    }
}