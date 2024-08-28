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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BroadcastInfo extends AbstractModel {

    /**
    * Article name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Redirection location: 0: no redirection; 1: virus scanning; 2: vulnerability scan; 3: security baseline
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GotoType")
    @Expose
    private Long GotoType;

    /**
    * Subtitle
    */
    @SerializedName("Subtitle")
    @Expose
    private String Subtitle;

    /**
    * Release time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Rich text content information
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Article unique ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Type: 0: emergency notification; 1: feature update; 2: industry honor; 3: version release
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Article name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Title Article name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Article name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Title Article name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Redirection location: 0: no redirection; 1: virus scanning; 2: vulnerability scan; 3: security baseline
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GotoType Redirection location: 0: no redirection; 1: virus scanning; 2: vulnerability scan; 3: security baseline
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGotoType() {
        return this.GotoType;
    }

    /**
     * Set Redirection location: 0: no redirection; 1: virus scanning; 2: vulnerability scan; 3: security baseline
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GotoType Redirection location: 0: no redirection; 1: virus scanning; 2: vulnerability scan; 3: security baseline
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGotoType(Long GotoType) {
        this.GotoType = GotoType;
    }

    /**
     * Get Subtitle 
     * @return Subtitle Subtitle
     */
    public String getSubtitle() {
        return this.Subtitle;
    }

    /**
     * Set Subtitle
     * @param Subtitle Subtitle
     */
    public void setSubtitle(String Subtitle) {
        this.Subtitle = Subtitle;
    }

    /**
     * Get Release time 
     * @return CreateTime Release time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Release time
     * @param CreateTime Release time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Rich text content information 
     * @return Content Rich text content information
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Rich text content information
     * @param Content Rich text content information
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Article unique ID 
     * @return Id Article unique ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Article unique ID
     * @param Id Article unique ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Type: 0: emergency notification; 1: feature update; 2: industry honor; 3: version release 
     * @return Type Type: 0: emergency notification; 1: feature update; 2: industry honor; 3: version release
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Type: 0: emergency notification; 1: feature update; 2: industry honor; 3: version release
     * @param Type Type: 0: emergency notification; 1: feature update; 2: industry honor; 3: version release
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public BroadcastInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BroadcastInfo(BroadcastInfo source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.GotoType != null) {
            this.GotoType = new Long(source.GotoType);
        }
        if (source.Subtitle != null) {
            this.Subtitle = new String(source.Subtitle);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "GotoType", this.GotoType);
        this.setParamSimple(map, prefix + "Subtitle", this.Subtitle);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

