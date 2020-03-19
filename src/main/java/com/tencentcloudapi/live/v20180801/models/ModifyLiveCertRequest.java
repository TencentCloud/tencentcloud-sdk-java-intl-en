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

public class ModifyLiveCertRequest extends AbstractModel{

    /**
    * Certificate ID.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Certificate type. 0: user-added certificate, 1: Tencent Cloud-hosted certificate.
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * Certificate name.
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * Certificate content, i.e., public key.
    */
    @SerializedName("HttpsCrt")
    @Expose
    private String HttpsCrt;

    /**
    * Private key.
    */
    @SerializedName("HttpsKey")
    @Expose
    private String HttpsKey;

    /**
    * Description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Certificate ID. 
     * @return CertId Certificate ID.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Certificate ID.
     * @param CertId Certificate ID.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Certificate type. 0: user-added certificate, 1: Tencent Cloud-hosted certificate. 
     * @return CertType Certificate type. 0: user-added certificate, 1: Tencent Cloud-hosted certificate.
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set Certificate type. 0: user-added certificate, 1: Tencent Cloud-hosted certificate.
     * @param CertType Certificate type. 0: user-added certificate, 1: Tencent Cloud-hosted certificate.
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
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
     * Get Certificate content, i.e., public key. 
     * @return HttpsCrt Certificate content, i.e., public key.
     */
    public String getHttpsCrt() {
        return this.HttpsCrt;
    }

    /**
     * Set Certificate content, i.e., public key.
     * @param HttpsCrt Certificate content, i.e., public key.
     */
    public void setHttpsCrt(String HttpsCrt) {
        this.HttpsCrt = HttpsCrt;
    }

    /**
     * Get Private key. 
     * @return HttpsKey Private key.
     */
    public String getHttpsKey() {
        return this.HttpsKey;
    }

    /**
     * Set Private key.
     * @param HttpsKey Private key.
     */
    public void setHttpsKey(String HttpsKey) {
        this.HttpsKey = HttpsKey;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "HttpsCrt", this.HttpsCrt);
        this.setParamSimple(map, prefix + "HttpsKey", this.HttpsKey);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

