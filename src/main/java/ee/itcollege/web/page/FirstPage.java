package ee.itcollege.web.page;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

import ee.itcollege.web.panel.CounterPanel;
import ee.itcollege.web.service.INumberService;
import ee.itcollege.web.service.StaticNumberService;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.Model;

import java.util.Arrays;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;


public class FirstPage extends LayoutPage {
		
	
	@SpringBean
	INumberService numberService;

	public FirstPage(final PageParameters parameters) {

		add(new ListView<Integer>("loop", numberService.getNumbers()) {
			@Override
			protected void populateItem(ListItem<Integer> item) {
				item.add(new CounterPanel("p1", item.getModel()));
			}
		});

		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
		
		add(new Link<Void>("secondPageLink") {
			@Override
			public void onClick() {
				setResponsePage(new SecondPage());
			}
		});

	}
}
