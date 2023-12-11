package Chat_Application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ClientHandler implements Runnable {
    private Socket clientSocket;
    private List<ClientHandler> clients;
    private PrintWriter out;

    public ClientHandler(Socket clientSocket, List<ClientHandler> clients) {
        this.clientSocket = clientSocket;
        this.clients = clients;

        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String username = in.readLine();
            System.out.println(username + " has joined the chat.");

            // Broadcast the new user to all clients
            broadcast(username + " has joined the chat.");

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println(username + ": " + message);
                broadcast(username + ": " + message);
            }

            // If the client disconnects
            clients.remove(this);
            System.out.println(username + " has left the chat.");
            broadcast(username + " has left the chat.");

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    private void broadcast(String message) {
        for (ClientHandler client : clients) {
            client.sendMessage(message);
        }
    }
}
