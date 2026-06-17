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

public class Listener extends AbstractModel {

    /**
    * <p>CLB listener ID</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>Listener protocol. Available values: TCP, UDP, HTTP, HTTPS, TCP_SSL, QUIC</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Listener port, port range: 1–65535</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Listener bound certificate information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateOutput Certificate;

    /**
    * <p>Health check information of the listener</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * <p>Requested scheduling method. WRR, LEAST_CONN, and IP_HASH indicate weighted round-robin, least connection, and IP Hash respectively.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled by default. This parameter is applicable only to TCP/UDP listener.</p><p>Unit: second</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * <p>Whether to enable SNI feature. 1: enable, 0: disabled (this parameter is applicable only to HTTPS listeners)</p>
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * <p>All forwarding rules under a listener (this parameter is only meaningful for HTTP/HTTPS listeners)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rules")
    @Expose
    private RuleOutput [] Rules;

    /**
    * <p>Listener name</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>Listener creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>End port of the port range: 2–65535</p>
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
    * <p>Backend server type. Available values: NODE, POLARIS, TARGETGROUP, TARGETGROUP-V2.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>Bound target group basic information; return this field when listener binding target group.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetGroup")
    @Expose
    private BasicTargetGroupInfo TargetGroup;

    /**
    * <p>Session persistence type. NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on Quic Connection ID.</p>
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * <p>Whether to enable long connections. 1: enable, 0: disable (this parameter is applicable only to HTTP/HTTPS listeners)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

    /**
    * <p>Only supports Nat64 CLB TCP listener</p>
    */
    @SerializedName("Toa")
    @Expose
    private Boolean Toa;

    /**
    * <p>Rescheduling feature, which provides a switch for scaling out the backend service. If the switch is toggled on, rescheduling is triggered when the backend service is unbound. This parameter is applicable only to TCP/UDP listeners.</p>
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
    * <p>Listener attribute.</p>
    */
    @SerializedName("AttrFlags")
    @Expose
    private String [] AttrFlags;

    /**
    * <p>List of bound target groups</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetGroupList")
    @Expose
    private BasicTargetGroupInfo [] TargetGroupList;

    /**
    * <p>Maximum number of connections to a listener. -1 means no speed limit at the listener dimension.</p>
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * <p>Maximum number of new connections to a listener. -1 means no speed limit at the listener dimension.</p>
    */
    @SerializedName("MaxCps")
    @Expose
    private Long MaxCps;

    /**
    * <p>Idle connection timeout is only supported for TCP listeners. Default value: 900. Value range: 300–900 for shared instances and dedicated instances and 300–1980 for LCU-supported instances.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdleConnectTimeout")
    @Expose
    private Long IdleConnectTimeout;

    /**
    * <p>Rescheduling trigger duration. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners. After rescheduling is triggered, persistent connections will be disconnected and reassigned within the scheduled time window. </p><p>Unit: s.</p>
    */
    @SerializedName("RescheduleInterval")
    @Expose
    private Long RescheduleInterval;

    /**
    * <p>Data compression mode</p>
    */
    @SerializedName("DataCompressMode")
    @Expose
    private String DataCompressMode;

    /**
    * <p>Rescheduling startup time: After the rescheduling startup time is configured, rescheduling is triggered when the startup time is arrived.</p>
    */
    @SerializedName("RescheduleStartTime")
    @Expose
    private Long RescheduleStartTime;

