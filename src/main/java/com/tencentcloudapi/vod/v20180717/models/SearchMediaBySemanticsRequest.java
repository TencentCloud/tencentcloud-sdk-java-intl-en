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
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. for customers who activate on-demand services after december 25, 2023, this field must be filled with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Specifies the search content.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Specifies the number of returned records. the default value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * File type. matches any element in the collection: <li>Video: Video file</li> <li>Audio: Audio file</li> <li>Image: Image file</li>.
    */
    @SerializedName("Categories")
    @Expose
    private String [] Categories;

    /**
    * Tag set, match any element in the collection. <li>single Tag length limit: 32 characters.</li> <li>array length limit: 16.</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Specifies the task type for the search. valid values:. 
- AiAnalysis.DescriptionTask 
- SmartSubtitle.AsrFullTextTask
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. for customers who activate on-demand services after december 25, 2023, this field must be filled with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. for customers who activate on-demand services after december 25, 2023, this field must be filled with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. for customers who activate on-demand services after december 25, 2023, this field must be filled with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. for customers who activate on-demand services after december 25, 2023, this field must be filled with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Specifies the search content. 
     * @return Text Specifies the search content.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Specifies the search content.
     * @param Text Specifies the search content.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Specifies the number of returned records. the default value is 20. 
     * @return Limit Specifies the number of returned records. the default value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Specifies the number of returned records. the default value is 20.
     * @param Limit Specifies the number of returned records. the default value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get File type. matches any element in the collection: <li>Video: Video file</li> <li>Audio: Audio file</li> <li>Image: Image file</li>. 
     * @return Categories File type. matches any element in the collection: <li>Video: Video file</li> <li>Audio: Audio file</li> <li>Image: Image file</li>.
     */
    public String [] getCategories() {
        return this.Categories;
    }

    /**
     * Set File type. matches any element in the collection: <li>Video: Video file</li> <li>Audio: Audio file</li> <li>Image: Image file</li>.
     * @param Categories File type. matches any element in the collection: <li>Video: Video file</li> <li>Audio: Audio file</li> <li>Image: Image file</li>.
     */
    public void setCategories(String [] Categories) {
        this.Categories = Categories;
    }

    /**
     * Get Tag set, match any element in the collection. <li>single Tag length limit: 32 characters.</li> <li>array length limit: 16.</li> 
     * @return Tags Tag set, match any element in the collection. <li>single Tag length limit: 32 characters.</li> <li>array length limit: 16.</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag set, match any element in the collection. <li>single Tag length limit: 32 characters.</li> <li>array length limit: 16.</li>
     * @param Tags Tag set, match any element in the collection. <li>single Tag length limit: 32 characters.</li> <li>array length limit: 16.</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Specifies the task type for the search. valid values:. 
- AiAnalysis.DescriptionTask 
- SmartSubtitle.AsrFullTextTask 
     * @return TaskTypes Specifies the task type for the search. valid values:. 
- AiAnalysis.DescriptionTask 
- SmartSubtitle.AsrFullTextTask
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set Specifies the task type for the search. valid values:. 
- AiAnalysis.DescriptionTask 
- SmartSubtitle.AsrFullTextTask
     * @param TaskTypes Specifies the task type for the search. valid values:. 
- AiAnalysis.DescriptionTask 
- SmartSubtitle.AsrFullTextTask
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
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);

    }
}

