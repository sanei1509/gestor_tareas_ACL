package com.santi.gestor_tareas_ACL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class GestorTareasAclApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Test
	public void testDatabaseConnection() throws Exception {
		assertNotNull(dataSource.getConnection(), "La conexión a la base de datos no puede ser nula");
	}
}