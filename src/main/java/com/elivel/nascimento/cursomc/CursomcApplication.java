package com.elivel.nascimento.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elivel.nascimento.cursomc.domain.Categoria;
import com.elivel.nascimento.cursomc.domain.Cidade;
import com.elivel.nascimento.cursomc.domain.Cliente;
import com.elivel.nascimento.cursomc.domain.Endereco;
import com.elivel.nascimento.cursomc.domain.Estado;
import com.elivel.nascimento.cursomc.domain.Produto;
import com.elivel.nascimento.cursomc.domain.enums.TipoCliente;
import com.elivel.nascimento.cursomc.repositories.CategoriaRepository;
import com.elivel.nascimento.cursomc.repositories.CidadeRepository;
import com.elivel.nascimento.cursomc.repositories.ClienteRepository;
import com.elivel.nascimento.cursomc.repositories.EnderecoRepository;
import com.elivel.nascimento.cursomc.repositories.EstadoRepository;
import com.elivel.nascimento.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
		
			//System.out.println("Desenvolvido por: ELivel Nascimento");
	}

	@Override
	public void run(String... args) throws Exception {
	
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade cid1 = new Cidade(null, "Urbêlandia", est1);
		Cidade cid2 = new Cidade(null, "São Paulo", est2);
		Cidade cid3 = new Cidade(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(cid1));
		est2.getCidades().addAll(Arrays.asList(cid2, cid3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));
		
		Cliente cli1 = new Cliente(null, "Elivel Nascimento", "elivel.nascimento@.com", "289.892.788.05", TipoCliente.PESSOAFISICA);
		
		cli1.getTelefones().addAll(Arrays.asList("222222222", "333333333"));
	
		Endereco e1 = new Endereco(null, "Rua:Giovanni Quadri", "n:22", "53B","José Bonifácio", "08255-500", cli1, cid2);
		Endereco e2 = new Endereco(null, "AV. Gamelinha Branca", "270", "Não tem", "JD Marilia", "08822211", cli1, cid3);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
	}

}
