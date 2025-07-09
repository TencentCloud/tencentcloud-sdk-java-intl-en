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

public class CreateClusterNodePoolRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * AS group parameters. For details, see https://intl.cloud.tencent.com/document/product/377/20440?from_cn_redirect=1
    */
    @SerializedName("AutoScalingGroupPara")
    @Expose
    private String AutoScalingGroupPara;

    /**
    * Running parameters. For details, see https://intl.cloud.tencent.com/document/product/377/20447?from_cn_redirect=1
    */
    @SerializedName("LaunchConfigurePara")
    @Expose
    private String LaunchConfigurePara;

    /**
    * InstanceAdvancedSettings
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * Indicates whether to enable auto scaling
    */
    @SerializedName("EnableAutoscale")
    @Expose
    private Boolean EnableAutoscale;

    /**
    * Node pool name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
    * Node pool runtime type and version
    */
    @SerializedName("ContainerRuntime")
    @Expose
    private String ContainerRuntime;

    /**
    * Runtime version
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * Node pool operating system (enter the image ID for a custom image, and enter the OS name for a public image)
    */
    @SerializedName("NodePoolOs")
    @Expose
    private String NodePoolOs;

    /**
    * Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * Resource tag
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether Deletion Protection is enabled
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

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
     * Get AS group parameters. For details, see https://intl.cloud.tencent.com/document/product/377/20440?from_cn_redirect=1 
     * @return AutoScalingGroupPara AS group parameters. For details, see https://intl.cloud.tencent.com/document/product/377/20440?from_cn_redirect=1
     */
    public String getAutoScalingGroupPara() {
        return this.AutoScalingGroupPara;
    }

    /**
     * Set AS group parameters. For details, see https://intl.cloud.tencent.com/document/product/377/20440?from_cn_redirect=1
     * @param AutoScalingGroupPara AS group parameters. For details, see https://intl.cloud.tencent.com/document/product/377/20440?from_cn_redirect=1
     */
    public void setAutoScalingGroupPara(String AutoScalingGroupPara) {
        this.AutoScalingGroupPara = AutoScalingGroupPara;
    }

    /**
     * Get Running parameters. For details, see https://intl.cloud.tencent.com/document/product/377/20447?from_cn_redirect=1 
     * @return LaunchConfigurePara Running parameters. For details, see https://intl.cloud.tencent.com/document/product/377/20447?from_cn_redirect=1
     */
    public String getLaunchConfigurePara() {
        return this.LaunchConfigurePara;
    }

    /**
     * Set Running parameters. For details, see https://intl.cloud.tencent.com/document/product/377/20447?from_cn_redirect=1
     * @param LaunchConfigurePara Running parameters. For details, see https://intl.cloud.tencent.com/document/product/377/20447?from_cn_redirect=1
     */
    public void setLaunchConfigurePara(String LaunchConfigurePara) {
        this.LaunchConfigurePara = LaunchConfigurePara;
    }

    /**
     * Get InstanceAdvancedSettings 
     * @return InstanceAdvancedSettings InstanceAdvancedSettings
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set InstanceAdvancedSettings
     * @param InstanceAdvancedSettings InstanceAdvancedSettings
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get Indicates whether to enable auto scaling 
     * @return EnableAutoscale Indicates whether to enable auto scaling
     */
    public Boolean getEnableAutoscale() {
        return this.EnableAutoscale;
    }

    /**
     * Set Indicates whether to enable auto scaling
     * @param EnableAutoscale Indicates whether to enable auto scaling
     */
    public void setEnableAutoscale(Boolean EnableAutoscale) {
        this.EnableAutoscale = EnableAutoscale;
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
     * Get Node pool runtime type and version 
     * @return ContainerRuntime Node pool runtime type and version
     */
    public String getContainerRuntime() {
        return this.ContainerRuntime;
    }

    /**
     * Set Node pool runtime type and version
     * @param ContainerRuntime Node pool runtime type and version
     */
    public void setContainerRuntime(String ContainerRuntime) {
        this.ContainerRuntime = ContainerRuntime;
    }

    /**
     * Get Runtime version 
     * @return RuntimeVersion Runtime version
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * Set Runtime version
     * @param RuntimeVersion Runtime version
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * Get Node pool operating system (enter the image ID for a custom image, and enter the OS name for a public image) 
     * @return NodePoolOs Node pool operating system (enter the image ID for a custom image, and enter the OS name for a public image)
     */
    public String getNodePoolOs() {
        return this.NodePoolOs;
    }

    /**
     * Set Node pool operating system (enter the image ID for a custom image, and enter the OS name for a public image)
     * @param NodePoolOs Node pool operating system (enter the image ID for a custom image, and enter the OS name for a public image)
     */
    public void setNodePoolOs(String NodePoolOs) {
        this.NodePoolOs = NodePoolOs;
    }

    /**
     * Get Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value) 
     * @return OsCustomizeType Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
     * @param OsCustomizeType Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
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

    public CreateClusterNodePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterNodePoolRequest(CreateClusterNodePoolRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AutoScalingGroupPara != null) {
            this.AutoScalingGroupPara = new String(source.AutoScalingGroupPara);
        }
        if (source.LaunchConfigurePara != null) {
            this.LaunchConfigurePara = new String(source.LaunchConfigurePara);
        }
        if (source.InstanceAdvancedSettings != null) {
            this.InstanceAdvancedSettings = new InstanceAdvancedSettings(source.InstanceAdvancedSettings);
        }
        if (source.EnableAutoscale != null) {
            this.EnableAutoscale = new Boolean(source.EnableAutoscale);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.ContainerRuntime != null) {
            this.ContainerRuntime = new String(source.ContainerRuntime);
        }
        if (source.RuntimeVersion != null) {
            this.RuntimeVersion = new String(source.RuntimeVersion);
        }
        if (source.NodePoolOs != null) {
            this.NodePoolOs = new String(source.NodePoolOs);
        }
        if (source.OsCustomizeType != null) {
            this.OsCustomizeType = new String(source.OsCustomizeType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AutoScalingGroupPara", this.AutoScalingGroupPara);
        this.setParamSimple(map, prefix + "LaunchConfigurePara", this.LaunchConfigurePara);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamSimple(map, prefix + "EnableAutoscale", this.EnableAutoscale);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamSimple(map, prefix + "ContainerRuntime", this.ContainerRuntime);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "NodePoolOs", this.NodePoolOs);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);

    }
}

