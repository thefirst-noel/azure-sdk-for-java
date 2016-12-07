/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for InAvailabilityReasonType.
 */
public final class InAvailabilityReasonType {
    /** Static value Invalid for InAvailabilityReasonType. */
    public static final InAvailabilityReasonType INVALID = new InAvailabilityReasonType("Invalid");

    /** Static value AlreadyExists for InAvailabilityReasonType. */
    public static final InAvailabilityReasonType ALREADY_EXISTS = new InAvailabilityReasonType("AlreadyExists");

    private String value;

    /**
     * Creates a custom value for InAvailabilityReasonType.
     * @param value the custom value
     */
    public InAvailabilityReasonType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof InAvailabilityReasonType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        InAvailabilityReasonType rhs = (InAvailabilityReasonType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
