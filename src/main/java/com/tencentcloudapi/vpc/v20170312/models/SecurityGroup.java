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

public class SecurityGroup extends AbstractModel{

    /**
    * The security group instance ID, such as `sg-ohuuioma`.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Security group can be named freely, but cannot exceed 60 characters.
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * The remarks for the security group. The maximum length is 100 characters.
    */
    @SerializedName("SecurityGroupDesc")
    @Expose
    private String SecurityGroupDesc;

    /**
    * The project id is 0 by default. You can query this in the project management page of the Qcloud console.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Whether it is the default security group (which cannot be deleted).
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * Security group creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get The security group instance ID, such as `sg-ohuuioma`. 
     * @return SecurityGroupId The security group instance ID, such as `sg-ohuuioma`.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set The security group instance ID, such as `sg-ohuuioma`.
     * @param SecurityGroupId The security group instance ID, such as `sg-ohuuioma`.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Security group can be named freely, but cannot exceed 60 characters. 
     * @return SecurityGroupName Security group can be named freely, but cannot exceed 60 characters.
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * Set Security group can be named freely, but cannot exceed 60 characters.
     * @param SecurityGroupName Security group can be named freely, but cannot exceed 60 characters.
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * Get The remarks for the security group. The maximum length is 100 characters. 
     * @return SecurityGroupDesc The remarks for the security group. The maximum length is 100 characters.
     */
    public String getSecurityGroupDesc() {
        return this.SecurityGroupDesc;
    }

    /**
     * Set The remarks for the security group. The maximum length is 100 characters.
     * @param SecurityGroupDesc The remarks for the security group. The maximum length is 100 characters.
     */
    public void setSecurityGroupDesc(String SecurityGroupDesc) {
        this.SecurityGroupDesc = SecurityGroupDesc;
    }

    /**
     * Get The project id is 0 by default. You can query this in the project management page of the Qcloud console. 
     * @return ProjectId The project id is 0 by default. You can query this in the project management page of the Qcloud console.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set The project id is 0 by default. You can query this in the project management page of the Qcloud console.
     * @param ProjectId The project id is 0 by default. You can query this in the project management page of the Qcloud console.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Whether it is the default security group (which cannot be deleted). 
     * @return IsDefault Whether it is the default security group (which cannot be deleted).
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default security group (which cannot be deleted).
     * @param IsDefault Whether it is the default security group (which cannot be deleted).
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Security group creation time. 
     * @return CreatedTime Security group creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Security group creation time.
     * @param CreatedTime Security group creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupDesc", this.SecurityGroupDesc);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

