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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadCertificateRequest extends AbstractModel{

    /**
    * Public key of the certificate
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * Private key content. This parameter is required when the certificate type is SVR, and not required when the certificate type is CA.
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * Certificate type. `CA`: client certificate; `SVR`: server certificate. The default value is SVR.
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * Alias
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 
    */
    @SerializedName("CertificateUse")
    @Expose
    private String CertificateUse;

    /**
     * Get Public key of the certificate 
     * @return CertificatePublicKey Public key of the certificate
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set Public key of the certificate
     * @param CertificatePublicKey Public key of the certificate
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get Private key content. This parameter is required when the certificate type is SVR, and not required when the certificate type is CA. 
     * @return CertificatePrivateKey Private key content. This parameter is required when the certificate type is SVR, and not required when the certificate type is CA.
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set Private key content. This parameter is required when the certificate type is SVR, and not required when the certificate type is CA.
     * @param CertificatePrivateKey Private key content. This parameter is required when the certificate type is SVR, and not required when the certificate type is CA.
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get Certificate type. `CA`: client certificate; `SVR`: server certificate. The default value is SVR. 
     * @return CertificateType Certificate type. `CA`: client certificate; `SVR`: server certificate. The default value is SVR.
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set Certificate type. `CA`: client certificate; `SVR`: server certificate. The default value is SVR.
     * @param CertificateType Certificate type. `CA`: client certificate; `SVR`: server certificate. The default value is SVR.
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get Alias 
     * @return Alias Alias
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Alias
     * @param Alias Alias
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
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
     * Get  
     * @return CertificateUse 
     */
    public String getCertificateUse() {
        return this.CertificateUse;
    }

    /**
     * Set 
     * @param CertificateUse 
     */
    public void setCertificateUse(String CertificateUse) {
        this.CertificateUse = CertificateUse;
    }

    public UploadCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadCertificateRequest(UploadCertificateRequest source) {
        if (source.CertificatePublicKey != null) {
            this.CertificatePublicKey = new String(source.CertificatePublicKey);
        }
        if (source.CertificatePrivateKey != null) {
            this.CertificatePrivateKey = new String(source.CertificatePrivateKey);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new String(source.CertificateType);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.CertificateUse != null) {
            this.CertificateUse = new String(source.CertificateUse);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificatePublicKey", this.CertificatePublicKey);
        this.setParamSimple(map, prefix + "CertificatePrivateKey", this.CertificatePrivateKey);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CertificateUse", this.CertificateUse);

    }
}

