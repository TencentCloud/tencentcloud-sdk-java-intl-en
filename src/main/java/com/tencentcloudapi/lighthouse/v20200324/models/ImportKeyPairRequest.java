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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportKeyPairRequest extends AbstractModel {

    /**
    * Key pair name, which can contain up to 25 digits, letters, and underscores.
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * Public key content of the key pair, which is in the OpenSSH RSA format.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
     * Get Key pair name, which can contain up to 25 digits, letters, and underscores. 
     * @return KeyName Key pair name, which can contain up to 25 digits, letters, and underscores.
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set Key pair name, which can contain up to 25 digits, letters, and underscores.
     * @param KeyName Key pair name, which can contain up to 25 digits, letters, and underscores.
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get Public key content of the key pair, which is in the OpenSSH RSA format. 
     * @return PublicKey Public key content of the key pair, which is in the OpenSSH RSA format.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Public key content of the key pair, which is in the OpenSSH RSA format.
     * @param PublicKey Public key content of the key pair, which is in the OpenSSH RSA format.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    public ImportKeyPairRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportKeyPairRequest(ImportKeyPairRequest source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);

    }
}

