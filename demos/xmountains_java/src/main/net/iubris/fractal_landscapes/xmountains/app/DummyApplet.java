package net.iubris.fractal_landscapes.xmountains.app;

public interface DummyApplet {

	void init();
	void start();
	void stop();
	void run();
	
	String getParameter(String parameterName);
	void showStatus(String status);
}
