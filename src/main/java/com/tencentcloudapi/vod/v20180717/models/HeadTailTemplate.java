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

public class HeadTailTemplate extends AbstractModel {

    /**
    * Opening and ending template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Template name. Supports up to 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description. Supports up to 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Opening candidate list. When used, the one closest to the main content resolution is selected. If identical candidates exist, the first one is used. Supports up to 5 candidates.
    */
    @SerializedName("HeadCandidateSet")
    @Expose
    private String [] HeadCandidateSet;

    /**
    * Ending candidate list. When used, the one closest to the main content resolution is selected. If identical candidates exist, the first one is used. Supports up to 5 candidates.
    */
    @SerializedName("TailCandidateSet")
    @Expose
    private String [] TailCandidateSet;

    /**
    * Filling method. When the aspect ratio of the video stream configuration width and height parameters is inconsistent with that of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio and fill the remaining edges with black.</li>
Default value: stretch.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Template last modified time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Opening and ending template ID. 
     * @return Definition Opening and ending template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Opening and ending template ID.
     * @param Definition Opening and ending template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Template name. Supports up to 64 characters. 
     * @return Name Template name. Supports up to 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name. Supports up to 64 characters.
     * @param Name Template name. Supports up to 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description. Supports up to 256 characters. 
     * @return Comment Template description. Supports up to 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description. Supports up to 256 characters.
     * @param Comment Template description. Supports up to 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Opening candidate list. When used, the one closest to the main content resolution is selected. If identical candidates exist, the first one is used. Supports up to 5 candidates. 
     * @return HeadCandidateSet Opening candidate list. When used, the one closest to the main content resolution is selected. If identical candidates exist, the first one is used. Supports up to 5 candidates.
     */
    public String [] getHeadCandidateSet() {
        return this.HeadCandidateSet;
    }

    /**
     * Set Opening candidate list. When used, the one closest to the main content resolution is selected. If identical candidates exist, the first one is used. Supports up to 5 candidates.
     * @param HeadCandidateSet Opening candidate list. When used, the one closest to the main content resolution is selected. If identical candidates exist, the first one is used. Supports up to 5 candidates.
     */
    public void setHeadCandidateSet(String [] HeadCandidateSet) {
        this.HeadCandidateSet = HeadCandidateSet;
    }

    /**
     * Get Ending candidate list. When used, the one closest to the main content resolution is selected. If identical candidates exist, the first one is used. Supports up to 5 candidates. 
     * @return TailCandidateSet Ending candidate list. When used, the one closest to the main content resolution is selected. If identical candidates exist, the first one is used. Supports up to 5 candidates.
     */
    public String [] getTailCandidateSet() {
        return this.TailCandidateSet;
    }

    /**
     * Set Ending candidate list. When used, the one closest to the main content resolution is selected. If identical candidates exist, the first one is used. Supports up to 5 candidates.
     * @param TailCandidateSet Ending candidate list. When used, the one closest to the main content resolution is selected. If identical candidates exist, the first one is used. Supports up to 5 candidates.
     */
    public void setTailCandidateSet(String [] TailCandidateSet) {
        this.TailCandidateSet = TailCandidateSet;
    }

    /**
     * Get Filling method. When the aspect ratio of the video stream configuration width and height parameters is inconsistent with that of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio and fill the remaining edges with black.</li>
Default value: stretch. 
     * @return FillType Filling method. When the aspect ratio of the video stream configuration width and height parameters is inconsistent with that of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio and fill the remaining edges with black.</li>
Default value: stretch.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Filling method. When the aspect ratio of the video stream configuration width and height parameters is inconsistent with that of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio and fill the remaining edges with black.</li>
Default value: stretch.
     * @param FillType Filling method. When the aspect ratio of the video stream configuration width and height parameters is inconsistent with that of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: Stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio and fill the remaining edges with black.</li>
Default value: stretch.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Template last modified time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Template last modified time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Template last modified time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Template last modified time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public HeadTailTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HeadTailTemplate(HeadTailTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.HeadCandidateSet != null) {
            this.HeadCandidateSet = new String[source.HeadCandidateSet.length];
            for (int i = 0; i < source.HeadCandidateSet.length; i++) {
                this.HeadCandidateSet[i] = new String(source.HeadCandidateSet[i]);
            }
        }
        if (source.TailCandidateSet != null) {
            this.TailCandidateSet = new String[source.TailCandidateSet.length];
            for (int i = 0; i < source.TailCandidateSet.length; i++) {
                this.TailCandidateSet[i] = new String(source.TailCandidateSet[i]);
            }
        }
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArraySimple(map, prefix + "HeadCandidateSet.", this.HeadCandidateSet);
        this.setParamArraySimple(map, prefix + "TailCandidateSet.", this.TailCandidateSet);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

