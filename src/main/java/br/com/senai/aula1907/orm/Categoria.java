package br.com.senai.aula1907.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private String ativo;
	private Integer codigo_livro;
	private String titulo_livro;
	private String nome_autor;
	private Integer isbn;
	private String editora;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public Integer getCodigo_livro() {
		return codigo_livro;
	}
	public void setCodigo_livro(Integer codigo_livro) {
		this.codigo_livro = codigo_livro;
	}
	public String getTitulo_livro() {
		return titulo_livro;
	}
	public void setTitulo_livro(String titulo_livro) {
		this.titulo_livro = titulo_livro;
	}
	public String getNome_autor() {
		return nome_autor;
	}
	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
}
