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

public class CreateListenerRequest extends AbstractModel {

    /**
    * ID of the CLB instance. You can call the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Ports for creating listeners. Each port corresponds to a listener.
Port range: 1–65535.
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * Listener protocol. Valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, and QUIC.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * List of names of listeners to be created. The names correspond to ports one by one. This parameter can be left blank if you do not want to name the listeners immediately.
    */
    @SerializedName("ListenerNames")
    @Expose
    private String [] ListenerNames;

    /**
    * Health check parameter. This parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners.
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * Certificate-related information. The parameter limitations are as follows:
<li>This parameter applies only to TCP_SSL listeners and HTTPS listeners with the SNI feature disabled.</li>
<li>Either this parameter or the MultiCertInfo parameter should be specified when you create a TCP_SSL listener or an HTTPS listener with the SNI feature disabled. You cannot specify them at the same time.</li>
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * Session persistence duration, in seconds. Value range: 30–3600. Default value: 0, indicating that session persistence is not enabled by default. This parameter applies only to TCP and UDP listeners.
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * Listener forwarding mode. valid values: WRR (weighted round-robin), LEAST_CONN (LEAST connections).
Default value: WRR. This parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners.
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Whether to enable the SNI feature. This parameter applies only to HTTPS listeners. 0: disable; 1: enable.
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * Real server type. NODE: ordinary node; TARGETGROUP: real server group. This parameter applies only to TCP and UDP listeners. For layer-7 listeners, set the type in forwarding rules.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Session persistence type. If this parameter is not specified or the value is set to NORMAL, the default session persistence type is used. QUIC_CID: perform session persistence based on QUIC connection ID. If the value is set to QUIC_CID, only the UDP protocol is supported. This parameter applies only to TCP and UDP listeners. For layer-7 listeners, set the type in forwarding rules. (If the value is set to QUIC_CID, the Protocol value should be UDP, the Scheduler value should be WRR, and only IPv4 addresses are supported.)
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * Whether to enable the persistent connection feature. This parameter applies only to HTTP and HTTPS listeners. 0: disable; 1: enable. This feature is disabled by default.
Enable this feature with caution if the maximum number of connections is limited for real servers. This feature is in beta testing. To use it, submit a [beta testing application](https://intl.cloud.tencent.com/apply/p/tsodp6qm21?from_cn_redirect=1).
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

    /**
    * End port. This parameter is required for creating a listener with a port range. In this case, the input parameter Ports allows only one value to indicate the start port. To experience the port range feature, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category).
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
    * Reschedules when unbinding real servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
    * Certificate information. You can import multiple server certificates with different algorithms at the same time. The parameter limitations are as follows:
<li>This parameter applies only to TCP_SSL listeners and HTTPS listeners with the SNI feature disabled.</li>
<li>Either this parameter or the Certificate parameter should be specified when you create a TCP_SSL listener or an HTTPS listener with the SNI feature disabled. You cannot specify them at the same time.</li>
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

    /**
    * Maximum number of connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of connections is not limited. This parameter is not supported for classic network-based instances.
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * Maximum number of new connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of new connections is not limited. This parameter is not supported for classic network-based instances.
    */
    @SerializedName("MaxCps")
    @Expose
    private Long MaxCps;

    /**
    * Specifies the idle connection timeout in seconds. this parameter applies only to TCP/UDP listeners. default value: 900 for TCP listeners and 300 for UDP listeners. value range: 10–900 for shared instances and dedicated instances and 10–1980 for lcu-supported instances. to set a value exceeding the permissible range, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category).
    */
    @SerializedName("IdleConnectTimeout")
    @Expose
    private Long IdleConnectTimeout;

    /**
    * Specifies whether PP is supported for TCP_SSL and QUIC.
    */
    @SerializedName("ProxyProtocol")
    @Expose
    private Boolean ProxyProtocol;

    /**
    * Whether SNAT (source IP replacement) is enabled. valid values: True (enabled), False (disabled). disabled by default. note: when SnatEnable is enabled, the client source IP will be replaced, at this point the `pass through client source IP` option is disabled, and vice versa.
    */
    @SerializedName("SnatEnable")
    @Expose
    private Boolean SnatEnable;

