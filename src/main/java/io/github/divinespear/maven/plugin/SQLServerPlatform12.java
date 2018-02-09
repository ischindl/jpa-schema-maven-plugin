package io.github.divinespear.maven.plugin;

import java.lang.reflect.Field;

import org.eclipse.persistence.platform.database.SQLServerPlatform;

public class SQLServerPlatform12 extends SQLServerPlatform{

    /**
     *
     */
    private static final long serialVersionUID = -7635406252241916687L;

    public SQLServerPlatform12() {
        super();
        Field field;
        try {
            field = SQLServerPlatform.class.getDeclaredField("supportsSequenceObjects");
            field.setAccessible(true); // Suppress Java language access checking
            field.set(this, true);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
