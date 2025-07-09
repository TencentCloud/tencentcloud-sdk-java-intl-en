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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryVoucherAmountByUinRequest extends AbstractModel {

    /**
    * Customer UIN list. Array length value: 1-20.
    */
    @SerializedName("ClientUins")
    @Expose
    private Long [] ClientUins;

    /**
     * Get Customer UIN list. Array length value: 1-20. 
     * @return ClientUins Customer UIN list. Array length value: 1-20.
     */
    public Long [] getClientUins() {
        return this.ClientUins;
    }

    /**
     * Set Customer UIN list. Array length value: 1-20.
     * @param ClientUins Customer UIN list. Array length value: 1-20.
     */
    public void setClientUins(Long [] ClientUins) {
        this.ClientUins = ClientUins;
    }

    public QueryVoucherAmountByUinRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryVoucherAmountByUinRequest(QueryVoucherAmountByUinRequest source) {
        if (source.ClientUins != null) {
            this.ClientUins = new Long[source.ClientUins.length];
            for (int i = 0; i < source.ClientUins.length; i++) {
                this.ClientUins[i] = new Long(source.ClientUins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClientUins.", this.ClientUins);

    }
}

