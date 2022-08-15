package br.com.bb.designpatterns.builder;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Animal {

    private String nome;
    private String dono;
    private String raca;
}
