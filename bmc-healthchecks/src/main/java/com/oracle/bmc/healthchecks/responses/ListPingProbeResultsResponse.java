/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.responses;

import com.oracle.bmc.healthchecks.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListPingProbeResultsResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For pagination of a list of items. When paging through a list,
     * if this header appears in the response, then there may be
     * additional items still to get. Include this value as the `page`
     * parameter for the subsequent GET request. For information about
     * pagination, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#List_Pagination).
     *
     */
    private String opcNextPage;

    /**
     * A list of PingProbeResultSummary instances.
     */
    private java.util.List<PingProbeResultSummary> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListPingProbeResultsResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }
    }
}
