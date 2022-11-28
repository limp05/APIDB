package br.edu.fatecfranca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="jogadoresBasquete")
public class BasqueteEntity {
	
	@Id // chave primária
	// campo auto-incremento iniciando em 1
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="nome")
	private String nome;
	@Column(name="time")
	private String time;
	@Column(name="idade")
	private int idade;
	@Column(name="poiscao")
	private String posicao;
	
	public BasqueteEntity() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	@Override
	public String toString() {
		return "BasqueteEntity [id=" + id + ", nome=" + nome + ", time=" + time + ", idade=" + idade + ", posicao="
				+ posicao + "]";
	}
	
}