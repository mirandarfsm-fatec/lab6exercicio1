package br.gov.sp.fatec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App{
	Calculadora multiplicacao;
	Calculadora soma;
	Integer number;
	
    public static void main( String[] args ){
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	App app = (App) context.getBean("app");
    	Produto produto = (Produto) context.getBean("produto");
    	System.out.println("Multiplicacao: " + app.multiplicacao.calcular(produto, app.number));
    	System.out.println("Soma: " + app.soma.calcular(produto, app.number));
    }

	public void setMultiplicacao(Calculadora multiplicacao) {
		this.multiplicacao = multiplicacao;
	}

	public void setSoma(Calculadora soma) {
		this.soma = soma;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
    
    
}
