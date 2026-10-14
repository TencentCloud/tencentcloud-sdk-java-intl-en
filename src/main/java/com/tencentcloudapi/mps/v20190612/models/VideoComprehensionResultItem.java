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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoComprehensionResultItem extends AbstractModel {

    /**
    * Start time of the storyboard segment, in seconds.

    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * Segment end time (unit: second)
    */
    @SerializedName("EndTime")
    @Expose
    private Float EndTime;

    /**
    * Segment title.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Description of the storyboard segment information
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Segment keywords.
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
     * Get Start time of the storyboard segment, in seconds.
 
     * @return StartTime Start time of the storyboard segment, in seconds.

     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the storyboard segment, in seconds.

     * @param StartTime Start time of the storyboard segment, in seconds.

     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Segment end time (unit: second) 
     * @return EndTime Segment end time (unit: second)
     */
    public Float getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Segment end time (unit: second)
     * @param EndTime Segment end time (unit: second)
     */
    public void setEndTime(Float EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Segment title. 
     * @return Title Segment title.
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Segment title.
     * @param Title Segment title.
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Description of the storyboard segment information 
     * @return Description Description of the storyboard segment information
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the storyboard segment information
     * @param Description Description of the storyboard segment information
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Segment keywords. 
     * @return Keywords Segment keywords.
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set Segment keywords.
     * @param Keywords Segment keywords.
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    public VideoComprehensionResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoComprehensionResultItem(VideoComprehensionResultItem source) {
        if (source.StartTime != null) {
            this.StartTime = new Float(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Float(source.EndTime);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);

    }
}

