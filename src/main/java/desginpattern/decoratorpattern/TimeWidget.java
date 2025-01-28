package desginpattern.decoratorpattern;

public class TimeWidget extends WidgetDecorator {

	private int timewidgetrank = 4;

	public TimeWidget(WebPage webpage) {
		super(webpage);
	}

	@Override
	int getRank() {
		return webpage.getRank() + timewidgetrank;
	}

}
