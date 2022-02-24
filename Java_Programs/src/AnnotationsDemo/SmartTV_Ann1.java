package AnnotationsDemo;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartTV_Ann1 {
	String os();
	int width();
	int height();

}
