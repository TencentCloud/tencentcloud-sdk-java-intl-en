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

public class NodePool extends AbstractModel {

    /**
    * Node pool ID
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * Node pool name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Cluster instance ID
    */
    @SerializedName("ClusterInstanceId")
    @Expose
    private String ClusterInstanceId;

    /**
    * The lifecycle state of the current node pool. Valid values: `creating`, `normal`, `updating`, `deleting`, and `deleted`.
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * Launch configuration ID
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
    * Labels
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Array of taint
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
    * Node list
    */
    @SerializedName("NodeCountSummary")
    @Expose
    private NodeCountSummary NodeCountSummary;

    /**
    * 
    */
    @SerializedName("AutoscalingGroupStatus")
    @Expose
    private String AutoscalingGroupStatus;

    /**
    * Maximum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("MaxNodesNum")
    @Expose
    private Long MaxNodesNum;

    /**
    * Minimum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("MinNodesNum")
    @Expose
    private Long MinNodesNum;

    /**
    * Desired number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("DesiredNodesNum")
    @Expose
    private Long DesiredNodesNum;

    /**
    * Runtime Description
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("RuntimeConfig")
    @Expose
    private RuntimeConfig RuntimeConfig;

    /**
    * The operating system of the node pool
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("NodePoolOs")
    @Expose
    private String NodePoolOs;

    /**
    * Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * Image ID
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * This parameter is required when the custom PodCIDR mode is enabled for the cluster.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("DesiredPodNum")
    @Expose
    private Long DesiredPodNum;

    /**
    * Custom script
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("UserScript")
    @Expose
    private String UserScript;

    /**
    * Resource tag
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether Deletion Protection is enabled
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * Node Configuration

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("ExtraArgs")
    @Expose
    private InstanceExtraArgs ExtraArgs;

    /**
    * GPU Driver-related Parameters
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("GPUArgs")
    @Expose
    private GPUArgs GPUArgs;

    /**
    * Specified value of dockerd --graph. Default value: /var/lib/docker

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("DockerGraphPath")
    @Expose
    private String DockerGraphPath;

    /**
    * Multiple Disk Data Disk Mount Information: When creating a new node, make sure that the CVM purchase parameters include the information of purchasing multiple data disks. For example, in the DataDisks under RunInstancesPara of CreateClusterInstances API, it must also be set to purchase multiple data disks. Refer to the example of adding cluster nodes (multiple data disks) of CreateClusterInstances API; when adding existing nodes, ensure that the specified partition information actually exists on the node.
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Unschedulable or not
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Unschedulable")
    @Expose
    private Long Unschedulable;

    /**
    * Custom script, executed before UserScript
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("PreStartUserScript")
    @Expose
    private String PreStartUserScript;

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
     * Get Node pool name 
     * @return Name Node pool name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Node pool name
     * @param Name Node pool name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Cluster instance ID 
     * @return ClusterInstanceId Cluster instance ID
     */
    public String getClusterInstanceId() {
        return this.ClusterInstanceId;
    }

    /**
     * Set Cluster instance ID
     * @param ClusterInstanceId Cluster instance ID
     */
    public void setClusterInstanceId(String ClusterInstanceId) {
        this.ClusterInstanceId = ClusterInstanceId;
    }

    /**
     * Get The lifecycle state of the current node pool. Valid values: `creating`, `normal`, `updating`, `deleting`, and `deleted`. 
     * @return LifeState The lifecycle state of the current node pool. Valid values: `creating`, `normal`, `updating`, `deleting`, and `deleted`.
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set The lifecycle state of the current node pool. Valid values: `creating`, `normal`, `updating`, `deleting`, and `deleted`.
     * @param LifeState The lifecycle state of the current node pool. Valid values: `creating`, `normal`, `updating`, `deleting`, and `deleted`.
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get Launch configuration ID 
     * @return LaunchConfigurationId Launch configuration ID
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set Launch configuration ID
     * @param LaunchConfigurationId Launch configuration ID
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
     * Get Array of taint 
     * @return Taints Array of taint
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set Array of taint
     * @param Taints Array of taint
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
     * Get Node list 
     * @return NodeCountSummary Node list
     */
    public NodeCountSummary getNodeCountSummary() {
        return this.NodeCountSummary;
    }

    /**
     * Set Node list
     * @param NodeCountSummary Node list
     */
    public void setNodeCountSummary(NodeCountSummary NodeCountSummary) {
        this.NodeCountSummary = NodeCountSummary;
    }

    /**
     * Get  
     * @return AutoscalingGroupStatus 
     */
    public String getAutoscalingGroupStatus() {
        return this.AutoscalingGroupStatus;
    }

