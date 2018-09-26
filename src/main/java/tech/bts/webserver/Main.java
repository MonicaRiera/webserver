package tech.bts.webserver;

import org.eclipse.jetty.server.Server;

import static spark.Spark.get;

public class Main {

    public static void main(String[] args) throws Exception{

        Server server = new Server(4567);
        get("/hello", (req, res) -> "Hello World");
        get("/products", (req, res) -> CarsDatabase.getCars());

        //ContextHandler contextHandler = new ContextHandler("/products");
        //contextHandler.setHandler(new SimpleHandler());

        //server.setHandler(new SimpleHandler());

        //server.start();
        //server.join();





    }
}
