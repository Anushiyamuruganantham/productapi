package com.productapi.springbootproduct.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="anushiya_product")
public class Product {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    int quantiy;
    double price;
}
