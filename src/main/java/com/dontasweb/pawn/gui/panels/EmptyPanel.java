package com.dontasweb.pawn.gui.panels;

import org.springframework.stereotype.Component;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.GridLayout;

@Component
public class EmptyPanel extends JPanel {

    public EmptyPanel() {
        this.setPreferredSize(new Dimension(500, 100));
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(2, 1));
    }
}
