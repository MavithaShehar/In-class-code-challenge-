package lk.ijse.inclass_test.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter(filterName = "origin",urlPatterns = "/*")

public class CORSFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
            System.out.println("CORS Filter");
            String origin = req.getHeader("Origin");
            System.out.println(origin);
            System.out.println(origin.contains(getServletContext().getInitParameter("origin")));

        if (origin.contains(getServletContext().getInitParameter("origin"))) {
                res.setHeader("Access-Control-Allow-Origin", origin);
                res.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,HEADER");
                res.setHeader("Access-Control-Allow-Headers", "Content-Type");
                res.setHeader("Access-Control-Expose-Headers", "Content-Type");
            }
            chain.doFilter(req, res);
        }
    }

