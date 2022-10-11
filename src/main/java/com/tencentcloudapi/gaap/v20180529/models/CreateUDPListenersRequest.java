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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUDPListenersRequest extends AbstractModel{

    /**
    * Listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * List of listener ports
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
    * List of origin server ports, which only supports the listeners of version 1.0 and connection group.
    */
    @SerializedName("RealServerPorts")
    @Expose
    private Long [] RealServerPorts;

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
    * Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
    */
    @SerializedName("FailoverSwitch")
    @Expose
    private Long FailoverSwitch;

    /**
    * Whether the health check is enabled for the origin server. Values: `1` (enabled); `0` (disabled).
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * The health check type. Values: `PORT` (port); `PING` (ping).
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * The health probe port.
    */
    @SerializedName("CheckPort")
    @Expose
    private Long CheckPort;

    /**
    * The UDP message type. Values: `TEXT` (text). This parameter is used only when `CheckType = PORT`.
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * The UDP message sent by the health probe port. This parameter is used only when `CheckType = PORT`.
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * The UDP message received by the health probe port. This parameter is used only when `CheckType = PORT`.
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
     * Get Listener name 
     * @return ListenerName Listener name
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name
     * @param ListenerName Listener name
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get List of listener ports 
     * @return Ports List of listener ports
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set List of listener ports
     * @param Ports List of listener ports
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

    /**
     * Get Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`. 
     * @return FailoverSwitch Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
     */
    public Long getFailoverSwitch() {
        return this.FailoverSwitch;
    }

    /**
     * Set Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
     * @param FailoverSwitch Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
     */
    public void setFailoverSwitch(Long FailoverSwitch) {
        this.FailoverSwitch = FailoverSwitch;
    }

    /**
     * Get Whether the health check is enabled for the origin server. Values: `1` (enabled); `0` (disabled). 
     * @return HealthCheck Whether the health check is enabled for the origin server. Values: `1` (enabled); `0` (disabled).
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Whether the health check is enabled for the origin server. Values: `1` (enabled); `0` (disabled).
     * @param HealthCheck Whether the health check is enabled for the origin server. Values: `1` (enabled); `0` (disabled).
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get The health check type. Values: `PORT` (port); `PING` (ping). 
     * @return CheckType The health check type. Values: `PORT` (port); `PING` (ping).
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set The health check type. Values: `PORT` (port); `PING` (ping).
     * @param CheckType The health check type. Values: `PORT` (port); `PING` (ping).
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get The health probe port. 
     * @return CheckPort The health probe port.
     */
    public Long getCheckPort() {
        return this.CheckPort;
    }

    /**
     * Set The health probe port.
     * @param CheckPort The health probe port.
     */
    public void setCheckPort(Long CheckPort) {
        this.CheckPort = CheckPort;
    }

    /**
     * Get The UDP message type. Values: `TEXT` (text). This parameter is used only when `CheckType = PORT`. 
     * @return ContextType The UDP message type. Values: `TEXT` (text). This parameter is used only when `CheckType = PORT`.
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set The UDP message type. Values: `TEXT` (text). This parameter is used only when `CheckType = PORT`.
     * @param ContextType The UDP message type. Values: `TEXT` (text). This parameter is used only when `CheckType = PORT`.
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get The UDP message sent by the health probe port. This parameter is used only when `CheckType = PORT`. 
     * @return SendContext The UDP message sent by the health probe port. This parameter is used only when `CheckType = PORT`.
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set The UDP message sent by the health probe port. This parameter is used only when `CheckType = PORT`.
     * @param SendContext The UDP message sent by the health probe port. This parameter is used only when `CheckType = PORT`.
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get The UDP message received by the health probe port. This parameter is used only when `CheckType = PORT`. 
     * @return RecvContext The UDP message received by the health probe port. This parameter is used only when `CheckType = PORT`.
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set The UDP message received by the health probe port. This parameter is used only when `CheckType = PORT`.
     * @param RecvContext The UDP message received by the health probe port. This parameter is used only when `CheckType = PORT`.
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    public CreateUDPListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUDPListenersRequest(CreateUDPListenersRequest source) {
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
        if (source.RealServerType != null) {
            this.RealServerType = new String(source.RealServerType);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.RealServerPorts != null) {
            this.RealServerPorts = new Long[source.RealServerPorts.length];
            for (int i = 0; i < source.RealServerPorts.length; i++) {
                this.RealServerPorts[i] = new Long(source.RealServerPorts[i]);
            }
        }
        if (source.DelayLoop != null) {
            this.DelayLoop = new Long(source.DelayLoop);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.HealthyThreshold != null) {
            this.HealthyThreshold = new Long(source.HealthyThreshold);
        }
        if (source.UnhealthyThreshold != null) {
            this.UnhealthyThreshold = new Long(source.UnhealthyThreshold);
        }
        if (source.FailoverSwitch != null) {
            this.FailoverSwitch = new Long(source.FailoverSwitch);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new Long(source.HealthCheck);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.CheckPort != null) {
            this.CheckPort = new Long(source.CheckPort);
        }
        if (source.ContextType != null) {
            this.ContextType = new String(source.ContextType);
        }
        if (source.SendContext != null) {
            this.SendContext = new String(source.SendContext);
        }
        if (source.RecvContext != null) {
            this.RecvContext = new String(source.RecvContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "RealServerPorts.", this.RealServerPorts);
        this.setParamSimple(map, prefix + "DelayLoop", this.DelayLoop);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "HealthyThreshold", this.HealthyThreshold);
        this.setParamSimple(map, prefix + "UnhealthyThreshold", this.UnhealthyThreshold);
        this.setParamSimple(map, prefix + "FailoverSwitch", this.FailoverSwitch);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "CheckPort", this.CheckPort);
        this.setParamSimple(map, prefix + "ContextType", this.ContextType);
        this.setParamSimple(map, prefix + "SendContext", this.SendContext);
        this.setParamSimple(map, prefix + "RecvContext", this.RecvContext);

    }
}

