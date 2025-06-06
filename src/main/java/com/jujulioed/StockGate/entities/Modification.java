package com.jujulioed.StockGate.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "historical")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Modification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String action;

    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;
}
