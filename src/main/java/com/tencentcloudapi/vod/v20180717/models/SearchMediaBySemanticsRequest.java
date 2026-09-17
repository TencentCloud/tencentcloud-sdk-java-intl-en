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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchMediaBySemanticsRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * 
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 
    */
    @SerializedName("Categories")
    @Expose
    private String [] Categories;

    /**
    * 
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 
    */
    @SerializedName("Persons")
    @Expose
    private String [] Persons;

    /**
    * 
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return Text 
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 
     * @param Text 
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get  
     * @return KnowledgeBaseId 
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set 
     * @param KnowledgeBaseId 
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get  
     * @return Limit 
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 
     * @param Limit 
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get  
     * @return Categories 
     */
    public String [] getCategories() {
        return this.Categories;
    }

    /**
     * Set 
     * @param Categories 
     */
    public void setCategories(String [] Categories) {
        this.Categories = Categories;
    }

    /**
     * Get  
     * @return Tags 
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 
     * @param Tags 
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get  
     * @return Persons 
     */
    public String [] getPersons() {
        return this.Persons;
    }

    /**
     * Set 
     * @param Persons 
     */
    public void setPersons(String [] Persons) {
        this.Persons = Persons;
    }

    /**
     * Get  
     * @return TaskTypes 
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set 
     * @param TaskTypes 
     */
    public void setTaskTypes(String [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    public SearchMediaBySemanticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchMediaBySemanticsRequest(SearchMediaBySemanticsRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Categories != null) {
            this.Categories = new String[source.Categories.length];
            for (int i = 0; i < source.Categories.length; i++) {
                this.Categories[i] = new String(source.Categories[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Persons != null) {
            this.Persons = new String[source.Persons.length];
            for (int i = 0; i < source.Persons.length; i++) {
                this.Persons[i] = new String(source.Persons[i]);
            }
        }
        if (source.TaskTypes != null) {
            this.TaskTypes = new String[source.TaskTypes.length];
            for (int i = 0; i < source.TaskTypes.length; i++) {
                this.TaskTypes[i] = new String(source.TaskTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Categories.", this.Categories);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Persons.", this.Persons);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);

    }
}

