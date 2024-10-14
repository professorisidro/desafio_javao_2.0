package io.isiflix.desafio2;

public class Pessoa {
	private Integer id;
	private String nome;
	private String email;
	private String cpf;
	private Integer idade;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Pessoa(Integer id, String nome, String email, String cpf, Integer idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.idade = idade;
	}
	public Pessoa() {
		super();
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", idade=" + idade + "]";
	}
	

}
