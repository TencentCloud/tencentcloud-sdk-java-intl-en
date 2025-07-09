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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentenceWords extends AbstractModel {

    /**
    * Word text.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * Start time offset in the sentence.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OffsetStartMs")
    @Expose
    private Long OffsetStartMs;

    /**
    * End time offset in the sentence.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OffsetEndMs")
    @Expose
    private Long OffsetEndMs;

    /**
     * Get Word text.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Word Word text.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set Word text.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Word Word text.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get Start time offset in the sentence.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OffsetStartMs Start time offset in the sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOffsetStartMs() {
        return this.OffsetStartMs;
    }

    /**
     * Set Start time offset in the sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OffsetStartMs Start time offset in the sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOffsetStartMs(Long OffsetStartMs) {
        this.OffsetStartMs = OffsetStartMs;
    }

    /**
     * Get End time offset in the sentence.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OffsetEndMs End time offset in the sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOffsetEndMs() {
        return this.OffsetEndMs;
    }

    /**
     * Set End time offset in the sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OffsetEndMs End time offset in the sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOffsetEndMs(Long OffsetEndMs) {
        this.OffsetEndMs = OffsetEndMs;
    }

    public SentenceWords() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SentenceWords(SentenceWords source) {
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
        if (source.OffsetStartMs != null) {
            this.OffsetStartMs = new Long(source.OffsetStartMs);
        }
        if (source.OffsetEndMs != null) {
            this.OffsetEndMs = new Long(source.OffsetEndMs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "OffsetStartMs", this.OffsetStartMs);
        this.setParamSimple(map, prefix + "OffsetEndMs", this.OffsetEndMs);

    }
}

