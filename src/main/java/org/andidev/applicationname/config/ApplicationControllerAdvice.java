package org.andidev.applicationname.config;

import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ApplicationControllerAdvice {
    
    @Inject
    private MessageSource messageSource;

    @Value("${application.name}")
    private String applicationName;
    @Value("${application.version}")
    private String applicationVersion;
    @Value("${application.environment}")
    private String applicationEnvironment;

    @ModelAttribute("applicationName")
    public String getApplicationName() {
        return applicationName;
    }

    @ModelAttribute("applicationVersion")
    public String getApplicationVersion() {
        return applicationVersion;
    }

    @ModelAttribute("applicationEnvironment")
    public String getApplicationEnvironment() {
        return applicationEnvironment;
    }

//    @ExceptionHandler(Throwable.class)
//    public ModelAndView handleAllException(Exception ex) {
//
//        ModelAndView model = new ModelAndView("pages/error");
//        model.addObject("errMsg", "this is Exception.class");
//
//        return model;
//    }
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.
//    }
}
