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

public class CreateSecurityGroupWithPoliciesRequest extends AbstractModel {

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
    * Project ID. Default value: 0. You can query it on the <a href="https://console.cloud.tencent.com/project">project management page</a> of the Tencent Cloud console.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Security group policy set.
    */
    @SerializedName("SecurityGroupPolicySet")
    @Expose
    private SecurityGroupPolicySet SecurityGroupPolicySet;

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
     * Get Project ID. Default value: 0. You can query it on the <a href="https://console.cloud.tencent.com/project">project management page</a> of the Tencent Cloud console. 
     * @return ProjectId Project ID. Default value: 0. You can query it on the <a href="https://console.cloud.tencent.com/project">project management page</a> of the Tencent Cloud console.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. Default value: 0. You can query it on the <a href="https://console.cloud.tencent.com/project">project management page</a> of the Tencent Cloud console.
     * @param ProjectId Project ID. Default value: 0. You can query it on the <a href="https://console.cloud.tencent.com/project">project management page</a> of the Tencent Cloud console.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Security group policy set. 
     * @return SecurityGroupPolicySet Security group policy set.
     */
    public SecurityGroupPolicySet getSecurityGroupPolicySet() {
        return this.SecurityGroupPolicySet;
    }

    /**
     * Set Security group policy set.
     * @param SecurityGroupPolicySet Security group policy set.
     */
    public void setSecurityGroupPolicySet(SecurityGroupPolicySet SecurityGroupPolicySet) {
        this.SecurityGroupPolicySet = SecurityGroupPolicySet;
    }

    public CreateSecurityGroupWithPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityGroupWithPoliciesRequest(CreateSecurityGroupWithPoliciesRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupDescription != null) {
            this.GroupDescription = new String(source.GroupDescription);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SecurityGroupPolicySet != null) {
            this.SecurityGroupPolicySet = new SecurityGroupPolicySet(source.SecurityGroupPolicySet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupDescription", this.GroupDescription);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "SecurityGroupPolicySet.", this.SecurityGroupPolicySet);

    }
}

