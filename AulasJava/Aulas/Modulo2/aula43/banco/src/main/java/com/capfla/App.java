package com.capfla;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capfla.model.Categoria;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sistema de banco!" );

        Categoria model = new Categoria();
        model.setNome("Testes JPA2");
        model.setDescricao("Descrição JPA2");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        EntityManager em = factory.createEntityManager();


        em.getTransaction().begin();
        em.persist(model);
        em.getTransaction().commit();

        List<Categoria> lista = em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();

        for(Categoria categoria: lista){
            System.out.printf("Id: %d, Nome: %s, Descrição: %s\n", categoria.getId(), categoria.getNome(), categoria.getDescricao() );
        }
    }
}
