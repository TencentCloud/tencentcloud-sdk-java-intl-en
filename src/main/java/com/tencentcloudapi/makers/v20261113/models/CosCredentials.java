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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosCredentials extends AbstractModel {

    /**
    * <p>Temporary SecretId</p>
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * <p>Temporary SecretKey</p>
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * <p>Temporary Token</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
     * Get <p>Temporary SecretId</p> 
     * @return TmpSecretId <p>Temporary SecretId</p>
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set <p>Temporary SecretId</p>
     * @param TmpSecretId <p>Temporary SecretId</p>
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get <p>Temporary SecretKey</p> 
     * @return TmpSecretKey <p>Temporary SecretKey</p>
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set <p>Temporary SecretKey</p>
     * @param TmpSecretKey <p>Temporary SecretKey</p>
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get <p>Temporary Token</p> 
     * @return Token <p>Temporary Token</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>Temporary Token</p>
     * @param Token <p>Temporary Token</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    public CosCredentials() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosCredentials(CosCredentials source) {
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "Token", this.Token);

    }
}

