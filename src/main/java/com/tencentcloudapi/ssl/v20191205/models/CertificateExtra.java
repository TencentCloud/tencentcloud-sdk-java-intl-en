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

public class CertificateExtra extends AbstractModel {

    /**
    * Number of domain names which can be associated with the certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainNumber")
    @Expose
    private String DomainNumber;

    /**
    * Original certificate ID
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
    * New ID of the new certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReplacedFor")
    @Expose
    private String ReplacedFor;

    /**
    * Certificate ID of the new order
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewOrder")
    @Expose
    private String RenewOrder;

    /**
    * Whether the certificate is a Chinese SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SMCert")
    @Expose
    private Long SMCert;

    /**
    * Company type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CompanyType")
    @Expose
    private Long CompanyType;

    /**
     * Get Number of domain names which can be associated with the certificate
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DomainNumber Number of domain names which can be associated with the certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDomainNumber() {
        return this.DomainNumber;
    }

    /**
     * Set Number of domain names which can be associated with the certificate
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DomainNumber Number of domain names which can be associated with the certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainNumber(String DomainNumber) {
        this.DomainNumber = DomainNumber;
    }

    /**
     * Get Original certificate ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OriginCertificateId Original certificate ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginCertificateId() {
        return this.OriginCertificateId;
    }

    /**
     * Set Original certificate ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OriginCertificateId Original certificate ID
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
     * Get New ID of the new certificate
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReplacedFor New ID of the new certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getReplacedFor() {
        return this.ReplacedFor;
    }

    /**
     * Set New ID of the new certificate
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReplacedFor New ID of the new certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReplacedFor(String ReplacedFor) {
        this.ReplacedFor = ReplacedFor;
    }

    /**
     * Get Certificate ID of the new order
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RenewOrder Certificate ID of the new order
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRenewOrder() {
        return this.RenewOrder;
    }

    /**
     * Set Certificate ID of the new order
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RenewOrder Certificate ID of the new order
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewOrder(String RenewOrder) {
        this.RenewOrder = RenewOrder;
    }

    /**
     * Get Whether the certificate is a Chinese SM certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SMCert Whether the certificate is a Chinese SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSMCert() {
        return this.SMCert;
    }

    /**
     * Set Whether the certificate is a Chinese SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SMCert Whether the certificate is a Chinese SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSMCert(Long SMCert) {
        this.SMCert = SMCert;
    }

    /**
     * Get Company type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CompanyType Company type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCompanyType() {
        return this.CompanyType;
    }

    /**
     * Set Company type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CompanyType Company type
Note: This field may return null, indicating that no valid value can be obtained.
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

