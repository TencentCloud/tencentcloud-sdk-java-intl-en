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

public class CreateScalingPolicyRequest extends AbstractModel {

    /**
    * Auto scaling group ID.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Alarm trigger policy name.
    */
    @SerializedName("ScalingPolicyName")
    @Expose
    private String ScalingPolicyName;

    /**
    * Scaling policy type. Valid values: <br><li>`SIMPLE` (default): A simple policy</li><li>`TARGET_TRACKING`: A target tracking policy</li>.
    */
    @SerializedName("ScalingPolicyType")
    @Expose
    private String ScalingPolicyType;

    /**
    * The method to adjust the desired capacity after the alarm is triggered. It’s only available when `ScalingPolicyType` is `Simple`. Valid values: <br><li>`CHANGE_IN_CAPACITY`: Increase or decrease the desired capacity </li><li>`EXACT_CAPACITY`: Adjust to the specified desired capacity </li> <li>`PERCENT_CHANGE_IN_CAPACITY`: Adjust the desired capacity by percentage </li>
    */
    @SerializedName("AdjustmentType")
    @Expose
    private String AdjustmentType;

    /**
    * Specifies how to adjust the number of desired capacity when the alarm is triggered. It’s only available when `ScalingPolicyType` is `Simple`. Values: <br><li>`AdjustmentType`=`CHANGE_IN_CAPACITY`: Number of instances to add (positive number) or remove (negative number). </li> <li>`AdjustmentType`=`EXACT_CAPACITY`: Set the desired capacity to the specified number. It must be ≥ 0. </li> <li>`AdjustmentType`=`PERCENT_CHANGE_IN_CAPACITY`: Percentage of instance number. Add instances (positive value) or remove instances (negative value) accordingly.
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
    * Alarm monitoring metric. It’s only available when `ScalingPolicyType` is `Simple`.
    */
    @SerializedName("MetricAlarm")
    @Expose
    private MetricAlarm MetricAlarm;

    /**
    * Preset monitoring item. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>ASG_AVG_CPU_UTILIZATION: Average CPU utilization</li><li>ASG_AVG_LAN_TRAFFIC_OUT: Average private bandwidth out</li><li>ASG_AVG_LAN_TRAFFIC_IN: Average private bandwidth in</li><li>ASG_AVG_WAN_TRAFFIC_OUT: Average public bandwidth out</li><li>ASG_AVG_WAN_TRAFFIC_IN: Average public bandwidth in</li>
    */
    @SerializedName("PredefinedMetricType")
    @Expose
    private String PredefinedMetricType;

    /**
    * Target value. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value ranges: <br><li>`ASG_AVG_CPU_UTILIZATION` (in %): [1, 100)</li><li>`ASG_AVG_LAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_LAN_TRAFFIC_IN` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_IN` (in Mbps): >0</li>
    */
    @SerializedName("TargetValue")
    @Expose
    private Long TargetValue;

    /**
    * Instance warm-up period (in seconds). It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600. Default value: 300.
    */
    @SerializedName("EstimatedInstanceWarmup")
    @Expose
    private Long EstimatedInstanceWarmup;

    /**
    * Whether to disable scale-in. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>`true`: Do not scale in </li><li>`false` (default): Both scale-out and scale-in can be triggered.</li>
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
     * Get Scaling policy type. Valid values: <br><li>`SIMPLE` (default): A simple policy</li><li>`TARGET_TRACKING`: A target tracking policy</li>. 
     * @return ScalingPolicyType Scaling policy type. Valid values: <br><li>`SIMPLE` (default): A simple policy</li><li>`TARGET_TRACKING`: A target tracking policy</li>.
     */
    public String getScalingPolicyType() {
        return this.ScalingPolicyType;
    }

