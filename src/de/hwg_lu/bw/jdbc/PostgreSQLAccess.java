package de.hwg_lu.bw.jdbc;

public class PostgreSQLAccess extends JDBCAccess {

	public PostgreSQLAccess() throws NoConnectionException {
		super();
	}
	public void setDBParms(){
		dbDrivername = "org.postgresql.Driver";
		dbURL        = System.getenv().getOrDefault("DB_URL", "jdbc:postgresql://localhost:5432/postgres");
		dbUser       = System.getenv().getOrDefault("DB_USER", "postgres");
		dbPassword   = System.getenv().getOrDefault("DB_PASSWORD", "");
//		dbURL        = "jdbc:postgresql://localhost:5432/BWUEBDB";
//		dbUser       = "postgres";
//		dbPassword   = System.getenv().getOrDefault("DB_PASSWORD", "");
		dbSchema     = System.getenv().getOrDefault("DB_SCHEMA", "public");
		
	}
	public static void main(String[] args) throws NoConnectionException { 
		new PostgreSQLAccess().getConnection();
	}
}
