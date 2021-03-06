/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2017_08_31;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of available upgrade versions.
 */
public class ManagedClusterPoolUpgradeProfile {
    /**
     * Kubernetes version (major, minor, patch).
     */
    @JsonProperty(value = "kubernetesVersion", required = true)
    private String kubernetesVersion;

    /**
     * Pool name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * OsType to be used to specify os type. Choose from Linux and Windows.
     * Default to Linux. Possible values include: 'Linux', 'Windows'.
     */
    @JsonProperty(value = "osType", required = true)
    private OSType osType;

    /**
     * List of orchestrator types and versions available for upgrade.
     */
    @JsonProperty(value = "upgrades")
    private List<String> upgrades;

    /**
     * Get the kubernetesVersion value.
     *
     * @return the kubernetesVersion value
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Set the kubernetesVersion value.
     *
     * @param kubernetesVersion the kubernetesVersion value to set
     * @return the ManagedClusterPoolUpgradeProfile object itself.
     */
    public ManagedClusterPoolUpgradeProfile withKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }

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
     * @return the ManagedClusterPoolUpgradeProfile object itself.
     */
    public ManagedClusterPoolUpgradeProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the osType value.
     *
     * @return the osType value
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the osType value.
     *
     * @param osType the osType value to set
     * @return the ManagedClusterPoolUpgradeProfile object itself.
     */
    public ManagedClusterPoolUpgradeProfile withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the upgrades value.
     *
     * @return the upgrades value
     */
    public List<String> upgrades() {
        return this.upgrades;
    }

    /**
     * Set the upgrades value.
     *
     * @param upgrades the upgrades value to set
     * @return the ManagedClusterPoolUpgradeProfile object itself.
     */
    public ManagedClusterPoolUpgradeProfile withUpgrades(List<String> upgrades) {
        this.upgrades = upgrades;
        return this;
    }

}
