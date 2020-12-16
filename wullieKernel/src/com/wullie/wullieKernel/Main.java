package com.wullie.wullieKernel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter user name");
        Scanner sysName = new Scanner(System.in);
        String sysLine = sysName.nextLine();

        if (sysLine.equals("Wullie")){

        }

        else{
            System.out.println("sorry this name has not been added to the urs library");
            System.out.println("please restart and use one of the names found on the github read me");
        }


    }
}