    /**
    * End port of a listener with a port range. Range of the port: 2–65535.
    */
    @SerializedName("FullEndPorts")
    @Expose
    private Long [] FullEndPorts;

    /**
    * Enable private network http listener h2c switch. valid values: True (enable), False (disable).
Disabled by default.
    */
    @SerializedName("H2cSwitch")
    @Expose
    private Boolean H2cSwitch;

    /**
    * Whether to disable SSL for TCP_SSL listeners. dual-stack binding is still supported after SSL is disabled. valid values: True (disable), False (enable).
Disabled by default.
    */
    @SerializedName("SslCloseSwitch")
    @Expose
    private Boolean SslCloseSwitch;

    /**
    * Data compression mode. Valid values: transparent (passthrough mode) and compatibility (compatibility mode).
    */
    @SerializedName("DataCompressMode")
    @Expose
    private String DataCompressMode;

    /**
    * Reschedules when setting backend server weight to 0. only supported for TCP/UDP listeners. toggle on to enable this feature.
    */
    @SerializedName("RescheduleTargetZeroWeight")
    @Expose
    private Boolean RescheduleTargetZeroWeight;

    /**
    * Reschedules when health check exceptions occur on real servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
    */
    @SerializedName("RescheduleUnhealthy")
    @Expose
    private Boolean RescheduleUnhealthy;

    /**
    * Reschedules when adding or removing backend servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
    */
    @SerializedName("RescheduleExpandTarget")
    @Expose
    private Boolean RescheduleExpandTarget;

    /**
    * Specifies the trigger start time for rescheduling. value range: 0-3600s. supported only by TCP/UDP listeners.
    */
    @SerializedName("RescheduleStartTime")
    @Expose
    private Long RescheduleStartTime;

    /**
    * Rescheduling trigger duration. valid values: 0-3600s. only TCP/UDP listeners support this.
    */
    @SerializedName("RescheduleInterval")
    @Expose
    private Long RescheduleInterval;

    /**
     * Get ID of the CLB instance. You can call the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID. 
     * @return LoadBalancerId ID of the CLB instance. You can call the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of the CLB instance. You can call the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID.
     * @param LoadBalancerId ID of the CLB instance. You can call the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Ports for creating listeners. Each port corresponds to a listener.
Port range: 1–65535. 
     * @return Ports Ports for creating listeners. Each port corresponds to a listener.
Port range: 1–65535.
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set Ports for creating listeners. Each port corresponds to a listener.
Port range: 1–65535.
     * @param Ports Ports for creating listeners. Each port corresponds to a listener.
Port range: 1–65535.
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get Listener protocol. Valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, and QUIC. 
     * @return Protocol Listener protocol. Valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, and QUIC.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol. Valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, and QUIC.
     * @param Protocol Listener protocol. Valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, and QUIC.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get List of names of listeners to be created. The names correspond to ports one by one. This parameter can be left blank if you do not want to name the listeners immediately. 
     * @return ListenerNames List of names of listeners to be created. The names correspond to ports one by one. This parameter can be left blank if you do not want to name the listeners immediately.
     */
    public String [] getListenerNames() {
        return this.ListenerNames;
    }

    /**
     * Set List of names of listeners to be created. The names correspond to ports one by one. This parameter can be left blank if you do not want to name the listeners immediately.
     * @param ListenerNames List of names of listeners to be created. The names correspond to ports one by one. This parameter can be left blank if you do not want to name the listeners immediately.
     */
    public void setListenerNames(String [] ListenerNames) {
        this.ListenerNames = ListenerNames;
    }

