package com.java.oops.Decksofcards1;

import java.util.ArrayList;


class Cards {
    private final String suit;
    private final String rank;

    public Cards(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}

