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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginSettings extends AbstractModel {

    /**
    * Instance login password, with 8 to 16 characters, including uppercase letters, lowercase letters, digits, and special characters. Special characters only support !@%^*. The password cannot start with a special character.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Key ID. After a key is associated, the instance can be accessed with the corresponding private key; PublicKeyId can be obtained through the API [DescribeKeyPairs](https://www.tencentcloud.com/document/api/213/15699?from_cn_redirect=1).
    */
    @SerializedName("PublicKeyId")
    @Expose
    private String PublicKeyId;

    /**
     * Get Instance login password, with 8 to 16 characters, including uppercase letters, lowercase letters, digits, and special characters. Special characters only support !@%^*. The password cannot start with a special character. 
     * @return Password Instance login password, with 8 to 16 characters, including uppercase letters, lowercase letters, digits, and special characters. Special characters only support !@%^*. The password cannot start with a special character.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instance login password, with 8 to 16 characters, including uppercase letters, lowercase letters, digits, and special characters. Special characters only support !@%^*. The password cannot start with a special character.
     * @param Password Instance login password, with 8 to 16 characters, including uppercase letters, lowercase letters, digits, and special characters. Special characters only support !@%^*. The password cannot start with a special character.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Key ID. After a key is associated, the instance can be accessed with the corresponding private key; PublicKeyId can be obtained through the API [DescribeKeyPairs](https://www.tencentcloud.com/document/api/213/15699?from_cn_redirect=1). 
     * @return PublicKeyId Key ID. After a key is associated, the instance can be accessed with the corresponding private key; PublicKeyId can be obtained through the API [DescribeKeyPairs](https://www.tencentcloud.com/document/api/213/15699?from_cn_redirect=1).
     */
    public String getPublicKeyId() {
        return this.PublicKeyId;
    }

    /**
     * Set Key ID. After a key is associated, the instance can be accessed with the corresponding private key; PublicKeyId can be obtained through the API [DescribeKeyPairs](https://www.tencentcloud.com/document/api/213/15699?from_cn_redirect=1).
     * @param PublicKeyId Key ID. After a key is associated, the instance can be accessed with the corresponding private key; PublicKeyId can be obtained through the API [DescribeKeyPairs](https://www.tencentcloud.com/document/api/213/15699?from_cn_redirect=1).
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

