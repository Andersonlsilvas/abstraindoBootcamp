package application;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescrição("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescrição("Descrição curso js");
		curso2.setCargaHoraria(4);
		

		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescrição("Descrição Mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		
		
		Dev devAnderson = new Dev();
		
		devAnderson.setNome("Anderson");
		devAnderson.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo Inscrito Anderson" + devAnderson.getConteudoEscritos());
		devAnderson.progredir();
		devAnderson.progredir();
		System.out.println("-");
		System.out.println("Conteudo Inscrito Anderson" + devAnderson.getConteudoEscritos());
		System.out.println("Conteudo Concluidos Anderson" + devAnderson.getConteudosConcluidos());
		System.out.println("Xp: "+ devAnderson.calcularTotal());
		
		System.out.println("---------------------");
		
		Dev devKarla = new Dev();
		devKarla.setNome("Karla");
		devKarla.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo Inscrito Karla" + devKarla.getConteudoEscritos());
		devKarla.progredir();
		devKarla.progredir();
		devKarla.progredir();
		System.out.println("-");
		System.out.println("Conteudo Inscrito Karla" + devKarla.getConteudoEscritos());
		System.out.println("Conteudo Concluidos Karla" + devKarla.getConteudosConcluidos());
		System.out.println("Xp: "+ devKarla.calcularTotal());
		

	}

}
