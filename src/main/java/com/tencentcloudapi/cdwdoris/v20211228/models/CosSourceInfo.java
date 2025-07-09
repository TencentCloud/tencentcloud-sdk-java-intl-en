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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosSourceInfo extends AbstractModel {

    /**
    * ID in cos authentication
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * Key in cos authentication
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Path in cos authentication
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
     * Get ID in cos authentication
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecretId ID in cos authentication
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set ID in cos authentication
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecretId ID in cos authentication
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get Key in cos authentication
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecretKey Key in cos authentication
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Key in cos authentication
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecretKey Key in cos authentication
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Path in cos authentication
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CosPath Path in cos authentication
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set Path in cos authentication
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CosPath Path in cos authentication
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    public CosSourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosSourceInfo(CosSourceInfo source) {
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);

    }
}

