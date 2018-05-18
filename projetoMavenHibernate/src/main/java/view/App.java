package view;

import java.util.ArrayList;

import org.hibernate.Session;

import controller.HibernateUtil;
import model.Alunos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args)
    {
    	ArrayList<Alunos> alList = new ArrayList(); 
    	
    	Alunos alunos = new Alunos();
    	alunos.setNome("Vinicius Borges de Souza");
    	alunos.setEndereco("Rua: Baixada Santista");
    	alunos.setTelefone("1121253215");
    	alList.add(alunos);
    	
    	Alunos alunos2 = new Alunos();
    	alunos2.setNome("Mariana Bravo");
    	alunos2.setEndereco("Rua: Sabado D'Angelo");
    	alunos2.setTelefone("1121253222");
    	alList.add(alunos2);
    	
    	Alunos alunos3 = new Alunos();
    	alunos3.setNome("Thiago Afonso Silva");
    	alunos3.setEndereco("Rua: Paim");
    	alunos3.setTelefone("1120715216");
    	alList.add(alunos3);
    	
    	for (int i = 0; i < alList.size(); i++) {
    		Session session = HibernateUtil.getSessionFactory().openSession();
    		session.beginTransaction();
    		session.save(alList.get(i));
    		session.getTransaction().commit();
    	}

    			
		

    }
}
