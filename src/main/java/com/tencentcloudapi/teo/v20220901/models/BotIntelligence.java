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
    * Based on client and request features, divides request sources into human requests, legitimate Bot requests, suspected Bot requests, and high-risk Bot requests, and provides request handling options.
    */
    @SerializedName("BotRatings")
    @Expose
    private BotRatings BotRatings;

    /**
    * Specifies the switch for Bot intelligent analysis configuration. valid values:.

on: enabled.
off: disabled.
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get Based on client and request features, divides request sources into human requests, legitimate Bot requests, suspected Bot requests, and high-risk Bot requests, and provides request handling options. 
     * @return BotRatings Based on client and request features, divides request sources into human requests, legitimate Bot requests, suspected Bot requests, and high-risk Bot requests, and provides request handling options.
     */
    public BotRatings getBotRatings() {
        return this.BotRatings;
    }

    /**
     * Set Based on client and request features, divides request sources into human requests, legitimate Bot requests, suspected Bot requests, and high-risk Bot requests, and provides request handling options.
     * @param BotRatings Based on client and request features, divides request sources into human requests, legitimate Bot requests, suspected Bot requests, and high-risk Bot requests, and provides request handling options.
     */
    public void setBotRatings(BotRatings BotRatings) {
        this.BotRatings = BotRatings;
    }

    /**
     * Get Specifies the switch for Bot intelligent analysis configuration. valid values:.

on: enabled.
off: disabled. 
     * @return Enabled Specifies the switch for Bot intelligent analysis configuration. valid values:.

on: enabled.
off: disabled.
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Specifies the switch for Bot intelligent analysis configuration. valid values:.

on: enabled.
off: disabled.
     * @param Enabled Specifies the switch for Bot intelligent analysis configuration. valid values:.

on: enabled.
off: disabled.
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    public BotIntelligence() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotIntelligence(BotIntelligence source) {
        if (source.BotRatings != null) {
            this.BotRatings = new BotRatings(source.BotRatings);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BotRatings.", this.BotRatings);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

