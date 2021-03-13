package com.getItDone;


public class HealthyBurger extends BaseBurger {
    boolean lamb=false;
    boolean eggplant = false;
    public HealthyBurger(boolean rollBread, boolean tomato, boolean lettuce, boolean egg, boolean cheese, boolean bacon) {
        super(rollBread, tomato, lettuce, egg, cheese);
    }
}
