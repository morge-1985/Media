import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormMedia extends JFrame {

    public JPanel panelMain;
    private JTextField textNota1;
    private JTextField textNota2;
    private JButton mediaButton;
    private JTextField textSituacao;
    private JTextField textMedia;

    public FormMedia() {
        mediaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Double valor1 = Double.valueOf(textNota1.getText());
                Double valor2 = Double.valueOf(textNota2.getText());

                Double resposta = (valor1 + valor2 ) / 2;

                textMedia.setText(resposta.toString());

                if (resposta >= 7) {
                    textSituacao.setText("Aprovado");
                } else {
                    textSituacao.setText("Reprovado");
                }

            }

        });

    }

}