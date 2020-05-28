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

public class DomainDetailInfo extends AbstractModel{

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
    * Acceleration domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain name CNAME.
Note: this field may return null, indicating that no valid values can be obtained.
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
    * Origin server configuration.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * IP blacklist/whitelist configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * IP access limit configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpFreqLimit")
    @Expose
    private IpFreqLimit IpFreqLimit;

    /**
    * Origin server response header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * Node caching configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * Caching rule configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * HTTPS configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * Domain name blockage status. Valid values: normal (normal), overdue (service is suspended due to arrears), quota (trial traffic package is used up), malicious (malicious user), ddos (DDoS attack), idle (no traffic), unlicensed (no ICP filing), capping (bandwidth cap reached), readonly (read-only).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Disable")
    @Expose
    private String Disable;

    /**
    * Forced access protocol redirection configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Acceleration region. Valid values: mainland, overseas, global.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Domain name lock status. normal: not locked; global: globally locked.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Readonly")
    @Expose
    private String Readonly;

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
     * Get Acceleration domain name. 
     * @return Domain Acceleration domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Acceleration domain name.
     * @param Domain Acceleration domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain name CNAME.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Cname Domain name CNAME.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set Domain name CNAME.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Cname Domain name CNAME.
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Origin server configuration. 
     * @return Origin Origin server configuration.
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server configuration.
     * @param Origin Origin server configuration.
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get IP blacklist/whitelist configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IpFilter IP blacklist/whitelist configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP blacklist/whitelist configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IpFilter IP blacklist/whitelist configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get IP access limit configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IpFreqLimit IP access limit configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public IpFreqLimit getIpFreqLimit() {
        return this.IpFreqLimit;
    }

    /**
     * Set IP access limit configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IpFreqLimit IP access limit configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIpFreqLimit(IpFreqLimit IpFreqLimit) {
        this.IpFreqLimit = IpFreqLimit;
    }

    /**
     * Get Origin server response header configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResponseHeader Origin server response header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set Origin server response header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResponseHeader Origin server response header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get Node caching configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CacheKey Node caching configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set Node caching configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CacheKey Node caching configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get Caching rule configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Cache Caching rule configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set Caching rule configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Cache Caching rule configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get HTTPS configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Https HTTPS configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set HTTPS configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Https HTTPS configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get Domain name blockage status. Valid values: normal (normal), overdue (service is suspended due to arrears), quota (trial traffic package is used up), malicious (malicious user), ddos (DDoS attack), idle (no traffic), unlicensed (no ICP filing), capping (bandwidth cap reached), readonly (read-only).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Disable Domain name blockage status. Valid values: normal (normal), overdue (service is suspended due to arrears), quota (trial traffic package is used up), malicious (malicious user), ddos (DDoS attack), idle (no traffic), unlicensed (no ICP filing), capping (bandwidth cap reached), readonly (read-only).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDisable() {
        return this.Disable;
    }

    /**
     * Set Domain name blockage status. Valid values: normal (normal), overdue (service is suspended due to arrears), quota (trial traffic package is used up), malicious (malicious user), ddos (DDoS attack), idle (no traffic), unlicensed (no ICP filing), capping (bandwidth cap reached), readonly (read-only).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Disable Domain name blockage status. Valid values: normal (normal), overdue (service is suspended due to arrears), quota (trial traffic package is used up), malicious (malicious user), ddos (DDoS attack), idle (no traffic), unlicensed (no ICP filing), capping (bandwidth cap reached), readonly (read-only).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDisable(String Disable) {
        this.Disable = Disable;
    }

    /**
     * Get Forced access protocol redirection configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ForceRedirect Forced access protocol redirection configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Forced access protocol redirection configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ForceRedirect Forced access protocol redirection configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Acceleration region. Valid values: mainland, overseas, global.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Area Acceleration region. Valid values: mainland, overseas, global.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region. Valid values: mainland, overseas, global.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Area Acceleration region. Valid values: mainland, overseas, global.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Domain name lock status. normal: not locked; global: globally locked.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Readonly Domain name lock status. normal: not locked; global: globally locked.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getReadonly() {
        return this.Readonly;
    }

    /**
     * Set Domain name lock status. normal: not locked; global: globally locked.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Readonly Domain name lock status. normal: not locked; global: globally locked.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReadonly(String Readonly) {
        this.Readonly = Readonly;
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
        this.setParamObj(map, prefix + "IpFilter.", this.IpFilter);
        this.setParamObj(map, prefix + "IpFreqLimit.", this.IpFreqLimit);
        this.setParamObj(map, prefix + "ResponseHeader.", this.ResponseHeader);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamSimple(map, prefix + "Disable", this.Disable);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Readonly", this.Readonly);

    }
}

