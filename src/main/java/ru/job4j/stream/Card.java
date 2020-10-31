package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Card {
    private CardSuit suit;
    private CardValue value;

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{"
                + "suit=" + suit
                + ", value=" + value
                + '}';
    }

    public static void main(String[] args) {
        List<Card> deck = Stream.of(CardValue.values())
                .map(cardValue -> {
                    return Stream.of(CardSuit.values())
                            .map(cardSuit -> new Card(cardSuit, cardValue))
                            .collect(Collectors.toList());
                })
                .flatMap(cards -> cards.stream())
                .collect(Collectors.toList());
        deck.forEach(System.out::println);
    }
}