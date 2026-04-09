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

public class BasicBotSettings extends AbstractModel {

    /**
    * Client IP source IDC configuration, used for handling access requests from client ips in idcs (data centers). such source requests are not directly accessed by mobile terminals or browser-side.
    */
    @SerializedName("SourceIDC")
    @Expose
    private SourceIDC SourceIDC;

    /**
    * Search engine crawler configuration, used to handle requests from search engine crawlers. the IP, User-Agent, or rDNS results of such requests match known search engine crawlers.
    */
    @SerializedName("SearchEngineBots")
    @Expose
    private SearchEngineBots SearchEngineBots;

    /**
    * Commercial or open-source tool UA feature configuration (original UA feature rule), used to handle access requests from known commercial or open-source tools. the User-Agent header of such requests complies with known commercial or open-source tool features.
    */
    @SerializedName("KnownBotCategories")
    @Expose
    private KnownBotCategories KnownBotCategories;

    /**
    * Threat intelligence database (originally client profile analysis) configuration, used for handling client ips with specific risk characteristics in recent access behavior.
    */
    @SerializedName("IPReputation")
    @Expose
    private IPReputation IPReputation;

    /**
    * Specifies the configuration for Bot intelligent analysis.
    */
    @SerializedName("BotIntelligence")
    @Expose
    private BotIntelligence BotIntelligence;

    /**
     * Get Client IP source IDC configuration, used for handling access requests from client ips in idcs (data centers). such source requests are not directly accessed by mobile terminals or browser-side. 
     * @return SourceIDC Client IP source IDC configuration, used for handling access requests from client ips in idcs (data centers). such source requests are not directly accessed by mobile terminals or browser-side.
     */
    public SourceIDC getSourceIDC() {
        return this.SourceIDC;
    }

    /**
     * Set Client IP source IDC configuration, used for handling access requests from client ips in idcs (data centers). such source requests are not directly accessed by mobile terminals or browser-side.
     * @param SourceIDC Client IP source IDC configuration, used for handling access requests from client ips in idcs (data centers). such source requests are not directly accessed by mobile terminals or browser-side.
     */
    public void setSourceIDC(SourceIDC SourceIDC) {
        this.SourceIDC = SourceIDC;
    }

    /**
     * Get Search engine crawler configuration, used to handle requests from search engine crawlers. the IP, User-Agent, or rDNS results of such requests match known search engine crawlers. 
     * @return SearchEngineBots Search engine crawler configuration, used to handle requests from search engine crawlers. the IP, User-Agent, or rDNS results of such requests match known search engine crawlers.
     */
    public SearchEngineBots getSearchEngineBots() {
        return this.SearchEngineBots;
    }

    /**
     * Set Search engine crawler configuration, used to handle requests from search engine crawlers. the IP, User-Agent, or rDNS results of such requests match known search engine crawlers.
     * @param SearchEngineBots Search engine crawler configuration, used to handle requests from search engine crawlers. the IP, User-Agent, or rDNS results of such requests match known search engine crawlers.
     */
    public void setSearchEngineBots(SearchEngineBots SearchEngineBots) {
        this.SearchEngineBots = SearchEngineBots;
    }

    /**
     * Get Commercial or open-source tool UA feature configuration (original UA feature rule), used to handle access requests from known commercial or open-source tools. the User-Agent header of such requests complies with known commercial or open-source tool features. 
     * @return KnownBotCategories Commercial or open-source tool UA feature configuration (original UA feature rule), used to handle access requests from known commercial or open-source tools. the User-Agent header of such requests complies with known commercial or open-source tool features.
     */
    public KnownBotCategories getKnownBotCategories() {
        return this.KnownBotCategories;
    }

    /**
     * Set Commercial or open-source tool UA feature configuration (original UA feature rule), used to handle access requests from known commercial or open-source tools. the User-Agent header of such requests complies with known commercial or open-source tool features.
     * @param KnownBotCategories Commercial or open-source tool UA feature configuration (original UA feature rule), used to handle access requests from known commercial or open-source tools. the User-Agent header of such requests complies with known commercial or open-source tool features.
     */
    public void setKnownBotCategories(KnownBotCategories KnownBotCategories) {
        this.KnownBotCategories = KnownBotCategories;
    }

    /**
     * Get Threat intelligence database (originally client profile analysis) configuration, used for handling client ips with specific risk characteristics in recent access behavior. 
     * @return IPReputation Threat intelligence database (originally client profile analysis) configuration, used for handling client ips with specific risk characteristics in recent access behavior.
     */
    public IPReputation getIPReputation() {
        return this.IPReputation;
    }

    /**
     * Set Threat intelligence database (originally client profile analysis) configuration, used for handling client ips with specific risk characteristics in recent access behavior.
     * @param IPReputation Threat intelligence database (originally client profile analysis) configuration, used for handling client ips with specific risk characteristics in recent access behavior.
     */
    public void setIPReputation(IPReputation IPReputation) {
        this.IPReputation = IPReputation;
    }

    /**
     * Get Specifies the configuration for Bot intelligent analysis. 
     * @return BotIntelligence Specifies the configuration for Bot intelligent analysis.
     */
    public BotIntelligence getBotIntelligence() {
        return this.BotIntelligence;
    }

    /**
     * Set Specifies the configuration for Bot intelligent analysis.
     * @param BotIntelligence Specifies the configuration for Bot intelligent analysis.
     */
    public void setBotIntelligence(BotIntelligence BotIntelligence) {
        this.BotIntelligence = BotIntelligence;
    }

    public BasicBotSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BasicBotSettings(BasicBotSettings source) {
        if (source.SourceIDC != null) {
            this.SourceIDC = new SourceIDC(source.SourceIDC);
        }
        if (source.SearchEngineBots != null) {
            this.SearchEngineBots = new SearchEngineBots(source.SearchEngineBots);
        }
        if (source.KnownBotCategories != null) {
            this.KnownBotCategories = new KnownBotCategories(source.KnownBotCategories);
        }
        if (source.IPReputation != null) {
            this.IPReputation = new IPReputation(source.IPReputation);
        }
        if (source.BotIntelligence != null) {
            this.BotIntelligence = new BotIntelligence(source.BotIntelligence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SourceIDC.", this.SourceIDC);
        this.setParamObj(map, prefix + "SearchEngineBots.", this.SearchEngineBots);
        this.setParamObj(map, prefix + "KnownBotCategories.", this.KnownBotCategories);
        this.setParamObj(map, prefix + "IPReputation.", this.IPReputation);
        this.setParamObj(map, prefix + "BotIntelligence.", this.BotIntelligence);

    }
}

