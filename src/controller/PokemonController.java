package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bulbasaur;
import model.Charizard;
import model.Dragonite;
import model.Mew;
import model.Pikachu;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			  Bulbasaur b=new Bulbasaur();
			  
			  
			msg = "<center>"+b.getCharacteristics()+""+b.getType()+","+b.getEvolution()+","+b.getBaseExp() ;
			request.setAttribute("message1",b.getCharacteristics());//getter);
			request.setAttribute("character1",b.getCharacter()); //getter);
			request.setAttribute("type1",b.getType());//getter;
			request.setAttribute("evolution1",b.getEvolution()); //getter);
			request.setAttribute("baseExp1",b.getBaseExp()); //getter);*/
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard ch=new Charizard(msg, 0, msg, msg, msg, msg);
				  
			msg = "<center>" +ch.getCharacteristics()+""+ch.getEvolution()+""+ch.getType()+""+ch.getBaseExp();
			request.setAttribute("message2",ch.getCharacteristics());//getter);
			request.setAttribute("character2",ch.getCharacter()); //getter);
			request.setAttribute("type2",ch.getType());//getter;
			request.setAttribute("evolution2",ch.getEvolution()); //getter);
			request.setAttribute("baseExp2",ch.getBaseExp()); //getter);*/
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	
			Dragonite d=new Dragonite(msg, 0, msg, msg, msg, msg);
				  
			msg = "<center>" + d.getCharacteristics()+""+d.getEvolution()+""+d.getType()+""+d.getBaseExp();
			request.setAttribute("message3",d.getCharacteristics());//getter);
			request.setAttribute("character3",d.getCharacter()); //getter);
			request.setAttribute("type3",d.getType());//getter;
			request.setAttribute("evolution3",d.getEvolution()); //getter);
			request.setAttribute("baseExp3",d.getBaseExp()); //getter);*/
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			Mew m=new Mew(msg, 0, msg, msg, msg, msg);
			
			msg = "<center>" + m.getCharacteristics()+""+m.getEvolution()+""+m.getType()+""+m.getBaseExp();
			request.setAttribute("message4",m.getCharacteristics());//getter);
			request.setAttribute("character4",m.getCharacteristics()); //getter);
			request.setAttribute("type4",m.getType());//getter;
			request.setAttribute("evolution4",m.getEvolution()); //getter);
			request.setAttribute("baseExp4",m.getBaseExp());  //getter);*/
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
			Pikachu p=new Pikachu(msg, 0, msg, msg, msg, msg);
			
			msg = "<center>" + p.getCharacteristics()+""+p.getEvolution()+""+p.getType()+""+p.getBaseExp();
			request.setAttribute("message5",p.getCharacteristics());//getter);
			request.setAttribute("character5",p.getCharacteristics()); //getter);
			request.setAttribute("type5",p.getType()); //getter;
			request.setAttribute("evolution5",p.getEvolution()); //getter);
			request.setAttribute("baseExp5",p.getBaseExp()); //getter);*/

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
