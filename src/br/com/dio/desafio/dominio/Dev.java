package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo>conteudoEscritos = new LinkedHashSet<>();
	private Set<Conteudo>conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoEscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevcEscritos().add(this);
		
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudoEscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudoEscritos.remove(conteudo.get());
		}else 
			System.err.println("Você não está matriculado em nenhum conteúdo");
	}
	
	
	public double calcularTotal() {
		return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoEscritos() {
		return conteudoEscritos;
	}

	public void setConteudoEscritos(Set<Conteudo> conteudoEscritos) {
		this.conteudoEscritos = conteudoEscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoEscritos, conteudosConcluidos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoEscritos, other.conteudoEscritos)
				&& Objects.equals(conteudosConcluidos, other.conteudosConcluidos) && Objects.equals(nome, other.nome);
	}
	
	

}
