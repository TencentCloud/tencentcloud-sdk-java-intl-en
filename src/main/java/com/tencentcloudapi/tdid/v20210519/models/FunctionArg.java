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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionArg extends AbstractModel {

    /**
    * The claim protocol type (CPT) ID.
    */
    @SerializedName("CptId")
    @Expose
    private Long CptId;

    /**
    * The DID of the issuer.
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * The expiration time.
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * The claim.
    */
    @SerializedName("ClaimJson")
    @Expose
    private String ClaimJson;

    /**
     * Get The claim protocol type (CPT) ID. 
     * @return CptId The claim protocol type (CPT) ID.
     */
    public Long getCptId() {
        return this.CptId;
    }

    /**
     * Set The claim protocol type (CPT) ID.
     * @param CptId The claim protocol type (CPT) ID.
     */
    public void setCptId(Long CptId) {
        this.CptId = CptId;
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
     * Get The expiration time. 
     * @return ExpirationDate The expiration time.
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set The expiration time.
     * @param ExpirationDate The expiration time.
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get The claim. 
     * @return ClaimJson The claim.
     */
    public String getClaimJson() {
        return this.ClaimJson;
    }

    /**
     * Set The claim.
     * @param ClaimJson The claim.
     */
    public void setClaimJson(String ClaimJson) {
        this.ClaimJson = ClaimJson;
    }

    public FunctionArg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionArg(FunctionArg source) {
        if (source.CptId != null) {
            this.CptId = new Long(source.CptId);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.ClaimJson != null) {
            this.ClaimJson = new String(source.ClaimJson);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CptId", this.CptId);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "ClaimJson", this.ClaimJson);

    }
}

