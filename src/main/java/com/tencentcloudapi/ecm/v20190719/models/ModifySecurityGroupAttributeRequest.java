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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityGroupAttributeRequest extends AbstractModel {

    /**
    * Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through the `DescribeSecurityGroups` API.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Security group name, which can be customized with up to 60 characters.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Security group remarks, which can contain up to 100 characters.
    */
    @SerializedName("GroupDescription")
    @Expose
    private String GroupDescription;

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
     * Get Security group name, which can be customized with up to 60 characters. 
     * @return GroupName Security group name, which can be customized with up to 60 characters.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Security group name, which can be customized with up to 60 characters.
     * @param GroupName Security group name, which can be customized with up to 60 characters.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Security group remarks, which can contain up to 100 characters. 
     * @return GroupDescription Security group remarks, which can contain up to 100 characters.
     */
    public String getGroupDescription() {
        return this.GroupDescription;
    }

    /**
     * Set Security group remarks, which can contain up to 100 characters.
     * @param GroupDescription Security group remarks, which can contain up to 100 characters.
     */
    public void setGroupDescription(String GroupDescription) {
        this.GroupDescription = GroupDescription;
    }

    public ModifySecurityGroupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityGroupAttributeRequest(ModifySecurityGroupAttributeRequest source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupDescription != null) {
            this.GroupDescription = new String(source.GroupDescription);
        }
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

