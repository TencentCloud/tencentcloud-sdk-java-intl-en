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

public class CreateListenerRequest extends AbstractModel{

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Specifies for which ports to create listeners. Each port corresponds to a new listener
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * Listener protocol: TCP, UDP, HTTP, HTTPS, or TCP_SSL (which is currently in beta test. If you want to use it, please submit a ticket for application)
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * List of names of the listeners to be created. The array of names and array of ports are in one-to-one correspondence. If you do not want to name them now, you do not need to provide this parameter.
    */
    @SerializedName("ListenerNames")
    @Expose
    private String [] ListenerNames;

    /**
    * Health check parameter, which is applicable only to TCP/UDP/TCP_SSL listeners
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * Certificate information. This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with the SNI feature not enabled.
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * Session persistence time in seconds. Value range: 30-3,600. The default value is 0, indicating that session persistence is not enabled. This parameter is applicable only to TCP/UDP listeners.
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * Forwarding method of a listener. Value range: WRR, LEAST_CONN.
They represent weighted round robin and least connections, respectively. Default value: WRR. This parameter is applicable only to TCP/UDP/TCP_SSL listeners.
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Whether to enable the SNI feature. This parameter is applicable only to HTTPS listeners
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * Target real server type. `NODE`: binding a general node; `TARGETGROUP`: binding a target group.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Session persistence type. Valid values: Normal: the default session persistence type; QUIC_CID: session persistence by QUIC connection ID. The `QUIC_CID` value can only be configured in UDP listeners. If this field is not specified, the default session persistence type will be used.
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * Whether to enable a persistent connection (This parameter can only be configured in HTTP/HTTPS listeners). Valid values: 0: no; 1: yes. Default value: 0
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

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
     * Get Specifies for which ports to create listeners. Each port corresponds to a new listener 
     * @return Ports Specifies for which ports to create listeners. Each port corresponds to a new listener
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set Specifies for which ports to create listeners. Each port corresponds to a new listener
     * @param Ports Specifies for which ports to create listeners. Each port corresponds to a new listener
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get Listener protocol: TCP, UDP, HTTP, HTTPS, or TCP_SSL (which is currently in beta test. If you want to use it, please submit a ticket for application) 
     * @return Protocol Listener protocol: TCP, UDP, HTTP, HTTPS, or TCP_SSL (which is currently in beta test. If you want to use it, please submit a ticket for application)
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol: TCP, UDP, HTTP, HTTPS, or TCP_SSL (which is currently in beta test. If you want to use it, please submit a ticket for application)
     * @param Protocol Listener protocol: TCP, UDP, HTTP, HTTPS, or TCP_SSL (which is currently in beta test. If you want to use it, please submit a ticket for application)
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get List of names of the listeners to be created. The array of names and array of ports are in one-to-one correspondence. If you do not want to name them now, you do not need to provide this parameter. 
     * @return ListenerNames List of names of the listeners to be created. The array of names and array of ports are in one-to-one correspondence. If you do not want to name them now, you do not need to provide this parameter.
     */
    public String [] getListenerNames() {
        return this.ListenerNames;
    }

    /**
     * Set List of names of the listeners to be created. The array of names and array of ports are in one-to-one correspondence. If you do not want to name them now, you do not need to provide this parameter.
     * @param ListenerNames List of names of the listeners to be created. The array of names and array of ports are in one-to-one correspondence. If you do not want to name them now, you do not need to provide this parameter.
     */
    public void setListenerNames(String [] ListenerNames) {
        this.ListenerNames = ListenerNames;
    }

