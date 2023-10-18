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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PostQuantumCryptoSignRequest extends AbstractModel {

    /**
    * Original message text before Base64 encoding. It cannot exceed 4096 bytes. 
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Unique ID of a key
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
     * Get Original message text before Base64 encoding. It cannot exceed 4096 bytes.  
     * @return Message Original message text before Base64 encoding. It cannot exceed 4096 bytes. 
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Original message text before Base64 encoding. It cannot exceed 4096 bytes. 
     * @param Message Original message text before Base64 encoding. It cannot exceed 4096 bytes. 
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Unique ID of a key 
     * @return KeyId Unique ID of a key
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Unique ID of a key
     * @param KeyId Unique ID of a key
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    public PostQuantumCryptoSignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostQuantumCryptoSignRequest(PostQuantumCryptoSignRequest source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);

    }
}

