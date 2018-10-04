package com.codingnomads.javafundamentals.lambdas;

public class TallDeckSorter implements DeckSorter {
    @Override
    public void sort(Deck deck) {
        System.out.println("Im a tall deck Sorter sorting your deck: " + deck.getName());
    }
}
