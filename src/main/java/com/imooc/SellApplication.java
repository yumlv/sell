package com.imooc;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.hateoas.HypermediaHttpMessageConverterConfiguration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@SpringBootApplication
public class SellApplication  extends WebMvcConfigurerAdapter{

	public void configureMessageConveters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);

		/**需要定义一个convert转换消息的对象**/
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();

		/**添加fastJson的配置信息，比如 是否要格式化返回的json数据**/
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(
				SerializerFeature.PrettyFormat
		);

		/**在convert中添加配置信息**/
		fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);

		/**将convert添加到converters当中**/
		converters.add(fastJsonHttpMessageConverter);
	}
	public static void main(String[] args) {
		SpringApplication.run(SellApplication.class, args);
	}
}