    /**
     * Set 
     * @param AutoscalingGroupStatus 
     */
    public void setAutoscalingGroupStatus(String AutoscalingGroupStatus) {
        this.AutoscalingGroupStatus = AutoscalingGroupStatus;
    }

    /**
     * Get Maximum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return MaxNodesNum Maximum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getMaxNodesNum() {
        return this.MaxNodesNum;
    }

    /**
     * Set Maximum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param MaxNodesNum Maximum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setMaxNodesNum(Long MaxNodesNum) {
        this.MaxNodesNum = MaxNodesNum;
    }

    /**
     * Get Minimum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return MinNodesNum Minimum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getMinNodesNum() {
        return this.MinNodesNum;
    }

    /**
     * Set Minimum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param MinNodesNum Minimum number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setMinNodesNum(Long MinNodesNum) {
        this.MinNodesNum = MinNodesNum;
    }

    /**
     * Get Desired number of nodes
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return DesiredNodesNum Desired number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getDesiredNodesNum() {
        return this.DesiredNodesNum;
    }

    /**
     * Set Desired number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param DesiredNodesNum Desired number of nodes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setDesiredNodesNum(Long DesiredNodesNum) {
        this.DesiredNodesNum = DesiredNodesNum;
    }

    /**
     * Get Runtime Description
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return RuntimeConfig Runtime Description
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public RuntimeConfig getRuntimeConfig() {
        return this.RuntimeConfig;
    }

    /**
     * Set Runtime Description
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param RuntimeConfig Runtime Description
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setRuntimeConfig(RuntimeConfig RuntimeConfig) {
        this.RuntimeConfig = RuntimeConfig;
    }

    /**
     * Get The operating system of the node pool
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return NodePoolOs The operating system of the node pool
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getNodePoolOs() {
        return this.NodePoolOs;
    }

    /**
     * Set The operating system of the node pool
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param NodePoolOs The operating system of the node pool
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setNodePoolOs(String NodePoolOs) {
        this.NodePoolOs = NodePoolOs;
    }

    /**
     * Get Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return OsCustomizeType Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param OsCustomizeType Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get Image ID
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return ImageId Image ID
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param ImageId Image ID
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get This parameter is required when the custom PodCIDR mode is enabled for the cluster.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return DesiredPodNum This parameter is required when the custom PodCIDR mode is enabled for the cluster.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getDesiredPodNum() {
        return this.DesiredPodNum;
    }

    /**
     * Set This parameter is required when the custom PodCIDR mode is enabled for the cluster.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param DesiredPodNum This parameter is required when the custom PodCIDR mode is enabled for the cluster.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setDesiredPodNum(Long DesiredPodNum) {
        this.DesiredPodNum = DesiredPodNum;
    }

    /**
     * Get Custom script
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return UserScript Custom script
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set Custom script
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param UserScript Custom script
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setUserScript(String UserScript) {
        this.UserScript = UserScript;
    }

    /**
     * Get Resource tag
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Tags Resource tag
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Resource tag
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Tags Resource tag
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether Deletion Protection is enabled
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DeletionProtection Whether Deletion Protection is enabled
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set Whether Deletion Protection is enabled
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DeletionProtection Whether Deletion Protection is enabled
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get Node Configuration

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return ExtraArgs Node Configuration

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public InstanceExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set Node Configuration

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param ExtraArgs Node Configuration

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setExtraArgs(InstanceExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    /**
     * Get GPU Driver-related Parameters
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return GPUArgs GPU Driver-related Parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public GPUArgs getGPUArgs() {
        return this.GPUArgs;
    }

    /**
     * Set GPU Driver-related Parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param GPUArgs GPU Driver-related Parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setGPUArgs(GPUArgs GPUArgs) {
        this.GPUArgs = GPUArgs;
    }

    /**
     * Get Specified value of dockerd --graph. Default value: /var/lib/docker

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return DockerGraphPath Specified value of dockerd --graph. Default value: /var/lib/docker

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getDockerGraphPath() {
        return this.DockerGraphPath;
    }

    /**
     * Set Specified value of dockerd --graph. Default value: /var/lib/docker

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param DockerGraphPath Specified value of dockerd --graph. Default value: /var/lib/docker

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setDockerGraphPath(String DockerGraphPath) {
        this.DockerGraphPath = DockerGraphPath;
    }

    /**
     * Get Multiple Disk Data Disk Mount Information: When creating a new node, make sure that the CVM purchase parameters include the information of purchasing multiple data disks. For example, in the DataDisks under RunInstancesPara of CreateClusterInstances API, it must also be set to purchase multiple data disks. Refer to the example of adding cluster nodes (multiple data disks) of CreateClusterInstances API; when adding existing nodes, ensure that the specified partition information actually exists on the node.
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return DataDisks Multiple Disk Data Disk Mount Information: When creating a new node, make sure that the CVM purchase parameters include the information of purchasing multiple data disks. For example, in the DataDisks under RunInstancesPara of CreateClusterInstances API, it must also be set to purchase multiple data disks. Refer to the example of adding cluster nodes (multiple data disks) of CreateClusterInstances API; when adding existing nodes, ensure that the specified partition information actually exists on the node.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Multiple Disk Data Disk Mount Information: When creating a new node, make sure that the CVM purchase parameters include the information of purchasing multiple data disks. For example, in the DataDisks under RunInstancesPara of CreateClusterInstances API, it must also be set to purchase multiple data disks. Refer to the example of adding cluster nodes (multiple data disks) of CreateClusterInstances API; when adding existing nodes, ensure that the specified partition information actually exists on the node.
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param DataDisks Multiple Disk Data Disk Mount Information: When creating a new node, make sure that the CVM purchase parameters include the information of purchasing multiple data disks. For example, in the DataDisks under RunInstancesPara of CreateClusterInstances API, it must also be set to purchase multiple data disks. Refer to the example of adding cluster nodes (multiple data disks) of CreateClusterInstances API; when adding existing nodes, ensure that the specified partition information actually exists on the node.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get Unschedulable or not
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Unschedulable Unschedulable or not
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set Unschedulable or not
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Unschedulable Unschedulable or not
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setUnschedulable(Long Unschedulable) {
        this.Unschedulable = Unschedulable;
    }

    /**
     * Get Custom script, executed before UserScript
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return PreStartUserScript Custom script, executed before UserScript
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getPreStartUserScript() {
        return this.PreStartUserScript;
    }

    /**
     * Set Custom script, executed before UserScript
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param PreStartUserScript Custom script, executed before UserScript
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setPreStartUserScript(String PreStartUserScript) {
        this.PreStartUserScript = PreStartUserScript;
    }

    public NodePool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodePool(NodePool source) {
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ClusterInstanceId != null) {
            this.ClusterInstanceId = new String(source.ClusterInstanceId);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.AutoscalingGroupId != null) {
            this.AutoscalingGroupId = new String(source.AutoscalingGroupId);
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
        if (source.RuntimeConfig != null) {
            this.RuntimeConfig = new RuntimeConfig(source.RuntimeConfig);
        }
        if (source.NodePoolOs != null) {
            this.NodePoolOs = new String(source.NodePoolOs);
        }
        if (source.OsCustomizeType != null) {
            this.OsCustomizeType = new String(source.OsCustomizeType);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.DesiredPodNum != null) {
            this.DesiredPodNum = new Long(source.DesiredPodNum);
        }
        if (source.UserScript != null) {
            this.UserScript = new String(source.UserScript);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.ExtraArgs != null) {
            this.ExtraArgs = new InstanceExtraArgs(source.ExtraArgs);
        }
        if (source.GPUArgs != null) {
            this.GPUArgs = new GPUArgs(source.GPUArgs);
        }
        if (source.DockerGraphPath != null) {
            this.DockerGraphPath = new String(source.DockerGraphPath);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.Unschedulable != null) {
            this.Unschedulable = new Long(source.Unschedulable);
        }
        if (source.PreStartUserScript != null) {
            this.PreStartUserScript = new String(source.PreStartUserScript);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ClusterInstanceId", this.ClusterInstanceId);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "AutoscalingGroupId", this.AutoscalingGroupId);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamObj(map, prefix + "NodeCountSummary.", this.NodeCountSummary);
        this.setParamSimple(map, prefix + "AutoscalingGroupStatus", this.AutoscalingGroupStatus);
        this.setParamSimple(map, prefix + "MaxNodesNum", this.MaxNodesNum);
        this.setParamSimple(map, prefix + "MinNodesNum", this.MinNodesNum);
        this.setParamSimple(map, prefix + "DesiredNodesNum", this.DesiredNodesNum);
        this.setParamObj(map, prefix + "RuntimeConfig.", this.RuntimeConfig);
        this.setParamSimple(map, prefix + "NodePoolOs", this.NodePoolOs);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "DesiredPodNum", this.DesiredPodNum);
        this.setParamSimple(map, prefix + "UserScript", this.UserScript);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);
        this.setParamObj(map, prefix + "GPUArgs.", this.GPUArgs);
        this.setParamSimple(map, prefix + "DockerGraphPath", this.DockerGraphPath);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);
        this.setParamSimple(map, prefix + "PreStartUserScript", this.PreStartUserScript);

    }
}

