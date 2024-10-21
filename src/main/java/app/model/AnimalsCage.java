package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.beans.BeanProperty;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    @Qualifier("timer")
    private Timer timer;

    @Bean
    public Timer getTimer() {
        return this.timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
