package com.github.steevnPrm.MasterRepo.domain;

import java.util.UUID;

public record CashCard(UUID id, Double amount) {
    
    public CashCard {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
    }

    public static CashCard createNew(Double amount) {
        return new CashCard(UUID.randomUUID(), amount);
    }
}