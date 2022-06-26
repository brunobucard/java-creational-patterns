package br.com.factory.apple.simple.factory;

import br.com.factory.apple.simple.model.IPhone;
import br.com.factory.apple.simple.model.IPhone11;
import br.com.factory.apple.simple.model.IPhone11Pro;
import br.com.factory.apple.simple.model.IPhone12;
import br.com.factory.apple.simple.model.IPhoneX;
import br.com.factory.apple.simple.model.IPhoneXSMax;

public abstract class IPhoneSimpleFactory {

	public static IPhone orderIPhone(String generation, String level) {
		IPhone device = null;

		if ("X".equals(generation)) {
			if ("standard".equals(level)) {
				device = new IPhoneX();
			} else if ("highEnd".equals(level)) {
				device = new IPhoneXSMax();
			}
			
		} else if ("11".equals(generation)) {
			if ("standard".equals(level)) {
				device = new IPhone11();
			} else if ("highEnd".equals(level)) {
				device = new IPhone11Pro();
			}
		} else if ("12".equals(generation)) {
			if ("standard".equals(level)) {
				device = new IPhone12();
			}
		}

		if (device != null) {
			device.getHardware();
			device.assemble();
			device.certificates();
			device.pack();
		}
		
		return device;
	}
}
