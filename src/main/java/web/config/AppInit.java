package web.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



    public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
        @Override
        protected Class<?>[] getRootConfigClasses() {
            return null;
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class<?>[]{WebConfig.class};
        }

//        @Override
//        public void onStartup(ServletContext servletContext) throws ServletException {
//            super.onStartup(servletContext);
//            registerHiddenFieldFilter(servletContext);
//        }

        @Override
        protected String[] getServletMappings() {
            return new String[]{"/"};
        }

        private void registerHiddenFieldFilter(ServletContext aContext) {
            aContext.addFilter("hiddenHttpMethodFilter",
                    new HiddenHttpMethodFilter()).addMappingForUrlPatterns(null, true, "/*");
        }
}
