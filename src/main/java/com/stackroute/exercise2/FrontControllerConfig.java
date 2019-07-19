package com.stackroute.exercise2;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer
{                                           //Extends AbstractAnnotationConfigDispatcherServletInitializer

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{Config.class};       //returns Config
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
