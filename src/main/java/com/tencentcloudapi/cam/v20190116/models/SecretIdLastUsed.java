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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecretIdLastUsed extends AbstractModel {

    /**
    * Key ID.
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * The date when the key ID was last used (the value is obtained one day later).
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("LastUsedDate")
    @Expose
    private String LastUsedDate;

    /**
    * The most recent date the key was accessed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastSecretUsedDate")
    @Expose
    private Long LastSecretUsedDate;

    /**
     * Get Key ID. 
     * @return SecretId Key ID.
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set Key ID.
     * @param SecretId Key ID.
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get The date when the key ID was last used (the value is obtained one day later).
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return LastUsedDate The date when the key ID was last used (the value is obtained one day later).
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getLastUsedDate() {
        return this.LastUsedDate;
    }

    /**
     * Set The date when the key ID was last used (the value is obtained one day later).
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param LastUsedDate The date when the key ID was last used (the value is obtained one day later).
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setLastUsedDate(String LastUsedDate) {
        this.LastUsedDate = LastUsedDate;
    }

    /**
     * Get The most recent date the key was accessed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastSecretUsedDate The most recent date the key was accessed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastSecretUsedDate() {
        return this.LastSecretUsedDate;
    }

    /**
     * Set The most recent date the key was accessed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastSecretUsedDate The most recent date the key was accessed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastSecretUsedDate(Long LastSecretUsedDate) {
        this.LastSecretUsedDate = LastSecretUsedDate;
    }

    public SecretIdLastUsed() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecretIdLastUsed(SecretIdLastUsed source) {
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.LastUsedDate != null) {
            this.LastUsedDate = new String(source.LastUsedDate);
        }
        if (source.LastSecretUsedDate != null) {
            this.LastSecretUsedDate = new Long(source.LastSecretUsedDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "LastUsedDate", this.LastUsedDate);
        this.setParamSimple(map, prefix + "LastSecretUsedDate", this.LastSecretUsedDate);

    }
}

