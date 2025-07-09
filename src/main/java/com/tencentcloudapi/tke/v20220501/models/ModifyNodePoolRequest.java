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

public class ModifyNodePoolRequest extends AbstractModel {

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
    * Node pool name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Node Labels
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Node taint
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * Node tags
    */
    @SerializedName("Tags")
    @Expose
    private TagSpecification [] Tags;

    /**
    * Whether to enable deletion protection
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * Whether the node is unschedulable
    */
    @SerializedName("Unschedulable")
    @Expose
    private Boolean Unschedulable;

    /**
    * Native node pool update parameters
    */
    @SerializedName("Native")
    @Expose
    private UpdateNativeNodePoolParam Native;

    /**
    * Node annotation list
    */
    @SerializedName("Annotations")
    @Expose
    private Annotation [] Annotations;

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
     * Get Node Labels 
     * @return Labels Node Labels
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Node Labels
     * @param Labels Node Labels
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Node taint 
     * @return Taints Node taint
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set Node taint
     * @param Taints Node taint
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get Node tags 
     * @return Tags Node tags
     */
    public TagSpecification [] getTags() {
        return this.Tags;
    }

    /**
     * Set Node tags
     * @param Tags Node tags
     */
    public void setTags(TagSpecification [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether to enable deletion protection 
     * @return DeletionProtection Whether to enable deletion protection
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set Whether to enable deletion protection
     * @param DeletionProtection Whether to enable deletion protection
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get Whether the node is unschedulable 
     * @return Unschedulable Whether the node is unschedulable
     */
    public Boolean getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set Whether the node is unschedulable
     * @param Unschedulable Whether the node is unschedulable
     */
    public void setUnschedulable(Boolean Unschedulable) {
        this.Unschedulable = Unschedulable;
    }

    /**
     * Get Native node pool update parameters 
     * @return Native Native node pool update parameters
     */
    public UpdateNativeNodePoolParam getNative() {
        return this.Native;
    }

    /**
     * Set Native node pool update parameters
     * @param Native Native node pool update parameters
     */
    public void setNative(UpdateNativeNodePoolParam Native) {
        this.Native = Native;
    }

    /**
     * Get Node annotation list 
     * @return Annotations Node annotation list
     */
    public Annotation [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set Node annotation list
     * @param Annotations Node annotation list
     */
    public void setAnnotations(Annotation [] Annotations) {
        this.Annotations = Annotations;
    }

    public ModifyNodePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNodePoolRequest(ModifyNodePoolRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
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
        if (source.Tags != null) {
            this.Tags = new TagSpecification[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagSpecification(source.Tags[i]);
            }
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.Unschedulable != null) {
            this.Unschedulable = new Boolean(source.Unschedulable);
        }
        if (source.Native != null) {
            this.Native = new UpdateNativeNodePoolParam(source.Native);
        }
        if (source.Annotations != null) {
            this.Annotations = new Annotation[source.Annotations.length];
            for (int i = 0; i < source.Annotations.length; i++) {
                this.Annotations[i] = new Annotation(source.Annotations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);
        this.setParamObj(map, prefix + "Native.", this.Native);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);

    }
}

