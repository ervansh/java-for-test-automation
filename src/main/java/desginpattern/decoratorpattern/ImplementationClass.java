package desginpattern.decoratorpattern;

public class ImplementationClass {

	public static void main(String[] args) {
		  DesktopVersion desktopversion = new DesktopVersion();
		   NewsWidget widgetdecorator = new NewsWidget(desktopversion);
		   System.out.println("Rank of the Desktop version app with News Widget is "+widgetdecorator.getRank());
		  
		   
		   MobileVersion mobileversion = new MobileVersion();
		   TimeWidget decorator = new TimeWidget(new WeatherWidget(mobileversion));
		   System.out.println("Rank of the Desktop version app with Time and Waether Widget is "+decorator.getRank());
		   
		   

	}

}
