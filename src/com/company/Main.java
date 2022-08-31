package com.company;

public class Main {

    public static void main(String[] args) {
	Knight knight = new Knight(new DeadIslandQuest());
	Quest quest = knight.getQuest();
        System.out.println(quest.process());
    }
}
