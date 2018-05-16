package view;

import org.hibernate.Session;

import controller.HibernateUtil;
import model.Alunos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alunos alunos = new Alunos();
    	alunos.setNome("Jeferson");
    	alunos.setEndereco("Av. Àguia de Háia");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(alunos);
		session.getTransaction().commit();

    }
}
