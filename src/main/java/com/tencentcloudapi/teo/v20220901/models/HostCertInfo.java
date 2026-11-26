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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostCertInfo extends AbstractModel {

    /**
    * Server certificate ID.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Certificate remark name.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Certificate type. Valid values:
<li>default: default certificate;</li>
<li>upload: user upload;</li>
<li>managed: Tencent Cloud hosted.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Certificate expiration time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Certificate deployment time.
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
    * Certificate status. Valid values:
<li>deployed: Deployed;</li>
<li>processing: deploying;</li>
<li>applying: application in progress.</li>
<li>failed: Application failed;</li>
<li>issued: failed to bind.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Server certificate ID. 
     * @return CertId Server certificate ID.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Server certificate ID.
     * @param CertId Server certificate ID.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Certificate remark name. 
     * @return Alias Certificate remark name.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Certificate remark name.
     * @param Alias Certificate remark name.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Certificate type. Valid values:
<li>default: default certificate;</li>
<li>upload: user upload;</li>
<li>managed: Tencent Cloud hosted.</li> 
     * @return Type Certificate type. Valid values:
<li>default: default certificate;</li>
<li>upload: user upload;</li>
<li>managed: Tencent Cloud hosted.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Certificate type. Valid values:
<li>default: default certificate;</li>
<li>upload: user upload;</li>
<li>managed: Tencent Cloud hosted.</li>
     * @param Type Certificate type. Valid values:
<li>default: default certificate;</li>
<li>upload: user upload;</li>
<li>managed: Tencent Cloud hosted.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get Certificate deployment time. 
     * @return DeployTime Certificate deployment time.
     */
    public String getDeployTime() {
        return this.DeployTime;
    }

    /**
     * Set Certificate deployment time.
     * @param DeployTime Certificate deployment time.
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
     * Get Certificate status. Valid values:
<li>deployed: Deployed;</li>
<li>processing: deploying;</li>
<li>applying: application in progress.</li>
<li>failed: Application failed;</li>
<li>issued: failed to bind.</li> 
     * @return Status Certificate status. Valid values:
<li>deployed: Deployed;</li>
<li>processing: deploying;</li>
<li>applying: application in progress.</li>
<li>failed: Application failed;</li>
<li>issued: failed to bind.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Certificate status. Valid values:
<li>deployed: Deployed;</li>
<li>processing: deploying;</li>
<li>applying: application in progress.</li>
<li>failed: Application failed;</li>
<li>issued: failed to bind.</li>
     * @param Status Certificate status. Valid values:
<li>deployed: Deployed;</li>
<li>processing: deploying;</li>
<li>applying: application in progress.</li>
<li>failed: Application failed;</li>
<li>issued: failed to bind.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public HostCertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostCertInfo(HostCertInfo source) {
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

