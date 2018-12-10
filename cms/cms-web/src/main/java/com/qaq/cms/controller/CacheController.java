package com.qaq.cms.controller;

import com.qaq.common.util.EhCacheUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : Administrator
 */
@RestController
@RequestMapping("/cache")
public class CacheController {
    private static Logger logger = LoggerFactory.getLogger(CacheController.class);

    // 配置的cache名
    private final static String CACHE_NAME = "ehCache";

    @RequestMapping("/add")
    public Object add(HttpServletRequest request) {
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        logger.info("key is {}, value is {}", key, value);
        EhCacheUtil.put(CACHE_NAME, key, value);
        return "success";
    }

    /**
     * 删除缓存记录
     * @param request
     * @return
     */
    @RequestMapping("/remove")
    public Object remove(HttpServletRequest request) {
        String key = request.getParameter("key");
        EhCacheUtil.remove(CACHE_NAME, key);
        return "success";
    }

    /**
     * 获取缓存记录
     * @param request
     * @return
     */
    @RequestMapping("/get")
    public Object get(HttpServletRequest request) {
        String key = request.getParameter("key");
        Object object = EhCacheUtil.get(CACHE_NAME, key);
        if (null == object) {
            System.out.println("没有找到key={}的记录");
            logger.error("【Ehcache】没有找到key={}的记录！", key);
            return "value";
        }
        return object;
    }

}
