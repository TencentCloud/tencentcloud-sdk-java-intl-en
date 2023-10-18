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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindingPolicyObjectListRequest extends AbstractModel {

    /**
    * The value is fixed to monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Policy group ID. If the ID is in the format of “policy-xxxx”, please enter it in the `PolicyId` field. Enter 0 in this field.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Alarm policy ID in the format of “policy-xxxx”. If a value has been entered in this field, you can enter 0 in the `GroupId` field.
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * The number of alarm objects returned each time. Value range: 1-100. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which starts from 0 and is set to 0 by default. For example, the parameter `Offset=0&Limit=20` returns the zeroth to 19th alarm objects, and `Offset=20&Limit=20` returns the 20th to 39th alarm objects, and so on.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Dimensions of filtering objects.
    */
    @SerializedName("Dimensions")
    @Expose
    private DescribeBindingPolicyObjectListDimension [] Dimensions;

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
     * Get Policy group ID. If the ID is in the format of “policy-xxxx”, please enter it in the `PolicyId` field. Enter 0 in this field. 
     * @return GroupId Policy group ID. If the ID is in the format of “policy-xxxx”, please enter it in the `PolicyId` field. Enter 0 in this field.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Policy group ID. If the ID is in the format of “policy-xxxx”, please enter it in the `PolicyId` field. Enter 0 in this field.
     * @param GroupId Policy group ID. If the ID is in the format of “policy-xxxx”, please enter it in the `PolicyId` field. Enter 0 in this field.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Alarm policy ID in the format of “policy-xxxx”. If a value has been entered in this field, you can enter 0 in the `GroupId` field. 
     * @return PolicyId Alarm policy ID in the format of “policy-xxxx”. If a value has been entered in this field, you can enter 0 in the `GroupId` field.
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Alarm policy ID in the format of “policy-xxxx”. If a value has been entered in this field, you can enter 0 in the `GroupId` field.
     * @param PolicyId Alarm policy ID in the format of “policy-xxxx”. If a value has been entered in this field, you can enter 0 in the `GroupId` field.
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get The number of alarm objects returned each time. Value range: 1-100. Default value: 20. 
     * @return Limit The number of alarm objects returned each time. Value range: 1-100. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of alarm objects returned each time. Value range: 1-100. Default value: 20.
     * @param Limit The number of alarm objects returned each time. Value range: 1-100. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which starts from 0 and is set to 0 by default. For example, the parameter `Offset=0&Limit=20` returns the zeroth to 19th alarm objects, and `Offset=20&Limit=20` returns the 20th to 39th alarm objects, and so on. 
     * @return Offset Offset, which starts from 0 and is set to 0 by default. For example, the parameter `Offset=0&Limit=20` returns the zeroth to 19th alarm objects, and `Offset=20&Limit=20` returns the 20th to 39th alarm objects, and so on.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which starts from 0 and is set to 0 by default. For example, the parameter `Offset=0&Limit=20` returns the zeroth to 19th alarm objects, and `Offset=20&Limit=20` returns the 20th to 39th alarm objects, and so on.
     * @param Offset Offset, which starts from 0 and is set to 0 by default. For example, the parameter `Offset=0&Limit=20` returns the zeroth to 19th alarm objects, and `Offset=20&Limit=20` returns the 20th to 39th alarm objects, and so on.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Dimensions of filtering objects. 
     * @return Dimensions Dimensions of filtering objects.
     */
    public DescribeBindingPolicyObjectListDimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Dimensions of filtering objects.
     * @param Dimensions Dimensions of filtering objects.
     */
    public void setDimensions(DescribeBindingPolicyObjectListDimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    public DescribeBindingPolicyObjectListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBindingPolicyObjectListRequest(DescribeBindingPolicyObjectListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new DescribeBindingPolicyObjectListDimension[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new DescribeBindingPolicyObjectListDimension(source.Dimensions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);

    }
}

