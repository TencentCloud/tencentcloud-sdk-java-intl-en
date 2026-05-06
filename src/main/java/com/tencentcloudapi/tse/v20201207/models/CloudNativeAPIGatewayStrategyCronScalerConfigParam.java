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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayStrategyCronScalerConfigParam extends AbstractModel {

    /**
    * Scheduled scaling period
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * Start time of scheduled scaling
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * Scheduled scaling target node count, no more than the maximum node count defined in metric scaling
    */
    @SerializedName("TargetReplicas")
    @Expose
    private Long TargetReplicas;

    /**
    * Scheduled scaling cron expression, no need to input
    */
    @SerializedName("Crontab")
    @Expose
    private String Crontab;

    /**
     * Get Scheduled scaling period 
     * @return Period Scheduled scaling period
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set Scheduled scaling period
     * @param Period Scheduled scaling period
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get Start time of scheduled scaling 
     * @return StartAt Start time of scheduled scaling
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set Start time of scheduled scaling
     * @param StartAt Start time of scheduled scaling
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get Scheduled scaling target node count, no more than the maximum node count defined in metric scaling 
     * @return TargetReplicas Scheduled scaling target node count, no more than the maximum node count defined in metric scaling
     */
    public Long getTargetReplicas() {
        return this.TargetReplicas;
    }

    /**
     * Set Scheduled scaling target node count, no more than the maximum node count defined in metric scaling
     * @param TargetReplicas Scheduled scaling target node count, no more than the maximum node count defined in metric scaling
     */
    public void setTargetReplicas(Long TargetReplicas) {
        this.TargetReplicas = TargetReplicas;
    }

    /**
     * Get Scheduled scaling cron expression, no need to input 
     * @return Crontab Scheduled scaling cron expression, no need to input
     */
    public String getCrontab() {
        return this.Crontab;
    }

    /**
     * Set Scheduled scaling cron expression, no need to input
     * @param Crontab Scheduled scaling cron expression, no need to input
     */
    public void setCrontab(String Crontab) {
        this.Crontab = Crontab;
    }

    public CloudNativeAPIGatewayStrategyCronScalerConfigParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayStrategyCronScalerConfigParam(CloudNativeAPIGatewayStrategyCronScalerConfigParam source) {
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.TargetReplicas != null) {
            this.TargetReplicas = new Long(source.TargetReplicas);
        }
        if (source.Crontab != null) {
            this.Crontab = new String(source.Crontab);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "TargetReplicas", this.TargetReplicas);
        this.setParamSimple(map, prefix + "Crontab", this.Crontab);

    }
}

