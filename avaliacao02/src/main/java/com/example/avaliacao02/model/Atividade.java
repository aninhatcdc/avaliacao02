package com.example.avaliacao02.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.example.avaliacao02.model.Atividade;


@Entity
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String descricao;
    private Double preco;

    @ManyToMany
    @JoinTable(
            name = "atividade_participante",
            joinColumns = @JoinColumn(name = "atividade_id"),
            inverseJoinColumns = @JoinColumn(name = "participante_id")
    )
    private List<Participante> participantes;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "atividade", cascade = CascadeType.ALL)
    private List<Bloco> blocos;
}
