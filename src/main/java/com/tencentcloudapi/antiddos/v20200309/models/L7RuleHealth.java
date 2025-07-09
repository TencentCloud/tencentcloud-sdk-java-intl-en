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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7RuleHealth extends AbstractModel {

    /**
    * Configuration status. Values: `0` (normal), `1` (configuration in progress) and `2` (configuration failed).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Switch. Values: `1`: Enable; `0`: Disable.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * ID of the rule
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * HTTP request path. The default value is /.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Health check interval. Unit: second.
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Healthy threshold, which specifies the number of consecutive successful health checks.
    */
    @SerializedName("AliveNum")
    @Expose
    private Long AliveNum;

    /**
    * Unhealthy threshold, which specifies the number of consecutive failed health checks.
    */
    @SerializedName("KickNum")
    @Expose
    private Long KickNum;

    /**
    * HTTP request method. Values: `HEAD` and `GET`.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Status code that signifies a normal state. Values: `1` (1xx), `2` (2xx), `4` (3xx), `8` (4xx), and `16` (5xx).
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * Whether to deploy both HTTP and HTTPS health check rules
    */
    @SerializedName("ProtocolFlag")
    @Expose
    private Long ProtocolFlag;

    /**
    * Enables passive detection. Values: `1` (enable) and `0` (disable).
    */
    @SerializedName("PassiveEnable")
    @Expose
    private Long PassiveEnable;

    /**
    * Blocking period in the passive detection configuration
    */
    @SerializedName("BlockInter")
    @Expose
    private Long BlockInter;

    /**
    * Time interval between passive detections
    */
    @SerializedName("FailedCountInter")
    @Expose
    private Long FailedCountInter;

    /**
    * Unhealthy threshold in the passive detection configuration
    */
    @SerializedName("FailedThreshold")
    @Expose
    private Long FailedThreshold;

    /**
    * Status code that signals that the passive detection considers the status normal. Values: `1` (1xx), `2` (2xx), `4` (3xx), `8` (4xx), and `16` (5xx).
    */
    @SerializedName("PassiveStatusCode")
    @Expose
    private Long PassiveStatusCode;

    /**
    * Configuration status of the passive health check. Values: `0` (Normal), `1` (configuration in progress) and `2` (configuration failed).
    */
    @SerializedName("PassiveStatus")
    @Expose
    private Long PassiveStatus;

    /**
     * Get Configuration status. Values: `0` (normal), `1` (configuration in progress) and `2` (configuration failed). 
     * @return Status Configuration status. Values: `0` (normal), `1` (configuration in progress) and `2` (configuration failed).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Configuration status. Values: `0` (normal), `1` (configuration in progress) and `2` (configuration failed).
     * @param Status Configuration status. Values: `0` (normal), `1` (configuration in progress) and `2` (configuration failed).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Switch. Values: `1`: Enable; `0`: Disable. 
     * @return Enable Switch. Values: `1`: Enable; `0`: Disable.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Switch. Values: `1`: Enable; `0`: Disable.
     * @param Enable Switch. Values: `1`: Enable; `0`: Disable.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get ID of the rule 
     * @return RuleId ID of the rule
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set ID of the rule
     * @param RuleId ID of the rule
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get HTTP request path. The default value is /. 
     * @return Url HTTP request path. The default value is /.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set HTTP request path. The default value is /.
     * @param Url HTTP request path. The default value is /.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Health check interval. Unit: second. 
     * @return Interval Health check interval. Unit: second.
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Health check interval. Unit: second.
     * @param Interval Health check interval. Unit: second.
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Healthy threshold, which specifies the number of consecutive successful health checks. 
     * @return AliveNum Healthy threshold, which specifies the number of consecutive successful health checks.
     */
    public Long getAliveNum() {
        return this.AliveNum;
    }

    /**
     * Set Healthy threshold, which specifies the number of consecutive successful health checks.
     * @param AliveNum Healthy threshold, which specifies the number of consecutive successful health checks.
     */
    public void setAliveNum(Long AliveNum) {
        this.AliveNum = AliveNum;
    }

    /**
     * Get Unhealthy threshold, which specifies the number of consecutive failed health checks. 
     * @return KickNum Unhealthy threshold, which specifies the number of consecutive failed health checks.
     */
    public Long getKickNum() {
        return this.KickNum;
    }

    /**
     * Set Unhealthy threshold, which specifies the number of consecutive failed health checks.
     * @param KickNum Unhealthy threshold, which specifies the number of consecutive failed health checks.
     */
    public void setKickNum(Long KickNum) {
        this.KickNum = KickNum;
    }

    /**
     * Get HTTP request method. Values: `HEAD` and `GET`. 
     * @return Method HTTP request method. Values: `HEAD` and `GET`.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set HTTP request method. Values: `HEAD` and `GET`.
     * @param Method HTTP request method. Values: `HEAD` and `GET`.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Status code that signifies a normal state. Values: `1` (1xx), `2` (2xx), `4` (3xx), `8` (4xx), and `16` (5xx). 
     * @return StatusCode Status code that signifies a normal state. Values: `1` (1xx), `2` (2xx), `4` (3xx), `8` (4xx), and `16` (5xx).
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set Status code that signifies a normal state. Values: `1` (1xx), `2` (2xx), `4` (3xx), `8` (4xx), and `16` (5xx).
     * @param StatusCode Status code that signifies a normal state. Values: `1` (1xx), `2` (2xx), `4` (3xx), `8` (4xx), and `16` (5xx).
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get Whether to deploy both HTTP and HTTPS health check rules 
     * @return ProtocolFlag Whether to deploy both HTTP and HTTPS health check rules
     */
    public Long getProtocolFlag() {
        return this.ProtocolFlag;
    }

    /**
     * Set Whether to deploy both HTTP and HTTPS health check rules
     * @param ProtocolFlag Whether to deploy both HTTP and HTTPS health check rules
     */
    public void setProtocolFlag(Long ProtocolFlag) {
        this.ProtocolFlag = ProtocolFlag;
    }

    /**
     * Get Enables passive detection. Values: `1` (enable) and `0` (disable). 
     * @return PassiveEnable Enables passive detection. Values: `1` (enable) and `0` (disable).
     */
    public Long getPassiveEnable() {
        return this.PassiveEnable;
    }

    /**
     * Set Enables passive detection. Values: `1` (enable) and `0` (disable).
     * @param PassiveEnable Enables passive detection. Values: `1` (enable) and `0` (disable).
     */
    public void setPassiveEnable(Long PassiveEnable) {
        this.PassiveEnable = PassiveEnable;
    }

    /**
     * Get Blocking period in the passive detection configuration 
     * @return BlockInter Blocking period in the passive detection configuration
     */
    public Long getBlockInter() {
        return this.BlockInter;
    }

    /**
     * Set Blocking period in the passive detection configuration
     * @param BlockInter Blocking period in the passive detection configuration
     */
    public void setBlockInter(Long BlockInter) {
        this.BlockInter = BlockInter;
    }

    /**
     * Get Time interval between passive detections 
     * @return FailedCountInter Time interval between passive detections
     */
    public Long getFailedCountInter() {
        return this.FailedCountInter;
    }

    /**
     * Set Time interval between passive detections
     * @param FailedCountInter Time interval between passive detections
     */
    public void setFailedCountInter(Long FailedCountInter) {
        this.FailedCountInter = FailedCountInter;
    }

    /**
     * Get Unhealthy threshold in the passive detection configuration 
     * @return FailedThreshold Unhealthy threshold in the passive detection configuration
     */
    public Long getFailedThreshold() {
        return this.FailedThreshold;
    }

    /**
     * Set Unhealthy threshold in the passive detection configuration
     * @param FailedThreshold Unhealthy threshold in the passive detection configuration
     */
    public void setFailedThreshold(Long FailedThreshold) {
        this.FailedThreshold = FailedThreshold;
    }

    /**
     * Get Status code that signals that the passive detection considers the status normal. Values: `1` (1xx), `2` (2xx), `4` (3xx), `8` (4xx), and `16` (5xx). 
     * @return PassiveStatusCode Status code that signals that the passive detection considers the status normal. Values: `1` (1xx), `2` (2xx), `4` (3xx), `8` (4xx), and `16` (5xx).
     */
    public Long getPassiveStatusCode() {
        return this.PassiveStatusCode;
    }

    /**
     * Set Status code that signals that the passive detection considers the status normal. Values: `1` (1xx), `2` (2xx), `4` (3xx), `8` (4xx), and `16` (5xx).
     * @param PassiveStatusCode Status code that signals that the passive detection considers the status normal. Values: `1` (1xx), `2` (2xx), `4` (3xx), `8` (4xx), and `16` (5xx).
     */
    public void setPassiveStatusCode(Long PassiveStatusCode) {
        this.PassiveStatusCode = PassiveStatusCode;
    }

    /**
     * Get Configuration status of the passive health check. Values: `0` (Normal), `1` (configuration in progress) and `2` (configuration failed). 
     * @return PassiveStatus Configuration status of the passive health check. Values: `0` (Normal), `1` (configuration in progress) and `2` (configuration failed).
     */
    public Long getPassiveStatus() {
        return this.PassiveStatus;
    }

    /**
     * Set Configuration status of the passive health check. Values: `0` (Normal), `1` (configuration in progress) and `2` (configuration failed).
     * @param PassiveStatus Configuration status of the passive health check. Values: `0` (Normal), `1` (configuration in progress) and `2` (configuration failed).
     */
    public void setPassiveStatus(Long PassiveStatus) {
        this.PassiveStatus = PassiveStatus;
    }

    public L7RuleHealth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L7RuleHealth(L7RuleHealth source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.AliveNum != null) {
            this.AliveNum = new Long(source.AliveNum);
        }
        if (source.KickNum != null) {
            this.KickNum = new Long(source.KickNum);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.ProtocolFlag != null) {
            this.ProtocolFlag = new Long(source.ProtocolFlag);
        }
        if (source.PassiveEnable != null) {
            this.PassiveEnable = new Long(source.PassiveEnable);
        }
        if (source.BlockInter != null) {
            this.BlockInter = new Long(source.BlockInter);
        }
        if (source.FailedCountInter != null) {
            this.FailedCountInter = new Long(source.FailedCountInter);
        }
        if (source.FailedThreshold != null) {
            this.FailedThreshold = new Long(source.FailedThreshold);
        }
        if (source.PassiveStatusCode != null) {
            this.PassiveStatusCode = new Long(source.PassiveStatusCode);
        }
        if (source.PassiveStatus != null) {
            this.PassiveStatus = new Long(source.PassiveStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "AliveNum", this.AliveNum);
        this.setParamSimple(map, prefix + "KickNum", this.KickNum);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "ProtocolFlag", this.ProtocolFlag);
        this.setParamSimple(map, prefix + "PassiveEnable", this.PassiveEnable);
        this.setParamSimple(map, prefix + "BlockInter", this.BlockInter);
        this.setParamSimple(map, prefix + "FailedCountInter", this.FailedCountInter);
        this.setParamSimple(map, prefix + "FailedThreshold", this.FailedThreshold);
        this.setParamSimple(map, prefix + "PassiveStatusCode", this.PassiveStatusCode);
        this.setParamSimple(map, prefix + "PassiveStatus", this.PassiveStatus);

    }
}

