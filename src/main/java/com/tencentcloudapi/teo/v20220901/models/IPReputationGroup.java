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

public class IPReputationGroup extends AbstractModel {

    /**
    * Execution action of the IP intelligence library (formerly client profile analysis). SecurityAction Name parameter supports: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Disabled: not enabled, disable specified rule;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
    */
    @SerializedName("BaseAction")
    @Expose
    private SecurityAction BaseAction;

    /**
    * The specific configuration of the IP intelligence library (originally client profile analysis), used to override the default configuration in BaseAction. among them, the Ids in BotManagementActionOverrides can be filled with: <li>IPREP_WEB_AND_DDOS_ATTACKERS_LOW: network attack - general confidence;</li> <li>IPREP_WEB_AND_DDOS_ATTACKERS_MID: network attack - medium confidence;</li> <li>IPREP_WEB_AND_DDOS_ATTACKERS_HIGH: network attack - HIGH confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_LOW: network proxy - general confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_MID: network proxy - medium confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_HIGH: network proxy - HIGH confidence;</li> <li>IPREP_SCANNING_TOOLS_LOW: scanner - general confidence;</li> <li>IPREP_SCANNING_TOOLS_MID: scanner - medium confidence;</li> <li>IPREP_SCANNING_TOOLS_HIGH: scanner - HIGH confidence;</li> <li>IPREP_ATO_ATTACKERS_LOW: account takeover attack - general confidence;</li> <li>IPREP_ATO_ATTACKERS_MID: account takeover attack - medium confidence;</li> <li>IPREP_ATO_ATTACKERS_HIGH: account takeover attack - HIGH confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_LOW: malicious BOT - general confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_MID: malicious BOT - medium confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_HIGH: malicious BOT - HIGH confidence.</li>.
    */
    @SerializedName("BotManagementActionOverrides")
    @Expose
    private BotManagementActionOverrides [] BotManagementActionOverrides;

    /**
     * Get Execution action of the IP intelligence library (formerly client profile analysis). SecurityAction Name parameter supports: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Disabled: not enabled, disable specified rule;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>. 
     * @return BaseAction Execution action of the IP intelligence library (formerly client profile analysis). SecurityAction Name parameter supports: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Disabled: not enabled, disable specified rule;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
     */
    public SecurityAction getBaseAction() {
        return this.BaseAction;
    }

    /**
     * Set Execution action of the IP intelligence library (formerly client profile analysis). SecurityAction Name parameter supports: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Disabled: not enabled, disable specified rule;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
     * @param BaseAction Execution action of the IP intelligence library (formerly client profile analysis). SecurityAction Name parameter supports: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Disabled: not enabled, disable specified rule;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
     */
    public void setBaseAction(SecurityAction BaseAction) {
        this.BaseAction = BaseAction;
    }

    /**
     * Get The specific configuration of the IP intelligence library (originally client profile analysis), used to override the default configuration in BaseAction. among them, the Ids in BotManagementActionOverrides can be filled with: <li>IPREP_WEB_AND_DDOS_ATTACKERS_LOW: network attack - general confidence;</li> <li>IPREP_WEB_AND_DDOS_ATTACKERS_MID: network attack - medium confidence;</li> <li>IPREP_WEB_AND_DDOS_ATTACKERS_HIGH: network attack - HIGH confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_LOW: network proxy - general confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_MID: network proxy - medium confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_HIGH: network proxy - HIGH confidence;</li> <li>IPREP_SCANNING_TOOLS_LOW: scanner - general confidence;</li> <li>IPREP_SCANNING_TOOLS_MID: scanner - medium confidence;</li> <li>IPREP_SCANNING_TOOLS_HIGH: scanner - HIGH confidence;</li> <li>IPREP_ATO_ATTACKERS_LOW: account takeover attack - general confidence;</li> <li>IPREP_ATO_ATTACKERS_MID: account takeover attack - medium confidence;</li> <li>IPREP_ATO_ATTACKERS_HIGH: account takeover attack - HIGH confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_LOW: malicious BOT - general confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_MID: malicious BOT - medium confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_HIGH: malicious BOT - HIGH confidence.</li>. 
     * @return BotManagementActionOverrides The specific configuration of the IP intelligence library (originally client profile analysis), used to override the default configuration in BaseAction. among them, the Ids in BotManagementActionOverrides can be filled with: <li>IPREP_WEB_AND_DDOS_ATTACKERS_LOW: network attack - general confidence;</li> <li>IPREP_WEB_AND_DDOS_ATTACKERS_MID: network attack - medium confidence;</li> <li>IPREP_WEB_AND_DDOS_ATTACKERS_HIGH: network attack - HIGH confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_LOW: network proxy - general confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_MID: network proxy - medium confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_HIGH: network proxy - HIGH confidence;</li> <li>IPREP_SCANNING_TOOLS_LOW: scanner - general confidence;</li> <li>IPREP_SCANNING_TOOLS_MID: scanner - medium confidence;</li> <li>IPREP_SCANNING_TOOLS_HIGH: scanner - HIGH confidence;</li> <li>IPREP_ATO_ATTACKERS_LOW: account takeover attack - general confidence;</li> <li>IPREP_ATO_ATTACKERS_MID: account takeover attack - medium confidence;</li> <li>IPREP_ATO_ATTACKERS_HIGH: account takeover attack - HIGH confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_LOW: malicious BOT - general confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_MID: malicious BOT - medium confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_HIGH: malicious BOT - HIGH confidence.</li>.
     */
    public BotManagementActionOverrides [] getBotManagementActionOverrides() {
        return this.BotManagementActionOverrides;
    }

