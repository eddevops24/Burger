package com.getItDone;

public class BurgerMain {
   public static void main(String [] args){

        BaseBurger burger = new BaseBurger(true,false,false,false,true);
        System.out.println("The following items have been ordered");
        if (burger.isRollBread()){
            System.out.println("roll bread price:"+burger.getBread());
        }
        if(burger.isCheese()){
            System.out.println("cheese price:"+burger.getAmericanCheese());
        }
        if(burger.isTomato()){
            System.out.println("Tomato price:"+ burger.getRedTomato());
        }
        if(burger.isEgg()){
            System.out.println("Egg price:"+ burger.getEggs());
        }
        if(burger.isLettuce()){
            System.out.println("Lettuce price:"+ burger.getGreenLettuce());
        }

        System.out.println("The total price is:"+burger.getTally());


    }
}
