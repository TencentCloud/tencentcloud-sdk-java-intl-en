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

public class Listener extends AbstractModel{

    /**
    * CLB listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listener protocol
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
    * Request scheduling method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Session persistence time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * Whether to enable the SNI feature (this parameter is only meaningful for HTTPS listeners)
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * End port of a port range
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
    * Real server type
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
    * Session persistence type. Valid values: Normal: the default session persistence type; QUIC_CID: session persistence by QUIC connection ID.
Note: this field may return null, indicating that no valid values can be obtained.
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
    * Only the NAT64 CLB TCP listeners are supported.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Toa")
    @Expose
    private Boolean Toa;

    /**
    * Whether to send the TCP RST packet to the client when unbinding a real server. This parameter is applicable to TCP listeners only.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
    * Attribute of listener
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AttrFlags")
    @Expose
    private String [] AttrFlags;

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
     * Get Listener protocol 
     * @return Protocol Listener protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol
     * @param Protocol Listener protocol
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
     * Get Request scheduling method
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Scheduler Request scheduling method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Request scheduling method
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Scheduler Request scheduling method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Session persistence time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SessionExpireTime Session persistence time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set Session persistence time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SessionExpireTime Session persistence time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get Whether to enable the SNI feature (this parameter is only meaningful for HTTPS listeners)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SniSwitch Whether to enable the SNI feature (this parameter is only meaningful for HTTPS listeners)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set Whether to enable the SNI feature (this parameter is only meaningful for HTTPS listeners)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SniSwitch Whether to enable the SNI feature (this parameter is only meaningful for HTTPS listeners)
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ListenerName Listener name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ListenerName Listener name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Listener creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Listener creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Listener creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Listener creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get End port of a port range
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndPort End port of a port range
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set End port of a port range
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndPort End port of a port range
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
    }

    /**
     * Get Real server type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetType Real server type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Real server type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetType Real server type
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
     * Get Session persistence type. Valid values: Normal: the default session persistence type; QUIC_CID: session persistence by QUIC connection ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SessionType Session persistence type. Valid values: Normal: the default session persistence type; QUIC_CID: session persistence by QUIC connection ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set Session persistence type. Valid values: Normal: the default session persistence type; QUIC_CID: session persistence by QUIC connection ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SessionType Session persistence type. Valid values: Normal: the default session persistence type; QUIC_CID: session persistence by QUIC connection ID.
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Only the NAT64 CLB TCP listeners are supported.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Toa Only the NAT64 CLB TCP listeners are supported.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getToa() {
        return this.Toa;
    }

    /**
     * Set Only the NAT64 CLB TCP listeners are supported.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Toa Only the NAT64 CLB TCP listeners are supported.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setToa(Boolean Toa) {
        this.Toa = Toa;
    }

    /**
     * Get Whether to send the TCP RST packet to the client when unbinding a real server. This parameter is applicable to TCP listeners only.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DeregisterTargetRst Whether to send the TCP RST packet to the client when unbinding a real server. This parameter is applicable to TCP listeners only.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getDeregisterTargetRst() {
        return this.DeregisterTargetRst;
    }

    /**
     * Set Whether to send the TCP RST packet to the client when unbinding a real server. This parameter is applicable to TCP listeners only.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DeregisterTargetRst Whether to send the TCP RST packet to the client when unbinding a real server. This parameter is applicable to TCP listeners only.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeregisterTargetRst(Boolean DeregisterTargetRst) {
        this.DeregisterTargetRst = DeregisterTargetRst;
    }

    /**
     * Get Attribute of listener
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AttrFlags Attribute of listener
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getAttrFlags() {
        return this.AttrFlags;
    }

    /**
     * Set Attribute of listener
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AttrFlags Attribute of listener
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAttrFlags(String [] AttrFlags) {
        this.AttrFlags = AttrFlags;
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

    }
}

