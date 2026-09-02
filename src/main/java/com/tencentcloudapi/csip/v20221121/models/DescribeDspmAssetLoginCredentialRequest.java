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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDspmAssetLoginCredentialRequest extends AbstractModel {

    /**
    * Database asset id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Host. Default: '%'
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Encryption algorithm
    */
    @SerializedName("EncryptMethod")
    @Expose
    private String EncryptMethod;

    /**
     * Get Database asset id 
     * @return AssetId Database asset id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Database asset id
     * @param AssetId Database asset id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Host. Default: '%' 
     * @return Host Host. Default: '%'
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host. Default: '%'
     * @param Host Host. Default: '%'
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Encryption algorithm 
     * @return EncryptMethod Encryption algorithm
     */
    public String getEncryptMethod() {
        return this.EncryptMethod;
    }

    /**
     * Set Encryption algorithm
     * @param EncryptMethod Encryption algorithm
     */
    public void setEncryptMethod(String EncryptMethod) {
        this.EncryptMethod = EncryptMethod;
    }

    public DescribeDspmAssetLoginCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmAssetLoginCredentialRequest(DescribeDspmAssetLoginCredentialRequest source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.EncryptMethod != null) {
            this.EncryptMethod = new String(source.EncryptMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "EncryptMethod", this.EncryptMethod);

    }
}

