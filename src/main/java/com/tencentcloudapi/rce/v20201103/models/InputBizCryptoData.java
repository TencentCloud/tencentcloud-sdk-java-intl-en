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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputBizCryptoData extends AbstractModel {

    /**
    * Whether to authorize.
    */
    @SerializedName("IsAuthorized")
    @Expose
    private String IsAuthorized;

    /**
    * Encryption type.
    */
    @SerializedName("CryptoType")
    @Expose
    private String CryptoType;

    /**
    * Encrypted content.
    */
    @SerializedName("CryptoContent")
    @Expose
    private String CryptoContent;

    /**
     * Get Whether to authorize. 
     * @return IsAuthorized Whether to authorize.
     */
    public String getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set Whether to authorize.
     * @param IsAuthorized Whether to authorize.
     */
    public void setIsAuthorized(String IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get Encryption type. 
     * @return CryptoType Encryption type.
     */
    public String getCryptoType() {
        return this.CryptoType;
    }

    /**
     * Set Encryption type.
     * @param CryptoType Encryption type.
     */
    public void setCryptoType(String CryptoType) {
        this.CryptoType = CryptoType;
    }

    /**
     * Get Encrypted content. 
     * @return CryptoContent Encrypted content.
     */
    public String getCryptoContent() {
        return this.CryptoContent;
    }

    /**
     * Set Encrypted content.
     * @param CryptoContent Encrypted content.
     */
    public void setCryptoContent(String CryptoContent) {
        this.CryptoContent = CryptoContent;
    }

    public InputBizCryptoData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputBizCryptoData(InputBizCryptoData source) {
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new String(source.IsAuthorized);
        }
        if (source.CryptoType != null) {
            this.CryptoType = new String(source.CryptoType);
        }
        if (source.CryptoContent != null) {
            this.CryptoContent = new String(source.CryptoContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);
        this.setParamSimple(map, prefix + "CryptoType", this.CryptoType);
        this.setParamSimple(map, prefix + "CryptoContent", this.CryptoContent);

    }
}

