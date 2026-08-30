package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRoller;

public class TwentySidedDieRoller implements DieRoller {

    @Override
    public int roll() {
        return (int) (Math.random() * 20) + 1;
    }
}