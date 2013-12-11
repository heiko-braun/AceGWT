package edu.ycp.cs.dh.acegwt.client.ace;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface Resources extends ClientBundle {

    Resources INSTANCE =  GWT.create(Resources.class);
   
    @Source("edu/ycp/cs/dh/acegwt/public/ace/ace.js")
    TextResource aceJs();

    @Source("edu/ycp/cs/dh/acegwt/public/ace/mode-xml.js")
    TextResource xmlJs();

    @Source("edu/ycp/cs/dh/acegwt/public/ace/mode-json.js")
    TextResource jsonJs();

    @Source("edu/ycp/cs/dh/acegwt/public/ace/theme-chrome.js")
    TextResource themeJs();
}


