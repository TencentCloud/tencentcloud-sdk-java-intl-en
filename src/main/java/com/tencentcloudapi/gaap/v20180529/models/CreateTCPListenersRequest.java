/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTCPListenersRequest extends AbstractModel {

    /**
    * Listener name.
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * List of listener ports.
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * The strategy used by the listener to access the origin server. Values: `rr` (round-robin), `wrr` (weighted round-robin), `lc` (the least-connections strategy), `lrtt` (the least-response-time strategy).
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Whether origin server has the health check enabled. 1: enabled; 0: disabled. UDP listeners do not support health check.
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * The origin server type. Values: `IP` (IP address); `DOMAIN` (domain name).
    */
    @SerializedName("RealServerType")
    @Expose
    private String RealServerType;

    /**
    * Connection ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Connection group ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Time interval of origin server health check (unit: seconds). Value range: [5, 300].
    */
    @SerializedName("DelayLoop")
    @Expose
    private Long DelayLoop;

    /**
    * Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop.
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * List of origin server ports, which only supports the listeners of version 1.0 and connection group.
    */
    @SerializedName("RealServerPorts")
    @Expose
    private Long [] RealServerPorts;

    /**
    * Listener methods of getting client IPs. 0: TOA; 1: Proxy Protocol.
    */
    @SerializedName("ClientIPMethod")
    @Expose
    private Long ClientIPMethod;

    /**
    * Whether to enable the primary/secondary origin server mode. Valid values: 1 (enable) and 0 (disable). It cannot be enabled for domain name origin servers.
    */
    @SerializedName("FailoverSwitch")
    @Expose
    private Long FailoverSwitch;

    /**
    * Healthy threshold. The number of consecutive successful health checks required before considering an origin server healthy. Value range: 1 - 10.
    */
    @SerializedName("HealthyThreshold")
    @Expose
    private Long HealthyThreshold;

    /**
    * Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10.
    */
    @SerializedName("UnhealthyThreshold")
    @Expose
    private Long UnhealthyThreshold;

    /**
     * Get Listener name. 
     * @return ListenerName Listener name.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name.
     * @param ListenerName Listener name.
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get List of listener ports. 
     * @return Ports List of listener ports.
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set List of listener ports.
     * @param Ports List of listener ports.
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get The strategy used by the listener to access the origin server. Values: `rr` (round-robin), `wrr` (weighted round-robin), `lc` (the least-connections strategy), `lrtt` (the least-response-time strategy). 
     * @return Scheduler The strategy used by the listener to access the origin server. Values: `rr` (round-robin), `wrr` (weighted round-robin), `lc` (the least-connections strategy), `lrtt` (the least-response-time strategy).
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set The strategy used by the listener to access the origin server. Values: `rr` (round-robin), `wrr` (weighted round-robin), `lc` (the least-connections strategy), `lrtt` (the least-response-time strategy).
     * @param Scheduler The strategy used by the listener to access the origin server. Values: `rr` (round-robin), `wrr` (weighted round-robin), `lc` (the least-connections strategy), `lrtt` (the least-response-time strategy).
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Whether origin server has the health check enabled. 1: enabled; 0: disabled. UDP listeners do not support health check. 
     * @return HealthCheck Whether origin server has the health check enabled. 1: enabled; 0: disabled. UDP listeners do not support health check.
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Whether origin server has the health check enabled. 1: enabled; 0: disabled. UDP listeners do not support health check.
     * @param HealthCheck Whether origin server has the health check enabled. 1: enabled; 0: disabled. UDP listeners do not support health check.
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get The origin server type. Values: `IP` (IP address); `DOMAIN` (domain name). 
     * @return RealServerType The origin server type. Values: `IP` (IP address); `DOMAIN` (domain name).
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * Set The origin server type. Values: `IP` (IP address); `DOMAIN` (domain name).
     * @param RealServerType The origin server type. Values: `IP` (IP address); `DOMAIN` (domain name).
     */
    public void setRealServerType(String RealServerType) {
        this.RealServerType = RealServerType;
    }

    /**
     * Get Connection ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both. 
     * @return ProxyId Connection ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
     * @param ProxyId Connection ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Connection group ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both. 
     * @return GroupId Connection group ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
     * @param GroupId Connection group ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Time interval of origin server health check (unit: seconds). Value range: [5, 300]. 
     * @return DelayLoop Time interval of origin server health check (unit: seconds). Value range: [5, 300].
     */
    public Long getDelayLoop() {
        return this.DelayLoop;
    }

    /**
     * Set Time interval of origin server health check (unit: seconds). Value range: [5, 300].
     * @param DelayLoop Time interval of origin server health check (unit: seconds). Value range: [5, 300].
     */
    public void setDelayLoop(Long DelayLoop) {
        this.DelayLoop = DelayLoop;
    }

    /**
     * Get Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop. 
     * @return ConnectTimeout Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop.
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop.
     * @param ConnectTimeout Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop.
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get List of origin server ports, which only supports the listeners of version 1.0 and connection group. 
     * @return RealServerPorts List of origin server ports, which only supports the listeners of version 1.0 and connection group.
     */
    public Long [] getRealServerPorts() {
        return this.RealServerPorts;
    }

    /**
     * Set List of origin server ports, which only supports the listeners of version 1.0 and connection group.
     * @param RealServerPorts List of origin server ports, which only supports the listeners of version 1.0 and connection group.
     */
    public void setRealServerPorts(Long [] RealServerPorts) {
        this.RealServerPorts = RealServerPorts;
    }

    /**
     * Get Listener methods of getting client IPs. 0: TOA; 1: Proxy Protocol. 
     * @return ClientIPMethod Listener methods of getting client IPs. 0: TOA; 1: Proxy Protocol.
     */
    public Long getClientIPMethod() {
        return this.ClientIPMethod;
    }

    /**
     * Set Listener methods of getting client IPs. 0: TOA; 1: Proxy Protocol.
     * @param ClientIPMethod Listener methods of getting client IPs. 0: TOA; 1: Proxy Protocol.
     */
    public void setClientIPMethod(Long ClientIPMethod) {
        this.ClientIPMethod = ClientIPMethod;
    }

    /**
     * Get Whether to enable the primary/secondary origin server mode. Valid values: 1 (enable) and 0 (disable). It cannot be enabled for domain name origin servers. 
     * @return FailoverSwitch Whether to enable the primary/secondary origin server mode. Valid values: 1 (enable) and 0 (disable). It cannot be enabled for domain name origin servers.
     */
    public Long getFailoverSwitch() {
        return this.FailoverSwitch;
    }

    /**
     * Set Whether to enable the primary/secondary origin server mode. Valid values: 1 (enable) and 0 (disable). It cannot be enabled for domain name origin servers.
     * @param FailoverSwitch Whether to enable the primary/secondary origin server mode. Valid values: 1 (enable) and 0 (disable). It cannot be enabled for domain name origin servers.
     */
    public void setFailoverSwitch(Long FailoverSwitch) {
        this.FailoverSwitch = FailoverSwitch;
    }

    /**
     * Get Healthy threshold. The number of consecutive successful health checks required before considering an origin server healthy. Value range: 1 - 10. 
     * @return HealthyThreshold Healthy threshold. The number of consecutive successful health checks required before considering an origin server healthy. Value range: 1 - 10.
     */
    public Long getHealthyThreshold() {
        return this.HealthyThreshold;
    }

    /**
     * Set Healthy threshold. The number of consecutive successful health checks required before considering an origin server healthy. Value range: 1 - 10.
     * @param HealthyThreshold Healthy threshold. The number of consecutive successful health checks required before considering an origin server healthy. Value range: 1 - 10.
     */
    public void setHealthyThreshold(Long HealthyThreshold) {
        this.HealthyThreshold = HealthyThreshold;
    }

    /**
     * Get Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10. 
     * @return UnhealthyThreshold Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10.
     */
    public Long getUnhealthyThreshold() {
        return this.UnhealthyThreshold;
    }

    /**
     * Set Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10.
     * @param UnhealthyThreshold Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10.
     */
    public void setUnhealthyThreshold(Long UnhealthyThreshold) {
        this.UnhealthyThreshold = UnhealthyThreshold;
    }

    public CreateTCPListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTCPListenersRequest(CreateTCPListenersRequest source) {
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Ports != null) {
            this.Ports = new Long[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new Long(source.Ports[i]);
            }
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new Long(source.HealthCheck);
        }
        if (source.RealServerType != null) {
            this.RealServerType = new String(source.RealServerType);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.DelayLoop != null) {
            this.DelayLoop = new Long(source.DelayLoop);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.RealServerPorts != null) {
            this.RealServerPorts = new Long[source.RealServerPorts.length];
            for (int i = 0; i < source.RealServerPorts.length; i++) {
                this.RealServerPorts[i] = new Long(source.RealServerPorts[i]);
            }
        }
        if (source.ClientIPMethod != null) {
            this.ClientIPMethod = new Long(source.ClientIPMethod);
        }
        if (source.FailoverSwitch != null) {
            this.FailoverSwitch = new Long(source.FailoverSwitch);
        }
        if (source.HealthyThreshold != null) {
            this.HealthyThreshold = new Long(source.HealthyThreshold);
        }
        if (source.UnhealthyThreshold != null) {
            this.UnhealthyThreshold = new Long(source.UnhealthyThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "DelayLoop", this.DelayLoop);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamArraySimple(map, prefix + "RealServerPorts.", this.RealServerPorts);
        this.setParamSimple(map, prefix + "ClientIPMethod", this.ClientIPMethod);
        this.setParamSimple(map, prefix + "FailoverSwitch", this.FailoverSwitch);
        this.setParamSimple(map, prefix + "HealthyThreshold", this.HealthyThreshold);
        this.setParamSimple(map, prefix + "UnhealthyThreshold", this.UnhealthyThreshold);

    }
}

