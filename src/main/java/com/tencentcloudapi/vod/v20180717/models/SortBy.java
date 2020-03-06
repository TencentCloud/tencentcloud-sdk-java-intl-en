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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SortBy extends AbstractModel{

    /**
    * Sort by field
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * Sorting order. Valid values: Asc (ascending), Desc (descending)
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Sort by field 
     * @return Field Sort by field
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set Sort by field
     * @param Field Sort by field
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get Sorting order. Valid values: Asc (ascending), Desc (descending) 
     * @return Order Sorting order. Valid values: Asc (ascending), Desc (descending)
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order. Valid values: Asc (ascending), Desc (descending)
     * @param Order Sorting order. Valid values: Asc (ascending), Desc (descending)
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