    /**
     * Set Scaling policy type. Valid values: <br><li>`SIMPLE` (default): A simple policy</li><li>`TARGET_TRACKING`: A target tracking policy</li>.
     * @param ScalingPolicyType Scaling policy type. Valid values: <br><li>`SIMPLE` (default): A simple policy</li><li>`TARGET_TRACKING`: A target tracking policy</li>.
     */
    public void setScalingPolicyType(String ScalingPolicyType) {
        this.ScalingPolicyType = ScalingPolicyType;
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
     * Get Specifies how to adjust the number of desired capacity when the alarm is triggered. It’s only available when `ScalingPolicyType` is `Simple`. Values: <br><li>`AdjustmentType`=`CHANGE_IN_CAPACITY`: Number of instances to add (positive number) or remove (negative number). </li> <li>`AdjustmentType`=`EXACT_CAPACITY`: Set the desired capacity to the specified number. It must be ≥ 0. </li> <li>`AdjustmentType`=`PERCENT_CHANGE_IN_CAPACITY`: Percentage of instance number. Add instances (positive value) or remove instances (negative value) accordingly. 
     * @return AdjustmentValue Specifies how to adjust the number of desired capacity when the alarm is triggered. It’s only available when `ScalingPolicyType` is `Simple`. Values: <br><li>`AdjustmentType`=`CHANGE_IN_CAPACITY`: Number of instances to add (positive number) or remove (negative number). </li> <li>`AdjustmentType`=`EXACT_CAPACITY`: Set the desired capacity to the specified number. It must be ≥ 0. </li> <li>`AdjustmentType`=`PERCENT_CHANGE_IN_CAPACITY`: Percentage of instance number. Add instances (positive value) or remove instances (negative value) accordingly.
     */
    public Long getAdjustmentValue() {
        return this.AdjustmentValue;
    }

    /**
     * Set Specifies how to adjust the number of desired capacity when the alarm is triggered. It’s only available when `ScalingPolicyType` is `Simple`. Values: <br><li>`AdjustmentType`=`CHANGE_IN_CAPACITY`: Number of instances to add (positive number) or remove (negative number). </li> <li>`AdjustmentType`=`EXACT_CAPACITY`: Set the desired capacity to the specified number. It must be ≥ 0. </li> <li>`AdjustmentType`=`PERCENT_CHANGE_IN_CAPACITY`: Percentage of instance number. Add instances (positive value) or remove instances (negative value) accordingly.
     * @param AdjustmentValue Specifies how to adjust the number of desired capacity when the alarm is triggered. It’s only available when `ScalingPolicyType` is `Simple`. Values: <br><li>`AdjustmentType`=`CHANGE_IN_CAPACITY`: Number of instances to add (positive number) or remove (negative number). </li> <li>`AdjustmentType`=`EXACT_CAPACITY`: Set the desired capacity to the specified number. It must be ≥ 0. </li> <li>`AdjustmentType`=`PERCENT_CHANGE_IN_CAPACITY`: Percentage of instance number. Add instances (positive value) or remove instances (negative value) accordingly.
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
     * Get Alarm monitoring metric. It’s only available when `ScalingPolicyType` is `Simple`. 
     * @return MetricAlarm Alarm monitoring metric. It’s only available when `ScalingPolicyType` is `Simple`.
     */
    public MetricAlarm getMetricAlarm() {
        return this.MetricAlarm;
    }

    /**
     * Set Alarm monitoring metric. It’s only available when `ScalingPolicyType` is `Simple`.
     * @param MetricAlarm Alarm monitoring metric. It’s only available when `ScalingPolicyType` is `Simple`.
     */
    public void setMetricAlarm(MetricAlarm MetricAlarm) {
        this.MetricAlarm = MetricAlarm;
    }

    /**
     * Get Preset monitoring item. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>ASG_AVG_CPU_UTILIZATION: Average CPU utilization</li><li>ASG_AVG_LAN_TRAFFIC_OUT: Average private bandwidth out</li><li>ASG_AVG_LAN_TRAFFIC_IN: Average private bandwidth in</li><li>ASG_AVG_WAN_TRAFFIC_OUT: Average public bandwidth out</li><li>ASG_AVG_WAN_TRAFFIC_IN: Average public bandwidth in</li> 
     * @return PredefinedMetricType Preset monitoring item. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>ASG_AVG_CPU_UTILIZATION: Average CPU utilization</li><li>ASG_AVG_LAN_TRAFFIC_OUT: Average private bandwidth out</li><li>ASG_AVG_LAN_TRAFFIC_IN: Average private bandwidth in</li><li>ASG_AVG_WAN_TRAFFIC_OUT: Average public bandwidth out</li><li>ASG_AVG_WAN_TRAFFIC_IN: Average public bandwidth in</li>
     */
    public String getPredefinedMetricType() {
        return this.PredefinedMetricType;
    }

    /**
     * Set Preset monitoring item. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>ASG_AVG_CPU_UTILIZATION: Average CPU utilization</li><li>ASG_AVG_LAN_TRAFFIC_OUT: Average private bandwidth out</li><li>ASG_AVG_LAN_TRAFFIC_IN: Average private bandwidth in</li><li>ASG_AVG_WAN_TRAFFIC_OUT: Average public bandwidth out</li><li>ASG_AVG_WAN_TRAFFIC_IN: Average public bandwidth in</li>
     * @param PredefinedMetricType Preset monitoring item. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>ASG_AVG_CPU_UTILIZATION: Average CPU utilization</li><li>ASG_AVG_LAN_TRAFFIC_OUT: Average private bandwidth out</li><li>ASG_AVG_LAN_TRAFFIC_IN: Average private bandwidth in</li><li>ASG_AVG_WAN_TRAFFIC_OUT: Average public bandwidth out</li><li>ASG_AVG_WAN_TRAFFIC_IN: Average public bandwidth in</li>
     */
    public void setPredefinedMetricType(String PredefinedMetricType) {
        this.PredefinedMetricType = PredefinedMetricType;
    }

    /**
     * Get Target value. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value ranges: <br><li>`ASG_AVG_CPU_UTILIZATION` (in %): [1, 100)</li><li>`ASG_AVG_LAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_LAN_TRAFFIC_IN` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_IN` (in Mbps): >0</li> 
     * @return TargetValue Target value. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value ranges: <br><li>`ASG_AVG_CPU_UTILIZATION` (in %): [1, 100)</li><li>`ASG_AVG_LAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_LAN_TRAFFIC_IN` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_IN` (in Mbps): >0</li>
     */
    public Long getTargetValue() {
        return this.TargetValue;
    }

    /**
     * Set Target value. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value ranges: <br><li>`ASG_AVG_CPU_UTILIZATION` (in %): [1, 100)</li><li>`ASG_AVG_LAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_LAN_TRAFFIC_IN` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_IN` (in Mbps): >0</li>
     * @param TargetValue Target value. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value ranges: <br><li>`ASG_AVG_CPU_UTILIZATION` (in %): [1, 100)</li><li>`ASG_AVG_LAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_LAN_TRAFFIC_IN` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_OUT` (in Mbps): >0</li><li>`ASG_AVG_WAN_TRAFFIC_IN` (in Mbps): >0</li>
     */
    public void setTargetValue(Long TargetValue) {
        this.TargetValue = TargetValue;
    }

    /**
     * Get Instance warm-up period (in seconds). It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600. Default value: 300. 
     * @return EstimatedInstanceWarmup Instance warm-up period (in seconds). It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600. Default value: 300.
     */
    public Long getEstimatedInstanceWarmup() {
        return this.EstimatedInstanceWarmup;
    }

    /**
     * Set Instance warm-up period (in seconds). It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600. Default value: 300.
     * @param EstimatedInstanceWarmup Instance warm-up period (in seconds). It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Value range: 0-3600. Default value: 300.
     */
    public void setEstimatedInstanceWarmup(Long EstimatedInstanceWarmup) {
        this.EstimatedInstanceWarmup = EstimatedInstanceWarmup;
    }

    /**
     * Get Whether to disable scale-in. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>`true`: Do not scale in </li><li>`false` (default): Both scale-out and scale-in can be triggered.</li> 
     * @return DisableScaleIn Whether to disable scale-in. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>`true`: Do not scale in </li><li>`false` (default): Both scale-out and scale-in can be triggered.</li>
     */
    public Boolean getDisableScaleIn() {
        return this.DisableScaleIn;
    }

    /**
     * Set Whether to disable scale-in. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>`true`: Do not scale in </li><li>`false` (default): Both scale-out and scale-in can be triggered.</li>
     * @param DisableScaleIn Whether to disable scale-in. It’s only available when `ScalingPolicyType` is `TARGET_TRACKING`. Valid values: <br><li>`true`: Do not scale in </li><li>`false` (default): Both scale-out and scale-in can be triggered.</li>
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

