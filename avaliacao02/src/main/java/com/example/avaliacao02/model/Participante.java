package com.example.avaliacao02.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String email;

    @ManyToMany(mappedBy = "participantes")
    private List<Atividade> atividades;
}

