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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7RuleHealth extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 1: enabled, 0: disabled
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Detection interval in seconds
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Unhealthy threshold in times.
    */
    @SerializedName("KickNum")
    @Expose
    private Long KickNum;

    /**
    * Healthy threshold in times.
    */
    @SerializedName("AliveNum")
    @Expose
    private Long AliveNum;

    /**
    * HTTP request method. Valid values: [HEAD, GET]
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Healthy status code during health check. xx = 1, 2xx = 2, 3xx = 4, 4xx = 8, 5xx = 16. Multiple status code values are added up
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * URL of checked directory. Default value: /
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Configuration status. 0: normal, 1: configuring, 2: configuration failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 1: enabled, 0: disabled 
     * @return Enable 1: enabled, 0: disabled
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 1: enabled, 0: disabled
     * @param Enable 1: enabled, 0: disabled
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Detection interval in seconds 
     * @return Interval Detection interval in seconds
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Detection interval in seconds
     * @param Interval Detection interval in seconds
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Unhealthy threshold in times. 
     * @return KickNum Unhealthy threshold in times.
     */
    public Long getKickNum() {
        return this.KickNum;
    }

    /**
     * Set Unhealthy threshold in times.
     * @param KickNum Unhealthy threshold in times.
     */
    public void setKickNum(Long KickNum) {
        this.KickNum = KickNum;
    }

    /**
     * Get Healthy threshold in times. 
     * @return AliveNum Healthy threshold in times.
     */
    public Long getAliveNum() {
        return this.AliveNum;
    }

    /**
     * Set Healthy threshold in times.
     * @param AliveNum Healthy threshold in times.
     */
    public void setAliveNum(Long AliveNum) {
        this.AliveNum = AliveNum;
    }

    /**
     * Get HTTP request method. Valid values: [HEAD, GET] 
     * @return Method HTTP request method. Valid values: [HEAD, GET]
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set HTTP request method. Valid values: [HEAD, GET]
     * @param Method HTTP request method. Valid values: [HEAD, GET]
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Healthy status code during health check. xx = 1, 2xx = 2, 3xx = 4, 4xx = 8, 5xx = 16. Multiple status code values are added up 
     * @return StatusCode Healthy status code during health check. xx = 1, 2xx = 2, 3xx = 4, 4xx = 8, 5xx = 16. Multiple status code values are added up
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set Healthy status code during health check. xx = 1, 2xx = 2, 3xx = 4, 4xx = 8, 5xx = 16. Multiple status code values are added up
     * @param StatusCode Healthy status code during health check. xx = 1, 2xx = 2, 3xx = 4, 4xx = 8, 5xx = 16. Multiple status code values are added up
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get URL of checked directory. Default value: / 
     * @return Url URL of checked directory. Default value: /
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL of checked directory. Default value: /
     * @param Url URL of checked directory. Default value: /
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Configuration status. 0: normal, 1: configuring, 2: configuration failed 
     * @return Status Configuration status. 0: normal, 1: configuring, 2: configuration failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Configuration status. 0: normal, 1: configuring, 2: configuration failed
     * @param Status Configuration status. 0: normal, 1: configuring, 2: configuration failed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public L7RuleHealth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L7RuleHealth(L7RuleHealth source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.KickNum != null) {
            this.KickNum = new Long(source.KickNum);
        }
        if (source.AliveNum != null) {
            this.AliveNum = new Long(source.AliveNum);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "KickNum", this.KickNum);
        this.setParamSimple(map, prefix + "AliveNum", this.AliveNum);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

