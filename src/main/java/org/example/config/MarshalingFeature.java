package org.example.config;

import org.example.provider.CustomJsonMapperProvider;

import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;

/**
 * @author <a href="kuldeepyadav7291@gmail.com">Kuldeep</a>
 */
public class MarshalingFeature implements Feature {
    @Override
    public boolean configure(FeatureContext context) {
        context.register(CustomJsonMapperProvider.class,
                MessageBodyReader.class,
                MessageBodyWriter.class);
        return false;
    }
}
