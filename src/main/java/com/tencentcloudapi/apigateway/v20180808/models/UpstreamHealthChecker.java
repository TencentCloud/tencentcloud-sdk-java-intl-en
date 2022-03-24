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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpstreamHealthChecker extends AbstractModel{

    /**
    * Specifies whether to enable active health check
    */
    @SerializedName("EnableActiveCheck")
    @Expose
    private Boolean EnableActiveCheck;

    /**
    * Specifies whether the enable passive health check
    */
    @SerializedName("EnablePassiveCheck")
    @Expose
    private Boolean EnablePassiveCheck;

    /**
    * The HTTP status code that indicates that the upstream is healthy
    */
    @SerializedName("HealthyHttpStatus")
    @Expose
    private String HealthyHttpStatus;

    /**
    * The HTTP status code that indicates that the upstream is unhealthy
    */
    @SerializedName("UnhealthyHttpStatus")
    @Expose
    private String UnhealthyHttpStatus;

    /**
    * The threshold on consecutive TCP errors. Range: [0, 254]. `0` indicates not to check TCP.
    */
    @SerializedName("TcpFailureThreshold")
    @Expose
    private Long TcpFailureThreshold;

    /**
    * The threshold on consecutive timeouts. Range: [0, 254]. `0` indicates not to check TCP.
    */
    @SerializedName("TimeoutThreshold")
    @Expose
    private Long TimeoutThreshold;

    /**
    * The threshold on consecutive HTTP errors. Range: [0, 254]. `0` indicates not to check HTTP.
    */
    @SerializedName("HttpFailureThreshold")
    @Expose
    private Long HttpFailureThreshold;

    /**
    * The path for active health check. It defaults to `/`.
    */
    @SerializedName("ActiveCheckHttpPath")
    @Expose
    private String ActiveCheckHttpPath;

    /**
    * The timeout period for active health check in seconds. Default: `5`. 
    */
    @SerializedName("ActiveCheckTimeout")
    @Expose
    private Long ActiveCheckTimeout;

    /**
    * The interval for active health check in seconds. Default: `5`. 
    */
    @SerializedName("ActiveCheckInterval")
    @Expose
    private Long ActiveCheckInterval;

    /**
    * Header of the active health check request
    */
    @SerializedName("ActiveRequestHeader")
    @Expose
    private UpstreamHealthCheckerReqHeaders [] ActiveRequestHeader;

    /**
    * The period for an abnormal to recover automatically in seconds. If only the passive health check is enabled, it must be greater than 0. Otherwise the abnormal nodes can not recovered automatically. The default value is 30 seconds. 
    */
    @SerializedName("UnhealthyTimeout")
    @Expose
    private Long UnhealthyTimeout;

    /**
     * Get Specifies whether to enable active health check 
     * @return EnableActiveCheck Specifies whether to enable active health check
     */
    public Boolean getEnableActiveCheck() {
        return this.EnableActiveCheck;
    }

    /**
     * Set Specifies whether to enable active health check
     * @param EnableActiveCheck Specifies whether to enable active health check
     */
    public void setEnableActiveCheck(Boolean EnableActiveCheck) {
        this.EnableActiveCheck = EnableActiveCheck;
    }

    /**
     * Get Specifies whether the enable passive health check 
     * @return EnablePassiveCheck Specifies whether the enable passive health check
     */
    public Boolean getEnablePassiveCheck() {
        return this.EnablePassiveCheck;
    }

    /**
     * Set Specifies whether the enable passive health check
     * @param EnablePassiveCheck Specifies whether the enable passive health check
     */
    public void setEnablePassiveCheck(Boolean EnablePassiveCheck) {
        this.EnablePassiveCheck = EnablePassiveCheck;
    }

    /**
     * Get The HTTP status code that indicates that the upstream is healthy 
     * @return HealthyHttpStatus The HTTP status code that indicates that the upstream is healthy
     */
    public String getHealthyHttpStatus() {
        return this.HealthyHttpStatus;
    }

    /**
     * Set The HTTP status code that indicates that the upstream is healthy
     * @param HealthyHttpStatus The HTTP status code that indicates that the upstream is healthy
     */
    public void setHealthyHttpStatus(String HealthyHttpStatus) {
        this.HealthyHttpStatus = HealthyHttpStatus;
    }

    /**
     * Get The HTTP status code that indicates that the upstream is unhealthy 
     * @return UnhealthyHttpStatus The HTTP status code that indicates that the upstream is unhealthy
     */
    public String getUnhealthyHttpStatus() {
        return this.UnhealthyHttpStatus;
    }

    /**
     * Set The HTTP status code that indicates that the upstream is unhealthy
     * @param UnhealthyHttpStatus The HTTP status code that indicates that the upstream is unhealthy
     */
    public void setUnhealthyHttpStatus(String UnhealthyHttpStatus) {
        this.UnhealthyHttpStatus = UnhealthyHttpStatus;
    }

    /**
     * Get The threshold on consecutive TCP errors. Range: [0, 254]. `0` indicates not to check TCP. 
     * @return TcpFailureThreshold The threshold on consecutive TCP errors. Range: [0, 254]. `0` indicates not to check TCP.
     */
    public Long getTcpFailureThreshold() {
        return this.TcpFailureThreshold;
    }

    /**
     * Set The threshold on consecutive TCP errors. Range: [0, 254]. `0` indicates not to check TCP.
     * @param TcpFailureThreshold The threshold on consecutive TCP errors. Range: [0, 254]. `0` indicates not to check TCP.
     */
    public void setTcpFailureThreshold(Long TcpFailureThreshold) {
        this.TcpFailureThreshold = TcpFailureThreshold;
    }

    /**
     * Get The threshold on consecutive timeouts. Range: [0, 254]. `0` indicates not to check TCP. 
     * @return TimeoutThreshold The threshold on consecutive timeouts. Range: [0, 254]. `0` indicates not to check TCP.
     */
    public Long getTimeoutThreshold() {
        return this.TimeoutThreshold;
    }

    /**
     * Set The threshold on consecutive timeouts. Range: [0, 254]. `0` indicates not to check TCP.
     * @param TimeoutThreshold The threshold on consecutive timeouts. Range: [0, 254]. `0` indicates not to check TCP.
     */
    public void setTimeoutThreshold(Long TimeoutThreshold) {
        this.TimeoutThreshold = TimeoutThreshold;
    }

    /**
     * Get The threshold on consecutive HTTP errors. Range: [0, 254]. `0` indicates not to check HTTP. 
     * @return HttpFailureThreshold The threshold on consecutive HTTP errors. Range: [0, 254]. `0` indicates not to check HTTP.
     */
    public Long getHttpFailureThreshold() {
        return this.HttpFailureThreshold;
    }

    /**
     * Set The threshold on consecutive HTTP errors. Range: [0, 254]. `0` indicates not to check HTTP.
     * @param HttpFailureThreshold The threshold on consecutive HTTP errors. Range: [0, 254]. `0` indicates not to check HTTP.
     */
    public void setHttpFailureThreshold(Long HttpFailureThreshold) {
        this.HttpFailureThreshold = HttpFailureThreshold;
    }

    /**
     * Get The path for active health check. It defaults to `/`. 
     * @return ActiveCheckHttpPath The path for active health check. It defaults to `/`.
     */
    public String getActiveCheckHttpPath() {
        return this.ActiveCheckHttpPath;
    }

    /**
     * Set The path for active health check. It defaults to `/`.
     * @param ActiveCheckHttpPath The path for active health check. It defaults to `/`.
     */
    public void setActiveCheckHttpPath(String ActiveCheckHttpPath) {
        this.ActiveCheckHttpPath = ActiveCheckHttpPath;
    }

    /**
     * Get The timeout period for active health check in seconds. Default: `5`.  
     * @return ActiveCheckTimeout The timeout period for active health check in seconds. Default: `5`. 
     */
    public Long getActiveCheckTimeout() {
        return this.ActiveCheckTimeout;
    }

    /**
     * Set The timeout period for active health check in seconds. Default: `5`. 
     * @param ActiveCheckTimeout The timeout period for active health check in seconds. Default: `5`. 
     */
    public void setActiveCheckTimeout(Long ActiveCheckTimeout) {
        this.ActiveCheckTimeout = ActiveCheckTimeout;
    }

    /**
     * Get The interval for active health check in seconds. Default: `5`.  
     * @return ActiveCheckInterval The interval for active health check in seconds. Default: `5`. 
     */
    public Long getActiveCheckInterval() {
        return this.ActiveCheckInterval;
    }

    /**
     * Set The interval for active health check in seconds. Default: `5`. 
     * @param ActiveCheckInterval The interval for active health check in seconds. Default: `5`. 
     */
    public void setActiveCheckInterval(Long ActiveCheckInterval) {
        this.ActiveCheckInterval = ActiveCheckInterval;
    }

    /**
     * Get Header of the active health check request 
     * @return ActiveRequestHeader Header of the active health check request
     */
    public UpstreamHealthCheckerReqHeaders [] getActiveRequestHeader() {
        return this.ActiveRequestHeader;
    }

    /**
     * Set Header of the active health check request
     * @param ActiveRequestHeader Header of the active health check request
     */
    public void setActiveRequestHeader(UpstreamHealthCheckerReqHeaders [] ActiveRequestHeader) {
        this.ActiveRequestHeader = ActiveRequestHeader;
    }

    /**
     * Get The period for an abnormal to recover automatically in seconds. If only the passive health check is enabled, it must be greater than 0. Otherwise the abnormal nodes can not recovered automatically. The default value is 30 seconds.  
     * @return UnhealthyTimeout The period for an abnormal to recover automatically in seconds. If only the passive health check is enabled, it must be greater than 0. Otherwise the abnormal nodes can not recovered automatically. The default value is 30 seconds. 
     */
    public Long getUnhealthyTimeout() {
        return this.UnhealthyTimeout;
    }

    /**
     * Set The period for an abnormal to recover automatically in seconds. If only the passive health check is enabled, it must be greater than 0. Otherwise the abnormal nodes can not recovered automatically. The default value is 30 seconds. 
     * @param UnhealthyTimeout The period for an abnormal to recover automatically in seconds. If only the passive health check is enabled, it must be greater than 0. Otherwise the abnormal nodes can not recovered automatically. The default value is 30 seconds. 
     */
    public void setUnhealthyTimeout(Long UnhealthyTimeout) {
        this.UnhealthyTimeout = UnhealthyTimeout;
    }

    public UpstreamHealthChecker() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamHealthChecker(UpstreamHealthChecker source) {
        if (source.EnableActiveCheck != null) {
            this.EnableActiveCheck = new Boolean(source.EnableActiveCheck);
        }
        if (source.EnablePassiveCheck != null) {
            this.EnablePassiveCheck = new Boolean(source.EnablePassiveCheck);
        }
        if (source.HealthyHttpStatus != null) {
            this.HealthyHttpStatus = new String(source.HealthyHttpStatus);
        }
        if (source.UnhealthyHttpStatus != null) {
            this.UnhealthyHttpStatus = new String(source.UnhealthyHttpStatus);
        }
        if (source.TcpFailureThreshold != null) {
            this.TcpFailureThreshold = new Long(source.TcpFailureThreshold);
        }
        if (source.TimeoutThreshold != null) {
            this.TimeoutThreshold = new Long(source.TimeoutThreshold);
        }
        if (source.HttpFailureThreshold != null) {
            this.HttpFailureThreshold = new Long(source.HttpFailureThreshold);
        }
        if (source.ActiveCheckHttpPath != null) {
            this.ActiveCheckHttpPath = new String(source.ActiveCheckHttpPath);
        }
        if (source.ActiveCheckTimeout != null) {
            this.ActiveCheckTimeout = new Long(source.ActiveCheckTimeout);
        }
        if (source.ActiveCheckInterval != null) {
            this.ActiveCheckInterval = new Long(source.ActiveCheckInterval);
        }
        if (source.ActiveRequestHeader != null) {
            this.ActiveRequestHeader = new UpstreamHealthCheckerReqHeaders[source.ActiveRequestHeader.length];
            for (int i = 0; i < source.ActiveRequestHeader.length; i++) {
                this.ActiveRequestHeader[i] = new UpstreamHealthCheckerReqHeaders(source.ActiveRequestHeader[i]);
            }
        }
        if (source.UnhealthyTimeout != null) {
            this.UnhealthyTimeout = new Long(source.UnhealthyTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableActiveCheck", this.EnableActiveCheck);
        this.setParamSimple(map, prefix + "EnablePassiveCheck", this.EnablePassiveCheck);
        this.setParamSimple(map, prefix + "HealthyHttpStatus", this.HealthyHttpStatus);
        this.setParamSimple(map, prefix + "UnhealthyHttpStatus", this.UnhealthyHttpStatus);
        this.setParamSimple(map, prefix + "TcpFailureThreshold", this.TcpFailureThreshold);
        this.setParamSimple(map, prefix + "TimeoutThreshold", this.TimeoutThreshold);
        this.setParamSimple(map, prefix + "HttpFailureThreshold", this.HttpFailureThreshold);
        this.setParamSimple(map, prefix + "ActiveCheckHttpPath", this.ActiveCheckHttpPath);
        this.setParamSimple(map, prefix + "ActiveCheckTimeout", this.ActiveCheckTimeout);
        this.setParamSimple(map, prefix + "ActiveCheckInterval", this.ActiveCheckInterval);
        this.setParamArrayObj(map, prefix + "ActiveRequestHeader.", this.ActiveRequestHeader);
        this.setParamSimple(map, prefix + "UnhealthyTimeout", this.UnhealthyTimeout);

    }
}

