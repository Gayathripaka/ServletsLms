package com.virtusa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.virtusa.integrate.ConnectionManager;

class ConnectionMangerTest {

	@Test
	void test_postive() {
		
		try {
			Connection connection=ConnectionManager.
					openConnection();
			assertEquals(true,connection!=null);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			assertTrue(false);
		}		
	}	
}
