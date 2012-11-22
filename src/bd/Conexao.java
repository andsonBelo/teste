/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class Conexao {
	private static final SessionFactory sessionFactory;
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	static {
		try {
			sessionFactory = new AnnotationConfiguration().configure(
					"hibernateconfig.xml").buildSessionFactory();

		} catch (Throwable e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	// retorna uma sessao de comunicacao com o BD
	public static Session getInstance() {
		Session session = (Session) threadLocal.get();
		session = sessionFactory.openSession();
		threadLocal.set(session);
		return session;
	}
}