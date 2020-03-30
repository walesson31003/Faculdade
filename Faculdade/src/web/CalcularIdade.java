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
	

		//verifica se � uma data v�lida
	if (diaNasc > 31 || diaNasc <= 0 || mesNasc > 12 || mesNasc <= 0) {
		PrintWriter out = res.getWriter();
		res.getWriter().println("Digite uma data v�lida!");
			
		}else if ( mesNasc <= mesAtual && anoNasc == anoAtual){
			PrintWriter out = res.getWriter();
			res.getWriter().println("Voc� poussui meses de idade!");
		
		}else if ( mesNasc < mesAtual && anoNasc == anoAtual){
			PrintWriter out = res.getWriter();
			res.getWriter().println("Voc� poussui meses de idade!");
		
		}else if ( mesNasc >= mesAtual && anoNasc >= anoAtual){
			PrintWriter out = res.getWriter();
			res.getWriter().println("Voc� ainda n�o nasceu!");
		
			
		}else if (diaNasc > diaAtual && mesNasc >= mesAtual){
			int idade =(anoAtual - anoNasc - 1);
			PrintWriter out = res.getWriter();
			res.getWriter().println("voc� tem: "+idade+" anos");
			
		}else if (diaNasc == diaAtual && mesNasc != mesAtual){
			int idade =(anoAtual - anoNasc - 1);
			PrintWriter out = res.getWriter();
			res.getWriter().println("voc� tem: "+idade+" anos");
		
		}else if (diaNasc < diaAtual && mesNasc > mesAtual){
			int idade =(anoAtual - anoNasc - 1);
			PrintWriter out = res.getWriter();
			res.getWriter().println("voc� tem: "+idade+" anos");
	
		}else if (diaNasc > diaAtual && mesNasc < mesAtual){
			int idade =(anoAtual - anoNasc );
			PrintWriter out = res.getWriter();
			res.getWriter().println("voc� tem: "+idade+" anos");
			
		}else if (diaNasc == diaAtual && mesNasc == mesAtual){
			int idade =(anoAtual - anoNasc );
			PrintWriter out = res.getWriter();
			res.getWriter().println("Parab�ns, hoje � seu anivers�rio, voc� tem: "+idade+" anos");
			
		}else if (diaNasc < diaAtual && mesNasc < mesAtual){
			int idade =(anoAtual - anoNasc );
			PrintWriter out = res.getWriter();
			res.getWriter().println("voc� tem: "+idade+" anos");
		
		}else if (diaNasc < diaAtual && mesNasc == mesAtual){
			int idade =(anoAtual - anoNasc );
			PrintWriter out = res.getWriter();
			res.getWriter().println("voc� tem: "+idade+" anos");
			
	}
	};

		
		
	/*int i = Integer.parseInt(req.getParameter("num1"));	
	int j = Integer.parseInt(req.getParameter("num2"));
	
	int k = i + j;
	
	
	
	
	PrintWriter out = res.getWriter();
	res.getWriter().println("resultado � "+k);*/
	}
	
	






