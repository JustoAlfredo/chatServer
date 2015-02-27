/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

/**
 *
 * @author Gateway
 */
public class ChatServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaUsuariosConectados interfaceServer = new VentanaUsuariosConectados();
        interfaceServer.setVisible(true);
        interfaceServer.connection(8080);
    }
    
}
