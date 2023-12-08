//Wamster Alexis

import java.awt.*;
import java.awt.image.BufferedImage;
public class Serveur extends GraphicsEnvironment {
    
  protected Serveur() {
  }
  @Override
  public Graphics2D 	createGraphics(BufferedImage img){}
  @Override
  public Font[] 	getAllFonts(){}
  @Override
  public String[] 	getAvailableFontFamilyNames(){}
  @Override
  public String[] 	getAvailableFontFamilyNames(Locale l){}
  @Override
  public Point 	getCenterPoint(){}
  @Override
  public GraphicsDevice[] getScreenDevices(){}
  @Override
  public Rectangle 	getMaximumWindowBounds(){}
  @Override
  public boolean 	isHeadlessInstance(){}
  @Override
  public void 	preferLocaleFonts(){}
  @Override
  public void 	preferProportionalFonts(){}
  @Override
  public boolean 	registerFont(Font font){}
}
