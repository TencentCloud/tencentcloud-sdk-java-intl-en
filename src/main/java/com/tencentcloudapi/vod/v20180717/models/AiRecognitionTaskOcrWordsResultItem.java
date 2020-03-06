/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskOcrWordsResultItem extends AbstractModel{

    /**
    * Text keyword.
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * List of segments that contain a text keyword.
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskOcrWordsSegmentItem [] SegmentSet;

    /**
     * Get Text keyword. 
     * @return Word Text keyword.
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set Text keyword.
     * @param Word Text keyword.
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get List of segments that contain a text keyword. 
     * @return SegmentSet List of segments that contain a text keyword.
     */
    public AiRecognitionTaskOcrWordsSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of segments that contain a text keyword.
     * @param SegmentSet List of segments that contain a text keyword.
     */
    public void setSegmentSet(AiRecognitionTaskOcrWordsSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

