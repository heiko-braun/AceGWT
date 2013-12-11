package edu.ycp.cs.dh.acegwt.client.ace;

import com.google.gwt.core.client.ScriptInjector;

/**
 * @author Heiko Braun
 * @date 10/6/13
 */
public class EntryPoint implements com.google.gwt.core.client.EntryPoint {
    @Override
    public void onModuleLoad() {

        ScriptInjector.fromString(Resources.INSTANCE.aceJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(Resources.INSTANCE.xmlJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(Resources.INSTANCE.jsonJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(Resources.INSTANCE.themeJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }
}
