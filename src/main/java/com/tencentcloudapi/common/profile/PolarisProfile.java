/*
 * Copyright (c) 2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.tencentcloudapi.common.profile;

import com.tencent.polaris.api.config.Configuration;
import com.tencent.polaris.api.core.ConsumerAPI;
import com.tencent.polaris.api.exception.PolarisException;
import com.tencent.polaris.api.pojo.Instance;
import com.tencent.polaris.api.pojo.RetStatus;
import com.tencent.polaris.api.rpc.GetOneInstanceRequest;
import com.tencent.polaris.api.rpc.InstancesResponse;
import com.tencent.polaris.api.rpc.ServiceCallResult;
import com.tencent.polaris.factory.api.DiscoveryAPIFactory;


public class PolarisProfile {
    public static String ServiceNameMainland = "cloudapi-internal_cluster-mainland";
    public static String ServiceNameAsiaOther = "cloudapi-internal_cluster-asia-other";
    public static String ServiceNameWestern = "cloudapi-internal_cluster-western";

    private final ConsumerAPI consumerAPI;
    private String namespace;
    private String service;
    private long timeoutMs;

    public PolarisProfile(Configuration polarisConf, String namespace, String service, long timeoutMs) {
        this.consumerAPI = DiscoveryAPIFactory.createConsumerAPIByConfig(polarisConf);
        this.namespace = namespace;
        this.service = service;
        this.timeoutMs = timeoutMs;
    }

    public PolarisProfile(ConsumerAPI consumerAPI, String namespace, String service, long timeoutMs) {
        this.consumerAPI = consumerAPI;
        this.namespace = namespace;
        this.service = service;
        this.timeoutMs = timeoutMs;
    }

    public InstancesResponse getOneInstance() throws PolarisException {
        GetOneInstanceRequest req = new GetOneInstanceRequest();
        req.setNamespace(namespace);
        req.setService(service);
        req.setTimeoutMs(timeoutMs);

        return consumerAPI.getOneInstance(req);
    }

    /**
     * Reports the result of a service call back to Polaris for load balancing and health tracking.
     * This is a best-effort operation; any exception is silently ignored.
     *
     * @param instance The Polaris instance that was called.
     * @param success  true if the call succeeded (HTTP 200, no network error), false otherwise.
     */
    public void updateServiceCallResult(Instance instance, boolean success) {
        try {
            ServiceCallResult result = new ServiceCallResult();
            result.setInstance(instance);
            result.setRetStatus(success ? RetStatus.RetSuccess : RetStatus.RetFail);
            result.setRetCode(success ? 0 : -1);
            consumerAPI.updateServiceCallResult(result);
        } catch (Exception e) {
            // best-effort: ignore failures in result reporting
        }
    }

    protected void finalize() {
        // https://mk.woa.com/q/288263?from=iSearch
        // "ConsumerAPI的所有方法都是线程安全的，所以建议ConsumerAPI做成一个全局单例，最后进程退出前要调用一下destroy()方法"
        if (consumerAPI != null) {
            consumerAPI.destroy();
        }
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public long getTimeoutMs() {
        return timeoutMs;
    }

    public void setTimeoutMs(long timeoutMs) {
        this.timeoutMs = timeoutMs;
    }
}
