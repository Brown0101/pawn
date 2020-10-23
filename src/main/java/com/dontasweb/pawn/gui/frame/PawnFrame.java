package com.dontasweb.pawn.gui.frame;

import com.dontasweb.pawn.gui.panels.EmptyPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@Component
public class PawnFrame extends JFrame {

    @Autowired
    private EmptyPanel emptyPanel;

    // Will keep all important panels that will be added to the main JFrame
    private JPanel mainPanel;

    public PawnFrame() {}

    @PostConstruct
    public void createMainGUI() {
        this.setBounds(100, 70, 1100, 500);
        this.setResizable(false);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());

        this.mainPanel.add(this.emptyPanel, BorderLayout.SOUTH);

        this.add(mainPanel);
        this.setTitle("Pawn - Advanced Tactics");
        this.setVisible(true);
    }
}
