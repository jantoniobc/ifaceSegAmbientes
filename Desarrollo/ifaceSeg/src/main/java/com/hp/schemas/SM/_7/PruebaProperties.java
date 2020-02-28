package com.hp.schemas.SM._7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PruebaProperties {

	public static  void main(String[] args) {
		Properties prop = new Properties();
		
		try {
			InputStream archivo = new FileInputStream(".\\config\\config.properties");
			prop.load(archivo);
		
			System.out.println("Propiedades por nombre:" );
			System.out.println("-----------------------" + prop.size());
			archivo.close();
			System.out.println(  prop.stringPropertyNames() );

			} catch(IOException e) 
			{
				System.out.println(e.toString());
			}
	}
}
