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
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate on-demand services after December 25, 2023, they must fill this field with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b>
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
    * Opening Credits Candidate List. Fill in the FileId of the video. During transcoding, a title candidate with the aspect ratio closest to the main content will be automatically selected (when identical, precedence is given to candidates positioned towards the front). Supports up to 5 title candidates.
    */
    @SerializedName("HeadCandidateSet")
    @Expose
    private String [] HeadCandidateSet;

    /**
    * Ending candidate list. Fill in the FileId of the video. During transcoding, the system will automatically select the ending with the closest aspect ratio to the main content (if identical, the candidate positioned towards the front takes precedence). Supports up to 5 ending candidates.
    */
    @SerializedName("TailCandidateSet")
    @Expose
    private String [] TailCandidateSet;

    /**
    * Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched.</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, use Gaussian blur for the remaining edge part;</li>
<li>White: Leave blank, maintain video aspect ratio, edge remainder filled with white;</li>
<li> black: Keep black edges to maintain video aspect ratio, with edges filled with black.</li>
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
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate on-demand services after December 25, 2023, they must fill this field with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate on-demand services after December 25, 2023, they must fill this field with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate on-demand services after December 25, 2023, they must fill this field with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate on-demand services after December 25, 2023, they must fill this field with the application ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b>
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
     * Get Opening Credits Candidate List. Fill in the FileId of the video. During transcoding, a title candidate with the aspect ratio closest to the main content will be automatically selected (when identical, precedence is given to candidates positioned towards the front). Supports up to 5 title candidates. 
     * @return HeadCandidateSet Opening Credits Candidate List. Fill in the FileId of the video. During transcoding, a title candidate with the aspect ratio closest to the main content will be automatically selected (when identical, precedence is given to candidates positioned towards the front). Supports up to 5 title candidates.
     */
    public String [] getHeadCandidateSet() {
        return this.HeadCandidateSet;
    }

    /**
     * Set Opening Credits Candidate List. Fill in the FileId of the video. During transcoding, a title candidate with the aspect ratio closest to the main content will be automatically selected (when identical, precedence is given to candidates positioned towards the front). Supports up to 5 title candidates.
     * @param HeadCandidateSet Opening Credits Candidate List. Fill in the FileId of the video. During transcoding, a title candidate with the aspect ratio closest to the main content will be automatically selected (when identical, precedence is given to candidates positioned towards the front). Supports up to 5 title candidates.
     */
    public void setHeadCandidateSet(String [] HeadCandidateSet) {
        this.HeadCandidateSet = HeadCandidateSet;
    }

    /**
     * Get Ending candidate list. Fill in the FileId of the video. During transcoding, the system will automatically select the ending with the closest aspect ratio to the main content (if identical, the candidate positioned towards the front takes precedence). Supports up to 5 ending candidates. 
     * @return TailCandidateSet Ending candidate list. Fill in the FileId of the video. During transcoding, the system will automatically select the ending with the closest aspect ratio to the main content (if identical, the candidate positioned towards the front takes precedence). Supports up to 5 ending candidates.
     */
    public String [] getTailCandidateSet() {
        return this.TailCandidateSet;
    }

    /**
     * Set Ending candidate list. Fill in the FileId of the video. During transcoding, the system will automatically select the ending with the closest aspect ratio to the main content (if identical, the candidate positioned towards the front takes precedence). Supports up to 5 ending candidates.
     * @param TailCandidateSet Ending candidate list. Fill in the FileId of the video. During transcoding, the system will automatically select the ending with the closest aspect ratio to the main content (if identical, the candidate positioned towards the front takes precedence). Supports up to 5 ending candidates.
     */
    public void setTailCandidateSet(String [] TailCandidateSet) {
        this.TailCandidateSet = TailCandidateSet;
    }

    /**
     * Get Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched.</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, use Gaussian blur for the remaining edge part;</li>
<li>White: Leave blank, maintain video aspect ratio, edge remainder filled with white;</li>
<li> black: Keep black edges to maintain video aspect ratio, with edges filled with black.</li>
Default value: stretch. 
     * @return FillType Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched.</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, use Gaussian blur for the remaining edge part;</li>
<li>White: Leave blank, maintain video aspect ratio, edge remainder filled with white;</li>
<li> black: Keep black edges to maintain video aspect ratio, with edges filled with black.</li>
Default value: stretch.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched.</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, use Gaussian blur for the remaining edge part;</li>
<li>White: Leave blank, maintain video aspect ratio, edge remainder filled with white;</li>
<li> black: Keep black edges to maintain video aspect ratio, with edges filled with black.</li>
Default value: stretch.
     * @param FillType Filling method. When video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be squashed or stretched.</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, use Gaussian blur for the remaining edge part;</li>
<li>White: Leave blank, maintain video aspect ratio, edge remainder filled with white;</li>
<li> black: Keep black edges to maintain video aspect ratio, with edges filled with black.</li>
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

