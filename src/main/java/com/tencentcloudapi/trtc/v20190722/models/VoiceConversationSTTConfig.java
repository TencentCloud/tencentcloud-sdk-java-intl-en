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

public class VoiceConversationSTTConfig extends AbstractModel {

    /**
    * <p>ASR provider name: trtc (Tencent Self-developed) or third-party provider (for example, azure).</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>ASR manufacturer exclusive parameter. Fill in the JSON serialized string.</p>
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get <p>ASR provider name: trtc (Tencent Self-developed) or third-party provider (for example, azure).</p> 
     * @return Provider <p>ASR provider name: trtc (Tencent Self-developed) or third-party provider (for example, azure).</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>ASR provider name: trtc (Tencent Self-developed) or third-party provider (for example, azure).</p>
     * @param Provider <p>ASR provider name: trtc (Tencent Self-developed) or third-party provider (for example, azure).</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>ASR manufacturer exclusive parameter. Fill in the JSON serialized string.</p> 
     * @return Params <p>ASR manufacturer exclusive parameter. Fill in the JSON serialized string.</p>
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set <p>ASR manufacturer exclusive parameter. Fill in the JSON serialized string.</p>
     * @param Params <p>ASR manufacturer exclusive parameter. Fill in the JSON serialized string.</p>
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public VoiceConversationSTTConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationSTTConfig(VoiceConversationSTTConfig source) {
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

