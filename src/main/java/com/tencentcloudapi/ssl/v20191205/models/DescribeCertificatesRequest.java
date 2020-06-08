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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificatesRequest extends AbstractModel{

    /**
    * Pagination offset, starting from 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of certificates on each page. The default value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Keyword for search, which can be a certificate ID, alias, or domain name. For example, a8xHcaIs.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Certificate type. CA: client certificate; SVR: server certificate.
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Sorting by expiration time. DESC: descending; ASC: ascending.
    */
    @SerializedName("ExpirationSort")
    @Expose
    private String ExpirationSort;

    /**
    * Certificate status.
    */
    @SerializedName("CertificateStatus")
    @Expose
    private Long [] CertificateStatus;

    /**
    * Whether the certificate can be deployed. 1: yes; 0: no.
    */
    @SerializedName("Deployable")
    @Expose
    private Long Deployable;

    /**
     * Get Pagination offset, starting from 0. 
     * @return Offset Pagination offset, starting from 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, starting from 0.
     * @param Offset Pagination offset, starting from 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of certificates on each page. The default value is 20. 
     * @return Limit Number of certificates on each page. The default value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of certificates on each page. The default value is 20.
     * @param Limit Number of certificates on each page. The default value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Keyword for search, which can be a certificate ID, alias, or domain name. For example, a8xHcaIs. 
     * @return SearchKey Keyword for search, which can be a certificate ID, alias, or domain name. For example, a8xHcaIs.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Keyword for search, which can be a certificate ID, alias, or domain name. For example, a8xHcaIs.
     * @param SearchKey Keyword for search, which can be a certificate ID, alias, or domain name. For example, a8xHcaIs.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Certificate type. CA: client certificate; SVR: server certificate. 
     * @return CertificateType Certificate type. CA: client certificate; SVR: server certificate.
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set Certificate type. CA: client certificate; SVR: server certificate.
     * @param CertificateType Certificate type. CA: client certificate; SVR: server certificate.
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
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
     * Get Sorting by expiration time. DESC: descending; ASC: ascending. 
     * @return ExpirationSort Sorting by expiration time. DESC: descending; ASC: ascending.
     */
    public String getExpirationSort() {
        return this.ExpirationSort;
    }

    /**
     * Set Sorting by expiration time. DESC: descending; ASC: ascending.
     * @param ExpirationSort Sorting by expiration time. DESC: descending; ASC: ascending.
     */
    public void setExpirationSort(String ExpirationSort) {
        this.ExpirationSort = ExpirationSort;
    }

    /**
     * Get Certificate status. 
     * @return CertificateStatus Certificate status.
     */
    public Long [] getCertificateStatus() {
        return this.CertificateStatus;
    }

    /**
     * Set Certificate status.
     * @param CertificateStatus Certificate status.
     */
    public void setCertificateStatus(Long [] CertificateStatus) {
        this.CertificateStatus = CertificateStatus;
    }

    /**
     * Get Whether the certificate can be deployed. 1: yes; 0: no. 
     * @return Deployable Whether the certificate can be deployed. 1: yes; 0: no.
     */
    public Long getDeployable() {
        return this.Deployable;
    }

    /**
     * Set Whether the certificate can be deployed. 1: yes; 0: no.
     * @param Deployable Whether the certificate can be deployed. 1: yes; 0: no.
     */
    public void setDeployable(Long Deployable) {
        this.Deployable = Deployable;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ExpirationSort", this.ExpirationSort);
        this.setParamArraySimple(map, prefix + "CertificateStatus.", this.CertificateStatus);
        this.setParamSimple(map, prefix + "Deployable", this.Deployable);

    }
}