    /**
     * Get <p>CLB listener ID</p> 
     * @return ListenerId <p>CLB listener ID</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>CLB listener ID</p>
     * @param ListenerId <p>CLB listener ID</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>Listener protocol. Available values: TCP, UDP, HTTP, HTTPS, TCP_SSL, QUIC</p> 
     * @return Protocol <p>Listener protocol. Available values: TCP, UDP, HTTP, HTTPS, TCP_SSL, QUIC</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Listener protocol. Available values: TCP, UDP, HTTP, HTTPS, TCP_SSL, QUIC</p>
     * @param Protocol <p>Listener protocol. Available values: TCP, UDP, HTTP, HTTPS, TCP_SSL, QUIC</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Listener port, port range: 1–65535</p> 
     * @return Port <p>Listener port, port range: 1–65535</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Listener port, port range: 1–65535</p>
     * @param Port <p>Listener port, port range: 1–65535</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Listener bound certificate information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Certificate <p>Listener bound certificate information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CertificateOutput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set <p>Listener bound certificate information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Certificate <p>Listener bound certificate information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificate(CertificateOutput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get <p>Health check information of the listener</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HealthCheck <p>Health check information of the listener</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>Health check information of the listener</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HealthCheck <p>Health check information of the listener</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>Requested scheduling method. WRR, LEAST_CONN, and IP_HASH indicate weighted round-robin, least connection, and IP Hash respectively.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Scheduler <p>Requested scheduling method. WRR, LEAST_CONN, and IP_HASH indicate weighted round-robin, least connection, and IP Hash respectively.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set <p>Requested scheduling method. WRR, LEAST_CONN, and IP_HASH indicate weighted round-robin, least connection, and IP Hash respectively.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Scheduler <p>Requested scheduling method. WRR, LEAST_CONN, and IP_HASH indicate weighted round-robin, least connection, and IP Hash respectively.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled by default. This parameter is applicable only to TCP/UDP listener.</p><p>Unit: second</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SessionExpireTime <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled by default. This parameter is applicable only to TCP/UDP listener.</p><p>Unit: second</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled by default. This parameter is applicable only to TCP/UDP listener.</p><p>Unit: second</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SessionExpireTime <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled by default. This parameter is applicable only to TCP/UDP listener.</p><p>Unit: second</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get <p>Whether to enable SNI feature. 1: enable, 0: disabled (this parameter is applicable only to HTTPS listeners)</p> 
     * @return SniSwitch <p>Whether to enable SNI feature. 1: enable, 0: disabled (this parameter is applicable only to HTTPS listeners)</p>
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set <p>Whether to enable SNI feature. 1: enable, 0: disabled (this parameter is applicable only to HTTPS listeners)</p>
     * @param SniSwitch <p>Whether to enable SNI feature. 1: enable, 0: disabled (this parameter is applicable only to HTTPS listeners)</p>
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get <p>All forwarding rules under a listener (this parameter is only meaningful for HTTP/HTTPS listeners)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Rules <p>All forwarding rules under a listener (this parameter is only meaningful for HTTP/HTTPS listeners)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RuleOutput [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>All forwarding rules under a listener (this parameter is only meaningful for HTTP/HTTPS listeners)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Rules <p>All forwarding rules under a listener (this parameter is only meaningful for HTTP/HTTPS listeners)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRules(RuleOutput [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>Listener name</p> 
     * @return ListenerName <p>Listener name</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>Listener name</p>
     * @param ListenerName <p>Listener name</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>Listener creation time.</p> 
     * @return CreateTime <p>Listener creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Listener creation time.</p>
     * @param CreateTime <p>Listener creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>End port of the port range: 2–65535</p> 
     * @return EndPort <p>End port of the port range: 2–65535</p>
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set <p>End port of the port range: 2–65535</p>
     * @param EndPort <p>End port of the port range: 2–65535</p>
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
    }

    /**
     * Get <p>Backend server type. Available values: NODE, POLARIS, TARGETGROUP, TARGETGROUP-V2.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetType <p>Backend server type. Available values: NODE, POLARIS, TARGETGROUP, TARGETGROUP-V2.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>Backend server type. Available values: NODE, POLARIS, TARGETGROUP, TARGETGROUP-V2.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetType <p>Backend server type. Available values: NODE, POLARIS, TARGETGROUP, TARGETGROUP-V2.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>Bound target group basic information; return this field when listener binding target group.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetGroup <p>Bound target group basic information; return this field when listener binding target group.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BasicTargetGroupInfo getTargetGroup() {
        return this.TargetGroup;
    }

    /**
     * Set <p>Bound target group basic information; return this field when listener binding target group.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetGroup <p>Bound target group basic information; return this field when listener binding target group.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetGroup(BasicTargetGroupInfo TargetGroup) {
        this.TargetGroup = TargetGroup;
    }

    /**
     * Get <p>Session persistence type. NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on Quic Connection ID.</p> 
     * @return SessionType <p>Session persistence type. NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on Quic Connection ID.</p>
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set <p>Session persistence type. NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on Quic Connection ID.</p>
     * @param SessionType <p>Session persistence type. NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on Quic Connection ID.</p>
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get <p>Whether to enable long connections. 1: enable, 0: disable (this parameter is applicable only to HTTP/HTTPS listeners)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeepaliveEnable <p>Whether to enable long connections. 1: enable, 0: disable (this parameter is applicable only to HTTP/HTTPS listeners)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set <p>Whether to enable long connections. 1: enable, 0: disable (this parameter is applicable only to HTTP/HTTPS listeners)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeepaliveEnable <p>Whether to enable long connections. 1: enable, 0: disable (this parameter is applicable only to HTTP/HTTPS listeners)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get <p>Only supports Nat64 CLB TCP listener</p> 
     * @return Toa <p>Only supports Nat64 CLB TCP listener</p>
     */
    public Boolean getToa() {
        return this.Toa;
    }

