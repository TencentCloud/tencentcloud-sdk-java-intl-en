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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetParametersForImportResponse extends AbstractModel {

    /**
    * Unique ID of a CMK, which is used to specify the CMK into which to import key material.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * The token required for importing key material, which is used as a parameter for `ImportKeyMaterial`.
    */
    @SerializedName("ImportToken")
    @Expose
    private String ImportToken;

    /**
    * The Base64-encoded RSA public key used to encrypt key material before importing it with `ImportKeyMaterial`.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * Validity period of the token and public key. A token and public key can only be imported when they are valid. If they are expired, you will need to call the `GetParametersForImport` API again to get a new token and public key.
    */
    @SerializedName("ParametersValidTo")
    @Expose
    private Long ParametersValidTo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Unique ID of a CMK, which is used to specify the CMK into which to import key material. 
     * @return KeyId Unique ID of a CMK, which is used to specify the CMK into which to import key material.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Unique ID of a CMK, which is used to specify the CMK into which to import key material.
     * @param KeyId Unique ID of a CMK, which is used to specify the CMK into which to import key material.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get The token required for importing key material, which is used as a parameter for `ImportKeyMaterial`. 
     * @return ImportToken The token required for importing key material, which is used as a parameter for `ImportKeyMaterial`.
     */
    public String getImportToken() {
        return this.ImportToken;
    }

    /**
     * Set The token required for importing key material, which is used as a parameter for `ImportKeyMaterial`.
     * @param ImportToken The token required for importing key material, which is used as a parameter for `ImportKeyMaterial`.
     */
    public void setImportToken(String ImportToken) {
        this.ImportToken = ImportToken;
    }

    /**
     * Get The Base64-encoded RSA public key used to encrypt key material before importing it with `ImportKeyMaterial`. 
     * @return PublicKey The Base64-encoded RSA public key used to encrypt key material before importing it with `ImportKeyMaterial`.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set The Base64-encoded RSA public key used to encrypt key material before importing it with `ImportKeyMaterial`.
     * @param PublicKey The Base64-encoded RSA public key used to encrypt key material before importing it with `ImportKeyMaterial`.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get Validity period of the token and public key. A token and public key can only be imported when they are valid. If they are expired, you will need to call the `GetParametersForImport` API again to get a new token and public key. 
     * @return ParametersValidTo Validity period of the token and public key. A token and public key can only be imported when they are valid. If they are expired, you will need to call the `GetParametersForImport` API again to get a new token and public key.
     */
    public Long getParametersValidTo() {
        return this.ParametersValidTo;
    }

    /**
     * Set Validity period of the token and public key. A token and public key can only be imported when they are valid. If they are expired, you will need to call the `GetParametersForImport` API again to get a new token and public key.
     * @param ParametersValidTo Validity period of the token and public key. A token and public key can only be imported when they are valid. If they are expired, you will need to call the `GetParametersForImport` API again to get a new token and public key.
     */
    public void setParametersValidTo(Long ParametersValidTo) {
        this.ParametersValidTo = ParametersValidTo;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetParametersForImportResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetParametersForImportResponse(GetParametersForImportResponse source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.ImportToken != null) {
            this.ImportToken = new String(source.ImportToken);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.ParametersValidTo != null) {
            this.ParametersValidTo = new Long(source.ParametersValidTo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "ImportToken", this.ImportToken);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "ParametersValidTo", this.ParametersValidTo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

