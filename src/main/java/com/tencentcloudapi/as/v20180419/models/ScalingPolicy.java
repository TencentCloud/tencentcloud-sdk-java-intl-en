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

public class ScalingPolicy extends AbstractModel {

    /**
    * Auto scaling group ID.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Alarm trigger policy ID.
    */
    @SerializedName("AutoScalingPolicyId")
    @Expose
    private String AutoScalingPolicyId;

    /**
    * Scaling policy type. Valid values:
- `SIMPLE`: A simple policy.
- `TARGET_TRACKING`: A target tracking policy.
    */
    @SerializedName("ScalingPolicyType")
    @Expose
    private String ScalingPolicyType;

    /**
    * Alarm trigger policy name.
    */
    @SerializedName("ScalingPolicyName")
    @Expose
    private String ScalingPolicyName;

    /**
    * The method to adjust the desired capacity after the alarm is triggered. It’s only available when `ScalingPolicyType` is `Simple`. Valid values: <br><li>`CHANGE_IN_CAPACITY`: Increase or decrease the desired capacity </li><li>`EXACT_CAPACITY`: Adjust to the specified desired capacity </li> <li>`PERCENT_CHANGE_IN_CAPACITY`: Adjust the desired capacity by percentage </li>
    */
    @SerializedName("AdjustmentType")
    @Expose
    private String AdjustmentType;

    /**
    * The adjusted value of desired capacity after the alarm is triggered. This parameter is only applicable to a simple policy.
    */
    @SerializedName("AdjustmentValue")
    @Expose
    private Long AdjustmentValue;

    /**
    * Cooldown duration in seconds, applies only to simple policies. value range [0,3600]. default cooldown: 300 seconds.
    */
    @SerializedName("Cooldown")
    @Expose
    private Long Cooldown;

    /**
    * Alarm monitoring metrics of a simple policy.
    */
    @SerializedName("MetricAlarm")
    @Expose
    private MetricAlarm MetricAlarm;

    /**
    * Preset monitoring item. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>ASG_AVG_CPU_UTILIZATION: Average CPU utilization</li><li>ASG_AVG_LAN_TRAFFIC_OUT: Average private bandwidth out</li><li>ASG_AVG_LAN_TRAFFIC_IN: Average private bandwidth in</li><li>ASG_AVG_WAN_TRAFFIC_OUT: Average public bandwidth out</li><li>ASG_AVG_WAN_TRAFFIC_IN: Average public bandwidth in</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PredefinedMetricType")
    @Expose
    private String PredefinedMetricType;

    /**
    * Target value. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value ranges: <br><li>`ASG_AVG_CPU_UTILIZATION` (in %): [1, 100)</li><li>`ASG_AVG_LAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_LAN_TRAFFIC_IN` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_IN` (in Mbps): >0</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetValue")
    @Expose
    private Long TargetValue;

    /**
    * Instance warm-up period (in seconds). It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EstimatedInstanceWarmup")
    @Expose
    private Long EstimatedInstanceWarmup;

    /**
    * Whether to disable scale-in. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>`true`: Scaling in is not allowed.</li><li>`false`: Allows both scale-out and scale-in</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DisableScaleIn")
    @Expose
    private Boolean DisableScaleIn;

    /**
    * List of alarm monitoring metrics. This parameter is only applicable to a target tracking policy.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricAlarms")
    @Expose
    private MetricAlarm [] MetricAlarms;

    /**
    * Notification group ID, which is the set of user group IDs.
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
     * Get Auto scaling group ID. 
     * @return AutoScalingGroupId Auto scaling group ID.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Auto scaling group ID.
     * @param AutoScalingGroupId Auto scaling group ID.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Alarm trigger policy ID. 
     * @return AutoScalingPolicyId Alarm trigger policy ID.
     */
    public String getAutoScalingPolicyId() {
        return this.AutoScalingPolicyId;
    }

    /**
     * Set Alarm trigger policy ID.
     * @param AutoScalingPolicyId Alarm trigger policy ID.
     */
    public void setAutoScalingPolicyId(String AutoScalingPolicyId) {
        this.AutoScalingPolicyId = AutoScalingPolicyId;
    }

    /**
     * Get Scaling policy type. Valid values:
- `SIMPLE`: A simple policy.
- `TARGET_TRACKING`: A target tracking policy. 
     * @return ScalingPolicyType Scaling policy type. Valid values:
- `SIMPLE`: A simple policy.
- `TARGET_TRACKING`: A target tracking policy.
     */
    public String getScalingPolicyType() {
        return this.ScalingPolicyType;
    }

