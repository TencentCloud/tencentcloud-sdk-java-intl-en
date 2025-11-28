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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListenersRequest extends AbstractModel {

    /**
    * ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/api/214/30685?from_cn_redirect=1) api to obtain the ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Specifies the array of clb listener ids to query, with a maximum of 100. you can call the [DescribeListeners](https://www.tencentcloud.comom/document/api/214/30686?from_cn_redirect=1) api to obtain the ids.
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
    * Type of the listener protocols to be queried. Values: TCP`, `UDP`, `HTTP`, `HTTPS`, `TCP_SSL` and `QUIC`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Port of listener to query. value range: 1-65535.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/api/214/30685?from_cn_redirect=1) api to obtain the ID. 
     * @return LoadBalancerId ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/api/214/30685?from_cn_redirect=1) api to obtain the ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/api/214/30685?from_cn_redirect=1) api to obtain the ID.
     * @param LoadBalancerId ID of the cloud load balancer instance. you can call the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/api/214/30685?from_cn_redirect=1) api to obtain the ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Specifies the array of clb listener ids to query, with a maximum of 100. you can call the [DescribeListeners](https://www.tencentcloud.comom/document/api/214/30686?from_cn_redirect=1) api to obtain the ids. 
     * @return ListenerIds Specifies the array of clb listener ids to query, with a maximum of 100. you can call the [DescribeListeners](https://www.tencentcloud.comom/document/api/214/30686?from_cn_redirect=1) api to obtain the ids.
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set Specifies the array of clb listener ids to query, with a maximum of 100. you can call the [DescribeListeners](https://www.tencentcloud.comom/document/api/214/30686?from_cn_redirect=1) api to obtain the ids.
     * @param ListenerIds Specifies the array of clb listener ids to query, with a maximum of 100. you can call the [DescribeListeners](https://www.tencentcloud.comom/document/api/214/30686?from_cn_redirect=1) api to obtain the ids.
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    /**
     * Get Type of the listener protocols to be queried. Values: TCP`, `UDP`, `HTTP`, `HTTPS`, `TCP_SSL` and `QUIC`. 
     * @return Protocol Type of the listener protocols to be queried. Values: TCP`, `UDP`, `HTTP`, `HTTPS`, `TCP_SSL` and `QUIC`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Type of the listener protocols to be queried. Values: TCP`, `UDP`, `HTTP`, `HTTPS`, `TCP_SSL` and `QUIC`.
     * @param Protocol Type of the listener protocols to be queried. Values: TCP`, `UDP`, `HTTP`, `HTTPS`, `TCP_SSL` and `QUIC`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Port of listener to query. value range: 1-65535. 
     * @return Port Port of listener to query. value range: 1-65535.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port of listener to query. value range: 1-65535.
     * @param Port Port of listener to query. value range: 1-65535.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public DescribeListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListenersRequest(DescribeListenersRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerIds != null) {
            this.ListenerIds = new String[source.ListenerIds.length];
            for (int i = 0; i < source.ListenerIds.length; i++) {
                this.ListenerIds[i] = new String(source.ListenerIds[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

