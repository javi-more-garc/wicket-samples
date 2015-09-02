package com.jmg.sample.whw;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import com.jmg.sample.whw.page.HelloPage;

/**
 * 
 * @author Javier Moreno Garcia
 *
 */
public class HelloWorldApplication extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
        return HelloPage.class; //return default page
    }

}
