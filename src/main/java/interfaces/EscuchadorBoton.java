package interfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscuchadorBoton {
    private void escuchadorBoton() {
        JButton jButton = new JButton("Botón");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pulsaste el botón");
            }
        });
    }
}
