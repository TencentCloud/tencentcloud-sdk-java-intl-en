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

public class CreateScalingPolicyRequest extends AbstractModel {

    /**
    * Scaling group ID. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1), and retrieve AutoScalingGroupId from the returned information.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * The Alarm policy name must be unique in your account. the name length cannot exceed 60 characters. the name only supports chinese, english, digits, underscores, hyphens, and decimal points.
    */
    @SerializedName("ScalingPolicyName")
    @Expose
    private String ScalingPolicyName;

    /**
    * Alarm trigger policy type. default: SIMPLE. valid values:.
<Li>`SIMPLE`: a simple policy.</li>.
<Li>`TARGET_TRACKING`: a target tracking policy.</li>.
    */
    @SerializedName("ScalingPolicyType")
    @Expose
    private String ScalingPolicyType;

    /**
    * After an Alarm is triggered, specifies the method for modifying the expected number of instances. required in the scenario of simple policies. valid values:.
<Li>CHANGE_IN_CAPACITY: increase or decrease the expected number of instances</li>.
<Li>EXACT_CAPACITY: adjust to the expected number of instances</li>.
<Li>PERCENT_CHANGE_IN_CAPACITY: adjust expected instance number by percent</li>.
    */
    @SerializedName("AdjustmentType")
    @Expose
    private String AdjustmentType;

    /**
    * Adjustment value for the expected number of instances after an Alarm is triggered, which is applicable only to simple policies and required in simple policy scenarios.
<li>When AdjustmentType is CHANGE_IN_CAPACITY, a positive AdjustmentValue indicates an increase IN instances after Alarm trigger, while a negative value indicates a decrease IN instances after Alarm trigger.</li>. 
<li>When AdjustmentType is set to EXACT_CAPACITY, the value of AdjustmentValue indicates the new desired number of instances after the Alarm is triggered. it must be at least 0.</li>. 
<li>When AdjustmentType is set to PERCENT_CHANGE_IN_CAPACITY, a positive value of AdjustmentValue indicates an increase in the number of instances by a percentage after the alarm is triggered, while a negative value indicates a decrease in the number of instances by a percentage after the alarm is triggered. Unit: %.</li>
    */
    @SerializedName("AdjustmentValue")
    @Expose
    private Long AdjustmentValue;

    /**
    * Cooldown period (in seconds). This parameter is only applicable to a simple policy. Default value: 300.
    */
    @SerializedName("Cooldown")
    @Expose
    private Long Cooldown;

    /**
    * Alarm monitoring metric, apply only to simple policies, required in the scenario of simple policy.
    */
    @SerializedName("MetricAlarm")
    @Expose
    private MetricAlarm MetricAlarm;

    /**
    * Predefined monitoring item, applicable only to target tracking policies. required in the scenario. value range:.
<Li>ASG_AVG_CPU_UTILIZATION: average cpu utilization</li>.
<Li>ASG_AVG_LAN_TRAFFIC_OUT: specifies the average outbound private network bandwidth.</li>.
<Li>ASG_AVG_LAN_TRAFFIC_IN: average inbound private network bandwidth</li>.
<Li>ASG_AVG_WAN_TRAFFIC_OUT: specifies the average outbound public network bandwidth.</li>.
<li>ASG_AVG_WAN_TRAFFIC_IN: average inbound public network bandwidth</li>
    */
    @SerializedName("PredefinedMetricType")
    @Expose
    private String PredefinedMetricType;

    /**
    * Target value, applicable only to the target tracking policy, required in the scenario.
<Li>ASG_AVG_CPU_UTILIZATION: value range: [1, 100); unit: %.</li>.
<li>ASG_AVG_LAN_TRAFFIC_OUT: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_LAN_TRAFFIC_IN: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_WAN_TRAFFIC_OUT: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_WAN_TRAFFIC_IN: value range: > 0; unit: Mbps.</li>
    */
    @SerializedName("TargetValue")
    @Expose
    private Long TargetValue;

    /**
    * Instance warm-up period (in seconds). It is only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600. Default value: 300.
    */
    @SerializedName("EstimatedInstanceWarmup")
    @Expose
    private Long EstimatedInstanceWarmup;

    /**
    * Whether to disable scale-in, which is applicable only to target tracking policies. Default value: false. Valid values:
<li>true: Target tracking policies trigger only scale-out.</li>
<li>false: Target tracking policies trigger both scale-out and scale-in.</li>
    */
    @SerializedName("DisableScaleIn")
    @Expose
    private Boolean DisableScaleIn;

