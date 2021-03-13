package com.getItDone;

public class BaseBurger {
    boolean rollBread = false;
    boolean tomato = false;
    boolean lettuce = false;
    boolean egg = false;
    boolean cheese = false;
   // boolean bacon = false;
    double bread = 0.00;
    double redTomato = 0.00;
    double greenLettuce = 0.00;
    double eggs = 0.00;
    double americanCheese = 0.00 ;
   // double yummyBacon  = 2.00;
    double total = 0;
        
    public BaseBurger(boolean rollBread, boolean tomato, boolean lettuce, boolean egg, boolean cheese) {
        this.rollBread = rollBread;
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.egg = egg;
        this.cheese = cheese;

    }

    public boolean isRollBread() {
        return rollBread;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isCheese() {
        return cheese;
    }

    public double getBread() {
        if  (isRollBread()){
            this.bread=1.65;
        }
        return bread;
    }

    public double getRedTomato() {
        if (isTomato()){
            this.redTomato= .65;
        }
        return redTomato;
    }

    public double getGreenLettuce() {
        if (isLettuce()){
            this.greenLettuce= 1.25;
        }
        return greenLettuce;
    }

    public double getEggs() {
        if (isEgg()){
            this.eggs= 1.00;
        }
        return eggs;
    }

    public double getAmericanCheese() {
        if (isCheese()){
            this.americanCheese= 1.75;
        }
        return americanCheese;
    }


    public double getTally(){
        this.total += getAmericanCheese()+getBread()+getEggs()+getGreenLettuce()+ getRedTomato();
        return this.total;
    }
}

