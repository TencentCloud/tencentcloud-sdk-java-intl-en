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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIRecommendAction extends AbstractModel {

    /**
    * <p>Recommended operation type</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>Recommended operations</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
     * Get <p>Recommended operation type</p> 
     * @return Action <p>Recommended operation type</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>Recommended operation type</p>
     * @param Action <p>Recommended operation type</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Recommended operations</p> 
     * @return Question <p>Recommended operations</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>Recommended operations</p>
     * @param Question <p>Recommended operations</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public AIRecommendAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIRecommendAction(AIRecommendAction source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Question", this.Question);

    }
}

