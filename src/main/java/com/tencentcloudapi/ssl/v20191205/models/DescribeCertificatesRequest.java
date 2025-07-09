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

public class DescribeCertificatesRequest extends AbstractModel {

    /**
    * Pagination offset, starting from 0. default is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items per page. default is 10. maximum value is 1000; values exceeding 1000 will be treated as 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Search keywords, supporting fuzzy match by certificate id, remark name, and certificate domain name.
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
    * Default sorting is by certificate application time in descending order. Sort by expiration date if the following values are passed: DESC for descending order of certificate expiration time, ASC for ascending order.
    */
    @SerializedName("ExpirationSort")
    @Expose
    private String ExpirationSort;

    /**
    * Certificate status: 0=under review, 1=approved, 2=review failed, 3=expired, 4=dns record added, 5=enterprise certificate, pending submission, 6=order cancellation in progress, 7=canceled, 8=documents submitted, pending upload of confirmation letter, 9=certificate revocation in progress, 10=revoked, 11=reissue in progress, 12=pending upload of revocation confirmation letter, 13=free certificate pending document submission, 14=refunded, 15=certificate migration in progress.
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
    * Filter certificates with specified tags.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * Whether to filter certificates pending issue: 1 for filtering, 0 and null for no filtering.
    */
    @SerializedName("IsPendingIssue")
    @Expose
    private Long IsPendingIssue;

    /**
    * Filter certificates by the specified certificate id, only supports certificate ids with permission.
    */
    @SerializedName("CertIds")
    @Expose
    private String [] CertIds;

    /**
     * Get Pagination offset, starting from 0. default is 0. 
     * @return Offset Pagination offset, starting from 0. default is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, starting from 0. default is 0.
     * @param Offset Pagination offset, starting from 0. default is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items per page. default is 10. maximum value is 1000; values exceeding 1000 will be treated as 1000. 
     * @return Limit Number of items per page. default is 10. maximum value is 1000; values exceeding 1000 will be treated as 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page. default is 10. maximum value is 1000; values exceeding 1000 will be treated as 1000.
     * @param Limit Number of items per page. default is 10. maximum value is 1000; values exceeding 1000 will be treated as 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Search keywords, supporting fuzzy match by certificate id, remark name, and certificate domain name. 
     * @return SearchKey Search keywords, supporting fuzzy match by certificate id, remark name, and certificate domain name.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search keywords, supporting fuzzy match by certificate id, remark name, and certificate domain name.
     * @param SearchKey Search keywords, supporting fuzzy match by certificate id, remark name, and certificate domain name.
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
     * Get Default sorting is by certificate application time in descending order. Sort by expiration date if the following values are passed: DESC for descending order of certificate expiration time, ASC for ascending order. 
     * @return ExpirationSort Default sorting is by certificate application time in descending order. Sort by expiration date if the following values are passed: DESC for descending order of certificate expiration time, ASC for ascending order.
     */
    public String getExpirationSort() {
        return this.ExpirationSort;
    }

    /**
     * Set Default sorting is by certificate application time in descending order. Sort by expiration date if the following values are passed: DESC for descending order of certificate expiration time, ASC for ascending order.
     * @param ExpirationSort Default sorting is by certificate application time in descending order. Sort by expiration date if the following values are passed: DESC for descending order of certificate expiration time, ASC for ascending order.
     */
    public void setExpirationSort(String ExpirationSort) {
        this.ExpirationSort = ExpirationSort;
    }

    /**
     * Get Certificate status: 0=under review, 1=approved, 2=review failed, 3=expired, 4=dns record added, 5=enterprise certificate, pending submission, 6=order cancellation in progress, 7=canceled, 8=documents submitted, pending upload of confirmation letter, 9=certificate revocation in progress, 10=revoked, 11=reissue in progress, 12=pending upload of revocation confirmation letter, 13=free certificate pending document submission, 14=refunded, 15=certificate migration in progress. 
     * @return CertificateStatus Certificate status: 0=under review, 1=approved, 2=review failed, 3=expired, 4=dns record added, 5=enterprise certificate, pending submission, 6=order cancellation in progress, 7=canceled, 8=documents submitted, pending upload of confirmation letter, 9=certificate revocation in progress, 10=revoked, 11=reissue in progress, 12=pending upload of revocation confirmation letter, 13=free certificate pending document submission, 14=refunded, 15=certificate migration in progress.
     */
    public Long [] getCertificateStatus() {
        return this.CertificateStatus;
    }

    /**
     * Set Certificate status: 0=under review, 1=approved, 2=review failed, 3=expired, 4=dns record added, 5=enterprise certificate, pending submission, 6=order cancellation in progress, 7=canceled, 8=documents submitted, pending upload of confirmation letter, 9=certificate revocation in progress, 10=revoked, 11=reissue in progress, 12=pending upload of revocation confirmation letter, 13=free certificate pending document submission, 14=refunded, 15=certificate migration in progress.
     * @param CertificateStatus Certificate status: 0=under review, 1=approved, 2=review failed, 3=expired, 4=dns record added, 5=enterprise certificate, pending submission, 6=order cancellation in progress, 7=canceled, 8=documents submitted, pending upload of confirmation letter, 9=certificate revocation in progress, 10=revoked, 11=reissue in progress, 12=pending upload of revocation confirmation letter, 13=free certificate pending document submission, 14=refunded, 15=certificate migration in progress.
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

    /**
     * Get Filter certificates with specified tags. 
     * @return Tags Filter certificates with specified tags.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Filter certificates with specified tags.
     * @param Tags Filter certificates with specified tags.
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether to filter certificates pending issue: 1 for filtering, 0 and null for no filtering. 
     * @return IsPendingIssue Whether to filter certificates pending issue: 1 for filtering, 0 and null for no filtering.
     */
    public Long getIsPendingIssue() {
        return this.IsPendingIssue;
    }

    /**
     * Set Whether to filter certificates pending issue: 1 for filtering, 0 and null for no filtering.
     * @param IsPendingIssue Whether to filter certificates pending issue: 1 for filtering, 0 and null for no filtering.
     */
    public void setIsPendingIssue(Long IsPendingIssue) {
        this.IsPendingIssue = IsPendingIssue;
    }

    /**
     * Get Filter certificates by the specified certificate id, only supports certificate ids with permission. 
     * @return CertIds Filter certificates by the specified certificate id, only supports certificate ids with permission.
     */
    public String [] getCertIds() {
        return this.CertIds;
    }

    /**
     * Set Filter certificates by the specified certificate id, only supports certificate ids with permission.
     * @param CertIds Filter certificates by the specified certificate id, only supports certificate ids with permission.
     */
    public void setCertIds(String [] CertIds) {
        this.CertIds = CertIds;
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
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.IsPendingIssue != null) {
            this.IsPendingIssue = new Long(source.IsPendingIssue);
        }
        if (source.CertIds != null) {
            this.CertIds = new String[source.CertIds.length];
            for (int i = 0; i < source.CertIds.length; i++) {
                this.CertIds[i] = new String(source.CertIds[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IsPendingIssue", this.IsPendingIssue);
        this.setParamArraySimple(map, prefix + "CertIds.", this.CertIds);

    }
}

