/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

///import sun.jvm.hotspot.memory.PlaceholderEntry;

import javafx.util.StringConverter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{


    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        String new_s = new String();
        //System.out.println(ar_new);
        int length = s.length();
        char[] ch;
        ch = s.toCharArray();
        //System.out.println(ch);
        for(int i = length-1; i>= 0; i--){
            System.out.print(ch[i]);
            new_s = String.valueOf(ch[i]);
        }
        return new_s;
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {
        String upper_case_line = null;
        upper_case_line = Character.toUpperCase(s.charAt(0))+" "+ Character.toUpperCase(s.charAt(8))+s.substring(13);
        return upper_case_line;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        String new_s = null;
        int count = 0;
        int max=3;
        char[] ch = s.toCharArray();
        if(!s.isEmpty()){
            
          for(int i=0;i<s.length()-1;i++){
              for(int j=s.length()-1;j>=0;j--){
                  if(ch[i] == ch[j]){
                      ch[i] = ch[j];
                      count++;
                  }
                  new_s = String.copyValueOf(ch);
              }
              if(count>max){
                  new_s = String.copyValueOf(ch);
              }
          }
        }
        return new_s;
    }
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
       return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        String new_String = null;
        new_String = originalString.replace(findString,newString);
        return new_String;
    }
}
