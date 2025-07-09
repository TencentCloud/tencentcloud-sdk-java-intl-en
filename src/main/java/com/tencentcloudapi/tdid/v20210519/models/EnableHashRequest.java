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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableHashRequest extends AbstractModel {

    /**
    * The CNS address of the contract.
    */
    @SerializedName("Hash")
    @Expose
    private String Hash;

    /**
     * Get The CNS address of the contract. 
     * @return Hash The CNS address of the contract.
     */
    public String getHash() {
        return this.Hash;
    }

    /**
     * Set The CNS address of the contract.
     * @param Hash The CNS address of the contract.
     */
    public void setHash(String Hash) {
        this.Hash = Hash;
    }

    public EnableHashRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableHashRequest(EnableHashRequest source) {
        if (source.Hash != null) {
            this.Hash = new String(source.Hash);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Hash", this.Hash);

    }
}

