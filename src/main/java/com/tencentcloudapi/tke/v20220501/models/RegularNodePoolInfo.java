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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegularNodePoolInfo extends AbstractModel {

    /**
    * LaunchConfigurationId configuration
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * Auto-scaling group ID
    */
    @SerializedName("AutoscalingGroupId")
    @Expose
    private String AutoscalingGroupId;

    /**
    * NodeCountSummary node list
    */
    @SerializedName("NodeCountSummary")
    @Expose
    private NodeCountSummary NodeCountSummary;

    /**
    * Status information
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("AutoscalingGroupStatus")
    @Expose
    private String AutoscalingGroupStatus;

    /**
    * Maximum number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("MaxNodesNum")
    @Expose
    private Long MaxNodesNum;

    /**
    * Minimum number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("MinNodesNum")
    @Expose
    private Long MinNodesNum;

    /**
    * Desired number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("DesiredNodesNum")
    @Expose
    private Long DesiredNodesNum;

    /**
    * Node pool osName
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("NodePoolOs")
    @Expose
    private String NodePoolOs;

    /**
    * Node configuration
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
     * Get LaunchConfigurationId configuration 
     * @return LaunchConfigurationId LaunchConfigurationId configuration
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set LaunchConfigurationId configuration
     * @param LaunchConfigurationId LaunchConfigurationId configuration
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get Auto-scaling group ID 
     * @return AutoscalingGroupId Auto-scaling group ID
     */
    public String getAutoscalingGroupId() {
        return this.AutoscalingGroupId;
    }

    /**
     * Set Auto-scaling group ID
     * @param AutoscalingGroupId Auto-scaling group ID
     */
    public void setAutoscalingGroupId(String AutoscalingGroupId) {
        this.AutoscalingGroupId = AutoscalingGroupId;
    }

    /**
     * Get NodeCountSummary node list 
     * @return NodeCountSummary NodeCountSummary node list
     */
    public NodeCountSummary getNodeCountSummary() {
        return this.NodeCountSummary;
    }

    /**
     * Set NodeCountSummary node list
     * @param NodeCountSummary NodeCountSummary node list
     */
    public void setNodeCountSummary(NodeCountSummary NodeCountSummary) {
        this.NodeCountSummary = NodeCountSummary;
    }

    /**
     * Get Status information
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return AutoscalingGroupStatus Status information
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getAutoscalingGroupStatus() {
        return this.AutoscalingGroupStatus;
    }

    /**
     * Set Status information
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param AutoscalingGroupStatus Status information
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setAutoscalingGroupStatus(String AutoscalingGroupStatus) {
        this.AutoscalingGroupStatus = AutoscalingGroupStatus;
    }

    /**
     * Get Maximum number of nodes
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return MaxNodesNum Maximum number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getMaxNodesNum() {
        return this.MaxNodesNum;
    }

    /**
     * Set Maximum number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param MaxNodesNum Maximum number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setMaxNodesNum(Long MaxNodesNum) {
        this.MaxNodesNum = MaxNodesNum;
    }

    /**
     * Get Minimum number of nodes
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return MinNodesNum Minimum number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getMinNodesNum() {
        return this.MinNodesNum;
    }

    /**
     * Set Minimum number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param MinNodesNum Minimum number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setMinNodesNum(Long MinNodesNum) {
        this.MinNodesNum = MinNodesNum;
    }

    /**
     * Get Desired number of nodes
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return DesiredNodesNum Desired number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getDesiredNodesNum() {
        return this.DesiredNodesNum;
    }

    /**
     * Set Desired number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param DesiredNodesNum Desired number of nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setDesiredNodesNum(Long DesiredNodesNum) {
        this.DesiredNodesNum = DesiredNodesNum;
    }

    /**
     * Get Node pool osName
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return NodePoolOs Node pool osName
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getNodePoolOs() {
        return this.NodePoolOs;
    }

    /**
     * Set Node pool osName
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param NodePoolOs Node pool osName
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setNodePoolOs(String NodePoolOs) {
        this.NodePoolOs = NodePoolOs;
    }

    /**
     * Get Node configuration
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return InstanceAdvancedSettings Node configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set Node configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param InstanceAdvancedSettings Node configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    public RegularNodePoolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegularNodePoolInfo(RegularNodePoolInfo source) {
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.AutoscalingGroupId != null) {
            this.AutoscalingGroupId = new String(source.AutoscalingGroupId);
        }
        if (source.NodeCountSummary != null) {
            this.NodeCountSummary = new NodeCountSummary(source.NodeCountSummary);
        }
        if (source.AutoscalingGroupStatus != null) {
            this.AutoscalingGroupStatus = new String(source.AutoscalingGroupStatus);
        }
        if (source.MaxNodesNum != null) {
            this.MaxNodesNum = new Long(source.MaxNodesNum);
        }
        if (source.MinNodesNum != null) {
            this.MinNodesNum = new Long(source.MinNodesNum);
        }
        if (source.DesiredNodesNum != null) {
            this.DesiredNodesNum = new Long(source.DesiredNodesNum);
        }
        if (source.NodePoolOs != null) {
            this.NodePoolOs = new String(source.NodePoolOs);
        }
        if (source.InstanceAdvancedSettings != null) {
            this.InstanceAdvancedSettings = new InstanceAdvancedSettings(source.InstanceAdvancedSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "AutoscalingGroupId", this.AutoscalingGroupId);
        this.setParamObj(map, prefix + "NodeCountSummary.", this.NodeCountSummary);
        this.setParamSimple(map, prefix + "AutoscalingGroupStatus", this.AutoscalingGroupStatus);
        this.setParamSimple(map, prefix + "MaxNodesNum", this.MaxNodesNum);
        this.setParamSimple(map, prefix + "MinNodesNum", this.MinNodesNum);
        this.setParamSimple(map, prefix + "DesiredNodesNum", this.DesiredNodesNum);
        this.setParamSimple(map, prefix + "NodePoolOs", this.NodePoolOs);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);

    }
}

