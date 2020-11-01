/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoresEmailsLivrosEditoras;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Caio e Marcos
 */
@Entity
@Table(name="AUTORES")
public class Autores {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="CODAUT")
    private Integer idAut;
    
    @Column(name="NOME",length=100, nullable=false)
    private String Nome;

    public Integer getIdAut() {
        return idAut;
    }

    public void setIdAut(Integer idAut) {
        this.idAut = idAut;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    @OneToMany(
        cascade = CascadeType.ALL,
        orphanRemoval = true   
    )
    @JoinColumn(name="FK_COD_AUT")
    public List<Email> email = new ArrayList();

    public List<Email> getEmail() {
        return email;
    }
    
    public void setEmail(List<Email> email) {
        this.email = email;
    }  
    
    public void addEmail(Email email) {
        this.email.add(email);
    }
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "AUT_LIV",
        joinColumns = {@JoinColumn(name= "FK_COD_AUT")},
        inverseJoinColumns = {@JoinColumn(name= "FK_COD_LIV")}
    )
    public Set<Livros> Livros = new HashSet<>();

    public Set<Livros> getLivros() {
        return Livros;
    }

    public void setLivros(Set<Livros> Livros) {
        this.Livros = Livros;
    }
    
    public void addLivros(Livros livros) {
        this.Livros.add(livros);
    }

}
