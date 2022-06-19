package br.com.factory.app.dbadapter.factory;

import br.com.factory.app.dbadapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
