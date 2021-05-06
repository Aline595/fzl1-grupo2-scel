package com.fatec.scelwebdriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * REQ01 - Como usuário, desejo cadastrar um livro, de maneira que seja possível consultar a disponibilidade do livro para empréstimo.   
 * 
 * Cenários de teste 
 * CT01 – cadastrar livro com sucesso 
 * CT02 – cadastrar livro com isbn já cadastrado 
 * CT03 – cadastrar livro com isbn em branco 
 * CT04 – cadastrar livro com título em branco 
 * CT05 – cadastrar livro com autor em branco
 * 
 */

class REQ01CadastroLivro {
	/*
	 * @Test void ct01_quando_dados_validos_cadastra_com_sucesso() { Biblioteca
	 * biblioteca = new Biblioteca(); Livro umLivro = new Livro("1111",
	 * "Engenharia de Software", "Pressman"); biblioteca.add(umLivro);
	 * assertEquals(1, biblioteca.size()); }
	 */
/*
	@Test
	void ct02_quando_dados_validos_cadastra_com_sucesso() {
		Biblioteca biblioteca = new Biblioteca();
		Livro umLivro = new Livro("1111", "Engenharia de Software", "Pressman");
		biblioteca.add(umLivro);
		List<Livro> lista = biblioteca.getLivros();
		assertEquals("Engenharia de Software", lista.get(0).getTitulo());
	}
	
	@Test
	void ct02_quando_dado_do_ISBN_invalido_cadastra_com_falha() {
		Biblioteca biblioteca = new Biblioteca();
		Livro umLivro = new Livro("", "Engenharia de Software", "Pressman");
		biblioteca.add(umLivro);
		List<Livro> lista = biblioteca.getLivros();
		assertEquals("Engenharia de Software", lista.get(0).getTitulo());
	}

	@Test
	void ct03_quando_dado_do_ISBN_invalido_cadastra_com_falha() {
		Biblioteca biblioteca = new Biblioteca();
		Livro umLivro = new Livro("", "Engenharia de Software", "Pressman");
		biblioteca.add(umLivro);
		List<Livro> lista = biblioteca.getLivros();
		assertEquals("Engenharia de Software", lista.get(0).getTitulo());
	}*/
	
	@Test
	void ct04_quando_dado_do_titulo_invalido_cadastra_com_falha() {
		Biblioteca biblioteca = new Biblioteca();
		Livro umLivro = new Livro("1234", "", "Pressman");
		biblioteca.add(umLivro);
		List<Livro> lista = biblioteca.getLivros();
		assertEquals("Engenharia de Software", lista.get(0).getTitulo());
	}
	/*
	@Test
	void ct05_quando_dado_do_autor_invalido_cadastra_com_falha() {
		Biblioteca biblioteca = new Biblioteca();
		Livro umLivro = new Livro("1234", "Engenharia de Software", "");
		biblioteca.add(umLivro);
		List<Livro> lista = biblioteca.getLivros();
		assertEquals("Engenharia de Software", lista.get(0).getTitulo());
	}
*/
}