    /**
     * Get Health check parameter. This parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners. 
     * @return HealthCheck Health check parameter. This parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners.
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check parameter. This parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners.
     * @param HealthCheck Health check parameter. This parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners.
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Certificate-related information. The parameter limitations are as follows:
<li>This parameter applies only to TCP_SSL listeners and HTTPS listeners with the SNI feature disabled.</li>
<li>Either this parameter or the MultiCertInfo parameter should be specified when you create a TCP_SSL listener or an HTTPS listener with the SNI feature disabled. You cannot specify them at the same time.</li> 
     * @return Certificate Certificate-related information. The parameter limitations are as follows:
<li>This parameter applies only to TCP_SSL listeners and HTTPS listeners with the SNI feature disabled.</li>
<li>Either this parameter or the MultiCertInfo parameter should be specified when you create a TCP_SSL listener or an HTTPS listener with the SNI feature disabled. You cannot specify them at the same time.</li>
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Certificate-related information. The parameter limitations are as follows:
<li>This parameter applies only to TCP_SSL listeners and HTTPS listeners with the SNI feature disabled.</li>
<li>Either this parameter or the MultiCertInfo parameter should be specified when you create a TCP_SSL listener or an HTTPS listener with the SNI feature disabled. You cannot specify them at the same time.</li>
     * @param Certificate Certificate-related information. The parameter limitations are as follows:
<li>This parameter applies only to TCP_SSL listeners and HTTPS listeners with the SNI feature disabled.</li>
<li>Either this parameter or the MultiCertInfo parameter should be specified when you create a TCP_SSL listener or an HTTPS listener with the SNI feature disabled. You cannot specify them at the same time.</li>
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get Session persistence duration, in seconds. Value range: 30–3600. Default value: 0, indicating that session persistence is not enabled by default. This parameter applies only to TCP and UDP listeners. 
     * @return SessionExpireTime Session persistence duration, in seconds. Value range: 30–3600. Default value: 0, indicating that session persistence is not enabled by default. This parameter applies only to TCP and UDP listeners.
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set Session persistence duration, in seconds. Value range: 30–3600. Default value: 0, indicating that session persistence is not enabled by default. This parameter applies only to TCP and UDP listeners.
     * @param SessionExpireTime Session persistence duration, in seconds. Value range: 30–3600. Default value: 0, indicating that session persistence is not enabled by default. This parameter applies only to TCP and UDP listeners.
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get Listener forwarding mode. valid values: WRR (weighted round-robin), LEAST_CONN (LEAST connections).
Default value: WRR. This parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners. 
     * @return Scheduler Listener forwarding mode. valid values: WRR (weighted round-robin), LEAST_CONN (LEAST connections).
Default value: WRR. This parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners.
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Listener forwarding mode. valid values: WRR (weighted round-robin), LEAST_CONN (LEAST connections).
Default value: WRR. This parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners.
     * @param Scheduler Listener forwarding mode. valid values: WRR (weighted round-robin), LEAST_CONN (LEAST connections).
Default value: WRR. This parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners.
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Whether to enable the SNI feature. This parameter applies only to HTTPS listeners. 0: disable; 1: enable. 
     * @return SniSwitch Whether to enable the SNI feature. This parameter applies only to HTTPS listeners. 0: disable; 1: enable.
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set Whether to enable the SNI feature. This parameter applies only to HTTPS listeners. 0: disable; 1: enable.
     * @param SniSwitch Whether to enable the SNI feature. This parameter applies only to HTTPS listeners. 0: disable; 1: enable.
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get Real server type. NODE: ordinary node; TARGETGROUP: real server group. This parameter applies only to TCP and UDP listeners. For layer-7 listeners, set the type in forwarding rules. 
     * @return TargetType Real server type. NODE: ordinary node; TARGETGROUP: real server group. This parameter applies only to TCP and UDP listeners. For layer-7 listeners, set the type in forwarding rules.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Real server type. NODE: ordinary node; TARGETGROUP: real server group. This parameter applies only to TCP and UDP listeners. For layer-7 listeners, set the type in forwarding rules.
     * @param TargetType Real server type. NODE: ordinary node; TARGETGROUP: real server group. This parameter applies only to TCP and UDP listeners. For layer-7 listeners, set the type in forwarding rules.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Session persistence type. If this parameter is not specified or the value is set to NORMAL, the default session persistence type is used. QUIC_CID: perform session persistence based on QUIC connection ID. If the value is set to QUIC_CID, only the UDP protocol is supported. This parameter applies only to TCP and UDP listeners. For layer-7 listeners, set the type in forwarding rules. (If the value is set to QUIC_CID, the Protocol value should be UDP, the Scheduler value should be WRR, and only IPv4 addresses are supported.) 
     * @return SessionType Session persistence type. If this parameter is not specified or the value is set to NORMAL, the default session persistence type is used. QUIC_CID: perform session persistence based on QUIC connection ID. If the value is set to QUIC_CID, only the UDP protocol is supported. This parameter applies only to TCP and UDP listeners. For layer-7 listeners, set the type in forwarding rules. (If the value is set to QUIC_CID, the Protocol value should be UDP, the Scheduler value should be WRR, and only IPv4 addresses are supported.)
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set Session persistence type. If this parameter is not specified or the value is set to NORMAL, the default session persistence type is used. QUIC_CID: perform session persistence based on QUIC connection ID. If the value is set to QUIC_CID, only the UDP protocol is supported. This parameter applies only to TCP and UDP listeners. For layer-7 listeners, set the type in forwarding rules. (If the value is set to QUIC_CID, the Protocol value should be UDP, the Scheduler value should be WRR, and only IPv4 addresses are supported.)
     * @param SessionType Session persistence type. If this parameter is not specified or the value is set to NORMAL, the default session persistence type is used. QUIC_CID: perform session persistence based on QUIC connection ID. If the value is set to QUIC_CID, only the UDP protocol is supported. This parameter applies only to TCP and UDP listeners. For layer-7 listeners, set the type in forwarding rules. (If the value is set to QUIC_CID, the Protocol value should be UDP, the Scheduler value should be WRR, and only IPv4 addresses are supported.)
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get Whether to enable the persistent connection feature. This parameter applies only to HTTP and HTTPS listeners. 0: disable; 1: enable. This feature is disabled by default.
Enable this feature with caution if the maximum number of connections is limited for real servers. This feature is in beta testing. To use it, submit a [beta testing application](https://intl.cloud.tencent.com/apply/p/tsodp6qm21?from_cn_redirect=1). 
     * @return KeepaliveEnable Whether to enable the persistent connection feature. This parameter applies only to HTTP and HTTPS listeners. 0: disable; 1: enable. This feature is disabled by default.
Enable this feature with caution if the maximum number of connections is limited for real servers. This feature is in beta testing. To use it, submit a [beta testing application](https://intl.cloud.tencent.com/apply/p/tsodp6qm21?from_cn_redirect=1).
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set Whether to enable the persistent connection feature. This parameter applies only to HTTP and HTTPS listeners. 0: disable; 1: enable. This feature is disabled by default.
Enable this feature with caution if the maximum number of connections is limited for real servers. This feature is in beta testing. To use it, submit a [beta testing application](https://intl.cloud.tencent.com/apply/p/tsodp6qm21?from_cn_redirect=1).
     * @param KeepaliveEnable Whether to enable the persistent connection feature. This parameter applies only to HTTP and HTTPS listeners. 0: disable; 1: enable. This feature is disabled by default.
Enable this feature with caution if the maximum number of connections is limited for real servers. This feature is in beta testing. To use it, submit a [beta testing application](https://intl.cloud.tencent.com/apply/p/tsodp6qm21?from_cn_redirect=1).
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get End port. This parameter is required for creating a listener with a port range. In this case, the input parameter Ports allows only one value to indicate the start port. To experience the port range feature, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category). 
     * @return EndPort End port. This parameter is required for creating a listener with a port range. In this case, the input parameter Ports allows only one value to indicate the start port. To experience the port range feature, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category).
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set End port. This parameter is required for creating a listener with a port range. In this case, the input parameter Ports allows only one value to indicate the start port. To experience the port range feature, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category).
     * @param EndPort End port. This parameter is required for creating a listener with a port range. In this case, the input parameter Ports allows only one value to indicate the start port. To experience the port range feature, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category).
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
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
     * Get Certificate information. You can import multiple server certificates with different algorithms at the same time. The parameter limitations are as follows:
<li>This parameter applies only to TCP_SSL listeners and HTTPS listeners with the SNI feature disabled.</li>
<li>Either this parameter or the Certificate parameter should be specified when you create a TCP_SSL listener or an HTTPS listener with the SNI feature disabled. You cannot specify them at the same time.</li> 
     * @return MultiCertInfo Certificate information. You can import multiple server certificates with different algorithms at the same time. The parameter limitations are as follows:
<li>This parameter applies only to TCP_SSL listeners and HTTPS listeners with the SNI feature disabled.</li>
<li>Either this parameter or the Certificate parameter should be specified when you create a TCP_SSL listener or an HTTPS listener with the SNI feature disabled. You cannot specify them at the same time.</li>
     */
    public MultiCertInfo getMultiCertInfo() {
        return this.MultiCertInfo;
    }

