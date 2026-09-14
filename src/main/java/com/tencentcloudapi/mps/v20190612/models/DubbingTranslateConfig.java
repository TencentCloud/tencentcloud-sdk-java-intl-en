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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DubbingTranslateConfig extends AbstractModel {

    /**
    * <p>Source language.</p>
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * <p>Target language of the translation.</p>
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * <p>Intelligent translation simplification.</p><p>Enumeration values: </p><ul><li>ON: Turn on intelligent translation simplification.</li><li>OFF: Turn off intelligent translation simplification.</li></ul><p>Default value: OFF</p>
    */
    @SerializedName("SimplifyTranslation")
    @Expose
    private String SimplifyTranslation;

    /**
     * Get <p>Source language.</p> 
     * @return VideoSrcLanguage <p>Source language.</p>
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set <p>Source language.</p>
     * @param VideoSrcLanguage <p>Source language.</p>
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get <p>Target language of the translation.</p> 
     * @return TranslateDstLanguage <p>Target language of the translation.</p>
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set <p>Target language of the translation.</p>
     * @param TranslateDstLanguage <p>Target language of the translation.</p>
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    /**
     * Get <p>Intelligent translation simplification.</p><p>Enumeration values: </p><ul><li>ON: Turn on intelligent translation simplification.</li><li>OFF: Turn off intelligent translation simplification.</li></ul><p>Default value: OFF</p> 
     * @return SimplifyTranslation <p>Intelligent translation simplification.</p><p>Enumeration values: </p><ul><li>ON: Turn on intelligent translation simplification.</li><li>OFF: Turn off intelligent translation simplification.</li></ul><p>Default value: OFF</p>
     */
    public String getSimplifyTranslation() {
        return this.SimplifyTranslation;
    }

    /**
     * Set <p>Intelligent translation simplification.</p><p>Enumeration values: </p><ul><li>ON: Turn on intelligent translation simplification.</li><li>OFF: Turn off intelligent translation simplification.</li></ul><p>Default value: OFF</p>
     * @param SimplifyTranslation <p>Intelligent translation simplification.</p><p>Enumeration values: </p><ul><li>ON: Turn on intelligent translation simplification.</li><li>OFF: Turn off intelligent translation simplification.</li></ul><p>Default value: OFF</p>
     */
    public void setSimplifyTranslation(String SimplifyTranslation) {
        this.SimplifyTranslation = SimplifyTranslation;
    }

    public DubbingTranslateConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DubbingTranslateConfig(DubbingTranslateConfig source) {
        if (source.VideoSrcLanguage != null) {
            this.VideoSrcLanguage = new String(source.VideoSrcLanguage);
        }
        if (source.TranslateDstLanguage != null) {
            this.TranslateDstLanguage = new String(source.TranslateDstLanguage);
        }
        if (source.SimplifyTranslation != null) {
            this.SimplifyTranslation = new String(source.SimplifyTranslation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);
        this.setParamSimple(map, prefix + "SimplifyTranslation", this.SimplifyTranslation);

    }
}

