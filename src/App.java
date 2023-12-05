/*
* File: App.java
* Author: Kovács Attila
* Copyright: 2023,Kovács Attila 
* Date: 2023-12-04
* Licenc: MIT
*
*/

import controllers.MainController;import views.MainWindow;
public class App { public static void main(String[] args)
throws Exception { MainWindow mainWindow = new MainWindow();
new MainController(mainWindow); mainWindow.setVisible(true);
}}