    /**
    * This parameter is diused. Please use [CreateNotificationConfiguration](https://intl.cloud.tencent.com/document/api/377/33185?from_cn_redirect=1) instead.
Notification group ID, which is the set of user group IDs.
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
     * Get Scaling group ID. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1), and retrieve AutoScalingGroupId from the returned information. 
     * @return AutoScalingGroupId Scaling group ID. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1), and retrieve AutoScalingGroupId from the returned information.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1), and retrieve AutoScalingGroupId from the returned information.
     * @param AutoScalingGroupId Scaling group ID. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1), and retrieve AutoScalingGroupId from the returned information.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get The Alarm policy name must be unique in your account. the name length cannot exceed 60 characters. the name only supports chinese, english, digits, underscores, hyphens, and decimal points. 
     * @return ScalingPolicyName The Alarm policy name must be unique in your account. the name length cannot exceed 60 characters. the name only supports chinese, english, digits, underscores, hyphens, and decimal points.
     */
    public String getScalingPolicyName() {
        return this.ScalingPolicyName;
    }

    /**
     * Set The Alarm policy name must be unique in your account. the name length cannot exceed 60 characters. the name only supports chinese, english, digits, underscores, hyphens, and decimal points.
     * @param ScalingPolicyName The Alarm policy name must be unique in your account. the name length cannot exceed 60 characters. the name only supports chinese, english, digits, underscores, hyphens, and decimal points.
     */
    public void setScalingPolicyName(String ScalingPolicyName) {
        this.ScalingPolicyName = ScalingPolicyName;
    }

    /**
     * Get Alarm trigger policy type. default: SIMPLE. valid values:.
<Li>`SIMPLE`: a simple policy.</li>.
<Li>`TARGET_TRACKING`: a target tracking policy.</li>. 
     * @return ScalingPolicyType Alarm trigger policy type. default: SIMPLE. valid values:.
<Li>`SIMPLE`: a simple policy.</li>.
<Li>`TARGET_TRACKING`: a target tracking policy.</li>.
     */
    public String getScalingPolicyType() {
        return this.ScalingPolicyType;
    }

    /**
     * Set Alarm trigger policy type. default: SIMPLE. valid values:.
<Li>`SIMPLE`: a simple policy.</li>.
<Li>`TARGET_TRACKING`: a target tracking policy.</li>.
     * @param ScalingPolicyType Alarm trigger policy type. default: SIMPLE. valid values:.
<Li>`SIMPLE`: a simple policy.</li>.
<Li>`TARGET_TRACKING`: a target tracking policy.</li>.
     */
    public void setScalingPolicyType(String ScalingPolicyType) {
        this.ScalingPolicyType = ScalingPolicyType;
    }

    /**
     * Get After an Alarm is triggered, specifies the method for modifying the expected number of instances. required in the scenario of simple policies. valid values:.
<Li>CHANGE_IN_CAPACITY: increase or decrease the expected number of instances</li>.
<Li>EXACT_CAPACITY: adjust to the expected number of instances</li>.
<Li>PERCENT_CHANGE_IN_CAPACITY: adjust expected instance number by percent</li>. 
     * @return AdjustmentType After an Alarm is triggered, specifies the method for modifying the expected number of instances. required in the scenario of simple policies. valid values:.
<Li>CHANGE_IN_CAPACITY: increase or decrease the expected number of instances</li>.
<Li>EXACT_CAPACITY: adjust to the expected number of instances</li>.
<Li>PERCENT_CHANGE_IN_CAPACITY: adjust expected instance number by percent</li>.
     */
    public String getAdjustmentType() {
        return this.AdjustmentType;
    }

    /**
     * Set After an Alarm is triggered, specifies the method for modifying the expected number of instances. required in the scenario of simple policies. valid values:.
<Li>CHANGE_IN_CAPACITY: increase or decrease the expected number of instances</li>.
<Li>EXACT_CAPACITY: adjust to the expected number of instances</li>.
<Li>PERCENT_CHANGE_IN_CAPACITY: adjust expected instance number by percent</li>.
     * @param AdjustmentType After an Alarm is triggered, specifies the method for modifying the expected number of instances. required in the scenario of simple policies. valid values:.
<Li>CHANGE_IN_CAPACITY: increase or decrease the expected number of instances</li>.
<Li>EXACT_CAPACITY: adjust to the expected number of instances</li>.
<Li>PERCENT_CHANGE_IN_CAPACITY: adjust expected instance number by percent</li>.
     */
    public void setAdjustmentType(String AdjustmentType) {
        this.AdjustmentType = AdjustmentType;
    }

