package com.example.filter_lab.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

@WebFilter(filterName = "UserFilter", urlPatterns = {"/", "/*"},
        initParams = @WebInitParam(name = "message", value = "Hello!")
)
public class UserFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("UserFilter has started");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = ((HttpServletRequest) servletRequest);

        HttpSession session = httpServletRequest.getSession();

        if (session.getAttribute("user") != null) {

        }else{

        }
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
