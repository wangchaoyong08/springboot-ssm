package com.wcy.ssm.configuration;

import freemarker.template.TemplateException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactory;

import java.io.IOException;

@Configuration
// 不能使用FreeMarkerConfiguration这个名字，重名了
public class FreeMarkerStaticPageConfiguration {


    @Bean(name="fmConfiguration")
    public freemarker.template.Configuration createFreeMarkerConfigurer() throws IOException, TemplateException {
        FreeMarkerConfigurationFactory factory = new FreeMarkerConfigurationFactory();
        factory.setTemplateLoaderPaths("templates");
        factory.setDefaultEncoding("UTF-8");
        return factory.createConfiguration();
    }
}
