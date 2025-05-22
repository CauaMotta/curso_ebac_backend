package br.com.ocauamotta;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface NomeDaTabela {
    String value();
}
