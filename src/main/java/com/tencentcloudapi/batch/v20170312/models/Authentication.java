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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Authentication extends AbstractModel {

    /**
    * Authentication scenario such as COS
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * SecretId
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * SecretKey
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
     * Get Authentication scenario such as COS 
     * @return Scene Authentication scenario such as COS
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set Authentication scenario such as COS
     * @param Scene Authentication scenario such as COS
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get SecretId 
     * @return SecretId SecretId
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set SecretId
     * @param SecretId SecretId
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get SecretKey 
     * @return SecretKey SecretKey
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set SecretKey
     * @param SecretKey SecretKey
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    public Authentication() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Authentication(Authentication source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

