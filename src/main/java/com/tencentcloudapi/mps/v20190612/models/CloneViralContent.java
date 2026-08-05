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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneViralContent extends AbstractModel {

    /**
    * <p>Custom prompt describing requirements for video generation</p>
    */
    @SerializedName("UserPrompt")
    @Expose
    private String UserPrompt;

    /**
    * <p>Target language for video generation. Default: not specified. Supported values: zh / en / ja / ko / es / pt / instrumental (pure music without voiceover)</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>Target market. Default: not specified. Supported values: north_america / europe / china / japan / korea / sea / brazil</p>
    */
    @SerializedName("Market")
    @Expose
    private String Market;

    /**
    * <p>Fission level. Values: exact/low/medium/high. Default: exact (1:1 clone)</p>
    */
    @SerializedName("FissionLevel")
    @Expose
    private String FissionLevel;

    /**
     * Get <p>Custom prompt describing requirements for video generation</p> 
     * @return UserPrompt <p>Custom prompt describing requirements for video generation</p>
     */
    public String getUserPrompt() {
        return this.UserPrompt;
    }

    /**
     * Set <p>Custom prompt describing requirements for video generation</p>
     * @param UserPrompt <p>Custom prompt describing requirements for video generation</p>
     */
    public void setUserPrompt(String UserPrompt) {
        this.UserPrompt = UserPrompt;
    }

    /**
     * Get <p>Target language for video generation. Default: not specified. Supported values: zh / en / ja / ko / es / pt / instrumental (pure music without voiceover)</p> 
     * @return Language <p>Target language for video generation. Default: not specified. Supported values: zh / en / ja / ko / es / pt / instrumental (pure music without voiceover)</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>Target language for video generation. Default: not specified. Supported values: zh / en / ja / ko / es / pt / instrumental (pure music without voiceover)</p>
     * @param Language <p>Target language for video generation. Default: not specified. Supported values: zh / en / ja / ko / es / pt / instrumental (pure music without voiceover)</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>Target market. Default: not specified. Supported values: north_america / europe / china / japan / korea / sea / brazil</p> 
     * @return Market <p>Target market. Default: not specified. Supported values: north_america / europe / china / japan / korea / sea / brazil</p>
     */
    public String getMarket() {
        return this.Market;
    }

    /**
     * Set <p>Target market. Default: not specified. Supported values: north_america / europe / china / japan / korea / sea / brazil</p>
     * @param Market <p>Target market. Default: not specified. Supported values: north_america / europe / china / japan / korea / sea / brazil</p>
     */
    public void setMarket(String Market) {
        this.Market = Market;
    }

    /**
     * Get <p>Fission level. Values: exact/low/medium/high. Default: exact (1:1 clone)</p> 
     * @return FissionLevel <p>Fission level. Values: exact/low/medium/high. Default: exact (1:1 clone)</p>
     */
    public String getFissionLevel() {
        return this.FissionLevel;
    }

    /**
     * Set <p>Fission level. Values: exact/low/medium/high. Default: exact (1:1 clone)</p>
     * @param FissionLevel <p>Fission level. Values: exact/low/medium/high. Default: exact (1:1 clone)</p>
     */
    public void setFissionLevel(String FissionLevel) {
        this.FissionLevel = FissionLevel;
    }

    public CloneViralContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneViralContent(CloneViralContent source) {
        if (source.UserPrompt != null) {
            this.UserPrompt = new String(source.UserPrompt);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Market != null) {
            this.Market = new String(source.Market);
        }
        if (source.FissionLevel != null) {
            this.FissionLevel = new String(source.FissionLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserPrompt", this.UserPrompt);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Market", this.Market);
        this.setParamSimple(map, prefix + "FissionLevel", this.FissionLevel);

    }
}

