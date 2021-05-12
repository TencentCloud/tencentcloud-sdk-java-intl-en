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

public class AiRecognitionTaskHeadTailResultOutput extends AbstractModel{

    /**
    * Confidence of recognized opening credits. Value range: 0-100.
    */
    @SerializedName("HeadConfidence")
    @Expose
    private Float HeadConfidence;

    /**
    * End time point of video opening credits in seconds.
    */
    @SerializedName("HeadTimeOffset")
    @Expose
    private Float HeadTimeOffset;

    /**
    * Confidence of recognized closing credits. Value range: 0-100.
    */
    @SerializedName("TailConfidence")
    @Expose
    private Float TailConfidence;

    /**
    * Start time point of video closing credits in seconds.
    */
    @SerializedName("TailTimeOffset")
    @Expose
    private Float TailTimeOffset;

    /**
     * Get Confidence of recognized opening credits. Value range: 0-100. 
     * @return HeadConfidence Confidence of recognized opening credits. Value range: 0-100.
     */
    public Float getHeadConfidence() {
        return this.HeadConfidence;
    }

    /**
     * Set Confidence of recognized opening credits. Value range: 0-100.
     * @param HeadConfidence Confidence of recognized opening credits. Value range: 0-100.
     */
    public void setHeadConfidence(Float HeadConfidence) {
        this.HeadConfidence = HeadConfidence;
    }

    /**
     * Get End time point of video opening credits in seconds. 
     * @return HeadTimeOffset End time point of video opening credits in seconds.
     */
    public Float getHeadTimeOffset() {
        return this.HeadTimeOffset;
    }

    /**
     * Set End time point of video opening credits in seconds.
     * @param HeadTimeOffset End time point of video opening credits in seconds.
     */
    public void setHeadTimeOffset(Float HeadTimeOffset) {
        this.HeadTimeOffset = HeadTimeOffset;
    }

    /**
     * Get Confidence of recognized closing credits. Value range: 0-100. 
     * @return TailConfidence Confidence of recognized closing credits. Value range: 0-100.
     */
    public Float getTailConfidence() {
        return this.TailConfidence;
    }

    /**
     * Set Confidence of recognized closing credits. Value range: 0-100.
     * @param TailConfidence Confidence of recognized closing credits. Value range: 0-100.
     */
    public void setTailConfidence(Float TailConfidence) {
        this.TailConfidence = TailConfidence;
    }

    /**
     * Get Start time point of video closing credits in seconds. 
     * @return TailTimeOffset Start time point of video closing credits in seconds.
     */
    public Float getTailTimeOffset() {
        return this.TailTimeOffset;
    }

    /**
     * Set Start time point of video closing credits in seconds.
     * @param TailTimeOffset Start time point of video closing credits in seconds.
     */
    public void setTailTimeOffset(Float TailTimeOffset) {
        this.TailTimeOffset = TailTimeOffset;
    }

    public AiRecognitionTaskHeadTailResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskHeadTailResultOutput(AiRecognitionTaskHeadTailResultOutput source) {
        if (source.HeadConfidence != null) {
            this.HeadConfidence = new Float(source.HeadConfidence);
        }
        if (source.HeadTimeOffset != null) {
            this.HeadTimeOffset = new Float(source.HeadTimeOffset);
        }
        if (source.TailConfidence != null) {
            this.TailConfidence = new Float(source.TailConfidence);
        }
        if (source.TailTimeOffset != null) {
            this.TailTimeOffset = new Float(source.TailTimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeadConfidence", this.HeadConfidence);
        this.setParamSimple(map, prefix + "HeadTimeOffset", this.HeadTimeOffset);
        this.setParamSimple(map, prefix + "TailConfidence", this.TailConfidence);
        this.setParamSimple(map, prefix + "TailTimeOffset", this.TailTimeOffset);

    }
}

