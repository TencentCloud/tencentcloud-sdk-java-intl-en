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

public class TCPListener extends AbstractModel{

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
    * Origin server port, which is only valid for the connections of version 1.0.
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
    * Listener protocol: TCP.
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
    * Response timeout of origin server health check (unit: seconds).
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * Time interval of origin server health check (unit: seconds).
    */
    @SerializedName("DelayLoop")
    @Expose
    private Long DelayLoop;

    /**
    * Whether to enable the listener health check:
`0`: Disable
`1`: Enable
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * Status of the origin server bound to listeners:
`0`: Abnormal
`1`: Normal
    */
    @SerializedName("BindStatus")
    @Expose
    private Long BindStatus;

    /**
    * Information of the origin server bound to listeners
Note: This field may return null, indicating that no valid values can be obtained.
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
    * Describes how the listener obtains client IPs. `0`: TOA; `1`: Proxy Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientIPMethod")
    @Expose
    private Long ClientIPMethod;

    /**
    * Healthy threshold. The number of consecutive successful health checks required before considering an origin server healthy. Value range: 1 - 10.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthyThreshold")
    @Expose
    private Long HealthyThreshold;

    /**
    * Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnhealthyThreshold")
    @Expose
    private Long UnhealthyThreshold;

    /**
    * Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailoverSwitch")
    @Expose
    private Long FailoverSwitch;

    /**
    * Specifies whether to enable session persistence. Values: `0` (disable), `1` (enable)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionPersist")
    @Expose
    private Long SessionPersist;

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
     * Get Origin server port, which is only valid for the connections of version 1.0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealServerPort Origin server port, which is only valid for the connections of version 1.0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRealServerPort() {
        return this.RealServerPort;
    }

    /**
     * Set Origin server port, which is only valid for the connections of version 1.0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealServerPort Origin server port, which is only valid for the connections of version 1.0.
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
     * Get Listener protocol: TCP. 
     * @return Protocol Listener protocol: TCP.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol: TCP.
     * @param Protocol Listener protocol: TCP.
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
     * Get Response timeout of origin server health check (unit: seconds). 
     * @return ConnectTimeout Response timeout of origin server health check (unit: seconds).
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set Response timeout of origin server health check (unit: seconds).
     * @param ConnectTimeout Response timeout of origin server health check (unit: seconds).
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get Time interval of origin server health check (unit: seconds). 
     * @return DelayLoop Time interval of origin server health check (unit: seconds).
     */
    public Long getDelayLoop() {
        return this.DelayLoop;
    }

    /**
     * Set Time interval of origin server health check (unit: seconds).
     * @param DelayLoop Time interval of origin server health check (unit: seconds).
     */
    public void setDelayLoop(Long DelayLoop) {
        this.DelayLoop = DelayLoop;
    }

    /**
     * Get Whether to enable the listener health check:
`0`: Disable
`1`: Enable 
     * @return HealthCheck Whether to enable the listener health check:
`0`: Disable
`1`: Enable
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Whether to enable the listener health check:
`0`: Disable
`1`: Enable
     * @param HealthCheck Whether to enable the listener health check:
`0`: Disable
`1`: Enable
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Status of the origin server bound to listeners:
`0`: Abnormal
`1`: Normal 
     * @return BindStatus Status of the origin server bound to listeners:
`0`: Abnormal
`1`: Normal
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set Status of the origin server bound to listeners:
`0`: Abnormal
`1`: Normal
     * @param BindStatus Status of the origin server bound to listeners:
`0`: Abnormal
`1`: Normal
     */
    public void setBindStatus(Long BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get Information of the origin server bound to listeners
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealServerSet Information of the origin server bound to listeners
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BindRealServer [] getRealServerSet() {
        return this.RealServerSet;
    }

    /**
     * Set Information of the origin server bound to listeners
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealServerSet Information of the origin server bound to listeners
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Describes how the listener obtains client IPs. `0`: TOA; `1`: Proxy Protocol.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientIPMethod Describes how the listener obtains client IPs. `0`: TOA; `1`: Proxy Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getClientIPMethod() {
        return this.ClientIPMethod;
    }

    /**
     * Set Describes how the listener obtains client IPs. `0`: TOA; `1`: Proxy Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientIPMethod Describes how the listener obtains client IPs. `0`: TOA; `1`: Proxy Protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientIPMethod(Long ClientIPMethod) {
        this.ClientIPMethod = ClientIPMethod;
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnhealthyThreshold Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUnhealthyThreshold() {
        return this.UnhealthyThreshold;
    }

    /**
     * Set Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnhealthyThreshold Unhealthy threshold. The number of consecutive failed health checks required before considering an origin server unhealthy. Value range: 1 - 10.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnhealthyThreshold(Long UnhealthyThreshold) {
        this.UnhealthyThreshold = UnhealthyThreshold;
    }

    /**
     * Get Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailoverSwitch Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFailoverSwitch() {
        return this.FailoverSwitch;
    }

    /**
     * Set Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailoverSwitch Whether to enable the primary/secondary origin server mode for failover. Values: `1` (enabled); `0` (disabled). It’s not available if the origin type is `DOMAIN`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailoverSwitch(Long FailoverSwitch) {
        this.FailoverSwitch = FailoverSwitch;
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

    public TCPListener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCPListener(TCPListener source) {
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
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.DelayLoop != null) {
            this.DelayLoop = new Long(source.DelayLoop);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new Long(source.HealthCheck);
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
        if (source.ClientIPMethod != null) {
            this.ClientIPMethod = new Long(source.ClientIPMethod);
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
        if (source.SessionPersist != null) {
            this.SessionPersist = new Long(source.SessionPersist);
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
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "DelayLoop", this.DelayLoop);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamArrayObj(map, prefix + "RealServerSet.", this.RealServerSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ClientIPMethod", this.ClientIPMethod);
        this.setParamSimple(map, prefix + "HealthyThreshold", this.HealthyThreshold);
        this.setParamSimple(map, prefix + "UnhealthyThreshold", this.UnhealthyThreshold);
        this.setParamSimple(map, prefix + "FailoverSwitch", this.FailoverSwitch);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);

    }
}

