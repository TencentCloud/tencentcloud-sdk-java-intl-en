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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHeadTailTemplateRequest extends AbstractModel {

    /**
    * HeadTail template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Template name, length limit is 64 characters. Not passing means not modifying.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description, limited to 256 characters. Passing nothing means no modification, passing empty means clearing it.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Title candidate list, fill in the FileId of the video. When transcoding, the title closest to the aspect ratio of the feature film will be automatically selected (when the aspect ratio is the same, the front candidate will take precedence). Supports up to 5 candidate titles. Not passing it means no modification, passing an empty array means clearing it.
    */
    @SerializedName("HeadCandidateSet")
    @Expose
    private String [] HeadCandidateSet;

    /**
    * Ending candidate list, fill in the FileId of the video. When transcoding, the ending with the aspect ratio closest to the feature film will be automatically selected (when the aspect ratio is the same, the front candidate will take precedence). Supports up to 5 candidate titles. Not passing it means no modification, passing an empty array means clearing it.
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
The default value is not to be modified.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
     * Get HeadTail template ID. 
     * @return Definition HeadTail template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set HeadTail template ID.
     * @param Definition HeadTail template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b> 
     * @return SubAppId </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b>
     * @param SubAppId </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Template name, length limit is 64 characters. Not passing means not modifying. 
     * @return Name Template name, length limit is 64 characters. Not passing means not modifying.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name, length limit is 64 characters. Not passing means not modifying.
     * @param Name Template name, length limit is 64 characters. Not passing means not modifying.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description, limited to 256 characters. Passing nothing means no modification, passing empty means clearing it. 
     * @return Comment Template description, limited to 256 characters. Passing nothing means no modification, passing empty means clearing it.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description, limited to 256 characters. Passing nothing means no modification, passing empty means clearing it.
     * @param Comment Template description, limited to 256 characters. Passing nothing means no modification, passing empty means clearing it.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Title candidate list, fill in the FileId of the video. When transcoding, the title closest to the aspect ratio of the feature film will be automatically selected (when the aspect ratio is the same, the front candidate will take precedence). Supports up to 5 candidate titles. Not passing it means no modification, passing an empty array means clearing it. 
     * @return HeadCandidateSet Title candidate list, fill in the FileId of the video. When transcoding, the title closest to the aspect ratio of the feature film will be automatically selected (when the aspect ratio is the same, the front candidate will take precedence). Supports up to 5 candidate titles. Not passing it means no modification, passing an empty array means clearing it.
     */
    public String [] getHeadCandidateSet() {
        return this.HeadCandidateSet;
    }

    /**
     * Set Title candidate list, fill in the FileId of the video. When transcoding, the title closest to the aspect ratio of the feature film will be automatically selected (when the aspect ratio is the same, the front candidate will take precedence). Supports up to 5 candidate titles. Not passing it means no modification, passing an empty array means clearing it.
     * @param HeadCandidateSet Title candidate list, fill in the FileId of the video. When transcoding, the title closest to the aspect ratio of the feature film will be automatically selected (when the aspect ratio is the same, the front candidate will take precedence). Supports up to 5 candidate titles. Not passing it means no modification, passing an empty array means clearing it.
     */
    public void setHeadCandidateSet(String [] HeadCandidateSet) {
        this.HeadCandidateSet = HeadCandidateSet;
    }

    /**
     * Get Ending candidate list, fill in the FileId of the video. When transcoding, the ending with the aspect ratio closest to the feature film will be automatically selected (when the aspect ratio is the same, the front candidate will take precedence). Supports up to 5 candidate titles. Not passing it means no modification, passing an empty array means clearing it. 
     * @return TailCandidateSet Ending candidate list, fill in the FileId of the video. When transcoding, the ending with the aspect ratio closest to the feature film will be automatically selected (when the aspect ratio is the same, the front candidate will take precedence). Supports up to 5 candidate titles. Not passing it means no modification, passing an empty array means clearing it.
     */
    public String [] getTailCandidateSet() {
        return this.TailCandidateSet;
    }

    /**
     * Set Ending candidate list, fill in the FileId of the video. When transcoding, the ending with the aspect ratio closest to the feature film will be automatically selected (when the aspect ratio is the same, the front candidate will take precedence). Supports up to 5 candidate titles. Not passing it means no modification, passing an empty array means clearing it.
     * @param TailCandidateSet Ending candidate list, fill in the FileId of the video. When transcoding, the ending with the aspect ratio closest to the feature film will be automatically selected (when the aspect ratio is the same, the front candidate will take precedence). Supports up to 5 candidate titles. Not passing it means no modification, passing an empty array means clearing it.
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
The default value is not to be modified. 
     * @return FillType Padding method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the transcoding processing method is "padding". Optional filling method:
<li> stretch: stretch, stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li> 
<li> gauss: Gaussian blur, keep the video aspect ratio unchanged, use Gaussian blur for the remaining edges; </li>
<li> white: leave blank, keep the video aspect ratio unchanged, use the remaining edges for the edge Use white filling; </li>
<li> black: Leave black, keep the video aspect ratio unchanged, and fill the remaining edges with black. </li>
The default value is not to be modified.
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
The default value is not to be modified.
     * @param FillType Padding method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the transcoding processing method is "padding". Optional filling method:
<li> stretch: stretch, stretch each frame to fill the entire screen, which may cause the transcoded video to be "squashed" or "stretched";</li> 
<li> gauss: Gaussian blur, keep the video aspect ratio unchanged, use Gaussian blur for the remaining edges; </li>
<li> white: leave blank, keep the video aspect ratio unchanged, use the remaining edges for the edge Use white filling; </li>
<li> black: Leave black, keep the video aspect ratio unchanged, and fill the remaining edges with black. </li>
The default value is not to be modified.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    public ModifyHeadTailTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHeadTailTemplateRequest(ModifyHeadTailTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArraySimple(map, prefix + "HeadCandidateSet.", this.HeadCandidateSet);
        this.setParamArraySimple(map, prefix + "TailCandidateSet.", this.TailCandidateSet);
        this.setParamSimple(map, prefix + "FillType", this.FillType);

    }
}

