package com.hybernate.Controller;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
	static SessionFactory sf =null;
	static 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		sf=cfg.buildSessionFactory();
	}
	public static SessionFactory getsf()
	{
		return sf;
	}
}
