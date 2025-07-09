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

public class VerifyFunctionArg extends AbstractModel {

    /**
    * The claim protocol type (CPT) ID.
    */
    @SerializedName("CptId")
    @Expose
    private Long CptId;

    /**
    * The issuer DID.
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * The expiration time.
    */
    @SerializedName("ExpirationDate")
    @Expose
    private Long ExpirationDate;

    /**
    * The claim.
    */
    @SerializedName("ClaimJson")
    @Expose
    private String ClaimJson;

    /**
    * The time when the credential was issued.
    */
    @SerializedName("IssuanceDate")
    @Expose
    private Long IssuanceDate;

    /**
    * The context.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * The ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * The signature.
    */
    @SerializedName("Proof")
    @Expose
    private Proof Proof;

    /**
    * The type.
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

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
     * Get The issuer DID. 
     * @return Issuer The issuer DID.
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set The issuer DID.
     * @param Issuer The issuer DID.
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get The expiration time. 
     * @return ExpirationDate The expiration time.
     */
    public Long getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set The expiration time.
     * @param ExpirationDate The expiration time.
     */
    public void setExpirationDate(Long ExpirationDate) {
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

    /**
     * Get The time when the credential was issued. 
     * @return IssuanceDate The time when the credential was issued.
     */
    public Long getIssuanceDate() {
        return this.IssuanceDate;
    }

    /**
     * Set The time when the credential was issued.
     * @param IssuanceDate The time when the credential was issued.
     */
    public void setIssuanceDate(Long IssuanceDate) {
        this.IssuanceDate = IssuanceDate;
    }

    /**
     * Get The context. 
     * @return Context The context.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set The context.
     * @param Context The context.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get The ID. 
     * @return Id The ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The ID.
     * @param Id The ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get The signature. 
     * @return Proof The signature.
     */
    public Proof getProof() {
        return this.Proof;
    }

    /**
     * Set The signature.
     * @param Proof The signature.
     */
    public void setProof(Proof Proof) {
        this.Proof = Proof;
    }

    /**
     * Get The type. 
     * @return Type The type.
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set The type.
     * @param Type The type.
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    public VerifyFunctionArg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyFunctionArg(VerifyFunctionArg source) {
        if (source.CptId != null) {
            this.CptId = new Long(source.CptId);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new Long(source.ExpirationDate);
        }
        if (source.ClaimJson != null) {
            this.ClaimJson = new String(source.ClaimJson);
        }
        if (source.IssuanceDate != null) {
            this.IssuanceDate = new Long(source.IssuanceDate);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Proof != null) {
            this.Proof = new Proof(source.Proof);
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
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
        this.setParamSimple(map, prefix + "IssuanceDate", this.IssuanceDate);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "Proof.", this.Proof);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);

    }
}

