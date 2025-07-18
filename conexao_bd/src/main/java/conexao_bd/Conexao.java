package conexao_bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	public Connection getConexao() {
		String user = "root"; //usuario do banco
		String pass = "2103"; //senha do banco
		String banco = "banco_dados"; //nome do banco
		String server = "localhost:"; // Endereço do banco
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //carrega o  driver do mysql
			String url = "jdbc:mysql://" + server +"3306/"+banco;
			return DriverManager.getConnection(url, user, pass); //retorna a conexão
		} catch (Exception e) {
			System.out.println("error: "+ e.getMessage());// caso tenha, mostra o erro.
		}
		return null; //se der erro, retorna null
	}

	public void fechar(Connection conn) {
		try {
			if(conn != null)conn.close(); //fecha conexão com segurança
		}catch (Exception e) {
			e.printStackTrace();//caso tenha, mostra o erro.
		}
	}

}
