
package com;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JSeparator;

public class simulacion {
    
    private Timer temporizador;
    private TimerTask tarea;
    double tiempo = 0;
    double x;
    double a;
    double v;
    
    int amplitud;
    int omega;
    
    public void detener(){
        tarea.cancel(); 
        temporizador.cancel();    
    }
    
    private double posicion(){
        x = (amplitud*Math.cos(omega*tiempo/15));
        return x;
    }
    
    private double velocidad (){
        v = (amplitud*1*Math.sin(omega*tiempo/15));
        return v;
    }
    
    private double asceleracion(){
        a = (-amplitud*(1)*Math.cos(omega*tiempo/15));
        return a;
    }
    
    public void animacion (final JSeparator barra, final JLabel ResAs, final JLabel ResPos,
                                final JLabel ResVel, final Canvas lienzo, int amplitud, int omega){
        this.amplitud = amplitud;
        this.omega = omega;
        final double x1 = 1;
        final double y1 = 1;
        temporizador = new Timer();
        tarea = new TimerTask(){
        
        double x = 0 ;

            @Override
            public void run(){
                
                x = posicion();
                v = velocidad();
                a = asceleracion();
                ResPos.setText(String.valueOf(x));
                ResVel.setText(String.valueOf(v));
                ResAs .setText(String.valueOf(a));
                tiempo = (tiempo + 0.03);
                
                Graphics g = lienzo.getGraphics();
                Graphics2D g2 = ( Graphics2D ) g;
                
                barra.setLocation((int)(x+215+x1), 50);
                g2.setPaint(Color.BLACK);
                g2.draw(new Line2D.Double(200, 0, 200, 400));
                
                g2.setPaint(Color.RED);
                g2.draw(new Line2D.Double(x1+x+200, y1+tiempo, x+200, tiempo));
                
                g2.setPaint(Color.BLUE);
                g2.draw(new Line2D.Double(x1+a+200, y1+tiempo, a+200, tiempo));
                
                g2.setPaint(Color.GREEN);
                g2.draw(new Line2D.Double(x1+v+200, y1+tiempo, v+200, tiempo));

            }
        };
        temporizador.schedule(tarea,0,3);
    }
}
