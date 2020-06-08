package io.github.thatkawaiisam.redstone.api;

import com.google.gson.JsonObject;

public interface MetadataProvider {

    /**
     * Identifier for the Metadata Provider.
     *
     * @return identifier.
     */
    String getID();

    /**
     * Data for the Metadata Provider as a JsonObject.
     *
     * @return constructed data.
     */
    JsonObject getData();

}
