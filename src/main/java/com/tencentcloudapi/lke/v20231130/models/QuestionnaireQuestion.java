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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuestionnaireQuestion extends AbstractModel {

    /**
    * <p>Serial number of the issue</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * <p>Content of the issue</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>Problem type</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Required or optional</p>
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * <p>Options for the question</p>
    */
    @SerializedName("Options")
    @Expose
    private QuestionOption [] Options;

    /**
     * Get <p>Serial number of the issue</p> 
     * @return Index <p>Serial number of the issue</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>Serial number of the issue</p>
     * @param Index <p>Serial number of the issue</p>
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get <p>Content of the issue</p> 
     * @return Question <p>Content of the issue</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>Content of the issue</p>
     * @param Question <p>Content of the issue</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get <p>Problem type</p> 
     * @return Type <p>Problem type</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Problem type</p>
     * @param Type <p>Problem type</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Required or optional</p> 
     * @return Required <p>Required or optional</p>
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set <p>Required or optional</p>
     * @param Required <p>Required or optional</p>
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get <p>Options for the question</p> 
     * @return Options <p>Options for the question</p>
     */
    public QuestionOption [] getOptions() {
        return this.Options;
    }

    /**
     * Set <p>Options for the question</p>
     * @param Options <p>Options for the question</p>
     */
    public void setOptions(QuestionOption [] Options) {
        this.Options = Options;
    }

    public QuestionnaireQuestion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuestionnaireQuestion(QuestionnaireQuestion source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
        if (source.Options != null) {
            this.Options = new QuestionOption[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new QuestionOption(source.Options[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamArrayObj(map, prefix + "Options.", this.Options);

    }
}

