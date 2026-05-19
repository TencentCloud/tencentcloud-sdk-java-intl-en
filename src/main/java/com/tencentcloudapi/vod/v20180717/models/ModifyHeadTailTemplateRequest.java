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
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Template name. Length limit: 64 characters. Leave it empty to skip modification.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description, with a length limit of 256 characters. Not passing it means no modification, while passing an empty value means clearing it.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Opening Credits Candidate List. Fill in the FileId of the video. During transcoding, the opening scene with the closest aspect ratio to the main content will be automatically selected (identical aspect ratio gives precedence to candidates positioned towards the front). Supports up to 5 title candidates. Not passing represents no modification, passing an empty array represents clearing.
    */
    @SerializedName("HeadCandidateSet")
    @Expose
    private String [] HeadCandidateSet;

    /**
    * Ending candidate list. Fill in the FileId of the video. During transcoding, the system will automatically select the ending with the aspect ratio closest to the main content (if identical, the candidate positioned towards the front takes precedence). Supports up to 5 title candidates. Omission means no modification, while an empty array means clearing.
    */
    @SerializedName("TailCandidateSet")
    @Expose
    private String [] TailCandidateSet;

    /**
    * Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, use Gaussian blur for the remaining edge part;</li>
<li> white: Leave blank, maintain video aspect ratio, edge remainder filled with white;</li>
<li>Black: Keep black, maintain video aspect ratio, edges filled with black.</li>
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
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Template name. Length limit: 64 characters. Leave it empty to skip modification. 
     * @return Name Template name. Length limit: 64 characters. Leave it empty to skip modification.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name. Length limit: 64 characters. Leave it empty to skip modification.
     * @param Name Template name. Length limit: 64 characters. Leave it empty to skip modification.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description, with a length limit of 256 characters. Not passing it means no modification, while passing an empty value means clearing it. 
     * @return Comment Template description, with a length limit of 256 characters. Not passing it means no modification, while passing an empty value means clearing it.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description, with a length limit of 256 characters. Not passing it means no modification, while passing an empty value means clearing it.
     * @param Comment Template description, with a length limit of 256 characters. Not passing it means no modification, while passing an empty value means clearing it.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Opening Credits Candidate List. Fill in the FileId of the video. During transcoding, the opening scene with the closest aspect ratio to the main content will be automatically selected (identical aspect ratio gives precedence to candidates positioned towards the front). Supports up to 5 title candidates. Not passing represents no modification, passing an empty array represents clearing. 
     * @return HeadCandidateSet Opening Credits Candidate List. Fill in the FileId of the video. During transcoding, the opening scene with the closest aspect ratio to the main content will be automatically selected (identical aspect ratio gives precedence to candidates positioned towards the front). Supports up to 5 title candidates. Not passing represents no modification, passing an empty array represents clearing.
     */
    public String [] getHeadCandidateSet() {
        return this.HeadCandidateSet;
    }

    /**
     * Set Opening Credits Candidate List. Fill in the FileId of the video. During transcoding, the opening scene with the closest aspect ratio to the main content will be automatically selected (identical aspect ratio gives precedence to candidates positioned towards the front). Supports up to 5 title candidates. Not passing represents no modification, passing an empty array represents clearing.
     * @param HeadCandidateSet Opening Credits Candidate List. Fill in the FileId of the video. During transcoding, the opening scene with the closest aspect ratio to the main content will be automatically selected (identical aspect ratio gives precedence to candidates positioned towards the front). Supports up to 5 title candidates. Not passing represents no modification, passing an empty array represents clearing.
     */
    public void setHeadCandidateSet(String [] HeadCandidateSet) {
        this.HeadCandidateSet = HeadCandidateSet;
    }

    /**
     * Get Ending candidate list. Fill in the FileId of the video. During transcoding, the system will automatically select the ending with the aspect ratio closest to the main content (if identical, the candidate positioned towards the front takes precedence). Supports up to 5 title candidates. Omission means no modification, while an empty array means clearing. 
     * @return TailCandidateSet Ending candidate list. Fill in the FileId of the video. During transcoding, the system will automatically select the ending with the aspect ratio closest to the main content (if identical, the candidate positioned towards the front takes precedence). Supports up to 5 title candidates. Omission means no modification, while an empty array means clearing.
     */
    public String [] getTailCandidateSet() {
        return this.TailCandidateSet;
    }

    /**
     * Set Ending candidate list. Fill in the FileId of the video. During transcoding, the system will automatically select the ending with the aspect ratio closest to the main content (if identical, the candidate positioned towards the front takes precedence). Supports up to 5 title candidates. Omission means no modification, while an empty array means clearing.
     * @param TailCandidateSet Ending candidate list. Fill in the FileId of the video. During transcoding, the system will automatically select the ending with the aspect ratio closest to the main content (if identical, the candidate positioned towards the front takes precedence). Supports up to 5 title candidates. Omission means no modification, while an empty array means clearing.
     */
    public void setTailCandidateSet(String [] TailCandidateSet) {
        this.TailCandidateSet = TailCandidateSet;
    }

    /**
     * Get Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, use Gaussian blur for the remaining edge part;</li>
<li> white: Leave blank, maintain video aspect ratio, edge remainder filled with white;</li>
<li>Black: Keep black, maintain video aspect ratio, edges filled with black.</li>
The default value is no modification. 
     * @return FillType Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, use Gaussian blur for the remaining edge part;</li>
<li> white: Leave blank, maintain video aspect ratio, edge remainder filled with white;</li>
<li>Black: Keep black, maintain video aspect ratio, edges filled with black.</li>
The default value is no modification.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, use Gaussian blur for the remaining edge part;</li>
<li> white: Leave blank, maintain video aspect ratio, edge remainder filled with white;</li>
<li>Black: Keep black, maintain video aspect ratio, edges filled with black.</li>
The default value is no modification.
     * @param FillType Filling method. When the video stream configuration width and height parameters are inconsistent with the aspect ratio of the original video, the processing method for transcoding is "padding". Optional filling mode:
<li> stretch: Stretch each frame to fill the entire screen, possibly causing the transcoded video to be "squashed" or "stretched";</li>
<li> gauss: Gaussian blur, maintain video aspect ratio, use Gaussian blur for the remaining edge part;</li>
<li> white: Leave blank, maintain video aspect ratio, edge remainder filled with white;</li>
<li>Black: Keep black, maintain video aspect ratio, edges filled with black.</li>
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

