package io.github.thatkawaiisam.redstone.api;

import com.google.gson.JsonObject;

public interface MetadataProvider {

    /**
     *
     * @return identifier.
     */
    String getID();

    /**
     *
     * @return constructed data.
     */
    JsonObject getData();

}
