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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveDomainCertBindings extends AbstractModel {

    /**
    * The domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * The remarks for the certificate. This parameter is the same as `CertName`.
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
    * The certificate type.
0: Self-owned certificate
1: Tencent Cloud-hosted certificate
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * Whether HTTPS is enabled.
1: Enabled
0: Disabled
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The certificate expiration time.
Note: Beijing time (UTC+8) is used.
    */
    @SerializedName("CertExpireTime")
    @Expose
    private String CertExpireTime;

    /**
    * The certificate ID.
    */
    @SerializedName("CertId")
    @Expose
    private Long CertId;

    /**
    * The SSL certificate ID assigned by Tencent Cloud.
    */
    @SerializedName("CloudCertId")
    @Expose
    private String CloudCertId;

    /**
    * The last updated time.
Note: Beijing time (UTC+8) is used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get The domain name. 
     * @return DomainName The domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The domain name.
     * @param DomainName The domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get The remarks for the certificate. This parameter is the same as `CertName`. 
     * @return CertificateAlias The remarks for the certificate. This parameter is the same as `CertName`.
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * Set The remarks for the certificate. This parameter is the same as `CertName`.
     * @param CertificateAlias The remarks for the certificate. This parameter is the same as `CertName`.
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    /**
     * Get The certificate type.
0: Self-owned certificate
1: Tencent Cloud-hosted certificate 
     * @return CertType The certificate type.
0: Self-owned certificate
1: Tencent Cloud-hosted certificate
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set The certificate type.
0: Self-owned certificate
1: Tencent Cloud-hosted certificate
     * @param CertType The certificate type.
0: Self-owned certificate
1: Tencent Cloud-hosted certificate
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get Whether HTTPS is enabled.
1: Enabled
0: Disabled 
     * @return Status Whether HTTPS is enabled.
1: Enabled
0: Disabled
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Whether HTTPS is enabled.
1: Enabled
0: Disabled
     * @param Status Whether HTTPS is enabled.
1: Enabled
0: Disabled
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The certificate expiration time.
Note: Beijing time (UTC+8) is used. 
     * @return CertExpireTime The certificate expiration time.
Note: Beijing time (UTC+8) is used.
     */
    public String getCertExpireTime() {
        return this.CertExpireTime;
    }

    /**
     * Set The certificate expiration time.
Note: Beijing time (UTC+8) is used.
     * @param CertExpireTime The certificate expiration time.
Note: Beijing time (UTC+8) is used.
     */
    public void setCertExpireTime(String CertExpireTime) {
        this.CertExpireTime = CertExpireTime;
    }

    /**
     * Get The certificate ID. 
     * @return CertId The certificate ID.
     */
    public Long getCertId() {
        return this.CertId;
    }

    /**
     * Set The certificate ID.
     * @param CertId The certificate ID.
     */
    public void setCertId(Long CertId) {
        this.CertId = CertId;
    }

    /**
     * Get The SSL certificate ID assigned by Tencent Cloud. 
     * @return CloudCertId The SSL certificate ID assigned by Tencent Cloud.
     */
    public String getCloudCertId() {
        return this.CloudCertId;
    }

    /**
     * Set The SSL certificate ID assigned by Tencent Cloud.
     * @param CloudCertId The SSL certificate ID assigned by Tencent Cloud.
     */
    public void setCloudCertId(String CloudCertId) {
        this.CloudCertId = CloudCertId;
    }

    /**
     * Get The last updated time.
Note: Beijing time (UTC+8) is used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime The last updated time.
Note: Beijing time (UTC+8) is used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The last updated time.
Note: Beijing time (UTC+8) is used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime The last updated time.
Note: Beijing time (UTC+8) is used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public LiveDomainCertBindings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveDomainCertBindings(LiveDomainCertBindings source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.CertificateAlias != null) {
            this.CertificateAlias = new String(source.CertificateAlias);
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CertExpireTime != null) {
            this.CertExpireTime = new String(source.CertExpireTime);
        }
        if (source.CertId != null) {
            this.CertId = new Long(source.CertId);
        }
        if (source.CloudCertId != null) {
            this.CloudCertId = new String(source.CloudCertId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "CertificateAlias", this.CertificateAlias);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CertExpireTime", this.CertExpireTime);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CloudCertId", this.CloudCertId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