    /**
     * Set Scaling policy type. Valid values:
- `SIMPLE`: A simple policy.
- `TARGET_TRACKING`: A target tracking policy.
     * @param ScalingPolicyType Scaling policy type. Valid values:
- `SIMPLE`: A simple policy.
- `TARGET_TRACKING`: A target tracking policy.
     */
    public void setScalingPolicyType(String ScalingPolicyType) {
        this.ScalingPolicyType = ScalingPolicyType;
    }

    /**
     * Get Alarm trigger policy name. 
     * @return ScalingPolicyName Alarm trigger policy name.
     */
    public String getScalingPolicyName() {
        return this.ScalingPolicyName;
    }

    /**
     * Set Alarm trigger policy name.
     * @param ScalingPolicyName Alarm trigger policy name.
     */
    public void setScalingPolicyName(String ScalingPolicyName) {
        this.ScalingPolicyName = ScalingPolicyName;
    }

    /**
     * Get The method to adjust the desired capacity after the alarm is triggered. It’s only available when `ScalingPolicyType` is `Simple`. Valid values: <br><li>`CHANGE_IN_CAPACITY`: Increase or decrease the desired capacity </li><li>`EXACT_CAPACITY`: Adjust to the specified desired capacity </li> <li>`PERCENT_CHANGE_IN_CAPACITY`: Adjust the desired capacity by percentage </li> 
     * @return AdjustmentType The method to adjust the desired capacity after the alarm is triggered. It’s only available when `ScalingPolicyType` is `Simple`. Valid values: <br><li>`CHANGE_IN_CAPACITY`: Increase or decrease the desired capacity </li><li>`EXACT_CAPACITY`: Adjust to the specified desired capacity </li> <li>`PERCENT_CHANGE_IN_CAPACITY`: Adjust the desired capacity by percentage </li>
     */
    public String getAdjustmentType() {
        return this.AdjustmentType;
    }

    /**
     * Set The method to adjust the desired capacity after the alarm is triggered. It’s only available when `ScalingPolicyType` is `Simple`. Valid values: <br><li>`CHANGE_IN_CAPACITY`: Increase or decrease the desired capacity </li><li>`EXACT_CAPACITY`: Adjust to the specified desired capacity </li> <li>`PERCENT_CHANGE_IN_CAPACITY`: Adjust the desired capacity by percentage </li>
     * @param AdjustmentType The method to adjust the desired capacity after the alarm is triggered. It’s only available when `ScalingPolicyType` is `Simple`. Valid values: <br><li>`CHANGE_IN_CAPACITY`: Increase or decrease the desired capacity </li><li>`EXACT_CAPACITY`: Adjust to the specified desired capacity </li> <li>`PERCENT_CHANGE_IN_CAPACITY`: Adjust the desired capacity by percentage </li>
     */
    public void setAdjustmentType(String AdjustmentType) {
        this.AdjustmentType = AdjustmentType;
    }

    /**
     * Get The adjusted value of desired capacity after the alarm is triggered. This parameter is only applicable to a simple policy. 
     * @return AdjustmentValue The adjusted value of desired capacity after the alarm is triggered. This parameter is only applicable to a simple policy.
     */
    public Long getAdjustmentValue() {
        return this.AdjustmentValue;
    }

    /**
     * Set The adjusted value of desired capacity after the alarm is triggered. This parameter is only applicable to a simple policy.
     * @param AdjustmentValue The adjusted value of desired capacity after the alarm is triggered. This parameter is only applicable to a simple policy.
     */
    public void setAdjustmentValue(Long AdjustmentValue) {
        this.AdjustmentValue = AdjustmentValue;
    }

    /**
     * Get Cooldown duration in seconds, applies only to simple policies. value range [0,3600]. default cooldown: 300 seconds. 
     * @return Cooldown Cooldown duration in seconds, applies only to simple policies. value range [0,3600]. default cooldown: 300 seconds.
     */
    public Long getCooldown() {
        return this.Cooldown;
    }

    /**
     * Set Cooldown duration in seconds, applies only to simple policies. value range [0,3600]. default cooldown: 300 seconds.
     * @param Cooldown Cooldown duration in seconds, applies only to simple policies. value range [0,3600]. default cooldown: 300 seconds.
     */
    public void setCooldown(Long Cooldown) {
        this.Cooldown = Cooldown;
    }

    /**
     * Get Alarm monitoring metrics of a simple policy. 
     * @return MetricAlarm Alarm monitoring metrics of a simple policy.
     */
    public MetricAlarm getMetricAlarm() {
        return this.MetricAlarm;
    }

