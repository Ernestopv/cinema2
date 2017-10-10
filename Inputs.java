package com.company;

import com.sun.tools.doclets.internal.toolkit.util.DocFinder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Netho on 11/16/15.
 */
public class Inputs {





    public  String  Input(String data){   // this is the Input  is a Method  that permits to the user to Introduce the data in String format



       String datas=data;

        BufferedReader userTyping=new BufferedReader(new InputStreamReader(System.in));

        try {

            datas = userTyping.readLine();
        }
        catch (Exception e){
            System.out. println("IO error trying reading your name");
        }




        return  datas;



    }



}