    /**
     * Set <p>Only supports Nat64 CLB TCP listener</p>
     * @param Toa <p>Only supports Nat64 CLB TCP listener</p>
     */
    public void setToa(Boolean Toa) {
        this.Toa = Toa;
    }

    /**
     * Get <p>Rescheduling feature, which provides a switch for scaling out the backend service. If the switch is toggled on, rescheduling is triggered when the backend service is unbound. This parameter is applicable only to TCP/UDP listeners.</p> 
     * @return DeregisterTargetRst <p>Rescheduling feature, which provides a switch for scaling out the backend service. If the switch is toggled on, rescheduling is triggered when the backend service is unbound. This parameter is applicable only to TCP/UDP listeners.</p>
     */
    public Boolean getDeregisterTargetRst() {
        return this.DeregisterTargetRst;
    }

    /**
     * Set <p>Rescheduling feature, which provides a switch for scaling out the backend service. If the switch is toggled on, rescheduling is triggered when the backend service is unbound. This parameter is applicable only to TCP/UDP listeners.</p>
     * @param DeregisterTargetRst <p>Rescheduling feature, which provides a switch for scaling out the backend service. If the switch is toggled on, rescheduling is triggered when the backend service is unbound. This parameter is applicable only to TCP/UDP listeners.</p>
     */
    public void setDeregisterTargetRst(Boolean DeregisterTargetRst) {
        this.DeregisterTargetRst = DeregisterTargetRst;
    }

    /**
     * Get <p>Listener attribute.</p> 
     * @return AttrFlags <p>Listener attribute.</p>
     */
    public String [] getAttrFlags() {
        return this.AttrFlags;
    }

    /**
     * Set <p>Listener attribute.</p>
     * @param AttrFlags <p>Listener attribute.</p>
     */
    public void setAttrFlags(String [] AttrFlags) {
        this.AttrFlags = AttrFlags;
    }

