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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterNodePoolRequest extends AbstractModel {

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
    * Node Annotation List
    */
    @SerializedName("Annotations")
    @Expose
    private AnnotationValue [] Annotations;

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
    * GPU driver version, CUDA version, cuDNN version and wether to enable MIG
    */
    @SerializedName("GPUArgs")
    @Expose
    private GPUArgs GPUArgs;

    /**
    * Base64-encoded custom script
    */
    @SerializedName("UserScript")
    @Expose
    private String UserScript;

    /**
    * Ignore existing nodes when update `Label` and `Taint`
    */
    @SerializedName("IgnoreExistedNode")
    @Expose
    private Boolean IgnoreExistedNode;

    /**
    * Node custom parameter
    */
    @SerializedName("ExtraArgs")
    @Expose
    private InstanceExtraArgs ExtraArgs;

    /**
    * Resource tag
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Sets whether the added node is schedulable. 0 (default): schedulable; other values: unschedulable. After node initialization is completed, you can run `kubectl uncordon nodename` to enable this node for scheduling.
    */
    @SerializedName("Unschedulable")
    @Expose
    private Long Unschedulable;

    /**
    * Whether Deletion Protection is enabled
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * Specified value of dockerd --graph. Default value: /var/lib/docker
    */
    @SerializedName("DockerGraphPath")
    @Expose
    private String DockerGraphPath;

    /**
    * Base64-encoded custom script
    */
    @SerializedName("PreStartUserScript")
    @Expose
    private String PreStartUserScript;

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
     * Get Node Annotation List 
     * @return Annotations Node Annotation List
     */
    public AnnotationValue [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set Node Annotation List
     * @param Annotations Node Annotation List
     */
    public void setAnnotations(AnnotationValue [] Annotations) {
        this.Annotations = Annotations;
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
     * Get GPU driver version, CUDA version, cuDNN version and wether to enable MIG 
     * @return GPUArgs GPU driver version, CUDA version, cuDNN version and wether to enable MIG
     */
    public GPUArgs getGPUArgs() {
        return this.GPUArgs;
    }

    /**
     * Set GPU driver version, CUDA version, cuDNN version and wether to enable MIG
     * @param GPUArgs GPU driver version, CUDA version, cuDNN version and wether to enable MIG
     */
    public void setGPUArgs(GPUArgs GPUArgs) {
        this.GPUArgs = GPUArgs;
    }

    /**
     * Get Base64-encoded custom script 
     * @return UserScript Base64-encoded custom script
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set Base64-encoded custom script
     * @param UserScript Base64-encoded custom script
     */
    public void setUserScript(String UserScript) {
        this.UserScript = UserScript;
    }

    /**
     * Get Ignore existing nodes when update `Label` and `Taint` 
     * @return IgnoreExistedNode Ignore existing nodes when update `Label` and `Taint`
     */
    public Boolean getIgnoreExistedNode() {
        return this.IgnoreExistedNode;
    }

    /**
     * Set Ignore existing nodes when update `Label` and `Taint`
     * @param IgnoreExistedNode Ignore existing nodes when update `Label` and `Taint`
     */
    public void setIgnoreExistedNode(Boolean IgnoreExistedNode) {
        this.IgnoreExistedNode = IgnoreExistedNode;
    }

    /**
     * Get Node custom parameter 
     * @return ExtraArgs Node custom parameter
     */
    public InstanceExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set Node custom parameter
     * @param ExtraArgs Node custom parameter
     */
    public void setExtraArgs(InstanceExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    /**
     * Get Resource tag 
     * @return Tags Resource tag
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Resource tag
     * @param Tags Resource tag
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Sets whether the added node is schedulable. 0 (default): schedulable; other values: unschedulable. After node initialization is completed, you can run `kubectl uncordon nodename` to enable this node for scheduling. 
     * @return Unschedulable Sets whether the added node is schedulable. 0 (default): schedulable; other values: unschedulable. After node initialization is completed, you can run `kubectl uncordon nodename` to enable this node for scheduling.
     */
    public Long getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set Sets whether the added node is schedulable. 0 (default): schedulable; other values: unschedulable. After node initialization is completed, you can run `kubectl uncordon nodename` to enable this node for scheduling.
     * @param Unschedulable Sets whether the added node is schedulable. 0 (default): schedulable; other values: unschedulable. After node initialization is completed, you can run `kubectl uncordon nodename` to enable this node for scheduling.
     */
    public void setUnschedulable(Long Unschedulable) {
        this.Unschedulable = Unschedulable;
    }

    /**
     * Get Whether Deletion Protection is enabled 
     * @return DeletionProtection Whether Deletion Protection is enabled
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set Whether Deletion Protection is enabled
     * @param DeletionProtection Whether Deletion Protection is enabled
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get Specified value of dockerd --graph. Default value: /var/lib/docker 
     * @return DockerGraphPath Specified value of dockerd --graph. Default value: /var/lib/docker
     */
    public String getDockerGraphPath() {
        return this.DockerGraphPath;
    }

    /**
     * Set Specified value of dockerd --graph. Default value: /var/lib/docker
     * @param DockerGraphPath Specified value of dockerd --graph. Default value: /var/lib/docker
     */
    public void setDockerGraphPath(String DockerGraphPath) {
        this.DockerGraphPath = DockerGraphPath;
    }

    /**
     * Get Base64-encoded custom script 
     * @return PreStartUserScript Base64-encoded custom script
     */
    public String getPreStartUserScript() {
        return this.PreStartUserScript;
    }

    /**
     * Set Base64-encoded custom script
     * @param PreStartUserScript Base64-encoded custom script
     */
    public void setPreStartUserScript(String PreStartUserScript) {
        this.PreStartUserScript = PreStartUserScript;
    }

    public ModifyClusterNodePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterNodePoolRequest(ModifyClusterNodePoolRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MaxNodesNum != null) {
            this.MaxNodesNum = new Long(source.MaxNodesNum);
        }
        if (source.MinNodesNum != null) {
            this.MinNodesNum = new Long(source.MinNodesNum);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.Taints != null) {
            this.Taints = new Taint[source.Taints.length];
            for (int i = 0; i < source.Taints.length; i++) {
                this.Taints[i] = new Taint(source.Taints[i]);
            }
        }
        if (source.Annotations != null) {
            this.Annotations = new AnnotationValue[source.Annotations.length];
            for (int i = 0; i < source.Annotations.length; i++) {
                this.Annotations[i] = new AnnotationValue(source.Annotations[i]);
            }
        }
        if (source.EnableAutoscale != null) {
            this.EnableAutoscale = new Boolean(source.EnableAutoscale);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.OsCustomizeType != null) {
            this.OsCustomizeType = new String(source.OsCustomizeType);
        }
        if (source.GPUArgs != null) {
            this.GPUArgs = new GPUArgs(source.GPUArgs);
        }
        if (source.UserScript != null) {
            this.UserScript = new String(source.UserScript);
        }
        if (source.IgnoreExistedNode != null) {
            this.IgnoreExistedNode = new Boolean(source.IgnoreExistedNode);
        }
        if (source.ExtraArgs != null) {
            this.ExtraArgs = new InstanceExtraArgs(source.ExtraArgs);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Unschedulable != null) {
            this.Unschedulable = new Long(source.Unschedulable);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.DockerGraphPath != null) {
            this.DockerGraphPath = new String(source.DockerGraphPath);
        }
        if (source.PreStartUserScript != null) {
            this.PreStartUserScript = new String(source.PreStartUserScript);
        }
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
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamSimple(map, prefix + "EnableAutoscale", this.EnableAutoscale);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamObj(map, prefix + "GPUArgs.", this.GPUArgs);
        this.setParamSimple(map, prefix + "UserScript", this.UserScript);
        this.setParamSimple(map, prefix + "IgnoreExistedNode", this.IgnoreExistedNode);
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "DockerGraphPath", this.DockerGraphPath);
        this.setParamSimple(map, prefix + "PreStartUserScript", this.PreStartUserScript);

    }
}

