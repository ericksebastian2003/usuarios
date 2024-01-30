import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class registro_usuarios extends JFrame implements ActionListener {
    private JTextField campoUsuario;
    private JPasswordField campoContraseña;
    private JButton botonIniciarSesion;

    public registro_usuarios() {
        // Configuración de la ventana
        setTitle("Inicio de Sesión");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Crear componentes
        JLabel etiquetaUsuario = new JLabel("Usuario:");
        campoUsuario = new JTextField();

        JLabel etiquetaContraseña = new JLabel("Contraseña:");
        campoContraseña = new JPasswordField();

        botonIniciarSesion = new JButton("Iniciar Sesión");
        botonIniciarSesion.addActionListener(this);

        // Agregar componentes a la ventana
        add(etiquetaUsuario);
        add(campoUsuario);
        add(etiquetaContraseña);
        add(campoContraseña);
        add(new JLabel()); // Espacio en blanco
        add(botonIniciarSesion);

        // Mostrar la ventana
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombreUsuario = campoUsuario.getText();
        String contraseña = new String(campoContraseña.getPassword());

        // Validar las credenciales
        if (nombreUsuario.equals("Sebas") && contraseña.equals("sebitas")) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso. Bienvenido, " + nombreUsuario + "!");
        } else {
            JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña incorrectos. Por favor, inténtelo de nuevo.");
        }
    }


}

/*import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registro_usuarios extends JFrame {

    private JTextField usuarios;
    private JButton aceptarButton;
    private JTextField contrasenias;
    private JButton cancelarButton;

    public registro_usuarios() {
        setTitle("Inicio de Sesión");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreUsuario = usuarios.getText();
                String contraseña = new String(contrasenias.getPassword());

                // Validar las credenciales
                if (nombreUsuario.equals("sebas") && contraseña.equals("sebitas")) {
                    JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso. Bienvenido, " + nombreUsuario + "!");
                } else {
                    JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña incorrectos. Por favor, inténtelo de nuevo.");
                }
            }
        });
    }
}
*/
