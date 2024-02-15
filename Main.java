public class Server {
  public static void main(String[] args) throws IOException{
    int port = 12345; //Porta sulla quale il server ascolta 
    ServerSocket serverSocket = new ServerSocket(port)
    System.out.println("Server in ascolto sulla porta"+ port)

    try{
        while(true){
                //Stoppa l'esecuzione finchè un client non si connette
                Socket clientSocket=ServerSocket.accept();

                PrintWriter out= new PrintWriter(clientSocket.getOutput.Stream(), true);
                out.println("Ciao client");
                clientSocket.close();
        }
        finally{
            serverSocket.close();
        }
    }
  }
}