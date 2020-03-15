package pinar.larrosa.alejandro.controllentillas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages={
		"pinar.larrosa.alejandro.config", "pinar.larrosa.alejandro.service","pinar.larrosa.alejandro.controller"})
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
