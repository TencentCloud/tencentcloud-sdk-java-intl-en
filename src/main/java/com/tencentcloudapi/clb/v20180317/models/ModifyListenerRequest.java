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
    * ID of the CLB instance. You can call the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * ID of the CLB instance listener. You can call the [DescribeListeners](https://intl.cloud.tencent.com/document/product/214/30686?from_cn_redirect=1) API to query the ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * New listener name. The maximum length is 255 characters.
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
    * Health check parameter. It is only applicable only to TCP, UDP, TCP_SSL and QUIC listeners.
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * Certificate information. This parameter is only applicable to HTTPS/TCP_SSL/QUIC listeners. `Certificate` and `MultiCertInfo` cannot be both specified.
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * Listener forwarding method. Valid values: WRR (weighted round-robin), LEAST_CONN (least connections), and IP_HASH (IP address hash).
They indicate weighted round-robin and least connections, respectively. Default value: WRR.
Use cases: This applies to TCP/UDP/TCP_SSL/QUIC listeners. The balancing method for Layer-7 listeners should be modified in the forwarding rules.
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Whether to enable the SNI feature. This parameter applies only to HTTPS listeners. The default value is 0, indicating disabled, and 1 indicates enabled. Note: The SNI feature can be enabled for listeners that have not enabled SNI, but cannot be disabled for listeners that have enabled SNI.
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
    * Whether to enable the persistent connection feature. This parameter applies only to HTTP/HTTPS listeners.
The default value is 0, indicating disabled, and 1 indicates enabled.

Enable this feature with caution if the maximum number of connections is limited for real servers. This feature is in beta testing. To use it, submit a [beta testing application](https://intl.cloud.tencent.com/apply/p/tsodp6qm21?from_cn_redirect=1).
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

    /**
    * Reschedules when unbinding real servers. only supported for TCP/UDP listeners. toggle on to enable this feature.
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
    * Session persistence type. NORMAL: default session persistence type; QUIC_CID: perform session persistence based on QUIC connection ID. If the value is set to QUIC_CID, only the UDP protocol is supported.
Use cases: This applies to TCP/UDP/TCP_SSL/QUIC listeners.

Default value: NORMAL.
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
    * Maximum number of concurrent connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of concurrent connections for the instance specification. -1 indicates that no limit is set on the concurrent connections at the listener level. Classic network instances do not support this parameter.

Default value: -1, which indicates no limit.
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * Maximum number of new connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of new connections for the instance specification. -1 indicates that no limit is set on the new connections at the listener level. Classic network instances do not support this parameter.

Default value: -1, which indicates no limit.
    */
    @SerializedName("MaxCps")
    @Expose
    private Long MaxCps;

    /**
    * Specifies the idle connection timeout in seconds. this parameter applies only to TCP/UDP listeners. default value: 900 for TCP listeners and 300 for UDP listeners. value range: 10–900 for shared instances and dedicated instances and 10–1980 for lcu-supported instances. to set a value exceeding 1980, [submit a ticket application](https://console.cloud.tencent.com/workorder/category). the maximum settable value is 3600.
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
    * Data compression mode.
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
     * Get ID of the CLB instance. You can call the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) API to query the ID. 
     * @return LoadBalancerId ID of the CLB instance. You can call the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of the CLB instance. You can call the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     * @param LoadBalancerId ID of the CLB instance. You can call the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get ID of the CLB instance listener. You can call the [DescribeListeners](https://intl.cloud.tencent.com/document/product/214/30686?from_cn_redirect=1) API to query the ID. 
     * @return ListenerId ID of the CLB instance listener. You can call the [DescribeListeners](https://intl.cloud.tencent.com/document/product/214/30686?from_cn_redirect=1) API to query the ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set ID of the CLB instance listener. You can call the [DescribeListeners](https://intl.cloud.tencent.com/document/product/214/30686?from_cn_redirect=1) API to query the ID.
     * @param ListenerId ID of the CLB instance listener. You can call the [DescribeListeners](https://intl.cloud.tencent.com/document/product/214/30686?from_cn_redirect=1) API to query the ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get New listener name. The maximum length is 255 characters. 
     * @return ListenerName New listener name. The maximum length is 255 characters.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set New listener name. The maximum length is 255 characters.
     * @param ListenerName New listener name. The maximum length is 255 characters.
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
     * Get Health check parameter. It is only applicable only to TCP, UDP, TCP_SSL and QUIC listeners. 
     * @return HealthCheck Health check parameter. It is only applicable only to TCP, UDP, TCP_SSL and QUIC listeners.
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check parameter. It is only applicable only to TCP, UDP, TCP_SSL and QUIC listeners.
     * @param HealthCheck Health check parameter. It is only applicable only to TCP, UDP, TCP_SSL and QUIC listeners.
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Certificate information. This parameter is only applicable to HTTPS/TCP_SSL/QUIC listeners. `Certificate` and `MultiCertInfo` cannot be both specified. 
     * @return Certificate Certificate information. This parameter is only applicable to HTTPS/TCP_SSL/QUIC listeners. `Certificate` and `MultiCertInfo` cannot be both specified.
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Certificate information. This parameter is only applicable to HTTPS/TCP_SSL/QUIC listeners. `Certificate` and `MultiCertInfo` cannot be both specified.
     * @param Certificate Certificate information. This parameter is only applicable to HTTPS/TCP_SSL/QUIC listeners. `Certificate` and `MultiCertInfo` cannot be both specified.
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get Listener forwarding method. Valid values: WRR (weighted round-robin), LEAST_CONN (least connections), and IP_HASH (IP address hash).
They indicate weighted round-robin and least connections, respectively. Default value: WRR.
Use cases: This applies to TCP/UDP/TCP_SSL/QUIC listeners. The balancing method for Layer-7 listeners should be modified in the forwarding rules. 
     * @return Scheduler Listener forwarding method. Valid values: WRR (weighted round-robin), LEAST_CONN (least connections), and IP_HASH (IP address hash).
They indicate weighted round-robin and least connections, respectively. Default value: WRR.
Use cases: This applies to TCP/UDP/TCP_SSL/QUIC listeners. The balancing method for Layer-7 listeners should be modified in the forwarding rules.
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Listener forwarding method. Valid values: WRR (weighted round-robin), LEAST_CONN (least connections), and IP_HASH (IP address hash).
They indicate weighted round-robin and least connections, respectively. Default value: WRR.
Use cases: This applies to TCP/UDP/TCP_SSL/QUIC listeners. The balancing method for Layer-7 listeners should be modified in the forwarding rules.
     * @param Scheduler Listener forwarding method. Valid values: WRR (weighted round-robin), LEAST_CONN (least connections), and IP_HASH (IP address hash).
They indicate weighted round-robin and least connections, respectively. Default value: WRR.
Use cases: This applies to TCP/UDP/TCP_SSL/QUIC listeners. The balancing method for Layer-7 listeners should be modified in the forwarding rules.
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Whether to enable the SNI feature. This parameter applies only to HTTPS listeners. The default value is 0, indicating disabled, and 1 indicates enabled. Note: The SNI feature can be enabled for listeners that have not enabled SNI, but cannot be disabled for listeners that have enabled SNI. 
     * @return SniSwitch Whether to enable the SNI feature. This parameter applies only to HTTPS listeners. The default value is 0, indicating disabled, and 1 indicates enabled. Note: The SNI feature can be enabled for listeners that have not enabled SNI, but cannot be disabled for listeners that have enabled SNI.
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set Whether to enable the SNI feature. This parameter applies only to HTTPS listeners. The default value is 0, indicating disabled, and 1 indicates enabled. Note: The SNI feature can be enabled for listeners that have not enabled SNI, but cannot be disabled for listeners that have enabled SNI.
     * @param SniSwitch Whether to enable the SNI feature. This parameter applies only to HTTPS listeners. The default value is 0, indicating disabled, and 1 indicates enabled. Note: The SNI feature can be enabled for listeners that have not enabled SNI, but cannot be disabled for listeners that have enabled SNI.
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
     * Get Whether to enable the persistent connection feature. This parameter applies only to HTTP/HTTPS listeners.
The default value is 0, indicating disabled, and 1 indicates enabled.

Enable this feature with caution if the maximum number of connections is limited for real servers. This feature is in beta testing. To use it, submit a [beta testing application](https://intl.cloud.tencent.com/apply/p/tsodp6qm21?from_cn_redirect=1). 
     * @return KeepaliveEnable Whether to enable the persistent connection feature. This parameter applies only to HTTP/HTTPS listeners.
The default value is 0, indicating disabled, and 1 indicates enabled.

Enable this feature with caution if the maximum number of connections is limited for real servers. This feature is in beta testing. To use it, submit a [beta testing application](https://intl.cloud.tencent.com/apply/p/tsodp6qm21?from_cn_redirect=1).
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set Whether to enable the persistent connection feature. This parameter applies only to HTTP/HTTPS listeners.
The default value is 0, indicating disabled, and 1 indicates enabled.

Enable this feature with caution if the maximum number of connections is limited for real servers. This feature is in beta testing. To use it, submit a [beta testing application](https://intl.cloud.tencent.com/apply/p/tsodp6qm21?from_cn_redirect=1).
     * @param KeepaliveEnable Whether to enable the persistent connection feature. This parameter applies only to HTTP/HTTPS listeners.
The default value is 0, indicating disabled, and 1 indicates enabled.

Enable this feature with caution if the maximum number of connections is limited for real servers. This feature is in beta testing. To use it, submit a [beta testing application](https://intl.cloud.tencent.com/apply/p/tsodp6qm21?from_cn_redirect=1).
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
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
     * Get Session persistence type. NORMAL: default session persistence type; QUIC_CID: perform session persistence based on QUIC connection ID. If the value is set to QUIC_CID, only the UDP protocol is supported.
Use cases: This applies to TCP/UDP/TCP_SSL/QUIC listeners.

Default value: NORMAL. 
     * @return SessionType Session persistence type. NORMAL: default session persistence type; QUIC_CID: perform session persistence based on QUIC connection ID. If the value is set to QUIC_CID, only the UDP protocol is supported.
Use cases: This applies to TCP/UDP/TCP_SSL/QUIC listeners.

Default value: NORMAL.
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set Session persistence type. NORMAL: default session persistence type; QUIC_CID: perform session persistence based on QUIC connection ID. If the value is set to QUIC_CID, only the UDP protocol is supported.
Use cases: This applies to TCP/UDP/TCP_SSL/QUIC listeners.

Default value: NORMAL.
     * @param SessionType Session persistence type. NORMAL: default session persistence type; QUIC_CID: perform session persistence based on QUIC connection ID. If the value is set to QUIC_CID, only the UDP protocol is supported.
Use cases: This applies to TCP/UDP/TCP_SSL/QUIC listeners.

Default value: NORMAL.
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
     * Get Maximum number of concurrent connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of concurrent connections for the instance specification. -1 indicates that no limit is set on the concurrent connections at the listener level. Classic network instances do not support this parameter.

Default value: -1, which indicates no limit. 
     * @return MaxConn Maximum number of concurrent connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of concurrent connections for the instance specification. -1 indicates that no limit is set on the concurrent connections at the listener level. Classic network instances do not support this parameter.

Default value: -1, which indicates no limit.
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set Maximum number of concurrent connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of concurrent connections for the instance specification. -1 indicates that no limit is set on the concurrent connections at the listener level. Classic network instances do not support this parameter.

Default value: -1, which indicates no limit.
     * @param MaxConn Maximum number of concurrent connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of concurrent connections for the instance specification. -1 indicates that no limit is set on the concurrent connections at the listener level. Classic network instances do not support this parameter.

Default value: -1, which indicates no limit.
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get Maximum number of new connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of new connections for the instance specification. -1 indicates that no limit is set on the new connections at the listener level. Classic network instances do not support this parameter.

Default value: -1, which indicates no limit. 
     * @return MaxCps Maximum number of new connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of new connections for the instance specification. -1 indicates that no limit is set on the new connections at the listener level. Classic network instances do not support this parameter.

Default value: -1, which indicates no limit.
     */
    public Long getMaxCps() {
        return this.MaxCps;
    }

    /**
     * Set Maximum number of new connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of new connections for the instance specification. -1 indicates that no limit is set on the new connections at the listener level. Classic network instances do not support this parameter.

Default value: -1, which indicates no limit.
     * @param MaxCps Maximum number of new connections at the listener level. This parameter is supported only for LCU-supported instances with TCP/UDP/TCP_SSL/QUIC listeners currently. Value range: 1 to the maximum number of new connections for the instance specification. -1 indicates that no limit is set on the new connections at the listener level. Classic network instances do not support this parameter.

Default value: -1, which indicates no limit.
     */
    public void setMaxCps(Long MaxCps) {
        this.MaxCps = MaxCps;
    }

    /**
     * Get Specifies the idle connection timeout in seconds. this parameter applies only to TCP/UDP listeners. default value: 900 for TCP listeners and 300 for UDP listeners. value range: 10–900 for shared instances and dedicated instances and 10–1980 for lcu-supported instances. to set a value exceeding 1980, [submit a ticket application](https://console.cloud.tencent.com/workorder/category). the maximum settable value is 3600. 
     * @return IdleConnectTimeout Specifies the idle connection timeout in seconds. this parameter applies only to TCP/UDP listeners. default value: 900 for TCP listeners and 300 for UDP listeners. value range: 10–900 for shared instances and dedicated instances and 10–1980 for lcu-supported instances. to set a value exceeding 1980, [submit a ticket application](https://console.cloud.tencent.com/workorder/category). the maximum settable value is 3600.
     */
    public Long getIdleConnectTimeout() {
        return this.IdleConnectTimeout;
    }

    /**
     * Set Specifies the idle connection timeout in seconds. this parameter applies only to TCP/UDP listeners. default value: 900 for TCP listeners and 300 for UDP listeners. value range: 10–900 for shared instances and dedicated instances and 10–1980 for lcu-supported instances. to set a value exceeding 1980, [submit a ticket application](https://console.cloud.tencent.com/workorder/category). the maximum settable value is 3600.
     * @param IdleConnectTimeout Specifies the idle connection timeout in seconds. this parameter applies only to TCP/UDP listeners. default value: 900 for TCP listeners and 300 for UDP listeners. value range: 10–900 for shared instances and dedicated instances and 10–1980 for lcu-supported instances. to set a value exceeding 1980, [submit a ticket application](https://console.cloud.tencent.com/workorder/category). the maximum settable value is 3600.
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

