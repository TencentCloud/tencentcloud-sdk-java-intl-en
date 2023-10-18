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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSSHKeyPairValueRequest extends AbstractModel {

    /**
    * Secret name. This field is only valid for SSH key secrets.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * ID of the key pair, which is the unique identifier of the key pair in the CVM.
    */
    @SerializedName("SSHKeyId")
    @Expose
    private String SSHKeyId;

    /**
     * Get Secret name. This field is only valid for SSH key secrets. 
     * @return SecretName Secret name. This field is only valid for SSH key secrets.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Secret name. This field is only valid for SSH key secrets.
     * @param SecretName Secret name. This field is only valid for SSH key secrets.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get ID of the key pair, which is the unique identifier of the key pair in the CVM. 
     * @return SSHKeyId ID of the key pair, which is the unique identifier of the key pair in the CVM.
     */
    public String getSSHKeyId() {
        return this.SSHKeyId;
    }

    /**
     * Set ID of the key pair, which is the unique identifier of the key pair in the CVM.
     * @param SSHKeyId ID of the key pair, which is the unique identifier of the key pair in the CVM.
     */
    public void setSSHKeyId(String SSHKeyId) {
        this.SSHKeyId = SSHKeyId;
    }

    public GetSSHKeyPairValueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSSHKeyPairValueRequest(GetSSHKeyPairValueRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.SSHKeyId != null) {
            this.SSHKeyId = new String(source.SSHKeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "SSHKeyId", this.SSHKeyId);

    }
}

