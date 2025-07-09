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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SortBy extends AbstractModel {

    /**
    * Sorting metrics
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * Sorting method
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get Sorting metrics 
     * @return FieldName Sorting metrics
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set Sorting metrics
     * @param FieldName Sorting metrics
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get Sorting method 
     * @return OrderType Sorting method
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Sorting method
     * @param OrderType Sorting method
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public SortBy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SortBy(SortBy source) {
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

