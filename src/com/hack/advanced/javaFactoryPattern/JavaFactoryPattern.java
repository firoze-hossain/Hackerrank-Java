package com.hack.advanced.javaFactoryPattern;

import java.util.Scanner;

public class JavaFactoryPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodFactory ff = new FoodFactory();
        Food food = ff.getFood(sc.nextLine());
        System.out.println("The factory returned " + food.getClass());
        System.out.println(food.getType());
    }
}

interface Food {
    public String getType();
}

class Pizza implements Food {
    @Override
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    @Override
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if ("cake".equals(order)) {
            return new Cake();
        } else if ("pizza".equals(order)) {
            return new Pizza();
        }
        return null;
    }
}
