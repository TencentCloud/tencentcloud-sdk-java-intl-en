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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSchedulingDomainRequest extends AbstractModel {

    /**
    * Indicates whether a hybrid cloud product is used.
`hybrid`: Anti-DDoS Service Platform
For other products, leave this field empty.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Indicates whether a hybrid cloud product is used.
`hybrid`: Anti-DDoS Service Platform
For other products, leave this field empty. 
     * @return Product Indicates whether a hybrid cloud product is used.
`hybrid`: Anti-DDoS Service Platform
For other products, leave this field empty.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Indicates whether a hybrid cloud product is used.
`hybrid`: Anti-DDoS Service Platform
For other products, leave this field empty.
     * @param Product Indicates whether a hybrid cloud product is used.
`hybrid`: Anti-DDoS Service Platform
For other products, leave this field empty.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public CreateSchedulingDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSchedulingDomainRequest(CreateSchedulingDomainRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

