package com.jujulioed.StockGate.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "tickets")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ticket {
    /***
     * Ticket a ser aberto pelo cliente: reportar bug, sugestão, duvidas, etc.
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    //mensagem do usuario
    @NotNull
    private String message;

    // status do ticket
    private String status;

    // resposta do ticket
    private String response;
}
