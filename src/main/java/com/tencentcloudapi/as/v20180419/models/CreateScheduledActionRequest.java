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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScheduledActionRequest extends AbstractModel {

    /**
    * Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Query the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Specifies the scaling group ID obtained by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.</li>.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Scheduled task name, which can only contain letters, numbers, underscores, hyphens ("-"), and decimal points with a maximum length of 60 bytes and must be unique in an auto scaling group.
    */
    @SerializedName("ScheduledActionName")
    @Expose
    private String ScheduledActionName;

    /**
    * The minimum number of instances set for the auto scaling group when the scheduled task is triggered.
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * Initial triggered time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The desired number of instances set for the auto scaling group when the scheduled task is triggered.
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * The maximum number of instances set for the auto scaling group when the scheduled task is triggered.
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * End time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard. <br><br>This parameter and `Recurrence` need to be specified at the same time. After the end time, the scheduled task will no longer take effect.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The repeating mode of a scheduled task follows the standard Cron format. the [Recurrence parameter limits](https://intl.cloud.tencent.com/document/product/377/88119?from_cn_redirect=1) in a scheduled task consist of 5 fields separated by spaces, with the structure: minute, hour, date, month, week. this parameter must be simultaneously specified with `EndTime`.
    */
    @SerializedName("Recurrence")
    @Expose
    private String Recurrence;

    /**
    * Disable update DesiredCapacity Indicates the DesiredCapacity is updated normally during scheduled task triggering.

Specifies whether the scheduled task triggers proactive modification of the DesiredCapacity when the value is True. DesiredCapacity may be modified by the minSize and maxSize mechanism.
The following cases assume that DisableUpdateDesiredCapacity is True:
- When scheduled task triggered, the original DesiredCapacity is 5. The scheduled task changes the minSize to 10, the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect. However, the original DesiredCapacity 5 is less than minSize 10, so the final new DesiredCapacity is 10.
- When scheduled task triggered, the original DesiredCapacity is 25. The scheduled task changes the minSize to 10 and the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect. However, the original DesiredCapacity 25 is greater than the maxSize 20, so the final new DesiredCapacity is 20.
- When scheduled task triggered, the original DesiredCapacity is 13. The scheduled task changes the minSize to 10 and the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect, and the DesiredCapacity is still 13.
    */
    @SerializedName("DisableUpdateDesiredCapacity")
    @Expose
    private Boolean DisableUpdateDesiredCapacity;

    /**
     * Get Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Query the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Specifies the scaling group ID obtained by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.</li>. 
     * @return AutoScalingGroupId Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Query the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Specifies the scaling group ID obtained by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.</li>.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Query the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Specifies the scaling group ID obtained by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.</li>.
     * @param AutoScalingGroupId Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Query the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Specifies the scaling group ID obtained by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.</li>.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Scheduled task name, which can only contain letters, numbers, underscores, hyphens ("-"), and decimal points with a maximum length of 60 bytes and must be unique in an auto scaling group. 
     * @return ScheduledActionName Scheduled task name, which can only contain letters, numbers, underscores, hyphens ("-"), and decimal points with a maximum length of 60 bytes and must be unique in an auto scaling group.
     */
    public String getScheduledActionName() {
        return this.ScheduledActionName;
    }

    /**
     * Set Scheduled task name, which can only contain letters, numbers, underscores, hyphens ("-"), and decimal points with a maximum length of 60 bytes and must be unique in an auto scaling group.
     * @param ScheduledActionName Scheduled task name, which can only contain letters, numbers, underscores, hyphens ("-"), and decimal points with a maximum length of 60 bytes and must be unique in an auto scaling group.
     */
    public void setScheduledActionName(String ScheduledActionName) {
        this.ScheduledActionName = ScheduledActionName;
    }

    /**
     * Get The minimum number of instances set for the auto scaling group when the scheduled task is triggered. 
     * @return MinSize The minimum number of instances set for the auto scaling group when the scheduled task is triggered.
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set The minimum number of instances set for the auto scaling group when the scheduled task is triggered.
     * @param MinSize The minimum number of instances set for the auto scaling group when the scheduled task is triggered.
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get Initial triggered time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard. 
     * @return StartTime Initial triggered time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Initial triggered time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard.
     * @param StartTime Initial triggered time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The desired number of instances set for the auto scaling group when the scheduled task is triggered. 
     * @return DesiredCapacity The desired number of instances set for the auto scaling group when the scheduled task is triggered.
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set The desired number of instances set for the auto scaling group when the scheduled task is triggered.
     * @param DesiredCapacity The desired number of instances set for the auto scaling group when the scheduled task is triggered.
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get The maximum number of instances set for the auto scaling group when the scheduled task is triggered. 
     * @return MaxSize The maximum number of instances set for the auto scaling group when the scheduled task is triggered.
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set The maximum number of instances set for the auto scaling group when the scheduled task is triggered.
     * @param MaxSize The maximum number of instances set for the auto scaling group when the scheduled task is triggered.
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get End time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard. <br><br>This parameter and `Recurrence` need to be specified at the same time. After the end time, the scheduled task will no longer take effect. 
     * @return EndTime End time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard. <br><br>This parameter and `Recurrence` need to be specified at the same time. After the end time, the scheduled task will no longer take effect.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard. <br><br>This parameter and `Recurrence` need to be specified at the same time. After the end time, the scheduled task will no longer take effect.
     * @param EndTime End time of the scheduled task. The value is in `Beijing time` (UTC+8) in the format of `YYYY-MM-DDThh:mm:ss+08:00` according to the `ISO8601` standard. <br><br>This parameter and `Recurrence` need to be specified at the same time. After the end time, the scheduled task will no longer take effect.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The repeating mode of a scheduled task follows the standard Cron format. the [Recurrence parameter limits](https://intl.cloud.tencent.com/document/product/377/88119?from_cn_redirect=1) in a scheduled task consist of 5 fields separated by spaces, with the structure: minute, hour, date, month, week. this parameter must be simultaneously specified with `EndTime`. 
     * @return Recurrence The repeating mode of a scheduled task follows the standard Cron format. the [Recurrence parameter limits](https://intl.cloud.tencent.com/document/product/377/88119?from_cn_redirect=1) in a scheduled task consist of 5 fields separated by spaces, with the structure: minute, hour, date, month, week. this parameter must be simultaneously specified with `EndTime`.
     */
    public String getRecurrence() {
        return this.Recurrence;
    }

    /**
     * Set The repeating mode of a scheduled task follows the standard Cron format. the [Recurrence parameter limits](https://intl.cloud.tencent.com/document/product/377/88119?from_cn_redirect=1) in a scheduled task consist of 5 fields separated by spaces, with the structure: minute, hour, date, month, week. this parameter must be simultaneously specified with `EndTime`.
     * @param Recurrence The repeating mode of a scheduled task follows the standard Cron format. the [Recurrence parameter limits](https://intl.cloud.tencent.com/document/product/377/88119?from_cn_redirect=1) in a scheduled task consist of 5 fields separated by spaces, with the structure: minute, hour, date, month, week. this parameter must be simultaneously specified with `EndTime`.
     */
    public void setRecurrence(String Recurrence) {
        this.Recurrence = Recurrence;
    }

    /**
     * Get Disable update DesiredCapacity Indicates the DesiredCapacity is updated normally during scheduled task triggering.

Specifies whether the scheduled task triggers proactive modification of the DesiredCapacity when the value is True. DesiredCapacity may be modified by the minSize and maxSize mechanism.
The following cases assume that DisableUpdateDesiredCapacity is True:
- When scheduled task triggered, the original DesiredCapacity is 5. The scheduled task changes the minSize to 10, the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect. However, the original DesiredCapacity 5 is less than minSize 10, so the final new DesiredCapacity is 10.
- When scheduled task triggered, the original DesiredCapacity is 25. The scheduled task changes the minSize to 10 and the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect. However, the original DesiredCapacity 25 is greater than the maxSize 20, so the final new DesiredCapacity is 20.
- When scheduled task triggered, the original DesiredCapacity is 13. The scheduled task changes the minSize to 10 and the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect, and the DesiredCapacity is still 13. 
     * @return DisableUpdateDesiredCapacity Disable update DesiredCapacity Indicates the DesiredCapacity is updated normally during scheduled task triggering.

Specifies whether the scheduled task triggers proactive modification of the DesiredCapacity when the value is True. DesiredCapacity may be modified by the minSize and maxSize mechanism.
The following cases assume that DisableUpdateDesiredCapacity is True:
- When scheduled task triggered, the original DesiredCapacity is 5. The scheduled task changes the minSize to 10, the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect. However, the original DesiredCapacity 5 is less than minSize 10, so the final new DesiredCapacity is 10.
- When scheduled task triggered, the original DesiredCapacity is 25. The scheduled task changes the minSize to 10 and the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect. However, the original DesiredCapacity 25 is greater than the maxSize 20, so the final new DesiredCapacity is 20.
- When scheduled task triggered, the original DesiredCapacity is 13. The scheduled task changes the minSize to 10 and the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect, and the DesiredCapacity is still 13.
     */
    public Boolean getDisableUpdateDesiredCapacity() {
        return this.DisableUpdateDesiredCapacity;
    }

    /**
     * Set Disable update DesiredCapacity Indicates the DesiredCapacity is updated normally during scheduled task triggering.

Specifies whether the scheduled task triggers proactive modification of the DesiredCapacity when the value is True. DesiredCapacity may be modified by the minSize and maxSize mechanism.
The following cases assume that DisableUpdateDesiredCapacity is True:
- When scheduled task triggered, the original DesiredCapacity is 5. The scheduled task changes the minSize to 10, the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect. However, the original DesiredCapacity 5 is less than minSize 10, so the final new DesiredCapacity is 10.
- When scheduled task triggered, the original DesiredCapacity is 25. The scheduled task changes the minSize to 10 and the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect. However, the original DesiredCapacity 25 is greater than the maxSize 20, so the final new DesiredCapacity is 20.
- When scheduled task triggered, the original DesiredCapacity is 13. The scheduled task changes the minSize to 10 and the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect, and the DesiredCapacity is still 13.
     * @param DisableUpdateDesiredCapacity Disable update DesiredCapacity Indicates the DesiredCapacity is updated normally during scheduled task triggering.

Specifies whether the scheduled task triggers proactive modification of the DesiredCapacity when the value is True. DesiredCapacity may be modified by the minSize and maxSize mechanism.
The following cases assume that DisableUpdateDesiredCapacity is True:
- When scheduled task triggered, the original DesiredCapacity is 5. The scheduled task changes the minSize to 10, the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect. However, the original DesiredCapacity 5 is less than minSize 10, so the final new DesiredCapacity is 10.
- When scheduled task triggered, the original DesiredCapacity is 25. The scheduled task changes the minSize to 10 and the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect. However, the original DesiredCapacity 25 is greater than the maxSize 20, so the final new DesiredCapacity is 20.
- When scheduled task triggered, the original DesiredCapacity is 13. The scheduled task changes the minSize to 10 and the maxSize to 20, and the DesiredCapacity to 15. Since the DesiredCapacity update is disabled, 15 does not take effect, and the DesiredCapacity is still 13.
     */
    public void setDisableUpdateDesiredCapacity(Boolean DisableUpdateDesiredCapacity) {
        this.DisableUpdateDesiredCapacity = DisableUpdateDesiredCapacity;
    }

    public CreateScheduledActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScheduledActionRequest(CreateScheduledActionRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.ScheduledActionName != null) {
            this.ScheduledActionName = new String(source.ScheduledActionName);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.DesiredCapacity != null) {
            this.DesiredCapacity = new Long(source.DesiredCapacity);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Recurrence != null) {
            this.Recurrence = new String(source.Recurrence);
        }
        if (source.DisableUpdateDesiredCapacity != null) {
            this.DisableUpdateDesiredCapacity = new Boolean(source.DisableUpdateDesiredCapacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "ScheduledActionName", this.ScheduledActionName);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Recurrence", this.Recurrence);
        this.setParamSimple(map, prefix + "DisableUpdateDesiredCapacity", this.DisableUpdateDesiredCapacity);

    }
}

