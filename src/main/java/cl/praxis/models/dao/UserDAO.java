package cl.praxis.models.dao;

import java.util.List;

import cl.praxis.models.dto.User;

public interface UserDAO {

	public void create(User u);
	public User read(String correo);
	public List<User> read();
	public boolean validation(String correo);
}
