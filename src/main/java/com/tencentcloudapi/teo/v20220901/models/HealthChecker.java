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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthChecker extends AbstractModel {

    /**
    * <p>Health check policy. Valid values:</p><li>HTTP;</li><li>HTTPS;</li><li>TCP;</li><li>UDP;</li><li>ICMP Ping;</li><li>NoCheck.</li>Note: NoCheck means health check policy is not enabled.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Check port, which is required when Type = HTTP, Type = HTTPS, Type = TCP, or Type = UDP.</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Check frequency, in seconds. It indicates how often a health check task is initiated. Configurable range: 10-600 seconds.</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>Timeout for each health check, in seconds. If the health check time exceeds this value, the check result is determined as "unhealthy". The default value is 5s, and the value should be less than Interval.</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>Health threshold, in the number of times. It indicates that if the consecutive health check results are "healthy" for a certain number of times, an origin server is considered "healthy". The default value is 3 times, with the minimum value of 1 time.</p>
    */
    @SerializedName("HealthThreshold")
    @Expose
    private Long HealthThreshold;

    /**
    * <p>Unhealthy state threshold, in the number of times. It indicates that if the consecutive health check results are "unhealthy" for a certain number of times, an origin server is considered "unhealthy". The default value is 2 times.</p>
    */
    @SerializedName("CriticalThreshold")
    @Expose
    private Long CriticalThreshold;

    /**
    * <p>Probe path. This parameter is valid only when Type = HTTP or Type = HTTPS. It needs to include the complete host/path and should not contain a protocol, for example, www.example.com/test.</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Probe request Host Header policy. It takes effect only when Type=HTTP or Type=HTTPS and the instance type is HTTP-dedicated (V2). Valid values:</p><li>FollowCheckURL: Follows the Host specified by the probe URL, that is, the Host part in the HealthChecker.Path field will be used as the Host address for probing;</li><li>FollowOriginGroup: Follows the origin-pull Host Header configured in the origin group, that is, the OriginGroup.HostHeader field value of the origin group where the probed origin resides will be used as the Host address for probing. If the origin group has no HostHeader configured, the Host part in the HealthChecker.Path field will be used as the Host address for probing;</li><li>FollowOrigin: Follows the origin address, that is, the OriginGroup.Records[N].Record field value (the origin address itself) of the corresponding origin record in the origin group where the probed origin resides will be used as the Host address for probing.</li>Default: FollowCheckURL.
    */
    @SerializedName("HostHeaderPolicy")
    @Expose
    private String HostHeaderPolicy;

    /**
    * <p>Request method. This parameter is valid only when Type = HTTP or Type = HTTPS. Valid values:</p><li>GET;</li><li>HEAD.</li>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>The status codes used to determine that the probe result is healthy when the probe node initiates a health check to an origin server. This parameter is valid only when Type = HTTP or Type = HTTPS.</p>
    */
    @SerializedName("ExpectedCodes")
    @Expose
    private String [] ExpectedCodes;

    /**
    * <p>This parameter is valid only when Type=HTTP or Type=HTTPS. It refers to the custom HTTP request header carried in the probe request. Up to 10 can be configured.</p>
    */
    @SerializedName("Headers")
    @Expose
    private CustomizedHeader [] Headers;

    /**
    * <p>Whether to follow 301/302 redirect. When enabled, 301/302 is considered a "healthy" status code, redirecting 3 times by default. This parameter is valid only when Type = HTTP or Type = HTTPS.</p>
    */
    @SerializedName("FollowRedirect")
    @Expose
    private String FollowRedirect;

    /**
    * <p>The content sent by a health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.</p>
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * <p>The expected return result from an origin server during health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.</p>
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
    * <p>Health check probe cluster. Specifies the cluster region scope from which this load balancer instance initiates health probes. For details on the regional distribution of probe clusters, see <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policy Introduction</a>. This can be configured only for HTTP-dedicated (V2) load balancer instances. Valid values:</p><li>global: Probes are initiated by probe clusters in all regions worldwide, including the Chinese mainland and regions outside the Chinese mainland. Clusters in each region independently maintain their own probe results;</li><li>mainland_china: Probes are initiated only by probe clusters in the Chinese mainland. Currently, the Chinese mainland shares one probe cluster, and probe results are maintained by the probe cluster in the Chinese mainland. Other regions follow the probe results of the cluster in the Chinese mainland;</li><li>overseas: Probes are initiated only by probe clusters in regions outside the Chinese mainland. Currently, regions outside the Chinese mainland contain probe clusters in multiple areas, and probe results are independently maintained by the probe clusters in each area. Probe results for the Chinese mainland are generated by aggregating the probe results of the probe clusters in all other areas.</li>Default: global.
    */
    @SerializedName("ProbeCluster")
    @Expose
    private String ProbeCluster;

    /**
     * Get <p>Health check policy. Valid values:</p><li>HTTP;</li><li>HTTPS;</li><li>TCP;</li><li>UDP;</li><li>ICMP Ping;</li><li>NoCheck.</li>Note: NoCheck means health check policy is not enabled. 
     * @return Type <p>Health check policy. Valid values:</p><li>HTTP;</li><li>HTTPS;</li><li>TCP;</li><li>UDP;</li><li>ICMP Ping;</li><li>NoCheck.</li>Note: NoCheck means health check policy is not enabled.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Health check policy. Valid values:</p><li>HTTP;</li><li>HTTPS;</li><li>TCP;</li><li>UDP;</li><li>ICMP Ping;</li><li>NoCheck.</li>Note: NoCheck means health check policy is not enabled.
     * @param Type <p>Health check policy. Valid values:</p><li>HTTP;</li><li>HTTPS;</li><li>TCP;</li><li>UDP;</li><li>ICMP Ping;</li><li>NoCheck.</li>Note: NoCheck means health check policy is not enabled.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Check port, which is required when Type = HTTP, Type = HTTPS, Type = TCP, or Type = UDP.</p> 
     * @return Port <p>Check port, which is required when Type = HTTP, Type = HTTPS, Type = TCP, or Type = UDP.</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Check port, which is required when Type = HTTP, Type = HTTPS, Type = TCP, or Type = UDP.</p>
     * @param Port <p>Check port, which is required when Type = HTTP, Type = HTTPS, Type = TCP, or Type = UDP.</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Check frequency, in seconds. It indicates how often a health check task is initiated. Configurable range: 10-600 seconds.</p> 
     * @return Interval <p>Check frequency, in seconds. It indicates how often a health check task is initiated. Configurable range: 10-600 seconds.</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Check frequency, in seconds. It indicates how often a health check task is initiated. Configurable range: 10-600 seconds.</p>
     * @param Interval <p>Check frequency, in seconds. It indicates how often a health check task is initiated. Configurable range: 10-600 seconds.</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>Timeout for each health check, in seconds. If the health check time exceeds this value, the check result is determined as "unhealthy". The default value is 5s, and the value should be less than Interval.</p> 
     * @return Timeout <p>Timeout for each health check, in seconds. If the health check time exceeds this value, the check result is determined as "unhealthy". The default value is 5s, and the value should be less than Interval.</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Timeout for each health check, in seconds. If the health check time exceeds this value, the check result is determined as "unhealthy". The default value is 5s, and the value should be less than Interval.</p>
     * @param Timeout <p>Timeout for each health check, in seconds. If the health check time exceeds this value, the check result is determined as "unhealthy". The default value is 5s, and the value should be less than Interval.</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Health threshold, in the number of times. It indicates that if the consecutive health check results are "healthy" for a certain number of times, an origin server is considered "healthy". The default value is 3 times, with the minimum value of 1 time.</p> 
     * @return HealthThreshold <p>Health threshold, in the number of times. It indicates that if the consecutive health check results are "healthy" for a certain number of times, an origin server is considered "healthy". The default value is 3 times, with the minimum value of 1 time.</p>
     */
    public Long getHealthThreshold() {
        return this.HealthThreshold;
    }

    /**
     * Set <p>Health threshold, in the number of times. It indicates that if the consecutive health check results are "healthy" for a certain number of times, an origin server is considered "healthy". The default value is 3 times, with the minimum value of 1 time.</p>
     * @param HealthThreshold <p>Health threshold, in the number of times. It indicates that if the consecutive health check results are "healthy" for a certain number of times, an origin server is considered "healthy". The default value is 3 times, with the minimum value of 1 time.</p>
     */
    public void setHealthThreshold(Long HealthThreshold) {
        this.HealthThreshold = HealthThreshold;
    }

    /**
     * Get <p>Unhealthy state threshold, in the number of times. It indicates that if the consecutive health check results are "unhealthy" for a certain number of times, an origin server is considered "unhealthy". The default value is 2 times.</p> 
     * @return CriticalThreshold <p>Unhealthy state threshold, in the number of times. It indicates that if the consecutive health check results are "unhealthy" for a certain number of times, an origin server is considered "unhealthy". The default value is 2 times.</p>
     */
    public Long getCriticalThreshold() {
        return this.CriticalThreshold;
    }

    /**
     * Set <p>Unhealthy state threshold, in the number of times. It indicates that if the consecutive health check results are "unhealthy" for a certain number of times, an origin server is considered "unhealthy". The default value is 2 times.</p>
     * @param CriticalThreshold <p>Unhealthy state threshold, in the number of times. It indicates that if the consecutive health check results are "unhealthy" for a certain number of times, an origin server is considered "unhealthy". The default value is 2 times.</p>
     */
    public void setCriticalThreshold(Long CriticalThreshold) {
        this.CriticalThreshold = CriticalThreshold;
    }

    /**
     * Get <p>Probe path. This parameter is valid only when Type = HTTP or Type = HTTPS. It needs to include the complete host/path and should not contain a protocol, for example, www.example.com/test.</p> 
     * @return Path <p>Probe path. This parameter is valid only when Type = HTTP or Type = HTTPS. It needs to include the complete host/path and should not contain a protocol, for example, www.example.com/test.</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Probe path. This parameter is valid only when Type = HTTP or Type = HTTPS. It needs to include the complete host/path and should not contain a protocol, for example, www.example.com/test.</p>
     * @param Path <p>Probe path. This parameter is valid only when Type = HTTP or Type = HTTPS. It needs to include the complete host/path and should not contain a protocol, for example, www.example.com/test.</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Probe request Host Header policy. It takes effect only when Type=HTTP or Type=HTTPS and the instance type is HTTP-dedicated (V2). Valid values:</p><li>FollowCheckURL: Follows the Host specified by the probe URL, that is, the Host part in the HealthChecker.Path field will be used as the Host address for probing;</li><li>FollowOriginGroup: Follows the origin-pull Host Header configured in the origin group, that is, the OriginGroup.HostHeader field value of the origin group where the probed origin resides will be used as the Host address for probing. If the origin group has no HostHeader configured, the Host part in the HealthChecker.Path field will be used as the Host address for probing;</li><li>FollowOrigin: Follows the origin address, that is, the OriginGroup.Records[N].Record field value (the origin address itself) of the corresponding origin record in the origin group where the probed origin resides will be used as the Host address for probing.</li>Default: FollowCheckURL. 
     * @return HostHeaderPolicy <p>Probe request Host Header policy. It takes effect only when Type=HTTP or Type=HTTPS and the instance type is HTTP-dedicated (V2). Valid values:</p><li>FollowCheckURL: Follows the Host specified by the probe URL, that is, the Host part in the HealthChecker.Path field will be used as the Host address for probing;</li><li>FollowOriginGroup: Follows the origin-pull Host Header configured in the origin group, that is, the OriginGroup.HostHeader field value of the origin group where the probed origin resides will be used as the Host address for probing. If the origin group has no HostHeader configured, the Host part in the HealthChecker.Path field will be used as the Host address for probing;</li><li>FollowOrigin: Follows the origin address, that is, the OriginGroup.Records[N].Record field value (the origin address itself) of the corresponding origin record in the origin group where the probed origin resides will be used as the Host address for probing.</li>Default: FollowCheckURL.
     */
    public String getHostHeaderPolicy() {
        return this.HostHeaderPolicy;
    }

    /**
     * Set <p>Probe request Host Header policy. It takes effect only when Type=HTTP or Type=HTTPS and the instance type is HTTP-dedicated (V2). Valid values:</p><li>FollowCheckURL: Follows the Host specified by the probe URL, that is, the Host part in the HealthChecker.Path field will be used as the Host address for probing;</li><li>FollowOriginGroup: Follows the origin-pull Host Header configured in the origin group, that is, the OriginGroup.HostHeader field value of the origin group where the probed origin resides will be used as the Host address for probing. If the origin group has no HostHeader configured, the Host part in the HealthChecker.Path field will be used as the Host address for probing;</li><li>FollowOrigin: Follows the origin address, that is, the OriginGroup.Records[N].Record field value (the origin address itself) of the corresponding origin record in the origin group where the probed origin resides will be used as the Host address for probing.</li>Default: FollowCheckURL.
     * @param HostHeaderPolicy <p>Probe request Host Header policy. It takes effect only when Type=HTTP or Type=HTTPS and the instance type is HTTP-dedicated (V2). Valid values:</p><li>FollowCheckURL: Follows the Host specified by the probe URL, that is, the Host part in the HealthChecker.Path field will be used as the Host address for probing;</li><li>FollowOriginGroup: Follows the origin-pull Host Header configured in the origin group, that is, the OriginGroup.HostHeader field value of the origin group where the probed origin resides will be used as the Host address for probing. If the origin group has no HostHeader configured, the Host part in the HealthChecker.Path field will be used as the Host address for probing;</li><li>FollowOrigin: Follows the origin address, that is, the OriginGroup.Records[N].Record field value (the origin address itself) of the corresponding origin record in the origin group where the probed origin resides will be used as the Host address for probing.</li>Default: FollowCheckURL.
     */
    public void setHostHeaderPolicy(String HostHeaderPolicy) {
        this.HostHeaderPolicy = HostHeaderPolicy;
    }

    /**
     * Get <p>Request method. This parameter is valid only when Type = HTTP or Type = HTTPS. Valid values:</p><li>GET;</li><li>HEAD.</li> 
     * @return Method <p>Request method. This parameter is valid only when Type = HTTP or Type = HTTPS. Valid values:</p><li>GET;</li><li>HEAD.</li>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>Request method. This parameter is valid only when Type = HTTP or Type = HTTPS. Valid values:</p><li>GET;</li><li>HEAD.</li>
     * @param Method <p>Request method. This parameter is valid only when Type = HTTP or Type = HTTPS. Valid values:</p><li>GET;</li><li>HEAD.</li>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>The status codes used to determine that the probe result is healthy when the probe node initiates a health check to an origin server. This parameter is valid only when Type = HTTP or Type = HTTPS.</p> 
     * @return ExpectedCodes <p>The status codes used to determine that the probe result is healthy when the probe node initiates a health check to an origin server. This parameter is valid only when Type = HTTP or Type = HTTPS.</p>
     */
    public String [] getExpectedCodes() {
        return this.ExpectedCodes;
    }

    /**
     * Set <p>The status codes used to determine that the probe result is healthy when the probe node initiates a health check to an origin server. This parameter is valid only when Type = HTTP or Type = HTTPS.</p>
     * @param ExpectedCodes <p>The status codes used to determine that the probe result is healthy when the probe node initiates a health check to an origin server. This parameter is valid only when Type = HTTP or Type = HTTPS.</p>
     */
    public void setExpectedCodes(String [] ExpectedCodes) {
        this.ExpectedCodes = ExpectedCodes;
    }

    /**
     * Get <p>This parameter is valid only when Type=HTTP or Type=HTTPS. It refers to the custom HTTP request header carried in the probe request. Up to 10 can be configured.</p> 
     * @return Headers <p>This parameter is valid only when Type=HTTP or Type=HTTPS. It refers to the custom HTTP request header carried in the probe request. Up to 10 can be configured.</p>
     */
    public CustomizedHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>This parameter is valid only when Type=HTTP or Type=HTTPS. It refers to the custom HTTP request header carried in the probe request. Up to 10 can be configured.</p>
     * @param Headers <p>This parameter is valid only when Type=HTTP or Type=HTTPS. It refers to the custom HTTP request header carried in the probe request. Up to 10 can be configured.</p>
     */
    public void setHeaders(CustomizedHeader [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>Whether to follow 301/302 redirect. When enabled, 301/302 is considered a "healthy" status code, redirecting 3 times by default. This parameter is valid only when Type = HTTP or Type = HTTPS.</p> 
     * @return FollowRedirect <p>Whether to follow 301/302 redirect. When enabled, 301/302 is considered a "healthy" status code, redirecting 3 times by default. This parameter is valid only when Type = HTTP or Type = HTTPS.</p>
     */
    public String getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set <p>Whether to follow 301/302 redirect. When enabled, 301/302 is considered a "healthy" status code, redirecting 3 times by default. This parameter is valid only when Type = HTTP or Type = HTTPS.</p>
     * @param FollowRedirect <p>Whether to follow 301/302 redirect. When enabled, 301/302 is considered a "healthy" status code, redirecting 3 times by default. This parameter is valid only when Type = HTTP or Type = HTTPS.</p>
     */
    public void setFollowRedirect(String FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get <p>The content sent by a health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.</p> 
     * @return SendContext <p>The content sent by a health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.</p>
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set <p>The content sent by a health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.</p>
     * @param SendContext <p>The content sent by a health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.</p>
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get <p>The expected return result from an origin server during health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.</p> 
     * @return RecvContext <p>The expected return result from an origin server during health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.</p>
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set <p>The expected return result from an origin server during health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.</p>
     * @param RecvContext <p>The expected return result from an origin server during health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.</p>
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    /**
     * Get <p>Health check probe cluster. Specifies the cluster region scope from which this load balancer instance initiates health probes. For details on the regional distribution of probe clusters, see <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policy Introduction</a>. This can be configured only for HTTP-dedicated (V2) load balancer instances. Valid values:</p><li>global: Probes are initiated by probe clusters in all regions worldwide, including the Chinese mainland and regions outside the Chinese mainland. Clusters in each region independently maintain their own probe results;</li><li>mainland_china: Probes are initiated only by probe clusters in the Chinese mainland. Currently, the Chinese mainland shares one probe cluster, and probe results are maintained by the probe cluster in the Chinese mainland. Other regions follow the probe results of the cluster in the Chinese mainland;</li><li>overseas: Probes are initiated only by probe clusters in regions outside the Chinese mainland. Currently, regions outside the Chinese mainland contain probe clusters in multiple areas, and probe results are independently maintained by the probe clusters in each area. Probe results for the Chinese mainland are generated by aggregating the probe results of the probe clusters in all other areas.</li>Default: global. 
     * @return ProbeCluster <p>Health check probe cluster. Specifies the cluster region scope from which this load balancer instance initiates health probes. For details on the regional distribution of probe clusters, see <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policy Introduction</a>. This can be configured only for HTTP-dedicated (V2) load balancer instances. Valid values:</p><li>global: Probes are initiated by probe clusters in all regions worldwide, including the Chinese mainland and regions outside the Chinese mainland. Clusters in each region independently maintain their own probe results;</li><li>mainland_china: Probes are initiated only by probe clusters in the Chinese mainland. Currently, the Chinese mainland shares one probe cluster, and probe results are maintained by the probe cluster in the Chinese mainland. Other regions follow the probe results of the cluster in the Chinese mainland;</li><li>overseas: Probes are initiated only by probe clusters in regions outside the Chinese mainland. Currently, regions outside the Chinese mainland contain probe clusters in multiple areas, and probe results are independently maintained by the probe clusters in each area. Probe results for the Chinese mainland are generated by aggregating the probe results of the probe clusters in all other areas.</li>Default: global.
     */
    public String getProbeCluster() {
        return this.ProbeCluster;
    }

    /**
     * Set <p>Health check probe cluster. Specifies the cluster region scope from which this load balancer instance initiates health probes. For details on the regional distribution of probe clusters, see <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policy Introduction</a>. This can be configured only for HTTP-dedicated (V2) load balancer instances. Valid values:</p><li>global: Probes are initiated by probe clusters in all regions worldwide, including the Chinese mainland and regions outside the Chinese mainland. Clusters in each region independently maintain their own probe results;</li><li>mainland_china: Probes are initiated only by probe clusters in the Chinese mainland. Currently, the Chinese mainland shares one probe cluster, and probe results are maintained by the probe cluster in the Chinese mainland. Other regions follow the probe results of the cluster in the Chinese mainland;</li><li>overseas: Probes are initiated only by probe clusters in regions outside the Chinese mainland. Currently, regions outside the Chinese mainland contain probe clusters in multiple areas, and probe results are independently maintained by the probe clusters in each area. Probe results for the Chinese mainland are generated by aggregating the probe results of the probe clusters in all other areas.</li>Default: global.
     * @param ProbeCluster <p>Health check probe cluster. Specifies the cluster region scope from which this load balancer instance initiates health probes. For details on the regional distribution of probe clusters, see <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policy Introduction</a>. This can be configured only for HTTP-dedicated (V2) load balancer instances. Valid values:</p><li>global: Probes are initiated by probe clusters in all regions worldwide, including the Chinese mainland and regions outside the Chinese mainland. Clusters in each region independently maintain their own probe results;</li><li>mainland_china: Probes are initiated only by probe clusters in the Chinese mainland. Currently, the Chinese mainland shares one probe cluster, and probe results are maintained by the probe cluster in the Chinese mainland. Other regions follow the probe results of the cluster in the Chinese mainland;</li><li>overseas: Probes are initiated only by probe clusters in regions outside the Chinese mainland. Currently, regions outside the Chinese mainland contain probe clusters in multiple areas, and probe results are independently maintained by the probe clusters in each area. Probe results for the Chinese mainland are generated by aggregating the probe results of the probe clusters in all other areas.</li>Default: global.
     */
    public void setProbeCluster(String ProbeCluster) {
        this.ProbeCluster = ProbeCluster;
    }

    public HealthChecker() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthChecker(HealthChecker source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.HealthThreshold != null) {
            this.HealthThreshold = new Long(source.HealthThreshold);
        }
        if (source.CriticalThreshold != null) {
            this.CriticalThreshold = new Long(source.CriticalThreshold);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.HostHeaderPolicy != null) {
            this.HostHeaderPolicy = new String(source.HostHeaderPolicy);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.ExpectedCodes != null) {
            this.ExpectedCodes = new String[source.ExpectedCodes.length];
            for (int i = 0; i < source.ExpectedCodes.length; i++) {
                this.ExpectedCodes[i] = new String(source.ExpectedCodes[i]);
            }
        }
        if (source.Headers != null) {
            this.Headers = new CustomizedHeader[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new CustomizedHeader(source.Headers[i]);
            }
        }
        if (source.FollowRedirect != null) {
            this.FollowRedirect = new String(source.FollowRedirect);
        }
        if (source.SendContext != null) {
            this.SendContext = new String(source.SendContext);
        }
        if (source.RecvContext != null) {
            this.RecvContext = new String(source.RecvContext);
        }
        if (source.ProbeCluster != null) {
            this.ProbeCluster = new String(source.ProbeCluster);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "HealthThreshold", this.HealthThreshold);
        this.setParamSimple(map, prefix + "CriticalThreshold", this.CriticalThreshold);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "HostHeaderPolicy", this.HostHeaderPolicy);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamArraySimple(map, prefix + "ExpectedCodes.", this.ExpectedCodes);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "FollowRedirect", this.FollowRedirect);
        this.setParamSimple(map, prefix + "SendContext", this.SendContext);
        this.setParamSimple(map, prefix + "RecvContext", this.RecvContext);
        this.setParamSimple(map, prefix + "ProbeCluster", this.ProbeCluster);

    }
}

