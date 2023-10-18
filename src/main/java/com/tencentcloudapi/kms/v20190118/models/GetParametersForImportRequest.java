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

public class GetParametersForImportRequest extends AbstractModel {

    /**
    * Unique ID of a CMK. The CMK for which to get the key parameters must be of the `EXTERNAL` type, i.e., Type = 2 when the CMK is created by the `CreateKey` API.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Specifies the algorithm for key material encryption. Currently, `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, and `RSAES_OAEP_SHA_256` are supported.
    */
    @SerializedName("WrappingAlgorithm")
    @Expose
    private String WrappingAlgorithm;

    /**
    * Specifies the type of wrapping key. Currently, only `RSA_2048` is supported.
    */
    @SerializedName("WrappingKeySpec")
    @Expose
    private String WrappingKeySpec;

    /**
     * Get Unique ID of a CMK. The CMK for which to get the key parameters must be of the `EXTERNAL` type, i.e., Type = 2 when the CMK is created by the `CreateKey` API. 
     * @return KeyId Unique ID of a CMK. The CMK for which to get the key parameters must be of the `EXTERNAL` type, i.e., Type = 2 when the CMK is created by the `CreateKey` API.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Unique ID of a CMK. The CMK for which to get the key parameters must be of the `EXTERNAL` type, i.e., Type = 2 when the CMK is created by the `CreateKey` API.
     * @param KeyId Unique ID of a CMK. The CMK for which to get the key parameters must be of the `EXTERNAL` type, i.e., Type = 2 when the CMK is created by the `CreateKey` API.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Specifies the algorithm for key material encryption. Currently, `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, and `RSAES_OAEP_SHA_256` are supported. 
     * @return WrappingAlgorithm Specifies the algorithm for key material encryption. Currently, `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, and `RSAES_OAEP_SHA_256` are supported.
     */
    public String getWrappingAlgorithm() {
        return this.WrappingAlgorithm;
    }

    /**
     * Set Specifies the algorithm for key material encryption. Currently, `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, and `RSAES_OAEP_SHA_256` are supported.
     * @param WrappingAlgorithm Specifies the algorithm for key material encryption. Currently, `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, and `RSAES_OAEP_SHA_256` are supported.
     */
    public void setWrappingAlgorithm(String WrappingAlgorithm) {
        this.WrappingAlgorithm = WrappingAlgorithm;
    }

    /**
     * Get Specifies the type of wrapping key. Currently, only `RSA_2048` is supported. 
     * @return WrappingKeySpec Specifies the type of wrapping key. Currently, only `RSA_2048` is supported.
     */
    public String getWrappingKeySpec() {
        return this.WrappingKeySpec;
    }

    /**
     * Set Specifies the type of wrapping key. Currently, only `RSA_2048` is supported.
     * @param WrappingKeySpec Specifies the type of wrapping key. Currently, only `RSA_2048` is supported.
     */
    public void setWrappingKeySpec(String WrappingKeySpec) {
        this.WrappingKeySpec = WrappingKeySpec;
    }

    public GetParametersForImportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetParametersForImportRequest(GetParametersForImportRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.WrappingAlgorithm != null) {
            this.WrappingAlgorithm = new String(source.WrappingAlgorithm);
        }
        if (source.WrappingKeySpec != null) {
            this.WrappingKeySpec = new String(source.WrappingKeySpec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "WrappingAlgorithm", this.WrappingAlgorithm);
        this.setParamSimple(map, prefix + "WrappingKeySpec", this.WrappingKeySpec);

    }
}

