package cl.praxis.models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.praxis.models.dbase.DataBase;
import cl.praxis.models.dto.User;

public class UserDAOImpl implements UserDAO{

	
	public void create(User u) {

		String sql = "insert into usuarios (correo, nick, nombre, password, peso ) values ('" + u.getCorreo() + "', '" + u.getNick() + "', '" + u.getNombre() + "', '" + u.getPassword() +"', "+ u.getPeso() +")";
		
		System.out.println(sql);
		
		try {
			Connection conexion = DataBase.getCon();
			Statement s = conexion.createStatement();
			s.execute(sql);
		}  catch (SQLException e) {
			System.out.println("ERROR en método create()");
			e.printStackTrace();
		}
		
	}

	public User read(String correo) {
		User u = null;

		try {
			Connection conexion = DataBase.getCon();

			Statement s = conexion.createStatement();
			String sql = "SELECT u.*, d.nombre as direccion, ru.rol_id FROM usuarios u INNER JOIN direcciones d ON u.id = d.usuario_id INNER JOIN roles_usuarios ru ON u.id = ru.usuario_id WHERE u.correo =  '" + correo +"'";
				
			ResultSet rs = s.executeQuery(sql);
						
			if (rs.next()) {
				boolean Admin = rs.getInt("rol_id") == 1;
				u = new User(rs.getInt("id"), rs.getString("correo"),rs.getString("nick"), rs.getString("nombre"),rs.getString("password"), rs.getInt("peso"), rs.getTimestamp("created_at"), rs.getTimestamp("updated_at") ,Admin, rs.getString("direccion"));
			}
		} catch (SQLException e) {
			System.out.println("ERROR en método read(id)");
			e.printStackTrace();
		}

		return u;
	}

	public List<User> read() {

		List<User> u = new ArrayList<User>();

		try {

			Connection conexion = DataBase.getCon();

			Statement s = conexion.createStatement();
			String sql = "SELECT u.*, d.nombre as direccion, ru.rol_id FROM usuarios u INNER JOIN direcciones d ON u.id = d.usuario_id INNER JOIN roles_usuarios ru ON u.id = ru.usuario_id";

			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				boolean admin = rs.getInt("rol_id") == 1;

				u.add(new User(rs.getInt("id"), rs.getString("correo"), rs.getString("nick"), rs.getString("nombre"),rs.getString("password"), rs.getInt("peso"), rs.getTimestamp("created_at") ,rs.getTimestamp("updated_at"), admin, rs.getString("direccion")));
			}

		} catch (SQLException e) {
			System.out.println("ERROR en método read()");
			e.printStackTrace();
		}

		return u;
	}

	public boolean validation(String correo) {
		
		
		try {
			Connection conexion = DataBase.getCon();

			Statement s = conexion.createStatement();
			String sql = "select * from usuarios where correo = '" + correo+"'";
			ResultSet rs = s.executeQuery(sql);
			return rs.next();
				
		} catch (SQLException e) {
			System.out.println("ERROR en método checkUserExists(correo)");
			e.printStackTrace();
		}

		return false;
		
				
    }
	
}
