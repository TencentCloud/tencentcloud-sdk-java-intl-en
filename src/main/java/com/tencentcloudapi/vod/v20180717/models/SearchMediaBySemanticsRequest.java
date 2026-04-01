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
    * <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, they must fill this field with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Search content</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Number of returned records. The default value is 20.</p><p>Value ranges from 1 to 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>File type. Match any element in the collection: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li></p>
    */
    @SerializedName("Categories")
    @Expose
    private String [] Categories;

    /**
    * <p>Tag set, match any element in the collection.</p><p>Input parameter limit: single tag length limited to 32 characters. Array length limit: 16.</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>Figure collection, matching video clips where all imported figures appear.</p><p>Input limit: Array length limit: 16.</p>
    */
    @SerializedName("Persons")
    @Expose
    private String [] Persons;

    /**
    * <p>Task type to search. Optional values: </p><ul><li>AiAnalysis.DescriptionTask </li><li>SmartSubtitle.AsrFullTextTask</li></ul>
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, they must fill this field with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, they must fill this field with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, they must fill this field with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, they must fill this field with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Search content</p> 
     * @return Text <p>Search content</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Search content</p>
     * @param Text <p>Search content</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>Number of returned records. The default value is 20.</p><p>Value ranges from 1 to 100.</p> 
     * @return Limit <p>Number of returned records. The default value is 20.</p><p>Value ranges from 1 to 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned records. The default value is 20.</p><p>Value ranges from 1 to 100.</p>
     * @param Limit <p>Number of returned records. The default value is 20.</p><p>Value ranges from 1 to 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>File type. Match any element in the collection: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li></p> 
     * @return Categories <p>File type. Match any element in the collection: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li></p>
     */
    public String [] getCategories() {
        return this.Categories;
    }

    /**
     * Set <p>File type. Match any element in the collection: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li></p>
     * @param Categories <p>File type. Match any element in the collection: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li></p>
     */
    public void setCategories(String [] Categories) {
        this.Categories = Categories;
    }

    /**
     * Get <p>Tag set, match any element in the collection.</p><p>Input parameter limit: single tag length limited to 32 characters. Array length limit: 16.</p> 
     * @return Tags <p>Tag set, match any element in the collection.</p><p>Input parameter limit: single tag length limited to 32 characters. Array length limit: 16.</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag set, match any element in the collection.</p><p>Input parameter limit: single tag length limited to 32 characters. Array length limit: 16.</p>
     * @param Tags <p>Tag set, match any element in the collection.</p><p>Input parameter limit: single tag length limited to 32 characters. Array length limit: 16.</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Figure collection, matching video clips where all imported figures appear.</p><p>Input limit: Array length limit: 16.</p> 
     * @return Persons <p>Figure collection, matching video clips where all imported figures appear.</p><p>Input limit: Array length limit: 16.</p>
     */
    public String [] getPersons() {
        return this.Persons;
    }

    /**
     * Set <p>Figure collection, matching video clips where all imported figures appear.</p><p>Input limit: Array length limit: 16.</p>
     * @param Persons <p>Figure collection, matching video clips where all imported figures appear.</p><p>Input limit: Array length limit: 16.</p>
     */
    public void setPersons(String [] Persons) {
        this.Persons = Persons;
    }

    /**
     * Get <p>Task type to search. Optional values: </p><ul><li>AiAnalysis.DescriptionTask </li><li>SmartSubtitle.AsrFullTextTask</li></ul> 
     * @return TaskTypes <p>Task type to search. Optional values: </p><ul><li>AiAnalysis.DescriptionTask </li><li>SmartSubtitle.AsrFullTextTask</li></ul>
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set <p>Task type to search. Optional values: </p><ul><li>AiAnalysis.DescriptionTask </li><li>SmartSubtitle.AsrFullTextTask</li></ul>
     * @param TaskTypes <p>Task type to search. Optional values: </p><ul><li>AiAnalysis.DescriptionTask </li><li>SmartSubtitle.AsrFullTextTask</li></ul>
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Categories.", this.Categories);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Persons.", this.Persons);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);

    }
}

