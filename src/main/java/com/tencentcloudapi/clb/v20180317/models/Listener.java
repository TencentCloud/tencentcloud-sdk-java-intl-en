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
    * CLB listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listener protocol. valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, QUIC.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listener port. value range: 1-65535.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Information of certificates bound to the listener
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateOutput Certificate;

    /**
    * Health check information of the listener
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * Request scheduling method. WRR, LEAST_CONN, and IP_HASH respectively indicate weighted round robin, least connections, and IP hash.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Session persistence time, in seconds. value range: 30-3600. default value: 0, indicating that session persistence is not enabled by default. this parameter applies only to TCP and UDP listeners.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * Specifies whether to enable the SNI feature. 1: enable; 0: disable. this parameter is applicable only to HTTPS listeners.
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * All forwarding rules under a listener (this parameter is meaningful only for HTTP/HTTPS listeners)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rules")
    @Expose
    private RuleOutput [] Rules;

    /**
    * Listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * End port of the port range. value range: 2-65535.
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
    * Backend server type. available values: NODE, POLARIS, TARGETGROUP, TARGETGROUP-V2.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Basic information of a bound target group. This field will be returned when a target group is bound to a listener.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetGroup")
    @Expose
    private BasicTargetGroupInfo TargetGroup;

    /**
    * Session persistence type. NORMAL: Default session persistence type; QUIC_CID: Session persistence by Quic Connection ID.
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * Whether a persistent connection is enabled (1: enabled; 0: disabled). This parameter can only be configured in HTTP/HTTPS listeners.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

    /**
    * Supports Nat64 CLB TCP listeners only
    */
    @SerializedName("Toa")
    @Expose
    private Boolean Toa;

    /**
    * Reschedules when unbinding real servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
    * Describes the attributes of the listener.
    */
    @SerializedName("AttrFlags")
    @Expose
    private String [] AttrFlags;

    /**
    * List of bound target groups
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetGroupList")
    @Expose
    private BasicTargetGroupInfo [] TargetGroupList;

    /**
    * Maximum number of connections to a listener. -1 indicates unlimited speed at the listener dimension.
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * Maximum number of new connections to a listener. -1 means no speed limit at the listener dimension.
    */
    @SerializedName("MaxCps")
    @Expose
    private Long MaxCps;

    /**
    * Connection idle timeout period (in seconds). It’s only available to TCP listeners. Value range: 300-900 for shared and dedicated instances; 300-2000 for LCU-supported CLB instances. It defaults to 900.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("IdleConnectTimeout")
    @Expose
    private Long IdleConnectTimeout;

    /**
    * Rescheduling trigger duration, valid values: 0-3600s. only TCP/UDP listeners support this. after triggering rescheduling, persistent connections will disconnect and be reassigned within the set scheduling time.
    */
    @SerializedName("RescheduleInterval")
    @Expose
    private Long RescheduleInterval;

    /**
    * Data compression mode.
    */
    @SerializedName("DataCompressMode")
    @Expose
    private String DataCompressMode;

    /**
    * Reschedules the startup time. when configured, rescheduling will be triggered upon arrival of the start time.
    */
    @SerializedName("RescheduleStartTime")
    @Expose
    private Long RescheduleStartTime;

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
     * Get Listener protocol. valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, QUIC. 
     * @return Protocol Listener protocol. valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, QUIC.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol. valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, QUIC.
     * @param Protocol Listener protocol. valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, QUIC.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listener port. value range: 1-65535. 
     * @return Port Listener port. value range: 1-65535.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port. value range: 1-65535.
     * @param Port Listener port. value range: 1-65535.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Information of certificates bound to the listener
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Certificate Information of certificates bound to the listener
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CertificateOutput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Information of certificates bound to the listener
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Certificate Information of certificates bound to the listener
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificate(CertificateOutput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get Health check information of the listener
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HealthCheck Health check information of the listener
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check information of the listener
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HealthCheck Health check information of the listener
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Request scheduling method. WRR, LEAST_CONN, and IP_HASH respectively indicate weighted round robin, least connections, and IP hash.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Scheduler Request scheduling method. WRR, LEAST_CONN, and IP_HASH respectively indicate weighted round robin, least connections, and IP hash.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Request scheduling method. WRR, LEAST_CONN, and IP_HASH respectively indicate weighted round robin, least connections, and IP hash.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Scheduler Request scheduling method. WRR, LEAST_CONN, and IP_HASH respectively indicate weighted round robin, least connections, and IP hash.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Session persistence time, in seconds. value range: 30-3600. default value: 0, indicating that session persistence is not enabled by default. this parameter applies only to TCP and UDP listeners.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SessionExpireTime Session persistence time, in seconds. value range: 30-3600. default value: 0, indicating that session persistence is not enabled by default. this parameter applies only to TCP and UDP listeners.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set Session persistence time, in seconds. value range: 30-3600. default value: 0, indicating that session persistence is not enabled by default. this parameter applies only to TCP and UDP listeners.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SessionExpireTime Session persistence time, in seconds. value range: 30-3600. default value: 0, indicating that session persistence is not enabled by default. this parameter applies only to TCP and UDP listeners.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get Specifies whether to enable the SNI feature. 1: enable; 0: disable. this parameter is applicable only to HTTPS listeners. 
     * @return SniSwitch Specifies whether to enable the SNI feature. 1: enable; 0: disable. this parameter is applicable only to HTTPS listeners.
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set Specifies whether to enable the SNI feature. 1: enable; 0: disable. this parameter is applicable only to HTTPS listeners.
     * @param SniSwitch Specifies whether to enable the SNI feature. 1: enable; 0: disable. this parameter is applicable only to HTTPS listeners.
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get All forwarding rules under a listener (this parameter is meaningful only for HTTP/HTTPS listeners)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Rules All forwarding rules under a listener (this parameter is meaningful only for HTTP/HTTPS listeners)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RuleOutput [] getRules() {
        return this.Rules;
    }

    /**
     * Set All forwarding rules under a listener (this parameter is meaningful only for HTTP/HTTPS listeners)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Rules All forwarding rules under a listener (this parameter is meaningful only for HTTP/HTTPS listeners)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRules(RuleOutput [] Rules) {
        this.Rules = Rules;
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
     * Get Listener creation time 
     * @return CreateTime Listener creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Listener creation time
     * @param CreateTime Listener creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get End port of the port range. value range: 2-65535. 
     * @return EndPort End port of the port range. value range: 2-65535.
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set End port of the port range. value range: 2-65535.
     * @param EndPort End port of the port range. value range: 2-65535.
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
    }

    /**
     * Get Backend server type. available values: NODE, POLARIS, TARGETGROUP, TARGETGROUP-V2.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetType Backend server type. available values: NODE, POLARIS, TARGETGROUP, TARGETGROUP-V2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Backend server type. available values: NODE, POLARIS, TARGETGROUP, TARGETGROUP-V2.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetType Backend server type. available values: NODE, POLARIS, TARGETGROUP, TARGETGROUP-V2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Basic information of a bound target group. This field will be returned when a target group is bound to a listener.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetGroup Basic information of a bound target group. This field will be returned when a target group is bound to a listener.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BasicTargetGroupInfo getTargetGroup() {
        return this.TargetGroup;
    }

    /**
     * Set Basic information of a bound target group. This field will be returned when a target group is bound to a listener.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetGroup Basic information of a bound target group. This field will be returned when a target group is bound to a listener.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetGroup(BasicTargetGroupInfo TargetGroup) {
        this.TargetGroup = TargetGroup;
    }

    /**
     * Get Session persistence type. NORMAL: Default session persistence type; QUIC_CID: Session persistence by Quic Connection ID. 
     * @return SessionType Session persistence type. NORMAL: Default session persistence type; QUIC_CID: Session persistence by Quic Connection ID.
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set Session persistence type. NORMAL: Default session persistence type; QUIC_CID: Session persistence by Quic Connection ID.
     * @param SessionType Session persistence type. NORMAL: Default session persistence type; QUIC_CID: Session persistence by Quic Connection ID.
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get Whether a persistent connection is enabled (1: enabled; 0: disabled). This parameter can only be configured in HTTP/HTTPS listeners.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return KeepaliveEnable Whether a persistent connection is enabled (1: enabled; 0: disabled). This parameter can only be configured in HTTP/HTTPS listeners.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set Whether a persistent connection is enabled (1: enabled; 0: disabled). This parameter can only be configured in HTTP/HTTPS listeners.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param KeepaliveEnable Whether a persistent connection is enabled (1: enabled; 0: disabled). This parameter can only be configured in HTTP/HTTPS listeners.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get Supports Nat64 CLB TCP listeners only 
     * @return Toa Supports Nat64 CLB TCP listeners only
     */
    public Boolean getToa() {
        return this.Toa;
    }

    /**
     * Set Supports Nat64 CLB TCP listeners only
     * @param Toa Supports Nat64 CLB TCP listeners only
     */
    public void setToa(Boolean Toa) {
        this.Toa = Toa;
    }

    /**
     * Get Reschedules when unbinding real servers. only supported for TCP/UDP listeners. toggle on to enable this feature. 
     * @return DeregisterTargetRst Reschedules when unbinding real servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
     */
    public Boolean getDeregisterTargetRst() {
        return this.DeregisterTargetRst;
    }

    /**
     * Set Reschedules when unbinding real servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
     * @param DeregisterTargetRst Reschedules when unbinding real servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
     */
    public void setDeregisterTargetRst(Boolean DeregisterTargetRst) {
        this.DeregisterTargetRst = DeregisterTargetRst;
    }

    /**
     * Get Describes the attributes of the listener. 
     * @return AttrFlags Describes the attributes of the listener.
     */
    public String [] getAttrFlags() {
        return this.AttrFlags;
    }

    /**
     * Set Describes the attributes of the listener.
     * @param AttrFlags Describes the attributes of the listener.
     */
    public void setAttrFlags(String [] AttrFlags) {
        this.AttrFlags = AttrFlags;
    }

    /**
     * Get List of bound target groups
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TargetGroupList List of bound target groups
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public BasicTargetGroupInfo [] getTargetGroupList() {
        return this.TargetGroupList;
    }

    /**
     * Set List of bound target groups
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TargetGroupList List of bound target groups
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTargetGroupList(BasicTargetGroupInfo [] TargetGroupList) {
        this.TargetGroupList = TargetGroupList;
    }

    /**
     * Get Maximum number of connections to a listener. -1 indicates unlimited speed at the listener dimension. 
     * @return MaxConn Maximum number of connections to a listener. -1 indicates unlimited speed at the listener dimension.
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set Maximum number of connections to a listener. -1 indicates unlimited speed at the listener dimension.
     * @param MaxConn Maximum number of connections to a listener. -1 indicates unlimited speed at the listener dimension.
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get Maximum number of new connections to a listener. -1 means no speed limit at the listener dimension. 
     * @return MaxCps Maximum number of new connections to a listener. -1 means no speed limit at the listener dimension.
     */
    public Long getMaxCps() {
        return this.MaxCps;
    }

    /**
     * Set Maximum number of new connections to a listener. -1 means no speed limit at the listener dimension.
     * @param MaxCps Maximum number of new connections to a listener. -1 means no speed limit at the listener dimension.
     */
    public void setMaxCps(Long MaxCps) {
        this.MaxCps = MaxCps;
    }

    /**
     * Get Connection idle timeout period (in seconds). It’s only available to TCP listeners. Value range: 300-900 for shared and dedicated instances; 300-2000 for LCU-supported CLB instances. It defaults to 900.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return IdleConnectTimeout Connection idle timeout period (in seconds). It’s only available to TCP listeners. Value range: 300-900 for shared and dedicated instances; 300-2000 for LCU-supported CLB instances. It defaults to 900.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getIdleConnectTimeout() {
        return this.IdleConnectTimeout;
    }

    /**
     * Set Connection idle timeout period (in seconds). It’s only available to TCP listeners. Value range: 300-900 for shared and dedicated instances; 300-2000 for LCU-supported CLB instances. It defaults to 900.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param IdleConnectTimeout Connection idle timeout period (in seconds). It’s only available to TCP listeners. Value range: 300-900 for shared and dedicated instances; 300-2000 for LCU-supported CLB instances. It defaults to 900.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIdleConnectTimeout(Long IdleConnectTimeout) {
        this.IdleConnectTimeout = IdleConnectTimeout;
    }

    /**
     * Get Rescheduling trigger duration, valid values: 0-3600s. only TCP/UDP listeners support this. after triggering rescheduling, persistent connections will disconnect and be reassigned within the set scheduling time. 
     * @return RescheduleInterval Rescheduling trigger duration, valid values: 0-3600s. only TCP/UDP listeners support this. after triggering rescheduling, persistent connections will disconnect and be reassigned within the set scheduling time.
     */
    public Long getRescheduleInterval() {
        return this.RescheduleInterval;
    }

    /**
     * Set Rescheduling trigger duration, valid values: 0-3600s. only TCP/UDP listeners support this. after triggering rescheduling, persistent connections will disconnect and be reassigned within the set scheduling time.
     * @param RescheduleInterval Rescheduling trigger duration, valid values: 0-3600s. only TCP/UDP listeners support this. after triggering rescheduling, persistent connections will disconnect and be reassigned within the set scheduling time.
     */
    public void setRescheduleInterval(Long RescheduleInterval) {
        this.RescheduleInterval = RescheduleInterval;
    }

    /**
     * Get Data compression mode. 
     * @return DataCompressMode Data compression mode.
     */
    public String getDataCompressMode() {
        return this.DataCompressMode;
    }

    /**
     * Set Data compression mode.
     * @param DataCompressMode Data compression mode.
     */
    public void setDataCompressMode(String DataCompressMode) {
        this.DataCompressMode = DataCompressMode;
    }

    /**
     * Get Reschedules the startup time. when configured, rescheduling will be triggered upon arrival of the start time. 
     * @return RescheduleStartTime Reschedules the startup time. when configured, rescheduling will be triggered upon arrival of the start time.
     */
    public Long getRescheduleStartTime() {
        return this.RescheduleStartTime;
    }

    /**
     * Set Reschedules the startup time. when configured, rescheduling will be triggered upon arrival of the start time.
     * @param RescheduleStartTime Reschedules the startup time. when configured, rescheduling will be triggered upon arrival of the start time.
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

