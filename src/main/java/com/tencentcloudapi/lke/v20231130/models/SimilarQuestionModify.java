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

public class SimilarQuestionModify extends AbstractModel {

    /**
    * List of similar questions (content) to be added.
    */
    @SerializedName("AddQuestions")
    @Expose
    private String [] AddQuestions;

    /**
    * List of similar questions to be updated.
    */
    @SerializedName("UpdateQuestions")
    @Expose
    private SimilarQuestion [] UpdateQuestions;

    /**
    * List of similar questions to be deleted.
    */
    @SerializedName("DeleteQuestions")
    @Expose
    private SimilarQuestion [] DeleteQuestions;

    /**
     * Get List of similar questions (content) to be added. 
     * @return AddQuestions List of similar questions (content) to be added.
     */
    public String [] getAddQuestions() {
        return this.AddQuestions;
    }

    /**
     * Set List of similar questions (content) to be added.
     * @param AddQuestions List of similar questions (content) to be added.
     */
    public void setAddQuestions(String [] AddQuestions) {
        this.AddQuestions = AddQuestions;
    }

    /**
     * Get List of similar questions to be updated. 
     * @return UpdateQuestions List of similar questions to be updated.
     */
    public SimilarQuestion [] getUpdateQuestions() {
        return this.UpdateQuestions;
    }

    /**
     * Set List of similar questions to be updated.
     * @param UpdateQuestions List of similar questions to be updated.
     */
    public void setUpdateQuestions(SimilarQuestion [] UpdateQuestions) {
        this.UpdateQuestions = UpdateQuestions;
    }

    /**
     * Get List of similar questions to be deleted. 
     * @return DeleteQuestions List of similar questions to be deleted.
     */
    public SimilarQuestion [] getDeleteQuestions() {
        return this.DeleteQuestions;
    }

    /**
     * Set List of similar questions to be deleted.
     * @param DeleteQuestions List of similar questions to be deleted.
     */
    public void setDeleteQuestions(SimilarQuestion [] DeleteQuestions) {
        this.DeleteQuestions = DeleteQuestions;
    }

    public SimilarQuestionModify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimilarQuestionModify(SimilarQuestionModify source) {
        if (source.AddQuestions != null) {
            this.AddQuestions = new String[source.AddQuestions.length];
            for (int i = 0; i < source.AddQuestions.length; i++) {
                this.AddQuestions[i] = new String(source.AddQuestions[i]);
            }
        }
        if (source.UpdateQuestions != null) {
            this.UpdateQuestions = new SimilarQuestion[source.UpdateQuestions.length];
            for (int i = 0; i < source.UpdateQuestions.length; i++) {
                this.UpdateQuestions[i] = new SimilarQuestion(source.UpdateQuestions[i]);
            }
        }
        if (source.DeleteQuestions != null) {
            this.DeleteQuestions = new SimilarQuestion[source.DeleteQuestions.length];
            for (int i = 0; i < source.DeleteQuestions.length; i++) {
                this.DeleteQuestions[i] = new SimilarQuestion(source.DeleteQuestions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddQuestions.", this.AddQuestions);
        this.setParamArrayObj(map, prefix + "UpdateQuestions.", this.UpdateQuestions);
        this.setParamArrayObj(map, prefix + "DeleteQuestions.", this.DeleteQuestions);

    }
}

