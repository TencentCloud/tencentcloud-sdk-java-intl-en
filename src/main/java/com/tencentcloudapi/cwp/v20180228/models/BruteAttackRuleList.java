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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BruteAttackRuleList extends AbstractModel {

    /**
    * Timeframe of the brute force cracking event (unit: second)
    */
    @SerializedName("TimeRange")
    @Expose
    private Long TimeRange;

    /**
    * Number of failed attempts during the brute force cracking event
    */
    @SerializedName("LoginFailTimes")
    @Expose
    private Long LoginFailTimes;

    /**
    * Whether the rule is empty. If yes, fill in the default rule.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Occurrence time range of brute force cracking events, in seconds (default rule)
    */
    @SerializedName("TimeRangeDefault")
    @Expose
    private Long TimeRangeDefault;

    /**
    * Number of failed brute force cracking events (default rule)
    */
    @SerializedName("LoginFailTimesDefault")
    @Expose
    private Long LoginFailTimesDefault;

    /**
     * Get Timeframe of the brute force cracking event (unit: second) 
     * @return TimeRange Timeframe of the brute force cracking event (unit: second)
     */
    public Long getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set Timeframe of the brute force cracking event (unit: second)
     * @param TimeRange Timeframe of the brute force cracking event (unit: second)
     */
    public void setTimeRange(Long TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get Number of failed attempts during the brute force cracking event 
     * @return LoginFailTimes Number of failed attempts during the brute force cracking event
     */
    public Long getLoginFailTimes() {
        return this.LoginFailTimes;
    }

    /**
     * Set Number of failed attempts during the brute force cracking event
     * @param LoginFailTimes Number of failed attempts during the brute force cracking event
     */
    public void setLoginFailTimes(Long LoginFailTimes) {
        this.LoginFailTimes = LoginFailTimes;
    }

    /**
     * Get Whether the rule is empty. If yes, fill in the default rule. 
     * @return Enable Whether the rule is empty. If yes, fill in the default rule.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether the rule is empty. If yes, fill in the default rule.
     * @param Enable Whether the rule is empty. If yes, fill in the default rule.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Occurrence time range of brute force cracking events, in seconds (default rule) 
     * @return TimeRangeDefault Occurrence time range of brute force cracking events, in seconds (default rule)
     */
    public Long getTimeRangeDefault() {
        return this.TimeRangeDefault;
    }

    /**
     * Set Occurrence time range of brute force cracking events, in seconds (default rule)
     * @param TimeRangeDefault Occurrence time range of brute force cracking events, in seconds (default rule)
     */
    public void setTimeRangeDefault(Long TimeRangeDefault) {
        this.TimeRangeDefault = TimeRangeDefault;
    }

    /**
     * Get Number of failed brute force cracking events (default rule) 
     * @return LoginFailTimesDefault Number of failed brute force cracking events (default rule)
     */
    public Long getLoginFailTimesDefault() {
        return this.LoginFailTimesDefault;
    }

    /**
     * Set Number of failed brute force cracking events (default rule)
     * @param LoginFailTimesDefault Number of failed brute force cracking events (default rule)
     */
    public void setLoginFailTimesDefault(Long LoginFailTimesDefault) {
        this.LoginFailTimesDefault = LoginFailTimesDefault;
    }

    public BruteAttackRuleList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BruteAttackRuleList(BruteAttackRuleList source) {
        if (source.TimeRange != null) {
            this.TimeRange = new Long(source.TimeRange);
        }
        if (source.LoginFailTimes != null) {
            this.LoginFailTimes = new Long(source.LoginFailTimes);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.TimeRangeDefault != null) {
            this.TimeRangeDefault = new Long(source.TimeRangeDefault);
        }
        if (source.LoginFailTimesDefault != null) {
            this.LoginFailTimesDefault = new Long(source.LoginFailTimesDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);
        this.setParamSimple(map, prefix + "LoginFailTimes", this.LoginFailTimes);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "TimeRangeDefault", this.TimeRangeDefault);
        this.setParamSimple(map, prefix + "LoginFailTimesDefault", this.LoginFailTimesDefault);

    }
}

