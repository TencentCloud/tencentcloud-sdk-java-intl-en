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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComputeEnvResponse extends AbstractModel{

    /**
    * Compute environment ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * Compute environment name
    */
    @SerializedName("EnvName")
    @Expose
    private String EnvName;

    /**
    * Location information
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Compute environment creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * List of compute nodes
    */
    @SerializedName("ComputeNodeSet")
    @Expose
    private ComputeNode [] ComputeNodeSet;

    /**
    * Compute node statistical metrics
    */
    @SerializedName("ComputeNodeMetrics")
    @Expose
    private ComputeNodeMetrics ComputeNodeMetrics;

    /**
    * Number of desired compute nodes
    */
    @SerializedName("DesiredComputeNodeCount")
    @Expose
    private Long DesiredComputeNodeCount;

    /**
    * Compute environment type
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * Compute environment resource type. Valid values: CVM, CPM (Bare Metal)
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Next action
    */
    @SerializedName("NextAction")
    @Expose
    private String NextAction;

    /**
    * Number of compute nodes added to the compute environment by the user
    */
    @SerializedName("AttachedComputeNodeCount")
    @Expose
    private Long AttachedComputeNodeCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Compute environment ID 
     * @return EnvId Compute environment ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Compute environment ID
     * @param EnvId Compute environment ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get Compute environment name 
     * @return EnvName Compute environment name
     */
    public String getEnvName() {
        return this.EnvName;
    }

    /**
     * Set Compute environment name
     * @param EnvName Compute environment name
     */
    public void setEnvName(String EnvName) {
        this.EnvName = EnvName;
    }

    /**
     * Get Location information 
     * @return Placement Location information
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Location information
     * @param Placement Location information
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Compute environment creation time 
     * @return CreateTime Compute environment creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Compute environment creation time
     * @param CreateTime Compute environment creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get List of compute nodes 
     * @return ComputeNodeSet List of compute nodes
     */
    public ComputeNode [] getComputeNodeSet() {
        return this.ComputeNodeSet;
    }

    /**
     * Set List of compute nodes
     * @param ComputeNodeSet List of compute nodes
     */
    public void setComputeNodeSet(ComputeNode [] ComputeNodeSet) {
        this.ComputeNodeSet = ComputeNodeSet;
    }

    /**
     * Get Compute node statistical metrics 
     * @return ComputeNodeMetrics Compute node statistical metrics
     */
    public ComputeNodeMetrics getComputeNodeMetrics() {
        return this.ComputeNodeMetrics;
    }

    /**
     * Set Compute node statistical metrics
     * @param ComputeNodeMetrics Compute node statistical metrics
     */
    public void setComputeNodeMetrics(ComputeNodeMetrics ComputeNodeMetrics) {
        this.ComputeNodeMetrics = ComputeNodeMetrics;
    }

    /**
     * Get Number of desired compute nodes 
     * @return DesiredComputeNodeCount Number of desired compute nodes
     */
    public Long getDesiredComputeNodeCount() {
        return this.DesiredComputeNodeCount;
    }

    /**
     * Set Number of desired compute nodes
     * @param DesiredComputeNodeCount Number of desired compute nodes
     */
    public void setDesiredComputeNodeCount(Long DesiredComputeNodeCount) {
        this.DesiredComputeNodeCount = DesiredComputeNodeCount;
    }

    /**
     * Get Compute environment type 
     * @return EnvType Compute environment type
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set Compute environment type
     * @param EnvType Compute environment type
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get Compute environment resource type. Valid values: CVM, CPM (Bare Metal) 
     * @return ResourceType Compute environment resource type. Valid values: CVM, CPM (Bare Metal)
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Compute environment resource type. Valid values: CVM, CPM (Bare Metal)
     * @param ResourceType Compute environment resource type. Valid values: CVM, CPM (Bare Metal)
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Next action 
     * @return NextAction Next action
     */
    public String getNextAction() {
        return this.NextAction;
    }

    /**
     * Set Next action
     * @param NextAction Next action
     */
    public void setNextAction(String NextAction) {
        this.NextAction = NextAction;
    }

    /**
     * Get Number of compute nodes added to the compute environment by the user 
     * @return AttachedComputeNodeCount Number of compute nodes added to the compute environment by the user
     */
    public Long getAttachedComputeNodeCount() {
        return this.AttachedComputeNodeCount;
    }

    /**
     * Set Number of compute nodes added to the compute environment by the user
     * @param AttachedComputeNodeCount Number of compute nodes added to the compute environment by the user
     */
    public void setAttachedComputeNodeCount(Long AttachedComputeNodeCount) {
        this.AttachedComputeNodeCount = AttachedComputeNodeCount;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "EnvName", this.EnvName);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "ComputeNodeSet.", this.ComputeNodeSet);
        this.setParamObj(map, prefix + "ComputeNodeMetrics.", this.ComputeNodeMetrics);
        this.setParamSimple(map, prefix + "DesiredComputeNodeCount", this.DesiredComputeNodeCount);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "NextAction", this.NextAction);
        this.setParamSimple(map, prefix + "AttachedComputeNodeCount", this.AttachedComputeNodeCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

