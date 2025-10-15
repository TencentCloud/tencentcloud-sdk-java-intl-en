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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SimpleAesDrm extends AbstractModel {

    /**
    * The URI of decryption key.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * Encryption key (32-byte hexadecimal string).
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Initialization vector for encryption (32-byte hexadecimal string).
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Vector")
    @Expose
    private String Vector;

    /**
     * Get The URI of decryption key.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uri The URI of decryption key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set The URI of decryption key.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uri The URI of decryption key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get Encryption key (32-byte hexadecimal string).
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Key Encryption key (32-byte hexadecimal string).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Encryption key (32-byte hexadecimal string).
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Key Encryption key (32-byte hexadecimal string).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Initialization vector for encryption (32-byte hexadecimal string).
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Vector Initialization vector for encryption (32-byte hexadecimal string).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getVector() {
        return this.Vector;
    }

    /**
     * Set Initialization vector for encryption (32-byte hexadecimal string).
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Vector Initialization vector for encryption (32-byte hexadecimal string).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVector(String Vector) {
        this.Vector = Vector;
    }

    public SimpleAesDrm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleAesDrm(SimpleAesDrm source) {
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Vector != null) {
            this.Vector = new String(source.Vector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Vector", this.Vector);

    }
}