    /**
     * Get Adjustment value for the expected number of instances after an Alarm is triggered, which is applicable only to simple policies and required in simple policy scenarios.
<li>When AdjustmentType is CHANGE_IN_CAPACITY, a positive AdjustmentValue indicates an increase IN instances after Alarm trigger, while a negative value indicates a decrease IN instances after Alarm trigger.</li>. 
<li>When AdjustmentType is set to EXACT_CAPACITY, the value of AdjustmentValue indicates the new desired number of instances after the Alarm is triggered. it must be at least 0.</li>. 
<li>When AdjustmentType is set to PERCENT_CHANGE_IN_CAPACITY, a positive value of AdjustmentValue indicates an increase in the number of instances by a percentage after the alarm is triggered, while a negative value indicates a decrease in the number of instances by a percentage after the alarm is triggered. Unit: %.</li> 
     * @return AdjustmentValue Adjustment value for the expected number of instances after an Alarm is triggered, which is applicable only to simple policies and required in simple policy scenarios.
<li>When AdjustmentType is CHANGE_IN_CAPACITY, a positive AdjustmentValue indicates an increase IN instances after Alarm trigger, while a negative value indicates a decrease IN instances after Alarm trigger.</li>. 
<li>When AdjustmentType is set to EXACT_CAPACITY, the value of AdjustmentValue indicates the new desired number of instances after the Alarm is triggered. it must be at least 0.</li>. 
<li>When AdjustmentType is set to PERCENT_CHANGE_IN_CAPACITY, a positive value of AdjustmentValue indicates an increase in the number of instances by a percentage after the alarm is triggered, while a negative value indicates a decrease in the number of instances by a percentage after the alarm is triggered. Unit: %.</li>
     */
    public Long getAdjustmentValue() {
        return this.AdjustmentValue;
    }

    /**
     * Set Adjustment value for the expected number of instances after an Alarm is triggered, which is applicable only to simple policies and required in simple policy scenarios.
<li>When AdjustmentType is CHANGE_IN_CAPACITY, a positive AdjustmentValue indicates an increase IN instances after Alarm trigger, while a negative value indicates a decrease IN instances after Alarm trigger.</li>. 
<li>When AdjustmentType is set to EXACT_CAPACITY, the value of AdjustmentValue indicates the new desired number of instances after the Alarm is triggered. it must be at least 0.</li>. 
<li>When AdjustmentType is set to PERCENT_CHANGE_IN_CAPACITY, a positive value of AdjustmentValue indicates an increase in the number of instances by a percentage after the alarm is triggered, while a negative value indicates a decrease in the number of instances by a percentage after the alarm is triggered. Unit: %.</li>
     * @param AdjustmentValue Adjustment value for the expected number of instances after an Alarm is triggered, which is applicable only to simple policies and required in simple policy scenarios.
<li>When AdjustmentType is CHANGE_IN_CAPACITY, a positive AdjustmentValue indicates an increase IN instances after Alarm trigger, while a negative value indicates a decrease IN instances after Alarm trigger.</li>. 
<li>When AdjustmentType is set to EXACT_CAPACITY, the value of AdjustmentValue indicates the new desired number of instances after the Alarm is triggered. it must be at least 0.</li>. 
<li>When AdjustmentType is set to PERCENT_CHANGE_IN_CAPACITY, a positive value of AdjustmentValue indicates an increase in the number of instances by a percentage after the alarm is triggered, while a negative value indicates a decrease in the number of instances by a percentage after the alarm is triggered. Unit: %.</li>
     */
    public void setAdjustmentValue(Long AdjustmentValue) {
        this.AdjustmentValue = AdjustmentValue;
    }

    /**
     * Get Cooldown period (in seconds). This parameter is only applicable to a simple policy. Default value: 300. 
     * @return Cooldown Cooldown period (in seconds). This parameter is only applicable to a simple policy. Default value: 300.
     */
    public Long getCooldown() {
        return this.Cooldown;
    }

    /**
     * Set Cooldown period (in seconds). This parameter is only applicable to a simple policy. Default value: 300.
     * @param Cooldown Cooldown period (in seconds). This parameter is only applicable to a simple policy. Default value: 300.
     */
    public void setCooldown(Long Cooldown) {
        this.Cooldown = Cooldown;
    }

    /**
     * Get Alarm monitoring metric, apply only to simple policies, required in the scenario of simple policy. 
     * @return MetricAlarm Alarm monitoring metric, apply only to simple policies, required in the scenario of simple policy.
     */
    public MetricAlarm getMetricAlarm() {
        return this.MetricAlarm;
    }

    /**
     * Set Alarm monitoring metric, apply only to simple policies, required in the scenario of simple policy.
     * @param MetricAlarm Alarm monitoring metric, apply only to simple policies, required in the scenario of simple policy.
     */
    public void setMetricAlarm(MetricAlarm MetricAlarm) {
        this.MetricAlarm = MetricAlarm;
    }

