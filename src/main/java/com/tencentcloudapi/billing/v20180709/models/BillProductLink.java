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

public class BillProductLink extends AbstractModel {

    /**
    * Subproduct code
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Subproduct name
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * Component name
    */
    @SerializedName("Children")
    @Expose
    private BillItem [] Children;

    /**
     * Get Subproduct code 
     * @return ProductCode Subproduct code
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Subproduct code
     * @param ProductCode Subproduct code
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Subproduct name 
     * @return ProductCodeName Subproduct name
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set Subproduct name
     * @param ProductCodeName Subproduct name
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get Component name 
     * @return Children Component name
     */
    public BillItem [] getChildren() {
        return this.Children;
    }

    /**
     * Set Component name
     * @param Children Component name
     */
    public void setChildren(BillItem [] Children) {
        this.Children = Children;
    }

    public BillProductLink() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillProductLink(BillProductLink source) {
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
        }
        if (source.Children != null) {
            this.Children = new BillItem[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new BillItem(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

