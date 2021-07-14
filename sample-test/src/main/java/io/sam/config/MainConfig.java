package io.sam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: zhuweimu
 * @Date: 2020/9/26 21:34
 * @Description:
 */
@EnableAspectJAutoProxy(proxyTargetClass = false)
@ComponentScan(basePackages = "io.sam")
public class MainConfig {
}
