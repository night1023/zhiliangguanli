package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("输入year：");
        String a= in.next();
        System.out.println("输入month：");
        String b= in.next();
        System.out.println("输入day：");
        String c = in.next();
        System.out.println("nextday:");
        try {
            int t_a=Integer.parseInt(a);
            int t_b=Integer.parseInt(b);
            int t_c=Integer.parseInt(c);
                switch (t_b) {
                    case 1:
                    case 3:
                    case 5:  
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if(t_c>31) {
                            System.out.println("不可能");
                        }
                        else if(t_c<31) {
                            System.out.println(t_a+"/"+t_b+"/"+(t_c+1));
                        }
                        else if(t_c==31 && t_b==12) {
                            System.out.println(t_a+1+"/1/1");
                        }
                        else {
                            System.out.println(t_a+"/"+(t_b+1)+"/1");
                        }
                        break;
                    case 2:
                        if(t_a%4==0 && t_a%100!=0 || t_a%400==0) {
                            if(t_c>29) {
                                System.out.println("不可能");
                            }
                            else if(t_c<29) {
                                System.out.println(t_a+"/"+t_b+"/"+(t_c+1));
                            }
                            else if(t_c==29) {
                                System.out.println(t_a+"/3/1");
                            }
                            break;
                        }
                        else {
                            if(t_c>28) {
                                System.out.println("不可能");
                            }
                            else if(t_c<28) {
                                System.out.println(t_a+"/"+t_b+"/"+(t_c+1));
                            }
                            else if(t_c==28) {
                                System.out.println(t_a+"/3/1");
                            }
                            break;
                        }
                        
                    case 4:
                    case 6:
                    case 9:    
                    case 11:
                        if(t_c>30) {
                            System.out.println("不可能");
                        }
                        else if(t_c<30) {
                            System.out.println(t_a+"/"+t_b+"/"+(t_c+1));
                        }
                        else if(t_c==30) {
                            System.out.println(t_a+"/"+(t_b+1)+"/1");
                        }
                        break;
                }
        }catch (NumberFormatException e) {
            System.out.println("参数输入非法");
        }
        
    }
}
