/**
 * 
 */
package com.jmg.sample.whw.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * @author Javier Moreno Garcia
 *
 */
public class HelloPage extends WebPage {

    private static final long serialVersionUID = -7566369511324746519L;

    public HelloPage() {
        add(new Label("message", "Hello WicketWorld!"));
    }

}
