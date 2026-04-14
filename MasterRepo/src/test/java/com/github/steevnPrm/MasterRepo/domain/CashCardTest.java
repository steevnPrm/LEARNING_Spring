package com.github.steevnPrm.MasterRepo.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CashCardTest{
    @Test
    @DisplayName("CashCard should be created with a valid amount")

    void shouldCreateCashCard(){

        double amount = 100;
        CashCard card = CashCard.createNew( amount);
        
        assertEquals(100.0, card.amount());
    }

    @Test
    @DisplayName("CashCard should throw an error if amount is negative")
    void shoudNotAllowNegativeAmount(){
        double amount = -100;

        assertThrows(IllegalArgumentException.class, () -> CashCard.createNew(amount));
    }
}