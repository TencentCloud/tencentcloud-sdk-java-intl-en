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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TLSCiphers extends AbstractModel {

    /**
    * TLS version ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VersionId")
    @Expose
    private Long VersionId;

    /**
    * Encryption Suite ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CipherId")
    @Expose
    private Long CipherId;

    /**
    * Cipher suite
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CipherName")
    @Expose
    private String CipherName;

    /**
     * Get TLS version ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VersionId TLS version ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVersionId() {
        return this.VersionId;
    }

    /**
     * Set TLS version ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param VersionId TLS version ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersionId(Long VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get Encryption Suite ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CipherId Encryption Suite ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCipherId() {
        return this.CipherId;
    }

    /**
     * Set Encryption Suite ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CipherId Encryption Suite ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCipherId(Long CipherId) {
        this.CipherId = CipherId;
    }

    /**
     * Get Cipher suite
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CipherName Cipher suite
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCipherName() {
        return this.CipherName;
    }

    /**
     * Set Cipher suite
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CipherName Cipher suite
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCipherName(String CipherName) {
        this.CipherName = CipherName;
    }

    public TLSCiphers() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TLSCiphers(TLSCiphers source) {
        if (source.VersionId != null) {
            this.VersionId = new Long(source.VersionId);
        }
        if (source.CipherId != null) {
            this.CipherId = new Long(source.CipherId);
        }
        if (source.CipherName != null) {
            this.CipherName = new String(source.CipherName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "CipherId", this.CipherId);
        this.setParamSimple(map, prefix + "CipherName", this.CipherName);

    }
}

