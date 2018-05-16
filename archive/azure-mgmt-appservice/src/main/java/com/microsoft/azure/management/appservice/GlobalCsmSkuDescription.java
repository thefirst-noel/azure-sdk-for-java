/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import java.util.List;
import com.microsoft.azure.management.appservice.implementation.CapabilityInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Global SKU Description.
 */
public class GlobalCsmSkuDescription {
    /**
     * Name of the resource SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Service Tier of the resource SKU.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /**
     * Min, max, and default scale values of the SKU.
     */
    @JsonProperty(value = "capacity")
    private SkuCapacity capacity;

    /**
     * Locations of the SKU.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /**
     * Capabilities of the SKU, e.g., is traffic manager enabled?.
     */
    @JsonProperty(value = "capabilities")
    private List<CapabilityInner> capabilities;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier value.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier value.
     *
     * @param tier the tier value to set
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public SkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withCapacity(SkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the locations value.
     *
     * @return the locations value
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations value.
     *
     * @param locations the locations value to set
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the capabilities value.
     *
     * @return the capabilities value
     */
    public List<CapabilityInner> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities value.
     *
     * @param capabilities the capabilities value to set
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withCapabilities(List<CapabilityInner> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

}