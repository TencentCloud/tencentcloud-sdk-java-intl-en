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

public class CertificateExtra extends AbstractModel {

    /**
    * Quantity of configurable domain names for the certificate.
    */
    @SerializedName("DomainNumber")
    @Expose
    private String DomainNumber;

    /**
    * Renew the original certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginCertificateId")
    @Expose
    private String OriginCertificateId;

    /**
    * Original ID of the new certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReplacedBy")
    @Expose
    private String ReplacedBy;

    /**
    * Reissue certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReplacedFor")
    @Expose
    private String ReplacedFor;

    /**
    * Renewal certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewOrder")
    @Expose
    private String RenewOrder;

    /**
    * Whether it is a China SM certificate.
    */
    @SerializedName("SMCert")
    @Expose
    private Long SMCert;

    /**
    * Company type, valid values: 1 (individual); 2 (company).
    */
    @SerializedName("CompanyType")
    @Expose
    private Long CompanyType;

    /**
     * Get Quantity of configurable domain names for the certificate. 
     * @return DomainNumber Quantity of configurable domain names for the certificate.
     */
    public String getDomainNumber() {
        return this.DomainNumber;
    }

    /**
     * Set Quantity of configurable domain names for the certificate.
     * @param DomainNumber Quantity of configurable domain names for the certificate.
     */
    public void setDomainNumber(String DomainNumber) {
        this.DomainNumber = DomainNumber;
    }

    /**
     * Get Renew the original certificate id.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OriginCertificateId Renew the original certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginCertificateId() {
        return this.OriginCertificateId;
    }

    /**
     * Set Renew the original certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OriginCertificateId Renew the original certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginCertificateId(String OriginCertificateId) {
        this.OriginCertificateId = OriginCertificateId;
    }

    /**
     * Get Original ID of the new certificate
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReplacedBy Original ID of the new certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getReplacedBy() {
        return this.ReplacedBy;
    }

    /**
     * Set Original ID of the new certificate
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReplacedBy Original ID of the new certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReplacedBy(String ReplacedBy) {
        this.ReplacedBy = ReplacedBy;
    }

    /**
     * Get Reissue certificate id.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReplacedFor Reissue certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getReplacedFor() {
        return this.ReplacedFor;
    }

    /**
     * Set Reissue certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReplacedFor Reissue certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReplacedFor(String ReplacedFor) {
        this.ReplacedFor = ReplacedFor;
    }

    /**
     * Get Renewal certificate id.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RenewOrder Renewal certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRenewOrder() {
        return this.RenewOrder;
    }

    /**
     * Set Renewal certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RenewOrder Renewal certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewOrder(String RenewOrder) {
        this.RenewOrder = RenewOrder;
    }

    /**
     * Get Whether it is a China SM certificate. 
     * @return SMCert Whether it is a China SM certificate.
     */
    public Long getSMCert() {
        return this.SMCert;
    }

    /**
     * Set Whether it is a China SM certificate.
     * @param SMCert Whether it is a China SM certificate.
     */
    public void setSMCert(Long SMCert) {
        this.SMCert = SMCert;
    }

    /**
     * Get Company type, valid values: 1 (individual); 2 (company). 
     * @return CompanyType Company type, valid values: 1 (individual); 2 (company).
     */
    public Long getCompanyType() {
        return this.CompanyType;
    }

    /**
     * Set Company type, valid values: 1 (individual); 2 (company).
     * @param CompanyType Company type, valid values: 1 (individual); 2 (company).
     */
    public void setCompanyType(Long CompanyType) {
        this.CompanyType = CompanyType;
    }

    public CertificateExtra() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateExtra(CertificateExtra source) {
        if (source.DomainNumber != null) {
            this.DomainNumber = new String(source.DomainNumber);
        }
        if (source.OriginCertificateId != null) {
            this.OriginCertificateId = new String(source.OriginCertificateId);
        }
        if (source.ReplacedBy != null) {
            this.ReplacedBy = new String(source.ReplacedBy);
        }
        if (source.ReplacedFor != null) {
            this.ReplacedFor = new String(source.ReplacedFor);
        }
        if (source.RenewOrder != null) {
            this.RenewOrder = new String(source.RenewOrder);
        }
        if (source.SMCert != null) {
            this.SMCert = new Long(source.SMCert);
        }
        if (source.CompanyType != null) {
            this.CompanyType = new Long(source.CompanyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainNumber", this.DomainNumber);
        this.setParamSimple(map, prefix + "OriginCertificateId", this.OriginCertificateId);
        this.setParamSimple(map, prefix + "ReplacedBy", this.ReplacedBy);
        this.setParamSimple(map, prefix + "ReplacedFor", this.ReplacedFor);
        this.setParamSimple(map, prefix + "RenewOrder", this.RenewOrder);
        this.setParamSimple(map, prefix + "SMCert", this.SMCert);
        this.setParamSimple(map, prefix + "CompanyType", this.CompanyType);

    }
}

