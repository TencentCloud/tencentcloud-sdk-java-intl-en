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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedAuthenticationTypeC extends AbstractModel{

    /**
    * Access key
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * Authentication key
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
     * Get Access key 
     * @return AccessKey Access key
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set Access key
     * @param AccessKey Access key
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get Authentication key 
     * @return SecretKey Authentication key
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Authentication key
     * @param SecretKey Authentication key
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