    /**
     * Set Certificate information. You can import multiple server certificates with different algorithms at the same time. The parameter limitations are as follows:
<li>This parameter applies only to TCP_SSL listeners and HTTPS listeners with the SNI feature disabled.</li>
<li>Either this parameter or the Certificate parameter should be specified when you create a TCP_SSL listener or an HTTPS listener with the SNI feature disabled. You cannot specify them at the same time.</li>
     * @param MultiCertInfo Certificate information. You can import multiple server certificates with different algorithms at the same time. The parameter limitations are as follows:
<li>This parameter applies only to TCP_SSL listeners and HTTPS listeners with the SNI feature disabled.</li>
<li>Either this parameter or the Certificate parameter should be specified when you create a TCP_SSL listener or an HTTPS listener with the SNI feature disabled. You cannot specify them at the same time.</li>
     */
    public void setMultiCertInfo(MultiCertInfo MultiCertInfo) {
        this.MultiCertInfo = MultiCertInfo;
    }

    /**
     * Get Maximum number of connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of connections is not limited. This parameter is not supported for classic network-based instances. 
     * @return MaxConn Maximum number of connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of connections is not limited. This parameter is not supported for classic network-based instances.
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set Maximum number of connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of connections is not limited. This parameter is not supported for classic network-based instances.
     * @param MaxConn Maximum number of connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of connections is not limited. This parameter is not supported for classic network-based instances.
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get Maximum number of new connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of new connections is not limited. This parameter is not supported for classic network-based instances. 
     * @return MaxCps Maximum number of new connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of new connections is not limited. This parameter is not supported for classic network-based instances.
     */
    public Long getMaxCps() {
        return this.MaxCps;
    }

