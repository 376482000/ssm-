package com.gede.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
* @author gede
* @version date：2019年6月20日 下午10:09:38
* @description ：充当web.xml的作用。
*/
public class ConfigInit extends AbstractAnnotationConfigDispatcherServletInitializer{
	/**
	 * 加载RootConfig配置文件
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {RootConfig.class};
	}
	/**
	 * 加载网站配置文件
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {WebConfig.class};
	}
	/**
	 * 设置项目起始目录路径为/
	 */
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[]{"/"};
	}

}
