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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateInfo extends AbstractModel {

    /**
    * Specifies the id in SSL certificate management.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Certificate expiration time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Specifies the domain name bound to the certificate.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Certificate status: 0 indicates issued.
Expiring soon.
Not activated.
3. indicates expired.
Indicates the unavailability.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Certificate type: 0: root certificate, 1: server certificate.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * TencentCloud: SSL certificate. Default: TDMQ official Default certificate.
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * Certificate addition/update time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Specifies the id in SSL certificate management. 
     * @return CertificateId Specifies the id in SSL certificate management.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Specifies the id in SSL certificate management.
     * @param CertificateId Specifies the id in SSL certificate management.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Certificate expiration time. 
     * @return ExpireTime Certificate expiration time.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Certificate expiration time.
     * @param ExpireTime Certificate expiration time.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Specifies the domain name bound to the certificate. 
     * @return DomainName Specifies the domain name bound to the certificate.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Specifies the domain name bound to the certificate.
     * @param DomainName Specifies the domain name bound to the certificate.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Certificate status: 0 indicates issued.
Expiring soon.
Not activated.
3. indicates expired.
Indicates the unavailability. 
     * @return Status Certificate status: 0 indicates issued.
Expiring soon.
Not activated.
3. indicates expired.
Indicates the unavailability.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Certificate status: 0 indicates issued.
Expiring soon.
Not activated.
3. indicates expired.
Indicates the unavailability.
     * @param Status Certificate status: 0 indicates issued.
Expiring soon.
Not activated.
3. indicates expired.
Indicates the unavailability.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Certificate type: 0: root certificate, 1: server certificate. 
     * @return Type Certificate type: 0: root certificate, 1: server certificate.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Certificate type: 0: root certificate, 1: server certificate.
     * @param Type Certificate type: 0: root certificate, 1: server certificate.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get TencentCloud: SSL certificate. Default: TDMQ official Default certificate. 
     * @return Origin TencentCloud: SSL certificate. Default: TDMQ official Default certificate.
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set TencentCloud: SSL certificate. Default: TDMQ official Default certificate.
     * @param Origin TencentCloud: SSL certificate. Default: TDMQ official Default certificate.
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Certificate addition/update time. 
     * @return ModifyTime Certificate addition/update time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Certificate addition/update time.
     * @param ModifyTime Certificate addition/update time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public CertificateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateInfo(CertificateInfo source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

