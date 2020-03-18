/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class GetAttributeRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique catalog identifier.
     */
    private String catalogId;

    /**
     * Unique data asset key.
     */
    private String dataAssetKey;

    /**
     * Unique entity key.
     */
    private String entityKey;

    /**
     * Unique attribute key.
     */
    private String attributeKey;

    /**
     * Specifies the fields to return in an entity attribute response.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Specifies the fields to return in an entity attribute response.
     *
     **/
    public enum Fields {
        Key("key"),
        DisplayName("displayName"),
        Description("description"),
        EntityKey("entityKey"),
        LifecycleState("lifecycleState"),
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        CreatedById("createdById"),
        UpdatedById("updatedById"),
        ExternalDataType("externalDataType"),
        ExternalKey("externalKey"),
        IsIncrementalData("isIncrementalData"),
        IsNullable("isNullable"),
        Length("length"),
        Position("position"),
        Precision("precision"),
        Scale("scale"),
        TimeExternal("timeExternal"),
        Uri("uri"),
        Properties("properties"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Fields: " + key);
        }
    };
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetAttributeRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAttributeRequest o) {
            catalogId(o.getCatalogId());
            dataAssetKey(o.getDataAssetKey());
            entityKey(o.getEntityKey());
            attributeKey(o.getAttributeKey());
            fields(o.getFields());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAttributeRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetAttributeRequest
         */
        public GetAttributeRequest build() {
            GetAttributeRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
