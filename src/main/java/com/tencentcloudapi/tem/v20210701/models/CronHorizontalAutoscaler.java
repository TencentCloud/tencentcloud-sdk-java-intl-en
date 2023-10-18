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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CronHorizontalAutoscaler extends AbstractModel {

    /**
    * Name of a scheduled scaling policy
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Policy period
"* * *" indicates three ranges. The first is day, the second month, and the third week. The three parts are separated by spaces.
Examples:
* * * (every day)
* * 0-3 (every Sunday through Wednesday)
1,11,21 * * (1st, 11th, and 21st of every month)
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * Details of a scheduled scaling policy
    */
    @SerializedName("Schedules")
    @Expose
    private CronHorizontalAutoscalerSchedule [] Schedules;

    /**
    * Enabled or not
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Policy priority. The higher the value, the higher the priority. The minimum value is 0.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get Name of a scheduled scaling policy 
     * @return Name Name of a scheduled scaling policy
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a scheduled scaling policy
     * @param Name Name of a scheduled scaling policy
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Policy period
"* * *" indicates three ranges. The first is day, the second month, and the third week. The three parts are separated by spaces.
Examples:
* * * (every day)
* * 0-3 (every Sunday through Wednesday)
1,11,21 * * (1st, 11th, and 21st of every month) 
     * @return Period Policy period
"* * *" indicates three ranges. The first is day, the second month, and the third week. The three parts are separated by spaces.
Examples:
* * * (every day)
* * 0-3 (every Sunday through Wednesday)
1,11,21 * * (1st, 11th, and 21st of every month)
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set Policy period
"* * *" indicates three ranges. The first is day, the second month, and the third week. The three parts are separated by spaces.
Examples:
* * * (every day)
* * 0-3 (every Sunday through Wednesday)
1,11,21 * * (1st, 11th, and 21st of every month)
     * @param Period Policy period
"* * *" indicates three ranges. The first is day, the second month, and the third week. The three parts are separated by spaces.
Examples:
* * * (every day)
* * 0-3 (every Sunday through Wednesday)
1,11,21 * * (1st, 11th, and 21st of every month)
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get Details of a scheduled scaling policy 
     * @return Schedules Details of a scheduled scaling policy
     */
    public CronHorizontalAutoscalerSchedule [] getSchedules() {
        return this.Schedules;
    }

    /**
     * Set Details of a scheduled scaling policy
     * @param Schedules Details of a scheduled scaling policy
     */
    public void setSchedules(CronHorizontalAutoscalerSchedule [] Schedules) {
        this.Schedules = Schedules;
    }

    /**
     * Get Enabled or not 
     * @return Enabled Enabled or not
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Enabled or not
     * @param Enabled Enabled or not
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Policy priority. The higher the value, the higher the priority. The minimum value is 0. 
     * @return Priority Policy priority. The higher the value, the higher the priority. The minimum value is 0.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Policy priority. The higher the value, the higher the priority. The minimum value is 0.
     * @param Priority Policy priority. The higher the value, the higher the priority. The minimum value is 0.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public CronHorizontalAutoscaler() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CronHorizontalAutoscaler(CronHorizontalAutoscaler source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.Schedules != null) {
            this.Schedules = new CronHorizontalAutoscalerSchedule[source.Schedules.length];
            for (int i = 0; i < source.Schedules.length; i++) {
                this.Schedules[i] = new CronHorizontalAutoscalerSchedule(source.Schedules[i]);
            }
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArrayObj(map, prefix + "Schedules.", this.Schedules);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

