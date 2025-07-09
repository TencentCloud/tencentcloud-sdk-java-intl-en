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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostTeoInstanceListRequest extends AbstractModel {

    /**
    * The ID of the certificate to be deployed.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * The type of resource for certificate deployment.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Whether to query the cached results. Valid values: `1` (yes) and `0` (no). By default, the cached results within 30 minutes are queried.
    */
    @SerializedName("IsCache")
    @Expose
    private Long IsCache;

    /**
    * The list of filter parameters. FilterKey: domainMatch (query the list of instances with matching or non-matching domains). FilterValue: `1` (default; query the list of instances with matching domains) or `0` (query the list of instances with non-matching domains).
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The ID of the deployed certificate.
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * Paging offset. default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items per page. default: 10. maximum value: 200.	
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Asynchronous or not. 1 means yes, 0 means no. default: 0.
    */
    @SerializedName("AsyncCache")
    @Expose
    private Long AsyncCache;

    /**
     * Get The ID of the certificate to be deployed. 
     * @return CertificateId The ID of the certificate to be deployed.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set The ID of the certificate to be deployed.
     * @param CertificateId The ID of the certificate to be deployed.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get The type of resource for certificate deployment. 
     * @return ResourceType The type of resource for certificate deployment.
     * @deprecated
     */
    @Deprecated
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set The type of resource for certificate deployment.
     * @param ResourceType The type of resource for certificate deployment.
     * @deprecated
     */
    @Deprecated
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Whether to query the cached results. Valid values: `1` (yes) and `0` (no). By default, the cached results within 30 minutes are queried. 
     * @return IsCache Whether to query the cached results. Valid values: `1` (yes) and `0` (no). By default, the cached results within 30 minutes are queried.
     */
    public Long getIsCache() {
        return this.IsCache;
    }

    /**
     * Set Whether to query the cached results. Valid values: `1` (yes) and `0` (no). By default, the cached results within 30 minutes are queried.
     * @param IsCache Whether to query the cached results. Valid values: `1` (yes) and `0` (no). By default, the cached results within 30 minutes are queried.
     */
    public void setIsCache(Long IsCache) {
        this.IsCache = IsCache;
    }

    /**
     * Get The list of filter parameters. FilterKey: domainMatch (query the list of instances with matching or non-matching domains). FilterValue: `1` (default; query the list of instances with matching domains) or `0` (query the list of instances with non-matching domains). 
     * @return Filters The list of filter parameters. FilterKey: domainMatch (query the list of instances with matching or non-matching domains). FilterValue: `1` (default; query the list of instances with matching domains) or `0` (query the list of instances with non-matching domains).
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set The list of filter parameters. FilterKey: domainMatch (query the list of instances with matching or non-matching domains). FilterValue: `1` (default; query the list of instances with matching domains) or `0` (query the list of instances with non-matching domains).
     * @param Filters The list of filter parameters. FilterKey: domainMatch (query the list of instances with matching or non-matching domains). FilterValue: `1` (default; query the list of instances with matching domains) or `0` (query the list of instances with non-matching domains).
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The ID of the deployed certificate. 
     * @return OldCertificateId The ID of the deployed certificate.
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set The ID of the deployed certificate.
     * @param OldCertificateId The ID of the deployed certificate.
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get Paging offset. default value: 0. 
     * @return Offset Paging offset. default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset. default value: 0.
     * @param Offset Paging offset. default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items per page. default: 10. maximum value: 200.	 
     * @return Limit Number of items per page. default: 10. maximum value: 200.	
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page. default: 10. maximum value: 200.	
     * @param Limit Number of items per page. default: 10. maximum value: 200.	
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Asynchronous or not. 1 means yes, 0 means no. default: 0. 
     * @return AsyncCache Asynchronous or not. 1 means yes, 0 means no. default: 0.
     */
    public Long getAsyncCache() {
        return this.AsyncCache;
    }

    /**
     * Set Asynchronous or not. 1 means yes, 0 means no. default: 0.
     * @param AsyncCache Asynchronous or not. 1 means yes, 0 means no. default: 0.
     */
    public void setAsyncCache(Long AsyncCache) {
        this.AsyncCache = AsyncCache;
    }

    public DescribeHostTeoInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostTeoInstanceListRequest(DescribeHostTeoInstanceListRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.IsCache != null) {
            this.IsCache = new Long(source.IsCache);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AsyncCache != null) {
            this.AsyncCache = new Long(source.AsyncCache);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "IsCache", this.IsCache);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "AsyncCache", this.AsyncCache);

    }
}

