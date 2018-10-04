package com.codingnomads.javafundamentals.lambdas;

public class LambdaController {


    public static void main(String[] args) {
        Deck spanishDeck = new Deck("Spanish deck");
        CardDealer cardDealer = new CardDealer();
        DeckSorter juan = new TallDeckSorter();

        cardDealer.sort(juan, spanishDeck);

        cardDealer.sort(
                new DeckSorter() {
                    @Override
                    public void sort(Deck deck) {
                        System.out.println("Im an Anonymous deck sorter sorting your deck " + deck.getName());
                    }
                }
                , spanishDeck);

        cardDealer.sort(
                (deck) -> System.out.println("Sorting deck " + deck.getName())
                , spanishDeck);
    }
}
