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

public class SimilarQuestionModifySpec extends AbstractModel {

    /**
    * <p>Content of the similar question (required for CREATE and UPDATE)</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>Operation type: 1=create, 2=modify, 3=delete<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODIFY_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>MODIFY_ACTION_CREATE</td><td>1</td><td>Create</td></tr><tr><td>MODIFY_ACTION_UPDATE</td><td>2</td><td>Modify</td></tr><tr><td>MODIFY_ACTION_DELETE</td><td>3</td><td>Delete</td></tr></tbody></table></p>
    */
    @SerializedName("ModifyAction")
    @Expose
    private Long ModifyAction;

    /**
    * <p>Similar question ID (required for UPDATE and DELETE)</p>
    */
    @SerializedName("SimilarQuestionId")
    @Expose
    private String SimilarQuestionId;

    /**
     * Get <p>Content of the similar question (required for CREATE and UPDATE)</p> 
     * @return Content <p>Content of the similar question (required for CREATE and UPDATE)</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Content of the similar question (required for CREATE and UPDATE)</p>
     * @param Content <p>Content of the similar question (required for CREATE and UPDATE)</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Operation type: 1=create, 2=modify, 3=delete<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODIFY_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>MODIFY_ACTION_CREATE</td><td>1</td><td>Create</td></tr><tr><td>MODIFY_ACTION_UPDATE</td><td>2</td><td>Modify</td></tr><tr><td>MODIFY_ACTION_DELETE</td><td>3</td><td>Delete</td></tr></tbody></table></p> 
     * @return ModifyAction <p>Operation type: 1=create, 2=modify, 3=delete<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODIFY_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>MODIFY_ACTION_CREATE</td><td>1</td><td>Create</td></tr><tr><td>MODIFY_ACTION_UPDATE</td><td>2</td><td>Modify</td></tr><tr><td>MODIFY_ACTION_DELETE</td><td>3</td><td>Delete</td></tr></tbody></table></p>
     */
    public Long getModifyAction() {
        return this.ModifyAction;
    }

    /**
     * Set <p>Operation type: 1=create, 2=modify, 3=delete<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODIFY_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>MODIFY_ACTION_CREATE</td><td>1</td><td>Create</td></tr><tr><td>MODIFY_ACTION_UPDATE</td><td>2</td><td>Modify</td></tr><tr><td>MODIFY_ACTION_DELETE</td><td>3</td><td>Delete</td></tr></tbody></table></p>
     * @param ModifyAction <p>Operation type: 1=create, 2=modify, 3=delete<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODIFY_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>MODIFY_ACTION_CREATE</td><td>1</td><td>Create</td></tr><tr><td>MODIFY_ACTION_UPDATE</td><td>2</td><td>Modify</td></tr><tr><td>MODIFY_ACTION_DELETE</td><td>3</td><td>Delete</td></tr></tbody></table></p>
     */
    public void setModifyAction(Long ModifyAction) {
        this.ModifyAction = ModifyAction;
    }

    /**
     * Get <p>Similar question ID (required for UPDATE and DELETE)</p> 
     * @return SimilarQuestionId <p>Similar question ID (required for UPDATE and DELETE)</p>
     */
    public String getSimilarQuestionId() {
        return this.SimilarQuestionId;
    }

    /**
     * Set <p>Similar question ID (required for UPDATE and DELETE)</p>
     * @param SimilarQuestionId <p>Similar question ID (required for UPDATE and DELETE)</p>
     */
    public void setSimilarQuestionId(String SimilarQuestionId) {
        this.SimilarQuestionId = SimilarQuestionId;
    }

    public SimilarQuestionModifySpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimilarQuestionModifySpec(SimilarQuestionModifySpec source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ModifyAction != null) {
            this.ModifyAction = new Long(source.ModifyAction);
        }
        if (source.SimilarQuestionId != null) {
            this.SimilarQuestionId = new String(source.SimilarQuestionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ModifyAction", this.ModifyAction);
        this.setParamSimple(map, prefix + "SimilarQuestionId", this.SimilarQuestionId);

    }
}