    /**
     * Get Predefined monitoring item, applicable only to target tracking policies. required in the scenario. value range:.
<Li>ASG_AVG_CPU_UTILIZATION: average cpu utilization</li>.
<Li>ASG_AVG_LAN_TRAFFIC_OUT: specifies the average outbound private network bandwidth.</li>.
<Li>ASG_AVG_LAN_TRAFFIC_IN: average inbound private network bandwidth</li>.
<Li>ASG_AVG_WAN_TRAFFIC_OUT: specifies the average outbound public network bandwidth.</li>.
<li>ASG_AVG_WAN_TRAFFIC_IN: average inbound public network bandwidth</li> 
     * @return PredefinedMetricType Predefined monitoring item, applicable only to target tracking policies. required in the scenario. value range:.
<Li>ASG_AVG_CPU_UTILIZATION: average cpu utilization</li>.
<Li>ASG_AVG_LAN_TRAFFIC_OUT: specifies the average outbound private network bandwidth.</li>.
<Li>ASG_AVG_LAN_TRAFFIC_IN: average inbound private network bandwidth</li>.
<Li>ASG_AVG_WAN_TRAFFIC_OUT: specifies the average outbound public network bandwidth.</li>.
<li>ASG_AVG_WAN_TRAFFIC_IN: average inbound public network bandwidth</li>
     */
    public String getPredefinedMetricType() {
        return this.PredefinedMetricType;
    }

    /**
     * Set Predefined monitoring item, applicable only to target tracking policies. required in the scenario. value range:.
<Li>ASG_AVG_CPU_UTILIZATION: average cpu utilization</li>.
<Li>ASG_AVG_LAN_TRAFFIC_OUT: specifies the average outbound private network bandwidth.</li>.
<Li>ASG_AVG_LAN_TRAFFIC_IN: average inbound private network bandwidth</li>.
<Li>ASG_AVG_WAN_TRAFFIC_OUT: specifies the average outbound public network bandwidth.</li>.
<li>ASG_AVG_WAN_TRAFFIC_IN: average inbound public network bandwidth</li>
     * @param PredefinedMetricType Predefined monitoring item, applicable only to target tracking policies. required in the scenario. value range:.
<Li>ASG_AVG_CPU_UTILIZATION: average cpu utilization</li>.
<Li>ASG_AVG_LAN_TRAFFIC_OUT: specifies the average outbound private network bandwidth.</li>.
<Li>ASG_AVG_LAN_TRAFFIC_IN: average inbound private network bandwidth</li>.
<Li>ASG_AVG_WAN_TRAFFIC_OUT: specifies the average outbound public network bandwidth.</li>.
<li>ASG_AVG_WAN_TRAFFIC_IN: average inbound public network bandwidth</li>
     */
    public void setPredefinedMetricType(String PredefinedMetricType) {
        this.PredefinedMetricType = PredefinedMetricType;
    }

    /**
     * Get Target value, applicable only to the target tracking policy, required in the scenario.
<Li>ASG_AVG_CPU_UTILIZATION: value range: [1, 100); unit: %.</li>.
<li>ASG_AVG_LAN_TRAFFIC_OUT: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_LAN_TRAFFIC_IN: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_WAN_TRAFFIC_OUT: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_WAN_TRAFFIC_IN: value range: > 0; unit: Mbps.</li> 
     * @return TargetValue Target value, applicable only to the target tracking policy, required in the scenario.
<Li>ASG_AVG_CPU_UTILIZATION: value range: [1, 100); unit: %.</li>.
<li>ASG_AVG_LAN_TRAFFIC_OUT: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_LAN_TRAFFIC_IN: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_WAN_TRAFFIC_OUT: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_WAN_TRAFFIC_IN: value range: > 0; unit: Mbps.</li>
     */
    public Long getTargetValue() {
        return this.TargetValue;
    }

    /**
     * Set Target value, applicable only to the target tracking policy, required in the scenario.
<Li>ASG_AVG_CPU_UTILIZATION: value range: [1, 100); unit: %.</li>.
<li>ASG_AVG_LAN_TRAFFIC_OUT: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_LAN_TRAFFIC_IN: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_WAN_TRAFFIC_OUT: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_WAN_TRAFFIC_IN: value range: > 0; unit: Mbps.</li>
     * @param TargetValue Target value, applicable only to the target tracking policy, required in the scenario.
<Li>ASG_AVG_CPU_UTILIZATION: value range: [1, 100); unit: %.</li>.
<li>ASG_AVG_LAN_TRAFFIC_OUT: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_LAN_TRAFFIC_IN: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_WAN_TRAFFIC_OUT: value range: > 0; unit: Mbps.</li>.
<li>ASG_AVG_WAN_TRAFFIC_IN: value range: > 0; unit: Mbps.</li>
     */
    public void setTargetValue(Long TargetValue) {
        this.TargetValue = TargetValue;
    }

