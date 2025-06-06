package com.jujulioed.StockGate.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "owners")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Owner extends User {

}
