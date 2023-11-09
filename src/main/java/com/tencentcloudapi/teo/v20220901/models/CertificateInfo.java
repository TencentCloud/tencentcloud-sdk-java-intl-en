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

public class CertificateInfo extends AbstractModel {

    /**
    * ID of the server certificate.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Alias of the certificate.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Type of the certificate. Values:
<li>`default`: Default certificate</li>
<li>`upload`: Specified certificate</li>
<li>`managed`: Tencent Cloud-managed certificate</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The certificate expiration time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Time when the certificate is deployed.
    */
    @SerializedName("DeployTime")
    @Expose
    private String DeployTime;

    /**
    * Signature algorithm.
    */
    @SerializedName("SignAlgo")
    @Expose
    private String SignAlgo;

    /**
    * Status of the certificate. Values:
u200c<li>`deployed`: The deployment has completed</li>
u200c<li>`processing`: Deployment in progress</li>
u200c<li>`applying`: Application in progress</li>
u200c<li>`failed`: Application rejected</li>
<li>`issued`: Binding failed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get ID of the server certificate. 
     * @return CertId ID of the server certificate.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set ID of the server certificate.
     * @param CertId ID of the server certificate.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Alias of the certificate. 
     * @return Alias Alias of the certificate.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Alias of the certificate.
     * @param Alias Alias of the certificate.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Type of the certificate. Values:
<li>`default`: Default certificate</li>
<li>`upload`: Specified certificate</li>
<li>`managed`: Tencent Cloud-managed certificate</li> 
     * @return Type Type of the certificate. Values:
<li>`default`: Default certificate</li>
<li>`upload`: Specified certificate</li>
<li>`managed`: Tencent Cloud-managed certificate</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the certificate. Values:
<li>`default`: Default certificate</li>
<li>`upload`: Specified certificate</li>
<li>`managed`: Tencent Cloud-managed certificate</li>
     * @param Type Type of the certificate. Values:
<li>`default`: Default certificate</li>
<li>`upload`: Specified certificate</li>
<li>`managed`: Tencent Cloud-managed certificate</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The certificate expiration time. 
     * @return ExpireTime The certificate expiration time.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The certificate expiration time.
     * @param ExpireTime The certificate expiration time.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Time when the certificate is deployed. 
     * @return DeployTime Time when the certificate is deployed.
     */
    public String getDeployTime() {
        return this.DeployTime;
    }

    /**
     * Set Time when the certificate is deployed.
     * @param DeployTime Time when the certificate is deployed.
     */
    public void setDeployTime(String DeployTime) {
        this.DeployTime = DeployTime;
    }

    /**
     * Get Signature algorithm. 
     * @return SignAlgo Signature algorithm.
     */
    public String getSignAlgo() {
        return this.SignAlgo;
    }

    /**
     * Set Signature algorithm.
     * @param SignAlgo Signature algorithm.
     */
    public void setSignAlgo(String SignAlgo) {
        this.SignAlgo = SignAlgo;
    }

    /**
     * Get Status of the certificate. Values:
u200c<li>`deployed`: The deployment has completed</li>
u200c<li>`processing`: Deployment in progress</li>
u200c<li>`applying`: Application in progress</li>
u200c<li>`failed`: Application rejected</li>
<li>`issued`: Binding failed.</li> 
     * @return Status Status of the certificate. Values:
u200c<li>`deployed`: The deployment has completed</li>
u200c<li>`processing`: Deployment in progress</li>
u200c<li>`applying`: Application in progress</li>
u200c<li>`failed`: Application rejected</li>
<li>`issued`: Binding failed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the certificate. Values:
u200c<li>`deployed`: The deployment has completed</li>
u200c<li>`processing`: Deployment in progress</li>
u200c<li>`applying`: Application in progress</li>
u200c<li>`failed`: Application rejected</li>
<li>`issued`: Binding failed.</li>
     * @param Status Status of the certificate. Values:
u200c<li>`deployed`: The deployment has completed</li>
u200c<li>`processing`: Deployment in progress</li>
u200c<li>`applying`: Application in progress</li>
u200c<li>`failed`: Application rejected</li>
<li>`issued`: Binding failed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CertificateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateInfo(CertificateInfo source) {
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

