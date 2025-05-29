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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AICallConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("EnableVoiceInteract")
    @Expose
    private Boolean EnableVoiceInteract;

    /**
    * 
    */
    @SerializedName("EnableVoiceCall")
    @Expose
    private Boolean EnableVoiceCall;

    /**
    * 
    */
    @SerializedName("EnableDigitalHuman")
    @Expose
    private Boolean EnableDigitalHuman;

    /**
    * 
    */
    @SerializedName("Voice")
    @Expose
    private VoiceConfig Voice;

    /**
    * 
    */
    @SerializedName("DigitalHuman")
    @Expose
    private DigitalHumanConfig DigitalHuman;

    /**
     * Get  
     * @return EnableVoiceInteract 
     */
    public Boolean getEnableVoiceInteract() {
        return this.EnableVoiceInteract;
    }

    /**
     * Set 
     * @param EnableVoiceInteract 
     */
    public void setEnableVoiceInteract(Boolean EnableVoiceInteract) {
        this.EnableVoiceInteract = EnableVoiceInteract;
    }

    /**
     * Get  
     * @return EnableVoiceCall 
     */
    public Boolean getEnableVoiceCall() {
        return this.EnableVoiceCall;
    }

    /**
     * Set 
     * @param EnableVoiceCall 
     */
    public void setEnableVoiceCall(Boolean EnableVoiceCall) {
        this.EnableVoiceCall = EnableVoiceCall;
    }

    /**
     * Get  
     * @return EnableDigitalHuman 
     */
    public Boolean getEnableDigitalHuman() {
        return this.EnableDigitalHuman;
    }

    /**
     * Set 
     * @param EnableDigitalHuman 
     */
    public void setEnableDigitalHuman(Boolean EnableDigitalHuman) {
        this.EnableDigitalHuman = EnableDigitalHuman;
    }

    /**
     * Get  
     * @return Voice 
     */
    public VoiceConfig getVoice() {
        return this.Voice;
    }

    /**
     * Set 
     * @param Voice 
     */
    public void setVoice(VoiceConfig Voice) {
        this.Voice = Voice;
    }

    /**
     * Get  
     * @return DigitalHuman 
     */
    public DigitalHumanConfig getDigitalHuman() {
        return this.DigitalHuman;
    }

    /**
     * Set 
     * @param DigitalHuman 
     */
    public void setDigitalHuman(DigitalHumanConfig DigitalHuman) {
        this.DigitalHuman = DigitalHuman;
    }

    public AICallConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICallConfig(AICallConfig source) {
        if (source.EnableVoiceInteract != null) {
            this.EnableVoiceInteract = new Boolean(source.EnableVoiceInteract);
        }
        if (source.EnableVoiceCall != null) {
            this.EnableVoiceCall = new Boolean(source.EnableVoiceCall);
        }
        if (source.EnableDigitalHuman != null) {
            this.EnableDigitalHuman = new Boolean(source.EnableDigitalHuman);
        }
        if (source.Voice != null) {
            this.Voice = new VoiceConfig(source.Voice);
        }
        if (source.DigitalHuman != null) {
            this.DigitalHuman = new DigitalHumanConfig(source.DigitalHuman);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableVoiceInteract", this.EnableVoiceInteract);
        this.setParamSimple(map, prefix + "EnableVoiceCall", this.EnableVoiceCall);
        this.setParamSimple(map, prefix + "EnableDigitalHuman", this.EnableDigitalHuman);
        this.setParamObj(map, prefix + "Voice.", this.Voice);
        this.setParamObj(map, prefix + "DigitalHuman.", this.DigitalHuman);

    }
}

