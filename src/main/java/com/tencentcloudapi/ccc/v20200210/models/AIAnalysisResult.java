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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIAnalysisResult extends AbstractModel {

    /**
    * Summary: describes the session summary.
mood: specifies the emotion analysis.
intention extraction.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * AI session analysis result.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
     * Get Summary: describes the session summary.
mood: specifies the emotion analysis.
intention extraction. 
     * @return Type Summary: describes the session summary.
mood: specifies the emotion analysis.
intention extraction.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Summary: describes the session summary.
mood: specifies the emotion analysis.
intention extraction.
     * @param Type Summary: describes the session summary.
mood: specifies the emotion analysis.
intention extraction.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get AI session analysis result. 
     * @return Result AI session analysis result.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set AI session analysis result.
     * @param Result AI session analysis result.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    public AIAnalysisResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAnalysisResult(AIAnalysisResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

