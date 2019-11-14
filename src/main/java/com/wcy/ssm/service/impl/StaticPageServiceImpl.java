package com.wcy.ssm.service.impl;

import com.wcy.ssm.beans.User;
import com.wcy.ssm.service.StaticPageService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

@Service
public class StaticPageServiceImpl implements StaticPageService {

    @Resource(name = "fmConfiguration")
    private Configuration configuration;

    @Override
    public void generatePage(Long id) {
        //根据商品id，查询商品
        User user = new User();
        Template template = null;
        try {
            template = configuration.getTemplate("");

            //准备数据
            Map<String, User> dataMap = new HashMap<>();
            dataMap.put("user", user);
            //输出
            template.process(dataMap, new FileWriter(new File("")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
