package com.msz.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RESTSingersMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    public RESTSingersMvcDispatcherServletInitializer() {
        super();
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return super.createRootApplicationContext();
    }

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        return super.createServletApplicationContext();
    }

    //Set the root mapping to "/"
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    //Set the servlet configuration to config class
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{RESTSingersConfiguration.class};
    }
}
