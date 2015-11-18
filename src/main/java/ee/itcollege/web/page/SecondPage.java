package ee.itcollege.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import ee.itcollege.web.panel.CounterPanel;

public class SecondPage extends LayoutPage {
	
	
	public SecondPage() {
		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
	}
	
	

}
