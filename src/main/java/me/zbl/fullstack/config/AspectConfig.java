package me.zbl.fullstack.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Spring AOP 的配置
 * <p>
 * Created by James on 17-12-3.
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AspectConfig {

}
