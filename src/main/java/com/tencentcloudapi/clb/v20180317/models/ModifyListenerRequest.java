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

public class ModifyListenerRequest extends AbstractModel {

    /**
    * <p>ID of the Cloud Load Balancer (CLB) instance. You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to query the ID.</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>ID of the CLB listener. You can call the <a href="https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1">DescribeListeners</a> API to query the ID.</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>New listener name. Naming rule: 1-80 characters including English letters, Chinese characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is applicable only to TCP/UDP listener.</p>
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * <p>Health check parameters. This parameter is applicable only to TCP/UDP/TCP_SSL/QUIC listeners.</p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * <p>Certificate-related information. This parameter is applicable only to HTTPS/TCP_SSL/QUIC listeners. This parameter and MultiCertInfo cannot be specified at the same time.</p>
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * <p>Listener forwarding method. Valid values: WRR (weighted round-robin), LEAST_CONN (least connections), and IP_HASH (IP address hash).<br>They indicate weighted round-robin and least connection respectively. Default is WRR.<br>Usage scenario: Suitable for TCP/UDP/TCP_SSL/QUIC listeners. The balancing method for Layer-7 listeners should be modified in the forwarding rules.</p>
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * <p>Whether to enable SNI feature. This parameter applies only to HTTPS listeners. Default is 0 (disabled) or 1 (enable). Note: You can enable SNI for listeners without SNI. SNI cannot be disabled for listeners with SNI enabled.</p>
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * <p>Backend target type. NODE indicates binding to a general node. TARGETGROUP indicates binding to a target group.</p>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS listeners.<br>The default value 0 means disabled, and 1 means enable.<br>If the backend service has a connection limit, enable with caution. This feature is currently in internal testing. If needed, submit a <a href="https://www.tencentcloud.com/apply/p/tsodp6qm21?from_cn_redirect=1">beta application</a>.</p>
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

    /**
    * <p>Rescheduling feature, which provides a switch for scaling out the backend service. If the switch is toggled on, rescheduling is triggered when the backend service is unbound. This parameter is applicable only to TCP/UDP listeners.</p>
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
    * <p>Session persistence type. NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on Quic Connection ID. QUIC_CID supports only UDP Protocol.<br>Usage scenario: Applicable to TCP/UDP/TCP_SSL/QUIC listeners.<br>Default is NORMAL.</p>
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * <p>Certificate information. Multiple server certificates with different algorithm types can be imported at the same time. This parameter is applicable only to HTTPS listeners with SNI feature disabled. This parameter and Certificate cannot be specified at the same time.</p>
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

    /**
    * <p>Maximum number of concurrent connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of concurrent connections for the instance specification. -1 indicates no speed limit on the concurrent connections at the listener level. Classic network instances do not support this parameter.<br>Default value is -1, which means unlimited speed.</p>
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * <p>Maximum number of new connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of new connections for the instance specification. -1 indicates no speed limit on new connections at the listener level. Classic network instances do not support this parameter.<br>Default is -1, which means unlimited speed.</p>
    */
    @SerializedName("MaxCps")
    @Expose
    private Long MaxCps;

