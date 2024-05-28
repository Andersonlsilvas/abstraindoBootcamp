package application;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Java POO");
		curso1.setDescrição("Java do Basico ao Avançado");
		curso1.setCargaHoraria(80);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Java Script");
		curso2.setDescrição("Java Script Basico");
		curso2.setCargaHoraria(40);
		

		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Visão geral de POO");
		mentoria1.setDescrição("Abstração, Herança e Polimorfismo");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp java developer DIO e Santander");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		
		
		Dev devAnderson = new Dev();
		
		devAnderson.setNome("Anderson");
		devAnderson.inscreverBootcamp(bootcamp);
		System.out.println("Aluno Anderson\n" + devAnderson.getConteudoEscritos());
		devAnderson.progredir();
		devAnderson.progredir();
		System.out.println("-");
		System.out.println("Conteudo Inscrito: \n" + devAnderson.getConteudoEscritos());
		System.out.println("Conteudo Concluidos: \n" + devAnderson.getConteudosConcluidos());
		System.out.println("Xp: "+ devAnderson.calcularTotal());
		
		System.out.println("---------------------");
		
		Dev devKarla = new Dev();
		devKarla.setNome("Karla");
		devKarla.inscreverBootcamp(bootcamp);
		System.out.println("Aluna Karla\n" + devKarla.getConteudoEscritos());
		devKarla.progredir();
		devKarla.progredir();
		devKarla.progredir();
		System.out.println("-");
		System.out.println("Conteudo Inscrito:\n " + devKarla.getConteudoEscritos());
		System.out.println("Conteudo Concluidos: \n" + devKarla.getConteudosConcluidos());
		System.out.println("Xp: "+ devKarla.calcularTotal());
		

	}

}
