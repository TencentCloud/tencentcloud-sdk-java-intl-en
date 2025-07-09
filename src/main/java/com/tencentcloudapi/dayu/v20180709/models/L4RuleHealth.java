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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L4RuleHealth extends AbstractModel {

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
    * Response timeout period in seconds
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * Detection interval in seconds, which must be greater than the response timeout period
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Unhealthy threshold in times
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
     * Get Response timeout period in seconds 
     * @return TimeOut Response timeout period in seconds
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set Response timeout period in seconds
     * @param TimeOut Response timeout period in seconds
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get Detection interval in seconds, which must be greater than the response timeout period 
     * @return Interval Detection interval in seconds, which must be greater than the response timeout period
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Detection interval in seconds, which must be greater than the response timeout period
     * @param Interval Detection interval in seconds, which must be greater than the response timeout period
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Unhealthy threshold in times 
     * @return KickNum Unhealthy threshold in times
     */
    public Long getKickNum() {
        return this.KickNum;
    }

    /**
     * Set Unhealthy threshold in times
     * @param KickNum Unhealthy threshold in times
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

    public L4RuleHealth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4RuleHealth(L4RuleHealth source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.TimeOut != null) {
            this.TimeOut = new Long(source.TimeOut);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "KickNum", this.KickNum);
        this.setParamSimple(map, prefix + "AliveNum", this.AliveNum);

    }
}

