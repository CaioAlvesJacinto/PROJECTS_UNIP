/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoresEmailsLivrosEditoras;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Caio e Marcos
 */
@Entity
@Table(name="EMAIL")
public class Email {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="CODEMA")
    private Integer idEma;

    @Column(name="EMAIL",length=100, nullable=false)
    private String email;

    public Integer getIdEma() {
        return idEma;
    }

    public void setIdEma(Integer idEma) {
        this.idEma = idEma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
}
