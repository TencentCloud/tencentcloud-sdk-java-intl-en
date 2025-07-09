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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenBroadcasts extends AbstractModel {

    /**
    * Security report article title
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Severity level of security report article: 0: none; 1: critical; 2: high-risk; 3: medium-risk; 4: low-risk
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Release time
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Article ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Security report article title 
     * @return Title Security report article title
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Security report article title
     * @param Title Security report article title
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Severity level of security report article: 0: none; 1: critical; 2: high-risk; 3: medium-risk; 4: low-risk 
     * @return Level Severity level of security report article: 0: none; 1: critical; 2: high-risk; 3: medium-risk; 4: low-risk
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Severity level of security report article: 0: none; 1: critical; 2: high-risk; 3: medium-risk; 4: low-risk
     * @param Level Severity level of security report article: 0: none; 1: critical; 2: high-risk; 3: medium-risk; 4: low-risk
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Release time 
     * @return Time Release time
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Release time
     * @param Time Release time
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Article ID 
     * @return Id Article ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Article ID
     * @param Id Article ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public ScreenBroadcasts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenBroadcasts(ScreenBroadcasts source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

