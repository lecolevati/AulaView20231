package persistence;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;

public interface IClienteDao {

	public void	insertCliente(Cliente cli) throws SQLException, ClassNotFoundException;
	public void	updateCliente(Cliente cli) throws SQLException, ClassNotFoundException;
	public void	deleteCliente(Cliente cli) throws SQLException, ClassNotFoundException;
	public Cliente	selectCliente(Cliente cli) throws SQLException, ClassNotFoundException;
	public List<Cliente> listCliente() throws SQLException, ClassNotFoundException;
	
}
