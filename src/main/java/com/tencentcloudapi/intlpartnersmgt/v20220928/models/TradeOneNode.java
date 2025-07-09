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

public class TradeOneNode extends AbstractModel {

    /**
    * Layer-1 industry id.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Layer-1 industry name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Layer-2 industries corresponding to the layer-1 industry.
    */
    @SerializedName("Children")
    @Expose
    private TradeTwoNode [] Children;

    /**
     * Get Layer-1 industry id. 
     * @return Id Layer-1 industry id.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Layer-1 industry id.
     * @param Id Layer-1 industry id.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Layer-1 industry name. 
     * @return Name Layer-1 industry name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Layer-1 industry name.
     * @param Name Layer-1 industry name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Layer-2 industries corresponding to the layer-1 industry. 
     * @return Children Layer-2 industries corresponding to the layer-1 industry.
     */
    public TradeTwoNode [] getChildren() {
        return this.Children;
    }

    /**
     * Set Layer-2 industries corresponding to the layer-1 industry.
     * @param Children Layer-2 industries corresponding to the layer-1 industry.
     */
    public void setChildren(TradeTwoNode [] Children) {
        this.Children = Children;
    }

    public TradeOneNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TradeOneNode(TradeOneNode source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Children != null) {
            this.Children = new TradeTwoNode[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new TradeTwoNode(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

