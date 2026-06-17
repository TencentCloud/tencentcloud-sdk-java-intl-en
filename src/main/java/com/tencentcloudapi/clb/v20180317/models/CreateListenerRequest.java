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
    * <p>ID of the Cloud Load Balancer (CLB) instance. You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to obtain the ID.</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>Which ports to create listeners on, each port maps to a new listener.<br>Port range: 1–65535</p>
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * <p>Listener protocol. Valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, and QUIC.</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>List of listener names to be created. Names correspond sequentially to Ports. If naming is not immediately necessary, this parameter need not be provided. Naming rule: 1-80 characters including English letters, Chinese characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
    */
    @SerializedName("ListenerNames")
    @Expose
    private String [] ListenerNames;

    /**
    * <p>Health check parameters. This parameter is applicable only to TCP/UDP/TCP_SSL/QUIC listeners.</p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * <p>Certificate-related information. The limits are as follows:</p><li>This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with SNI feature disabled.</li><li>When creating a TCP_SSL listener or an HTTPS listener with SNI feature disabled, a minimum of this parameter or MultiCertInfo must be specified, but they cannot be specified at the same time.</li>
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * <p>Session persistence duration, in seconds. Value range: 30–3600. Default value: 0, indicating that session persistence is not enabled by default. This parameter applies only to TCP and UDP listeners.</p>
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * <p>Listener forwarding mode. Available values: WRR (weighted round-robin), LEAST_CONN (least connections).<br>Default WRR. This parameter is applicable only to TCP/UDP/TCP_SSL/QUIC listeners.</p>
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * <p>Whether to enable SNI feature. This parameter applies only to HTTPS listeners. 0: not enabled, 1: enable.</p>
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * <p>Backend target type. NODE indicates binding to a general node. TARGETGROUP indicates binding to a target group. This parameter is applicable only to TCP/UDP listeners. For layer-7 (HTTP/HTTPS) listeners, configure it in forwarding rules.</p>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>Session persistence type. Leaving it blank or passing NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on QUIC Connection ID. QUIC_CID supports only UDP Protocol. This parameter is applicable only to TCP/UDP listeners. Layer-7 (HTTP/HTTPS) listeners should set this in forwarding rules. (If QUIC_CID is selected, Protocol must be UDP, Scheduler must be WRR, and it supports only ipv4 concurrently).</p>
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS listeners. 0: off by default; 1: enable. <br>If the backend service has a connection limit, enable with caution. This feature is currently in internal testing. If you need to use it, submit a <a href="https://www.tencentcloud.com/apply/p/tsodp6qm21?from_cn_redirect=1">beta application</a>.</p>
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

    /**
    * <p>End port. This parameter is required for creating a listener with a port range. In this case, the input parameter Ports allows only one value to indicate the start port. To experience the port range feature, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category).</p>
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
    * <p>Rescheduling feature, which provides a switch for scaling out the backend service. If the switch is toggled on, rescheduling is triggered when the backend service is unbound. This parameter is applicable only to TCP/UDP listeners.</p>
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
    * <p>Certificate information. Multiple server certificates with different algorithm types can be imported at the same time. Parameter constraints are as follows:</p><li>This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with SNI feature disabled.</li><li>When creating a TCP_SSL listener or an HTTPS listener with SNI feature disabled, a minimum of this parameter or Certificate must be specified, but they cannot be specified at the same time.</li>
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

    /**
    * <p>Maximum number of connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of connections is not limited. This parameter is not supported for classic network-based instances.</p>
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * <p>Maximum number of new connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of new connections is not limited. This parameter is not supported for classic network-based instances.</p>
    */
    @SerializedName("MaxCps")
    @Expose
    private Long MaxCps;

    /**
    * <p>Idle connection timeout, in seconds. This parameter applies only to TCP/UDP listeners. Default value: 900 for TCP listeners and 300 for UDP listeners. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances. To set a value exceeding the permissible range, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket for application</a>.</p><p>Permissible range: [10, 1980]</p><p>Measurement unit: seconds</p><p>Default value: 900</p><p>Default value: 900 for TCP listeners and 300 for UDP listeners. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances.</p>
    */
    @SerializedName("IdleConnectTimeout")
    @Expose
    private Long IdleConnectTimeout;

    /**
    * <p>Whether TCP_SSL and QUIC support PP</p>
    */
    @SerializedName("ProxyProtocol")
    @Expose
    private Boolean ProxyProtocol;

    /**
    * <p>Whether SNAT (source IP replacement) is enabled, True (enabled), False (disabled). Disabled by default. Note: When SnatEnable is enabled, the client source IP will be replaced. At this point, the <code>Pass through client source IP</code> option is disabled, and vice versa.</p>
    */
    @SerializedName("SnatEnable")
    @Expose
    private Boolean SnatEnable;

    /**
    * <p>End port of a listener with a port range. Range of the port: 2–65535.</p>
    */
    @SerializedName("FullEndPorts")
    @Expose
    private Long [] FullEndPorts;

    /**
    * <p>Enable the h2c switch for the private network HTTP listener.<br>True (enabled), False (disabled). Disabled by default.<br>Once enabled, the listener only supports creating layer-7 rules with GRPC or GRPCS as the backend forwarding type. When creating rules, explicitly input GRPC or GRPCS in Rules.N.ForwardType.</p>
    */
    @SerializedName("H2cSwitch")
    @Expose
    private Boolean H2cSwitch;

    /**
    * <p>Control whether to remove the SSL encryption layer for TCP_SSL listeners. Once enabled, the listener will run as a normal TCP protocol. Available values:</p><ul><li>True: Disable SSL (protocol downgraded to plain text TCP).</li><li>False (default): Keep SSL enabled.</li></ul>
    */
    @SerializedName("SslCloseSwitch")
    @Expose
    private Boolean SslCloseSwitch;

    /**
    * <p>Data compression mode. Valid values: transparent (passthrough mode) and compatibility (compatibility mode).</p>
    */
    @SerializedName("DataCompressMode")
    @Expose
    private String DataCompressMode;

    /**
    * <p>Rescheduling feature, which provides a switch for changing the weight to 0. If the switch is toggled on, rescheduling is triggered when the weight of a real server is changed to 0. This parameter is applicable only to TCP/UDP listeners.</p>
    */
    @SerializedName("RescheduleTargetZeroWeight")
    @Expose
    private Boolean RescheduleTargetZeroWeight;

    /**
    * <p>Rescheduling feature, which provides a switch for detecting health check exceptions. If the switch is toggled on, rescheduling is triggered when the real server health check fails. This parameter is applicable only to TCP/UDP listeners.</p>
    */
    @SerializedName("RescheduleUnhealthy")
    @Expose
    private Boolean RescheduleUnhealthy;

    /**
    * <p>Rescheduling feature, which provides a switch for scaling out real servers. If the switch is toggled on, rescheduling is triggered when the number of real servers increases or decreases. This parameter is applicable only to TCP/UDP listeners.</p>
    */
    @SerializedName("RescheduleExpandTarget")
    @Expose
    private Boolean RescheduleExpandTarget;

    /**
    * <p>Rescheduling trigger start time. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners.</p>
    */
    @SerializedName("RescheduleStartTime")
    @Expose
    private Long RescheduleStartTime;

    /**
    * <p>Rescheduling trigger duration. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners.</p>
    */
    @SerializedName("RescheduleInterval")
    @Expose
    private Long RescheduleInterval;

    /**
     * Get <p>ID of the Cloud Load Balancer (CLB) instance. You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to obtain the ID.</p> 
     * @return LoadBalancerId <p>ID of the Cloud Load Balancer (CLB) instance. You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to obtain the ID.</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>ID of the Cloud Load Balancer (CLB) instance. You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to obtain the ID.</p>
     * @param LoadBalancerId <p>ID of the Cloud Load Balancer (CLB) instance. You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to obtain the ID.</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>Which ports to create listeners on, each port maps to a new listener.<br>Port range: 1–65535</p> 
     * @return Ports <p>Which ports to create listeners on, each port maps to a new listener.<br>Port range: 1–65535</p>
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set <p>Which ports to create listeners on, each port maps to a new listener.<br>Port range: 1–65535</p>
     * @param Ports <p>Which ports to create listeners on, each port maps to a new listener.<br>Port range: 1–65535</p>
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get <p>Listener protocol. Valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, and QUIC.</p> 
     * @return Protocol <p>Listener protocol. Valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, and QUIC.</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Listener protocol. Valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, and QUIC.</p>
     * @param Protocol <p>Listener protocol. Valid values: TCP, UDP, HTTP, HTTPS, TCP_SSL, and QUIC.</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>List of listener names to be created. Names correspond sequentially to Ports. If naming is not immediately necessary, this parameter need not be provided. Naming rule: 1-80 characters including English letters, Chinese characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p> 
     * @return ListenerNames <p>List of listener names to be created. Names correspond sequentially to Ports. If naming is not immediately necessary, this parameter need not be provided. Naming rule: 1-80 characters including English letters, Chinese characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
     */
    public String [] getListenerNames() {
        return this.ListenerNames;
    }

    /**
     * Set <p>List of listener names to be created. Names correspond sequentially to Ports. If naming is not immediately necessary, this parameter need not be provided. Naming rule: 1-80 characters including English letters, Chinese characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
     * @param ListenerNames <p>List of listener names to be created. Names correspond sequentially to Ports. If naming is not immediately necessary, this parameter need not be provided. Naming rule: 1-80 characters including English letters, Chinese characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
     */
    public void setListenerNames(String [] ListenerNames) {
        this.ListenerNames = ListenerNames;
    }

    /**
     * Get <p>Health check parameters. This parameter is applicable only to TCP/UDP/TCP_SSL/QUIC listeners.</p> 
     * @return HealthCheck <p>Health check parameters. This parameter is applicable only to TCP/UDP/TCP_SSL/QUIC listeners.</p>
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>Health check parameters. This parameter is applicable only to TCP/UDP/TCP_SSL/QUIC listeners.</p>
     * @param HealthCheck <p>Health check parameters. This parameter is applicable only to TCP/UDP/TCP_SSL/QUIC listeners.</p>
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>Certificate-related information. The limits are as follows:</p><li>This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with SNI feature disabled.</li><li>When creating a TCP_SSL listener or an HTTPS listener with SNI feature disabled, a minimum of this parameter or MultiCertInfo must be specified, but they cannot be specified at the same time.</li> 
     * @return Certificate <p>Certificate-related information. The limits are as follows:</p><li>This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with SNI feature disabled.</li><li>When creating a TCP_SSL listener or an HTTPS listener with SNI feature disabled, a minimum of this parameter or MultiCertInfo must be specified, but they cannot be specified at the same time.</li>
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set <p>Certificate-related information. The limits are as follows:</p><li>This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with SNI feature disabled.</li><li>When creating a TCP_SSL listener or an HTTPS listener with SNI feature disabled, a minimum of this parameter or MultiCertInfo must be specified, but they cannot be specified at the same time.</li>
     * @param Certificate <p>Certificate-related information. The limits are as follows:</p><li>This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with SNI feature disabled.</li><li>When creating a TCP_SSL listener or an HTTPS listener with SNI feature disabled, a minimum of this parameter or MultiCertInfo must be specified, but they cannot be specified at the same time.</li>
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get <p>Session persistence duration, in seconds. Value range: 30–3600. Default value: 0, indicating that session persistence is not enabled by default. This parameter applies only to TCP and UDP listeners.</p> 
     * @return SessionExpireTime <p>Session persistence duration, in seconds. Value range: 30–3600. Default value: 0, indicating that session persistence is not enabled by default. This parameter applies only to TCP and UDP listeners.</p>
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set <p>Session persistence duration, in seconds. Value range: 30–3600. Default value: 0, indicating that session persistence is not enabled by default. This parameter applies only to TCP and UDP listeners.</p>
     * @param SessionExpireTime <p>Session persistence duration, in seconds. Value range: 30–3600. Default value: 0, indicating that session persistence is not enabled by default. This parameter applies only to TCP and UDP listeners.</p>
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get <p>Listener forwarding mode. Available values: WRR (weighted round-robin), LEAST_CONN (least connections).<br>Default WRR. This parameter is applicable only to TCP/UDP/TCP_SSL/QUIC listeners.</p> 
     * @return Scheduler <p>Listener forwarding mode. Available values: WRR (weighted round-robin), LEAST_CONN (least connections).<br>Default WRR. This parameter is applicable only to TCP/UDP/TCP_SSL/QUIC listeners.</p>
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set <p>Listener forwarding mode. Available values: WRR (weighted round-robin), LEAST_CONN (least connections).<br>Default WRR. This parameter is applicable only to TCP/UDP/TCP_SSL/QUIC listeners.</p>
     * @param Scheduler <p>Listener forwarding mode. Available values: WRR (weighted round-robin), LEAST_CONN (least connections).<br>Default WRR. This parameter is applicable only to TCP/UDP/TCP_SSL/QUIC listeners.</p>
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get <p>Whether to enable SNI feature. This parameter applies only to HTTPS listeners. 0: not enabled, 1: enable.</p> 
     * @return SniSwitch <p>Whether to enable SNI feature. This parameter applies only to HTTPS listeners. 0: not enabled, 1: enable.</p>
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set <p>Whether to enable SNI feature. This parameter applies only to HTTPS listeners. 0: not enabled, 1: enable.</p>
     * @param SniSwitch <p>Whether to enable SNI feature. This parameter applies only to HTTPS listeners. 0: not enabled, 1: enable.</p>
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get <p>Backend target type. NODE indicates binding to a general node. TARGETGROUP indicates binding to a target group. This parameter is applicable only to TCP/UDP listeners. For layer-7 (HTTP/HTTPS) listeners, configure it in forwarding rules.</p> 
     * @return TargetType <p>Backend target type. NODE indicates binding to a general node. TARGETGROUP indicates binding to a target group. This parameter is applicable only to TCP/UDP listeners. For layer-7 (HTTP/HTTPS) listeners, configure it in forwarding rules.</p>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>Backend target type. NODE indicates binding to a general node. TARGETGROUP indicates binding to a target group. This parameter is applicable only to TCP/UDP listeners. For layer-7 (HTTP/HTTPS) listeners, configure it in forwarding rules.</p>
     * @param TargetType <p>Backend target type. NODE indicates binding to a general node. TARGETGROUP indicates binding to a target group. This parameter is applicable only to TCP/UDP listeners. For layer-7 (HTTP/HTTPS) listeners, configure it in forwarding rules.</p>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>Session persistence type. Leaving it blank or passing NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on QUIC Connection ID. QUIC_CID supports only UDP Protocol. This parameter is applicable only to TCP/UDP listeners. Layer-7 (HTTP/HTTPS) listeners should set this in forwarding rules. (If QUIC_CID is selected, Protocol must be UDP, Scheduler must be WRR, and it supports only ipv4 concurrently).</p> 
     * @return SessionType <p>Session persistence type. Leaving it blank or passing NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on QUIC Connection ID. QUIC_CID supports only UDP Protocol. This parameter is applicable only to TCP/UDP listeners. Layer-7 (HTTP/HTTPS) listeners should set this in forwarding rules. (If QUIC_CID is selected, Protocol must be UDP, Scheduler must be WRR, and it supports only ipv4 concurrently).</p>
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set <p>Session persistence type. Leaving it blank or passing NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on QUIC Connection ID. QUIC_CID supports only UDP Protocol. This parameter is applicable only to TCP/UDP listeners. Layer-7 (HTTP/HTTPS) listeners should set this in forwarding rules. (If QUIC_CID is selected, Protocol must be UDP, Scheduler must be WRR, and it supports only ipv4 concurrently).</p>
     * @param SessionType <p>Session persistence type. Leaving it blank or passing NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on QUIC Connection ID. QUIC_CID supports only UDP Protocol. This parameter is applicable only to TCP/UDP listeners. Layer-7 (HTTP/HTTPS) listeners should set this in forwarding rules. (If QUIC_CID is selected, Protocol must be UDP, Scheduler must be WRR, and it supports only ipv4 concurrently).</p>
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS listeners. 0: off by default; 1: enable. <br>If the backend service has a connection limit, enable with caution. This feature is currently in internal testing. If you need to use it, submit a <a href="https://www.tencentcloud.com/apply/p/tsodp6qm21?from_cn_redirect=1">beta application</a>.</p> 
     * @return KeepaliveEnable <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS listeners. 0: off by default; 1: enable. <br>If the backend service has a connection limit, enable with caution. This feature is currently in internal testing. If you need to use it, submit a <a href="https://www.tencentcloud.com/apply/p/tsodp6qm21?from_cn_redirect=1">beta application</a>.</p>
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS listeners. 0: off by default; 1: enable. <br>If the backend service has a connection limit, enable with caution. This feature is currently in internal testing. If you need to use it, submit a <a href="https://www.tencentcloud.com/apply/p/tsodp6qm21?from_cn_redirect=1">beta application</a>.</p>
     * @param KeepaliveEnable <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS listeners. 0: off by default; 1: enable. <br>If the backend service has a connection limit, enable with caution. This feature is currently in internal testing. If you need to use it, submit a <a href="https://www.tencentcloud.com/apply/p/tsodp6qm21?from_cn_redirect=1">beta application</a>.</p>
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get <p>End port. This parameter is required for creating a listener with a port range. In this case, the input parameter Ports allows only one value to indicate the start port. To experience the port range feature, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category).</p> 
     * @return EndPort <p>End port. This parameter is required for creating a listener with a port range. In this case, the input parameter Ports allows only one value to indicate the start port. To experience the port range feature, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category).</p>
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set <p>End port. This parameter is required for creating a listener with a port range. In this case, the input parameter Ports allows only one value to indicate the start port. To experience the port range feature, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category).</p>
     * @param EndPort <p>End port. This parameter is required for creating a listener with a port range. In this case, the input parameter Ports allows only one value to indicate the start port. To experience the port range feature, [submit a ticket for application](https://console.cloud.tencent.com/workorder/category).</p>
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
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
     * Get <p>Certificate information. Multiple server certificates with different algorithm types can be imported at the same time. Parameter constraints are as follows:</p><li>This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with SNI feature disabled.</li><li>When creating a TCP_SSL listener or an HTTPS listener with SNI feature disabled, a minimum of this parameter or Certificate must be specified, but they cannot be specified at the same time.</li> 
     * @return MultiCertInfo <p>Certificate information. Multiple server certificates with different algorithm types can be imported at the same time. Parameter constraints are as follows:</p><li>This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with SNI feature disabled.</li><li>When creating a TCP_SSL listener or an HTTPS listener with SNI feature disabled, a minimum of this parameter or Certificate must be specified, but they cannot be specified at the same time.</li>
     */
    public MultiCertInfo getMultiCertInfo() {
        return this.MultiCertInfo;
    }

    /**
     * Set <p>Certificate information. Multiple server certificates with different algorithm types can be imported at the same time. Parameter constraints are as follows:</p><li>This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with SNI feature disabled.</li><li>When creating a TCP_SSL listener or an HTTPS listener with SNI feature disabled, a minimum of this parameter or Certificate must be specified, but they cannot be specified at the same time.</li>
     * @param MultiCertInfo <p>Certificate information. Multiple server certificates with different algorithm types can be imported at the same time. Parameter constraints are as follows:</p><li>This parameter is applicable only to TCP_SSL listeners and HTTPS listeners with SNI feature disabled.</li><li>When creating a TCP_SSL listener or an HTTPS listener with SNI feature disabled, a minimum of this parameter or Certificate must be specified, but they cannot be specified at the same time.</li>
     */
    public void setMultiCertInfo(MultiCertInfo MultiCertInfo) {
        this.MultiCertInfo = MultiCertInfo;
    }

    /**
     * Get <p>Maximum number of connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of connections is not limited. This parameter is not supported for classic network-based instances.</p> 
     * @return MaxConn <p>Maximum number of connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of connections is not limited. This parameter is not supported for classic network-based instances.</p>
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set <p>Maximum number of connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of connections is not limited. This parameter is not supported for classic network-based instances.</p>
     * @param MaxConn <p>Maximum number of connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of connections is not limited. This parameter is not supported for classic network-based instances.</p>
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get <p>Maximum number of new connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of new connections is not limited. This parameter is not supported for classic network-based instances.</p> 
     * @return MaxCps <p>Maximum number of new connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of new connections is not limited. This parameter is not supported for classic network-based instances.</p>
     */
    public Long getMaxCps() {
        return this.MaxCps;
    }

    /**
     * Set <p>Maximum number of new connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of new connections is not limited. This parameter is not supported for classic network-based instances.</p>
     * @param MaxCps <p>Maximum number of new connections to a listener. Currently, this parameter applies only to TCP, UDP, TCP_SSL, and QUIC listeners of LCU-supported instances. If this parameter is not specified or the value is set to -1, the maximum number of new connections is not limited. This parameter is not supported for classic network-based instances.</p>
     */
    public void setMaxCps(Long MaxCps) {
        this.MaxCps = MaxCps;
    }

    /**
     * Get <p>Idle connection timeout, in seconds. This parameter applies only to TCP/UDP listeners. Default value: 900 for TCP listeners and 300 for UDP listeners. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances. To set a value exceeding the permissible range, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket for application</a>.</p><p>Permissible range: [10, 1980]</p><p>Measurement unit: seconds</p><p>Default value: 900</p><p>Default value: 900 for TCP listeners and 300 for UDP listeners. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances.</p> 
     * @return IdleConnectTimeout <p>Idle connection timeout, in seconds. This parameter applies only to TCP/UDP listeners. Default value: 900 for TCP listeners and 300 for UDP listeners. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances. To set a value exceeding the permissible range, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket for application</a>.</p><p>Permissible range: [10, 1980]</p><p>Measurement unit: seconds</p><p>Default value: 900</p><p>Default value: 900 for TCP listeners and 300 for UDP listeners. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances.</p>
     */
    public Long getIdleConnectTimeout() {
        return this.IdleConnectTimeout;
    }

    /**
     * Set <p>Idle connection timeout, in seconds. This parameter applies only to TCP/UDP listeners. Default value: 900 for TCP listeners and 300 for UDP listeners. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances. To set a value exceeding the permissible range, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket for application</a>.</p><p>Permissible range: [10, 1980]</p><p>Measurement unit: seconds</p><p>Default value: 900</p><p>Default value: 900 for TCP listeners and 300 for UDP listeners. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances.</p>
     * @param IdleConnectTimeout <p>Idle connection timeout, in seconds. This parameter applies only to TCP/UDP listeners. Default value: 900 for TCP listeners and 300 for UDP listeners. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances. To set a value exceeding the permissible range, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket for application</a>.</p><p>Permissible range: [10, 1980]</p><p>Measurement unit: seconds</p><p>Default value: 900</p><p>Default value: 900 for TCP listeners and 300 for UDP listeners. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances.</p>
     */
    public void setIdleConnectTimeout(Long IdleConnectTimeout) {
        this.IdleConnectTimeout = IdleConnectTimeout;
    }

    /**
     * Get <p>Whether TCP_SSL and QUIC support PP</p> 
     * @return ProxyProtocol <p>Whether TCP_SSL and QUIC support PP</p>
     */
    public Boolean getProxyProtocol() {
        return this.ProxyProtocol;
    }

    /**
     * Set <p>Whether TCP_SSL and QUIC support PP</p>
     * @param ProxyProtocol <p>Whether TCP_SSL and QUIC support PP</p>
     */
    public void setProxyProtocol(Boolean ProxyProtocol) {
        this.ProxyProtocol = ProxyProtocol;
    }

    /**
     * Get <p>Whether SNAT (source IP replacement) is enabled, True (enabled), False (disabled). Disabled by default. Note: When SnatEnable is enabled, the client source IP will be replaced. At this point, the <code>Pass through client source IP</code> option is disabled, and vice versa.</p> 
     * @return SnatEnable <p>Whether SNAT (source IP replacement) is enabled, True (enabled), False (disabled). Disabled by default. Note: When SnatEnable is enabled, the client source IP will be replaced. At this point, the <code>Pass through client source IP</code> option is disabled, and vice versa.</p>
     */
    public Boolean getSnatEnable() {
        return this.SnatEnable;
    }

    /**
     * Set <p>Whether SNAT (source IP replacement) is enabled, True (enabled), False (disabled). Disabled by default. Note: When SnatEnable is enabled, the client source IP will be replaced. At this point, the <code>Pass through client source IP</code> option is disabled, and vice versa.</p>
     * @param SnatEnable <p>Whether SNAT (source IP replacement) is enabled, True (enabled), False (disabled). Disabled by default. Note: When SnatEnable is enabled, the client source IP will be replaced. At this point, the <code>Pass through client source IP</code> option is disabled, and vice versa.</p>
     */
    public void setSnatEnable(Boolean SnatEnable) {
        this.SnatEnable = SnatEnable;
    }

    /**
     * Get <p>End port of a listener with a port range. Range of the port: 2–65535.</p> 
     * @return FullEndPorts <p>End port of a listener with a port range. Range of the port: 2–65535.</p>
     */
    public Long [] getFullEndPorts() {
        return this.FullEndPorts;
    }

    /**
     * Set <p>End port of a listener with a port range. Range of the port: 2–65535.</p>
     * @param FullEndPorts <p>End port of a listener with a port range. Range of the port: 2–65535.</p>
     */
    public void setFullEndPorts(Long [] FullEndPorts) {
        this.FullEndPorts = FullEndPorts;
    }

    /**
     * Get <p>Enable the h2c switch for the private network HTTP listener.<br>True (enabled), False (disabled). Disabled by default.<br>Once enabled, the listener only supports creating layer-7 rules with GRPC or GRPCS as the backend forwarding type. When creating rules, explicitly input GRPC or GRPCS in Rules.N.ForwardType.</p> 
     * @return H2cSwitch <p>Enable the h2c switch for the private network HTTP listener.<br>True (enabled), False (disabled). Disabled by default.<br>Once enabled, the listener only supports creating layer-7 rules with GRPC or GRPCS as the backend forwarding type. When creating rules, explicitly input GRPC or GRPCS in Rules.N.ForwardType.</p>
     */
    public Boolean getH2cSwitch() {
        return this.H2cSwitch;
    }

    /**
     * Set <p>Enable the h2c switch for the private network HTTP listener.<br>True (enabled), False (disabled). Disabled by default.<br>Once enabled, the listener only supports creating layer-7 rules with GRPC or GRPCS as the backend forwarding type. When creating rules, explicitly input GRPC or GRPCS in Rules.N.ForwardType.</p>
     * @param H2cSwitch <p>Enable the h2c switch for the private network HTTP listener.<br>True (enabled), False (disabled). Disabled by default.<br>Once enabled, the listener only supports creating layer-7 rules with GRPC or GRPCS as the backend forwarding type. When creating rules, explicitly input GRPC or GRPCS in Rules.N.ForwardType.</p>
     */
    public void setH2cSwitch(Boolean H2cSwitch) {
        this.H2cSwitch = H2cSwitch;
    }

    /**
     * Get <p>Control whether to remove the SSL encryption layer for TCP_SSL listeners. Once enabled, the listener will run as a normal TCP protocol. Available values:</p><ul><li>True: Disable SSL (protocol downgraded to plain text TCP).</li><li>False (default): Keep SSL enabled.</li></ul> 
     * @return SslCloseSwitch <p>Control whether to remove the SSL encryption layer for TCP_SSL listeners. Once enabled, the listener will run as a normal TCP protocol. Available values:</p><ul><li>True: Disable SSL (protocol downgraded to plain text TCP).</li><li>False (default): Keep SSL enabled.</li></ul>
     */
    public Boolean getSslCloseSwitch() {
        return this.SslCloseSwitch;
    }

    /**
     * Set <p>Control whether to remove the SSL encryption layer for TCP_SSL listeners. Once enabled, the listener will run as a normal TCP protocol. Available values:</p><ul><li>True: Disable SSL (protocol downgraded to plain text TCP).</li><li>False (default): Keep SSL enabled.</li></ul>
     * @param SslCloseSwitch <p>Control whether to remove the SSL encryption layer for TCP_SSL listeners. Once enabled, the listener will run as a normal TCP protocol. Available values:</p><ul><li>True: Disable SSL (protocol downgraded to plain text TCP).</li><li>False (default): Keep SSL enabled.</li></ul>
     */
    public void setSslCloseSwitch(Boolean SslCloseSwitch) {
        this.SslCloseSwitch = SslCloseSwitch;
    }

    /**
     * Get <p>Data compression mode. Valid values: transparent (passthrough mode) and compatibility (compatibility mode).</p> 
     * @return DataCompressMode <p>Data compression mode. Valid values: transparent (passthrough mode) and compatibility (compatibility mode).</p>
     */
    public String getDataCompressMode() {
        return this.DataCompressMode;
    }

    /**
     * Set <p>Data compression mode. Valid values: transparent (passthrough mode) and compatibility (compatibility mode).</p>
     * @param DataCompressMode <p>Data compression mode. Valid values: transparent (passthrough mode) and compatibility (compatibility mode).</p>
     */
    public void setDataCompressMode(String DataCompressMode) {
        this.DataCompressMode = DataCompressMode;
    }

    /**
     * Get <p>Rescheduling feature, which provides a switch for changing the weight to 0. If the switch is toggled on, rescheduling is triggered when the weight of a real server is changed to 0. This parameter is applicable only to TCP/UDP listeners.</p> 
     * @return RescheduleTargetZeroWeight <p>Rescheduling feature, which provides a switch for changing the weight to 0. If the switch is toggled on, rescheduling is triggered when the weight of a real server is changed to 0. This parameter is applicable only to TCP/UDP listeners.</p>
     */
    public Boolean getRescheduleTargetZeroWeight() {
        return this.RescheduleTargetZeroWeight;
    }

    /**
     * Set <p>Rescheduling feature, which provides a switch for changing the weight to 0. If the switch is toggled on, rescheduling is triggered when the weight of a real server is changed to 0. This parameter is applicable only to TCP/UDP listeners.</p>
     * @param RescheduleTargetZeroWeight <p>Rescheduling feature, which provides a switch for changing the weight to 0. If the switch is toggled on, rescheduling is triggered when the weight of a real server is changed to 0. This parameter is applicable only to TCP/UDP listeners.</p>
     */
    public void setRescheduleTargetZeroWeight(Boolean RescheduleTargetZeroWeight) {
        this.RescheduleTargetZeroWeight = RescheduleTargetZeroWeight;
    }

    /**
     * Get <p>Rescheduling feature, which provides a switch for detecting health check exceptions. If the switch is toggled on, rescheduling is triggered when the real server health check fails. This parameter is applicable only to TCP/UDP listeners.</p> 
     * @return RescheduleUnhealthy <p>Rescheduling feature, which provides a switch for detecting health check exceptions. If the switch is toggled on, rescheduling is triggered when the real server health check fails. This parameter is applicable only to TCP/UDP listeners.</p>
     */
    public Boolean getRescheduleUnhealthy() {
        return this.RescheduleUnhealthy;
    }

    /**
     * Set <p>Rescheduling feature, which provides a switch for detecting health check exceptions. If the switch is toggled on, rescheduling is triggered when the real server health check fails. This parameter is applicable only to TCP/UDP listeners.</p>
     * @param RescheduleUnhealthy <p>Rescheduling feature, which provides a switch for detecting health check exceptions. If the switch is toggled on, rescheduling is triggered when the real server health check fails. This parameter is applicable only to TCP/UDP listeners.</p>
     */
    public void setRescheduleUnhealthy(Boolean RescheduleUnhealthy) {
        this.RescheduleUnhealthy = RescheduleUnhealthy;
    }

    /**
     * Get <p>Rescheduling feature, which provides a switch for scaling out real servers. If the switch is toggled on, rescheduling is triggered when the number of real servers increases or decreases. This parameter is applicable only to TCP/UDP listeners.</p> 
     * @return RescheduleExpandTarget <p>Rescheduling feature, which provides a switch for scaling out real servers. If the switch is toggled on, rescheduling is triggered when the number of real servers increases or decreases. This parameter is applicable only to TCP/UDP listeners.</p>
     */
    public Boolean getRescheduleExpandTarget() {
        return this.RescheduleExpandTarget;
    }

    /**
     * Set <p>Rescheduling feature, which provides a switch for scaling out real servers. If the switch is toggled on, rescheduling is triggered when the number of real servers increases or decreases. This parameter is applicable only to TCP/UDP listeners.</p>
     * @param RescheduleExpandTarget <p>Rescheduling feature, which provides a switch for scaling out real servers. If the switch is toggled on, rescheduling is triggered when the number of real servers increases or decreases. This parameter is applicable only to TCP/UDP listeners.</p>
     */
    public void setRescheduleExpandTarget(Boolean RescheduleExpandTarget) {
        this.RescheduleExpandTarget = RescheduleExpandTarget;
    }

    /**
     * Get <p>Rescheduling trigger start time. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners.</p> 
     * @return RescheduleStartTime <p>Rescheduling trigger start time. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners.</p>
     */
    public Long getRescheduleStartTime() {
        return this.RescheduleStartTime;
    }

    /**
     * Set <p>Rescheduling trigger start time. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners.</p>
     * @param RescheduleStartTime <p>Rescheduling trigger start time. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners.</p>
     */
    public void setRescheduleStartTime(Long RescheduleStartTime) {
        this.RescheduleStartTime = RescheduleStartTime;
    }

    /**
     * Get <p>Rescheduling trigger duration. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners.</p> 
     * @return RescheduleInterval <p>Rescheduling trigger duration. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners.</p>
     */
    public Long getRescheduleInterval() {
        return this.RescheduleInterval;
    }

    /**
     * Set <p>Rescheduling trigger duration. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners.</p>
     * @param RescheduleInterval <p>Rescheduling trigger duration. Value range: 0–3600. Unit: s. This parameter is applicable only to TCP/UDP listeners.</p>
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

