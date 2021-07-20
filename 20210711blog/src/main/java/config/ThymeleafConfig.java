/*
package config;

import com.sun.xml.internal.ws.api.policy.PolicyResolver;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ThymeleafConfig implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 使用这个!!!
        // 这个方法就会在当前 webapp 的 ServletContext 初始化之后
        // 立即执行. Thymeleaf 的初始化就在这里调用即可!!!
        // 初始化 Thymeleaf
        // 1) 创建一个 engine(引擎), 负责把 Java 中的数据替换到模板中.
        TemplateEngine engine = new TemplateEngine();
        // 2) 创建一个 resolver 对象(解析器), 负责找到 html 模板在哪, 并加载到内存中.
        //    供 engine 对象来使用.
        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver(sce.getServletContext());
        // 3) 给 resolver 设置一些属性, 让它能够找到 html 模板.
        resolver.setCharacterEncoding("utf-8");
        //    Prefix 表示 "前缀", 设定了满足啥样条件的文件被加载到内存中作为 HTML 模板
        resolver.setPrefix("/WEB-INF/template/");
        //    Suffix 表示 "后缀"
        resolver.setSuffix(".html");
        // 4) 把 resolver 和 engine 关联起来.
        engine.setTemplateResolver(resolver);

        // 把初始化好的 engine 对象交给 ServletContext 来保管.
        ServletContext context = sce.getServletContext();
        context.setAttribute("engine", engine);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
*/
package config;

//import com.sun.xml.internal.ws.api.policy.PolicyResolver;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ThymeleafConfig implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 使用这个!!!
        // 这个方法就会在当前 webapp 的 ServletContext 初始化之后
        // 立即执行. Thymeleaf 的初始化就在这里调用即可!!!
        // 初始化 Thymeleaf
        // 1) 创建一个 engine(引擎), 负责把 Java 中的数据替换到模板中.
        TemplateEngine engine = new TemplateEngine();
        // 2) 创建一个 resolver 对象(解析器), 负责找到 html 模板在哪, 并加载到内存中.
        //    供 engine 对象来使用.
        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver(sce.getServletContext());
        // 3) 给 resolver 设置一些属性, 让它能够找到 html 模板.
        resolver.setCharacterEncoding("utf-8");
        //    Prefix 表示 "前缀", 设定了满足啥样条件的文件被加载到内存中作为 HTML 模板
        resolver.setPrefix("/WEB-INF/template/");
        //    Suffix 表示 "后缀"
        resolver.setSuffix(".html");
        // 4) 把 resolver 和 engine 关联起来.
        engine.setTemplateResolver(resolver);

        // 把初始化好的 engine 对象交给 ServletContext 来保管.
        ServletContext context = sce.getServletContext();
        context.setAttribute("engine", engine);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}

