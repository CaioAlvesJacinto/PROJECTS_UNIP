/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoresEmailsLivrosEditoras;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Caio e Marcos
 */
@Entity
@Table(name="LIVROS")
public class Livros {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="CODLIV")
    private int idLiv;
    
    @Column(name="EDICAO",length=100, nullable=false)
    private int edicao;
    
    @Column(name="CUSTO",length=100, nullable=false)
    private double custo;
    
    @Column(name="TITULO",length=100, nullable=false)
    private String titulo;

    public int getIdLiv() {
        return idLiv;
    }

    public void setIdLiv(int idLiv) {
        this.idLiv = idLiv;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @ManyToMany(mappedBy = "Livros")
    private Set<Autores> Autores = new HashSet<>();
}