    /**
     * Set Maximum number of new connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of new connections is not limited. This parameter is not supported for classic network-based instances.
     * @param MaxCps Maximum number of new connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of new connections is not limited. This parameter is not supported for classic network-based instances.
     */
    public void setMaxCps(Long MaxCps) {
        this.MaxCps = MaxCps;
    }

    /**
     * Get Specifies the idle connection timeout in seconds. this parameter applies only to TCP/UDP listeners. default value: 900 for TCP listeners and 300 for UDP listeners. value range: 10–900 for shared instances and dedicated instances and 10–1980 for lcu-supported instances. to set a value exceeding the permissible range, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category). 
     * @return IdleConnectTimeout Specifies the idle connection timeout in seconds. this parameter applies only to TCP/UDP listeners. default value: 900 for TCP listeners and 300 for UDP listeners. value range: 10–900 for shared instances and dedicated instances and 10–1980 for lcu-supported instances. to set a value exceeding the permissible range, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category).
     */
    public Long getIdleConnectTimeout() {
        return this.IdleConnectTimeout;
    }

    /**
     * Set Specifies the idle connection timeout in seconds. this parameter applies only to TCP/UDP listeners. default value: 900 for TCP listeners and 300 for UDP listeners. value range: 10–900 for shared instances and dedicated instances and 10–1980 for lcu-supported instances. to set a value exceeding the permissible range, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category).
     * @param IdleConnectTimeout Specifies the idle connection timeout in seconds. this parameter applies only to TCP/UDP listeners. default value: 900 for TCP listeners and 300 for UDP listeners. value range: 10–900 for shared instances and dedicated instances and 10–1980 for lcu-supported instances. to set a value exceeding the permissible range, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category).
     */
    public void setIdleConnectTimeout(Long IdleConnectTimeout) {
        this.IdleConnectTimeout = IdleConnectTimeout;
    }

    /**
     * Get Specifies whether PP is supported for TCP_SSL and QUIC. 
     * @return ProxyProtocol Specifies whether PP is supported for TCP_SSL and QUIC.
     */
    public Boolean getProxyProtocol() {
        return this.ProxyProtocol;
    }

