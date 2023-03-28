package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(urlPatterns = "/*")
public class DemoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init 初始化方法执行了");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("拦截到了请求...  放行前逻辑");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("拦截到了请求...  放行后逻辑");
    }

    @Override
    public void destroy() {
        System.out.println("destroy 销毁方法执行了");
    }
}
