/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway;

import com.oracle.bmc.apigateway.requests.*;
import com.oracle.bmc.apigateway.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ApiGateway where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to as ResponseIterators, and the methods are suffixed with ResponseIterator. For example: <i>listUsersResponseIterator</i></li>
 *   <li>Iterating over the resources/records being listed. These are referred to as RecordIterators, and the methods are suffixed with RecordIterator. For example: <i>listUsersRecordIterator</i></li>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping and using the page tokens.
 * They will automatically fetch more data from the service when required.
 *
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Iterable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.RequiredArgsConstructor
public class ApiGatewayPaginators {
    private final ApiGateway client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listApis operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListApisResponse> listApisResponseIterator(final ListApisRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApisRequest.Builder, ListApisRequest, ListApisResponse>(
                new com.google.common.base.Supplier<ListApisRequest.Builder>() {
                    @Override
                    public ListApisRequest.Builder get() {
                        return ListApisRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListApisResponse, String>() {
                    @Override
                    public String apply(ListApisResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApisRequest.Builder>,
                        ListApisRequest>() {
                    @Override
                    public ListApisRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApisRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListApisRequest, ListApisResponse>() {
                    @Override
                    public ListApisResponse apply(ListApisRequest request) {
                        return client.listApis(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.apigateway.model.ApiSummary} objects
     * contained in responses from the listApis operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.apigateway.model.ApiSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.apigateway.model.ApiSummary> listApisRecordIterator(
            final ListApisRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApisRequest.Builder, ListApisRequest, ListApisResponse,
                com.oracle.bmc.apigateway.model.ApiSummary>(
                new com.google.common.base.Supplier<ListApisRequest.Builder>() {
                    @Override
                    public ListApisRequest.Builder get() {
                        return ListApisRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListApisResponse, String>() {
                    @Override
                    public String apply(ListApisResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApisRequest.Builder>,
                        ListApisRequest>() {
                    @Override
                    public ListApisRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApisRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListApisRequest, ListApisResponse>() {
                    @Override
                    public ListApisResponse apply(ListApisRequest request) {
                        return client.listApis(request);
                    }
                },
                new com.google.common.base.Function<
                        ListApisResponse,
                        java.util.List<com.oracle.bmc.apigateway.model.ApiSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.apigateway.model.ApiSummary> apply(
                            ListApisResponse response) {
                        return response.getApiCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCertificates operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCertificatesResponse> listCertificatesResponseIterator(
            final ListCertificatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCertificatesRequest.Builder, ListCertificatesRequest, ListCertificatesResponse>(
                new com.google.common.base.Supplier<ListCertificatesRequest.Builder>() {
                    @Override
                    public ListCertificatesRequest.Builder get() {
                        return ListCertificatesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCertificatesResponse, String>() {
                    @Override
                    public String apply(ListCertificatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificatesRequest.Builder>,
                        ListCertificatesRequest>() {
                    @Override
                    public ListCertificatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificatesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListCertificatesRequest, ListCertificatesResponse>() {
                    @Override
                    public ListCertificatesResponse apply(ListCertificatesRequest request) {
                        return client.listCertificates(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.apigateway.model.CertificateSummary} objects
     * contained in responses from the listCertificates operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.apigateway.model.CertificateSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.apigateway.model.CertificateSummary>
            listCertificatesRecordIterator(final ListCertificatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCertificatesRequest.Builder, ListCertificatesRequest, ListCertificatesResponse,
                com.oracle.bmc.apigateway.model.CertificateSummary>(
                new com.google.common.base.Supplier<ListCertificatesRequest.Builder>() {
                    @Override
                    public ListCertificatesRequest.Builder get() {
                        return ListCertificatesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCertificatesResponse, String>() {
                    @Override
                    public String apply(ListCertificatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificatesRequest.Builder>,
                        ListCertificatesRequest>() {
                    @Override
                    public ListCertificatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificatesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListCertificatesRequest, ListCertificatesResponse>() {
                    @Override
                    public ListCertificatesResponse apply(ListCertificatesRequest request) {
                        return client.listCertificates(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCertificatesResponse,
                        java.util.List<com.oracle.bmc.apigateway.model.CertificateSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.apigateway.model.CertificateSummary> apply(
                            ListCertificatesResponse response) {
                        return response.getCertificateCollection().getItems();
                    }
                });
    }
}
