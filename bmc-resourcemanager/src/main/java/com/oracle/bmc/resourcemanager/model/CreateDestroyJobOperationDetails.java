/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Job details that are specific to destroy operations.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDestroyJobOperationDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "operation"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateDestroyJobOperationDetails extends CreateJobOperationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("terraformAdvancedOptions")
        private TerraformAdvancedOptions terraformAdvancedOptions;

        public Builder terraformAdvancedOptions(TerraformAdvancedOptions terraformAdvancedOptions) {
            this.terraformAdvancedOptions = terraformAdvancedOptions;
            this.__explicitlySet__.add("terraformAdvancedOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionPlanStrategy")
        private DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy;

        public Builder executionPlanStrategy(
                DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy) {
            this.executionPlanStrategy = executionPlanStrategy;
            this.__explicitlySet__.add("executionPlanStrategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDestroyJobOperationDetails build() {
            CreateDestroyJobOperationDetails __instance__ =
                    new CreateDestroyJobOperationDetails(
                            terraformAdvancedOptions, executionPlanStrategy);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDestroyJobOperationDetails o) {
            Builder copiedBuilder =
                    terraformAdvancedOptions(o.getTerraformAdvancedOptions())
                            .executionPlanStrategy(o.getExecutionPlanStrategy());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public CreateDestroyJobOperationDetails(
            TerraformAdvancedOptions terraformAdvancedOptions,
            DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy) {
        super();
        this.terraformAdvancedOptions = terraformAdvancedOptions;
        this.executionPlanStrategy = executionPlanStrategy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("terraformAdvancedOptions")
    TerraformAdvancedOptions terraformAdvancedOptions;

    /**
     * Specifies the source of the execution plan to apply.
     * Currently, only {@code AUTO_APPROVED} is allowed, which indicates that the job
     * will be run without an execution plan.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionPlanStrategy")
    DestroyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
