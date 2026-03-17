package second_and_third_level;

import java.lang.annotation.Annotation;
import java.util.Optional;

public class AnnotationChecker {

    public static Optional<String> checkIfToJsonFileAnnotationIsRegistered(Object object) {
        Class<?> typeClass = object.getClass();
        Annotation[] classAnnotations = typeClass.getAnnotations();
        for (Annotation annotation : classAnnotations) {
            if (annotation instanceof ToJsonFile toJsonAnnotation) {
                return Optional.of("name: " + toJsonAnnotation.annotationType() + "value: " + toJsonAnnotation);
            }
        }
        return Optional.empty();
    }
}
