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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorTime extends AbstractModel {

    /**
    * <p>Execution cycle. Value range: <code>Period</code>, <code>Fixed</code>, <code>Cron</code>.</p><ul><li>Period: at a fixed frequency</li><li>Fixed: fixed time</li><li>Cron: cron expression</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Execution period or custom execution time point. Unit: minutes, value range: 1-1440.<br>When type is <code>Period</code> or <code>Fixed</code>, the time field takes effect.</p>
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * <p>The cron expression for the execution period. Example: <code>0/1 * * * *</code>. From left to right, each field represents Minutes field, Hours field, Day of month field, Month field, Day of week field. No support for second level. When the type is <code>Cron</code>, the CronExpression field takes effect.</p>
    */
    @SerializedName("CronExpression")
    @Expose
    private String CronExpression;

    /**
     * Get <p>Execution cycle. Value range: <code>Period</code>, <code>Fixed</code>, <code>Cron</code>.</p><ul><li>Period: at a fixed frequency</li><li>Fixed: fixed time</li><li>Cron: cron expression</li></ul> 
     * @return Type <p>Execution cycle. Value range: <code>Period</code>, <code>Fixed</code>, <code>Cron</code>.</p><ul><li>Period: at a fixed frequency</li><li>Fixed: fixed time</li><li>Cron: cron expression</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Execution cycle. Value range: <code>Period</code>, <code>Fixed</code>, <code>Cron</code>.</p><ul><li>Period: at a fixed frequency</li><li>Fixed: fixed time</li><li>Cron: cron expression</li></ul>
     * @param Type <p>Execution cycle. Value range: <code>Period</code>, <code>Fixed</code>, <code>Cron</code>.</p><ul><li>Period: at a fixed frequency</li><li>Fixed: fixed time</li><li>Cron: cron expression</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Execution period or custom execution time point. Unit: minutes, value range: 1-1440.<br>When type is <code>Period</code> or <code>Fixed</code>, the time field takes effect.</p> 
     * @return Time <p>Execution period or custom execution time point. Unit: minutes, value range: 1-1440.<br>When type is <code>Period</code> or <code>Fixed</code>, the time field takes effect.</p>
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set <p>Execution period or custom execution time point. Unit: minutes, value range: 1-1440.<br>When type is <code>Period</code> or <code>Fixed</code>, the time field takes effect.</p>
     * @param Time <p>Execution period or custom execution time point. Unit: minutes, value range: 1-1440.<br>When type is <code>Period</code> or <code>Fixed</code>, the time field takes effect.</p>
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get <p>The cron expression for the execution period. Example: <code>0/1 * * * *</code>. From left to right, each field represents Minutes field, Hours field, Day of month field, Month field, Day of week field. No support for second level. When the type is <code>Cron</code>, the CronExpression field takes effect.</p> 
     * @return CronExpression <p>The cron expression for the execution period. Example: <code>0/1 * * * *</code>. From left to right, each field represents Minutes field, Hours field, Day of month field, Month field, Day of week field. No support for second level. When the type is <code>Cron</code>, the CronExpression field takes effect.</p>
     */
    public String getCronExpression() {
        return this.CronExpression;
    }

    /**
     * Set <p>The cron expression for the execution period. Example: <code>0/1 * * * *</code>. From left to right, each field represents Minutes field, Hours field, Day of month field, Month field, Day of week field. No support for second level. When the type is <code>Cron</code>, the CronExpression field takes effect.</p>
     * @param CronExpression <p>The cron expression for the execution period. Example: <code>0/1 * * * *</code>. From left to right, each field represents Minutes field, Hours field, Day of month field, Month field, Day of week field. No support for second level. When the type is <code>Cron</code>, the CronExpression field takes effect.</p>
     */
    public void setCronExpression(String CronExpression) {
        this.CronExpression = CronExpression;
    }

    public MonitorTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorTime(MonitorTime source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.CronExpression != null) {
            this.CronExpression = new String(source.CronExpression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "CronExpression", this.CronExpression);

    }
}

