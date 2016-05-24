package br.ufpb.dcx.dsc;

import java.util.LinkedList;
import java.util.List;

public class UserManager {
	private List<User> users;
	
	public UserManager(){
		this.users = new LinkedList<User>();
	}
	
	public void addUser(User user){
		this.users.add(user);
	}
	
	public boolean isValid(String name, String password){
		int usersLength = this.users.size();
		for(int cont = 0; cont < usersLength; cont++){
			User user = this.users.get(cont);
			String userName = user.getName();
			String userPw = user.getPassword();
			
			if(name.equals(userName) && password.equals(userPw)){
					return true;
			}
		}
		
		return false;
	}
}