    /**
     * Set Specifies whether PP is supported for TCP_SSL and QUIC.
     * @param ProxyProtocol Specifies whether PP is supported for TCP_SSL and QUIC.
     */
    public void setProxyProtocol(Boolean ProxyProtocol) {
        this.ProxyProtocol = ProxyProtocol;
    }

    /**
     * Get Whether SNAT (source IP replacement) is enabled. valid values: True (enabled), False (disabled). disabled by default. note: when SnatEnable is enabled, the client source IP will be replaced, at this point the `pass through client source IP` option is disabled, and vice versa. 
     * @return SnatEnable Whether SNAT (source IP replacement) is enabled. valid values: True (enabled), False (disabled). disabled by default. note: when SnatEnable is enabled, the client source IP will be replaced, at this point the `pass through client source IP` option is disabled, and vice versa.
     */
    public Boolean getSnatEnable() {
        return this.SnatEnable;
    }

    /**
     * Set Whether SNAT (source IP replacement) is enabled. valid values: True (enabled), False (disabled). disabled by default. note: when SnatEnable is enabled, the client source IP will be replaced, at this point the `pass through client source IP` option is disabled, and vice versa.
     * @param SnatEnable Whether SNAT (source IP replacement) is enabled. valid values: True (enabled), False (disabled). disabled by default. note: when SnatEnable is enabled, the client source IP will be replaced, at this point the `pass through client source IP` option is disabled, and vice versa.
     */
    public void setSnatEnable(Boolean SnatEnable) {
        this.SnatEnable = SnatEnable;
    }

    /**
     * Get End port of a listener with a port range. Range of the port: 2–65535. 
     * @return FullEndPorts End port of a listener with a port range. Range of the port: 2–65535.
     */
    public Long [] getFullEndPorts() {
        return this.FullEndPorts;
    }

    /**
     * Set End port of a listener with a port range. Range of the port: 2–65535.
     * @param FullEndPorts End port of a listener with a port range. Range of the port: 2–65535.
     */
    public void setFullEndPorts(Long [] FullEndPorts) {
        this.FullEndPorts = FullEndPorts;
    }

    /**
     * Get Enable private network http listener h2c switch. valid values: True (enable), False (disable).
Disabled by default. 
     * @return H2cSwitch Enable private network http listener h2c switch. valid values: True (enable), False (disable).
Disabled by default.
     */
    public Boolean getH2cSwitch() {
        return this.H2cSwitch;
    }

    /**
     * Set Enable private network http listener h2c switch. valid values: True (enable), False (disable).
Disabled by default.
     * @param H2cSwitch Enable private network http listener h2c switch. valid values: True (enable), False (disable).
Disabled by default.
     */
    public void setH2cSwitch(Boolean H2cSwitch) {
        this.H2cSwitch = H2cSwitch;
    }

    /**
     * Get Whether to disable SSL for TCP_SSL listeners. dual-stack binding is still supported after SSL is disabled. valid values: True (disable), False (enable).
Disabled by default. 
     * @return SslCloseSwitch Whether to disable SSL for TCP_SSL listeners. dual-stack binding is still supported after SSL is disabled. valid values: True (disable), False (enable).
Disabled by default.
     */
    public Boolean getSslCloseSwitch() {
        return this.SslCloseSwitch;
    }

    /**
     * Set Whether to disable SSL for TCP_SSL listeners. dual-stack binding is still supported after SSL is disabled. valid values: True (disable), False (enable).
Disabled by default.
     * @param SslCloseSwitch Whether to disable SSL for TCP_SSL listeners. dual-stack binding is still supported after SSL is disabled. valid values: True (disable), False (enable).
Disabled by default.
     */
    public void setSslCloseSwitch(Boolean SslCloseSwitch) {
        this.SslCloseSwitch = SslCloseSwitch;
    }

    /**
     * Get Data compression mode. Valid values: transparent (passthrough mode) and compatibility (compatibility mode). 
     * @return DataCompressMode Data compression mode. Valid values: transparent (passthrough mode) and compatibility (compatibility mode).
     */
    public String getDataCompressMode() {
        return this.DataCompressMode;
    }

