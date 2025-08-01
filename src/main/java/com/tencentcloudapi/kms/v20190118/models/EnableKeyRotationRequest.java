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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableKeyRotationRequest extends AbstractModel {

    /**
    * Unique CMK ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * The interval between each key rotation in days. Value range: 7 - 365 (default).
    */
    @SerializedName("RotateDays")
    @Expose
    private Long RotateDays;

    /**
     * Get Unique CMK ID 
     * @return KeyId Unique CMK ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Unique CMK ID
     * @param KeyId Unique CMK ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get The interval between each key rotation in days. Value range: 7 - 365 (default). 
     * @return RotateDays The interval between each key rotation in days. Value range: 7 - 365 (default).
     */
    public Long getRotateDays() {
        return this.RotateDays;
    }

    /**
     * Set The interval between each key rotation in days. Value range: 7 - 365 (default).
     * @param RotateDays The interval between each key rotation in days. Value range: 7 - 365 (default).
     */
    public void setRotateDays(Long RotateDays) {
        this.RotateDays = RotateDays;
    }

    public EnableKeyRotationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableKeyRotationRequest(EnableKeyRotationRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.RotateDays != null) {
            this.RotateDays = new Long(source.RotateDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "RotateDays", this.RotateDays);

    }
}

