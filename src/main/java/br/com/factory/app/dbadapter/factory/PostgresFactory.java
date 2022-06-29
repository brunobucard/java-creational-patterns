package br.com.factory.app.dbadapter.factory;

import br.com.factory.app.dbadapter.db.DB;
import br.com.factory.app.dbadapter.db.PostgresDB;

public class PostgresFactory implements DBFactory{

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}

}
