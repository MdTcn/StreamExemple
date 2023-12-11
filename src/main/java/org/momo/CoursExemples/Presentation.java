package org.momo.CoursExemples;

public interface Presentation {

    void present();

    default void hello(){
        System.out.println("helloooo");
    };
}
