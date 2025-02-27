import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;



public class test {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("Proyecto con Maven \n ------------------------");

		

		try {

			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad?useSSL=false","root", "estofaneromedina15");

			if(con!=null) {

				System.out.println("SE CONECTO CON LA BASE DE DATOS");

								

				Statement sentencia=con.createStatement();

	            ResultSet resultado=sentencia.executeQuery("SELECT * FROM user");

	            while (resultado.next())

	            {

	                System.out.println (resultado.getString (1) + " " + resultado.getString(2));

	            }

			}
			
		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

			System.out.println("ERROR! NO SE CONECTO CON LA BASE DE DATOS");

		}

	}

}
