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

public class TradeTwoNode extends AbstractModel {

    /**
    * Secondary industry id.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Secondary industry name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Industry information.
    */
    @SerializedName("TradeInfo")
    @Expose
    private String TradeInfo;

    /**
     * Get Secondary industry id. 
     * @return Id Secondary industry id.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Secondary industry id.
     * @param Id Secondary industry id.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Secondary industry name. 
     * @return Name Secondary industry name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Secondary industry name.
     * @param Name Secondary industry name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Industry information. 
     * @return TradeInfo Industry information.
     */
    public String getTradeInfo() {
        return this.TradeInfo;
    }

    /**
     * Set Industry information.
     * @param TradeInfo Industry information.
     */
    public void setTradeInfo(String TradeInfo) {
        this.TradeInfo = TradeInfo;
    }

    public TradeTwoNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TradeTwoNode(TradeTwoNode source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TradeInfo != null) {
            this.TradeInfo = new String(source.TradeInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TradeInfo", this.TradeInfo);

    }
}

