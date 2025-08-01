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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetProductsForbiddenStatusRequest extends AbstractModel {

    /**
    * List of products to enable or disable
    */
    @SerializedName("ProductId")
    @Expose
    private String [] ProductId;

    /**
    * `0`: enable; `1`: disable
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get List of products to enable or disable 
     * @return ProductId List of products to enable or disable
     */
    public String [] getProductId() {
        return this.ProductId;
    }

    /**
     * Set List of products to enable or disable
     * @param ProductId List of products to enable or disable
     */
    public void setProductId(String [] ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get `0`: enable; `1`: disable 
     * @return Status `0`: enable; `1`: disable
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set `0`: enable; `1`: disable
     * @param Status `0`: enable; `1`: disable
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SetProductsForbiddenStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetProductsForbiddenStatusRequest(SetProductsForbiddenStatusRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String[source.ProductId.length];
            for (int i = 0; i < source.ProductId.length; i++) {
                this.ProductId[i] = new String(source.ProductId[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProductId.", this.ProductId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

