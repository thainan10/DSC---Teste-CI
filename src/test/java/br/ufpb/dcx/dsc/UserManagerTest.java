package br.ufpb.dcx.dsc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class UserManagerTest {
	UserManager manager;
	User u1;
	User u2;
	User u3;
	
	@Before
	public void setUp(){
		this.manager = new UserManager();
		this.u1 = new User("Jurema", "jurema@hotmail.com", "12354");
		this.u2 = new User("João", "joao@hotmail.com", "586913");
		this.u3 = new User("Maria", "maria@hotmail.com", "5586915");
		
		this.manager.addUser(this.u1);
		this.manager.addUser(this.u2);
		this.manager.addUser(this.u3);
	}

	
	@Test
	public void testIsValid(){
		boolean test = this.manager.isValid("Jurema", "12354");
		assertTrue(test);
		
		test = this.manager.isValid("Jurema", "21543");
		assertFalse(test);
	}
}
