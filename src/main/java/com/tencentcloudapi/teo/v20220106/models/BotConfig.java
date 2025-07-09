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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotConfig extends AbstractModel {

    /**
    * Whether to enable bot security configuration
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Preset rules
    */
    @SerializedName("ManagedRule")
    @Expose
    private BotManagedRule ManagedRule;

    /**
    * Not supported currently
    */
    @SerializedName("UaBotRule")
    @Expose
    private BotManagedRule UaBotRule;

    /**
    * Not supported currently
    */
    @SerializedName("IspBotRule")
    @Expose
    private BotManagedRule IspBotRule;

    /**
    * User portrait rules
    */
    @SerializedName("PortraitRule")
    @Expose
    private BotPortraitRule PortraitRule;

    /**
    * Bot intelligence rules
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IntelligenceRule")
    @Expose
    private IntelligenceRule IntelligenceRule;

    /**
     * Get Whether to enable bot security configuration 
     * @return Switch Whether to enable bot security configuration
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable bot security configuration
     * @param Switch Whether to enable bot security configuration
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Preset rules 
     * @return ManagedRule Preset rules
     */
    public BotManagedRule getManagedRule() {
        return this.ManagedRule;
    }

    /**
     * Set Preset rules
     * @param ManagedRule Preset rules
     */
    public void setManagedRule(BotManagedRule ManagedRule) {
        this.ManagedRule = ManagedRule;
    }

    /**
     * Get Not supported currently 
     * @return UaBotRule Not supported currently
     */
    public BotManagedRule getUaBotRule() {
        return this.UaBotRule;
    }

    /**
     * Set Not supported currently
     * @param UaBotRule Not supported currently
     */
    public void setUaBotRule(BotManagedRule UaBotRule) {
        this.UaBotRule = UaBotRule;
    }

    /**
     * Get Not supported currently 
     * @return IspBotRule Not supported currently
     */
    public BotManagedRule getIspBotRule() {
        return this.IspBotRule;
    }

    /**
     * Set Not supported currently
     * @param IspBotRule Not supported currently
     */
    public void setIspBotRule(BotManagedRule IspBotRule) {
        this.IspBotRule = IspBotRule;
    }

    /**
     * Get User portrait rules 
     * @return PortraitRule User portrait rules
     */
    public BotPortraitRule getPortraitRule() {
        return this.PortraitRule;
    }

    /**
     * Set User portrait rules
     * @param PortraitRule User portrait rules
     */
    public void setPortraitRule(BotPortraitRule PortraitRule) {
        this.PortraitRule = PortraitRule;
    }

    /**
     * Get Bot intelligence rules
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IntelligenceRule Bot intelligence rules
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public IntelligenceRule getIntelligenceRule() {
        return this.IntelligenceRule;
    }

    /**
     * Set Bot intelligence rules
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IntelligenceRule Bot intelligence rules
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntelligenceRule(IntelligenceRule IntelligenceRule) {
        this.IntelligenceRule = IntelligenceRule;
    }

    public BotConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotConfig(BotConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ManagedRule != null) {
            this.ManagedRule = new BotManagedRule(source.ManagedRule);
        }
        if (source.UaBotRule != null) {
            this.UaBotRule = new BotManagedRule(source.UaBotRule);
        }
        if (source.IspBotRule != null) {
            this.IspBotRule = new BotManagedRule(source.IspBotRule);
        }
        if (source.PortraitRule != null) {
            this.PortraitRule = new BotPortraitRule(source.PortraitRule);
        }
        if (source.IntelligenceRule != null) {
            this.IntelligenceRule = new IntelligenceRule(source.IntelligenceRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "ManagedRule.", this.ManagedRule);
        this.setParamObj(map, prefix + "UaBotRule.", this.UaBotRule);
        this.setParamObj(map, prefix + "IspBotRule.", this.IspBotRule);
        this.setParamObj(map, prefix + "PortraitRule.", this.PortraitRule);
        this.setParamObj(map, prefix + "IntelligenceRule.", this.IntelligenceRule);

    }
}