    /**
    * <p>Idle connection timeout. This parameter applies only to TCP/UDP listeners. To set a value exceeding 1980, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket for application</a>. The maximum value can be 3600.</p><p>Range of values: [10, 1980]</p><p>Unit: seconds</p><p>Default value: 900</p><p>Default value for TCP listeners: 900. Default value for UDP listeners: 300. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances.</p>
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
    * <p>Data compression mode</p><p>Enumeration value:</p><ul><li>transparent: Transparent mode (default value)</li><li>compatibility: Compatible mode (enable gzip compression configuration)</li></ul>
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
     * Get <p>ID of the Cloud Load Balancer (CLB) instance. You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to query the ID.</p> 
     * @return LoadBalancerId <p>ID of the Cloud Load Balancer (CLB) instance. You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to query the ID.</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>ID of the Cloud Load Balancer (CLB) instance. You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to query the ID.</p>
     * @param LoadBalancerId <p>ID of the Cloud Load Balancer (CLB) instance. You can call the <a href="https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1">DescribeLoadBalancers</a> API to query the ID.</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>ID of the CLB listener. You can call the <a href="https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1">DescribeListeners</a> API to query the ID.</p> 
     * @return ListenerId <p>ID of the CLB listener. You can call the <a href="https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1">DescribeListeners</a> API to query the ID.</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>ID of the CLB listener. You can call the <a href="https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1">DescribeListeners</a> API to query the ID.</p>
     * @param ListenerId <p>ID of the CLB listener. You can call the <a href="https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1">DescribeListeners</a> API to query the ID.</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>New listener name. Naming rule: 1-80 characters including English letters, Chinese characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p> 
     * @return ListenerName <p>New listener name. Naming rule: 1-80 characters including English letters, Chinese characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>New listener name. Naming rule: 1-80 characters including English letters, Chinese characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
     * @param ListenerName <p>New listener name. Naming rule: 1-80 characters including English letters, Chinese characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is applicable only to TCP/UDP listener.</p> 
     * @return SessionExpireTime <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is applicable only to TCP/UDP listener.</p>
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is applicable only to TCP/UDP listener.</p>
     * @param SessionExpireTime <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is applicable only to TCP/UDP listener.</p>
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
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
     * Get <p>Certificate-related information. This parameter is applicable only to HTTPS/TCP_SSL/QUIC listeners. This parameter and MultiCertInfo cannot be specified at the same time.</p> 
     * @return Certificate <p>Certificate-related information. This parameter is applicable only to HTTPS/TCP_SSL/QUIC listeners. This parameter and MultiCertInfo cannot be specified at the same time.</p>
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set <p>Certificate-related information. This parameter is applicable only to HTTPS/TCP_SSL/QUIC listeners. This parameter and MultiCertInfo cannot be specified at the same time.</p>
     * @param Certificate <p>Certificate-related information. This parameter is applicable only to HTTPS/TCP_SSL/QUIC listeners. This parameter and MultiCertInfo cannot be specified at the same time.</p>
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get <p>Listener forwarding method. Valid values: WRR (weighted round-robin), LEAST_CONN (least connections), and IP_HASH (IP address hash).<br>They indicate weighted round-robin and least connection respectively. Default is WRR.<br>Usage scenario: Suitable for TCP/UDP/TCP_SSL/QUIC listeners. The balancing method for Layer-7 listeners should be modified in the forwarding rules.</p> 
     * @return Scheduler <p>Listener forwarding method. Valid values: WRR (weighted round-robin), LEAST_CONN (least connections), and IP_HASH (IP address hash).<br>They indicate weighted round-robin and least connection respectively. Default is WRR.<br>Usage scenario: Suitable for TCP/UDP/TCP_SSL/QUIC listeners. The balancing method for Layer-7 listeners should be modified in the forwarding rules.</p>
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set <p>Listener forwarding method. Valid values: WRR (weighted round-robin), LEAST_CONN (least connections), and IP_HASH (IP address hash).<br>They indicate weighted round-robin and least connection respectively. Default is WRR.<br>Usage scenario: Suitable for TCP/UDP/TCP_SSL/QUIC listeners. The balancing method for Layer-7 listeners should be modified in the forwarding rules.</p>
     * @param Scheduler <p>Listener forwarding method. Valid values: WRR (weighted round-robin), LEAST_CONN (least connections), and IP_HASH (IP address hash).<br>They indicate weighted round-robin and least connection respectively. Default is WRR.<br>Usage scenario: Suitable for TCP/UDP/TCP_SSL/QUIC listeners. The balancing method for Layer-7 listeners should be modified in the forwarding rules.</p>
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get <p>Whether to enable SNI feature. This parameter applies only to HTTPS listeners. Default is 0 (disabled) or 1 (enable). Note: You can enable SNI for listeners without SNI. SNI cannot be disabled for listeners with SNI enabled.</p> 
     * @return SniSwitch <p>Whether to enable SNI feature. This parameter applies only to HTTPS listeners. Default is 0 (disabled) or 1 (enable). Note: You can enable SNI for listeners without SNI. SNI cannot be disabled for listeners with SNI enabled.</p>
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set <p>Whether to enable SNI feature. This parameter applies only to HTTPS listeners. Default is 0 (disabled) or 1 (enable). Note: You can enable SNI for listeners without SNI. SNI cannot be disabled for listeners with SNI enabled.</p>
     * @param SniSwitch <p>Whether to enable SNI feature. This parameter applies only to HTTPS listeners. Default is 0 (disabled) or 1 (enable). Note: You can enable SNI for listeners without SNI. SNI cannot be disabled for listeners with SNI enabled.</p>
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get <p>Backend target type. NODE indicates binding to a general node. TARGETGROUP indicates binding to a target group.</p> 
     * @return TargetType <p>Backend target type. NODE indicates binding to a general node. TARGETGROUP indicates binding to a target group.</p>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>Backend target type. NODE indicates binding to a general node. TARGETGROUP indicates binding to a target group.</p>
     * @param TargetType <p>Backend target type. NODE indicates binding to a general node. TARGETGROUP indicates binding to a target group.</p>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS listeners.<br>The default value 0 means disabled, and 1 means enable.<br>If the backend service has a connection limit, enable with caution. This feature is currently in internal testing. If needed, submit a <a href="https://www.tencentcloud.com/apply/p/tsodp6qm21?from_cn_redirect=1">beta application</a>.</p> 
     * @return KeepaliveEnable <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS listeners.<br>The default value 0 means disabled, and 1 means enable.<br>If the backend service has a connection limit, enable with caution. This feature is currently in internal testing. If needed, submit a <a href="https://www.tencentcloud.com/apply/p/tsodp6qm21?from_cn_redirect=1">beta application</a>.</p>
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS listeners.<br>The default value 0 means disabled, and 1 means enable.<br>If the backend service has a connection limit, enable with caution. This feature is currently in internal testing. If needed, submit a <a href="https://www.tencentcloud.com/apply/p/tsodp6qm21?from_cn_redirect=1">beta application</a>.</p>
     * @param KeepaliveEnable <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS listeners.<br>The default value 0 means disabled, and 1 means enable.<br>If the backend service has a connection limit, enable with caution. This feature is currently in internal testing. If needed, submit a <a href="https://www.tencentcloud.com/apply/p/tsodp6qm21?from_cn_redirect=1">beta application</a>.</p>
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
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
     * Get <p>Session persistence type. NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on Quic Connection ID. QUIC_CID supports only UDP Protocol.<br>Usage scenario: Applicable to TCP/UDP/TCP_SSL/QUIC listeners.<br>Default is NORMAL.</p> 
     * @return SessionType <p>Session persistence type. NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on Quic Connection ID. QUIC_CID supports only UDP Protocol.<br>Usage scenario: Applicable to TCP/UDP/TCP_SSL/QUIC listeners.<br>Default is NORMAL.</p>
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set <p>Session persistence type. NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on Quic Connection ID. QUIC_CID supports only UDP Protocol.<br>Usage scenario: Applicable to TCP/UDP/TCP_SSL/QUIC listeners.<br>Default is NORMAL.</p>
     * @param SessionType <p>Session persistence type. NORMAL means the default session persistence type. QUIC_CID refers to maintaining the session based on Quic Connection ID. QUIC_CID supports only UDP Protocol.<br>Usage scenario: Applicable to TCP/UDP/TCP_SSL/QUIC listeners.<br>Default is NORMAL.</p>
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get <p>Certificate information. Multiple server certificates with different algorithm types can be imported at the same time. This parameter is applicable only to HTTPS listeners with SNI feature disabled. This parameter and Certificate cannot be specified at the same time.</p> 
     * @return MultiCertInfo <p>Certificate information. Multiple server certificates with different algorithm types can be imported at the same time. This parameter is applicable only to HTTPS listeners with SNI feature disabled. This parameter and Certificate cannot be specified at the same time.</p>
     */
    public MultiCertInfo getMultiCertInfo() {
        return this.MultiCertInfo;
    }

