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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotIntelligence extends AbstractModel {

    /**
    * Specific configuration switch for Bot intelligent analysis. Valid values:

on: enable;
off: Disable.
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Rule ID of Bot intelligent analysis, returned only as an output parameter.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Based on the client and request features, divide the request source into human requests, valid Bot requests, suspected Bot requests, and high-risk Bot requests, and provide request handling options.
    */
    @SerializedName("BotRatings")
    @Expose
    private BotRatings BotRatings;

    /**
     * Get Specific configuration switch for Bot intelligent analysis. Valid values:

on: enable;
off: Disable. 
     * @return Enabled Specific configuration switch for Bot intelligent analysis. Valid values:

on: enable;
off: Disable.
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Specific configuration switch for Bot intelligent analysis. Valid values:

on: enable;
off: Disable.
     * @param Enabled Specific configuration switch for Bot intelligent analysis. Valid values:

on: enable;
off: Disable.
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Rule ID of Bot intelligent analysis, returned only as an output parameter. 
     * @return Id Rule ID of Bot intelligent analysis, returned only as an output parameter.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Rule ID of Bot intelligent analysis, returned only as an output parameter.
     * @param Id Rule ID of Bot intelligent analysis, returned only as an output parameter.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Based on the client and request features, divide the request source into human requests, valid Bot requests, suspected Bot requests, and high-risk Bot requests, and provide request handling options. 
     * @return BotRatings Based on the client and request features, divide the request source into human requests, valid Bot requests, suspected Bot requests, and high-risk Bot requests, and provide request handling options.
     */
    public BotRatings getBotRatings() {
        return this.BotRatings;
    }

    /**
     * Set Based on the client and request features, divide the request source into human requests, valid Bot requests, suspected Bot requests, and high-risk Bot requests, and provide request handling options.
     * @param BotRatings Based on the client and request features, divide the request source into human requests, valid Bot requests, suspected Bot requests, and high-risk Bot requests, and provide request handling options.
     */
    public void setBotRatings(BotRatings BotRatings) {
        this.BotRatings = BotRatings;
    }

    public BotIntelligence() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotIntelligence(BotIntelligence source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.BotRatings != null) {
            this.BotRatings = new BotRatings(source.BotRatings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "BotRatings.", this.BotRatings);

    }
}

