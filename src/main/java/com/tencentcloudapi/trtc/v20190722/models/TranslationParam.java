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

public class TranslationParam extends AbstractModel {

    /**
    * <p>Target language for translation, example value ["en", "ja"]. Target language list [Chinese "zh", English "en", Vietnamese "vi", Japanese "ja", Korean "ko", Indonesian "id", Thai "th", Portuguese "pt", Arabic "ar", Spanish "es", French "fr", Malay "ms", German "de", Italian "it", Russian "ru"].</p>
    */
    @SerializedName("TargetLang")
    @Expose
    private String [] TargetLang;

    /**
    * <p>Glossary configuration.</p>
    */
    @SerializedName("Terminologies")
    @Expose
    private TerminologyItem [] Terminologies;

    /**
     * Get <p>Target language for translation, example value ["en", "ja"]. Target language list [Chinese "zh", English "en", Vietnamese "vi", Japanese "ja", Korean "ko", Indonesian "id", Thai "th", Portuguese "pt", Arabic "ar", Spanish "es", French "fr", Malay "ms", German "de", Italian "it", Russian "ru"].</p> 
     * @return TargetLang <p>Target language for translation, example value ["en", "ja"]. Target language list [Chinese "zh", English "en", Vietnamese "vi", Japanese "ja", Korean "ko", Indonesian "id", Thai "th", Portuguese "pt", Arabic "ar", Spanish "es", French "fr", Malay "ms", German "de", Italian "it", Russian "ru"].</p>
     */
    public String [] getTargetLang() {
        return this.TargetLang;
    }

    /**
     * Set <p>Target language for translation, example value ["en", "ja"]. Target language list [Chinese "zh", English "en", Vietnamese "vi", Japanese "ja", Korean "ko", Indonesian "id", Thai "th", Portuguese "pt", Arabic "ar", Spanish "es", French "fr", Malay "ms", German "de", Italian "it", Russian "ru"].</p>
     * @param TargetLang <p>Target language for translation, example value ["en", "ja"]. Target language list [Chinese "zh", English "en", Vietnamese "vi", Japanese "ja", Korean "ko", Indonesian "id", Thai "th", Portuguese "pt", Arabic "ar", Spanish "es", French "fr", Malay "ms", German "de", Italian "it", Russian "ru"].</p>
     */
    public void setTargetLang(String [] TargetLang) {
        this.TargetLang = TargetLang;
    }

    /**
     * Get <p>Glossary configuration.</p> 
     * @return Terminologies <p>Glossary configuration.</p>
     */
    public TerminologyItem [] getTerminologies() {
        return this.Terminologies;
    }

    /**
     * Set <p>Glossary configuration.</p>
     * @param Terminologies <p>Glossary configuration.</p>
     */
    public void setTerminologies(TerminologyItem [] Terminologies) {
        this.Terminologies = Terminologies;
    }

    public TranslationParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranslationParam(TranslationParam source) {
        if (source.TargetLang != null) {
            this.TargetLang = new String[source.TargetLang.length];
            for (int i = 0; i < source.TargetLang.length; i++) {
                this.TargetLang[i] = new String(source.TargetLang[i]);
            }
        }
        if (source.Terminologies != null) {
            this.Terminologies = new TerminologyItem[source.Terminologies.length];
            for (int i = 0; i < source.Terminologies.length; i++) {
                this.Terminologies[i] = new TerminologyItem(source.Terminologies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TargetLang.", this.TargetLang);
        this.setParamArrayObj(map, prefix + "Terminologies.", this.Terminologies);

    }
}

