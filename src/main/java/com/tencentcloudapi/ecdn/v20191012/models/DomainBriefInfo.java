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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainBriefInfo extends AbstractModel{

    /**
    * Domain name ID.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Tencent Cloud account ID.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * CDN acceleration domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain name CNAME.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * Domain name status. Valid values: pending (reviewing), rejected (rejected), processing (deploying after approval), online (enabled), offline (disabled), deleted (deleted).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Domain name creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Domain name update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Origin server configuration details.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * Domain name blockage status. Valid values: normal (normal), overdue (service is suspended due to arrears), quota (trial traffic package is used up), malicious (malicious user), ddos (DDoS attack), idle (no traffic), unlicensed (no ICP filing), capping (bandwidth cap reached), readonly (read-only)
    */
    @SerializedName("Disable")
    @Expose
    private String Disable;

    /**
    * Acceleration region. Valid values: mainland, oversea, global.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Domain name lock status. normal: not locked; global: globally locked
    */
    @SerializedName("Readonly")
    @Expose
    private String Readonly;

    /**
    * Domain name tag
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
     * Get Domain name ID. 
     * @return ResourceId Domain name ID.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Domain name ID.
     * @param ResourceId Domain name ID.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Tencent Cloud account ID. 
     * @return AppId Tencent Cloud account ID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Tencent Cloud account ID.
     * @param AppId Tencent Cloud account ID.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get CDN acceleration domain name. 
     * @return Domain CDN acceleration domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set CDN acceleration domain name.
     * @param Domain CDN acceleration domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain name CNAME. 
     * @return Cname Domain name CNAME.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set Domain name CNAME.
     * @param Cname Domain name CNAME.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get Domain name status. Valid values: pending (reviewing), rejected (rejected), processing (deploying after approval), online (enabled), offline (disabled), deleted (deleted). 
     * @return Status Domain name status. Valid values: pending (reviewing), rejected (rejected), processing (deploying after approval), online (enabled), offline (disabled), deleted (deleted).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Domain name status. Valid values: pending (reviewing), rejected (rejected), processing (deploying after approval), online (enabled), offline (disabled), deleted (deleted).
     * @param Status Domain name status. Valid values: pending (reviewing), rejected (rejected), processing (deploying after approval), online (enabled), offline (disabled), deleted (deleted).
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get Domain name creation time. 
     * @return CreateTime Domain name creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Domain name creation time.
     * @param CreateTime Domain name creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Domain name update time. 
     * @return UpdateTime Domain name update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Domain name update time.
     * @param UpdateTime Domain name update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Origin server configuration details. 
     * @return Origin Origin server configuration details.
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server configuration details.
     * @param Origin Origin server configuration details.
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Domain name blockage status. Valid values: normal (normal), overdue (service is suspended due to arrears), quota (trial traffic package is used up), malicious (malicious user), ddos (DDoS attack), idle (no traffic), unlicensed (no ICP filing), capping (bandwidth cap reached), readonly (read-only) 
     * @return Disable Domain name blockage status. Valid values: normal (normal), overdue (service is suspended due to arrears), quota (trial traffic package is used up), malicious (malicious user), ddos (DDoS attack), idle (no traffic), unlicensed (no ICP filing), capping (bandwidth cap reached), readonly (read-only)
     */
    public String getDisable() {
        return this.Disable;
    }

    /**
     * Set Domain name blockage status. Valid values: normal (normal), overdue (service is suspended due to arrears), quota (trial traffic package is used up), malicious (malicious user), ddos (DDoS attack), idle (no traffic), unlicensed (no ICP filing), capping (bandwidth cap reached), readonly (read-only)
     * @param Disable Domain name blockage status. Valid values: normal (normal), overdue (service is suspended due to arrears), quota (trial traffic package is used up), malicious (malicious user), ddos (DDoS attack), idle (no traffic), unlicensed (no ICP filing), capping (bandwidth cap reached), readonly (read-only)
     */
    public void setDisable(String Disable) {
        this.Disable = Disable;
    }

    /**
     * Get Acceleration region. Valid values: mainland, oversea, global. 
     * @return Area Acceleration region. Valid values: mainland, oversea, global.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region. Valid values: mainland, oversea, global.
     * @param Area Acceleration region. Valid values: mainland, oversea, global.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Domain name lock status. normal: not locked; global: globally locked 
     * @return Readonly Domain name lock status. normal: not locked; global: globally locked
     */
    public String getReadonly() {
        return this.Readonly;
    }

    /**
     * Set Domain name lock status. normal: not locked; global: globally locked
     * @param Readonly Domain name lock status. normal: not locked; global: globally locked
     */
    public void setReadonly(String Readonly) {
        this.Readonly = Readonly;
    }

    /**
     * Get Domain name tag
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return Tag Domain name tag
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Domain name tag
Note: This field may return `null`, indicating that no valid value can be found.
     * @param Tag Domain name tag
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    public DomainBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainBriefInfo(DomainBriefInfo source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.Disable != null) {
            this.Disable = new String(source.Disable);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Readonly != null) {
            this.Readonly = new String(source.Readonly);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamSimple(map, prefix + "Disable", this.Disable);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Readonly", this.Readonly);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);

    }
}

