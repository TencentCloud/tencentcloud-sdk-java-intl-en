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

public class VirtualNodePool extends AbstractModel{

    /**
    * Node pool ID
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * List of subnets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Node pool name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Node pool lifecycle status
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * Virtual node labels
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Virtual node taint
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

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
     * Get List of subnets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetIds List of subnets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set List of subnets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetIds List of subnets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
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
     * Get Node pool lifecycle status 
     * @return LifeState Node pool lifecycle status
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set Node pool lifecycle status
     * @param LifeState Node pool lifecycle status
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get Virtual node labels
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Labels Virtual node labels
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Virtual node labels
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Labels Virtual node labels
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Virtual node taint
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Taints Virtual node taint
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set Virtual node taint
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Taints Virtual node taint
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    public VirtualNodePool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirtualNodePool(VirtualNodePool source) {
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);

    }
}

