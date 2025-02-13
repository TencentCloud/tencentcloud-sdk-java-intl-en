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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallInNumberMetrics extends AbstractModel {

    /**
    * Line number.
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * Line-Related metrics.
    */
    @SerializedName("Metrics")
    @Expose
    private CallInMetrics Metrics;

    /**
    * Bound skill group metrics.
    */
    @SerializedName("SkillGroupMetrics")
    @Expose
    private CallInSkillGroupMetrics [] SkillGroupMetrics;

    /**
     * Get Line number. 
     * @return Number Line number.
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set Line number.
     * @param Number Line number.
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get Line-Related metrics. 
     * @return Metrics Line-Related metrics.
     */
    public CallInMetrics getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Line-Related metrics.
     * @param Metrics Line-Related metrics.
     */
    public void setMetrics(CallInMetrics Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get Bound skill group metrics. 
     * @return SkillGroupMetrics Bound skill group metrics.
     */
    public CallInSkillGroupMetrics [] getSkillGroupMetrics() {
        return this.SkillGroupMetrics;
    }

    /**
     * Set Bound skill group metrics.
     * @param SkillGroupMetrics Bound skill group metrics.
     */
    public void setSkillGroupMetrics(CallInSkillGroupMetrics [] SkillGroupMetrics) {
        this.SkillGroupMetrics = SkillGroupMetrics;
    }

    public CallInNumberMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallInNumberMetrics(CallInNumberMetrics source) {
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Metrics != null) {
            this.Metrics = new CallInMetrics(source.Metrics);
        }
        if (source.SkillGroupMetrics != null) {
            this.SkillGroupMetrics = new CallInSkillGroupMetrics[source.SkillGroupMetrics.length];
            for (int i = 0; i < source.SkillGroupMetrics.length; i++) {
                this.SkillGroupMetrics[i] = new CallInSkillGroupMetrics(source.SkillGroupMetrics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamArrayObj(map, prefix + "SkillGroupMetrics.", this.SkillGroupMetrics);

    }
}

