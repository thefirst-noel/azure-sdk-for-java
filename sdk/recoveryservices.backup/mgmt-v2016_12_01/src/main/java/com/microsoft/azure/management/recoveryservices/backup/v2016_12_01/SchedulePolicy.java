/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for backup schedule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "schedulePolicyType")
@JsonTypeName("SchedulePolicy")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "LogSchedulePolicy", value = LogSchedulePolicy.class),
    @JsonSubTypes.Type(name = "LongTermSchedulePolicy", value = LongTermSchedulePolicy.class),
    @JsonSubTypes.Type(name = "SimpleSchedulePolicy", value = SimpleSchedulePolicy.class)
})
public class SchedulePolicy {
}
