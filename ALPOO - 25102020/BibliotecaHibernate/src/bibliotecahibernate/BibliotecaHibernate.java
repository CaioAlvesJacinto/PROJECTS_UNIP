/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecahibernate;

import autoresEmailsLivrosEditoras.Autores;
import autoresEmailsLivrosEditoras.Editoras;
import autoresEmailsLivrosEditoras.Email;
import autoresEmailsLivrosEditoras.Livros;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Caio e Marcos
 */
public class BibliotecaHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BibliotecaHibernatePU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Autores a0 = new Autores();
        a0.setNome("Caio");
        Email e0 = new Email();
        e0.setEmail("caio.alves.1702@gmail.com");
        a0.addEmail(e0);
        
        Editoras ed0 = new Editoras();
        ed0.setIdEdi(25);
        ed0.setNome("Intrínseca");
        
        Livros l0 = new Livros();
        l0.setEdicao(1);
        l0.setCusto(20.00);
        l0.setTitulo("O Bardo que roubava todas as kills");
        ed0.addLivros(l0);
        a0.addLivros(l0);
        
        System.out.println("--------------------------------------------------------------------");
        
        Autores a1 = new Autores();
        a1.setNome("Marcos");
        Email e1 = new Email();
        e1.setEmail("marcos@gmail.com");
        a1.addEmail(e1);
        
        Editoras ed1 = new Editoras();
        ed1.setIdEdi(1);
        ed1.setNome("Pearson");
        
        Livros l1 = new Livros();
        l1.setEdicao(5);
        l1.setCusto(50.00);
        l1.setTitulo("A volta dos que não foram");
        ed1.addLivros(l1);
        a1.addLivros(l1);
        
        System.out.println("--------------------------------------------------------------------");
        
        Autores a2 = new Autores();
        a2.setNome("Leonardo");
        Email e2 = new Email();
        e2.setEmail("leonardo@gmail.com");
        a2.addEmail(e2);
        
        Editoras ed2 = new Editoras();
        ed2.setIdEdi(2);
        ed2.setNome("RELX Group");
        
        Livros l2 = new Livros();
        l2.setEdicao(4);
        l2.setCusto(16.23);
        l2.setTitulo("Perdidos no Furacão");
        ed2.addLivros(l2);
        a2.addLivros(l2);
        
        System.out.println("--------------------------------------------------------------------");
        
        Autores a3 = new Autores();
        a3.setNome("Danilo");
        Email e3 = new Email();
        e3.setEmail("danilo@gmail.com");
        a3.addEmail(e3);
        
        Editoras ed3 = new Editoras();
        ed3.setIdEdi(3);
        ed3.setNome("ThomsonReuters");
        
        Livros l3 = new Livros();
        l3.setEdicao(6);
        l3.setCusto(42.68);
        l3.setTitulo("The Legend: Uma história nunca vista antes");
        ed3.addLivros(l3);
        a3.addLivros(l3);
        
        System.out.println("--------------------------------------------------------------------");
        
        Autores a4 = new Autores();
        a4.setNome("Kalil");
        Email e4 = new Email();
        e4.setEmail("kalil@gmail.com");
        a4.addEmail(e4);
        
        Editoras ed4 = new Editoras();
        ed4.setIdEdi(4);
        ed4.setNome("Bertelsmann");
        
        Livros l4 = new Livros();
        l4.setEdicao(2);
        l4.setCusto(68.74);
        l4.setTitulo("Os 4 Amigos");
        ed4.addLivros(l4);
        a4.addLivros(l4);
        
        System.out.println("--------------------------------------------------------------------");
        
        Autores aut = em.find(Autores.class,1);
        Email e = em.find(Email.class,1);
        Livros l = em.find(Livros.class,1);
        Editoras edi = em.find(Editoras.class,25);
        
        System.out.println("--------------------------------------------------------------------");
        
        try{
            em.persist(a0);
            em.persist(l0);
            em.persist(ed0);
            
            em.persist(a1);
            em.persist(l1);
            em.persist(ed1);
            
            em.persist(a2);
            em.persist(l2);
            em.persist(ed2);
            
            em.persist(a3);
            em.persist(l3);
            em.persist(ed3);
            
            em.persist(a4);
            em.persist(l4);
            em.persist(ed4);

            em.getTransaction().commit();
        
        }catch(Exception ex){
            em.getTransaction().rollback();
        }
        
        // Exercício 1
        String consultaAut = "from Autores a";
        Query qAut = em.createQuery(consultaAut);
        List<Object> resultadoAut = qAut.getResultList();
    
        for (int i = 0; i <= resultadoAut.size()-1; i++) {
            Autores a = (Autores)resultadoAut.get(i);
            System.out.println("---------------------------------------------");
            System.out.println("Nome do Autor: " + a.getNome());
            System.out.println("ID do Autor: " + a.getIdAut());
            System.out.println("---------------------------------------------");
        }
        
        // Exercício 2
        String consulta = "from Editoras ed where idEdi = 25";
        Query qEd = em.createQuery(consulta);
        List<Object> resultado25 = qEd.getResultList();
        
        for (int i = 0; i <= resultado25.size()-1; i++) {
            Editoras ed = (Editoras)resultado25.get(i);
            System.out.println("---------------------------------------------");
            System.out.println("ID: " + ed.getIdEdi());
            System.out.println("Nome da Editora: " + ed.getNome());
            System.out.println("---------------------------------------------");
        }

        em.close();
        emf.close();
    }
    
}
