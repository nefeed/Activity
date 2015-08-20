package com.Factory;

import com.Dao.DaoAbstract;
import com.Factory.DaoFactory;

/**
 *	工厂为单实例
 */
@SuppressWarnings("unchecked")
public class DaoFactory {
	private static DaoFactory df = null;
	
	private DaoFactory(){}
	
	public static DaoFactory getDaoFactory(){
		if (df == null) {
			df = new DaoFactory();
		}
		return df;
	}
	public <T extends DaoAbstract> T getInstance(Class<T> c){
		T daoObject = null;
		try {
			daoObject = (T)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return daoObject;
	}
}