    /**
     * Set The specific configuration of the IP intelligence library (originally client profile analysis), used to override the default configuration in BaseAction. among them, the Ids in BotManagementActionOverrides can be filled with: <li>IPREP_WEB_AND_DDOS_ATTACKERS_LOW: network attack - general confidence;</li> <li>IPREP_WEB_AND_DDOS_ATTACKERS_MID: network attack - medium confidence;</li> <li>IPREP_WEB_AND_DDOS_ATTACKERS_HIGH: network attack - HIGH confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_LOW: network proxy - general confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_MID: network proxy - medium confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_HIGH: network proxy - HIGH confidence;</li> <li>IPREP_SCANNING_TOOLS_LOW: scanner - general confidence;</li> <li>IPREP_SCANNING_TOOLS_MID: scanner - medium confidence;</li> <li>IPREP_SCANNING_TOOLS_HIGH: scanner - HIGH confidence;</li> <li>IPREP_ATO_ATTACKERS_LOW: account takeover attack - general confidence;</li> <li>IPREP_ATO_ATTACKERS_MID: account takeover attack - medium confidence;</li> <li>IPREP_ATO_ATTACKERS_HIGH: account takeover attack - HIGH confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_LOW: malicious BOT - general confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_MID: malicious BOT - medium confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_HIGH: malicious BOT - HIGH confidence.</li>.
     * @param BotManagementActionOverrides The specific configuration of the IP intelligence library (originally client profile analysis), used to override the default configuration in BaseAction. among them, the Ids in BotManagementActionOverrides can be filled with: <li>IPREP_WEB_AND_DDOS_ATTACKERS_LOW: network attack - general confidence;</li> <li>IPREP_WEB_AND_DDOS_ATTACKERS_MID: network attack - medium confidence;</li> <li>IPREP_WEB_AND_DDOS_ATTACKERS_HIGH: network attack - HIGH confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_LOW: network proxy - general confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_MID: network proxy - medium confidence;</li> <li>IPREP_PROXIES_AND_ANONYMIZERS_HIGH: network proxy - HIGH confidence;</li> <li>IPREP_SCANNING_TOOLS_LOW: scanner - general confidence;</li> <li>IPREP_SCANNING_TOOLS_MID: scanner - medium confidence;</li> <li>IPREP_SCANNING_TOOLS_HIGH: scanner - HIGH confidence;</li> <li>IPREP_ATO_ATTACKERS_LOW: account takeover attack - general confidence;</li> <li>IPREP_ATO_ATTACKERS_MID: account takeover attack - medium confidence;</li> <li>IPREP_ATO_ATTACKERS_HIGH: account takeover attack - HIGH confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_LOW: malicious BOT - general confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_MID: malicious BOT - medium confidence;</li> <li>IPREP_WEB_SCRAPERS_AND_TRAFFIC_BOTS_HIGH: malicious BOT - HIGH confidence.</li>.
     */
    public void setBotManagementActionOverrides(BotManagementActionOverrides [] BotManagementActionOverrides) {
        this.BotManagementActionOverrides = BotManagementActionOverrides;
    }

    public IPReputationGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPReputationGroup(IPReputationGroup source) {
        if (source.BaseAction != null) {
            this.BaseAction = new SecurityAction(source.BaseAction);
        }
        if (source.BotManagementActionOverrides != null) {
            this.BotManagementActionOverrides = new BotManagementActionOverrides[source.BotManagementActionOverrides.length];
            for (int i = 0; i < source.BotManagementActionOverrides.length; i++) {
                this.BotManagementActionOverrides[i] = new BotManagementActionOverrides(source.BotManagementActionOverrides[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BaseAction.", this.BaseAction);
        this.setParamArrayObj(map, prefix + "BotManagementActionOverrides.", this.BotManagementActionOverrides);

    }
}

