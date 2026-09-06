package org.example;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.net.URL;

public class Sikuli {

    private Screen screen;

    public Sikuli() {
        screen = new Screen();
    }

    public void click() throws FindFailed {

        URL imageURL = getClass().getResource("/botaoOk.png");

        Pattern pattern = new Pattern(imageURL).similar(0.7f);
        screen.wait(pattern, 100);
        screen.rightClick(pattern);

        System.out.println("Botao Ok");

    }


}
