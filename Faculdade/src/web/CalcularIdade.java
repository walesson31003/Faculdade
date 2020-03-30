package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class CalcularIdade extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
	
	//private static Scanner in;
	
	Calendar cal = GregorianCalendar.getInstance();
	int anoAtual = cal.get(Calendar.YEAR);
	int mesAtuall = cal.get(Calendar.MONTH);
	int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
	
	int mesAtual = mesAtuall +1;

	//Scanner in = new Scanner(System.in);
	//System.out.println("Dia, mes e ano de nascimento");
		int diaNasc = Integer.parseInt(req.getParameter("num1"));	
		int mesNasc = Integer.parseInt(req.getParameter("num2"));	
		int anoNasc = Integer.parseInt(req.getParameter("num3"));	
	

		//verifica se é uma data válida
	if (diaNasc > 31 || diaNasc <= 0 || mesNasc > 12 || mesNasc <= 0) {
		PrintWriter out = res.getWriter();
		res.getWriter().println("Digite uma data válida!");
			
		}else if ( mesNasc <= mesAtual && anoNasc == anoAtual){
			PrintWriter out = res.getWriter();
			res.getWriter().println("Você poussui meses de idade!");
		
		}else if ( mesNasc < mesAtual && anoNasc == anoAtual){
			PrintWriter out = res.getWriter();
			res.getWriter().println("Você poussui meses de idade!");
		
		}else if ( mesNasc >= mesAtual && anoNasc >= anoAtual){
			PrintWriter out = res.getWriter();
			res.getWriter().println("Você ainda não nasceu!");
		
			
		}else if (diaNasc > diaAtual && mesNasc >= mesAtual){
			int idade =(anoAtual - anoNasc - 1);
			PrintWriter out = res.getWriter();
			res.getWriter().println("você tem: "+idade+" anos");
			
		}else if (diaNasc == diaAtual && mesNasc != mesAtual){
			int idade =(anoAtual - anoNasc - 1);
			PrintWriter out = res.getWriter();
			res.getWriter().println("você tem: "+idade+" anos");
		
		}else if (diaNasc < diaAtual && mesNasc > mesAtual){
			int idade =(anoAtual - anoNasc - 1);
			PrintWriter out = res.getWriter();
			res.getWriter().println("você tem: "+idade+" anos");
	
		}else if (diaNasc > diaAtual && mesNasc < mesAtual){
			int idade =(anoAtual - anoNasc );
			PrintWriter out = res.getWriter();
			res.getWriter().println("você tem: "+idade+" anos");
			
		}else if (diaNasc == diaAtual && mesNasc == mesAtual){
			int idade =(anoAtual - anoNasc );
			PrintWriter out = res.getWriter();
			res.getWriter().println("Parabéns, hoje é seu aniversário, você tem: "+idade+" anos");
			
		}else if (diaNasc < diaAtual && mesNasc < mesAtual){
			int idade =(anoAtual - anoNasc );
			PrintWriter out = res.getWriter();
			res.getWriter().println("você tem: "+idade+" anos");
		
		}else if (diaNasc < diaAtual && mesNasc == mesAtual){
			int idade =(anoAtual - anoNasc );
			PrintWriter out = res.getWriter();
			res.getWriter().println("você tem: "+idade+" anos");
			
	}
	};

		
		
	/*int i = Integer.parseInt(req.getParameter("num1"));	
	int j = Integer.parseInt(req.getParameter("num2"));
	
	int k = i + j;
	
	
	
	
	PrintWriter out = res.getWriter();
	res.getWriter().println("resultado é "+k);*/
	}
	
	






