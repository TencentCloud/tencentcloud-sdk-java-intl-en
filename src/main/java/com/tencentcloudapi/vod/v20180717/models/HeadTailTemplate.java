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
    * Head Tail Template Number.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Template name, supports up to 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description, up to 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Title candidate list. When using it, the one closest to the resolution of the feature film will be selected. When the same candidate exists, the first one will be selected. A maximum of 5 are supported.
    */
    @SerializedName("HeadCandidateSet")
    @Expose
    private String [] HeadCandidateSet;

    /**
    * Ending candidate list. When using it, the one closest to the resolution of the feature film will be selected. When the same candidate exists, the first one will be selected. A maximum of 5 are supported.
    */
    @SerializedName("TailCandidateSet")
    @Expose
    private String [] TailCandidateSet;

    /**
    * Padding method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the transcoding processing method is "padding". Optional filling method:
<li> stretch: stretch, stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li> 
<li> gauss: Gaussian blur, keep the video aspect ratio unchanged, use Gaussian blur for the remaining edges; </li>
<li> white: leave blank, keep the video aspect ratio unchanged, use the remaining edges for the edge Use white filling; </li>
<li> black: Leave black, keep the video aspect ratio unchanged, and fill the remaining edges with black. </li>
Default value: stretch.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * Template creation time, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The last modification time of the template, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Head Tail Template Number. 
     * @return Definition Head Tail Template Number.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Head Tail Template Number.
     * @param Definition Head Tail Template Number.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Template name, supports up to 64 characters. 
     * @return Name Template name, supports up to 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name, supports up to 64 characters.
     * @param Name Template name, supports up to 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description, up to 256 characters. 
     * @return Comment Template description, up to 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description, up to 256 characters.
     * @param Comment Template description, up to 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Title candidate list. When using it, the one closest to the resolution of the feature film will be selected. When the same candidate exists, the first one will be selected. A maximum of 5 are supported. 
     * @return HeadCandidateSet Title candidate list. When using it, the one closest to the resolution of the feature film will be selected. When the same candidate exists, the first one will be selected. A maximum of 5 are supported.
     */
    public String [] getHeadCandidateSet() {
        return this.HeadCandidateSet;
    }

    /**
     * Set Title candidate list. When using it, the one closest to the resolution of the feature film will be selected. When the same candidate exists, the first one will be selected. A maximum of 5 are supported.
     * @param HeadCandidateSet Title candidate list. When using it, the one closest to the resolution of the feature film will be selected. When the same candidate exists, the first one will be selected. A maximum of 5 are supported.
     */
    public void setHeadCandidateSet(String [] HeadCandidateSet) {
        this.HeadCandidateSet = HeadCandidateSet;
    }

    /**
     * Get Ending candidate list. When using it, the one closest to the resolution of the feature film will be selected. When the same candidate exists, the first one will be selected. A maximum of 5 are supported. 
     * @return TailCandidateSet Ending candidate list. When using it, the one closest to the resolution of the feature film will be selected. When the same candidate exists, the first one will be selected. A maximum of 5 are supported.
     */
    public String [] getTailCandidateSet() {
        return this.TailCandidateSet;
    }

    /**
     * Set Ending candidate list. When using it, the one closest to the resolution of the feature film will be selected. When the same candidate exists, the first one will be selected. A maximum of 5 are supported.
     * @param TailCandidateSet Ending candidate list. When using it, the one closest to the resolution of the feature film will be selected. When the same candidate exists, the first one will be selected. A maximum of 5 are supported.
     */
    public void setTailCandidateSet(String [] TailCandidateSet) {
        this.TailCandidateSet = TailCandidateSet;
    }

    /**
     * Get Padding method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the transcoding processing method is "padding". Optional filling method:
<li> stretch: stretch, stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li> 
<li> gauss: Gaussian blur, keep the video aspect ratio unchanged, use Gaussian blur for the remaining edges; </li>
<li> white: leave blank, keep the video aspect ratio unchanged, use the remaining edges for the edge Use white filling; </li>
<li> black: Leave black, keep the video aspect ratio unchanged, and fill the remaining edges with black. </li>
Default value: stretch. 
     * @return FillType Padding method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the transcoding processing method is "padding". Optional filling method:
<li> stretch: stretch, stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li> 
<li> gauss: Gaussian blur, keep the video aspect ratio unchanged, use Gaussian blur for the remaining edges; </li>
<li> white: leave blank, keep the video aspect ratio unchanged, use the remaining edges for the edge Use white filling; </li>
<li> black: Leave black, keep the video aspect ratio unchanged, and fill the remaining edges with black. </li>
Default value: stretch.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Padding method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the transcoding processing method is "padding". Optional filling method:
<li> stretch: stretch, stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li> 
<li> gauss: Gaussian blur, keep the video aspect ratio unchanged, use Gaussian blur for the remaining edges; </li>
<li> white: leave blank, keep the video aspect ratio unchanged, use the remaining edges for the edge Use white filling; </li>
<li> black: Leave black, keep the video aspect ratio unchanged, and fill the remaining edges with black. </li>
Default value: stretch.
     * @param FillType Padding method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the transcoding processing method is "padding". Optional filling method:
<li> stretch: stretch, stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li> 
<li> gauss: Gaussian blur, keep the video aspect ratio unchanged, use Gaussian blur for the remaining edges; </li>
<li> white: leave blank, keep the video aspect ratio unchanged, use the remaining edges for the edge Use white filling; </li>
<li> black: Leave black, keep the video aspect ratio unchanged, and fill the remaining edges with black. </li>
Default value: stretch.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get Template creation time, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format). 
     * @return CreateTime Template creation time, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Template creation time, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     * @param CreateTime Template creation time, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The last modification time of the template, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format). 
     * @return UpdateTime The last modification time of the template, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The last modification time of the template, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     * @param UpdateTime The last modification time of the template, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
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

