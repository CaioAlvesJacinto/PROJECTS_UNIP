/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoresEmailsLivrosEditoras;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Caio e Marcos
 */
@Entity
@Table(name="EDITORAS")
public class Editoras {
    
    public Editoras() {
        this.Livros = new ArrayList<>();
    }
    
    @Id
    @Column(name="CODEDI")
    private int idEdi;
    
    @Column(name="NOME",length=100, nullable=false)
    private String nome;

    public int getIdEdi() {
        return idEdi;
    }

    public void setIdEdi(int idEdi) {
        this.idEdi = idEdi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
    
    @OneToMany(
    cascade = CascadeType.ALL,
    orphanRemoval = true
    )
    @JoinColumn(name = "FK_COD_EDI")
    public List<Livros> Livros= new ArrayList<>();

    public List<Livros> getLivros() {
        return Livros;
    }
    
    public void setLivros(List<Livros> Livros) {
        this.Livros = Livros;
    }
    
    public void addLivros(Livros livros) {
        this.Livros.add(livros);
    }
 
}
