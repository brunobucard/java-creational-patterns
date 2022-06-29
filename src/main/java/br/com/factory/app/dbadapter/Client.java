package br.com.factory.app.dbadapter;

import br.com.factory.app.dbadapter.db.DB;
import br.com.factory.app.dbadapter.factory.OracleFactory;
import br.com.factory.app.dbadapter.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {
		// DB db = new PostgresFactory().getDatabase();
		DB db = new OracleFactory().getDatabase();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
