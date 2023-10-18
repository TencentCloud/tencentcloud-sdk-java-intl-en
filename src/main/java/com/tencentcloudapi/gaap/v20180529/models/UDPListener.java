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

public class UDPListener extends AbstractModel {

    /**
    * Listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Origin server port, which is only valid for the connections or connection groups of version 1.0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealServerPort")
    @Expose
    private Long RealServerPort;

    /**
    * Type of the origin server bound to listeners
    */
    @SerializedName("RealServerType")
    @Expose
    private String RealServerType;

    /**
    * Listener protocol: UDP.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listener status:
`0`: Running
`1`: Creating
`2`: Terminating
`3`: Adjusting origin server
`4`: Adjusting configuration
    */
    @SerializedName("ListenerStatus")
    @Expose
    private Long ListenerStatus;

    /**
    * The strategy used by the listener to access the origin server. Values: `rr` (round-robin), `wrr` (weighted round-robin), `lc` (the least-connections strategy), `lrtt` (the least-response-time strategy).
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Origin server binding status of listeners. `0`: Normal; `1`: IP exception; `2`: Domain name resolution exception.
    */
    @SerializedName("BindStatus")
    @Expose
    private Long BindStatus;

    /**
    * Information of the origin server bound to listeners
    */
    @SerializedName("RealServerSet")
    @Expose
    private BindRealServer [] RealServerSet;

    /**
    * Listener creation time in the format of UNIX timestamp
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Specifies whether to enable session persistence. Values: `0` (disable), `1` (enable)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionPersist")
    @Expose
    private Long SessionPersist;

    /**
    * Time interval of origin server health check (unit: seconds). Value range: [5, 300].
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DelayLoop")
    @Expose
    private Long DelayLoop;

    /**
    * Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * Healthy threshold. The number of consecutive successful health checks required before considering an origin server healthy. Value range: 1 - 10.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthyThreshold")
    @Expose
    private Long HealthyThreshold;

    /**
    * Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UnhealthyThreshold")
    @Expose
    private Long UnhealthyThreshold;

    /**
    * Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FailoverSwitch")
    @Expose
    private Long FailoverSwitch;

    /**
    * Whether the health check is enabled for the origin server. Values: `1` (enabled); `0` (disabled).
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * The health check type. Values: `PORT` (port); `PING` (ping).
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * The health probe port.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CheckPort")
    @Expose
    private Long CheckPort;

    /**
    * The UDP message type. Values: `TEXT` (text). This parameter is used only when `CheckType = PORT`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * The UDP message sent by the health probe port. This parameter is used only when `CheckType = PORT`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * The UDP message received by the health probe port. This parameter is used only when `CheckType = PORT`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
    * Connection ID of the listener. A null value is returned if the listener is associated with the connection group.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Connection group ID of the listener. A null value is returned if the listener is associated with a specific connection.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get Listener ID 
     * @return ListenerId Listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID
     * @param ListenerId Listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

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
     * Get Origin server port, which is only valid for the connections or connection groups of version 1.0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealServerPort Origin server port, which is only valid for the connections or connection groups of version 1.0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRealServerPort() {
        return this.RealServerPort;
    }

    /**
     * Set Origin server port, which is only valid for the connections or connection groups of version 1.0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealServerPort Origin server port, which is only valid for the connections or connection groups of version 1.0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealServerPort(Long RealServerPort) {
        this.RealServerPort = RealServerPort;
    }

    /**
     * Get Type of the origin server bound to listeners 
     * @return RealServerType Type of the origin server bound to listeners
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * Set Type of the origin server bound to listeners
     * @param RealServerType Type of the origin server bound to listeners
     */
    public void setRealServerType(String RealServerType) {
        this.RealServerType = RealServerType;
    }

