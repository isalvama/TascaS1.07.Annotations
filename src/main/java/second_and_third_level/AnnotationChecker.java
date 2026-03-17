package second_and_third_level;

import java.lang.annotation.Annotation;

public class AnnotationChecker {

    public static void checkIfToJsonFileAnnotationIsRegistered(Class<?> classType, Annotation[] annotations) {
        for (Annotation annotation : annotations) {
            if (annotation instanceof ToJsonFile toJsonAnnotation) {
                System.out.println("name: " + toJsonAnnotation.annotationType());
                System.out.println("value: " + toJsonAnnotation);
            }
        }
    }
}