    /**
     * Get <p>List of bound target groups</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetGroupList <p>List of bound target groups</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BasicTargetGroupInfo [] getTargetGroupList() {
        return this.TargetGroupList;
    }

    /**
     * Set <p>List of bound target groups</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetGroupList <p>List of bound target groups</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetGroupList(BasicTargetGroupInfo [] TargetGroupList) {
        this.TargetGroupList = TargetGroupList;
    }

    /**
     * Get <p>Maximum number of connections to a listener. -1 means no speed limit at the listener dimension.</p> 
     * @return MaxConn <p>Maximum number of connections to a listener. -1 means no speed limit at the listener dimension.</p>
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set <p>Maximum number of connections to a listener. -1 means no speed limit at the listener dimension.</p>
     * @param MaxConn <p>Maximum number of connections to a listener. -1 means no speed limit at the listener dimension.</p>
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get <p>Maximum number of new connections to a listener. -1 means no speed limit at the listener dimension.</p> 
     * @return MaxCps <p>Maximum number of new connections to a listener. -1 means no speed limit at the listener dimension.</p>
     */
    public Long getMaxCps() {
        return this.MaxCps;
    }

    /**
     * Set <p>Maximum number of new connections to a listener. -1 means no speed limit at the listener dimension.</p>
     * @param MaxCps <p>Maximum number of new connections to a listener. -1 means no speed limit at the listener dimension.</p>
     */
    public void setMaxCps(Long MaxCps) {
        this.MaxCps = MaxCps;
    }

    /**
     * Get <p>Idle connection timeout is only supported for TCP listeners. Default value: 900. Value range: 300–900 for shared instances and dedicated instances and 300–1980 for LCU-supported instances.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdleConnectTimeout <p>Idle connection timeout is only supported for TCP listeners. Default value: 900. Value range: 300–900 for shared instances and dedicated instances and 300–1980 for LCU-supported instances.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIdleConnectTimeout() {
        return this.IdleConnectTimeout;
    }

    /**
     * Set <p>Idle connection timeout is only supported for TCP listeners. Default value: 900. Value range: 300–900 for shared instances and dedicated instances and 300–1980 for LCU-supported instances.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdleConnectTimeout <p>Idle connection timeout is only supported for TCP listeners. Default value: 900. Value range: 300–900 for shared instances and dedicated instances and 300–1980 for LCU-supported instances.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdleConnectTimeout(Long IdleConnectTimeout) {
        this.IdleConnectTimeout = IdleConnectTimeout;
    }

    /**
     * Get <p>Rescheduling trigger duration. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners. After rescheduling is triggered, persistent connections will be disconnected and reassigned within the scheduled time window. </p><p>Unit: s.</p> 
     * @return RescheduleInterval <p>Rescheduling trigger duration. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners. After rescheduling is triggered, persistent connections will be disconnected and reassigned within the scheduled time window. </p><p>Unit: s.</p>
     */
    public Long getRescheduleInterval() {
        return this.RescheduleInterval;
    }

    /**
     * Set <p>Rescheduling trigger duration. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners. After rescheduling is triggered, persistent connections will be disconnected and reassigned within the scheduled time window. </p><p>Unit: s.</p>
     * @param RescheduleInterval <p>Rescheduling trigger duration. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners. After rescheduling is triggered, persistent connections will be disconnected and reassigned within the scheduled time window. </p><p>Unit: s.</p>
     */
    public void setRescheduleInterval(Long RescheduleInterval) {
        this.RescheduleInterval = RescheduleInterval;
    }

    /**
     * Get <p>Data compression mode</p> 
     * @return DataCompressMode <p>Data compression mode</p>
     */
    public String getDataCompressMode() {
        return this.DataCompressMode;
    }

    /**
     * Set <p>Data compression mode</p>
     * @param DataCompressMode <p>Data compression mode</p>
     */
    public void setDataCompressMode(String DataCompressMode) {
        this.DataCompressMode = DataCompressMode;
    }

    /**
     * Get <p>Rescheduling startup time: After the rescheduling startup time is configured, rescheduling is triggered when the startup time is arrived.</p> 
     * @return RescheduleStartTime <p>Rescheduling startup time: After the rescheduling startup time is configured, rescheduling is triggered when the startup time is arrived.</p>
     */
    public Long getRescheduleStartTime() {
        return this.RescheduleStartTime;
    }

