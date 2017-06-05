package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ASUS on 04.06.2017.
 */
public class View extends JFrame {

    public View() {
        setVisible(true);
        setSize(400, 400);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Manager");
        init();

    }

    private void init() {
        JButton saveButton = new JButton("SAVE");
        JButton editButton = new JButton("EDIT");
        JButton removeButton = new JButton("REMOVE");
        JButton searchButton = new JButton("SEARCH");


        JTable table = new JTable(new TableModel());
        JScrollPane scroll = new JScrollPane(table);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(1, 4));

        northPanel.add(saveButton);
        northPanel.add(editButton);
        northPanel.add(removeButton);
        northPanel.add(searchButton);

        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(scroll, BorderLayout.CENTER);
        add(mainPanel);


    }

}
