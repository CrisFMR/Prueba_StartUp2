package cl.praxis.models.dto;
import java.time.LocalDate;
import java.sql.Timestamp;

public class User {
	
	private int id;
    private String correo;
    private String nick;
    private String nombre;
    private String password;
    private int peso;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private boolean admin;
    private String direccion;
       
            
	public User() {
		super();
		
	}

	public User(int id, String correo,String nick, String nombre, String password, int peso, Timestamp createdAt,Timestamp updatedAt, boolean admin, String direccion) {
		super();
		this.id = id;
		this.correo = correo;
		this.nick = nick;
		this.nombre = nombre;
		this.password = password;
		this.peso = peso;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.admin = admin;
		this.direccion = direccion;
	}

	public User(String correo, String nick, String nombre, String password, int peso) {
		this.correo = correo;
		this.nick = nick;
		this.nombre = nombre;
		this.password = password;
		this.peso = peso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean admin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}