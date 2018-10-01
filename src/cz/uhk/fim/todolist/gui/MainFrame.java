package cz.uhk.fim.todolist.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(){
        init();
    }

    private void init() {
        setTitle("TODO list application");
        setSize(1366,768);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


}
