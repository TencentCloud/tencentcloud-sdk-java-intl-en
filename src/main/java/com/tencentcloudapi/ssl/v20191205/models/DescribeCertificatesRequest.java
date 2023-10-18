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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificatesRequest extends AbstractModel {

    /**
    * Pagination offset, starting from 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page. Default value: `20`. Maximum value: `1000`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Keyword for search, which can be a certificate ID, alias, or domain name, for example, a8xHcaIs
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Certificate type. `CA`: client certificate; `SVR`: server certificate
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Sorting by expiration time. `DESC`: descending; `ASC`: ascending
    */
    @SerializedName("ExpirationSort")
    @Expose
    private String ExpirationSort;

    /**
    * Certificate status. `0`: Reviewing; `1`: Approved; `2`: Unapproved; `3`: Expired; `4`: DNS record added; `5`: Enterprise-grade certificate, pending submission; `6`: Canceling order; `7`: Canceled; `8`: Information submitted, pending confirmation letter upload; `9`: Revoking certificate; `10`: Revoked; `11`: Reissuing; `12`: Pending revocation confirmation letter upload; `13`: Pending information submission for the free certificate.
    */
    @SerializedName("CertificateStatus")
    @Expose
    private Long [] CertificateStatus;

    /**
    * Whether the certificate can be deployed. `1`: yes; `0`: no
    */
    @SerializedName("Deployable")
    @Expose
    private Long Deployable;

    /**
    * Whether to filter uploaded hosted certificates. `1`: Yes; `0`: No.
    */
    @SerializedName("Upload")
    @Expose
    private Long Upload;

    /**
    * Whether to filter renewable certificates. `1`: Yes; `0`: No.
    */
    @SerializedName("Renew")
    @Expose
    private Long Renew;

    /**
    * Filter by source. `upload`: Uploaded certificate; `buy`: Tencent Cloud certificate. If this parameter is left empty, all certificates will be queried.
    */
    @SerializedName("FilterSource")
    @Expose
    private String FilterSource;

    /**
    * Whether to filter Chinese SM certificates. `1`: Yes; `0`: No.
    */
    @SerializedName("IsSM")
    @Expose
    private Long IsSM;

    /**
    * Whether to filter expiring certificates. `1`: Yes; `0`: No.
    */
    @SerializedName("FilterExpiring")
    @Expose
    private Long FilterExpiring;

    /**
    * Whether the certificate can be hosted. Valid values: `1` for yes and `0` for no.
    */
    @SerializedName("Hostable")
    @Expose
    private Long Hostable;

    /**
     * Get Pagination offset, starting from 0 
     * @return Offset Pagination offset, starting from 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, starting from 0
     * @param Offset Pagination offset, starting from 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. Default value: `20`. Maximum value: `1000`. 
     * @return Limit Number of entries per page. Default value: `20`. Maximum value: `1000`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Default value: `20`. Maximum value: `1000`.
     * @param Limit Number of entries per page. Default value: `20`. Maximum value: `1000`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Keyword for search, which can be a certificate ID, alias, or domain name, for example, a8xHcaIs 
     * @return SearchKey Keyword for search, which can be a certificate ID, alias, or domain name, for example, a8xHcaIs
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Keyword for search, which can be a certificate ID, alias, or domain name, for example, a8xHcaIs
     * @param SearchKey Keyword for search, which can be a certificate ID, alias, or domain name, for example, a8xHcaIs
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Certificate type. `CA`: client certificate; `SVR`: server certificate 
     * @return CertificateType Certificate type. `CA`: client certificate; `SVR`: server certificate
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set Certificate type. `CA`: client certificate; `SVR`: server certificate
     * @param CertificateType Certificate type. `CA`: client certificate; `SVR`: server certificate
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

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
     * Get Sorting by expiration time. `DESC`: descending; `ASC`: ascending 
     * @return ExpirationSort Sorting by expiration time. `DESC`: descending; `ASC`: ascending
     */
    public String getExpirationSort() {
        return this.ExpirationSort;
    }

    /**
     * Set Sorting by expiration time. `DESC`: descending; `ASC`: ascending
     * @param ExpirationSort Sorting by expiration time. `DESC`: descending; `ASC`: ascending
     */
    public void setExpirationSort(String ExpirationSort) {
        this.ExpirationSort = ExpirationSort;
    }

    /**
     * Get Certificate status. `0`: Reviewing; `1`: Approved; `2`: Unapproved; `3`: Expired; `4`: DNS record added; `5`: Enterprise-grade certificate, pending submission; `6`: Canceling order; `7`: Canceled; `8`: Information submitted, pending confirmation letter upload; `9`: Revoking certificate; `10`: Revoked; `11`: Reissuing; `12`: Pending revocation confirmation letter upload; `13`: Pending information submission for the free certificate. 
     * @return CertificateStatus Certificate status. `0`: Reviewing; `1`: Approved; `2`: Unapproved; `3`: Expired; `4`: DNS record added; `5`: Enterprise-grade certificate, pending submission; `6`: Canceling order; `7`: Canceled; `8`: Information submitted, pending confirmation letter upload; `9`: Revoking certificate; `10`: Revoked; `11`: Reissuing; `12`: Pending revocation confirmation letter upload; `13`: Pending information submission for the free certificate.
     */
    public Long [] getCertificateStatus() {
        return this.CertificateStatus;
    }

    /**
     * Set Certificate status. `0`: Reviewing; `1`: Approved; `2`: Unapproved; `3`: Expired; `4`: DNS record added; `5`: Enterprise-grade certificate, pending submission; `6`: Canceling order; `7`: Canceled; `8`: Information submitted, pending confirmation letter upload; `9`: Revoking certificate; `10`: Revoked; `11`: Reissuing; `12`: Pending revocation confirmation letter upload; `13`: Pending information submission for the free certificate.
     * @param CertificateStatus Certificate status. `0`: Reviewing; `1`: Approved; `2`: Unapproved; `3`: Expired; `4`: DNS record added; `5`: Enterprise-grade certificate, pending submission; `6`: Canceling order; `7`: Canceled; `8`: Information submitted, pending confirmation letter upload; `9`: Revoking certificate; `10`: Revoked; `11`: Reissuing; `12`: Pending revocation confirmation letter upload; `13`: Pending information submission for the free certificate.
     */
    public void setCertificateStatus(Long [] CertificateStatus) {
        this.CertificateStatus = CertificateStatus;
    }

    /**
     * Get Whether the certificate can be deployed. `1`: yes; `0`: no 
     * @return Deployable Whether the certificate can be deployed. `1`: yes; `0`: no
     */
    public Long getDeployable() {
        return this.Deployable;
    }

    /**
     * Set Whether the certificate can be deployed. `1`: yes; `0`: no
     * @param Deployable Whether the certificate can be deployed. `1`: yes; `0`: no
     */
    public void setDeployable(Long Deployable) {
        this.Deployable = Deployable;
    }

    /**
     * Get Whether to filter uploaded hosted certificates. `1`: Yes; `0`: No. 
     * @return Upload Whether to filter uploaded hosted certificates. `1`: Yes; `0`: No.
     */
    public Long getUpload() {
        return this.Upload;
    }

    /**
     * Set Whether to filter uploaded hosted certificates. `1`: Yes; `0`: No.
     * @param Upload Whether to filter uploaded hosted certificates. `1`: Yes; `0`: No.
     */
    public void setUpload(Long Upload) {
        this.Upload = Upload;
    }

    /**
     * Get Whether to filter renewable certificates. `1`: Yes; `0`: No. 
     * @return Renew Whether to filter renewable certificates. `1`: Yes; `0`: No.
     */
    public Long getRenew() {
        return this.Renew;
    }

    /**
     * Set Whether to filter renewable certificates. `1`: Yes; `0`: No.
     * @param Renew Whether to filter renewable certificates. `1`: Yes; `0`: No.
     */
    public void setRenew(Long Renew) {
        this.Renew = Renew;
    }

    /**
     * Get Filter by source. `upload`: Uploaded certificate; `buy`: Tencent Cloud certificate. If this parameter is left empty, all certificates will be queried. 
     * @return FilterSource Filter by source. `upload`: Uploaded certificate; `buy`: Tencent Cloud certificate. If this parameter is left empty, all certificates will be queried.
     */
    public String getFilterSource() {
        return this.FilterSource;
    }

    /**
     * Set Filter by source. `upload`: Uploaded certificate; `buy`: Tencent Cloud certificate. If this parameter is left empty, all certificates will be queried.
     * @param FilterSource Filter by source. `upload`: Uploaded certificate; `buy`: Tencent Cloud certificate. If this parameter is left empty, all certificates will be queried.
     */
    public void setFilterSource(String FilterSource) {
        this.FilterSource = FilterSource;
    }

    /**
     * Get Whether to filter Chinese SM certificates. `1`: Yes; `0`: No. 
     * @return IsSM Whether to filter Chinese SM certificates. `1`: Yes; `0`: No.
     */
    public Long getIsSM() {
        return this.IsSM;
    }

    /**
     * Set Whether to filter Chinese SM certificates. `1`: Yes; `0`: No.
     * @param IsSM Whether to filter Chinese SM certificates. `1`: Yes; `0`: No.
     */
    public void setIsSM(Long IsSM) {
        this.IsSM = IsSM;
    }

    /**
     * Get Whether to filter expiring certificates. `1`: Yes; `0`: No. 
     * @return FilterExpiring Whether to filter expiring certificates. `1`: Yes; `0`: No.
     */
    public Long getFilterExpiring() {
        return this.FilterExpiring;
    }

    /**
     * Set Whether to filter expiring certificates. `1`: Yes; `0`: No.
     * @param FilterExpiring Whether to filter expiring certificates. `1`: Yes; `0`: No.
     */
    public void setFilterExpiring(Long FilterExpiring) {
        this.FilterExpiring = FilterExpiring;
    }

    /**
     * Get Whether the certificate can be hosted. Valid values: `1` for yes and `0` for no. 
     * @return Hostable Whether the certificate can be hosted. Valid values: `1` for yes and `0` for no.
     */
    public Long getHostable() {
        return this.Hostable;
    }

    /**
     * Set Whether the certificate can be hosted. Valid values: `1` for yes and `0` for no.
     * @param Hostable Whether the certificate can be hosted. Valid values: `1` for yes and `0` for no.
     */
    public void setHostable(Long Hostable) {
        this.Hostable = Hostable;
    }

    public DescribeCertificatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificatesRequest(DescribeCertificatesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new String(source.CertificateType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ExpirationSort != null) {
            this.ExpirationSort = new String(source.ExpirationSort);
        }
        if (source.CertificateStatus != null) {
            this.CertificateStatus = new Long[source.CertificateStatus.length];
            for (int i = 0; i < source.CertificateStatus.length; i++) {
                this.CertificateStatus[i] = new Long(source.CertificateStatus[i]);
            }
        }
        if (source.Deployable != null) {
            this.Deployable = new Long(source.Deployable);
        }
        if (source.Upload != null) {
            this.Upload = new Long(source.Upload);
        }
        if (source.Renew != null) {
            this.Renew = new Long(source.Renew);
        }
        if (source.FilterSource != null) {
            this.FilterSource = new String(source.FilterSource);
        }
        if (source.IsSM != null) {
            this.IsSM = new Long(source.IsSM);
        }
        if (source.FilterExpiring != null) {
            this.FilterExpiring = new Long(source.FilterExpiring);
        }
        if (source.Hostable != null) {
            this.Hostable = new Long(source.Hostable);
        }
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
        this.setParamSimple(map, prefix + "Upload", this.Upload);
        this.setParamSimple(map, prefix + "Renew", this.Renew);
        this.setParamSimple(map, prefix + "FilterSource", this.FilterSource);
        this.setParamSimple(map, prefix + "IsSM", this.IsSM);
        this.setParamSimple(map, prefix + "FilterExpiring", this.FilterExpiring);
        this.setParamSimple(map, prefix + "Hostable", this.Hostable);

    }
}

