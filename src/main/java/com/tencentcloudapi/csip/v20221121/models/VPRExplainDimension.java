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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VPRExplainDimension extends AbstractModel {

    /**
    * <p>Tag key</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>Tag name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Tag sub-item.</p>
    */
    @SerializedName("Items")
    @Expose
    private VPRExplainDimensionItem [] Items;

    /**
     * Get <p>Tag key</p> 
     * @return Key <p>Tag key</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>Tag key</p>
     * @param Key <p>Tag key</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>Tag name</p> 
     * @return Name <p>Tag name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Tag name</p>
     * @param Name <p>Tag name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Tag sub-item.</p> 
     * @return Items <p>Tag sub-item.</p>
     */
    public VPRExplainDimensionItem [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>Tag sub-item.</p>
     * @param Items <p>Tag sub-item.</p>
     */
    public void setItems(VPRExplainDimensionItem [] Items) {
        this.Items = Items;
    }

    public VPRExplainDimension() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VPRExplainDimension(VPRExplainDimension source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Items != null) {
            this.Items = new VPRExplainDimensionItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new VPRExplainDimensionItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

