package br.com.dweb.auladweb.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import br.com.dweb.auladweb.enumerator.Sexo;

@Entity
public class Cliente {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Integer id;
	
	@NotNull
    @Size(min = 3, message = "Precisa de pelo menos 3 dígitos")
    private String nome;
    
	@Enumerated(EnumType.STRING)
    @NotNull(message = "Sexo é um campo obrigatório")
    private Sexo sexo;
    
	private String opcaoLaser = "";
	
	private int idade;
    
	@NotNull
    @NotBlank(message = "O tamanho da camiseta é um campo obrigatório")
    private String camiseta;

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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getOpcaoLaser() {
		return opcaoLaser;
	}

	public void setOpcaoLaser(String opcaoLaser) {
		this.opcaoLaser = opcaoLaser;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(String camiseta) {
		this.camiseta = camiseta;
	}

}
