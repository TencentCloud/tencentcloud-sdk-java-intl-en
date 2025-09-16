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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CronScaleJob extends AbstractModel {

    /**
    * Cron expression, which identifies the task execution time, and is accurate to minutes.
    */
    @SerializedName("Schedule")
    @Expose
    private String Schedule;

    /**
    * Scheduled task name.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Number of target instances.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetReplicas")
    @Expose
    private Long TargetReplicas;

    /**
    * Minimum target.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * Maximum target.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * Exception periods, defined by Cron expressions, during which tasks are not executed. Up to 3 Cron expressions are supported.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExcludeDates")
    @Expose
    private String [] ExcludeDates;

    /**
     * Get Cron expression, which identifies the task execution time, and is accurate to minutes. 
     * @return Schedule Cron expression, which identifies the task execution time, and is accurate to minutes.
     */
    public String getSchedule() {
        return this.Schedule;
    }

    /**
     * Set Cron expression, which identifies the task execution time, and is accurate to minutes.
     * @param Schedule Cron expression, which identifies the task execution time, and is accurate to minutes.
     */
    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get Scheduled task name.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Scheduled task name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Scheduled task name.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Scheduled task name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Number of target instances.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetReplicas Number of target instances.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTargetReplicas() {
        return this.TargetReplicas;
    }

    /**
     * Set Number of target instances.Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetReplicas Number of target instances.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetReplicas(Long TargetReplicas) {
        this.TargetReplicas = TargetReplicas;
    }

    /**
     * Get Minimum target.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinReplicas Minimum target.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set Minimum target.Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinReplicas Minimum target.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get Maximum target.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxReplicas Maximum target.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set Maximum target.Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxReplicas Maximum target.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get Exception periods, defined by Cron expressions, during which tasks are not executed. Up to 3 Cron expressions are supported.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExcludeDates Exception periods, defined by Cron expressions, during which tasks are not executed. Up to 3 Cron expressions are supported.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getExcludeDates() {
        return this.ExcludeDates;
    }

    /**
     * Set Exception periods, defined by Cron expressions, during which tasks are not executed. Up to 3 Cron expressions are supported.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExcludeDates Exception periods, defined by Cron expressions, during which tasks are not executed. Up to 3 Cron expressions are supported.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExcludeDates(String [] ExcludeDates) {
        this.ExcludeDates = ExcludeDates;
    }

    public CronScaleJob() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CronScaleJob(CronScaleJob source) {
        if (source.Schedule != null) {
            this.Schedule = new String(source.Schedule);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TargetReplicas != null) {
            this.TargetReplicas = new Long(source.TargetReplicas);
        }
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.ExcludeDates != null) {
            this.ExcludeDates = new String[source.ExcludeDates.length];
            for (int i = 0; i < source.ExcludeDates.length; i++) {
                this.ExcludeDates[i] = new String(source.ExcludeDates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Schedule", this.Schedule);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TargetReplicas", this.TargetReplicas);
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamArraySimple(map, prefix + "ExcludeDates.", this.ExcludeDates);

    }
}

