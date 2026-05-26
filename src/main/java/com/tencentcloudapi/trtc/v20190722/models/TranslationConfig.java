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

public class TranslationConfig extends AbstractModel {

    /**
    * Target language for translation, target language list (ISO 639-1).

    */
    @SerializedName("TargetLanguages")
    @Expose
    private String [] TargetLanguages;

    /**
    * 1: text translation only 2: speech simultaneous interpretation.

    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Speech simultaneous interpretation configuration. when enabling simultaneous interpretation, transmission is required.
    */
    @SerializedName("TTSConfig")
    @Expose
    private TTSConfig TTSConfig;

    /**
    * Translation terminology collection.
    */
    @SerializedName("Terminology")
    @Expose
    private Terminology [] Terminology;

    /**
     * Get Target language for translation, target language list (ISO 639-1).
 
     * @return TargetLanguages Target language for translation, target language list (ISO 639-1).

     */
    public String [] getTargetLanguages() {
        return this.TargetLanguages;
    }

    /**
     * Set Target language for translation, target language list (ISO 639-1).

     * @param TargetLanguages Target language for translation, target language list (ISO 639-1).

     */
    public void setTargetLanguages(String [] TargetLanguages) {
        this.TargetLanguages = TargetLanguages;
    }

    /**
     * Get 1: text translation only 2: speech simultaneous interpretation.
 
     * @return Mode 1: text translation only 2: speech simultaneous interpretation.

     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 1: text translation only 2: speech simultaneous interpretation.

     * @param Mode 1: text translation only 2: speech simultaneous interpretation.

     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Speech simultaneous interpretation configuration. when enabling simultaneous interpretation, transmission is required. 
     * @return TTSConfig Speech simultaneous interpretation configuration. when enabling simultaneous interpretation, transmission is required.
     */
    public TTSConfig getTTSConfig() {
        return this.TTSConfig;
    }

    /**
     * Set Speech simultaneous interpretation configuration. when enabling simultaneous interpretation, transmission is required.
     * @param TTSConfig Speech simultaneous interpretation configuration. when enabling simultaneous interpretation, transmission is required.
     */
    public void setTTSConfig(TTSConfig TTSConfig) {
        this.TTSConfig = TTSConfig;
    }

    /**
     * Get Translation terminology collection. 
     * @return Terminology Translation terminology collection.
     */
    public Terminology [] getTerminology() {
        return this.Terminology;
    }

    /**
     * Set Translation terminology collection.
     * @param Terminology Translation terminology collection.
     */
    public void setTerminology(Terminology [] Terminology) {
        this.Terminology = Terminology;
    }

    public TranslationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranslationConfig(TranslationConfig source) {
        if (source.TargetLanguages != null) {
            this.TargetLanguages = new String[source.TargetLanguages.length];
            for (int i = 0; i < source.TargetLanguages.length; i++) {
                this.TargetLanguages[i] = new String(source.TargetLanguages[i]);
            }
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.TTSConfig != null) {
            this.TTSConfig = new TTSConfig(source.TTSConfig);
        }
        if (source.Terminology != null) {
            this.Terminology = new Terminology[source.Terminology.length];
            for (int i = 0; i < source.Terminology.length; i++) {
                this.Terminology[i] = new Terminology(source.Terminology[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TargetLanguages.", this.TargetLanguages);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "TTSConfig.", this.TTSConfig);
        this.setParamArrayObj(map, prefix + "Terminology.", this.Terminology);

    }
}

