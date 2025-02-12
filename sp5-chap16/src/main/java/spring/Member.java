package spring;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Member {

	private Long id;
	private String email;
	@JsonIgnore
	private String password;
	private String name;
	@JsonFormat(shape = Shape.STRING)  //ISO - 8601 형식으로 변환
	//ex) "2018-03-01T11:07:49"
//	@JsonFormat(pattern = "yyyyMMddHHmmss") // 원하는 형식으로 변환
	//ex) "20180301020749
	private LocalDateTime registerDateTime;

	public Member(String email, String password,
			String name, LocalDateTime regDateTime) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = regDateTime;
	}

	void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}

	public void changePassword(String oldPassword, String newPassword) {
		if (!password.equals(oldPassword))
			throw new WrongIdPasswordException();
		this.password = newPassword;
	}

	public boolean matchPassword(String password) {
		return this.password.equals(password);
	}

}