    /**
     * Get Instance warm-up period (in seconds). It is only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600. Default value: 300. 
     * @return EstimatedInstanceWarmup Instance warm-up period (in seconds). It is only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600. Default value: 300.
     */
    public Long getEstimatedInstanceWarmup() {
        return this.EstimatedInstanceWarmup;
    }

    /**
     * Set Instance warm-up period (in seconds). It is only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600. Default value: 300.
     * @param EstimatedInstanceWarmup Instance warm-up period (in seconds). It is only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600. Default value: 300.
     */
    public void setEstimatedInstanceWarmup(Long EstimatedInstanceWarmup) {
        this.EstimatedInstanceWarmup = EstimatedInstanceWarmup;
    }

    /**
     * Get Whether to disable scale-in, which is applicable only to target tracking policies. Default value: false. Valid values:
<li>true: Target tracking policies trigger only scale-out.</li>
<li>false: Target tracking policies trigger both scale-out and scale-in.</li> 
     * @return DisableScaleIn Whether to disable scale-in, which is applicable only to target tracking policies. Default value: false. Valid values:
<li>true: Target tracking policies trigger only scale-out.</li>
<li>false: Target tracking policies trigger both scale-out and scale-in.</li>
     */
    public Boolean getDisableScaleIn() {
        return this.DisableScaleIn;
    }

    /**
     * Set Whether to disable scale-in, which is applicable only to target tracking policies. Default value: false. Valid values:
<li>true: Target tracking policies trigger only scale-out.</li>
<li>false: Target tracking policies trigger both scale-out and scale-in.</li>
     * @param DisableScaleIn Whether to disable scale-in, which is applicable only to target tracking policies. Default value: false. Valid values:
<li>true: Target tracking policies trigger only scale-out.</li>
<li>false: Target tracking policies trigger both scale-out and scale-in.</li>
     */
    public void setDisableScaleIn(Boolean DisableScaleIn) {
        this.DisableScaleIn = DisableScaleIn;
    }

    /**
     * Get This parameter is diused. Please use [CreateNotificationConfiguration](https://intl.cloud.tencent.com/document/api/377/33185?from_cn_redirect=1) instead.
Notification group ID, which is the set of user group IDs. 
     * @return NotificationUserGroupIds This parameter is diused. Please use [CreateNotificationConfiguration](https://intl.cloud.tencent.com/document/api/377/33185?from_cn_redirect=1) instead.
Notification group ID, which is the set of user group IDs.
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set This parameter is diused. Please use [CreateNotificationConfiguration](https://intl.cloud.tencent.com/document/api/377/33185?from_cn_redirect=1) instead.
Notification group ID, which is the set of user group IDs.
     * @param NotificationUserGroupIds This parameter is diused. Please use [CreateNotificationConfiguration](https://intl.cloud.tencent.com/document/api/377/33185?from_cn_redirect=1) instead.
Notification group ID, which is the set of user group IDs.
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    public CreateScalingPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScalingPolicyRequest(CreateScalingPolicyRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.ScalingPolicyName != null) {
            this.ScalingPolicyName = new String(source.ScalingPolicyName);
        }
        if (source.ScalingPolicyType != null) {
            this.ScalingPolicyType = new String(source.ScalingPolicyType);
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
        this.setParamSimple(map, prefix + "ScalingPolicyName", this.ScalingPolicyName);
        this.setParamSimple(map, prefix + "ScalingPolicyType", this.ScalingPolicyType);
        this.setParamSimple(map, prefix + "AdjustmentType", this.AdjustmentType);
        this.setParamSimple(map, prefix + "AdjustmentValue", this.AdjustmentValue);
        this.setParamSimple(map, prefix + "Cooldown", this.Cooldown);
        this.setParamObj(map, prefix + "MetricAlarm.", this.MetricAlarm);
        this.setParamSimple(map, prefix + "PredefinedMetricType", this.PredefinedMetricType);
        this.setParamSimple(map, prefix + "TargetValue", this.TargetValue);
        this.setParamSimple(map, prefix + "EstimatedInstanceWarmup", this.EstimatedInstanceWarmup);
        this.setParamSimple(map, prefix + "DisableScaleIn", this.DisableScaleIn);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);

    }
}

