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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetLocalStorageExpireRequest extends AbstractModel {

    /**
    * Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Expiration time (unit: second)
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
     * Get Key 
     * @return Key Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key
     * @param Key Key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Expiration time (unit: second) 
     * @return Expire Expiration time (unit: second)
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set Expiration time (unit: second)
     * @param Expire Expiration time (unit: second)
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    public SetLocalStorageExpireRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetLocalStorageExpireRequest(SetLocalStorageExpireRequest source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Expire", this.Expire);

    }
}

