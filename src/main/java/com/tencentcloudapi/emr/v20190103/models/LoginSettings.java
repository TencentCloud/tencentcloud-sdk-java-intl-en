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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginSettings extends AbstractModel {

    /**
    * The login password of the instance, which contains 8 to 16 uppercase letters, lowercase letters, digits, and special characters (only !@%^*) and cannot start with a special character.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * The key ID. After an instance is associated with a key, you can access it with the private key in the key pair. You can call [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) to obtain `PublicKeyId`.
    */
    @SerializedName("PublicKeyId")
    @Expose
    private String PublicKeyId;

    /**
     * Get The login password of the instance, which contains 8 to 16 uppercase letters, lowercase letters, digits, and special characters (only !@%^*) and cannot start with a special character. 
     * @return Password The login password of the instance, which contains 8 to 16 uppercase letters, lowercase letters, digits, and special characters (only !@%^*) and cannot start with a special character.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set The login password of the instance, which contains 8 to 16 uppercase letters, lowercase letters, digits, and special characters (only !@%^*) and cannot start with a special character.
     * @param Password The login password of the instance, which contains 8 to 16 uppercase letters, lowercase letters, digits, and special characters (only !@%^*) and cannot start with a special character.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get The key ID. After an instance is associated with a key, you can access it with the private key in the key pair. You can call [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) to obtain `PublicKeyId`. 
     * @return PublicKeyId The key ID. After an instance is associated with a key, you can access it with the private key in the key pair. You can call [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) to obtain `PublicKeyId`.
     */
    public String getPublicKeyId() {
        return this.PublicKeyId;
    }

    /**
     * Set The key ID. After an instance is associated with a key, you can access it with the private key in the key pair. You can call [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) to obtain `PublicKeyId`.
     * @param PublicKeyId The key ID. After an instance is associated with a key, you can access it with the private key in the key pair. You can call [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) to obtain `PublicKeyId`.
     */
    public void setPublicKeyId(String PublicKeyId) {
        this.PublicKeyId = PublicKeyId;
    }

    public LoginSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginSettings(LoginSettings source) {
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.PublicKeyId != null) {
            this.PublicKeyId = new String(source.PublicKeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "PublicKeyId", this.PublicKeyId);

    }
}

