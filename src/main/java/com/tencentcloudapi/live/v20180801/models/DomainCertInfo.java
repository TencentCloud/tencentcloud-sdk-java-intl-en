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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainCertInfo extends AbstractModel {

    /**
    * Certificate ID.
    */
    @SerializedName("CertId")
    @Expose
    private Long CertId;

    /**
    * Certificate name.
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * Description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The creation time in UTC format.
Note: Beijing time (UTC+8) is used.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Certificate content.
    */
    @SerializedName("HttpsCrt")
    @Expose
    private String HttpsCrt;

    /**
    * Certificate type.
0: user-added certificate
1: Tencent Cloud-hosted certificate.
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * The certificate expiration time in UTC format.
Note: Beijing time (UTC+8) is used.
    */
    @SerializedName("CertExpireTime")
    @Expose
    private String CertExpireTime;

    /**
    * Domain name that uses this certificate.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Certificate status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * List of domain names in the certificate.
["*.x.com"] for example.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CertDomains")
    @Expose
    private String [] CertDomains;

    /**
    * Tencent Cloud SSL certificate ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CloudCertId")
    @Expose
    private String CloudCertId;

    /**
     * Get Certificate ID. 
     * @return CertId Certificate ID.
     */
    public Long getCertId() {
        return this.CertId;
    }

    /**
     * Set Certificate ID.
     * @param CertId Certificate ID.
     */
    public void setCertId(Long CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Certificate name. 
     * @return CertName Certificate name.
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set Certificate name.
     * @param CertName Certificate name.
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get Description. 
     * @return Description Description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
     * @param Description Description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The creation time in UTC format.
Note: Beijing time (UTC+8) is used. 
     * @return CreateTime The creation time in UTC format.
Note: Beijing time (UTC+8) is used.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time in UTC format.
Note: Beijing time (UTC+8) is used.
     * @param CreateTime The creation time in UTC format.
Note: Beijing time (UTC+8) is used.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Certificate content. 
     * @return HttpsCrt Certificate content.
     */
    public String getHttpsCrt() {
        return this.HttpsCrt;
    }

    /**
     * Set Certificate content.
     * @param HttpsCrt Certificate content.
     */
    public void setHttpsCrt(String HttpsCrt) {
        this.HttpsCrt = HttpsCrt;
    }

    /**
     * Get Certificate type.
0: user-added certificate
1: Tencent Cloud-hosted certificate. 
     * @return CertType Certificate type.
0: user-added certificate
1: Tencent Cloud-hosted certificate.
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set Certificate type.
0: user-added certificate
1: Tencent Cloud-hosted certificate.
     * @param CertType Certificate type.
0: user-added certificate
1: Tencent Cloud-hosted certificate.
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get The certificate expiration time in UTC format.
Note: Beijing time (UTC+8) is used. 
     * @return CertExpireTime The certificate expiration time in UTC format.
Note: Beijing time (UTC+8) is used.
     */
    public String getCertExpireTime() {
        return this.CertExpireTime;
    }

    /**
     * Set The certificate expiration time in UTC format.
Note: Beijing time (UTC+8) is used.
     * @param CertExpireTime The certificate expiration time in UTC format.
Note: Beijing time (UTC+8) is used.
     */
    public void setCertExpireTime(String CertExpireTime) {
        this.CertExpireTime = CertExpireTime;
    }

    /**
     * Get Domain name that uses this certificate. 
     * @return DomainName Domain name that uses this certificate.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name that uses this certificate.
     * @param DomainName Domain name that uses this certificate.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Certificate status. 
     * @return Status Certificate status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Certificate status.
     * @param Status Certificate status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get List of domain names in the certificate.
["*.x.com"] for example.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CertDomains List of domain names in the certificate.
["*.x.com"] for example.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getCertDomains() {
        return this.CertDomains;
    }

    /**
     * Set List of domain names in the certificate.
["*.x.com"] for example.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CertDomains List of domain names in the certificate.
["*.x.com"] for example.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCertDomains(String [] CertDomains) {
        this.CertDomains = CertDomains;
    }

    /**
     * Get Tencent Cloud SSL certificate ID.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CloudCertId Tencent Cloud SSL certificate ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCloudCertId() {
        return this.CloudCertId;
    }

    /**
     * Set Tencent Cloud SSL certificate ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CloudCertId Tencent Cloud SSL certificate ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCloudCertId(String CloudCertId) {
        this.CloudCertId = CloudCertId;
    }

    public DomainCertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainCertInfo(DomainCertInfo source) {
        if (source.CertId != null) {
            this.CertId = new Long(source.CertId);
        }
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.HttpsCrt != null) {
            this.HttpsCrt = new String(source.HttpsCrt);
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.CertExpireTime != null) {
            this.CertExpireTime = new String(source.CertExpireTime);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CertDomains != null) {
            this.CertDomains = new String[source.CertDomains.length];
            for (int i = 0; i < source.CertDomains.length; i++) {
                this.CertDomains[i] = new String(source.CertDomains[i]);
            }
        }
        if (source.CloudCertId != null) {
            this.CloudCertId = new String(source.CloudCertId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "HttpsCrt", this.HttpsCrt);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "CertExpireTime", this.CertExpireTime);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "CertDomains.", this.CertDomains);
        this.setParamSimple(map, prefix + "CloudCertId", this.CloudCertId);

    }
}

