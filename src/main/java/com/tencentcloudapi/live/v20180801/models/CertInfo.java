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

public class CertInfo extends AbstractModel {

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
1: Tencent Cloud-hosted certificate
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
    * List of domain names that use this certificate.
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

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
1: Tencent Cloud-hosted certificate 
     * @return CertType Certificate type.
0: user-added certificate
1: Tencent Cloud-hosted certificate
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set Certificate type.
0: user-added certificate
1: Tencent Cloud-hosted certificate
     * @param CertType Certificate type.
0: user-added certificate
1: Tencent Cloud-hosted certificate
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
     * Get List of domain names that use this certificate. 
     * @return DomainList List of domain names that use this certificate.
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set List of domain names that use this certificate.
     * @param DomainList List of domain names that use this certificate.
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    public CertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertInfo(CertInfo source) {
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
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
            }
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
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);

    }
}

