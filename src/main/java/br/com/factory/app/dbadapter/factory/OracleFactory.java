package br.com.factory.app.dbadapter.factory;

import br.com.factory.app.dbadapter.db.DB;
import br.com.factory.app.dbadapter.db.OracleDB;

public class OracleFactory implements DBFactory{

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
