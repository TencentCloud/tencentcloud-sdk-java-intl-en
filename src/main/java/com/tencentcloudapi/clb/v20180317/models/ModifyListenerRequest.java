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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyListenerRequest extends AbstractModel{

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * New listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Session persistence time in seconds. Value range: 30-3,600. The default value is 0, indicating that session persistence is not enabled. This parameter is applicable only to TCP/UDP listeners.
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * Health check parameter, which is applicable only to TCP, UDP, and TCP_SSL listeners.
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * Certificate information. This parameter is only applicable to HTTPS/TCP_SSL listeners. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * Forwarding method of a listener. Value range: WRR, LEAST_CONN.
They represent weighted round robin and least connections, respectively. Default value: WRR.
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Whether to enable the SNI feature. This parameter is applicable only to HTTPS listeners. Note: The SNI feature can be enabled but cannot be disabled once enabled.
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * Target backend type. `NODE`: A single node; `TARGETGROUP`: A target group.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Whether to enable a persistent connection. This parameter is applicable only to HTTP and HTTPS listeners.
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

    /**
    * Whether to send the TCP RST packet to the client when unbinding a real server. This parameter is applicable to TCP listeners only.
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
    * Session persistence type. `NORMAL`: default session persistence type (L4/L7 session persistence); `QUIC_CID`: session persistence by QUIC connection ID. The `QUIC_CID` value can only be configured in UDP listeners.
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * Certificate information. You can specify multiple server-side certificates with different algorithm types. This parameter is only applicable to HTTPS listeners with the SNI feature not enabled. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

    /**
    * The maximum number of concurrent connections at the listener level. This parameter takes effect only on LCU-supported instances and TCP/UDP/TCP_SSL/QUIC listeners. Value range: 1 to the maximum concurrency of the instance. -1 indicates that no limit is set on concurrent connections.
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * The maximum number of new connections at the listener level. This parameter takes effect only on LCU-supported instances and TCP/UDP/TCP_SSL/QUIC listeners. Value range: 1 to the maximum number of new connections of the instance. -1 indicates that no limit is set on concurrent connections.
    */
    @SerializedName("MaxCps")
    @Expose
    private Long MaxCps;

    /**
     * Get CLB instance ID 
     * @return LoadBalancerId CLB instance ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancerId CLB instance ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB listener ID 
     * @return ListenerId CLB listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID
     * @param ListenerId CLB listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get New listener name 
     * @return ListenerName New listener name
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set New listener name
     * @param ListenerName New listener name
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Session persistence time in seconds. Value range: 30-3,600. The default value is 0, indicating that session persistence is not enabled. This parameter is applicable only to TCP/UDP listeners. 
     * @return SessionExpireTime Session persistence time in seconds. Value range: 30-3,600. The default value is 0, indicating that session persistence is not enabled. This parameter is applicable only to TCP/UDP listeners.
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set Session persistence time in seconds. Value range: 30-3,600. The default value is 0, indicating that session persistence is not enabled. This parameter is applicable only to TCP/UDP listeners.
     * @param SessionExpireTime Session persistence time in seconds. Value range: 30-3,600. The default value is 0, indicating that session persistence is not enabled. This parameter is applicable only to TCP/UDP listeners.
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get Health check parameter, which is applicable only to TCP, UDP, and TCP_SSL listeners. 
     * @return HealthCheck Health check parameter, which is applicable only to TCP, UDP, and TCP_SSL listeners.
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check parameter, which is applicable only to TCP, UDP, and TCP_SSL listeners.
     * @param HealthCheck Health check parameter, which is applicable only to TCP, UDP, and TCP_SSL listeners.
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Certificate information. This parameter is only applicable to HTTPS/TCP_SSL listeners. `Certificate` and `MultiCertInfo` cannot be specified at the same time.  
     * @return Certificate Certificate information. This parameter is only applicable to HTTPS/TCP_SSL listeners. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Certificate information. This parameter is only applicable to HTTPS/TCP_SSL listeners. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
     * @param Certificate Certificate information. This parameter is only applicable to HTTPS/TCP_SSL listeners. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get Forwarding method of a listener. Value range: WRR, LEAST_CONN.
They represent weighted round robin and least connections, respectively. Default value: WRR. 
     * @return Scheduler Forwarding method of a listener. Value range: WRR, LEAST_CONN.
They represent weighted round robin and least connections, respectively. Default value: WRR.
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Forwarding method of a listener. Value range: WRR, LEAST_CONN.
They represent weighted round robin and least connections, respectively. Default value: WRR.
     * @param Scheduler Forwarding method of a listener. Value range: WRR, LEAST_CONN.
They represent weighted round robin and least connections, respectively. Default value: WRR.
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Whether to enable the SNI feature. This parameter is applicable only to HTTPS listeners. Note: The SNI feature can be enabled but cannot be disabled once enabled. 
     * @return SniSwitch Whether to enable the SNI feature. This parameter is applicable only to HTTPS listeners. Note: The SNI feature can be enabled but cannot be disabled once enabled.
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set Whether to enable the SNI feature. This parameter is applicable only to HTTPS listeners. Note: The SNI feature can be enabled but cannot be disabled once enabled.
     * @param SniSwitch Whether to enable the SNI feature. This parameter is applicable only to HTTPS listeners. Note: The SNI feature can be enabled but cannot be disabled once enabled.
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get Target backend type. `NODE`: A single node; `TARGETGROUP`: A target group. 
     * @return TargetType Target backend type. `NODE`: A single node; `TARGETGROUP`: A target group.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Target backend type. `NODE`: A single node; `TARGETGROUP`: A target group.
     * @param TargetType Target backend type. `NODE`: A single node; `TARGETGROUP`: A target group.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Whether to enable a persistent connection. This parameter is applicable only to HTTP and HTTPS listeners. 
     * @return KeepaliveEnable Whether to enable a persistent connection. This parameter is applicable only to HTTP and HTTPS listeners.
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set Whether to enable a persistent connection. This parameter is applicable only to HTTP and HTTPS listeners.
     * @param KeepaliveEnable Whether to enable a persistent connection. This parameter is applicable only to HTTP and HTTPS listeners.
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get Whether to send the TCP RST packet to the client when unbinding a real server. This parameter is applicable to TCP listeners only. 
     * @return DeregisterTargetRst Whether to send the TCP RST packet to the client when unbinding a real server. This parameter is applicable to TCP listeners only.
     */
    public Boolean getDeregisterTargetRst() {
        return this.DeregisterTargetRst;
    }

    /**
     * Set Whether to send the TCP RST packet to the client when unbinding a real server. This parameter is applicable to TCP listeners only.
     * @param DeregisterTargetRst Whether to send the TCP RST packet to the client when unbinding a real server. This parameter is applicable to TCP listeners only.
     */
    public void setDeregisterTargetRst(Boolean DeregisterTargetRst) {
        this.DeregisterTargetRst = DeregisterTargetRst;
    }

    /**
     * Get Session persistence type. `NORMAL`: default session persistence type (L4/L7 session persistence); `QUIC_CID`: session persistence by QUIC connection ID. The `QUIC_CID` value can only be configured in UDP listeners. 
     * @return SessionType Session persistence type. `NORMAL`: default session persistence type (L4/L7 session persistence); `QUIC_CID`: session persistence by QUIC connection ID. The `QUIC_CID` value can only be configured in UDP listeners.
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set Session persistence type. `NORMAL`: default session persistence type (L4/L7 session persistence); `QUIC_CID`: session persistence by QUIC connection ID. The `QUIC_CID` value can only be configured in UDP listeners.
     * @param SessionType Session persistence type. `NORMAL`: default session persistence type (L4/L7 session persistence); `QUIC_CID`: session persistence by QUIC connection ID. The `QUIC_CID` value can only be configured in UDP listeners.
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get Certificate information. You can specify multiple server-side certificates with different algorithm types. This parameter is only applicable to HTTPS listeners with the SNI feature not enabled. `Certificate` and `MultiCertInfo` cannot be specified at the same time.  
     * @return MultiCertInfo Certificate information. You can specify multiple server-side certificates with different algorithm types. This parameter is only applicable to HTTPS listeners with the SNI feature not enabled. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
     */
    public MultiCertInfo getMultiCertInfo() {
        return this.MultiCertInfo;
    }

    /**
     * Set Certificate information. You can specify multiple server-side certificates with different algorithm types. This parameter is only applicable to HTTPS listeners with the SNI feature not enabled. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
     * @param MultiCertInfo Certificate information. You can specify multiple server-side certificates with different algorithm types. This parameter is only applicable to HTTPS listeners with the SNI feature not enabled. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
     */
    public void setMultiCertInfo(MultiCertInfo MultiCertInfo) {
        this.MultiCertInfo = MultiCertInfo;
    }

    /**
     * Get The maximum number of concurrent connections at the listener level. This parameter takes effect only on LCU-supported instances and TCP/UDP/TCP_SSL/QUIC listeners. Value range: 1 to the maximum concurrency of the instance. -1 indicates that no limit is set on concurrent connections. 
     * @return MaxConn The maximum number of concurrent connections at the listener level. This parameter takes effect only on LCU-supported instances and TCP/UDP/TCP_SSL/QUIC listeners. Value range: 1 to the maximum concurrency of the instance. -1 indicates that no limit is set on concurrent connections.
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set The maximum number of concurrent connections at the listener level. This parameter takes effect only on LCU-supported instances and TCP/UDP/TCP_SSL/QUIC listeners. Value range: 1 to the maximum concurrency of the instance. -1 indicates that no limit is set on concurrent connections.
     * @param MaxConn The maximum number of concurrent connections at the listener level. This parameter takes effect only on LCU-supported instances and TCP/UDP/TCP_SSL/QUIC listeners. Value range: 1 to the maximum concurrency of the instance. -1 indicates that no limit is set on concurrent connections.
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get The maximum number of new connections at the listener level. This parameter takes effect only on LCU-supported instances and TCP/UDP/TCP_SSL/QUIC listeners. Value range: 1 to the maximum number of new connections of the instance. -1 indicates that no limit is set on concurrent connections. 
     * @return MaxCps The maximum number of new connections at the listener level. This parameter takes effect only on LCU-supported instances and TCP/UDP/TCP_SSL/QUIC listeners. Value range: 1 to the maximum number of new connections of the instance. -1 indicates that no limit is set on concurrent connections.
     */
    public Long getMaxCps() {
        return this.MaxCps;
    }

    /**
     * Set The maximum number of new connections at the listener level. This parameter takes effect only on LCU-supported instances and TCP/UDP/TCP_SSL/QUIC listeners. Value range: 1 to the maximum number of new connections of the instance. -1 indicates that no limit is set on concurrent connections.
     * @param MaxCps The maximum number of new connections at the listener level. This parameter takes effect only on LCU-supported instances and TCP/UDP/TCP_SSL/QUIC listeners. Value range: 1 to the maximum number of new connections of the instance. -1 indicates that no limit is set on concurrent connections.
     */
    public void setMaxCps(Long MaxCps) {
        this.MaxCps = MaxCps;
    }

    public ModifyListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyListenerRequest(ModifyListenerRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new HealthCheck(source.HealthCheck);
        }
        if (source.Certificate != null) {
            this.Certificate = new CertificateInput(source.Certificate);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.SniSwitch != null) {
            this.SniSwitch = new Long(source.SniSwitch);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.KeepaliveEnable != null) {
            this.KeepaliveEnable = new Long(source.KeepaliveEnable);
        }
        if (source.DeregisterTargetRst != null) {
            this.DeregisterTargetRst = new Boolean(source.DeregisterTargetRst);
        }
        if (source.SessionType != null) {
            this.SessionType = new String(source.SessionType);
        }
        if (source.MultiCertInfo != null) {
            this.MultiCertInfo = new MultiCertInfo(source.MultiCertInfo);
        }
        if (source.MaxConn != null) {
            this.MaxConn = new Long(source.MaxConn);
        }
        if (source.MaxCps != null) {
            this.MaxCps = new Long(source.MaxCps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "SniSwitch", this.SniSwitch);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "KeepaliveEnable", this.KeepaliveEnable);
        this.setParamSimple(map, prefix + "DeregisterTargetRst", this.DeregisterTargetRst);
        this.setParamSimple(map, prefix + "SessionType", this.SessionType);
        this.setParamObj(map, prefix + "MultiCertInfo.", this.MultiCertInfo);
        this.setParamSimple(map, prefix + "MaxConn", this.MaxConn);
        this.setParamSimple(map, prefix + "MaxCps", this.MaxCps);

    }
}

