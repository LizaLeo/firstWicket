package ee.itcollege.web.panel;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;

public class CounterPanel extends Panel {

	Label label = new Label("count", getDefaultModel());
	
	public CounterPanel(String id, IModel<Integer> model) {
		super(id, model);
		
		setOutputMarkupId(true);
		
		add(label);
		
		AjaxLink<Integer> link = new AjaxLink<Integer>("button",
				(IModel<Integer>) getDefaultModel()) {
			@Override
			public void onClick(AjaxRequestTarget target) {
				getModel().setObject(getModel().getObject() + 1);
				target.add(CounterPanel.this);
			}
		};
		add(link);
	}
	
	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return super.isVisible();
	}
	
	@Override
	protected void onConfigure() {
		super.onConfigure();
		setVisible((Integer) getDefaultModelObject() < 10);
	}
}