    /**
     * Set <p>Certificate information. Multiple server certificates with different algorithm types can be imported at the same time. This parameter is applicable only to HTTPS listeners with SNI feature disabled. This parameter and Certificate cannot be specified at the same time.</p>
     * @param MultiCertInfo <p>Certificate information. Multiple server certificates with different algorithm types can be imported at the same time. This parameter is applicable only to HTTPS listeners with SNI feature disabled. This parameter and Certificate cannot be specified at the same time.</p>
     */
    public void setMultiCertInfo(MultiCertInfo MultiCertInfo) {
        this.MultiCertInfo = MultiCertInfo;
    }

    /**
     * Get <p>Maximum number of concurrent connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of concurrent connections for the instance specification. -1 indicates no speed limit on the concurrent connections at the listener level. Classic network instances do not support this parameter.<br>Default value is -1, which means unlimited speed.</p> 
     * @return MaxConn <p>Maximum number of concurrent connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of concurrent connections for the instance specification. -1 indicates no speed limit on the concurrent connections at the listener level. Classic network instances do not support this parameter.<br>Default value is -1, which means unlimited speed.</p>
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set <p>Maximum number of concurrent connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of concurrent connections for the instance specification. -1 indicates no speed limit on the concurrent connections at the listener level. Classic network instances do not support this parameter.<br>Default value is -1, which means unlimited speed.</p>
     * @param MaxConn <p>Maximum number of concurrent connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of concurrent connections for the instance specification. -1 indicates no speed limit on the concurrent connections at the listener level. Classic network instances do not support this parameter.<br>Default value is -1, which means unlimited speed.</p>
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get <p>Maximum number of new connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of new connections for the instance specification. -1 indicates no speed limit on new connections at the listener level. Classic network instances do not support this parameter.<br>Default is -1, which means unlimited speed.</p> 
     * @return MaxCps <p>Maximum number of new connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of new connections for the instance specification. -1 indicates no speed limit on new connections at the listener level. Classic network instances do not support this parameter.<br>Default is -1, which means unlimited speed.</p>
     */
    public Long getMaxCps() {
        return this.MaxCps;
    }

