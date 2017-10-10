package com.company;

import java.io.*;

/**
 * Created by Netho on 11/25/15.
 */
public class Films2  {


    File text2=new File("Films.txt");


    // this method is going  to show the movies that are display in the cinema , from the text file called "Films.txt."


    BufferedReader br2=new BufferedReader(new FileReader(text2));

    public  String presetantion=br2.readLine();
    public String films=br2.readLine();
    public String presentation2=br2.readLine();

    public String a= br2.readLine();
    public  String b=br2.readLine();
    public String c=br2.readLine();
    public String d=br2.readLine();
    public String e=br2.readLine();
    public String f=br2.readLine();
    public  String g=br2.readLine();

    public Films2() throws  IOException {


        text2.createNewFile();

    }

        public void movies() {


        System.out.println(presetantion);
        System.out.println(films);
        System.out.println(presentation2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }


    }




