package com.kryptnostic.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Matthew Tamayo-Rios &lt;matthew@kryptnostic.com&gt; 
 *
 * Used to annotate UUIDs as UserIds
 */
@Retention( RetentionPolicy.RUNTIME )
@Target({ElementType.PARAMETER,ElementType.LOCAL_VARIABLE,ElementType.FIELD})
@Documented
public @interface UserId {

}
