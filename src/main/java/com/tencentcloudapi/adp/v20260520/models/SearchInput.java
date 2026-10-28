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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchInput extends AbstractModel {

    /**
    * <p>List of image URLs</p>
    */
    @SerializedName("ImageUrlList")
    @Expose
    private String [] ImageUrlList;

    /**
    * <p>Query</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>Deconstructed sub-problem list</p>
    */
    @SerializedName("SubQuestionList")
    @Expose
    private String [] SubQuestionList;

    /**
     * Get <p>List of image URLs</p> 
     * @return ImageUrlList <p>List of image URLs</p>
     */
    public String [] getImageUrlList() {
        return this.ImageUrlList;
    }

    /**
     * Set <p>List of image URLs</p>
     * @param ImageUrlList <p>List of image URLs</p>
     */
    public void setImageUrlList(String [] ImageUrlList) {
        this.ImageUrlList = ImageUrlList;
    }

    /**
     * Get <p>Query</p> 
     * @return Question <p>Query</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>Query</p>
     * @param Question <p>Query</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get <p>Deconstructed sub-problem list</p> 
     * @return SubQuestionList <p>Deconstructed sub-problem list</p>
     */
    public String [] getSubQuestionList() {
        return this.SubQuestionList;
    }

    /**
     * Set <p>Deconstructed sub-problem list</p>
     * @param SubQuestionList <p>Deconstructed sub-problem list</p>
     */
    public void setSubQuestionList(String [] SubQuestionList) {
        this.SubQuestionList = SubQuestionList;
    }

    public SearchInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchInput(SearchInput source) {
        if (source.ImageUrlList != null) {
            this.ImageUrlList = new String[source.ImageUrlList.length];
            for (int i = 0; i < source.ImageUrlList.length; i++) {
                this.ImageUrlList[i] = new String(source.ImageUrlList[i]);
            }
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.SubQuestionList != null) {
            this.SubQuestionList = new String[source.SubQuestionList.length];
            for (int i = 0; i < source.SubQuestionList.length; i++) {
                this.SubQuestionList[i] = new String(source.SubQuestionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageUrlList.", this.ImageUrlList);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamArraySimple(map, prefix + "SubQuestionList.", this.SubQuestionList);

    }
}

