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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCatalogsRsp extends AbstractModel {

    /**
    * Data catalog list
    */
    @SerializedName("Items")
    @Expose
    private Catalog [] Items;

    /**
    * Next page pagination token
    */
    @SerializedName("NextPageToken")
    @Expose
    private String NextPageToken;

    /**
     * Get Data catalog list 
     * @return Items Data catalog list
     */
    public Catalog [] getItems() {
        return this.Items;
    }

    /**
     * Set Data catalog list
     * @param Items Data catalog list
     */
    public void setItems(Catalog [] Items) {
        this.Items = Items;
    }

    /**
     * Get Next page pagination token 
     * @return NextPageToken Next page pagination token
     */
    public String getNextPageToken() {
        return this.NextPageToken;
    }

    /**
     * Set Next page pagination token
     * @param NextPageToken Next page pagination token
     */
    public void setNextPageToken(String NextPageToken) {
        this.NextPageToken = NextPageToken;
    }

    public ListCatalogsRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCatalogsRsp(ListCatalogsRsp source) {
        if (source.Items != null) {
            this.Items = new Catalog[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new Catalog(source.Items[i]);
            }
        }
        if (source.NextPageToken != null) {
            this.NextPageToken = new String(source.NextPageToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "NextPageToken", this.NextPageToken);

    }
}

