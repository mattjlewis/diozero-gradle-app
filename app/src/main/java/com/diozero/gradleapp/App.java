package com.diozero.gradleapp;

import com.diozero.devices.LED;
import com.diozero.util.SleepUtil;

public class App {
	public static void main(String[] args) {
		new App().run();
	}

	@SuppressWarnings("static-method")
	public void run() {
		try (LED led = new LED(18)) {
			led.on();
			SleepUtil.sleepSeconds(1);
			led.off();
		}
	}
}
