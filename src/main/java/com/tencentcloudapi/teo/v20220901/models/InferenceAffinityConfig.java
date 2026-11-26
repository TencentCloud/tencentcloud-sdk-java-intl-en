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

public class InferenceAffinityConfig extends AbstractModel {

    /**
    * <p>Master switch for inference service affinity.</p><p>Enumeration values:</p><ul><li>On: Enable inference service affinity;</li><li>Off: Disable inference service affinity.</li></ul>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Affinity approach for inference service.</p><p>Enumeration values:</p><ul><li>SessionId: Affinity based on session ID.</li></ul><p>Default value: SessionId.</p>
    */
    @SerializedName("AffinityMode")
    @Expose
    private String AffinityMode;

    /**
    * <p>Inference service affinity configuration. Required when AffinityMode is SessionId.</p>
    */
    @SerializedName("SessionIdAffinityConfig")
    @Expose
    private SessionIdAffinityConfig SessionIdAffinityConfig;

    /**
     * Get <p>Master switch for inference service affinity.</p><p>Enumeration values:</p><ul><li>On: Enable inference service affinity;</li><li>Off: Disable inference service affinity.</li></ul> 
     * @return Switch <p>Master switch for inference service affinity.</p><p>Enumeration values:</p><ul><li>On: Enable inference service affinity;</li><li>Off: Disable inference service affinity.</li></ul>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Master switch for inference service affinity.</p><p>Enumeration values:</p><ul><li>On: Enable inference service affinity;</li><li>Off: Disable inference service affinity.</li></ul>
     * @param Switch <p>Master switch for inference service affinity.</p><p>Enumeration values:</p><ul><li>On: Enable inference service affinity;</li><li>Off: Disable inference service affinity.</li></ul>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Affinity approach for inference service.</p><p>Enumeration values:</p><ul><li>SessionId: Affinity based on session ID.</li></ul><p>Default value: SessionId.</p> 
     * @return AffinityMode <p>Affinity approach for inference service.</p><p>Enumeration values:</p><ul><li>SessionId: Affinity based on session ID.</li></ul><p>Default value: SessionId.</p>
     */
    public String getAffinityMode() {
        return this.AffinityMode;
    }

    /**
     * Set <p>Affinity approach for inference service.</p><p>Enumeration values:</p><ul><li>SessionId: Affinity based on session ID.</li></ul><p>Default value: SessionId.</p>
     * @param AffinityMode <p>Affinity approach for inference service.</p><p>Enumeration values:</p><ul><li>SessionId: Affinity based on session ID.</li></ul><p>Default value: SessionId.</p>
     */
    public void setAffinityMode(String AffinityMode) {
        this.AffinityMode = AffinityMode;
    }

    /**
     * Get <p>Inference service affinity configuration. Required when AffinityMode is SessionId.</p> 
     * @return SessionIdAffinityConfig <p>Inference service affinity configuration. Required when AffinityMode is SessionId.</p>
     */
    public SessionIdAffinityConfig getSessionIdAffinityConfig() {
        return this.SessionIdAffinityConfig;
    }

    /**
     * Set <p>Inference service affinity configuration. Required when AffinityMode is SessionId.</p>
     * @param SessionIdAffinityConfig <p>Inference service affinity configuration. Required when AffinityMode is SessionId.</p>
     */
    public void setSessionIdAffinityConfig(SessionIdAffinityConfig SessionIdAffinityConfig) {
        this.SessionIdAffinityConfig = SessionIdAffinityConfig;
    }

    public InferenceAffinityConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceAffinityConfig(InferenceAffinityConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.AffinityMode != null) {
            this.AffinityMode = new String(source.AffinityMode);
        }
        if (source.SessionIdAffinityConfig != null) {
            this.SessionIdAffinityConfig = new SessionIdAffinityConfig(source.SessionIdAffinityConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "AffinityMode", this.AffinityMode);
        this.setParamObj(map, prefix + "SessionIdAffinityConfig.", this.SessionIdAffinityConfig);

    }
}

