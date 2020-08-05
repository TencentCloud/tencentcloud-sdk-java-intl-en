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

public class AddEcdnDomainRequest extends AbstractModel{

    /**
    * Domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Origin server configuration.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * Domain name acceleration region. Valid values: mainland (acceleration in Mainland China), overseas (acceleration outside Mainland China), global (global acceleration).
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Project ID. Default value: 0.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * IP block/allowlist configuration.
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * IP access limit configuration.
    */
    @SerializedName("IpFreqLimit")
    @Expose
    private IpFreqLimit IpFreqLimit;

    /**
    * Origin server response header configuration.
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * Node caching configuration.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * Caching rule configuration.
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * HTTPS configuration.
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * Forced access protocol redirection configuration.
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
     * Get Domain name. 
     * @return Domain Domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name.
     * @param Domain Domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
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
     * Get Domain name acceleration region. Valid values: mainland (acceleration in Mainland China), overseas (acceleration outside Mainland China), global (global acceleration). 
     * @return Area Domain name acceleration region. Valid values: mainland (acceleration in Mainland China), overseas (acceleration outside Mainland China), global (global acceleration).
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Domain name acceleration region. Valid values: mainland (acceleration in Mainland China), overseas (acceleration outside Mainland China), global (global acceleration).
     * @param Area Domain name acceleration region. Valid values: mainland (acceleration in Mainland China), overseas (acceleration outside Mainland China), global (global acceleration).
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Project ID. Default value: 0. 
     * @return ProjectId Project ID. Default value: 0.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. Default value: 0.
     * @param ProjectId Project ID. Default value: 0.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get IP block/allowlist configuration. 
     * @return IpFilter IP block/allowlist configuration.
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP block/allowlist configuration.
     * @param IpFilter IP block/allowlist configuration.
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get IP access limit configuration. 
     * @return IpFreqLimit IP access limit configuration.
     */
    public IpFreqLimit getIpFreqLimit() {
        return this.IpFreqLimit;
    }

    /**
     * Set IP access limit configuration.
     * @param IpFreqLimit IP access limit configuration.
     */
    public void setIpFreqLimit(IpFreqLimit IpFreqLimit) {
        this.IpFreqLimit = IpFreqLimit;
    }

    /**
     * Get Origin server response header configuration. 
     * @return ResponseHeader Origin server response header configuration.
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set Origin server response header configuration.
     * @param ResponseHeader Origin server response header configuration.
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get Node caching configuration. 
     * @return CacheKey Node caching configuration.
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set Node caching configuration.
     * @param CacheKey Node caching configuration.
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get Caching rule configuration. 
     * @return Cache Caching rule configuration.
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set Caching rule configuration.
     * @param Cache Caching rule configuration.
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get HTTPS configuration. 
     * @return Https HTTPS configuration.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set HTTPS configuration.
     * @param Https HTTPS configuration.
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get Forced access protocol redirection configuration. 
     * @return ForceRedirect Forced access protocol redirection configuration.
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Forced access protocol redirection configuration.
     * @param ForceRedirect Forced access protocol redirection configuration.
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "IpFilter.", this.IpFilter);
        this.setParamObj(map, prefix + "IpFreqLimit.", this.IpFreqLimit);
        this.setParamObj(map, prefix + "ResponseHeader.", this.ResponseHeader);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);

    }
}

