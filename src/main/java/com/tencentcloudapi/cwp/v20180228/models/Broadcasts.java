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

public class Broadcasts extends AbstractModel {

    /**
    * Article name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Type: 0: emergency notification; 1: feature update; 2: industry honor; 3: version release
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

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
    * Article unique ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Severity level. 0: none; 1: critical; 2: high-risk; 3: medium-risk; 4: low-risk
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

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
     * Get Type: 0: emergency notification; 1: feature update; 2: industry honor; 3: version release
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Type: 0: emergency notification; 1: feature update; 2: industry honor; 3: version release
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Type: 0: emergency notification; 1: feature update; 2: industry honor; 3: version release
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Type: 0: emergency notification; 1: feature update; 2: industry honor; 3: version release
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(Long Type) {
        this.Type = Type;
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
     * Get Severity level. 0: none; 1: critical; 2: high-risk; 3: medium-risk; 4: low-risk 
     * @return Level Severity level. 0: none; 1: critical; 2: high-risk; 3: medium-risk; 4: low-risk
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Severity level. 0: none; 1: critical; 2: high-risk; 3: medium-risk; 4: low-risk
     * @param Level Severity level. 0: none; 1: critical; 2: high-risk; 3: medium-risk; 4: low-risk
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    public Broadcasts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Broadcasts(Broadcasts source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Subtitle != null) {
            this.Subtitle = new String(source.Subtitle);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Subtitle", this.Subtitle);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

