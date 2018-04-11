package com.alineselle;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Horoscope {

   public enum Day {
       MONDAY,
       TUESDAY,
       WEDNESDAY,
       THURSDAY,
       FRIDAY,
       SATURDAY,
       SUNDAY
   };
       private Day day;

       public void setDay(Day day){
           this.day=day;
   }

       public void getInfo(){
           switch(day){
               case MONDAY:
                   System.out.println("Great day!");
                   break;
               case TUESDAY:
               case WEDNESDAY:
                   System.out.println("Your day will be fun!");
                   break;
               case THURSDAY:
                   System.out.println("You will find a new girlfriend");
                   break;
               case SATURDAY:
                   System.out.println("Nothing to say");
                   break;
               case FRIDAY:
               case SUNDAY:
                   System.out.println("You will be very lucky!");

           }
       }

   }



