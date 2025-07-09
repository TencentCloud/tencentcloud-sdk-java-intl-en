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

public class AiRecognitionTaskOcrWordsResultOutput extends AbstractModel {

    /**
    * Text keyword recognition result set.
    */
    @SerializedName("ResultSet")
    @Expose
    private AiRecognitionTaskOcrWordsResultItem [] ResultSet;

    /**
     * Get Text keyword recognition result set. 
     * @return ResultSet Text keyword recognition result set.
     */
    public AiRecognitionTaskOcrWordsResultItem [] getResultSet() {
        return this.ResultSet;
    }

    /**
     * Set Text keyword recognition result set.
     * @param ResultSet Text keyword recognition result set.
     */
    public void setResultSet(AiRecognitionTaskOcrWordsResultItem [] ResultSet) {
        this.ResultSet = ResultSet;
    }

    public AiRecognitionTaskOcrWordsResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskOcrWordsResultOutput(AiRecognitionTaskOcrWordsResultOutput source) {
        if (source.ResultSet != null) {
            this.ResultSet = new AiRecognitionTaskOcrWordsResultItem[source.ResultSet.length];
            for (int i = 0; i < source.ResultSet.length; i++) {
                this.ResultSet[i] = new AiRecognitionTaskOcrWordsResultItem(source.ResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ResultSet.", this.ResultSet);

    }
}

