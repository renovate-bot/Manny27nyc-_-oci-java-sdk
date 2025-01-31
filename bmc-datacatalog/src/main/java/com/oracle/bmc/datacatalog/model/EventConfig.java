/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Describes an event configuration, for a given object type and property. Primarily, whether a property change will result in an event being emitted.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EventConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class EventConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("typeId")
        private String typeId;

        public Builder typeId(String typeId) {
            this.typeId = typeId;
            this.__explicitlySet__.add("typeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("propertyId")
        private String propertyId;

        public Builder propertyId(String propertyId) {
            this.propertyId = propertyId;
            this.__explicitlySet__.add("propertyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("propertyName")
        private String propertyName;

        public Builder propertyName(String propertyName) {
            this.propertyName = propertyName;
            this.__explicitlySet__.add("propertyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventConfigStatus")
        private EventConfigStatus eventConfigStatus;

        public Builder eventConfigStatus(EventConfigStatus eventConfigStatus) {
            this.eventConfigStatus = eventConfigStatus;
            this.__explicitlySet__.add("eventConfigStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EventConfig build() {
            EventConfig __instance__ =
                    new EventConfig(
                            typeId,
                            typeName,
                            propertyId,
                            propertyName,
                            eventConfigStatus,
                            timeCreated,
                            timeUpdated,
                            createdById,
                            updatedById);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EventConfig o) {
            Builder copiedBuilder =
                    typeId(o.getTypeId())
                            .typeName(o.getTypeName())
                            .propertyId(o.getPropertyId())
                            .propertyName(o.getPropertyName())
                            .eventConfigStatus(o.getEventConfigStatus())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .createdById(o.getCreatedById())
                            .updatedById(o.getUpdatedById());

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

    /**
     * Unique type key identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeId")
    String typeId;

    /**
     * Name of the type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    String typeName;

    /**
     * Unique property key identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("propertyId")
    String propertyId;

    /**
     * Name of the property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("propertyName")
    String propertyName;

    /**
     * Status of the configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventConfigStatus")
    EventConfigStatus eventConfigStatus;

    /**
     * The date and time the event was configured, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The last time that any change was made to the configuration. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * OCID of the user who created the configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    String createdById;

    /**
     * OCID of the user who last modified the configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    String updatedById;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
