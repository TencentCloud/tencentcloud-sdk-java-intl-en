/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQServerlessInstanceResponse extends AbstractModel {

    /**
    * Cluster information.
    */
    @SerializedName("ClusterInfo")
    @Expose
    private RabbitMQClusterInfo ClusterInfo;

    /**
    * Specifies the cluster specification information.
    */
    @SerializedName("ClusterSpecInfo")
    @Expose
    private RabbitMQClusterSpecInfo ClusterSpecInfo;

    /**
    * Specifies the quota information of the vhost.
    */
    @SerializedName("VirtualHostQuota")
    @Expose
    private VirtualHostQuota VirtualHostQuota;

    /**
    * Specifies the exchange quota information.
    */
    @SerializedName("ExchangeQuota")
    @Expose
    private ExchangeQuota ExchangeQuota;

    /**
    * Specifies the quota information of the queue.
    */
    @SerializedName("QueueQuota")
    @Expose
    private QueueQuota QueueQuota;

    /**
    * Network information.
    */
    @SerializedName("ClusterNetInfo")
    @Expose
    private RabbitMQServerlessAccessInfo ClusterNetInfo;

    /**
    * Public network allowlist information.
    */
    @SerializedName("ClusterWhiteListInfo")
    @Expose
    private RabbitMQServerlessWhiteListInfo ClusterWhiteListInfo;

    /**
    * Specifies the quota information of the user.
    */
    @SerializedName("UserQuota")
    @Expose
    private UserQuota UserQuota;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Cluster information. 
     * @return ClusterInfo Cluster information.
     */
    public RabbitMQClusterInfo getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set Cluster information.
     * @param ClusterInfo Cluster information.
     */
    public void setClusterInfo(RabbitMQClusterInfo ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get Specifies the cluster specification information. 
     * @return ClusterSpecInfo Specifies the cluster specification information.
     */
    public RabbitMQClusterSpecInfo getClusterSpecInfo() {
        return this.ClusterSpecInfo;
    }

    /**
     * Set Specifies the cluster specification information.
     * @param ClusterSpecInfo Specifies the cluster specification information.
     */
    public void setClusterSpecInfo(RabbitMQClusterSpecInfo ClusterSpecInfo) {
        this.ClusterSpecInfo = ClusterSpecInfo;
    }

    /**
     * Get Specifies the quota information of the vhost. 
     * @return VirtualHostQuota Specifies the quota information of the vhost.
     */
    public VirtualHostQuota getVirtualHostQuota() {
        return this.VirtualHostQuota;
    }

    /**
     * Set Specifies the quota information of the vhost.
     * @param VirtualHostQuota Specifies the quota information of the vhost.
     */
    public void setVirtualHostQuota(VirtualHostQuota VirtualHostQuota) {
        this.VirtualHostQuota = VirtualHostQuota;
    }

    /**
     * Get Specifies the exchange quota information. 
     * @return ExchangeQuota Specifies the exchange quota information.
     */
    public ExchangeQuota getExchangeQuota() {
        return this.ExchangeQuota;
    }

    /**
     * Set Specifies the exchange quota information.
     * @param ExchangeQuota Specifies the exchange quota information.
     */
    public void setExchangeQuota(ExchangeQuota ExchangeQuota) {
        this.ExchangeQuota = ExchangeQuota;
    }

    /**
     * Get Specifies the quota information of the queue. 
     * @return QueueQuota Specifies the quota information of the queue.
     */
    public QueueQuota getQueueQuota() {
        return this.QueueQuota;
    }

    /**
     * Set Specifies the quota information of the queue.
     * @param QueueQuota Specifies the quota information of the queue.
     */
    public void setQueueQuota(QueueQuota QueueQuota) {
        this.QueueQuota = QueueQuota;
    }

    /**
     * Get Network information. 
     * @return ClusterNetInfo Network information.
     */
    public RabbitMQServerlessAccessInfo getClusterNetInfo() {
        return this.ClusterNetInfo;
    }

    /**
     * Set Network information.
     * @param ClusterNetInfo Network information.
     */
    public void setClusterNetInfo(RabbitMQServerlessAccessInfo ClusterNetInfo) {
        this.ClusterNetInfo = ClusterNetInfo;
    }

    /**
     * Get Public network allowlist information. 
     * @return ClusterWhiteListInfo Public network allowlist information.
     */
    public RabbitMQServerlessWhiteListInfo getClusterWhiteListInfo() {
        return this.ClusterWhiteListInfo;
    }

    /**
     * Set Public network allowlist information.
     * @param ClusterWhiteListInfo Public network allowlist information.
     */
    public void setClusterWhiteListInfo(RabbitMQServerlessWhiteListInfo ClusterWhiteListInfo) {
        this.ClusterWhiteListInfo = ClusterWhiteListInfo;
    }

    /**
     * Get Specifies the quota information of the user. 
     * @return UserQuota Specifies the quota information of the user.
     */
    public UserQuota getUserQuota() {
        return this.UserQuota;
    }

    /**
     * Set Specifies the quota information of the user.
     * @param UserQuota Specifies the quota information of the user.
     */
    public void setUserQuota(UserQuota UserQuota) {
        this.UserQuota = UserQuota;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRabbitMQServerlessInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQServerlessInstanceResponse(DescribeRabbitMQServerlessInstanceResponse source) {
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new RabbitMQClusterInfo(source.ClusterInfo);
        }
        if (source.ClusterSpecInfo != null) {
            this.ClusterSpecInfo = new RabbitMQClusterSpecInfo(source.ClusterSpecInfo);
        }
        if (source.VirtualHostQuota != null) {
            this.VirtualHostQuota = new VirtualHostQuota(source.VirtualHostQuota);
        }
        if (source.ExchangeQuota != null) {
            this.ExchangeQuota = new ExchangeQuota(source.ExchangeQuota);
        }
        if (source.QueueQuota != null) {
            this.QueueQuota = new QueueQuota(source.QueueQuota);
        }
        if (source.ClusterNetInfo != null) {
            this.ClusterNetInfo = new RabbitMQServerlessAccessInfo(source.ClusterNetInfo);
        }
        if (source.ClusterWhiteListInfo != null) {
            this.ClusterWhiteListInfo = new RabbitMQServerlessWhiteListInfo(source.ClusterWhiteListInfo);
        }
        if (source.UserQuota != null) {
            this.UserQuota = new UserQuota(source.UserQuota);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamObj(map, prefix + "ClusterSpecInfo.", this.ClusterSpecInfo);
        this.setParamObj(map, prefix + "VirtualHostQuota.", this.VirtualHostQuota);
        this.setParamObj(map, prefix + "ExchangeQuota.", this.ExchangeQuota);
        this.setParamObj(map, prefix + "QueueQuota.", this.QueueQuota);
        this.setParamObj(map, prefix + "ClusterNetInfo.", this.ClusterNetInfo);
        this.setParamObj(map, prefix + "ClusterWhiteListInfo.", this.ClusterWhiteListInfo);
        this.setParamObj(map, prefix + "UserQuota.", this.UserQuota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

