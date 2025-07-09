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
    * Health check policy. Valid values:
<li>HTTP.</li>
<li>HTTPS.</li>
<li>TCP.</li>
<li>UDP.</li>
<li>ICMP Ping.</li>
<li>NoCheck.</li>
Note: NoCheck means the health check policy is not enabled.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Check port, which is required when Type = HTTP, Type = HTTPS, Type = TCP, or Type = UDP.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Check frequency, in seconds. It indicates how often a health check task is initiated. Valid values: 30, 60, 180, 300, 600.
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Timeout for each health check, in seconds. If the health check time exceeds this value, the check result is determined as "unhealthy". The default value is 5s, and the value should be less than Interval.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Healthy state threshold, in the number of times. It indicates that if the consecutive health check results are "healthy" for a certain number of times, an origin server is considered "healthy". The default value is 3 times, with the minimum value of 1 time.
    */
    @SerializedName("HealthThreshold")
    @Expose
    private Long HealthThreshold;

    /**
    * Unhealthy state threshold, in the number of times. It indicates that if the consecutive health check results are "unhealthy" for a certain number of times, an origin server is considered "unhealthy". The default value is 2 times.
    */
    @SerializedName("CriticalThreshold")
    @Expose
    private Long CriticalThreshold;

    /**
    * Probe path. This parameter is valid only when Type = HTTP or Type = HTTPS. It needs to include the complete host/path and should not contain a protocol, for example, www.example.com/test.

    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Request method. This parameter is valid only when Type = HTTP or Type = HTTPS. Valid values:
<li>GET.</li>
<li>HEAD.</li>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * The status codes used to determine that the probe result is healthy when the probe node initiates a health check to an origin server. This parameter is valid only when Type = HTTP or Type = HTTPS.
    */
    @SerializedName("ExpectedCodes")
    @Expose
    private String [] ExpectedCodes;

    /**
    * The custom HTTP request header carried by a probe request, with a maximum value of 10. This parameter is valid only when Type = HTTP or Type = HTTPS.
    */
    @SerializedName("Headers")
    @Expose
    private CustomizedHeader [] Headers;

    /**
    * Whether to follow 301/302 redirect. When enabled, 301/302 is considered a "healthy" status code, redirecting 3 times by default. This parameter is valid only when Type = HTTP or Type = HTTPS.
    */
    @SerializedName("FollowRedirect")
    @Expose
    private String FollowRedirect;

    /**
    * The content sent by a health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * The expected return result from an origin server during health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
     * Get Health check policy. Valid values:
<li>HTTP.</li>
<li>HTTPS.</li>
<li>TCP.</li>
<li>UDP.</li>
<li>ICMP Ping.</li>
<li>NoCheck.</li>
Note: NoCheck means the health check policy is not enabled. 
     * @return Type Health check policy. Valid values:
<li>HTTP.</li>
<li>HTTPS.</li>
<li>TCP.</li>
<li>UDP.</li>
<li>ICMP Ping.</li>
<li>NoCheck.</li>
Note: NoCheck means the health check policy is not enabled.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Health check policy. Valid values:
<li>HTTP.</li>
<li>HTTPS.</li>
<li>TCP.</li>
<li>UDP.</li>
<li>ICMP Ping.</li>
<li>NoCheck.</li>
Note: NoCheck means the health check policy is not enabled.
     * @param Type Health check policy. Valid values:
<li>HTTP.</li>
<li>HTTPS.</li>
<li>TCP.</li>
<li>UDP.</li>
<li>ICMP Ping.</li>
<li>NoCheck.</li>
Note: NoCheck means the health check policy is not enabled.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Check port, which is required when Type = HTTP, Type = HTTPS, Type = TCP, or Type = UDP. 
     * @return Port Check port, which is required when Type = HTTP, Type = HTTPS, Type = TCP, or Type = UDP.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Check port, which is required when Type = HTTP, Type = HTTPS, Type = TCP, or Type = UDP.
     * @param Port Check port, which is required when Type = HTTP, Type = HTTPS, Type = TCP, or Type = UDP.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Check frequency, in seconds. It indicates how often a health check task is initiated. Valid values: 30, 60, 180, 300, 600. 
     * @return Interval Check frequency, in seconds. It indicates how often a health check task is initiated. Valid values: 30, 60, 180, 300, 600.
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Check frequency, in seconds. It indicates how often a health check task is initiated. Valid values: 30, 60, 180, 300, 600.
     * @param Interval Check frequency, in seconds. It indicates how often a health check task is initiated. Valid values: 30, 60, 180, 300, 600.
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Timeout for each health check, in seconds. If the health check time exceeds this value, the check result is determined as "unhealthy". The default value is 5s, and the value should be less than Interval. 
     * @return Timeout Timeout for each health check, in seconds. If the health check time exceeds this value, the check result is determined as "unhealthy". The default value is 5s, and the value should be less than Interval.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout for each health check, in seconds. If the health check time exceeds this value, the check result is determined as "unhealthy". The default value is 5s, and the value should be less than Interval.
     * @param Timeout Timeout for each health check, in seconds. If the health check time exceeds this value, the check result is determined as "unhealthy". The default value is 5s, and the value should be less than Interval.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Healthy state threshold, in the number of times. It indicates that if the consecutive health check results are "healthy" for a certain number of times, an origin server is considered "healthy". The default value is 3 times, with the minimum value of 1 time. 
     * @return HealthThreshold Healthy state threshold, in the number of times. It indicates that if the consecutive health check results are "healthy" for a certain number of times, an origin server is considered "healthy". The default value is 3 times, with the minimum value of 1 time.
     */
    public Long getHealthThreshold() {
        return this.HealthThreshold;
    }

    /**
     * Set Healthy state threshold, in the number of times. It indicates that if the consecutive health check results are "healthy" for a certain number of times, an origin server is considered "healthy". The default value is 3 times, with the minimum value of 1 time.
     * @param HealthThreshold Healthy state threshold, in the number of times. It indicates that if the consecutive health check results are "healthy" for a certain number of times, an origin server is considered "healthy". The default value is 3 times, with the minimum value of 1 time.
     */
    public void setHealthThreshold(Long HealthThreshold) {
        this.HealthThreshold = HealthThreshold;
    }

    /**
     * Get Unhealthy state threshold, in the number of times. It indicates that if the consecutive health check results are "unhealthy" for a certain number of times, an origin server is considered "unhealthy". The default value is 2 times. 
     * @return CriticalThreshold Unhealthy state threshold, in the number of times. It indicates that if the consecutive health check results are "unhealthy" for a certain number of times, an origin server is considered "unhealthy". The default value is 2 times.
     */
    public Long getCriticalThreshold() {
        return this.CriticalThreshold;
    }

    /**
     * Set Unhealthy state threshold, in the number of times. It indicates that if the consecutive health check results are "unhealthy" for a certain number of times, an origin server is considered "unhealthy". The default value is 2 times.
     * @param CriticalThreshold Unhealthy state threshold, in the number of times. It indicates that if the consecutive health check results are "unhealthy" for a certain number of times, an origin server is considered "unhealthy". The default value is 2 times.
     */
    public void setCriticalThreshold(Long CriticalThreshold) {
        this.CriticalThreshold = CriticalThreshold;
    }

    /**
     * Get Probe path. This parameter is valid only when Type = HTTP or Type = HTTPS. It needs to include the complete host/path and should not contain a protocol, for example, www.example.com/test.
 
     * @return Path Probe path. This parameter is valid only when Type = HTTP or Type = HTTPS. It needs to include the complete host/path and should not contain a protocol, for example, www.example.com/test.

     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Probe path. This parameter is valid only when Type = HTTP or Type = HTTPS. It needs to include the complete host/path and should not contain a protocol, for example, www.example.com/test.

     * @param Path Probe path. This parameter is valid only when Type = HTTP or Type = HTTPS. It needs to include the complete host/path and should not contain a protocol, for example, www.example.com/test.

     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Request method. This parameter is valid only when Type = HTTP or Type = HTTPS. Valid values:
<li>GET.</li>
<li>HEAD.</li> 
     * @return Method Request method. This parameter is valid only when Type = HTTP or Type = HTTPS. Valid values:
<li>GET.</li>
<li>HEAD.</li>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Request method. This parameter is valid only when Type = HTTP or Type = HTTPS. Valid values:
<li>GET.</li>
<li>HEAD.</li>
     * @param Method Request method. This parameter is valid only when Type = HTTP or Type = HTTPS. Valid values:
<li>GET.</li>
<li>HEAD.</li>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get The status codes used to determine that the probe result is healthy when the probe node initiates a health check to an origin server. This parameter is valid only when Type = HTTP or Type = HTTPS. 
     * @return ExpectedCodes The status codes used to determine that the probe result is healthy when the probe node initiates a health check to an origin server. This parameter is valid only when Type = HTTP or Type = HTTPS.
     */
    public String [] getExpectedCodes() {
        return this.ExpectedCodes;
    }

    /**
     * Set The status codes used to determine that the probe result is healthy when the probe node initiates a health check to an origin server. This parameter is valid only when Type = HTTP or Type = HTTPS.
     * @param ExpectedCodes The status codes used to determine that the probe result is healthy when the probe node initiates a health check to an origin server. This parameter is valid only when Type = HTTP or Type = HTTPS.
     */
    public void setExpectedCodes(String [] ExpectedCodes) {
        this.ExpectedCodes = ExpectedCodes;
    }

    /**
     * Get The custom HTTP request header carried by a probe request, with a maximum value of 10. This parameter is valid only when Type = HTTP or Type = HTTPS. 
     * @return Headers The custom HTTP request header carried by a probe request, with a maximum value of 10. This parameter is valid only when Type = HTTP or Type = HTTPS.
     */
    public CustomizedHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set The custom HTTP request header carried by a probe request, with a maximum value of 10. This parameter is valid only when Type = HTTP or Type = HTTPS.
     * @param Headers The custom HTTP request header carried by a probe request, with a maximum value of 10. This parameter is valid only when Type = HTTP or Type = HTTPS.
     */
    public void setHeaders(CustomizedHeader [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get Whether to follow 301/302 redirect. When enabled, 301/302 is considered a "healthy" status code, redirecting 3 times by default. This parameter is valid only when Type = HTTP or Type = HTTPS. 
     * @return FollowRedirect Whether to follow 301/302 redirect. When enabled, 301/302 is considered a "healthy" status code, redirecting 3 times by default. This parameter is valid only when Type = HTTP or Type = HTTPS.
     */
    public String getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set Whether to follow 301/302 redirect. When enabled, 301/302 is considered a "healthy" status code, redirecting 3 times by default. This parameter is valid only when Type = HTTP or Type = HTTPS.
     * @param FollowRedirect Whether to follow 301/302 redirect. When enabled, 301/302 is considered a "healthy" status code, redirecting 3 times by default. This parameter is valid only when Type = HTTP or Type = HTTPS.
     */
    public void setFollowRedirect(String FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get The content sent by a health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP. 
     * @return SendContext The content sent by a health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set The content sent by a health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.
     * @param SendContext The content sent by a health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get The expected return result from an origin server during health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP. 
     * @return RecvContext The expected return result from an origin server during health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set The expected return result from an origin server during health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.
     * @param RecvContext The expected return result from an origin server during health check. Only ASCII visible characters are allowed, with up to 500 characters. This parameter is valid only when Type = UDP.
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
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
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamArraySimple(map, prefix + "ExpectedCodes.", this.ExpectedCodes);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "FollowRedirect", this.FollowRedirect);
        this.setParamSimple(map, prefix + "SendContext", this.SendContext);
        this.setParamSimple(map, prefix + "RecvContext", this.RecvContext);

    }
}

