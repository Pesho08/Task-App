package com.prowork;

import javafx.scene.web.WebEngine;

public class JavaBridge {
  private final WebEngine engine;

  public JavaBridge(WebEngine engine){ this.engine = engine; }

  public void showMessage(String message){
    System.out.println("Message from JavaScript:" + message);
  }
}