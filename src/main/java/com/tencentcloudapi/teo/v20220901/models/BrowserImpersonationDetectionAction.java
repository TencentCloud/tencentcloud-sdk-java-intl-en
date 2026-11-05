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

public class BrowserImpersonationDetectionAction extends AbstractModel {

    /**
    * Cookie verification and session tracking configuration.
    */
    @SerializedName("BotSessionValidation")
    @Expose
    private BotSessionValidation BotSessionValidation;

    /**
    * Client behavior validation configuration.
    */
    @SerializedName("ClientBehaviorDetection")
    @Expose
    private ClientBehaviorDetection ClientBehaviorDetection;

    /**
     * Get Cookie verification and session tracking configuration. 
     * @return BotSessionValidation Cookie verification and session tracking configuration.
     */
    public BotSessionValidation getBotSessionValidation() {
        return this.BotSessionValidation;
    }

    /**
     * Set Cookie verification and session tracking configuration.
     * @param BotSessionValidation Cookie verification and session tracking configuration.
     */
    public void setBotSessionValidation(BotSessionValidation BotSessionValidation) {
        this.BotSessionValidation = BotSessionValidation;
    }

    /**
     * Get Client behavior validation configuration. 
     * @return ClientBehaviorDetection Client behavior validation configuration.
     */
    public ClientBehaviorDetection getClientBehaviorDetection() {
        return this.ClientBehaviorDetection;
    }

    /**
     * Set Client behavior validation configuration.
     * @param ClientBehaviorDetection Client behavior validation configuration.
     */
    public void setClientBehaviorDetection(ClientBehaviorDetection ClientBehaviorDetection) {
        this.ClientBehaviorDetection = ClientBehaviorDetection;
    }

    public BrowserImpersonationDetectionAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrowserImpersonationDetectionAction(BrowserImpersonationDetectionAction source) {
        if (source.BotSessionValidation != null) {
            this.BotSessionValidation = new BotSessionValidation(source.BotSessionValidation);
        }
        if (source.ClientBehaviorDetection != null) {
            this.ClientBehaviorDetection = new ClientBehaviorDetection(source.ClientBehaviorDetection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BotSessionValidation.", this.BotSessionValidation);
        this.setParamObj(map, prefix + "ClientBehaviorDetection.", this.ClientBehaviorDetection);

    }
}