    /**
     * Set Data compression mode. Valid values: transparent (passthrough mode) and compatibility (compatibility mode).
     * @param DataCompressMode Data compression mode. Valid values: transparent (passthrough mode) and compatibility (compatibility mode).
     */
    public void setDataCompressMode(String DataCompressMode) {
        this.DataCompressMode = DataCompressMode;
    }

    /**
     * Get Reschedules when setting backend server weight to 0. only supported for TCP/UDP listeners. toggle on to enable this feature. 
     * @return RescheduleTargetZeroWeight Reschedules when setting backend server weight to 0. only supported for TCP/UDP listeners. toggle on to enable this feature.
     */
    public Boolean getRescheduleTargetZeroWeight() {
        return this.RescheduleTargetZeroWeight;
    }

    /**
     * Set Reschedules when setting backend server weight to 0. only supported for TCP/UDP listeners. toggle on to enable this feature.
     * @param RescheduleTargetZeroWeight Reschedules when setting backend server weight to 0. only supported for TCP/UDP listeners. toggle on to enable this feature.
     */
    public void setRescheduleTargetZeroWeight(Boolean RescheduleTargetZeroWeight) {
        this.RescheduleTargetZeroWeight = RescheduleTargetZeroWeight;
    }

    /**
     * Get Reschedules when health check exceptions occur on real servers. only supported for TCP/UDP listeners. toggle on to enable this feature. 
     * @return RescheduleUnhealthy Reschedules when health check exceptions occur on real servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
     */
    public Boolean getRescheduleUnhealthy() {
        return this.RescheduleUnhealthy;
    }

    /**
     * Set Reschedules when health check exceptions occur on real servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
     * @param RescheduleUnhealthy Reschedules when health check exceptions occur on real servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
     */
    public void setRescheduleUnhealthy(Boolean RescheduleUnhealthy) {
        this.RescheduleUnhealthy = RescheduleUnhealthy;
    }

    /**
     * Get Reschedules when adding or removing backend servers. only supported for TCP/UDP listeners. toggle on to enable this feature. 
     * @return RescheduleExpandTarget Reschedules when adding or removing backend servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
     */
    public Boolean getRescheduleExpandTarget() {
        return this.RescheduleExpandTarget;
    }

    /**
     * Set Reschedules when adding or removing backend servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
     * @param RescheduleExpandTarget Reschedules when adding or removing backend servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
     */
    public void setRescheduleExpandTarget(Boolean RescheduleExpandTarget) {
        this.RescheduleExpandTarget = RescheduleExpandTarget;
    }

    /**
     * Get Specifies the trigger start time for rescheduling. value range: 0-3600s. supported only by TCP/UDP listeners. 
     * @return RescheduleStartTime Specifies the trigger start time for rescheduling. value range: 0-3600s. supported only by TCP/UDP listeners.
     */
    public Long getRescheduleStartTime() {
        return this.RescheduleStartTime;
    }

    /**
     * Set Specifies the trigger start time for rescheduling. value range: 0-3600s. supported only by TCP/UDP listeners.
     * @param RescheduleStartTime Specifies the trigger start time for rescheduling. value range: 0-3600s. supported only by TCP/UDP listeners.
     */
    public void setRescheduleStartTime(Long RescheduleStartTime) {
        this.RescheduleStartTime = RescheduleStartTime;
    }

    /**
     * Get Rescheduling trigger duration. valid values: 0-3600s. only TCP/UDP listeners support this. 
     * @return RescheduleInterval Rescheduling trigger duration. valid values: 0-3600s. only TCP/UDP listeners support this.
     */
    public Long getRescheduleInterval() {
        return this.RescheduleInterval;
    }

    /**
     * Set Rescheduling trigger duration. valid values: 0-3600s. only TCP/UDP listeners support this.
     * @param RescheduleInterval Rescheduling trigger duration. valid values: 0-3600s. only TCP/UDP listeners support this.
     */
    public void setRescheduleInterval(Long RescheduleInterval) {
        this.RescheduleInterval = RescheduleInterval;
    }

