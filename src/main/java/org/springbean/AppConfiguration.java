package org.springbean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration annotation is a starting point of a Spring Framework application

//Spring also provides us stereotype annotations → “Annotations denoting the roles of types or methods in the overall
// architecture (at a conceptual, rather than implementation, level)”,
// and with the use of the @ComponentScan Spring will automatically scan our declared folder for Components like @Service
// and @Repository :

@Configuration
@ComponentScan("org.springbean")
public class AppConfiguration {


}
