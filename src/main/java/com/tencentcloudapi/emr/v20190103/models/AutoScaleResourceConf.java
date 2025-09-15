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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScaleResourceConf extends AbstractModel {

    /**
    * Configuration ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Cluster instance ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * Minimum number of instances retained for automatic scaling
    */
    @SerializedName("ScaleLowerBound")
    @Expose
    private Long ScaleLowerBound;

    /**
    * Maximum number of instances for auto scaling
    */
    @SerializedName("ScaleUpperBound")
    @Expose
    private Long ScaleUpperBound;

    /**
    * Scale-out rule type. 1: load-based scale-out rule, 2: time-based scale-out rule
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * Next scale-out time.
    */
    @SerializedName("NextTimeCanScale")
    @Expose
    private Long NextTimeCanScale;

    /**
    * Graceful scale-in switch.
    */
    @SerializedName("GraceDownFlag")
    @Expose
    private Boolean GraceDownFlag;

    /**
    * "CVM" indicates that the CVM type is used for all specifications, and "Pod" indicates that the container type is used for specifications. The default value is "CVM".
    */
    @SerializedName("HardwareType")
    @Expose
    private String HardwareType;

    /**
    * "POSTPAY" indicates the sole adoption of pay-as-you-go, and "SPOT_FIRST" indicates spot instance first, which is only supported when HardwareType is "HOST". "Pod" only supports pay-as-you-go.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * The minimum percentage of pay-as-you-go resources in scenarios with spot instance first. It is an integer.
    */
    @SerializedName("PostPayPercentMin")
    @Expose
    private Long PostPayPercentMin;

    /**
    * When resource type is preset to HOST: Supports enabling/disabling "Fallback to pod when resources are insufficient"; Default state: 0 (disabled), Toggle state: 1 (enabled).
    */
    @SerializedName("ChangeToPod")
    @Expose
    private Long ChangeToPod;

    /**
    * Scaling group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Tag.
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * Scaling group status.
    */
    @SerializedName("GroupStatus")
    @Expose
    private Long GroupStatus;

    /**
    * Parallel scaling. 0: disabled; 1: enabled.
    */
    @SerializedName("Parallel")
    @Expose
    private Long Parallel;

    /**
    * Whether MNode is supported.
    */
    @SerializedName("EnableMNode")
    @Expose
    private Long EnableMNode;

    /**
    * More scaling group settings.
    */
    @SerializedName("ExtraAdvanceAttrs")
    @Expose
    private AutoScaleGroupAdvanceAttrs ExtraAdvanceAttrs;

    /**
     * Get Configuration ID. 
     * @return Id Configuration ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Configuration ID.
     * @param Id Configuration ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Cluster instance ID. 
     * @return ClusterId Cluster instance ID.
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster instance ID.
     * @param ClusterId Cluster instance ID.
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Minimum number of instances retained for automatic scaling 
     * @return ScaleLowerBound Minimum number of instances retained for automatic scaling
     */
    public Long getScaleLowerBound() {
        return this.ScaleLowerBound;
    }

    /**
     * Set Minimum number of instances retained for automatic scaling
     * @param ScaleLowerBound Minimum number of instances retained for automatic scaling
     */
    public void setScaleLowerBound(Long ScaleLowerBound) {
        this.ScaleLowerBound = ScaleLowerBound;
    }

    /**
     * Get Maximum number of instances for auto scaling 
     * @return ScaleUpperBound Maximum number of instances for auto scaling
     */
    public Long getScaleUpperBound() {
        return this.ScaleUpperBound;
    }

    /**
     * Set Maximum number of instances for auto scaling
     * @param ScaleUpperBound Maximum number of instances for auto scaling
     */
    public void setScaleUpperBound(Long ScaleUpperBound) {
        this.ScaleUpperBound = ScaleUpperBound;
    }

    /**
     * Get Scale-out rule type. 1: load-based scale-out rule, 2: time-based scale-out rule 
     * @return StrategyType Scale-out rule type. 1: load-based scale-out rule, 2: time-based scale-out rule
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set Scale-out rule type. 1: load-based scale-out rule, 2: time-based scale-out rule
     * @param StrategyType Scale-out rule type. 1: load-based scale-out rule, 2: time-based scale-out rule
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Next scale-out time. 
     * @return NextTimeCanScale Next scale-out time.
     */
    public Long getNextTimeCanScale() {
        return this.NextTimeCanScale;
    }

    /**
     * Set Next scale-out time.
     * @param NextTimeCanScale Next scale-out time.
     */
    public void setNextTimeCanScale(Long NextTimeCanScale) {
        this.NextTimeCanScale = NextTimeCanScale;
    }

    /**
     * Get Graceful scale-in switch. 
     * @return GraceDownFlag Graceful scale-in switch.
     */
    public Boolean getGraceDownFlag() {
        return this.GraceDownFlag;
    }

    /**
     * Set Graceful scale-in switch.
     * @param GraceDownFlag Graceful scale-in switch.
     */
    public void setGraceDownFlag(Boolean GraceDownFlag) {
        this.GraceDownFlag = GraceDownFlag;
    }

    /**
     * Get "CVM" indicates that the CVM type is used for all specifications, and "Pod" indicates that the container type is used for specifications. The default value is "CVM". 
     * @return HardwareType "CVM" indicates that the CVM type is used for all specifications, and "Pod" indicates that the container type is used for specifications. The default value is "CVM".
     */
    public String getHardwareType() {
        return this.HardwareType;
    }

    /**
     * Set "CVM" indicates that the CVM type is used for all specifications, and "Pod" indicates that the container type is used for specifications. The default value is "CVM".
     * @param HardwareType "CVM" indicates that the CVM type is used for all specifications, and "Pod" indicates that the container type is used for specifications. The default value is "CVM".
     */
    public void setHardwareType(String HardwareType) {
        this.HardwareType = HardwareType;
    }

    /**
     * Get "POSTPAY" indicates the sole adoption of pay-as-you-go, and "SPOT_FIRST" indicates spot instance first, which is only supported when HardwareType is "HOST". "Pod" only supports pay-as-you-go. 
     * @return PayMode "POSTPAY" indicates the sole adoption of pay-as-you-go, and "SPOT_FIRST" indicates spot instance first, which is only supported when HardwareType is "HOST". "Pod" only supports pay-as-you-go.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set "POSTPAY" indicates the sole adoption of pay-as-you-go, and "SPOT_FIRST" indicates spot instance first, which is only supported when HardwareType is "HOST". "Pod" only supports pay-as-you-go.
     * @param PayMode "POSTPAY" indicates the sole adoption of pay-as-you-go, and "SPOT_FIRST" indicates spot instance first, which is only supported when HardwareType is "HOST". "Pod" only supports pay-as-you-go.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get The minimum percentage of pay-as-you-go resources in scenarios with spot instance first. It is an integer. 
     * @return PostPayPercentMin The minimum percentage of pay-as-you-go resources in scenarios with spot instance first. It is an integer.
     */
    public Long getPostPayPercentMin() {
        return this.PostPayPercentMin;
    }

    /**
     * Set The minimum percentage of pay-as-you-go resources in scenarios with spot instance first. It is an integer.
     * @param PostPayPercentMin The minimum percentage of pay-as-you-go resources in scenarios with spot instance first. It is an integer.
     */
    public void setPostPayPercentMin(Long PostPayPercentMin) {
        this.PostPayPercentMin = PostPayPercentMin;
    }

    /**
     * Get When resource type is preset to HOST: Supports enabling/disabling "Fallback to pod when resources are insufficient"; Default state: 0 (disabled), Toggle state: 1 (enabled). 
     * @return ChangeToPod When resource type is preset to HOST: Supports enabling/disabling "Fallback to pod when resources are insufficient"; Default state: 0 (disabled), Toggle state: 1 (enabled).
     */
    public Long getChangeToPod() {
        return this.ChangeToPod;
    }

    /**
     * Set When resource type is preset to HOST: Supports enabling/disabling "Fallback to pod when resources are insufficient"; Default state: 0 (disabled), Toggle state: 1 (enabled).
     * @param ChangeToPod When resource type is preset to HOST: Supports enabling/disabling "Fallback to pod when resources are insufficient"; Default state: 0 (disabled), Toggle state: 1 (enabled).
     */
    public void setChangeToPod(Long ChangeToPod) {
        this.ChangeToPod = ChangeToPod;
    }

    /**
     * Get Scaling group name. 
     * @return GroupName Scaling group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Scaling group name.
     * @param GroupName Scaling group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Tag. 
     * @return YarnNodeLabel Tag.
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set Tag.
     * @param YarnNodeLabel Tag.
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get Scaling group status. 
     * @return GroupStatus Scaling group status.
     */
    public Long getGroupStatus() {
        return this.GroupStatus;
    }

    /**
     * Set Scaling group status.
     * @param GroupStatus Scaling group status.
     */
    public void setGroupStatus(Long GroupStatus) {
        this.GroupStatus = GroupStatus;
    }

    /**
     * Get Parallel scaling. 0: disabled; 1: enabled. 
     * @return Parallel Parallel scaling. 0: disabled; 1: enabled.
     */
    public Long getParallel() {
        return this.Parallel;
    }

    /**
     * Set Parallel scaling. 0: disabled; 1: enabled.
     * @param Parallel Parallel scaling. 0: disabled; 1: enabled.
     */
    public void setParallel(Long Parallel) {
        this.Parallel = Parallel;
    }

    /**
     * Get Whether MNode is supported. 
     * @return EnableMNode Whether MNode is supported.
     */
    public Long getEnableMNode() {
        return this.EnableMNode;
    }

    /**
     * Set Whether MNode is supported.
     * @param EnableMNode Whether MNode is supported.
     */
    public void setEnableMNode(Long EnableMNode) {
        this.EnableMNode = EnableMNode;
    }

    /**
     * Get More scaling group settings. 
     * @return ExtraAdvanceAttrs More scaling group settings.
     */
    public AutoScaleGroupAdvanceAttrs getExtraAdvanceAttrs() {
        return this.ExtraAdvanceAttrs;
    }

    /**
     * Set More scaling group settings.
     * @param ExtraAdvanceAttrs More scaling group settings.
     */
    public void setExtraAdvanceAttrs(AutoScaleGroupAdvanceAttrs ExtraAdvanceAttrs) {
        this.ExtraAdvanceAttrs = ExtraAdvanceAttrs;
    }

    public AutoScaleResourceConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScaleResourceConf(AutoScaleResourceConf source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.ScaleLowerBound != null) {
            this.ScaleLowerBound = new Long(source.ScaleLowerBound);
        }
        if (source.ScaleUpperBound != null) {
            this.ScaleUpperBound = new Long(source.ScaleUpperBound);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.NextTimeCanScale != null) {
            this.NextTimeCanScale = new Long(source.NextTimeCanScale);
        }
        if (source.GraceDownFlag != null) {
            this.GraceDownFlag = new Boolean(source.GraceDownFlag);
        }
        if (source.HardwareType != null) {
            this.HardwareType = new String(source.HardwareType);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PostPayPercentMin != null) {
            this.PostPayPercentMin = new Long(source.PostPayPercentMin);
        }
        if (source.ChangeToPod != null) {
            this.ChangeToPod = new Long(source.ChangeToPod);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.YarnNodeLabel != null) {
            this.YarnNodeLabel = new String(source.YarnNodeLabel);
        }
        if (source.GroupStatus != null) {
            this.GroupStatus = new Long(source.GroupStatus);
        }
        if (source.Parallel != null) {
            this.Parallel = new Long(source.Parallel);
        }
        if (source.EnableMNode != null) {
            this.EnableMNode = new Long(source.EnableMNode);
        }
        if (source.ExtraAdvanceAttrs != null) {
            this.ExtraAdvanceAttrs = new AutoScaleGroupAdvanceAttrs(source.ExtraAdvanceAttrs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ScaleLowerBound", this.ScaleLowerBound);
        this.setParamSimple(map, prefix + "ScaleUpperBound", this.ScaleUpperBound);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "NextTimeCanScale", this.NextTimeCanScale);
        this.setParamSimple(map, prefix + "GraceDownFlag", this.GraceDownFlag);
        this.setParamSimple(map, prefix + "HardwareType", this.HardwareType);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PostPayPercentMin", this.PostPayPercentMin);
        this.setParamSimple(map, prefix + "ChangeToPod", this.ChangeToPod);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "YarnNodeLabel", this.YarnNodeLabel);
        this.setParamSimple(map, prefix + "GroupStatus", this.GroupStatus);
        this.setParamSimple(map, prefix + "Parallel", this.Parallel);
        this.setParamSimple(map, prefix + "EnableMNode", this.EnableMNode);
        this.setParamObj(map, prefix + "ExtraAdvanceAttrs.", this.ExtraAdvanceAttrs);

    }
}

