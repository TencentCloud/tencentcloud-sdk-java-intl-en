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

public class PronunciationDict extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * 
    */
    @SerializedName("Pronunciation")
    @Expose
    private String Pronunciation;

    /**
     * Get  
     * @return Word 
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 
     * @param Word 
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get  
     * @return Pronunciation 
     */
    public String getPronunciation() {
        return this.Pronunciation;
    }

    /**
     * Set 
     * @param Pronunciation 
     */
    public void setPronunciation(String Pronunciation) {
        this.Pronunciation = Pronunciation;
    }

    public PronunciationDict() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PronunciationDict(PronunciationDict source) {
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
        if (source.Pronunciation != null) {
            this.Pronunciation = new String(source.Pronunciation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "Pronunciation", this.Pronunciation);

    }
}

