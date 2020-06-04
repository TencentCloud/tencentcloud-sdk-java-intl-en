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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCRuleConfig extends AbstractModel{

    /**
    * Reference period in seconds. Valid values: [10, 30, 60]
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Number of access requests. Value range: [1–10000]
    */
    @SerializedName("ReqNumber")
    @Expose
    private Long ReqNumber;

    /**
    * Action take. Valid values: ["alg" (CAPTCHA), "drop" (blocking)]
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Execution duration in seconds. Valid range: [1-900]
    */
    @SerializedName("ExeDuration")
    @Expose
    private Long ExeDuration;

    /**
     * Get Reference period in seconds. Valid values: [10, 30, 60] 
     * @return Period Reference period in seconds. Valid values: [10, 30, 60]
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Reference period in seconds. Valid values: [10, 30, 60]
     * @param Period Reference period in seconds. Valid values: [10, 30, 60]
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Number of access requests. Value range: [1–10000] 
     * @return ReqNumber Number of access requests. Value range: [1–10000]
     */
    public Long getReqNumber() {
        return this.ReqNumber;
    }

    /**
     * Set Number of access requests. Value range: [1–10000]
     * @param ReqNumber Number of access requests. Value range: [1–10000]
     */
    public void setReqNumber(Long ReqNumber) {
        this.ReqNumber = ReqNumber;
    }

    /**
     * Get Action take. Valid values: ["alg" (CAPTCHA), "drop" (blocking)] 
     * @return Action Action take. Valid values: ["alg" (CAPTCHA), "drop" (blocking)]
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action take. Valid values: ["alg" (CAPTCHA), "drop" (blocking)]
     * @param Action Action take. Valid values: ["alg" (CAPTCHA), "drop" (blocking)]
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Execution duration in seconds. Valid range: [1-900] 
     * @return ExeDuration Execution duration in seconds. Valid range: [1-900]
     */
    public Long getExeDuration() {
        return this.ExeDuration;
    }

    /**
     * Set Execution duration in seconds. Valid range: [1-900]
     * @param ExeDuration Execution duration in seconds. Valid range: [1-900]
     */
    public void setExeDuration(Long ExeDuration) {
        this.ExeDuration = ExeDuration;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ReqNumber", this.ReqNumber);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ExeDuration", this.ExeDuration);

    }
}

