package com.course.day3;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class day3 {

  @Test
    public void testwhile(){
      int num=20;
      while(num<30){
          //System.out.println(num);
          num++;
         // System.out.println(num);
      }

  }
  @Test
     public void testdowhile(){
         int num=20;
      do{
          num ++;
          System.out.println("DowhileNumber:"+num);

      }while(num<30);

     }

}