    /**
     * Get Listener protocol: UDP. 
     * @return Protocol Listener protocol: UDP.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol: UDP.
     * @param Protocol Listener protocol: UDP.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listener status:
`0`: Running
`1`: Creating
`2`: Terminating
`3`: Adjusting origin server
`4`: Adjusting configuration 
     * @return ListenerStatus Listener status:
`0`: Running
`1`: Creating
`2`: Terminating
`3`: Adjusting origin server
`4`: Adjusting configuration
     */
    public Long getListenerStatus() {
        return this.ListenerStatus;
    }

    /**
     * Set Listener status:
`0`: Running
`1`: Creating
`2`: Terminating
`3`: Adjusting origin server
`4`: Adjusting configuration
     * @param ListenerStatus Listener status:
`0`: Running
`1`: Creating
`2`: Terminating
`3`: Adjusting origin server
`4`: Adjusting configuration
     */
    public void setListenerStatus(Long ListenerStatus) {
        this.ListenerStatus = ListenerStatus;
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
     * Get Origin server binding status of listeners. `0`: Normal; `1`: IP exception; `2`: Domain name resolution exception. 
     * @return BindStatus Origin server binding status of listeners. `0`: Normal; `1`: IP exception; `2`: Domain name resolution exception.
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set Origin server binding status of listeners. `0`: Normal; `1`: IP exception; `2`: Domain name resolution exception.
     * @param BindStatus Origin server binding status of listeners. `0`: Normal; `1`: IP exception; `2`: Domain name resolution exception.
     */
    public void setBindStatus(Long BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get Information of the origin server bound to listeners 
     * @return RealServerSet Information of the origin server bound to listeners
     */
    public BindRealServer [] getRealServerSet() {
        return this.RealServerSet;
    }

    /**
     * Set Information of the origin server bound to listeners
     * @param RealServerSet Information of the origin server bound to listeners
     */
    public void setRealServerSet(BindRealServer [] RealServerSet) {
        this.RealServerSet = RealServerSet;
    }

    /**
     * Get Listener creation time in the format of UNIX timestamp 
     * @return CreateTime Listener creation time in the format of UNIX timestamp
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Listener creation time in the format of UNIX timestamp
     * @param CreateTime Listener creation time in the format of UNIX timestamp
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Specifies whether to enable session persistence. Values: `0` (disable), `1` (enable)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SessionPersist Specifies whether to enable session persistence. Values: `0` (disable), `1` (enable)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set Specifies whether to enable session persistence. Values: `0` (disable), `1` (enable)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SessionPersist Specifies whether to enable session persistence. Values: `0` (disable), `1` (enable)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionPersist(Long SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get Time interval of origin server health check (unit: seconds). Value range: [5, 300].
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DelayLoop Time interval of origin server health check (unit: seconds). Value range: [5, 300].
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getDelayLoop() {
        return this.DelayLoop;
    }

    /**
     * Set Time interval of origin server health check (unit: seconds). Value range: [5, 300].
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DelayLoop Time interval of origin server health check (unit: seconds). Value range: [5, 300].
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDelayLoop(Long DelayLoop) {
        this.DelayLoop = DelayLoop;
    }

    /**
     * Get Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ConnectTimeout Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ConnectTimeout Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get Healthy threshold. The number of consecutive successful health checks required before considering an origin server healthy. Value range: 1 - 10.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HealthyThreshold Healthy threshold. The number of consecutive successful health checks required before considering an origin server healthy. Value range: 1 - 10.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHealthyThreshold() {
        return this.HealthyThreshold;
    }

    /**
     * Set Healthy threshold. The number of consecutive successful health checks required before considering an origin server healthy. Value range: 1 - 10.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HealthyThreshold Healthy threshold. The number of consecutive successful health checks required before considering an origin server healthy. Value range: 1 - 10.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthyThreshold(Long HealthyThreshold) {
        this.HealthyThreshold = HealthyThreshold;
    }

    /**
     * Get Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UnhealthyThreshold Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getUnhealthyThreshold() {
        return this.UnhealthyThreshold;
    }

    /**
     * Set Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UnhealthyThreshold Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUnhealthyThreshold(Long UnhealthyThreshold) {
        this.UnhealthyThreshold = UnhealthyThreshold;
    }

    /**
     * Get Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FailoverSwitch Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getFailoverSwitch() {
        return this.FailoverSwitch;
    }

    /**
     * Set Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FailoverSwitch Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFailoverSwitch(Long FailoverSwitch) {
        this.FailoverSwitch = FailoverSwitch;
    }

    /**
     * Get Whether the health check is enabled for the origin server. Values: `1` (enabled); `0` (disabled).
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return HealthCheck Whether the health check is enabled for the origin server. Values: `1` (enabled); `0` (disabled).
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Whether the health check is enabled for the origin server. Values: `1` (enabled); `0` (disabled).
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param HealthCheck Whether the health check is enabled for the origin server. Values: `1` (enabled); `0` (disabled).
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get The health check type. Values: `PORT` (port); `PING` (ping).
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CheckType The health check type. Values: `PORT` (port); `PING` (ping).
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set The health check type. Values: `PORT` (port); `PING` (ping).
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CheckType The health check type. Values: `PORT` (port); `PING` (ping).
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get The health probe port.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CheckPort The health probe port.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getCheckPort() {
        return this.CheckPort;
    }

    /**
     * Set The health probe port.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CheckPort The health probe port.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCheckPort(Long CheckPort) {
        this.CheckPort = CheckPort;
    }

    /**
     * Get The UDP message type. Values: `TEXT` (text). This parameter is used only when `CheckType = PORT`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ContextType The UDP message type. Values: `TEXT` (text). This parameter is used only when `CheckType = PORT`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set The UDP message type. Values: `TEXT` (text). This parameter is used only when `CheckType = PORT`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ContextType The UDP message type. Values: `TEXT` (text). This parameter is used only when `CheckType = PORT`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get The UDP message sent by the health probe port. This parameter is used only when `CheckType = PORT`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SendContext The UDP message sent by the health probe port. This parameter is used only when `CheckType = PORT`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set The UDP message sent by the health probe port. This parameter is used only when `CheckType = PORT`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SendContext The UDP message sent by the health probe port. This parameter is used only when `CheckType = PORT`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get The UDP message received by the health probe port. This parameter is used only when `CheckType = PORT`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecvContext The UDP message received by the health probe port. This parameter is used only when `CheckType = PORT`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set The UDP message received by the health probe port. This parameter is used only when `CheckType = PORT`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecvContext The UDP message received by the health probe port. This parameter is used only when `CheckType = PORT`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    /**
     * Get Connection ID of the listener. A null value is returned if the listener is associated with the connection group.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ProxyId Connection ID of the listener. A null value is returned if the listener is associated with the connection group.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection ID of the listener. A null value is returned if the listener is associated with the connection group.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ProxyId Connection ID of the listener. A null value is returned if the listener is associated with the connection group.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Connection group ID of the listener. A null value is returned if the listener is associated with a specific connection.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return GroupId Connection group ID of the listener. A null value is returned if the listener is associated with a specific connection.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID of the listener. A null value is returned if the listener is associated with a specific connection.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param GroupId Connection group ID of the listener. A null value is returned if the listener is associated with a specific connection.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public UDPListener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UDPListener(UDPListener source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.RealServerPort != null) {
            this.RealServerPort = new Long(source.RealServerPort);
        }
        if (source.RealServerType != null) {
            this.RealServerType = new String(source.RealServerType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ListenerStatus != null) {
            this.ListenerStatus = new Long(source.ListenerStatus);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new Long(source.BindStatus);
        }
        if (source.RealServerSet != null) {
            this.RealServerSet = new BindRealServer[source.RealServerSet.length];
            for (int i = 0; i < source.RealServerSet.length; i++) {
                this.RealServerSet[i] = new BindRealServer(source.RealServerSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new Long(source.SessionPersist);
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
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "RealServerPort", this.RealServerPort);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ListenerStatus", this.ListenerStatus);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamArrayObj(map, prefix + "RealServerSet.", this.RealServerSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
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
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

