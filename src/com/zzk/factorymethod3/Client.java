package com.zzk.factorymethod3;

import com.zzk.factorymethod.XMLUtil;

public class Client {
	public static void main(String[] args) {
		LoggerFactory factory;
		factory = (LoggerFactory) XMLUtil.getBean();
		factory.createLogger();//直接使用工厂对象来调用产品对象的业务方法
	}
}
