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

public class BotManagementLite extends AbstractModel {

    /**
    * Configuration of the human-machine verification page.
    */
    @SerializedName("CAPTCHAPageChallenge")
    @Expose
    private CAPTCHAPageChallenge CAPTCHAPageChallenge;

    /**
    * AI crawler detection configuration.
    */
    @SerializedName("AICrawlerDetection")
    @Expose
    private AICrawlerDetection AICrawlerDetection;

    /**
     * Get Configuration of the human-machine verification page. 
     * @return CAPTCHAPageChallenge Configuration of the human-machine verification page.
     */
    public CAPTCHAPageChallenge getCAPTCHAPageChallenge() {
        return this.CAPTCHAPageChallenge;
    }

    /**
     * Set Configuration of the human-machine verification page.
     * @param CAPTCHAPageChallenge Configuration of the human-machine verification page.
     */
    public void setCAPTCHAPageChallenge(CAPTCHAPageChallenge CAPTCHAPageChallenge) {
        this.CAPTCHAPageChallenge = CAPTCHAPageChallenge;
    }

    /**
     * Get AI crawler detection configuration. 
     * @return AICrawlerDetection AI crawler detection configuration.
     */
    public AICrawlerDetection getAICrawlerDetection() {
        return this.AICrawlerDetection;
    }

    /**
     * Set AI crawler detection configuration.
     * @param AICrawlerDetection AI crawler detection configuration.
     */
    public void setAICrawlerDetection(AICrawlerDetection AICrawlerDetection) {
        this.AICrawlerDetection = AICrawlerDetection;
    }

    public BotManagementLite() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagementLite(BotManagementLite source) {
        if (source.CAPTCHAPageChallenge != null) {
            this.CAPTCHAPageChallenge = new CAPTCHAPageChallenge(source.CAPTCHAPageChallenge);
        }
        if (source.AICrawlerDetection != null) {
            this.AICrawlerDetection = new AICrawlerDetection(source.AICrawlerDetection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CAPTCHAPageChallenge.", this.CAPTCHAPageChallenge);
        this.setParamObj(map, prefix + "AICrawlerDetection.", this.AICrawlerDetection);

    }
}

