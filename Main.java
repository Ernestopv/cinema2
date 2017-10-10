package com.company;


import java.io.*;


public class Main{

    public static void main (String []args) throws IOException {


      String dato4="";
      String dato2="";
      String dato="";


        int option=0;
        String []memory=new String[5];                 // in this part  are declaring some variables of the program
        String dato3="";
        String presentation1="============================================";
        String presentation="  Welcome to Cinema Ramirez your film is :";    //  starting with giving a template


        memory[0]=presentation1;
        memory[1]=presentation;
        memory[2]=presentation1;

        String goodBye=" Thank you for Coming !!";

        String memory2[]=new String[3];
        memory2[0]=presentation1;
        memory2[1]=goodBye;
        memory2[2]=presentation1;




        int age[]=new int[100];  // we set some variables like age price and total





        float price=0.f;

        float total=0f;


do {


    new Menu(); //  set a method that is going to print the menu like  the welcoming, the panel options like create a order, previous orders etc,

    dato=new Inputs().Input(dato);

    switch (dato){    // use of switch that is going to display every funtion of every option

        case "a":
            System.out.println("----------------------------------------------------");
            System.out.println("              Creating a new order ");
            System.out.println("----------------------------------------------------");

            do {
                new Films2().movies();
                System.out.println("----------------------------------------------------");
                System.out.println("  which film would you like to see  insert Option ?");
                System.out.println("----------------------------------------------------");

                dato3 = new Inputs().Input(dato3);
                option=Integer.parseInt(dato3);


                if (option==1) {
                    memory[3] = new Films2().a;
                    memory[4] = presentation1;}
                else if (option==2) {
                    memory[3] = new Films2().b;
                    memory[4] = presentation1;
                }
               else  if (option==3) {
                    memory[3] = new Films2().c;
                    memory[4] = presentation1;
                }
               else  if (option==4) {
                    memory[3] = new Films2().d;
                    memory[4] = presentation1;
                }
               else  if (option==5) {
                    memory[3] = new Films2().e;
                    memory[4] = presentation1;
                }
               else  if (option==6) {
                    memory[3] = new Films2().f;
                    memory[4] = presentation1;
                }
               else  if (option==7) {
                    memory[3] = new Films2().g;
                    memory[4] = presentation1;
                }

                else{
                    System.out.println("Try again option not Available!!");

                }


            }



                while (option > 7 ) ;








            // asking for the tickets


            System.out.println("============================================================");
            System.out.println(" How  many tickets would you like?  15 euros normal Price ");
            System.out.println("=============================================================");
            dato4=new Inputs().Input(dato4);

            int customers=Integer.parseInt(dato4);
            float sales[]=new float[customers];


            String [] discounts=new String[customers];


            for(int n=0; n<customers; n++){


                System.out.println("Insert Age;");     // in this block is going to display some if  that are going to determinate if the user has a discount or not
                                                       // according to the age
                dato4=new Inputs().Input(dato4);
                int year=Integer.parseInt(dato4);
                age[n]=year;

                if (year<=12) {

                    String  d40="you got a discount of  40%";
                    discounts[n]=d40;
                    System.out.println(d40);

                    price=15-(15*.40f);


                    total += price;


                }

                if(year>=13&&year<=64){
                    String np="you got a normal Price !";
                    discounts[n]=np;
                    System.out.println(np);
                    price=15;

                    total+=price;




                }

                if(year>=65){
                    String d20="you got a discount of 20%";
                    discounts[n]=d20;
                    System.out.println(d20);
                    price=15-(15*.20f);


                    total+=price;

                }


             sales[n]=price;




            }







            File text=new File("Cinema.txt");   // creating the cinema text file in this file , the data is going to be stored , all the information about the previous orders
            text.createNewFile();
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(text,true),"UTF8"));



            for(int i=0; i<memory.length; i++) {
                bw.write("\n"+memory[i]);
            }

            bw.write("\n Total of customers are :" + customers);

            for(int i=0; i<customers; i++){
                bw.write(" \n "+discounts[i]+" :  "+" price :"+sales[i]);
            }


            bw.write("\n  total to pay :"+total);

            for(int j=0; j<memory2.length; j++){

                bw.write("\n"+memory2[j]);

            }






            bw.flush();
            bw.close();


            BufferedReader br=new BufferedReader(new FileReader(text));
            String line=br.readLine();

            while (line!=null){
                System.out.println(line);
                line=br.readLine();



            }























            break;

        case "b":

            new Films2().movies();

            break;


        case "c":


            System.out.println("Previous Orders ");
            text=new File("Cinema.txt");
            br=new BufferedReader(new FileReader(text));
             line=br.readLine();

            while (line!=null){
                System.out.println(line);
                line=br.readLine();



            }


            break;

        case"d":
            System.out.println("==============================================");
            System.out.println ("          Quit the program ");
            System.out.println("===============================================");
            System.out.println("Are you sure that you want to exit  y or n ?");
            dato2=new Inputs().Input(dato2);

                if (dato2.contains("y") || dato2.contains("Y")) {

                    System.exit(0);
                }





            break;

        default:
            System.out.println("Option no valid ");




            break;




    }

    System.out.println("---------------------------------------------------");
    System.out.println(" Go back to the Menu y or n to quit the program  ");
    System.out.println("---------------------------------------------------");

    dato=new Inputs().Input(dato);

    total=0.0f; // we set total  in '0'  againg to avoid a sum if the user is looking   to start another order










}




            while (dato.contains("y")||dato.contains("Y")) ;



















        }




 }



