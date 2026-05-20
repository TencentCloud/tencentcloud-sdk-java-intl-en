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

public class TurnDetection extends AbstractModel {

    /**
    * This parameter is valid only when TurnDetectionMode is 3, indicating the sensitivity of sentence segmentation.


Feature description: determines whether the user has finished speaking to separate the audio.


Optional: "low" | "medium" | "high" | "auto".


auto is the default value, same as medium.
low will give users sufficient time to speak.
high will perform audio chunking as soon as possible.


If you wish the model to respond more frequently in conversation mode, you can set SemanticEagerness to high.
If you wish the AI to wait a moment when the user pauses, set SemanticEagerness to low.
Regardless of the mode, it will eventually split and send to a large model for reply.

    */
    @SerializedName("SemanticEagerness")
    @Expose
    private String SemanticEagerness;

    /**
     * Get This parameter is valid only when TurnDetectionMode is 3, indicating the sensitivity of sentence segmentation.


Feature description: determines whether the user has finished speaking to separate the audio.


Optional: "low" | "medium" | "high" | "auto".


auto is the default value, same as medium.
low will give users sufficient time to speak.
high will perform audio chunking as soon as possible.


If you wish the model to respond more frequently in conversation mode, you can set SemanticEagerness to high.
If you wish the AI to wait a moment when the user pauses, set SemanticEagerness to low.
Regardless of the mode, it will eventually split and send to a large model for reply.
 
     * @return SemanticEagerness This parameter is valid only when TurnDetectionMode is 3, indicating the sensitivity of sentence segmentation.


Feature description: determines whether the user has finished speaking to separate the audio.


Optional: "low" | "medium" | "high" | "auto".


auto is the default value, same as medium.
low will give users sufficient time to speak.
high will perform audio chunking as soon as possible.


If you wish the model to respond more frequently in conversation mode, you can set SemanticEagerness to high.
If you wish the AI to wait a moment when the user pauses, set SemanticEagerness to low.
Regardless of the mode, it will eventually split and send to a large model for reply.

     */
    public String getSemanticEagerness() {
        return this.SemanticEagerness;
    }

    /**
     * Set This parameter is valid only when TurnDetectionMode is 3, indicating the sensitivity of sentence segmentation.


Feature description: determines whether the user has finished speaking to separate the audio.


Optional: "low" | "medium" | "high" | "auto".


auto is the default value, same as medium.
low will give users sufficient time to speak.
high will perform audio chunking as soon as possible.


If you wish the model to respond more frequently in conversation mode, you can set SemanticEagerness to high.
If you wish the AI to wait a moment when the user pauses, set SemanticEagerness to low.
Regardless of the mode, it will eventually split and send to a large model for reply.

     * @param SemanticEagerness This parameter is valid only when TurnDetectionMode is 3, indicating the sensitivity of sentence segmentation.


Feature description: determines whether the user has finished speaking to separate the audio.


Optional: "low" | "medium" | "high" | "auto".


auto is the default value, same as medium.
low will give users sufficient time to speak.
high will perform audio chunking as soon as possible.


If you wish the model to respond more frequently in conversation mode, you can set SemanticEagerness to high.
If you wish the AI to wait a moment when the user pauses, set SemanticEagerness to low.
Regardless of the mode, it will eventually split and send to a large model for reply.

     */
    public void setSemanticEagerness(String SemanticEagerness) {
        this.SemanticEagerness = SemanticEagerness;
    }

    public TurnDetection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TurnDetection(TurnDetection source) {
        if (source.SemanticEagerness != null) {
            this.SemanticEagerness = new String(source.SemanticEagerness);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SemanticEagerness", this.SemanticEagerness);

    }
}

