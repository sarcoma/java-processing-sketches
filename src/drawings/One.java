package drawings;

import processing.core.PApplet;
import sketch.Sketch;

public class One extends Sketch {

    public static void main(String... args) {
        PApplet.main("drawings.One");
    }

    @Override
    public void settings() {
        _save = true;
        super.settings(1024, 1024, P2D);
        smooth(8);
    }

    @Override
    public void sketch() {
        _colours.getColours().forEach((name, colour) -> {
            background(colour.black());
            save("one", name);
        });
    }
}
