package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.jupiter.api.Test;

import dao.UserPosDao;
import model.UserPosJava;

public class TesteBanco {

	@Test
	public void initBanco() { // metodo de insert

		UserPosDao userPosDAO = new UserPosDao();
		UserPosJava userPosJava = new UserPosJava();

		userPosJava.setId(8L);
		userPosJava.setNome("Joao Cadu");
		userPosJava.setEmail("emailaleatorio@gmail.com");

		userPosDAO.salvar(userPosJava);

	}

	@Test
	public void initListar() {
		UserPosDao dao = new UserPosDao();
		try {
			List<UserPosJava> list = dao.listar();

			for (UserPosJava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("----------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void buscar() {
		UserPosDao dao = new UserPosDao();
		try {
			UserPosJava userPosJava = dao.buscar(2L);
			System.out.println("pesquisa por id = " + userPosJava);
			System.out.println("----------------------------------------");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
