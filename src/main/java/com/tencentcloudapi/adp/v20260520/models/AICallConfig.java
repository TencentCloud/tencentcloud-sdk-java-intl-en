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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AICallConfig extends AbstractModel {

    /**
    * Digital human configuration
    */
    @SerializedName("DigitalHuman")
    @Expose
    private DigitalHumanConfig DigitalHuman;

    /**
    * Enable digital human
    */
    @SerializedName("EnableDigitalHuman")
    @Expose
    private Boolean EnableDigitalHuman;

    /**
    * Enable voice call
    */
    @SerializedName("EnableVoiceCall")
    @Expose
    private Boolean EnableVoiceCall;

    /**
    * Enable voice interaction
    */
    @SerializedName("EnableVoiceInteract")
    @Expose
    private Boolean EnableVoiceInteract;

    /**
    * Voice type configuration
    */
    @SerializedName("Voice")
    @Expose
    private VoiceConfig Voice;

    /**
     * Get Digital human configuration 
     * @return DigitalHuman Digital human configuration
     */
    public DigitalHumanConfig getDigitalHuman() {
        return this.DigitalHuman;
    }

    /**
     * Set Digital human configuration
     * @param DigitalHuman Digital human configuration
     */
    public void setDigitalHuman(DigitalHumanConfig DigitalHuman) {
        this.DigitalHuman = DigitalHuman;
    }

    /**
     * Get Enable digital human 
     * @return EnableDigitalHuman Enable digital human
     */
    public Boolean getEnableDigitalHuman() {
        return this.EnableDigitalHuman;
    }

    /**
     * Set Enable digital human
     * @param EnableDigitalHuman Enable digital human
     */
    public void setEnableDigitalHuman(Boolean EnableDigitalHuman) {
        this.EnableDigitalHuman = EnableDigitalHuman;
    }

    /**
     * Get Enable voice call 
     * @return EnableVoiceCall Enable voice call
     */
    public Boolean getEnableVoiceCall() {
        return this.EnableVoiceCall;
    }

    /**
     * Set Enable voice call
     * @param EnableVoiceCall Enable voice call
     */
    public void setEnableVoiceCall(Boolean EnableVoiceCall) {
        this.EnableVoiceCall = EnableVoiceCall;
    }

    /**
     * Get Enable voice interaction 
     * @return EnableVoiceInteract Enable voice interaction
     */
    public Boolean getEnableVoiceInteract() {
        return this.EnableVoiceInteract;
    }

    /**
     * Set Enable voice interaction
     * @param EnableVoiceInteract Enable voice interaction
     */
    public void setEnableVoiceInteract(Boolean EnableVoiceInteract) {
        this.EnableVoiceInteract = EnableVoiceInteract;
    }

    /**
     * Get Voice type configuration 
     * @return Voice Voice type configuration
     */
    public VoiceConfig getVoice() {
        return this.Voice;
    }

    /**
     * Set Voice type configuration
     * @param Voice Voice type configuration
     */
    public void setVoice(VoiceConfig Voice) {
        this.Voice = Voice;
    }

    public AICallConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICallConfig(AICallConfig source) {
        if (source.DigitalHuman != null) {
            this.DigitalHuman = new DigitalHumanConfig(source.DigitalHuman);
        }
        if (source.EnableDigitalHuman != null) {
            this.EnableDigitalHuman = new Boolean(source.EnableDigitalHuman);
        }
        if (source.EnableVoiceCall != null) {
            this.EnableVoiceCall = new Boolean(source.EnableVoiceCall);
        }
        if (source.EnableVoiceInteract != null) {
            this.EnableVoiceInteract = new Boolean(source.EnableVoiceInteract);
        }
        if (source.Voice != null) {
            this.Voice = new VoiceConfig(source.Voice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DigitalHuman.", this.DigitalHuman);
        this.setParamSimple(map, prefix + "EnableDigitalHuman", this.EnableDigitalHuman);
        this.setParamSimple(map, prefix + "EnableVoiceCall", this.EnableVoiceCall);
        this.setParamSimple(map, prefix + "EnableVoiceInteract", this.EnableVoiceInteract);
        this.setParamObj(map, prefix + "Voice.", this.Voice);

    }
}

