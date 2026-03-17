package dev.datanorte.CadastroDeNinjas.Ninjas;

import dev.datanorte.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(unique = true)
    private String email;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(name = "idade")
    private int idade;
    @Column(name = "rank")
    private String rank;
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


}
