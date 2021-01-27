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

public class UnBindingAllPolicyObjectRequest extends AbstractModel{

    /**
    * The value is fixed to monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Policy group ID. If `PolicyId` is specified, you can pass any value to this field.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Alarm policy ID. If this field is used, you can pass any value to `GroupId`.
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
     * Get The value is fixed to monitor. 
     * @return Module The value is fixed to monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set The value is fixed to monitor.
     * @param Module The value is fixed to monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Policy group ID. If `PolicyId` is specified, you can pass any value to this field. 
     * @return GroupId Policy group ID. If `PolicyId` is specified, you can pass any value to this field.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Policy group ID. If `PolicyId` is specified, you can pass any value to this field.
     * @param GroupId Policy group ID. If `PolicyId` is specified, you can pass any value to this field.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Alarm policy ID. If this field is used, you can pass any value to `GroupId`. 
     * @return PolicyId Alarm policy ID. If this field is used, you can pass any value to `GroupId`.
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Alarm policy ID. If this field is used, you can pass any value to `GroupId`.
     * @param PolicyId Alarm policy ID. If this field is used, you can pass any value to `GroupId`.
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

