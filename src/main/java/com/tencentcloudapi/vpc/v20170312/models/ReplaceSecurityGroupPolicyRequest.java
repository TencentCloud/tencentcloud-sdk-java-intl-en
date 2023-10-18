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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceSecurityGroupPolicyRequest extends AbstractModel {

    /**
    * The security group instance ID, such as `sg-33ocnj9n`. This can be obtained through DescribeSecurityGroups.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Security group policy set object.
    */
    @SerializedName("SecurityGroupPolicySet")
    @Expose
    private SecurityGroupPolicySet SecurityGroupPolicySet;

    /**
    * (Optional) The old policy set of the security group, which is used for log records.
    */
    @SerializedName("OriginalSecurityGroupPolicySet")
    @Expose
    private SecurityGroupPolicySet OriginalSecurityGroupPolicySet;

    /**
     * Get The security group instance ID, such as `sg-33ocnj9n`. This can be obtained through DescribeSecurityGroups. 
     * @return SecurityGroupId The security group instance ID, such as `sg-33ocnj9n`. This can be obtained through DescribeSecurityGroups.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set The security group instance ID, such as `sg-33ocnj9n`. This can be obtained through DescribeSecurityGroups.
     * @param SecurityGroupId The security group instance ID, such as `sg-33ocnj9n`. This can be obtained through DescribeSecurityGroups.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Security group policy set object. 
     * @return SecurityGroupPolicySet Security group policy set object.
     */
    public SecurityGroupPolicySet getSecurityGroupPolicySet() {
        return this.SecurityGroupPolicySet;
    }

    /**
     * Set Security group policy set object.
     * @param SecurityGroupPolicySet Security group policy set object.
     */
    public void setSecurityGroupPolicySet(SecurityGroupPolicySet SecurityGroupPolicySet) {
        this.SecurityGroupPolicySet = SecurityGroupPolicySet;
    }

    /**
     * Get (Optional) The old policy set of the security group, which is used for log records. 
     * @return OriginalSecurityGroupPolicySet (Optional) The old policy set of the security group, which is used for log records.
     */
    public SecurityGroupPolicySet getOriginalSecurityGroupPolicySet() {
        return this.OriginalSecurityGroupPolicySet;
    }

    /**
     * Set (Optional) The old policy set of the security group, which is used for log records.
     * @param OriginalSecurityGroupPolicySet (Optional) The old policy set of the security group, which is used for log records.
     */
    public void setOriginalSecurityGroupPolicySet(SecurityGroupPolicySet OriginalSecurityGroupPolicySet) {
        this.OriginalSecurityGroupPolicySet = OriginalSecurityGroupPolicySet;
    }

    public ReplaceSecurityGroupPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceSecurityGroupPolicyRequest(ReplaceSecurityGroupPolicyRequest source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.SecurityGroupPolicySet != null) {
            this.SecurityGroupPolicySet = new SecurityGroupPolicySet(source.SecurityGroupPolicySet);
        }
        if (source.OriginalSecurityGroupPolicySet != null) {
            this.OriginalSecurityGroupPolicySet = new SecurityGroupPolicySet(source.OriginalSecurityGroupPolicySet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamObj(map, prefix + "SecurityGroupPolicySet.", this.SecurityGroupPolicySet);
        this.setParamObj(map, prefix + "OriginalSecurityGroupPolicySet.", this.OriginalSecurityGroupPolicySet);

    }
}

