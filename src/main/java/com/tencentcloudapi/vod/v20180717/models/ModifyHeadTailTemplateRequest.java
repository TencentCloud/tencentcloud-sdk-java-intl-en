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

public class ModifyHeadTailTemplateRequest extends AbstractModel {

    /**
    * Opening and ending template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Template name. Length limited to 64 characters. If not passed, it represents no modification.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description. Length limited to 256 characters. If not passed, no modification is made. If passed empty, the description is cleared.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Opening candidate list. Fill in the FileId of the video. During transcoding, the opening scene with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are identical, the candidate positioned towards the front takes precedence. A maximum of 5 candidate opening scenes is supported. If not passed, no modification is made. An empty array clears the list.
    */
    @SerializedName("HeadCandidateSet")
    @Expose
    private String [] HeadCandidateSet;

    /**
    * Ending candidate list. Fill in the FileId of the video. During transcoding, the ending with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are the same, candidates positioned towards the front take precedence. A maximum of 5 title candidates is supported. If not passed, no modification is made. An empty array clears the list.
    */
    @SerializedName("TailCandidateSet")
    @Expose
    private String [] TailCandidateSet;

    /**
    * Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: Leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio and fill the remaining edges with black.</li>
The default value is no modification.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

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
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Template name. Length limited to 64 characters. If not passed, it represents no modification. 
     * @return Name Template name. Length limited to 64 characters. If not passed, it represents no modification.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name. Length limited to 64 characters. If not passed, it represents no modification.
     * @param Name Template name. Length limited to 64 characters. If not passed, it represents no modification.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description. Length limited to 256 characters. If not passed, no modification is made. If passed empty, the description is cleared. 
     * @return Comment Template description. Length limited to 256 characters. If not passed, no modification is made. If passed empty, the description is cleared.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description. Length limited to 256 characters. If not passed, no modification is made. If passed empty, the description is cleared.
     * @param Comment Template description. Length limited to 256 characters. If not passed, no modification is made. If passed empty, the description is cleared.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Opening candidate list. Fill in the FileId of the video. During transcoding, the opening scene with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are identical, the candidate positioned towards the front takes precedence. A maximum of 5 candidate opening scenes is supported. If not passed, no modification is made. An empty array clears the list. 
     * @return HeadCandidateSet Opening candidate list. Fill in the FileId of the video. During transcoding, the opening scene with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are identical, the candidate positioned towards the front takes precedence. A maximum of 5 candidate opening scenes is supported. If not passed, no modification is made. An empty array clears the list.
     */
    public String [] getHeadCandidateSet() {
        return this.HeadCandidateSet;
    }

    /**
     * Set Opening candidate list. Fill in the FileId of the video. During transcoding, the opening scene with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are identical, the candidate positioned towards the front takes precedence. A maximum of 5 candidate opening scenes is supported. If not passed, no modification is made. An empty array clears the list.
     * @param HeadCandidateSet Opening candidate list. Fill in the FileId of the video. During transcoding, the opening scene with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are identical, the candidate positioned towards the front takes precedence. A maximum of 5 candidate opening scenes is supported. If not passed, no modification is made. An empty array clears the list.
     */
    public void setHeadCandidateSet(String [] HeadCandidateSet) {
        this.HeadCandidateSet = HeadCandidateSet;
    }

    /**
     * Get Ending candidate list. Fill in the FileId of the video. During transcoding, the ending with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are the same, candidates positioned towards the front take precedence. A maximum of 5 title candidates is supported. If not passed, no modification is made. An empty array clears the list. 
     * @return TailCandidateSet Ending candidate list. Fill in the FileId of the video. During transcoding, the ending with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are the same, candidates positioned towards the front take precedence. A maximum of 5 title candidates is supported. If not passed, no modification is made. An empty array clears the list.
     */
    public String [] getTailCandidateSet() {
        return this.TailCandidateSet;
    }

    /**
     * Set Ending candidate list. Fill in the FileId of the video. During transcoding, the ending with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are the same, candidates positioned towards the front take precedence. A maximum of 5 title candidates is supported. If not passed, no modification is made. An empty array clears the list.
     * @param TailCandidateSet Ending candidate list. Fill in the FileId of the video. During transcoding, the ending with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are the same, candidates positioned towards the front take precedence. A maximum of 5 title candidates is supported. If not passed, no modification is made. An empty array clears the list.
     */
    public void setTailCandidateSet(String [] TailCandidateSet) {
        this.TailCandidateSet = TailCandidateSet;
    }

    /**
     * Get Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: Leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio and fill the remaining edges with black.</li>
The default value is no modification. 
     * @return FillType Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: Leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio and fill the remaining edges with black.</li>
The default value is no modification.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: Leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio and fill the remaining edges with black.</li>
The default value is no modification.
     * @param FillType Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: Leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio and fill the remaining edges with black.</li>
The default value is no modification.
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

