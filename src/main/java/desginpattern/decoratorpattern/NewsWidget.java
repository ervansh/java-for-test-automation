package desginpattern.decoratorpattern;

public class NewsWidget extends WidgetDecorator {

	private int newswidgetrank = 5;

	public NewsWidget(WebPage webpage) {
		super(webpage);
	}

	@Override
	int getRank() {
		return webpage.getRank() + newswidgetrank;
	}

}
