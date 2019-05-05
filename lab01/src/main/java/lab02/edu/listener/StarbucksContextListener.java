package lab02.edu.listener;

import lab02.edu.data.DataFacade;
import lab02.edu.data.DataFacadeFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class StarbucksContextListener implements ServletContextListener{

 
		  public void contextInitialized(ServletContextEvent event){
 
			ServletContext servletContext = event.getServletContext();

			// Set up Database access
			String version = servletContext.getInitParameter("version");
 			DataFacade data = (new DataFacadeFactory()).getDataFacadeInstance(version);

		    servletContext.setAttribute("dataSource", data);

 		  }

		  public void contextDestroyed(ServletContextEvent event){}

 



}
