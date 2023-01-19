/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReviewTemplateRequest extends AbstractModel{

    /**
    * The violation labels to use. Valid values: <li>`Porn`: Pornographic content</li> <li>`Terror`: Terrorist content</li> <li>Polity: Politically sensitive content</li> <li>`Moan`: Moaning</li>
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get The violation labels to use. Valid values: <li>`Porn`: Pornographic content</li> <li>`Terror`: Terrorist content</li> <li>Polity: Politically sensitive content</li> <li>`Moan`: Moaning</li> 
     * @return Labels The violation labels to use. Valid values: <li>`Porn`: Pornographic content</li> <li>`Terror`: Terrorist content</li> <li>Polity: Politically sensitive content</li> <li>`Moan`: Moaning</li>
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set The violation labels to use. Valid values: <li>`Porn`: Pornographic content</li> <li>`Terror`: Terrorist content</li> <li>Polity: Politically sensitive content</li> <li>`Moan`: Moaning</li>
     * @param Labels The violation labels to use. Valid values: <li>`Porn`: Pornographic content</li> <li>`Terror`: Terrorist content</li> <li>Polity: Politically sensitive content</li> <li>`Moan`: Moaning</li>
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Comment 
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 
     * @param Comment 
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public CreateReviewTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReviewTemplateRequest(CreateReviewTemplateRequest source) {
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

