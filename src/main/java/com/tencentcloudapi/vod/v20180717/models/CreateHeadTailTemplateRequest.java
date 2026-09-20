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

public class CreateHeadTailTemplateRequest extends AbstractModel {

    /**
    * Template name, length limited to 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Template description information. The length cannot exceed 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Opening candidate list. Fill in the FileId of the video. During transcoding, the opening scene with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are identical, candidates positioned towards the front take precedence. A maximum of 5 opening candidates is supported.
    */
    @SerializedName("HeadCandidateSet")
    @Expose
    private String [] HeadCandidateSet;

    /**
    * Ending candidate list. Fill in the FileId of the video. During transcoding, the ending with the aspect ratio closest to the main content is automatically selected. If the aspect ratios are identical, candidates positioned towards the front are prioritized. A maximum of 5 ending candidates is supported.
    */
    @SerializedName("TailCandidateSet")
    @Expose
    private String [] TailCandidateSet;

    /**
    * Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: stretches each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio, and fill the remaining edges with black.</li>
Default value: stretch.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
     * Get Template name, length limited to 64 characters. 
     * @return Name Template name, length limited to 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name, length limited to 64 characters.
     * @param Name Template name, length limited to 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Template description information. The length cannot exceed 256 characters. 
     * @return Comment Template description information. The length cannot exceed 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description information. The length cannot exceed 256 characters.
     * @param Comment Template description information. The length cannot exceed 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Opening candidate list. Fill in the FileId of the video. During transcoding, the opening scene with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are identical, candidates positioned towards the front take precedence. A maximum of 5 opening candidates is supported. 
     * @return HeadCandidateSet Opening candidate list. Fill in the FileId of the video. During transcoding, the opening scene with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are identical, candidates positioned towards the front take precedence. A maximum of 5 opening candidates is supported.
     */
    public String [] getHeadCandidateSet() {
        return this.HeadCandidateSet;
    }

    /**
     * Set Opening candidate list. Fill in the FileId of the video. During transcoding, the opening scene with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are identical, candidates positioned towards the front take precedence. A maximum of 5 opening candidates is supported.
     * @param HeadCandidateSet Opening candidate list. Fill in the FileId of the video. During transcoding, the opening scene with the aspect ratio closest to that of the main content is automatically selected. If the aspect ratios are identical, candidates positioned towards the front take precedence. A maximum of 5 opening candidates is supported.
     */
    public void setHeadCandidateSet(String [] HeadCandidateSet) {
        this.HeadCandidateSet = HeadCandidateSet;
    }

    /**
     * Get Ending candidate list. Fill in the FileId of the video. During transcoding, the ending with the aspect ratio closest to the main content is automatically selected. If the aspect ratios are identical, candidates positioned towards the front are prioritized. A maximum of 5 ending candidates is supported. 
     * @return TailCandidateSet Ending candidate list. Fill in the FileId of the video. During transcoding, the ending with the aspect ratio closest to the main content is automatically selected. If the aspect ratios are identical, candidates positioned towards the front are prioritized. A maximum of 5 ending candidates is supported.
     */
    public String [] getTailCandidateSet() {
        return this.TailCandidateSet;
    }

    /**
     * Set Ending candidate list. Fill in the FileId of the video. During transcoding, the ending with the aspect ratio closest to the main content is automatically selected. If the aspect ratios are identical, candidates positioned towards the front are prioritized. A maximum of 5 ending candidates is supported.
     * @param TailCandidateSet Ending candidate list. Fill in the FileId of the video. During transcoding, the ending with the aspect ratio closest to the main content is automatically selected. If the aspect ratios are identical, candidates positioned towards the front are prioritized. A maximum of 5 ending candidates is supported.
     */
    public void setTailCandidateSet(String [] TailCandidateSet) {
        this.TailCandidateSet = TailCandidateSet;
    }

    /**
     * Get Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: stretches each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio, and fill the remaining edges with black.</li>
Default value: stretch. 
     * @return FillType Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: stretches each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio, and fill the remaining edges with black.</li>
Default value: stretch.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: stretches each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio, and fill the remaining edges with black.</li>
Default value: stretch.
     * @param FillType Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling methods:
<li> stretch: stretches each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, and apply Gaussian blur to the remaining edge part;</li>
<li> white: leave blank, maintain video aspect ratio, and fill the remaining edges with white;</li>
<li> black: Fill with black. Maintain the video aspect ratio, and fill the remaining edges with black.</li>
Default value: stretch.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    public CreateHeadTailTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHeadTailTemplateRequest(CreateHeadTailTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArraySimple(map, prefix + "HeadCandidateSet.", this.HeadCandidateSet);
        this.setParamArraySimple(map, prefix + "TailCandidateSet.", this.TailCandidateSet);
        this.setParamSimple(map, prefix + "FillType", this.FillType);

    }
}

