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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterNodePoolRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Node pool ID
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Maximum number of nodes
    */
    @SerializedName("MaxNodesNum")
    @Expose
    private Long MaxNodesNum;

    /**
    * Minimum number of nodes
    */
    @SerializedName("MinNodesNum")
    @Expose
    private Long MinNodesNum;

    /**
    * Labels
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Taints
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * Indicates whether auto scaling is enabled.
    */
    @SerializedName("EnableAutoscale")
    @Expose
    private Boolean EnableAutoscale;

    /**
    * Operating system name
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * Image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Node pool ID 
     * @return NodePoolId Node pool ID
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set Node pool ID
     * @param NodePoolId Node pool ID
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Maximum number of nodes 
     * @return MaxNodesNum Maximum number of nodes
     */
    public Long getMaxNodesNum() {
        return this.MaxNodesNum;
    }

    /**
     * Set Maximum number of nodes
     * @param MaxNodesNum Maximum number of nodes
     */
    public void setMaxNodesNum(Long MaxNodesNum) {
        this.MaxNodesNum = MaxNodesNum;
    }

    /**
     * Get Minimum number of nodes 
     * @return MinNodesNum Minimum number of nodes
     */
    public Long getMinNodesNum() {
        return this.MinNodesNum;
    }

    /**
     * Set Minimum number of nodes
     * @param MinNodesNum Minimum number of nodes
     */
    public void setMinNodesNum(Long MinNodesNum) {
        this.MinNodesNum = MinNodesNum;
    }

    /**
     * Get Labels 
     * @return Labels Labels
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Labels
     * @param Labels Labels
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Taints 
     * @return Taints Taints
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set Taints
     * @param Taints Taints
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get Indicates whether auto scaling is enabled. 
     * @return EnableAutoscale Indicates whether auto scaling is enabled.
     */
    public Boolean getEnableAutoscale() {
        return this.EnableAutoscale;
    }

    /**
     * Set Indicates whether auto scaling is enabled.
     * @param EnableAutoscale Indicates whether auto scaling is enabled.
     */
    public void setEnableAutoscale(Boolean EnableAutoscale) {
        this.EnableAutoscale = EnableAutoscale;
    }

    /**
     * Get Operating system name 
     * @return OsName Operating system name
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set Operating system name
     * @param OsName Operating system name
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get Image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value) 
     * @return OsCustomizeType Image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set Image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
     * @param OsCustomizeType Image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MaxNodesNum", this.MaxNodesNum);
        this.setParamSimple(map, prefix + "MinNodesNum", this.MinNodesNum);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamSimple(map, prefix + "EnableAutoscale", this.EnableAutoscale);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);

    }
}

