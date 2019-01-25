import javax.sound.midi.Soundbank;
import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ObserverProgram {
    private JButton Subscribe;
    private JPanel Panel;

    YoutubeData data = new YoutubeData();
    currentSubs currentCount = new currentSubs(data);
    String url = "www.youtube.com/user/PewDiePie?sub_confirmation=1";
    //https://www.youtube.com/user/PewDiePie?sub_confirmation=1

    public ObserverProgram() {
        Subscribe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                data.subscribe();
                try {
                    Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (IOException e1) {
                    System.out.println("Error!");;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AppFrame");
        frame.setContentPane(new ObserverProgram().Panel);
        frame.pack();
        frame.setVisible(true);

        YoutubeData data = new YoutubeData();
        currentSubs currentCount = new currentSubs(data);

    }
}

