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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainCertInfo extends AbstractModel{

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
    * Creation time in UTC format.
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
    * Certificate expiration time in UTC format.
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
    * Certificate status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get Creation time in UTC format. 
     * @return CreateTime Creation time in UTC format.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in UTC format.
     * @param CreateTime Creation time in UTC format.
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
     * Get Certificate expiration time in UTC format. 
     * @return CertExpireTime Certificate expiration time in UTC format.
     */
    public String getCertExpireTime() {
        return this.CertExpireTime;
    }

    /**
     * Set Certificate expiration time in UTC format.
     * @param CertExpireTime Certificate expiration time in UTC format.
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
     * Get Certificate status 
     * @return Status Certificate status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Certificate status
     * @param Status Certificate status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    }
}

