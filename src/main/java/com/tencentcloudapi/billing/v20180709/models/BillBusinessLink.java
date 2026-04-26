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

public class BillBusinessLink extends AbstractModel {

    /**
    * Product code
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Product name
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * Subproduct
    */
    @SerializedName("Children")
    @Expose
    private BillProductLink [] Children;

    /**
     * Get Product code 
     * @return BusinessCode Product code
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set Product code
     * @param BusinessCode Product code
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get Product name 
     * @return BusinessCodeName Product name
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set Product name
     * @param BusinessCodeName Product name
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get Subproduct 
     * @return Children Subproduct
     */
    public BillProductLink [] getChildren() {
        return this.Children;
    }

    /**
     * Set Subproduct
     * @param Children Subproduct
     */
    public void setChildren(BillProductLink [] Children) {
        this.Children = Children;
    }

    public BillBusinessLink() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillBusinessLink(BillBusinessLink source) {
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.Children != null) {
            this.Children = new BillProductLink[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new BillProductLink(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

