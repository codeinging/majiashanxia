package com.mphone.majiashanxia;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * Created by syd on 2016/4/20.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD})
public @interface InjectView {
    int value();
}
