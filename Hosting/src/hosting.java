import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class hosting {
    protected JPanel hostingp;
    private JTextField nombreF;
    private JTextField pasatiempoF;
    private JTextField descripcionF;
    private JButton ingresarButton;

    public hosting() {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = "INSERT INTO registro VALUES (default,?,?,?)";
                String url = "jdbc:mysql://http://sql10.freemysqlhosting.net:3306/sql10686354";
                String nombre = "sql10686354";
                String password = "kcqcj5ZKBM";

                String name = nombreF.getText();
                String pasatiempos = pasatiempoF.getText();
                String descripcion = descripcionF.getText();

                try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo", nombre, password)){
                    try(PreparedStatement preparedStatement=connection.prepareStatement(query)){
                        preparedStatement.setString(1,nombre);
                        preparedStatement.setString(2,pasatiempos);
                        preparedStatement.setString(3,descripcion);

                        int filasAfectadas=preparedStatement.executeUpdate();
                        if(filasAfectadas>0){
                            System.out.println("Insercion exitosa");
                        }else {
                            System.out.println("No se pudo insertar");
                        }
                    }

                }catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
        });
    }
}
