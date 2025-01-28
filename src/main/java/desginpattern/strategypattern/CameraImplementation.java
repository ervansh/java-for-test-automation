package desginpattern.strategypattern;

public class CameraImplementation {

	public static void main(String[] args) {

		PhoneCameraApp camera = new CameraPlusApp();

		camera.takePhoto();
		camera.editPhoto();
		camera.savePhoto();
		camera.setShareStrategy(new ShareByEmail());
		camera.sharePhoto();

		camera.setShareStrategy(new ShareBySocialMedia());
		camera.sharePhoto();
	}

}