    /**
     * Set <p>Rescheduling startup time: After the rescheduling startup time is configured, rescheduling is triggered when the startup time is arrived.</p>
     * @param RescheduleStartTime <p>Rescheduling startup time: After the rescheduling startup time is configured, rescheduling is triggered when the startup time is arrived.</p>
     */
    public void setRescheduleStartTime(Long RescheduleStartTime) {
        this.RescheduleStartTime = RescheduleStartTime;
    }

    public Listener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Listener(Listener source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Certificate != null) {
            this.Certificate = new CertificateOutput(source.Certificate);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new HealthCheck(source.HealthCheck);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.SniSwitch != null) {
            this.SniSwitch = new Long(source.SniSwitch);
        }
        if (source.Rules != null) {
            this.Rules = new RuleOutput[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RuleOutput(source.Rules[i]);
            }
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndPort != null) {
            this.EndPort = new Long(source.EndPort);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TargetGroup != null) {
            this.TargetGroup = new BasicTargetGroupInfo(source.TargetGroup);
        }
        if (source.SessionType != null) {
            this.SessionType = new String(source.SessionType);
        }
        if (source.KeepaliveEnable != null) {
            this.KeepaliveEnable = new Long(source.KeepaliveEnable);
        }
        if (source.Toa != null) {
            this.Toa = new Boolean(source.Toa);
        }
        if (source.DeregisterTargetRst != null) {
            this.DeregisterTargetRst = new Boolean(source.DeregisterTargetRst);
        }
        if (source.AttrFlags != null) {
            this.AttrFlags = new String[source.AttrFlags.length];
            for (int i = 0; i < source.AttrFlags.length; i++) {
                this.AttrFlags[i] = new String(source.AttrFlags[i]);
            }
        }
        if (source.TargetGroupList != null) {
            this.TargetGroupList = new BasicTargetGroupInfo[source.TargetGroupList.length];
            for (int i = 0; i < source.TargetGroupList.length; i++) {
                this.TargetGroupList[i] = new BasicTargetGroupInfo(source.TargetGroupList[i]);
            }
        }
        if (source.MaxConn != null) {
            this.MaxConn = new Long(source.MaxConn);
        }
        if (source.MaxCps != null) {
            this.MaxCps = new Long(source.MaxCps);
        }
        if (source.IdleConnectTimeout != null) {
            this.IdleConnectTimeout = new Long(source.IdleConnectTimeout);
        }
        if (source.RescheduleInterval != null) {
            this.RescheduleInterval = new Long(source.RescheduleInterval);
        }
        if (source.DataCompressMode != null) {
            this.DataCompressMode = new String(source.DataCompressMode);
        }
        if (source.RescheduleStartTime != null) {
            this.RescheduleStartTime = new Long(source.RescheduleStartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "SniSwitch", this.SniSwitch);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndPort", this.EndPort);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamObj(map, prefix + "TargetGroup.", this.TargetGroup);
        this.setParamSimple(map, prefix + "SessionType", this.SessionType);
        this.setParamSimple(map, prefix + "KeepaliveEnable", this.KeepaliveEnable);
        this.setParamSimple(map, prefix + "Toa", this.Toa);
        this.setParamSimple(map, prefix + "DeregisterTargetRst", this.DeregisterTargetRst);
        this.setParamArraySimple(map, prefix + "AttrFlags.", this.AttrFlags);
        this.setParamArrayObj(map, prefix + "TargetGroupList.", this.TargetGroupList);
        this.setParamSimple(map, prefix + "MaxConn", this.MaxConn);
        this.setParamSimple(map, prefix + "MaxCps", this.MaxCps);
        this.setParamSimple(map, prefix + "IdleConnectTimeout", this.IdleConnectTimeout);
        this.setParamSimple(map, prefix + "RescheduleInterval", this.RescheduleInterval);
        this.setParamSimple(map, prefix + "DataCompressMode", this.DataCompressMode);
        this.setParamSimple(map, prefix + "RescheduleStartTime", this.RescheduleStartTime);

    }
}

