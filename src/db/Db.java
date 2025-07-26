package db;

import db.DbException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Db {

    private static Connection conexao = null;

    public static Connection entrarConexao() {
        if (conexao == null) {
            try {
                Properties propriedades = carregarPropriedades();
                String url = propriedades.getProperty("dburl");
                String user = propriedades.getProperty("user");
                String password = propriedades.getProperty("password");
                Class.forName("com.mysql.cj.jdbc.Driver");

                conexao = DriverManager.getConnection(url, user, password);

            } catch (SQLException | ClassNotFoundException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conexao;
    }

    public static void fecharConexao() {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }

    private static Properties carregarPropriedades() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties propriedades = new Properties();
            propriedades.load(fs);
            return propriedades;
        } catch (IOException e) {
            throw new RuntimeException("Erro ao carregar o arquivo de propriedades", e);
        }
    }

    public static void fecharEstado(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void fecharResultado(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
