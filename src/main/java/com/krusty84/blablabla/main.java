import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.log4j.xml.DOMConfigurator;

class MainBlaBla{
        
        private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MainBlaBla.class.getSimpleName());
        
        public static void main(String args[]){

            System.setProperty("InternalSysVarForLog4j",System.getenv("OS SYS VARIABLE"));
            DOMConfigurator.configure("src/main/resources/log4j.xml");
            /*
             * bla bla bla
             */
            String someIdea = "Hello log4j2"
            logger.info("I wann say:" + someIdea);

    }
}