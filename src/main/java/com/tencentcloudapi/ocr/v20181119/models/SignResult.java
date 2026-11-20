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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignResult extends AbstractModel {

    /**
    * <p>Signature verification status. 1 indicates that the signature verification is passed.</p>
    */
    @SerializedName("VerifyStatus")
    @Expose
    private Long VerifyStatus;

    /**
    * <p>Signer name</p>
    */
    @SerializedName("SignerName")
    @Expose
    private String SignerName;

    /**
    * <p>Signature algorithm, such as SHA256withRSA</p>
    */
    @SerializedName("SignAlgorithm")
    @Expose
    private String SignAlgorithm;

    /**
    * <p>Signature time (Unix timestamp in milliseconds)</p>
    */
    @SerializedName("SignTime")
    @Expose
    private Long SignTime;

    /**
    * <p>Signature verification information</p>
    */
    @SerializedName("CertSn")
    @Expose
    private String CertSn;

    /**
     * Get <p>Signature verification status. 1 indicates that the signature verification is passed.</p> 
     * @return VerifyStatus <p>Signature verification status. 1 indicates that the signature verification is passed.</p>
     */
    public Long getVerifyStatus() {
        return this.VerifyStatus;
    }

    /**
     * Set <p>Signature verification status. 1 indicates that the signature verification is passed.</p>
     * @param VerifyStatus <p>Signature verification status. 1 indicates that the signature verification is passed.</p>
     */
    public void setVerifyStatus(Long VerifyStatus) {
        this.VerifyStatus = VerifyStatus;
    }

    /**
     * Get <p>Signer name</p> 
     * @return SignerName <p>Signer name</p>
     */
    public String getSignerName() {
        return this.SignerName;
    }

    /**
     * Set <p>Signer name</p>
     * @param SignerName <p>Signer name</p>
     */
    public void setSignerName(String SignerName) {
        this.SignerName = SignerName;
    }

    /**
     * Get <p>Signature algorithm, such as SHA256withRSA</p> 
     * @return SignAlgorithm <p>Signature algorithm, such as SHA256withRSA</p>
     */
    public String getSignAlgorithm() {
        return this.SignAlgorithm;
    }

    /**
     * Set <p>Signature algorithm, such as SHA256withRSA</p>
     * @param SignAlgorithm <p>Signature algorithm, such as SHA256withRSA</p>
     */
    public void setSignAlgorithm(String SignAlgorithm) {
        this.SignAlgorithm = SignAlgorithm;
    }

    /**
     * Get <p>Signature time (Unix timestamp in milliseconds)</p> 
     * @return SignTime <p>Signature time (Unix timestamp in milliseconds)</p>
     */
    public Long getSignTime() {
        return this.SignTime;
    }

    /**
     * Set <p>Signature time (Unix timestamp in milliseconds)</p>
     * @param SignTime <p>Signature time (Unix timestamp in milliseconds)</p>
     */
    public void setSignTime(Long SignTime) {
        this.SignTime = SignTime;
    }

    /**
     * Get <p>Signature verification information</p> 
     * @return CertSn <p>Signature verification information</p>
     */
    public String getCertSn() {
        return this.CertSn;
    }

    /**
     * Set <p>Signature verification information</p>
     * @param CertSn <p>Signature verification information</p>
     */
    public void setCertSn(String CertSn) {
        this.CertSn = CertSn;
    }

    public SignResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SignResult(SignResult source) {
        if (source.VerifyStatus != null) {
            this.VerifyStatus = new Long(source.VerifyStatus);
        }
        if (source.SignerName != null) {
            this.SignerName = new String(source.SignerName);
        }
        if (source.SignAlgorithm != null) {
            this.SignAlgorithm = new String(source.SignAlgorithm);
        }
        if (source.SignTime != null) {
            this.SignTime = new Long(source.SignTime);
        }
        if (source.CertSn != null) {
            this.CertSn = new String(source.CertSn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerifyStatus", this.VerifyStatus);
        this.setParamSimple(map, prefix + "SignerName", this.SignerName);
        this.setParamSimple(map, prefix + "SignAlgorithm", this.SignAlgorithm);
        this.setParamSimple(map, prefix + "SignTime", this.SignTime);
        this.setParamSimple(map, prefix + "CertSn", this.CertSn);

    }
}