    /**
     * Set Alarm monitoring metrics of a simple policy.
     * @param MetricAlarm Alarm monitoring metrics of a simple policy.
     */
    public void setMetricAlarm(MetricAlarm MetricAlarm) {
        this.MetricAlarm = MetricAlarm;
    }

    /**
     * Get Preset monitoring item. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>ASG_AVG_CPU_UTILIZATION: Average CPU utilization</li><li>ASG_AVG_LAN_TRAFFIC_OUT: Average private bandwidth out</li><li>ASG_AVG_LAN_TRAFFIC_IN: Average private bandwidth in</li><li>ASG_AVG_WAN_TRAFFIC_OUT: Average public bandwidth out</li><li>ASG_AVG_WAN_TRAFFIC_IN: Average public bandwidth in</li>
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PredefinedMetricType Preset monitoring item. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>ASG_AVG_CPU_UTILIZATION: Average CPU utilization</li><li>ASG_AVG_LAN_TRAFFIC_OUT: Average private bandwidth out</li><li>ASG_AVG_LAN_TRAFFIC_IN: Average private bandwidth in</li><li>ASG_AVG_WAN_TRAFFIC_OUT: Average public bandwidth out</li><li>ASG_AVG_WAN_TRAFFIC_IN: Average public bandwidth in</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPredefinedMetricType() {
        return this.PredefinedMetricType;
    }

    /**
     * Set Preset monitoring item. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>ASG_AVG_CPU_UTILIZATION: Average CPU utilization</li><li>ASG_AVG_LAN_TRAFFIC_OUT: Average private bandwidth out</li><li>ASG_AVG_LAN_TRAFFIC_IN: Average private bandwidth in</li><li>ASG_AVG_WAN_TRAFFIC_OUT: Average public bandwidth out</li><li>ASG_AVG_WAN_TRAFFIC_IN: Average public bandwidth in</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PredefinedMetricType Preset monitoring item. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>ASG_AVG_CPU_UTILIZATION: Average CPU utilization</li><li>ASG_AVG_LAN_TRAFFIC_OUT: Average private bandwidth out</li><li>ASG_AVG_LAN_TRAFFIC_IN: Average private bandwidth in</li><li>ASG_AVG_WAN_TRAFFIC_OUT: Average public bandwidth out</li><li>ASG_AVG_WAN_TRAFFIC_IN: Average public bandwidth in</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPredefinedMetricType(String PredefinedMetricType) {
        this.PredefinedMetricType = PredefinedMetricType;
    }

    /**
     * Get Target value. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value ranges: <br><li>`ASG_AVG_CPU_UTILIZATION` (in %): [1, 100)</li><li>`ASG_AVG_LAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_LAN_TRAFFIC_IN` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_IN` (in Mbps): >0</li>
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TargetValue Target value. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value ranges: <br><li>`ASG_AVG_CPU_UTILIZATION` (in %): [1, 100)</li><li>`ASG_AVG_LAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_LAN_TRAFFIC_IN` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_IN` (in Mbps): >0</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getTargetValue() {
        return this.TargetValue;
    }

    /**
     * Set Target value. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value ranges: <br><li>`ASG_AVG_CPU_UTILIZATION` (in %): [1, 100)</li><li>`ASG_AVG_LAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_LAN_TRAFFIC_IN` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_IN` (in Mbps): >0</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TargetValue Target value. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value ranges: <br><li>`ASG_AVG_CPU_UTILIZATION` (in %): [1, 100)</li><li>`ASG_AVG_LAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_LAN_TRAFFIC_IN` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_IN` (in Mbps): >0</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTargetValue(Long TargetValue) {
        this.TargetValue = TargetValue;
    }

    /**
     * Get Instance warm-up period (in seconds). It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EstimatedInstanceWarmup Instance warm-up period (in seconds). It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getEstimatedInstanceWarmup() {
        return this.EstimatedInstanceWarmup;
    }

    /**
     * Set Instance warm-up period (in seconds). It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EstimatedInstanceWarmup Instance warm-up period (in seconds). It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEstimatedInstanceWarmup(Long EstimatedInstanceWarmup) {
        this.EstimatedInstanceWarmup = EstimatedInstanceWarmup;
    }

    /**
     * Get Whether to disable scale-in. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>`true`: Scaling in is not allowed.</li><li>`false`: Allows both scale-out and scale-in</li>
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DisableScaleIn Whether to disable scale-in. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>`true`: Scaling in is not allowed.</li><li>`false`: Allows both scale-out and scale-in</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getDisableScaleIn() {
        return this.DisableScaleIn;
    }

    /**
     * Set Whether to disable scale-in. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>`true`: Scaling in is not allowed.</li><li>`false`: Allows both scale-out and scale-in</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DisableScaleIn Whether to disable scale-in. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>`true`: Scaling in is not allowed.</li><li>`false`: Allows both scale-out and scale-in</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDisableScaleIn(Boolean DisableScaleIn) {
        this.DisableScaleIn = DisableScaleIn;
    }

    /**
     * Get List of alarm monitoring metrics. This parameter is only applicable to a target tracking policy.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return MetricAlarms List of alarm monitoring metrics. This parameter is only applicable to a target tracking policy.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public MetricAlarm [] getMetricAlarms() {
        return this.MetricAlarms;
    }

    /**
     * Set List of alarm monitoring metrics. This parameter is only applicable to a target tracking policy.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param MetricAlarms List of alarm monitoring metrics. This parameter is only applicable to a target tracking policy.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMetricAlarms(MetricAlarm [] MetricAlarms) {
        this.MetricAlarms = MetricAlarms;
    }

    /**
     * Get Notification group ID, which is the set of user group IDs. 
     * @return NotificationUserGroupIds Notification group ID, which is the set of user group IDs.
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set Notification group ID, which is the set of user group IDs.
     * @param NotificationUserGroupIds Notification group ID, which is the set of user group IDs.
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    public ScalingPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScalingPolicy(ScalingPolicy source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.AutoScalingPolicyId != null) {
            this.AutoScalingPolicyId = new String(source.AutoScalingPolicyId);
        }
        if (source.ScalingPolicyType != null) {
            this.ScalingPolicyType = new String(source.ScalingPolicyType);
        }
        if (source.ScalingPolicyName != null) {
            this.ScalingPolicyName = new String(source.ScalingPolicyName);
        }
        if (source.AdjustmentType != null) {
            this.AdjustmentType = new String(source.AdjustmentType);
        }
        if (source.AdjustmentValue != null) {
            this.AdjustmentValue = new Long(source.AdjustmentValue);
        }
        if (source.Cooldown != null) {
            this.Cooldown = new Long(source.Cooldown);
        }
        if (source.MetricAlarm != null) {
            this.MetricAlarm = new MetricAlarm(source.MetricAlarm);
        }
        if (source.PredefinedMetricType != null) {
            this.PredefinedMetricType = new String(source.PredefinedMetricType);
        }
        if (source.TargetValue != null) {
            this.TargetValue = new Long(source.TargetValue);
        }
        if (source.EstimatedInstanceWarmup != null) {
            this.EstimatedInstanceWarmup = new Long(source.EstimatedInstanceWarmup);
        }
        if (source.DisableScaleIn != null) {
            this.DisableScaleIn = new Boolean(source.DisableScaleIn);
        }
        if (source.MetricAlarms != null) {
            this.MetricAlarms = new MetricAlarm[source.MetricAlarms.length];
            for (int i = 0; i < source.MetricAlarms.length; i++) {
                this.MetricAlarms[i] = new MetricAlarm(source.MetricAlarms[i]);
            }
        }
        if (source.NotificationUserGroupIds != null) {
            this.NotificationUserGroupIds = new String[source.NotificationUserGroupIds.length];
            for (int i = 0; i < source.NotificationUserGroupIds.length; i++) {
                this.NotificationUserGroupIds[i] = new String(source.NotificationUserGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "AutoScalingPolicyId", this.AutoScalingPolicyId);
        this.setParamSimple(map, prefix + "ScalingPolicyType", this.ScalingPolicyType);
        this.setParamSimple(map, prefix + "ScalingPolicyName", this.ScalingPolicyName);
        this.setParamSimple(map, prefix + "AdjustmentType", this.AdjustmentType);
        this.setParamSimple(map, prefix + "AdjustmentValue", this.AdjustmentValue);
        this.setParamSimple(map, prefix + "Cooldown", this.Cooldown);
        this.setParamObj(map, prefix + "MetricAlarm.", this.MetricAlarm);
        this.setParamSimple(map, prefix + "PredefinedMetricType", this.PredefinedMetricType);
        this.setParamSimple(map, prefix + "TargetValue", this.TargetValue);
        this.setParamSimple(map, prefix + "EstimatedInstanceWarmup", this.EstimatedInstanceWarmup);
        this.setParamSimple(map, prefix + "DisableScaleIn", this.DisableScaleIn);
        this.setParamArrayObj(map, prefix + "MetricAlarms.", this.MetricAlarms);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);

    }
}

