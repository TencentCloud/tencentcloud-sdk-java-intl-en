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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BruteAttackRuleList extends AbstractModel {

    /**
    * <p>Time range of the brute force cracking event (unit: second)</p>
    */
    @SerializedName("TimeRange")
    @Expose
    private Long TimeRange;

    /**
    * <p>Number of failed blasting incidents</p>
    */
    @SerializedName("LoginFailTimes")
    @Expose
    private Long LoginFailTimes;

    /**
    * <p>Whether the rule is empty. If yes, fill in the default rule.</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>Occurrence time range of brute force cracking events, in seconds (default rule)</p>
    */
    @SerializedName("TimeRangeDefault")
    @Expose
    private Long TimeRangeDefault;

    /**
    * <p>Number of failed blasting incidents (default rule)</p>
    */
    @SerializedName("LoginFailTimesDefault")
    @Expose
    private Long LoginFailTimesDefault;

    /**
     * Get <p>Time range of the brute force cracking event (unit: second)</p> 
     * @return TimeRange <p>Time range of the brute force cracking event (unit: second)</p>
     */
    public Long getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set <p>Time range of the brute force cracking event (unit: second)</p>
     * @param TimeRange <p>Time range of the brute force cracking event (unit: second)</p>
     */
    public void setTimeRange(Long TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get <p>Number of failed blasting incidents</p> 
     * @return LoginFailTimes <p>Number of failed blasting incidents</p>
     */
    public Long getLoginFailTimes() {
        return this.LoginFailTimes;
    }

    /**
     * Set <p>Number of failed blasting incidents</p>
     * @param LoginFailTimes <p>Number of failed blasting incidents</p>
     */
    public void setLoginFailTimes(Long LoginFailTimes) {
        this.LoginFailTimes = LoginFailTimes;
    }

    /**
     * Get <p>Whether the rule is empty. If yes, fill in the default rule.</p> 
     * @return Enable <p>Whether the rule is empty. If yes, fill in the default rule.</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Whether the rule is empty. If yes, fill in the default rule.</p>
     * @param Enable <p>Whether the rule is empty. If yes, fill in the default rule.</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Occurrence time range of brute force cracking events, in seconds (default rule)</p> 
     * @return TimeRangeDefault <p>Occurrence time range of brute force cracking events, in seconds (default rule)</p>
     */
    public Long getTimeRangeDefault() {
        return this.TimeRangeDefault;
    }

    /**
     * Set <p>Occurrence time range of brute force cracking events, in seconds (default rule)</p>
     * @param TimeRangeDefault <p>Occurrence time range of brute force cracking events, in seconds (default rule)</p>
     */
    public void setTimeRangeDefault(Long TimeRangeDefault) {
        this.TimeRangeDefault = TimeRangeDefault;
    }

    /**
     * Get <p>Number of failed blasting incidents (default rule)</p> 
     * @return LoginFailTimesDefault <p>Number of failed blasting incidents (default rule)</p>
     */
    public Long getLoginFailTimesDefault() {
        return this.LoginFailTimesDefault;
    }

    /**
     * Set <p>Number of failed blasting incidents (default rule)</p>
     * @param LoginFailTimesDefault <p>Number of failed blasting incidents (default rule)</p>
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

