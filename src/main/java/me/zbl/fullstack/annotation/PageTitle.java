package me.zbl.fullstack.annotation;

import java.lang.annotation.*;

/**
 * 用于在控制器的方法中对返回的页面标题进行自定义
 * <p>
 * Created by James on 17-12-3.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PageTitle {

  String name() default "";
}
