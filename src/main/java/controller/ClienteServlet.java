package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import persistence.ClienteDao;
import persistence.GenericDao;

@WebServlet("/cliente")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ClienteServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String botao = request.getParameter("botao");
		
		GenericDao gDao = new GenericDao();
		ClienteDao cDao = new ClienteDao(gDao);
		
		Cliente cli = new Cliente();
		List<Cliente> clientes = new ArrayList<>();
		String erro = "";
		String saida = "";
		
		try {
			if(botao.equalsIgnoreCase("listar")) {
			} else {
				if(botao.equalsIgnoreCase("consultar") || botao.equalsIgnoreCase("excluir")) {
					if(botao.equalsIgnoreCase("consultar")) {
					} else {
					}
				} else {
					if(botao.equalsIgnoreCase("inserir")) {
					} else {
					}
				}
			}
		} catch(SQLException | ClassNotFoundException e) {
			erro = e.getMessage();
		} finally {
		}

	}

}
