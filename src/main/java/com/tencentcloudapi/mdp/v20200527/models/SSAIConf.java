/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SSAIConf extends AbstractModel {

    /**
    * Advertising Decision Server URL (ADS).
    */
    @SerializedName("AdsUrl")
    @Expose
    private String AdsUrl;

    /**
    * Parameter configuration.
    */
    @SerializedName("ConfigAliases")
    @Expose
    private ConfigAliasesInfo [] ConfigAliases;

    /**
    * Whether to enable transparent transmission of advertising tags.
    */
    @SerializedName("AdMarkerPassthrough")
    @Expose
    private Boolean AdMarkerPassthrough;

    /**
    * How to process tags in advertisements, optional values: [1,2] 
1: Process all SCTE-35 type tags - all (default) 
2: SCTE-35enhanced, parse some types.
    */
    @SerializedName("SCTE35AdType")
    @Expose
    private Long SCTE35AdType;

    /**
    * Default advertising url.
    */
    @SerializedName("SlateAd")
    @Expose
    private String SlateAd;

    /**
    * Maximum unfilled duration, unit: seconds.
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * Whether to enable mpd location, true corresponds to enable, false corresponds to disable.
    */
    @SerializedName("DashMPDLocation")
    @Expose
    private Boolean DashMPDLocation;

    /**
    * The type of tag that is regarded as an advertisement, optional values: [1,8]
1. Splice insert 
2. Provider advertisement 
3. Distributor advertisement 
4. Provider placement opportunity 
5. Distributor placement opportunity 
6. Break 
7. Provider overlay placement opportunity 
8. Distributor overlay placement opportunity.
    */
    @SerializedName("AdTriggers")
    @Expose
    private Long [] AdTriggers;

    /**
    * The type of distribution restriction that is considered an advertisement, optional values: [1,4]
1:None 
2:Restricted (default) 
3:Unrestricted 
4.Both.
    */
    @SerializedName("DeliveryRestrictions")
    @Expose
    private Long DeliveryRestrictions;

    /**
    * Source CDN prefix, needs to start with http:// or https://
    */
    @SerializedName("SourceCDNPrefix")
    @Expose
    private String SourceCDNPrefix;

    /**
    * Advertising CDN prefix needs to start with http:// or https://
    */
    @SerializedName("AdCDNPrefix")
    @Expose
    private String AdCDNPrefix;

    /**
     * Get Advertising Decision Server URL (ADS). 
     * @return AdsUrl Advertising Decision Server URL (ADS).
     */
    public String getAdsUrl() {
        return this.AdsUrl;
    }

    /**
     * Set Advertising Decision Server URL (ADS).
     * @param AdsUrl Advertising Decision Server URL (ADS).
     */
    public void setAdsUrl(String AdsUrl) {
        this.AdsUrl = AdsUrl;
    }

    /**
     * Get Parameter configuration. 
     * @return ConfigAliases Parameter configuration.
     */
    public ConfigAliasesInfo [] getConfigAliases() {
        return this.ConfigAliases;
    }

    /**
     * Set Parameter configuration.
     * @param ConfigAliases Parameter configuration.
     */
    public void setConfigAliases(ConfigAliasesInfo [] ConfigAliases) {
        this.ConfigAliases = ConfigAliases;
    }

    /**
     * Get Whether to enable transparent transmission of advertising tags. 
     * @return AdMarkerPassthrough Whether to enable transparent transmission of advertising tags.
     */
    public Boolean getAdMarkerPassthrough() {
        return this.AdMarkerPassthrough;
    }

    /**
     * Set Whether to enable transparent transmission of advertising tags.
     * @param AdMarkerPassthrough Whether to enable transparent transmission of advertising tags.
     */
    public void setAdMarkerPassthrough(Boolean AdMarkerPassthrough) {
        this.AdMarkerPassthrough = AdMarkerPassthrough;
    }

    /**
     * Get How to process tags in advertisements, optional values: [1,2] 
1: Process all SCTE-35 type tags - all (default) 
2: SCTE-35enhanced, parse some types. 
     * @return SCTE35AdType How to process tags in advertisements, optional values: [1,2] 
1: Process all SCTE-35 type tags - all (default) 
2: SCTE-35enhanced, parse some types.
     */
    public Long getSCTE35AdType() {
        return this.SCTE35AdType;
    }

    /**
     * Set How to process tags in advertisements, optional values: [1,2] 
1: Process all SCTE-35 type tags - all (default) 
2: SCTE-35enhanced, parse some types.
     * @param SCTE35AdType How to process tags in advertisements, optional values: [1,2] 
1: Process all SCTE-35 type tags - all (default) 
2: SCTE-35enhanced, parse some types.
     */
    public void setSCTE35AdType(Long SCTE35AdType) {
        this.SCTE35AdType = SCTE35AdType;
    }

    /**
     * Get Default advertising url. 
     * @return SlateAd Default advertising url.
     */
    public String getSlateAd() {
        return this.SlateAd;
    }

    /**
     * Set Default advertising url.
     * @param SlateAd Default advertising url.
     */
    public void setSlateAd(String SlateAd) {
        this.SlateAd = SlateAd;
    }

    /**
     * Get Maximum unfilled duration, unit: seconds. 
     * @return Threshold Maximum unfilled duration, unit: seconds.
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Maximum unfilled duration, unit: seconds.
     * @param Threshold Maximum unfilled duration, unit: seconds.
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get Whether to enable mpd location, true corresponds to enable, false corresponds to disable. 
     * @return DashMPDLocation Whether to enable mpd location, true corresponds to enable, false corresponds to disable.
     */
    public Boolean getDashMPDLocation() {
        return this.DashMPDLocation;
    }

    /**
     * Set Whether to enable mpd location, true corresponds to enable, false corresponds to disable.
     * @param DashMPDLocation Whether to enable mpd location, true corresponds to enable, false corresponds to disable.
     */
    public void setDashMPDLocation(Boolean DashMPDLocation) {
        this.DashMPDLocation = DashMPDLocation;
    }

    /**
     * Get The type of tag that is regarded as an advertisement, optional values: [1,8]
1. Splice insert 
2. Provider advertisement 
3. Distributor advertisement 
4. Provider placement opportunity 
5. Distributor placement opportunity 
6. Break 
7. Provider overlay placement opportunity 
8. Distributor overlay placement opportunity. 
     * @return AdTriggers The type of tag that is regarded as an advertisement, optional values: [1,8]
1. Splice insert 
2. Provider advertisement 
3. Distributor advertisement 
4. Provider placement opportunity 
5. Distributor placement opportunity 
6. Break 
7. Provider overlay placement opportunity 
8. Distributor overlay placement opportunity.
     */
    public Long [] getAdTriggers() {
        return this.AdTriggers;
    }

    /**
     * Set The type of tag that is regarded as an advertisement, optional values: [1,8]
1. Splice insert 
2. Provider advertisement 
3. Distributor advertisement 
4. Provider placement opportunity 
5. Distributor placement opportunity 
6. Break 
7. Provider overlay placement opportunity 
8. Distributor overlay placement opportunity.
     * @param AdTriggers The type of tag that is regarded as an advertisement, optional values: [1,8]
1. Splice insert 
2. Provider advertisement 
3. Distributor advertisement 
4. Provider placement opportunity 
5. Distributor placement opportunity 
6. Break 
7. Provider overlay placement opportunity 
8. Distributor overlay placement opportunity.
     */
    public void setAdTriggers(Long [] AdTriggers) {
        this.AdTriggers = AdTriggers;
    }

    /**
     * Get The type of distribution restriction that is considered an advertisement, optional values: [1,4]
1:None 
2:Restricted (default) 
3:Unrestricted 
4.Both. 
     * @return DeliveryRestrictions The type of distribution restriction that is considered an advertisement, optional values: [1,4]
1:None 
2:Restricted (default) 
3:Unrestricted 
4.Both.
     */
    public Long getDeliveryRestrictions() {
        return this.DeliveryRestrictions;
    }

    /**
     * Set The type of distribution restriction that is considered an advertisement, optional values: [1,4]
1:None 
2:Restricted (default) 
3:Unrestricted 
4.Both.
     * @param DeliveryRestrictions The type of distribution restriction that is considered an advertisement, optional values: [1,4]
1:None 
2:Restricted (default) 
3:Unrestricted 
4.Both.
     */
    public void setDeliveryRestrictions(Long DeliveryRestrictions) {
        this.DeliveryRestrictions = DeliveryRestrictions;
    }

    /**
     * Get Source CDN prefix, needs to start with http:// or https:// 
     * @return SourceCDNPrefix Source CDN prefix, needs to start with http:// or https://
     */
    public String getSourceCDNPrefix() {
        return this.SourceCDNPrefix;
    }

    /**
     * Set Source CDN prefix, needs to start with http:// or https://
     * @param SourceCDNPrefix Source CDN prefix, needs to start with http:// or https://
     */
    public void setSourceCDNPrefix(String SourceCDNPrefix) {
        this.SourceCDNPrefix = SourceCDNPrefix;
    }

    /**
     * Get Advertising CDN prefix needs to start with http:// or https:// 
     * @return AdCDNPrefix Advertising CDN prefix needs to start with http:// or https://
     */
    public String getAdCDNPrefix() {
        return this.AdCDNPrefix;
    }

    /**
     * Set Advertising CDN prefix needs to start with http:// or https://
     * @param AdCDNPrefix Advertising CDN prefix needs to start with http:// or https://
     */
    public void setAdCDNPrefix(String AdCDNPrefix) {
        this.AdCDNPrefix = AdCDNPrefix;
    }

    public SSAIConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SSAIConf(SSAIConf source) {
        if (source.AdsUrl != null) {
            this.AdsUrl = new String(source.AdsUrl);
        }
        if (source.ConfigAliases != null) {
            this.ConfigAliases = new ConfigAliasesInfo[source.ConfigAliases.length];
            for (int i = 0; i < source.ConfigAliases.length; i++) {
                this.ConfigAliases[i] = new ConfigAliasesInfo(source.ConfigAliases[i]);
            }
        }
        if (source.AdMarkerPassthrough != null) {
            this.AdMarkerPassthrough = new Boolean(source.AdMarkerPassthrough);
        }
        if (source.SCTE35AdType != null) {
            this.SCTE35AdType = new Long(source.SCTE35AdType);
        }
        if (source.SlateAd != null) {
            this.SlateAd = new String(source.SlateAd);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.DashMPDLocation != null) {
            this.DashMPDLocation = new Boolean(source.DashMPDLocation);
        }
        if (source.AdTriggers != null) {
            this.AdTriggers = new Long[source.AdTriggers.length];
            for (int i = 0; i < source.AdTriggers.length; i++) {
                this.AdTriggers[i] = new Long(source.AdTriggers[i]);
            }
        }
        if (source.DeliveryRestrictions != null) {
            this.DeliveryRestrictions = new Long(source.DeliveryRestrictions);
        }
        if (source.SourceCDNPrefix != null) {
            this.SourceCDNPrefix = new String(source.SourceCDNPrefix);
        }
        if (source.AdCDNPrefix != null) {
            this.AdCDNPrefix = new String(source.AdCDNPrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AdsUrl", this.AdsUrl);
        this.setParamArrayObj(map, prefix + "ConfigAliases.", this.ConfigAliases);
        this.setParamSimple(map, prefix + "AdMarkerPassthrough", this.AdMarkerPassthrough);
        this.setParamSimple(map, prefix + "SCTE35AdType", this.SCTE35AdType);
        this.setParamSimple(map, prefix + "SlateAd", this.SlateAd);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "DashMPDLocation", this.DashMPDLocation);
        this.setParamArraySimple(map, prefix + "AdTriggers.", this.AdTriggers);
        this.setParamSimple(map, prefix + "DeliveryRestrictions", this.DeliveryRestrictions);
        this.setParamSimple(map, prefix + "SourceCDNPrefix", this.SourceCDNPrefix);
        this.setParamSimple(map, prefix + "AdCDNPrefix", this.AdCDNPrefix);

    }
}

