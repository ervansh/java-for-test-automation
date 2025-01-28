package desginpattern.decoratorpattern;

public abstract class WidgetDecorator extends WebPage {
	WebPage webpage;

	public WidgetDecorator(WebPage webpage) {
		this.webpage = webpage;
	}

}
