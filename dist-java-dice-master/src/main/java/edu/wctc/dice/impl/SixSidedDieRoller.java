package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRoller;

public class SixSidedDieRoller implements DieRoller {

    @Override
    public int roll() {
        return (int) (Math.random() * 6) + 1;
    }
}