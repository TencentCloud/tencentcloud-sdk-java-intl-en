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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CredentialStatus extends AbstractModel {

    /**
    * The credential ID.
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * The credential status. `0`: Invalid; `1`: Valid.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The DID of the issuer.
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * A summary of the credential.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
    * The credential signature.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * The last updated timestamp.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeStamp")
    @Expose
    private Long TimeStamp;

    /**
     * Get The credential ID. 
     * @return CredentialId The credential ID.
     */
    public String getCredentialId() {
        return this.CredentialId;
    }

    /**
     * Set The credential ID.
     * @param CredentialId The credential ID.
     */
    public void setCredentialId(String CredentialId) {
        this.CredentialId = CredentialId;
    }

    /**
     * Get The credential status. `0`: Invalid; `1`: Valid. 
     * @return Status The credential status. `0`: Invalid; `1`: Valid.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The credential status. `0`: Invalid; `1`: Valid.
     * @param Status The credential status. `0`: Invalid; `1`: Valid.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The DID of the issuer. 
     * @return Issuer The DID of the issuer.
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set The DID of the issuer.
     * @param Issuer The DID of the issuer.
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get A summary of the credential.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Digest A summary of the credential.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDigest() {
        return this.Digest;
    }

    /**
     * Set A summary of the credential.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Digest A summary of the credential.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDigest(String Digest) {
        this.Digest = Digest;
    }

    /**
     * Get The credential signature.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Signature The credential signature.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set The credential signature.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Signature The credential signature.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Get The last updated timestamp.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TimeStamp The last updated timestamp.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getTimeStamp() {
        return this.TimeStamp;
    }

    /**
     * Set The last updated timestamp.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TimeStamp The last updated timestamp.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimeStamp(Long TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public CredentialStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CredentialStatus(CredentialStatus source) {
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Digest != null) {
            this.Digest = new String(source.Digest);
        }
        if (source.Signature != null) {
            this.Signature = new String(source.Signature);
        }
        if (source.TimeStamp != null) {
            this.TimeStamp = new Long(source.TimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Digest", this.Digest);
        this.setParamSimple(map, prefix + "Signature", this.Signature);
        this.setParamSimple(map, prefix + "TimeStamp", this.TimeStamp);

    }
}

