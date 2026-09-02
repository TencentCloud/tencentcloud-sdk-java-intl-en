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

public class DspmSensitiveScanTaskConfig extends AbstractModel {

    /**
    * Whether it is a scheduled task
    */
    @SerializedName("IsScheduled")
    @Expose
    private Boolean IsScheduled;

    /**
    * Scheduling cycle configuration
    */
    @SerializedName("ScheduleConfig")
    @Expose
    private DspmScheduleConfig ScheduleConfig;

    /**
    * Whether to scan now
    */
    @SerializedName("IsRunAtOnce")
    @Expose
    private Boolean IsRunAtOnce;

    /**
     * Get Whether it is a scheduled task 
     * @return IsScheduled Whether it is a scheduled task
     */
    public Boolean getIsScheduled() {
        return this.IsScheduled;
    }

    /**
     * Set Whether it is a scheduled task
     * @param IsScheduled Whether it is a scheduled task
     */
    public void setIsScheduled(Boolean IsScheduled) {
        this.IsScheduled = IsScheduled;
    }

    /**
     * Get Scheduling cycle configuration 
     * @return ScheduleConfig Scheduling cycle configuration
     */
    public DspmScheduleConfig getScheduleConfig() {
        return this.ScheduleConfig;
    }

    /**
     * Set Scheduling cycle configuration
     * @param ScheduleConfig Scheduling cycle configuration
     */
    public void setScheduleConfig(DspmScheduleConfig ScheduleConfig) {
        this.ScheduleConfig = ScheduleConfig;
    }

    /**
     * Get Whether to scan now 
     * @return IsRunAtOnce Whether to scan now
     */
    public Boolean getIsRunAtOnce() {
        return this.IsRunAtOnce;
    }

    /**
     * Set Whether to scan now
     * @param IsRunAtOnce Whether to scan now
     */
    public void setIsRunAtOnce(Boolean IsRunAtOnce) {
        this.IsRunAtOnce = IsRunAtOnce;
    }

    public DspmSensitiveScanTaskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmSensitiveScanTaskConfig(DspmSensitiveScanTaskConfig source) {
        if (source.IsScheduled != null) {
            this.IsScheduled = new Boolean(source.IsScheduled);
        }
        if (source.ScheduleConfig != null) {
            this.ScheduleConfig = new DspmScheduleConfig(source.ScheduleConfig);
        }
        if (source.IsRunAtOnce != null) {
            this.IsRunAtOnce = new Boolean(source.IsRunAtOnce);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsScheduled", this.IsScheduled);
        this.setParamObj(map, prefix + "ScheduleConfig.", this.ScheduleConfig);
        this.setParamSimple(map, prefix + "IsRunAtOnce", this.IsRunAtOnce);

    }
}

