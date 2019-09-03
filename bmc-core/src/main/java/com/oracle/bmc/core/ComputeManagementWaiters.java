/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of ComputeManagement.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ComputeManagementWaiters {
    @lombok.NonNull private final java.util.concurrent.ExecutorService executorService;
    @lombok.NonNull private final ComputeManagement client;
    private final com.oracle.bmc.workrequests.WorkRequest workRequestClient;

    @Deprecated
    public ComputeManagementWaiters(
            @lombok.NonNull java.util.concurrent.ExecutorService executorService,
            @lombok.NonNull ComputeManagement client) {
        this(executorService, client, null);
    }

    public ComputeManagementWaiters(
            @lombok.NonNull java.util.concurrent.ExecutorService executorService,
            @lombok.NonNull ComputeManagement client,
            com.oracle.bmc.workrequests.WorkRequest workRequestClient) {
        this.executorService = executorService;
        this.client = client;
        this.workRequestClient = workRequestClient;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetClusterNetworkRequest, GetClusterNetworkResponse>
            forClusterNetwork(
                    GetClusterNetworkRequest request,
                    com.oracle.bmc.core.model.ClusterNetwork.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forClusterNetwork(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetClusterNetworkRequest, GetClusterNetworkResponse>
            forClusterNetwork(
                    GetClusterNetworkRequest request,
                    com.oracle.bmc.core.model.ClusterNetwork.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forClusterNetwork(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetClusterNetworkRequest, GetClusterNetworkResponse>
            forClusterNetwork(
                    GetClusterNetworkRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.ClusterNetwork.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forClusterNetwork(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ClusterNetwork.
    private com.oracle.bmc.waiter.Waiter<GetClusterNetworkRequest, GetClusterNetworkResponse>
            forClusterNetwork(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetClusterNetworkRequest request,
                    final com.oracle.bmc.core.model.ClusterNetwork.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.ClusterNetwork.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetClusterNetworkRequest, GetClusterNetworkResponse>() {
                            @Override
                            public GetClusterNetworkResponse apply(
                                    GetClusterNetworkRequest request) {
                                return client.getClusterNetwork(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetClusterNetworkResponse>() {
                            @Override
                            public boolean apply(GetClusterNetworkResponse response) {
                                return targetStatesSet.contains(
                                        response.getClusterNetwork().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.ClusterNetwork.LifecycleState
                                        .Terminated)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetInstancePoolRequest, GetInstancePoolResponse>
            forInstancePool(
                    GetInstancePoolRequest request,
                    com.oracle.bmc.core.model.InstancePool.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInstancePool(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetInstancePoolRequest, GetInstancePoolResponse>
            forInstancePool(
                    GetInstancePoolRequest request,
                    com.oracle.bmc.core.model.InstancePool.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forInstancePool(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetInstancePoolRequest, GetInstancePoolResponse>
            forInstancePool(
                    GetInstancePoolRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.InstancePool.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forInstancePool(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for InstancePool.
    private com.oracle.bmc.waiter.Waiter<GetInstancePoolRequest, GetInstancePoolResponse>
            forInstancePool(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetInstancePoolRequest request,
                    final com.oracle.bmc.core.model.InstancePool.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.InstancePool.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetInstancePoolRequest, GetInstancePoolResponse>() {
                            @Override
                            public GetInstancePoolResponse apply(GetInstancePoolRequest request) {
                                return client.getInstancePool(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetInstancePoolResponse>() {
                            @Override
                            public boolean apply(GetInstancePoolResponse response) {
                                return targetStatesSet.contains(
                                        response.getInstancePool().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.InstancePool.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetInstancePoolLoadBalancerAttachmentRequest,
                    GetInstancePoolLoadBalancerAttachmentResponse>
            forInstancePoolLoadBalancerAttachment(
                    GetInstancePoolLoadBalancerAttachmentRequest request,
                    com.oracle.bmc.core.model.InstancePoolLoadBalancerAttachment.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInstancePoolLoadBalancerAttachment(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetInstancePoolLoadBalancerAttachmentRequest,
                    GetInstancePoolLoadBalancerAttachmentResponse>
            forInstancePoolLoadBalancerAttachment(
                    GetInstancePoolLoadBalancerAttachmentRequest request,
                    com.oracle.bmc.core.model.InstancePoolLoadBalancerAttachment.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forInstancePoolLoadBalancerAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetInstancePoolLoadBalancerAttachmentRequest,
                    GetInstancePoolLoadBalancerAttachmentResponse>
            forInstancePoolLoadBalancerAttachment(
                    GetInstancePoolLoadBalancerAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.InstancePoolLoadBalancerAttachment.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forInstancePoolLoadBalancerAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for InstancePoolLoadBalancerAttachment.
    private com.oracle.bmc.waiter.Waiter<
                    GetInstancePoolLoadBalancerAttachmentRequest,
                    GetInstancePoolLoadBalancerAttachmentResponse>
            forInstancePoolLoadBalancerAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetInstancePoolLoadBalancerAttachmentRequest request,
                    final com.oracle.bmc.core.model.InstancePoolLoadBalancerAttachment
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.core.model.InstancePoolLoadBalancerAttachment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetInstancePoolLoadBalancerAttachmentRequest,
                                GetInstancePoolLoadBalancerAttachmentResponse>() {
                            @Override
                            public GetInstancePoolLoadBalancerAttachmentResponse apply(
                                    GetInstancePoolLoadBalancerAttachmentRequest request) {
                                return client.getInstancePoolLoadBalancerAttachment(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetInstancePoolLoadBalancerAttachmentResponse>() {
                            @Override
                            public boolean apply(
                                    GetInstancePoolLoadBalancerAttachmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getInstancePoolLoadBalancerAttachment()
                                                .getLifecycleState());
                            }
                        },
                        false),
                request);
    }
}
