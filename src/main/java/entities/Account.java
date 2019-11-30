package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="users")
public class Account {
	
	@Id
	@Column(name = "user_id", unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	@Column(name = "user_email", unique = true, nullable = false)
	private String userEmail;
	//Maxim 8 caractere la parola
	@Column(name = "user_password")
	private String userPassword;
	@Column(name = "user_lastname")
	private String lastName;
	@Column(name = "user_firstname")
	private String firstName;
}
