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

public class WordResult extends AbstractModel {

    /**
    * Word text.
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * Word start timestamp, in seconds.
    */
    @SerializedName("Start")
    @Expose
    private Float Start;

    /**
    * Word end timestamp, in seconds.
    */
    @SerializedName("End")
    @Expose
    private Float End;

    /**
    * Text after translation.
    */
    @SerializedName("Trans")
    @Expose
    private String Trans;

    /**
     * Get Word text. 
     * @return Word Word text.
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set Word text.
     * @param Word Word text.
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get Word start timestamp, in seconds. 
     * @return Start Word start timestamp, in seconds.
     */
    public Float getStart() {
        return this.Start;
    }

    /**
     * Set Word start timestamp, in seconds.
     * @param Start Word start timestamp, in seconds.
     */
    public void setStart(Float Start) {
        this.Start = Start;
    }

    /**
     * Get Word end timestamp, in seconds. 
     * @return End Word end timestamp, in seconds.
     */
    public Float getEnd() {
        return this.End;
    }

    /**
     * Set Word end timestamp, in seconds.
     * @param End Word end timestamp, in seconds.
     */
    public void setEnd(Float End) {
        this.End = End;
    }

    /**
     * Get Text after translation. 
     * @return Trans Text after translation.
     */
    public String getTrans() {
        return this.Trans;
    }

    /**
     * Set Text after translation.
     * @param Trans Text after translation.
     */
    public void setTrans(String Trans) {
        this.Trans = Trans;
    }

    public WordResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WordResult(WordResult source) {
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
        if (source.Start != null) {
            this.Start = new Float(source.Start);
        }
        if (source.End != null) {
            this.End = new Float(source.End);
        }
        if (source.Trans != null) {
            this.Trans = new String(source.Trans);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "Trans", this.Trans);

    }
}

