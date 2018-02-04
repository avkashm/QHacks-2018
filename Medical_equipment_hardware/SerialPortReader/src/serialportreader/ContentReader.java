package serialportreader;

import processing.core.*;
import processing.serial.*;
import java.util.*;

public class ContentReader extends PApplet {
    
    Serial myPort;
    String val;
    String newval;
    
    public ContentReader(){
    }

    public static void main(String[] args) {
        PApplet.main("serialportreader.ContentReader");
        ContentReader cr = new ContentReader();
        cr.draw();
    }
    
    public void setup(){
        String portName = "COM3";
        myPort = new Serial(this, portName, 9600);
    }

    public void draw(){
        if (myPort.available()>0){
            val = myPort.readStringUntil('\n');
        }
        System.out.println("val: "+ val);
    }
}