    /**
     * Get Health check parameter, which is applicable only to TCP/UDP/TCP_SSL listeners 
     * @return HealthCheck Health check parameter, which is applicable only to TCP/UDP/TCP_SSL listeners
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check parameter, which is applicable only to TCP/UDP/TCP_SSL listeners
     * @param HealthCheck Health check parameter, which is applicable only to TCP/UDP/TCP_SSL listeners
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Certificate information. This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with the SNI feature not enabled. 
     * @return Certificate Certificate information. This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with the SNI feature not enabled.
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Certificate information. This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with the SNI feature not enabled.
     * @param Certificate Certificate information. This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with the SNI feature not enabled.
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
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
     * Get Forwarding method of a listener. Value range: WRR, LEAST_CONN.
They represent weighted round robin and least connections, respectively. Default value: WRR. This parameter is applicable only to TCP/UDP/TCP_SSL listeners. 
     * @return Scheduler Forwarding method of a listener. Value range: WRR, LEAST_CONN.
They represent weighted round robin and least connections, respectively. Default value: WRR. This parameter is applicable only to TCP/UDP/TCP_SSL listeners.
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Forwarding method of a listener. Value range: WRR, LEAST_CONN.
They represent weighted round robin and least connections, respectively. Default value: WRR. This parameter is applicable only to TCP/UDP/TCP_SSL listeners.
     * @param Scheduler Forwarding method of a listener. Value range: WRR, LEAST_CONN.
They represent weighted round robin and least connections, respectively. Default value: WRR. This parameter is applicable only to TCP/UDP/TCP_SSL listeners.
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Whether to enable the SNI feature. This parameter is applicable only to HTTPS listeners 
     * @return SniSwitch Whether to enable the SNI feature. This parameter is applicable only to HTTPS listeners
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set Whether to enable the SNI feature. This parameter is applicable only to HTTPS listeners
     * @param SniSwitch Whether to enable the SNI feature. This parameter is applicable only to HTTPS listeners
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get Target real server type. `NODE`: binding a general node; `TARGETGROUP`: binding a target group. 
     * @return TargetType Target real server type. `NODE`: binding a general node; `TARGETGROUP`: binding a target group.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Target real server type. `NODE`: binding a general node; `TARGETGROUP`: binding a target group.
     * @param TargetType Target real server type. `NODE`: binding a general node; `TARGETGROUP`: binding a target group.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Session persistence type. Valid values: Normal: the default session persistence type; QUIC_CID: session persistence by QUIC connection ID. The `QUIC_CID` value can only be configured in UDP listeners. If this field is not specified, the default session persistence type will be used. 
     * @return SessionType Session persistence type. Valid values: Normal: the default session persistence type; QUIC_CID: session persistence by QUIC connection ID. The `QUIC_CID` value can only be configured in UDP listeners. If this field is not specified, the default session persistence type will be used.
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set Session persistence type. Valid values: Normal: the default session persistence type; QUIC_CID: session persistence by QUIC connection ID. The `QUIC_CID` value can only be configured in UDP listeners. If this field is not specified, the default session persistence type will be used.
     * @param SessionType Session persistence type. Valid values: Normal: the default session persistence type; QUIC_CID: session persistence by QUIC connection ID. The `QUIC_CID` value can only be configured in UDP listeners. If this field is not specified, the default session persistence type will be used.
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get Whether to enable a persistent connection (This parameter can only be configured in HTTP/HTTPS listeners). Valid values: 0: no; 1: yes. Default value: 0 
     * @return KeepaliveEnable Whether to enable a persistent connection (This parameter can only be configured in HTTP/HTTPS listeners). Valid values: 0: no; 1: yes. Default value: 0
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set Whether to enable a persistent connection (This parameter can only be configured in HTTP/HTTPS listeners). Valid values: 0: no; 1: yes. Default value: 0
     * @param KeepaliveEnable Whether to enable a persistent connection (This parameter can only be configured in HTTP/HTTPS listeners). Valid values: 0: no; 1: yes. Default value: 0
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArraySimple(map, prefix + "ListenerNames.", this.ListenerNames);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "SniSwitch", this.SniSwitch);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "SessionType", this.SessionType);
        this.setParamSimple(map, prefix + "KeepaliveEnable", this.KeepaliveEnable);

    }
}

