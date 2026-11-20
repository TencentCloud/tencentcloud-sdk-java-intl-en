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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceConversationS2SConfig extends AbstractModel {

    /**
    * <p>S2S manufacturer identification, for example, "tencent".</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>Manufacturer exclusive parameter, JSON serialized string.</p>
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * <p>The welcome message played when the host enters the room for the first time. It will play again if the host leaves and re-enters the room.</p>
    */
    @SerializedName("WelcomeMessage")
    @Expose
    private String WelcomeMessage;

    /**
     * Get <p>S2S manufacturer identification, for example, "tencent".</p> 
     * @return Provider <p>S2S manufacturer identification, for example, "tencent".</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>S2S manufacturer identification, for example, "tencent".</p>
     * @param Provider <p>S2S manufacturer identification, for example, "tencent".</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>Manufacturer exclusive parameter, JSON serialized string.</p> 
     * @return Params <p>Manufacturer exclusive parameter, JSON serialized string.</p>
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set <p>Manufacturer exclusive parameter, JSON serialized string.</p>
     * @param Params <p>Manufacturer exclusive parameter, JSON serialized string.</p>
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get <p>The welcome message played when the host enters the room for the first time. It will play again if the host leaves and re-enters the room.</p> 
     * @return WelcomeMessage <p>The welcome message played when the host enters the room for the first time. It will play again if the host leaves and re-enters the room.</p>
     */
    public String getWelcomeMessage() {
        return this.WelcomeMessage;
    }

    /**
     * Set <p>The welcome message played when the host enters the room for the first time. It will play again if the host leaves and re-enters the room.</p>
     * @param WelcomeMessage <p>The welcome message played when the host enters the room for the first time. It will play again if the host leaves and re-enters the room.</p>
     */
    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    public VoiceConversationS2SConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationS2SConfig(VoiceConversationS2SConfig source) {
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.WelcomeMessage != null) {
            this.WelcomeMessage = new String(source.WelcomeMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "WelcomeMessage", this.WelcomeMessage);

    }
}

