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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnonymousLoginInfo extends AbstractModel {

    /**
    * <p>Anonymous login account secretId</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * <p>Anonymous login account secretKey</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
     * Get <p>Anonymous login account secretId</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecretId <p>Anonymous login account secretId</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set <p>Anonymous login account secretId</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecretId <p>Anonymous login account secretId</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get <p>Anonymous login account secretKey</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecretKey <p>Anonymous login account secretKey</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>Anonymous login account secretKey</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecretKey <p>Anonymous login account secretKey</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    public AnonymousLoginInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnonymousLoginInfo(AnonymousLoginInfo source) {
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
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

