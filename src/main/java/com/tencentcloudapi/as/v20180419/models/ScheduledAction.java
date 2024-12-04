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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduledAction extends AbstractModel {

    /**
    * Scheduled task ID.
    */
    @SerializedName("ScheduledActionId")
    @Expose
    private String ScheduledActionId;

    /**
    * Scheduled task name.
    */
    @SerializedName("ScheduledActionName")
    @Expose
    private String ScheduledActionName;

    /**
    * ID of the auto scaling group where the scheduled task is located.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Start time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Repeating mode of the scheduled task.
    */
    @SerializedName("Recurrence")
    @Expose
    private String Recurrence;

    /**
    * End time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Maximum number of instances set by the scheduled task.
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * Desired number of instances set by the scheduled task.
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * Minimum number of instances set by the scheduled task.
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * Creation time of the scheduled task. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Scheduled task execution type. Valid values:
<li>CRONTAB: repeated execution.</li>
<li>ONCE: single execution.</li>
    */
    @SerializedName("ScheduledType")
    @Expose
    private String ScheduledType;

    /**
     * Get Scheduled task ID. 
     * @return ScheduledActionId Scheduled task ID.
     */
    public String getScheduledActionId() {
        return this.ScheduledActionId;
    }

    /**
     * Set Scheduled task ID.
     * @param ScheduledActionId Scheduled task ID.
     */
    public void setScheduledActionId(String ScheduledActionId) {
        this.ScheduledActionId = ScheduledActionId;
    }

    /**
     * Get Scheduled task name. 
     * @return ScheduledActionName Scheduled task name.
     */
    public String getScheduledActionName() {
        return this.ScheduledActionName;
    }

    /**
     * Set Scheduled task name.
     * @param ScheduledActionName Scheduled task name.
     */
    public void setScheduledActionName(String ScheduledActionName) {
        this.ScheduledActionName = ScheduledActionName;
    }

    /**
     * Get ID of the auto scaling group where the scheduled task is located. 
     * @return AutoScalingGroupId ID of the auto scaling group where the scheduled task is located.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set ID of the auto scaling group where the scheduled task is located.
     * @param AutoScalingGroupId ID of the auto scaling group where the scheduled task is located.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Start time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard. 
     * @return StartTime Start time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard.
     * @param StartTime Start time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Repeating mode of the scheduled task. 
     * @return Recurrence Repeating mode of the scheduled task.
     */
    public String getRecurrence() {
        return this.Recurrence;
    }

    /**
     * Set Repeating mode of the scheduled task.
     * @param Recurrence Repeating mode of the scheduled task.
     */
    public void setRecurrence(String Recurrence) {
        this.Recurrence = Recurrence;
    }

    /**
     * Get End time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard. 
     * @return EndTime End time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard.
     * @param EndTime End time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Maximum number of instances set by the scheduled task. 
     * @return MaxSize Maximum number of instances set by the scheduled task.
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum number of instances set by the scheduled task.
     * @param MaxSize Maximum number of instances set by the scheduled task.
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get Desired number of instances set by the scheduled task. 
     * @return DesiredCapacity Desired number of instances set by the scheduled task.
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set Desired number of instances set by the scheduled task.
     * @param DesiredCapacity Desired number of instances set by the scheduled task.
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get Minimum number of instances set by the scheduled task. 
     * @return MinSize Minimum number of instances set by the scheduled task.
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set Minimum number of instances set by the scheduled task.
     * @param MinSize Minimum number of instances set by the scheduled task.
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get Creation time of the scheduled task. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard. 
     * @return CreatedTime Creation time of the scheduled task. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time of the scheduled task. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard.
     * @param CreatedTime Creation time of the scheduled task. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Scheduled task execution type. Valid values:
<li>CRONTAB: repeated execution.</li>
<li>ONCE: single execution.</li> 
     * @return ScheduledType Scheduled task execution type. Valid values:
<li>CRONTAB: repeated execution.</li>
<li>ONCE: single execution.</li>
     */
    public String getScheduledType() {
        return this.ScheduledType;
    }

    /**
     * Set Scheduled task execution type. Valid values:
<li>CRONTAB: repeated execution.</li>
<li>ONCE: single execution.</li>
     * @param ScheduledType Scheduled task execution type. Valid values:
<li>CRONTAB: repeated execution.</li>
<li>ONCE: single execution.</li>
     */
    public void setScheduledType(String ScheduledType) {
        this.ScheduledType = ScheduledType;
    }

    public ScheduledAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduledAction(ScheduledAction source) {
        if (source.ScheduledActionId != null) {
            this.ScheduledActionId = new String(source.ScheduledActionId);
        }
        if (source.ScheduledActionName != null) {
            this.ScheduledActionName = new String(source.ScheduledActionName);
        }
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Recurrence != null) {
            this.Recurrence = new String(source.Recurrence);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.DesiredCapacity != null) {
            this.DesiredCapacity = new Long(source.DesiredCapacity);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ScheduledType != null) {
            this.ScheduledType = new String(source.ScheduledType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduledActionId", this.ScheduledActionId);
        this.setParamSimple(map, prefix + "ScheduledActionName", this.ScheduledActionName);
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Recurrence", this.Recurrence);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ScheduledType", this.ScheduledType);

    }
}

