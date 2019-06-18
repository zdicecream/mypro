package com.example.mypro.config;

import com.example.mypro.controller.base.BaseResponse;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局统一错误页面处理
 */

@ControllerAdvice
public class GlobalExceptionHandler {
//    非restAPI 类型的指向
//    public static final String DEFAULT_ERROR_VIEW ="error";
//    @ExceptionHandler(value = Exception.class)
//    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e){
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", e);
//        mav.addObject("url", req.getRequestURL());
//        mav.setViewName(DEFAULT_ERROR_VIEW);
//        return mav;
//    }

    /**
     * 统一的restAPI 500返回
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResponse<String> defaultErrorHandler(HttpServletRequest req, Exception e){
        BaseResponse baseResponse = new BaseResponse(false,BaseResponse.errorCode,BaseResponse.errorMsg,null);
        return baseResponse;
    }
    /**
     *  vue项目与后端项目整合是通过install打包前端项目，然后把打包完产生的dist文件夹下的static文件夹和index.html放到后端项目的static路径下，其实最终整个前端项目都被编译成js文件，由index.html进行渲染。
     *  因此我这里通过捕获404HTTP错误状态码自定义页面，将页面指向了index.html，由其进行解析。
     *  -----------------------暂时不确定用不用------------------
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
        return factory -> {
            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/index.html");
            factory.addErrorPages(error404Page);
        };
    }

}
