package desginpattern.decoratorpattern;

public class WeatherWidget extends WidgetDecorator{

	private int weatherwidgetrank = 3;

	public WeatherWidget(WebPage webpage) {
		super(webpage);
	}

	@Override
	int getRank() {
		return webpage.getRank()+weatherwidgetrank;
	}

}
