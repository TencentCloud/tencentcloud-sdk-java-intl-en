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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityGroupAttributeRequest extends AbstractModel{

    /**
    * The security group instance ID, such as `sg-33ocnj9n`. This can be obtained through DescribeSecurityGroups.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Security group can be named freely, but cannot exceed 60 characters.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * The remarks for the security group. The maximum length is 100 characters.
    */
    @SerializedName("GroupDescription")
    @Expose
    private String GroupDescription;

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
     * Get Security group can be named freely, but cannot exceed 60 characters. 
     * @return GroupName Security group can be named freely, but cannot exceed 60 characters.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Security group can be named freely, but cannot exceed 60 characters.
     * @param GroupName Security group can be named freely, but cannot exceed 60 characters.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get The remarks for the security group. The maximum length is 100 characters. 
     * @return GroupDescription The remarks for the security group. The maximum length is 100 characters.
     */
    public String getGroupDescription() {
        return this.GroupDescription;
    }

    /**
     * Set The remarks for the security group. The maximum length is 100 characters.
     * @param GroupDescription The remarks for the security group. The maximum length is 100 characters.
     */
    public void setGroupDescription(String GroupDescription) {
        this.GroupDescription = GroupDescription;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupDescription", this.GroupDescription);

    }
}

