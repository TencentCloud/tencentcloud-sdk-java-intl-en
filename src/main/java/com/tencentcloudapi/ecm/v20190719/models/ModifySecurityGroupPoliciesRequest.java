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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityGroupPoliciesRequest extends AbstractModel {

    /**
    * Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through the `DescribeSecurityGroups` API.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Security group policy set. You must specify both new egress and ingress policies for the `SecurityGroupPolicySet` object. You cannot customize the index (PolicyIndex) of the `SecurityGroupPolicy` object.
    */
    @SerializedName("SecurityGroupPolicySet")
    @Expose
    private SecurityGroupPolicySet SecurityGroupPolicySet;

    /**
    * Whether security group sorting is supported. `True` indicates yes. If `SortPolicys` doesn't exist or is set to `False`, the security group policy can be modified.
    */
    @SerializedName("SortPolicys")
    @Expose
    private Boolean SortPolicys;

    /**
     * Get Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through the `DescribeSecurityGroups` API. 
     * @return SecurityGroupId Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through the `DescribeSecurityGroups` API.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through the `DescribeSecurityGroups` API.
     * @param SecurityGroupId Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through the `DescribeSecurityGroups` API.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Security group policy set. You must specify both new egress and ingress policies for the `SecurityGroupPolicySet` object. You cannot customize the index (PolicyIndex) of the `SecurityGroupPolicy` object. 
     * @return SecurityGroupPolicySet Security group policy set. You must specify both new egress and ingress policies for the `SecurityGroupPolicySet` object. You cannot customize the index (PolicyIndex) of the `SecurityGroupPolicy` object.
     */
    public SecurityGroupPolicySet getSecurityGroupPolicySet() {
        return this.SecurityGroupPolicySet;
    }

    /**
     * Set Security group policy set. You must specify both new egress and ingress policies for the `SecurityGroupPolicySet` object. You cannot customize the index (PolicyIndex) of the `SecurityGroupPolicy` object.
     * @param SecurityGroupPolicySet Security group policy set. You must specify both new egress and ingress policies for the `SecurityGroupPolicySet` object. You cannot customize the index (PolicyIndex) of the `SecurityGroupPolicy` object.
     */
    public void setSecurityGroupPolicySet(SecurityGroupPolicySet SecurityGroupPolicySet) {
        this.SecurityGroupPolicySet = SecurityGroupPolicySet;
    }

    /**
     * Get Whether security group sorting is supported. `True` indicates yes. If `SortPolicys` doesn't exist or is set to `False`, the security group policy can be modified. 
     * @return SortPolicys Whether security group sorting is supported. `True` indicates yes. If `SortPolicys` doesn't exist or is set to `False`, the security group policy can be modified.
     */
    public Boolean getSortPolicys() {
        return this.SortPolicys;
    }

    /**
     * Set Whether security group sorting is supported. `True` indicates yes. If `SortPolicys` doesn't exist or is set to `False`, the security group policy can be modified.
     * @param SortPolicys Whether security group sorting is supported. `True` indicates yes. If `SortPolicys` doesn't exist or is set to `False`, the security group policy can be modified.
     */
    public void setSortPolicys(Boolean SortPolicys) {
        this.SortPolicys = SortPolicys;
    }

    public ModifySecurityGroupPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityGroupPoliciesRequest(ModifySecurityGroupPoliciesRequest source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.SecurityGroupPolicySet != null) {
            this.SecurityGroupPolicySet = new SecurityGroupPolicySet(source.SecurityGroupPolicySet);
        }
        if (source.SortPolicys != null) {
            this.SortPolicys = new Boolean(source.SortPolicys);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamObj(map, prefix + "SecurityGroupPolicySet.", this.SecurityGroupPolicySet);
        this.setParamSimple(map, prefix + "SortPolicys", this.SortPolicys);

    }
}

