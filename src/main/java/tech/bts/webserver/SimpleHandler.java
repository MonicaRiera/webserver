package tech.bts.webserver;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleHandler extends AbstractHandler
{
    @Override
    public void handle( String target,
                        Request baseRequest,
                        HttpServletRequest request,
                        HttpServletResponse response ) throws IOException
    {
        String cars = CarsDatabase.getCars();

        System.out.println("URI: " + request.getRequestURI());

        PrintWriter out = response.getWriter();
        response.setStatus(HttpServletResponse.SC_OK);

        //out.println("<h1>Rent a car</h1>");
        //out.println("<h2>Available cars</h2>");
        //out.println("<p>Brand - Max Speed</p>");

        //for (Car car : cars) {
        //    out.println("<p>" + car + "</p>");
        //}

        baseRequest.setHandled(true);
    }
}

