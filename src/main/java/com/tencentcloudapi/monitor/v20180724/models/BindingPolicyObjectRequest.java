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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindingPolicyObjectRequest extends AbstractModel{

    /**
    * Policy group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Required. The value is fixed to monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Instance group ID.
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * Dimensions of an object to be bound.
    */
    @SerializedName("Dimensions")
    @Expose
    private BindingPolicyObjectDimension [] Dimensions;

    /**
     * Get Policy group ID. 
     * @return GroupId Policy group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Policy group ID.
     * @param GroupId Policy group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Required. The value is fixed to monitor. 
     * @return Module Required. The value is fixed to monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Required. The value is fixed to monitor.
     * @param Module Required. The value is fixed to monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Instance group ID. 
     * @return InstanceGroupId Instance group ID.
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set Instance group ID.
     * @param InstanceGroupId Instance group ID.
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get Dimensions of an object to be bound. 
     * @return Dimensions Dimensions of an object to be bound.
     */
    public BindingPolicyObjectDimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Dimensions of an object to be bound.
     * @param Dimensions Dimensions of an object to be bound.
     */
    public void setDimensions(BindingPolicyObjectDimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);

    }
}

