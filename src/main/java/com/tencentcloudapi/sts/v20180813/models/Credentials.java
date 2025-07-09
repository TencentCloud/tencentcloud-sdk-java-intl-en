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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Credentials extends AbstractModel {

    /**
    * Token, which contains up to 4,096 bytes depending on the associated policies.
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * Temporary credentials key ID, which contains up to 1,024 bytes.
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * Temporary credentials key, which contains up to 1,024 bytes.
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
     * Get Token, which contains up to 4,096 bytes depending on the associated policies. 
     * @return Token Token, which contains up to 4,096 bytes depending on the associated policies.
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Token, which contains up to 4,096 bytes depending on the associated policies.
     * @param Token Token, which contains up to 4,096 bytes depending on the associated policies.
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get Temporary credentials key ID, which contains up to 1,024 bytes. 
     * @return TmpSecretId Temporary credentials key ID, which contains up to 1,024 bytes.
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set Temporary credentials key ID, which contains up to 1,024 bytes.
     * @param TmpSecretId Temporary credentials key ID, which contains up to 1,024 bytes.
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get Temporary credentials key, which contains up to 1,024 bytes. 
     * @return TmpSecretKey Temporary credentials key, which contains up to 1,024 bytes.
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set Temporary credentials key, which contains up to 1,024 bytes.
     * @param TmpSecretKey Temporary credentials key, which contains up to 1,024 bytes.
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    public Credentials() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Credentials(Credentials source) {
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);

    }
}

