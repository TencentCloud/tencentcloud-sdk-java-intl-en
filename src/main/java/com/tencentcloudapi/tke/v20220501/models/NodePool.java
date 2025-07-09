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

public class NodePool extends AbstractModel {

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
    * Node tags
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagSpecification [] Tags;

    /**
    * Node taint

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * Whether to enable deletion protection
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * Whether the node is unschedulable
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Unschedulable")
    @Expose
    private Boolean Unschedulable;

    /**
    * Node pool type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Node Labels
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Node pool status
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * Creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Node pool name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Native node pool parameters
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Native")
    @Expose
    private NativeNodePoolInfo Native;

    /**
    * Node annotation list

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Annotations")
    @Expose
    private Annotation [] Annotations;

    /**
    * Super node pool parameter, which has a value only when Type equals Super
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Super")
    @Expose
    private SuperNodePoolInfo Super;

    /**
    * General node pool parameter, which has a value only when Type equals Regular
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Regular")
    @Expose
    private RegularNodePoolInfo Regular;

    /**
    * Third-party node pool parameter, which has a value only when Type equals External
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("External")
    @Expose
    private ExternalNodePoolInfo External;

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
     * Get Node tags
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Tags Node tags
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public TagSpecification [] getTags() {
        return this.Tags;
    }

    /**
     * Set Node tags
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Tags Node tags
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setTags(TagSpecification [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Node taint

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Taints Node taint

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set Node taint

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Taints Node taint

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get Whether to enable deletion protection
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return DeletionProtection Whether to enable deletion protection
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set Whether to enable deletion protection
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param DeletionProtection Whether to enable deletion protection
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get Whether the node is unschedulable
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Unschedulable Whether the node is unschedulable
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Boolean getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set Whether the node is unschedulable
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Unschedulable Whether the node is unschedulable
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setUnschedulable(Boolean Unschedulable) {
        this.Unschedulable = Unschedulable;
    }

    /**
     * Get Node pool type 
     * @return Type Node pool type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Node pool type
     * @param Type Node pool type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Node Labels
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Labels Node Labels
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Node Labels
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Labels Node Labels
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Node pool status 
     * @return LifeState Node pool status
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set Node pool status
     * @param LifeState Node pool status
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get Creation time 
     * @return CreatedAt Creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time
     * @param CreatedAt Creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
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
     * Get Native node pool parameters
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Native Native node pool parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public NativeNodePoolInfo getNative() {
        return this.Native;
    }

    /**
     * Set Native node pool parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Native Native node pool parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setNative(NativeNodePoolInfo Native) {
        this.Native = Native;
    }

    /**
     * Get Node annotation list

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Annotations Node annotation list

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Annotation [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set Node annotation list

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Annotations Node annotation list

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setAnnotations(Annotation [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get Super node pool parameter, which has a value only when Type equals Super
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Super Super node pool parameter, which has a value only when Type equals Super
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public SuperNodePoolInfo getSuper() {
        return this.Super;
    }

    /**
     * Set Super node pool parameter, which has a value only when Type equals Super
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Super Super node pool parameter, which has a value only when Type equals Super
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setSuper(SuperNodePoolInfo Super) {
        this.Super = Super;
    }

    /**
     * Get General node pool parameter, which has a value only when Type equals Regular
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Regular General node pool parameter, which has a value only when Type equals Regular
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public RegularNodePoolInfo getRegular() {
        return this.Regular;
    }

    /**
     * Set General node pool parameter, which has a value only when Type equals Regular
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Regular General node pool parameter, which has a value only when Type equals Regular
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setRegular(RegularNodePoolInfo Regular) {
        this.Regular = Regular;
    }

    /**
     * Get Third-party node pool parameter, which has a value only when Type equals External
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return External Third-party node pool parameter, which has a value only when Type equals External
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public ExternalNodePoolInfo getExternal() {
        return this.External;
    }

    /**
     * Set Third-party node pool parameter, which has a value only when Type equals External
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param External Third-party node pool parameter, which has a value only when Type equals External
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setExternal(ExternalNodePoolInfo External) {
        this.External = External;
    }

    public NodePool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodePool(NodePool source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.Tags != null) {
            this.Tags = new TagSpecification[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagSpecification(source.Tags[i]);
            }
        }
        if (source.Taints != null) {
            this.Taints = new Taint[source.Taints.length];
            for (int i = 0; i < source.Taints.length; i++) {
                this.Taints[i] = new Taint(source.Taints[i]);
            }
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.Unschedulable != null) {
            this.Unschedulable = new Boolean(source.Unschedulable);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Native != null) {
            this.Native = new NativeNodePoolInfo(source.Native);
        }
        if (source.Annotations != null) {
            this.Annotations = new Annotation[source.Annotations.length];
            for (int i = 0; i < source.Annotations.length; i++) {
                this.Annotations[i] = new Annotation(source.Annotations[i]);
            }
        }
        if (source.Super != null) {
            this.Super = new SuperNodePoolInfo(source.Super);
        }
        if (source.Regular != null) {
            this.Regular = new RegularNodePoolInfo(source.Regular);
        }
        if (source.External != null) {
            this.External = new ExternalNodePoolInfo(source.External);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Native.", this.Native);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamObj(map, prefix + "Super.", this.Super);
        this.setParamObj(map, prefix + "Regular.", this.Regular);
        this.setParamObj(map, prefix + "External.", this.External);

    }
}

