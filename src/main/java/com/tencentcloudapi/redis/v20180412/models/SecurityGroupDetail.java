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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupDetail extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Security group creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Security group ID
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Security group name
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * Security group remarks
    */
    @SerializedName("SecurityGroupRemark")
    @Expose
    private String SecurityGroupRemark;

    /**
    * Inbound rules of the security group, which control the access source to the database.
    */
    @SerializedName("InboundRule")
    @Expose
    private SecurityGroupsInboundAndOutbound [] InboundRule;

    /**
    * Security group outbound rule
    */
    @SerializedName("OutboundRule")
    @Expose
    private SecurityGroupsInboundAndOutbound [] OutboundRule;

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
     * Get Security group creation time 
     * @return CreateTime Security group creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Security group creation time
     * @param CreateTime Security group creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Security group ID 
     * @return SecurityGroupId Security group ID
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group ID
     * @param SecurityGroupId Security group ID
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Security group name 
     * @return SecurityGroupName Security group name
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * Set Security group name
     * @param SecurityGroupName Security group name
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * Get Security group remarks 
     * @return SecurityGroupRemark Security group remarks
     */
    public String getSecurityGroupRemark() {
        return this.SecurityGroupRemark;
    }

    /**
     * Set Security group remarks
     * @param SecurityGroupRemark Security group remarks
     */
    public void setSecurityGroupRemark(String SecurityGroupRemark) {
        this.SecurityGroupRemark = SecurityGroupRemark;
    }

    /**
     * Get Inbound rules of the security group, which control the access source to the database. 
     * @return InboundRule Inbound rules of the security group, which control the access source to the database.
     */
    public SecurityGroupsInboundAndOutbound [] getInboundRule() {
        return this.InboundRule;
    }

    /**
     * Set Inbound rules of the security group, which control the access source to the database.
     * @param InboundRule Inbound rules of the security group, which control the access source to the database.
     */
    public void setInboundRule(SecurityGroupsInboundAndOutbound [] InboundRule) {
        this.InboundRule = InboundRule;
    }

    /**
     * Get Security group outbound rule 
     * @return OutboundRule Security group outbound rule
     */
    public SecurityGroupsInboundAndOutbound [] getOutboundRule() {
        return this.OutboundRule;
    }

    /**
     * Set Security group outbound rule
     * @param OutboundRule Security group outbound rule
     */
    public void setOutboundRule(SecurityGroupsInboundAndOutbound [] OutboundRule) {
        this.OutboundRule = OutboundRule;
    }

    public SecurityGroupDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupDetail(SecurityGroupDetail source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        if (source.InboundRule != null) {
            this.InboundRule = new SecurityGroupsInboundAndOutbound[source.InboundRule.length];
            for (int i = 0; i < source.InboundRule.length; i++) {
                this.InboundRule[i] = new SecurityGroupsInboundAndOutbound(source.InboundRule[i]);
            }
        }
        if (source.OutboundRule != null) {
            this.OutboundRule = new SecurityGroupsInboundAndOutbound[source.OutboundRule.length];
            for (int i = 0; i < source.OutboundRule.length; i++) {
                this.OutboundRule[i] = new SecurityGroupsInboundAndOutbound(source.OutboundRule[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupRemark", this.SecurityGroupRemark);
        this.setParamArrayObj(map, prefix + "InboundRule.", this.InboundRule);
        this.setParamArrayObj(map, prefix + "OutboundRule.", this.OutboundRule);

    }
}

