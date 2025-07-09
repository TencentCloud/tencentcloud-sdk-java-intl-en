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

public class DescribeTargetsRequest extends AbstractModel {

    /**
    * CLB instance ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * List of listener IDs (20 IDs at most).
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
    * Listener protocol type
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listener port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Conditions for querying the list of real servers bound to the CLB. The filter criteria are as follows:<li> location-id - String - Required: No - (Filter criterion) Filter by rule ID, such as loc-12345678.</li><li> private-ip-address - String - Required: No - (Filter criterion) Filter by private IP address of the real server, such as 172.16.1.1.</li><li> tag - String - Required: No - (Filter criterion) Filter by tag, such as tag-test.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get CLB instance ID. 
     * @return LoadBalancerId CLB instance ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID.
     * @param LoadBalancerId CLB instance ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get List of listener IDs (20 IDs at most). 
     * @return ListenerIds List of listener IDs (20 IDs at most).
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set List of listener IDs (20 IDs at most).
     * @param ListenerIds List of listener IDs (20 IDs at most).
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    /**
     * Get Listener protocol type 
     * @return Protocol Listener protocol type
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol type
     * @param Protocol Listener protocol type
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listener port 
     * @return Port Listener port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port
     * @param Port Listener port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Conditions for querying the list of real servers bound to the CLB. The filter criteria are as follows:<li> location-id - String - Required: No - (Filter criterion) Filter by rule ID, such as loc-12345678.</li><li> private-ip-address - String - Required: No - (Filter criterion) Filter by private IP address of the real server, such as 172.16.1.1.</li><li> tag - String - Required: No - (Filter criterion) Filter by tag, such as tag-test.</li> 
     * @return Filters Conditions for querying the list of real servers bound to the CLB. The filter criteria are as follows:<li> location-id - String - Required: No - (Filter criterion) Filter by rule ID, such as loc-12345678.</li><li> private-ip-address - String - Required: No - (Filter criterion) Filter by private IP address of the real server, such as 172.16.1.1.</li><li> tag - String - Required: No - (Filter criterion) Filter by tag, such as tag-test.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Conditions for querying the list of real servers bound to the CLB. The filter criteria are as follows:<li> location-id - String - Required: No - (Filter criterion) Filter by rule ID, such as loc-12345678.</li><li> private-ip-address - String - Required: No - (Filter criterion) Filter by private IP address of the real server, such as 172.16.1.1.</li><li> tag - String - Required: No - (Filter criterion) Filter by tag, such as tag-test.</li>
     * @param Filters Conditions for querying the list of real servers bound to the CLB. The filter criteria are as follows:<li> location-id - String - Required: No - (Filter criterion) Filter by rule ID, such as loc-12345678.</li><li> private-ip-address - String - Required: No - (Filter criterion) Filter by private IP address of the real server, such as 172.16.1.1.</li><li> tag - String - Required: No - (Filter criterion) Filter by tag, such as tag-test.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTargetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetsRequest(DescribeTargetsRequest source) {
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
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

