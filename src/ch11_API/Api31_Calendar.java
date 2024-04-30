package ch11_API;

import java.util.Calendar;

class Api31_Calendar { 
      public static void main(String[] args) { 
            int year = 2022;             int month = 1;
            Calendar sDay = Calendar.getInstance();       // 시작일 
            Calendar eDay = Calendar.getInstance();       // 끝일 
            //Calendar tDay = new Calendar(); 
            System.out.println(sDay);
            System.out.println(eDay);
      }}