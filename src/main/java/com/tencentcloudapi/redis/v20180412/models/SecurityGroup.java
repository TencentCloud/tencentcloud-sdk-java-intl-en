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

public class SecurityGroup extends AbstractModel {

    /**
    * Creation time in the format of yyyy-mm-dd hh:mm:ss.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Security group ID.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Security group name.
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * Security group remarks.
    */
    @SerializedName("SecurityGroupRemark")
    @Expose
    private String SecurityGroupRemark;

    /**
    * Outbound rule.
    */
    @SerializedName("Outbound")
    @Expose
    private Outbound [] Outbound;

    /**
    * Inbound rule.
    */
    @SerializedName("Inbound")
    @Expose
    private Inbound [] Inbound;

    /**
     * Get Creation time in the format of yyyy-mm-dd hh:mm:ss. 
     * @return CreateTime Creation time in the format of yyyy-mm-dd hh:mm:ss.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in the format of yyyy-mm-dd hh:mm:ss.
     * @param CreateTime Creation time in the format of yyyy-mm-dd hh:mm:ss.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Security group ID. 
     * @return SecurityGroupId Security group ID.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group ID.
     * @param SecurityGroupId Security group ID.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Security group name. 
     * @return SecurityGroupName Security group name.
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * Set Security group name.
     * @param SecurityGroupName Security group name.
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * Get Security group remarks. 
     * @return SecurityGroupRemark Security group remarks.
     */
    public String getSecurityGroupRemark() {
        return this.SecurityGroupRemark;
    }

    /**
     * Set Security group remarks.
     * @param SecurityGroupRemark Security group remarks.
     */
    public void setSecurityGroupRemark(String SecurityGroupRemark) {
        this.SecurityGroupRemark = SecurityGroupRemark;
    }

    /**
     * Get Outbound rule. 
     * @return Outbound Outbound rule.
     */
    public Outbound [] getOutbound() {
        return this.Outbound;
    }

    /**
     * Set Outbound rule.
     * @param Outbound Outbound rule.
     */
    public void setOutbound(Outbound [] Outbound) {
        this.Outbound = Outbound;
    }

    /**
     * Get Inbound rule. 
     * @return Inbound Inbound rule.
     */
    public Inbound [] getInbound() {
        return this.Inbound;
    }

    /**
     * Set Inbound rule.
     * @param Inbound Inbound rule.
     */
    public void setInbound(Inbound [] Inbound) {
        this.Inbound = Inbound;
    }

    public SecurityGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroup(SecurityGroup source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
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
        if (source.Outbound != null) {
            this.Outbound = new Outbound[source.Outbound.length];
            for (int i = 0; i < source.Outbound.length; i++) {
                this.Outbound[i] = new Outbound(source.Outbound[i]);
            }
        }
        if (source.Inbound != null) {
            this.Inbound = new Inbound[source.Inbound.length];
            for (int i = 0; i < source.Inbound.length; i++) {
                this.Inbound[i] = new Inbound(source.Inbound[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupRemark", this.SecurityGroupRemark);
        this.setParamArrayObj(map, prefix + "Outbound.", this.Outbound);
        this.setParamArrayObj(map, prefix + "Inbound.", this.Inbound);

    }
}

