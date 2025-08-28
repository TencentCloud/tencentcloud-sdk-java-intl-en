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
    * 
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("InboundSet")
    @Expose
    private SecurityGroupPolicy [] InboundSet;

    /**
    * 
    */
    @SerializedName("OutboundSet")
    @Expose
    private SecurityGroupPolicy [] OutboundSet;

    /**
    * 
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * 
    */
    @SerializedName("SecurityGroupRemark")
    @Expose
    private String SecurityGroupRemark;

    /**
     * Get  
     * @return ProjectId 
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 
     * @param ProjectId 
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return InboundSet 
     */
    public SecurityGroupPolicy [] getInboundSet() {
        return this.InboundSet;
    }

    /**
     * Set 
     * @param InboundSet 
     */
    public void setInboundSet(SecurityGroupPolicy [] InboundSet) {
        this.InboundSet = InboundSet;
    }

    /**
     * Get  
     * @return OutboundSet 
     */
    public SecurityGroupPolicy [] getOutboundSet() {
        return this.OutboundSet;
    }

    /**
     * Set 
     * @param OutboundSet 
     */
    public void setOutboundSet(SecurityGroupPolicy [] OutboundSet) {
        this.OutboundSet = OutboundSet;
    }

    /**
     * Get  
     * @return SecurityGroupId 
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 
     * @param SecurityGroupId 
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get  
     * @return SecurityGroupName 
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * Set 
     * @param SecurityGroupName 
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * Get  
     * @return SecurityGroupRemark 
     */
    public String getSecurityGroupRemark() {
        return this.SecurityGroupRemark;
    }

    /**
     * Set 
     * @param SecurityGroupRemark 
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