    public CreateListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateListenerRequest(CreateListenerRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.Ports != null) {
            this.Ports = new Long[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new Long(source.Ports[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ListenerNames != null) {
            this.ListenerNames = new String[source.ListenerNames.length];
            for (int i = 0; i < source.ListenerNames.length; i++) {
                this.ListenerNames[i] = new String(source.ListenerNames[i]);
            }
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new HealthCheck(source.HealthCheck);
        }
        if (source.Certificate != null) {
            this.Certificate = new CertificateInput(source.Certificate);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
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
        if (source.SessionType != null) {
            this.SessionType = new String(source.SessionType);
        }
        if (source.KeepaliveEnable != null) {
            this.KeepaliveEnable = new Long(source.KeepaliveEnable);
        }
        if (source.EndPort != null) {
            this.EndPort = new Long(source.EndPort);
        }
        if (source.DeregisterTargetRst != null) {
            this.DeregisterTargetRst = new Boolean(source.DeregisterTargetRst);
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
        if (source.IdleConnectTimeout != null) {
            this.IdleConnectTimeout = new Long(source.IdleConnectTimeout);
        }
        if (source.ProxyProtocol != null) {
            this.ProxyProtocol = new Boolean(source.ProxyProtocol);
        }
        if (source.SnatEnable != null) {
            this.SnatEnable = new Boolean(source.SnatEnable);
        }
        if (source.FullEndPorts != null) {
            this.FullEndPorts = new Long[source.FullEndPorts.length];
            for (int i = 0; i < source.FullEndPorts.length; i++) {
                this.FullEndPorts[i] = new Long(source.FullEndPorts[i]);
            }
        }
        if (source.H2cSwitch != null) {
            this.H2cSwitch = new Boolean(source.H2cSwitch);
        }
        if (source.SslCloseSwitch != null) {
            this.SslCloseSwitch = new Boolean(source.SslCloseSwitch);
        }
        if (source.DataCompressMode != null) {
            this.DataCompressMode = new String(source.DataCompressMode);
        }
        if (source.RescheduleTargetZeroWeight != null) {
            this.RescheduleTargetZeroWeight = new Boolean(source.RescheduleTargetZeroWeight);
        }
        if (source.RescheduleUnhealthy != null) {
            this.RescheduleUnhealthy = new Boolean(source.RescheduleUnhealthy);
        }
        if (source.RescheduleExpandTarget != null) {
            this.RescheduleExpandTarget = new Boolean(source.RescheduleExpandTarget);
        }
        if (source.RescheduleStartTime != null) {
            this.RescheduleStartTime = new Long(source.RescheduleStartTime);
        }
        if (source.RescheduleInterval != null) {
            this.RescheduleInterval = new Long(source.RescheduleInterval);
        }
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
        this.setParamSimple(map, prefix + "EndPort", this.EndPort);
        this.setParamSimple(map, prefix + "DeregisterTargetRst", this.DeregisterTargetRst);
        this.setParamObj(map, prefix + "MultiCertInfo.", this.MultiCertInfo);
        this.setParamSimple(map, prefix + "MaxConn", this.MaxConn);
        this.setParamSimple(map, prefix + "MaxCps", this.MaxCps);
        this.setParamSimple(map, prefix + "IdleConnectTimeout", this.IdleConnectTimeout);
        this.setParamSimple(map, prefix + "ProxyProtocol", this.ProxyProtocol);
        this.setParamSimple(map, prefix + "SnatEnable", this.SnatEnable);
        this.setParamArraySimple(map, prefix + "FullEndPorts.", this.FullEndPorts);
        this.setParamSimple(map, prefix + "H2cSwitch", this.H2cSwitch);
        this.setParamSimple(map, prefix + "SslCloseSwitch", this.SslCloseSwitch);
        this.setParamSimple(map, prefix + "DataCompressMode", this.DataCompressMode);
        this.setParamSimple(map, prefix + "RescheduleTargetZeroWeight", this.RescheduleTargetZeroWeight);
        this.setParamSimple(map, prefix + "RescheduleUnhealthy", this.RescheduleUnhealthy);
        this.setParamSimple(map, prefix + "RescheduleExpandTarget", this.RescheduleExpandTarget);
        this.setParamSimple(map, prefix + "RescheduleStartTime", this.RescheduleStartTime);
        this.setParamSimple(map, prefix + "RescheduleInterval", this.RescheduleInterval);

    }
}

