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
    * <p>Configuration ID.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * <p>Minimum number of reserved instances for auto scaling.</p>
    */
    @SerializedName("ScaleLowerBound")
    @Expose
    private Long ScaleLowerBound;

    /**
    * <p>Maximum number of instances for auto scaling.</p>
    */
    @SerializedName("ScaleUpperBound")
    @Expose
    private Long ScaleUpperBound;

    /**
    * <p>Scale-out rule type. Valid values: 1 (scale-out rule by load metrics) and 2 (scale-out rule by time).</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * <p>Next scale-out time.</p>
    */
    @SerializedName("NextTimeCanScale")
    @Expose
    private Long NextTimeCanScale;

    /**
    * <p>Graceful scale-in switch.</p>
    */
    @SerializedName("GraceDownFlag")
    @Expose
    private Boolean GraceDownFlag;

    /**
    * <p>&quot;CVM&quot; indicates that all specifications use CVM-related types, and &quot;POD&quot; indicates that specifications use container-related types. The default value is &quot;CVM&quot;.</p>
    */
    @SerializedName("HardwareType")
    @Expose
    private String HardwareType;

    /**
    * <p>&quot;POSTPAY&quot; indicates that only pay-as-you-go billing is used. &quot;SPOT_FIRST&quot; indicates that spot instances are preferred, which is supported only when HardwareType is &quot;HOST&quot;. &quot;POD&quot; only supports pure pay-as-you-go billing.</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>Minimum percentage of pay-as-you-go resources in the scenario where spot instances are preferred. It is an integer.</p>
    */
    @SerializedName("PostPayPercentMin")
    @Expose
    private Long PostPayPercentMin;

    /**
    * <p>When the preset resource type is HOST, you can select &quot;switch to POD when resources are insufficient&quot; or clear the selection. 0 indicates that it is not selected by default (0), and 1 indicates that it is selected.</p>
    */
    @SerializedName("ChangeToPod")
    @Expose
    private Long ChangeToPod;

    /**
    * <p>Scaling group name.</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * <p>Corresponding computing group.</p>
    */
    @SerializedName("WarehouseName")
    @Expose
    private String WarehouseName;

    /**
    * <p>Scaling group status.</p>
    */
    @SerializedName("GroupStatus")
    @Expose
    private Long GroupStatus;

    /**
    * <p>Parallel scaling. Valid values: 0 (disabled) and 1 (enabled).</p>
    */
    @SerializedName("Parallel")
    @Expose
    private Long Parallel;

    /**
    * <p>Whether MNode is supported.</p>
    */
    @SerializedName("EnableMNode")
    @Expose
    private Long EnableMNode;

    /**
    * <p>More scaling group settings.</p>
    */
    @SerializedName("ExtraAdvanceAttrs")
    @Expose
    private AutoScaleGroupAdvanceAttrs ExtraAdvanceAttrs;

    /**
    * <p>Custom hostname.</p>
    */
    @SerializedName("CustomNodeName")
    @Expose
    private String CustomNodeName;

    /**
     * Get <p>Configuration ID.</p> 
     * @return Id <p>Configuration ID.</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Configuration ID.</p>
     * @param Id <p>Configuration ID.</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Minimum number of reserved instances for auto scaling.</p> 
     * @return ScaleLowerBound <p>Minimum number of reserved instances for auto scaling.</p>
     */
    public Long getScaleLowerBound() {
        return this.ScaleLowerBound;
    }

    /**
     * Set <p>Minimum number of reserved instances for auto scaling.</p>
     * @param ScaleLowerBound <p>Minimum number of reserved instances for auto scaling.</p>
     */
    public void setScaleLowerBound(Long ScaleLowerBound) {
        this.ScaleLowerBound = ScaleLowerBound;
    }

    /**
     * Get <p>Maximum number of instances for auto scaling.</p> 
     * @return ScaleUpperBound <p>Maximum number of instances for auto scaling.</p>
     */
    public Long getScaleUpperBound() {
        return this.ScaleUpperBound;
    }

    /**
     * Set <p>Maximum number of instances for auto scaling.</p>
     * @param ScaleUpperBound <p>Maximum number of instances for auto scaling.</p>
     */
    public void setScaleUpperBound(Long ScaleUpperBound) {
        this.ScaleUpperBound = ScaleUpperBound;
    }

    /**
     * Get <p>Scale-out rule type. Valid values: 1 (scale-out rule by load metrics) and 2 (scale-out rule by time).</p> 
     * @return StrategyType <p>Scale-out rule type. Valid values: 1 (scale-out rule by load metrics) and 2 (scale-out rule by time).</p>
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>Scale-out rule type. Valid values: 1 (scale-out rule by load metrics) and 2 (scale-out rule by time).</p>
     * @param StrategyType <p>Scale-out rule type. Valid values: 1 (scale-out rule by load metrics) and 2 (scale-out rule by time).</p>
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>Next scale-out time.</p> 
     * @return NextTimeCanScale <p>Next scale-out time.</p>
     */
    public Long getNextTimeCanScale() {
        return this.NextTimeCanScale;
    }

    /**
     * Set <p>Next scale-out time.</p>
     * @param NextTimeCanScale <p>Next scale-out time.</p>
     */
    public void setNextTimeCanScale(Long NextTimeCanScale) {
        this.NextTimeCanScale = NextTimeCanScale;
    }

    /**
     * Get <p>Graceful scale-in switch.</p> 
     * @return GraceDownFlag <p>Graceful scale-in switch.</p>
     */
    public Boolean getGraceDownFlag() {
        return this.GraceDownFlag;
    }

    /**
     * Set <p>Graceful scale-in switch.</p>
     * @param GraceDownFlag <p>Graceful scale-in switch.</p>
     */
    public void setGraceDownFlag(Boolean GraceDownFlag) {
        this.GraceDownFlag = GraceDownFlag;
    }

    /**
     * Get <p>&quot;CVM&quot; indicates that all specifications use CVM-related types, and &quot;POD&quot; indicates that specifications use container-related types. The default value is &quot;CVM&quot;.</p> 
     * @return HardwareType <p>&quot;CVM&quot; indicates that all specifications use CVM-related types, and &quot;POD&quot; indicates that specifications use container-related types. The default value is &quot;CVM&quot;.</p>
     */
    public String getHardwareType() {
        return this.HardwareType;
    }

    /**
     * Set <p>&quot;CVM&quot; indicates that all specifications use CVM-related types, and &quot;POD&quot; indicates that specifications use container-related types. The default value is &quot;CVM&quot;.</p>
     * @param HardwareType <p>&quot;CVM&quot; indicates that all specifications use CVM-related types, and &quot;POD&quot; indicates that specifications use container-related types. The default value is &quot;CVM&quot;.</p>
     */
    public void setHardwareType(String HardwareType) {
        this.HardwareType = HardwareType;
    }

    /**
     * Get <p>&quot;POSTPAY&quot; indicates that only pay-as-you-go billing is used. &quot;SPOT_FIRST&quot; indicates that spot instances are preferred, which is supported only when HardwareType is &quot;HOST&quot;. &quot;POD&quot; only supports pure pay-as-you-go billing.</p> 
     * @return PayMode <p>&quot;POSTPAY&quot; indicates that only pay-as-you-go billing is used. &quot;SPOT_FIRST&quot; indicates that spot instances are preferred, which is supported only when HardwareType is &quot;HOST&quot;. &quot;POD&quot; only supports pure pay-as-you-go billing.</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>&quot;POSTPAY&quot; indicates that only pay-as-you-go billing is used. &quot;SPOT_FIRST&quot; indicates that spot instances are preferred, which is supported only when HardwareType is &quot;HOST&quot;. &quot;POD&quot; only supports pure pay-as-you-go billing.</p>
     * @param PayMode <p>&quot;POSTPAY&quot; indicates that only pay-as-you-go billing is used. &quot;SPOT_FIRST&quot; indicates that spot instances are preferred, which is supported only when HardwareType is &quot;HOST&quot;. &quot;POD&quot; only supports pure pay-as-you-go billing.</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Minimum percentage of pay-as-you-go resources in the scenario where spot instances are preferred. It is an integer.</p> 
     * @return PostPayPercentMin <p>Minimum percentage of pay-as-you-go resources in the scenario where spot instances are preferred. It is an integer.</p>
     */
    public Long getPostPayPercentMin() {
        return this.PostPayPercentMin;
    }

    /**
     * Set <p>Minimum percentage of pay-as-you-go resources in the scenario where spot instances are preferred. It is an integer.</p>
     * @param PostPayPercentMin <p>Minimum percentage of pay-as-you-go resources in the scenario where spot instances are preferred. It is an integer.</p>
     */
    public void setPostPayPercentMin(Long PostPayPercentMin) {
        this.PostPayPercentMin = PostPayPercentMin;
    }

    /**
     * Get <p>When the preset resource type is HOST, you can select &quot;switch to POD when resources are insufficient&quot; or clear the selection. 0 indicates that it is not selected by default (0), and 1 indicates that it is selected.</p> 
     * @return ChangeToPod <p>When the preset resource type is HOST, you can select &quot;switch to POD when resources are insufficient&quot; or clear the selection. 0 indicates that it is not selected by default (0), and 1 indicates that it is selected.</p>
     */
    public Long getChangeToPod() {
        return this.ChangeToPod;
    }

    /**
     * Set <p>When the preset resource type is HOST, you can select &quot;switch to POD when resources are insufficient&quot; or clear the selection. 0 indicates that it is not selected by default (0), and 1 indicates that it is selected.</p>
     * @param ChangeToPod <p>When the preset resource type is HOST, you can select &quot;switch to POD when resources are insufficient&quot; or clear the selection. 0 indicates that it is not selected by default (0), and 1 indicates that it is selected.</p>
     */
    public void setChangeToPod(Long ChangeToPod) {
        this.ChangeToPod = ChangeToPod;
    }

    /**
     * Get <p>Scaling group name.</p> 
     * @return GroupName <p>Scaling group name.</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>Scaling group name.</p>
     * @param GroupName <p>Scaling group name.</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>Tag.</p> 
     * @return YarnNodeLabel <p>Tag.</p>
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set <p>Tag.</p>
     * @param YarnNodeLabel <p>Tag.</p>
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get <p>Corresponding computing group.</p> 
     * @return WarehouseName <p>Corresponding computing group.</p>
     */
    public String getWarehouseName() {
        return this.WarehouseName;
    }

    /**
     * Set <p>Corresponding computing group.</p>
     * @param WarehouseName <p>Corresponding computing group.</p>
     */
    public void setWarehouseName(String WarehouseName) {
        this.WarehouseName = WarehouseName;
    }

    /**
     * Get <p>Scaling group status.</p> 
     * @return GroupStatus <p>Scaling group status.</p>
     */
    public Long getGroupStatus() {
        return this.GroupStatus;
    }

    /**
     * Set <p>Scaling group status.</p>
     * @param GroupStatus <p>Scaling group status.</p>
     */
    public void setGroupStatus(Long GroupStatus) {
        this.GroupStatus = GroupStatus;
    }

    /**
     * Get <p>Parallel scaling. Valid values: 0 (disabled) and 1 (enabled).</p> 
     * @return Parallel <p>Parallel scaling. Valid values: 0 (disabled) and 1 (enabled).</p>
     */
    public Long getParallel() {
        return this.Parallel;
    }

    /**
     * Set <p>Parallel scaling. Valid values: 0 (disabled) and 1 (enabled).</p>
     * @param Parallel <p>Parallel scaling. Valid values: 0 (disabled) and 1 (enabled).</p>
     */
    public void setParallel(Long Parallel) {
        this.Parallel = Parallel;
    }

    /**
     * Get <p>Whether MNode is supported.</p> 
     * @return EnableMNode <p>Whether MNode is supported.</p>
     */
    public Long getEnableMNode() {
        return this.EnableMNode;
    }

    /**
     * Set <p>Whether MNode is supported.</p>
     * @param EnableMNode <p>Whether MNode is supported.</p>
     */
    public void setEnableMNode(Long EnableMNode) {
        this.EnableMNode = EnableMNode;
    }

    /**
     * Get <p>More scaling group settings.</p> 
     * @return ExtraAdvanceAttrs <p>More scaling group settings.</p>
     */
    public AutoScaleGroupAdvanceAttrs getExtraAdvanceAttrs() {
        return this.ExtraAdvanceAttrs;
    }

    /**
     * Set <p>More scaling group settings.</p>
     * @param ExtraAdvanceAttrs <p>More scaling group settings.</p>
     */
    public void setExtraAdvanceAttrs(AutoScaleGroupAdvanceAttrs ExtraAdvanceAttrs) {
        this.ExtraAdvanceAttrs = ExtraAdvanceAttrs;
    }

    /**
     * Get <p>Custom hostname.</p> 
     * @return CustomNodeName <p>Custom hostname.</p>
     */
    public String getCustomNodeName() {
        return this.CustomNodeName;
    }

    /**
     * Set <p>Custom hostname.</p>
     * @param CustomNodeName <p>Custom hostname.</p>
     */
    public void setCustomNodeName(String CustomNodeName) {
        this.CustomNodeName = CustomNodeName;
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
        if (source.WarehouseName != null) {
            this.WarehouseName = new String(source.WarehouseName);
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
        if (source.CustomNodeName != null) {
            this.CustomNodeName = new String(source.CustomNodeName);
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
        this.setParamSimple(map, prefix + "WarehouseName", this.WarehouseName);
        this.setParamSimple(map, prefix + "GroupStatus", this.GroupStatus);
        this.setParamSimple(map, prefix + "Parallel", this.Parallel);
        this.setParamSimple(map, prefix + "EnableMNode", this.EnableMNode);
        this.setParamObj(map, prefix + "ExtraAdvanceAttrs.", this.ExtraAdvanceAttrs);
        this.setParamSimple(map, prefix + "CustomNodeName", this.CustomNodeName);

    }
}

