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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroup extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Creation Time, Time format: yyyy-mm-dd hh:mm:ss
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Inbound Rules
    */
    @SerializedName("InboundSet")
    @Expose
    private SecurityGroupPolicy [] InboundSet;

    /**
    * Outbound Rules
    */
    @SerializedName("OutboundSet")
    @Expose
    private SecurityGroupPolicy [] OutboundSet;

    /**
    * Security Group ID
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Security Group Name
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * Security Group Remarks
    */
    @SerializedName("SecurityGroupRemark")
    @Expose
    private String SecurityGroupRemark;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Creation Time, Time format: yyyy-mm-dd hh:mm:ss 
     * @return CreateTime Creation Time, Time format: yyyy-mm-dd hh:mm:ss
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation Time, Time format: yyyy-mm-dd hh:mm:ss
     * @param CreateTime Creation Time, Time format: yyyy-mm-dd hh:mm:ss
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Inbound Rules 
     * @return InboundSet Inbound Rules
     */
    public SecurityGroupPolicy [] getInboundSet() {
        return this.InboundSet;
    }

    /**
     * Set Inbound Rules
     * @param InboundSet Inbound Rules
     */
    public void setInboundSet(SecurityGroupPolicy [] InboundSet) {
        this.InboundSet = InboundSet;
    }

    /**
     * Get Outbound Rules 
     * @return OutboundSet Outbound Rules
     */
    public SecurityGroupPolicy [] getOutboundSet() {
        return this.OutboundSet;
    }

    /**
     * Set Outbound Rules
     * @param OutboundSet Outbound Rules
     */
    public void setOutboundSet(SecurityGroupPolicy [] OutboundSet) {
        this.OutboundSet = OutboundSet;
    }

    /**
     * Get Security Group ID 
     * @return SecurityGroupId Security Group ID
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security Group ID
     * @param SecurityGroupId Security Group ID
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Security Group Name 
     * @return SecurityGroupName Security Group Name
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * Set Security Group Name
     * @param SecurityGroupName Security Group Name
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * Get Security Group Remarks 
     * @return SecurityGroupRemark Security Group Remarks
     */
    public String getSecurityGroupRemark() {
        return this.SecurityGroupRemark;
    }

    /**
     * Set Security Group Remarks
     * @param SecurityGroupRemark Security Group Remarks
     */
    public void setSecurityGroupRemark(String SecurityGroupRemark) {
        this.SecurityGroupRemark = SecurityGroupRemark;
    }

    public SecurityGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroup(SecurityGroup source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InboundSet != null) {
            this.InboundSet = new SecurityGroupPolicy[source.InboundSet.length];
            for (int i = 0; i < source.InboundSet.length; i++) {
                this.InboundSet[i] = new SecurityGroupPolicy(source.InboundSet[i]);
            }
        }
        if (source.OutboundSet != null) {
            this.OutboundSet = new SecurityGroupPolicy[source.OutboundSet.length];
            for (int i = 0; i < source.OutboundSet.length; i++) {
                this.OutboundSet[i] = new SecurityGroupPolicy(source.OutboundSet[i]);
            }
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.SecurityGroupName != null) {
            this.SecurityGroupName = new String(source.SecurityGroupName);
        }
        if (source.SecurityGroupRemark != null) {
            this.SecurityGroupRemark = new String(source.SecurityGroupRemark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "InboundSet.", this.InboundSet);
        this.setParamArrayObj(map, prefix + "OutboundSet.", this.OutboundSet);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupRemark", this.SecurityGroupRemark);

    }
}