    /**
     * Set <p>Maximum number of new connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of new connections for the instance specification. -1 indicates no speed limit on new connections at the listener level. Classic network instances do not support this parameter.<br>Default is -1, which means unlimited speed.</p>
     * @param MaxCps <p>Maximum number of new connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of new connections for the instance specification. -1 indicates no speed limit on new connections at the listener level. Classic network instances do not support this parameter.<br>Default is -1, which means unlimited speed.</p>
     */
    public void setMaxCps(Long MaxCps) {
        this.MaxCps = MaxCps;
    }

    /**
     * Get <p>Idle connection timeout. This parameter applies only to TCP/UDP listeners. To set a value exceeding 1980, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket for application</a>. The maximum value can be 3600.</p><p>Range of values: [10, 1980]</p><p>Unit: seconds</p><p>Default value: 900</p><p>Default value for TCP listeners: 900. Default value for UDP listeners: 300. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances.</p> 
     * @return IdleConnectTimeout <p>Idle connection timeout. This parameter applies only to TCP/UDP listeners. To set a value exceeding 1980, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket for application</a>. The maximum value can be 3600.</p><p>Range of values: [10, 1980]</p><p>Unit: seconds</p><p>Default value: 900</p><p>Default value for TCP listeners: 900. Default value for UDP listeners: 300. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances.</p>
     */
    public Long getIdleConnectTimeout() {
        return this.IdleConnectTimeout;
    }

    /**
     * Set <p>Idle connection timeout. This parameter applies only to TCP/UDP listeners. To set a value exceeding 1980, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket for application</a>. The maximum value can be 3600.</p><p>Range of values: [10, 1980]</p><p>Unit: seconds</p><p>Default value: 900</p><p>Default value for TCP listeners: 900. Default value for UDP listeners: 300. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances.</p>
     * @param IdleConnectTimeout <p>Idle connection timeout. This parameter applies only to TCP/UDP listeners. To set a value exceeding 1980, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket for application</a>. The maximum value can be 3600.</p><p>Range of values: [10, 1980]</p><p>Unit: seconds</p><p>Default value: 900</p><p>Default value for TCP listeners: 900. Default value for UDP listeners: 300. Value range: 10–900 for shared instances and dedicated instances and 10–1980 for LCU-supported instances.</p>
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
     * Get <p>Data compression mode</p><p>Enumeration value:</p><ul><li>transparent: Transparent mode (default value)</li><li>compatibility: Compatible mode (enable gzip compression configuration)</li></ul> 
     * @return DataCompressMode <p>Data compression mode</p><p>Enumeration value:</p><ul><li>transparent: Transparent mode (default value)</li><li>compatibility: Compatible mode (enable gzip compression configuration)</li></ul>
     */
    public String getDataCompressMode() {
        return this.DataCompressMode;
    }

    /**
     * Set <p>Data compression mode</p><p>Enumeration value:</p><ul><li>transparent: Transparent mode (default value)</li><li>compatibility: Compatible mode (enable gzip compression configuration)</li></ul>
     * @param DataCompressMode <p>Data compression mode</p><p>Enumeration value:</p><ul><li>transparent: Transparent mode (default value)</li><li>compatibility: Compatible mode (enable gzip compression configuration)</li></ul>
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
        if (source.IdleConnectTimeout != null) {
            this.IdleConnectTimeout = new Long(source.IdleConnectTimeout);
        }
        if (source.ProxyProtocol != null) {
            this.ProxyProtocol = new Boolean(source.ProxyProtocol);
        }
        if (source.SnatEnable != null) {
            this.SnatEnable = new Boolean(source.SnatEnable);
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
        this.setParamSimple(map, prefix + "IdleConnectTimeout", this.IdleConnectTimeout);
        this.setParamSimple(map, prefix + "ProxyProtocol", this.ProxyProtocol);
        this.setParamSimple(map, prefix + "SnatEnable", this.SnatEnable);
        this.setParamSimple(map, prefix + "DataCompressMode", this.DataCompressMode);
        this.setParamSimple(map, prefix + "RescheduleTargetZeroWeight", this.RescheduleTargetZeroWeight);
        this.setParamSimple(map, prefix + "RescheduleUnhealthy", this.RescheduleUnhealthy);
        this.setParamSimple(map, prefix + "RescheduleExpandTarget", this.RescheduleExpandTarget);
        this.setParamSimple(map, prefix + "RescheduleStartTime", this.RescheduleStartTime);
        this.setParamSimple(map, prefix + "RescheduleInterval", this.RescheduleInterval);

    }
}

