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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillItem extends AbstractModel {

    /**
    * Component name code
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
    * Component name: The specific component of a product or service purchased by the user
    */
    @SerializedName("ItemCodeName")
    @Expose
    private String ItemCodeName;

    /**
     * Get Component name code 
     * @return ItemCode Component name code
     */
    public String getItemCode() {
        return this.ItemCode;
    }

    /**
     * Set Component name code
     * @param ItemCode Component name code
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * Get Component name: The specific component of a product or service purchased by the user 
     * @return ItemCodeName Component name: The specific component of a product or service purchased by the user
     */
    public String getItemCodeName() {
        return this.ItemCodeName;
    }

    /**
     * Set Component name: The specific component of a product or service purchased by the user
     * @param ItemCodeName Component name: The specific component of a product or service purchased by the user
     */
    public void setItemCodeName(String ItemCodeName) {
        this.ItemCodeName = ItemCodeName;
    }

    public BillItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillItem(BillItem source) {
        if (source.ItemCode != null) {
            this.ItemCode = new String(source.ItemCode);
        }
        if (source.ItemCodeName != null) {
            this.ItemCodeName = new String(source.ItemCodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemCode", this.ItemCode);
        this.setParamSimple(map, prefix + "ItemCodeName", this.ItemCodeName);

    }
}

