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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerCertInfo extends AbstractModel {

    /**
    * ID of the server certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Alias of the certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Type of the certificate. Values:
<li>`default`: Default certificate</lil>
<li>`upload`: Specified certificate</li>
<li>`managed`: Tencent Cloud-managed certificate</li>
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Time when the certificate expires.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Time when the certificate is deployed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeployTime")
    @Expose
    private String DeployTime;

    /**
    * Signature algorithm.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SignAlgo")
    @Expose
    private String SignAlgo;

    /**
    * Domain name of the certificate.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CommonName")
    @Expose
    private String CommonName;

    /**
     * Get ID of the server certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CertId ID of the server certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set ID of the server certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CertId ID of the server certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Alias of the certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Alias Alias of the certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Alias of the certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Alias Alias of the certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Type of the certificate. Values:
<li>`default`: Default certificate</lil>
<li>`upload`: Specified certificate</li>
<li>`managed`: Tencent Cloud-managed certificate</li>
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Type Type of the certificate. Values:
<li>`default`: Default certificate</lil>
<li>`upload`: Specified certificate</li>
<li>`managed`: Tencent Cloud-managed certificate</li>
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the certificate. Values:
<li>`default`: Default certificate</lil>
<li>`upload`: Specified certificate</li>
<li>`managed`: Tencent Cloud-managed certificate</li>
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Type Type of the certificate. Values:
<li>`default`: Default certificate</lil>
<li>`upload`: Specified certificate</li>
<li>`managed`: Tencent Cloud-managed certificate</li>
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Time when the certificate expires.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Time when the certificate expires.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Time when the certificate expires.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Time when the certificate expires.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Time when the certificate is deployed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeployTime Time when the certificate is deployed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDeployTime() {
        return this.DeployTime;
    }

    /**
     * Set Time when the certificate is deployed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeployTime Time when the certificate is deployed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeployTime(String DeployTime) {
        this.DeployTime = DeployTime;
    }

    /**
     * Get Signature algorithm.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SignAlgo Signature algorithm.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSignAlgo() {
        return this.SignAlgo;
    }

    /**
     * Set Signature algorithm.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SignAlgo Signature algorithm.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSignAlgo(String SignAlgo) {
        this.SignAlgo = SignAlgo;
    }

    /**
     * Get Domain name of the certificate.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CommonName Domain name of the certificate.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCommonName() {
        return this.CommonName;
    }

    /**
     * Set Domain name of the certificate.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CommonName Domain name of the certificate.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCommonName(String CommonName) {
        this.CommonName = CommonName;
    }

    public ServerCertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerCertInfo(ServerCertInfo source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.DeployTime != null) {
            this.DeployTime = new String(source.DeployTime);
        }
        if (source.SignAlgo != null) {
            this.SignAlgo = new String(source.SignAlgo);
        }
        if (source.CommonName != null) {
            this.CommonName = new String(source.CommonName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "DeployTime", this.DeployTime);
        this.setParamSimple(map, prefix + "SignAlgo", this.SignAlgo);
        this.setParamSimple(map, prefix + "CommonName", this.CommonName);

    }
}

