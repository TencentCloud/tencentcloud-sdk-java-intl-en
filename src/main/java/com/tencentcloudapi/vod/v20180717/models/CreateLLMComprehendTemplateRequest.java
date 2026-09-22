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

public class CreateLLMComprehendTemplateRequest extends AbstractModel {

    /**
    * <p>Parsing level. Available values are:</p><ul><li>Audio: audio-level parsing</li><li>Video: video-level parsing</li></ul>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p><b>ID of the on-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a>. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Large model parsing template name. Length limit: 64 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Large model parsing template description. Length limit: 256 characters.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Segment summary parsing configuration<br>Note: In the current version, segment summary must be enabled for normal parsing</p>
    */
    @SerializedName("Summary")
    @Expose
    private LLMComprehendSummary Summary;

    /**
    * <p>Text transcription parsing configuration</p>
    */
    @SerializedName("Asr")
    @Expose
    private LLMComprehendAsr Asr;

    /**
    * <p>Face recognition configuration</p>
    */
    @SerializedName("FaceRecognition")
    @Expose
    private LLMComprehendFaceRecognition FaceRecognition;

    /**
     * Get <p>Parsing level. Available values are:</p><ul><li>Audio: audio-level parsing</li><li>Video: video-level parsing</li></ul> 
     * @return Level <p>Parsing level. Available values are:</p><ul><li>Audio: audio-level parsing</li><li>Video: video-level parsing</li></ul>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Parsing level. Available values are:</p><ul><li>Audio: audio-level parsing</li><li>Video: video-level parsing</li></ul>
     * @param Level <p>Parsing level. Available values are:</p><ul><li>Audio: audio-level parsing</li><li>Video: video-level parsing</li></ul>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p><b>ID of the on-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a>. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>ID of the on-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a>. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>ID of the on-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a>. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>ID of the on-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a>. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Large model parsing template name. Length limit: 64 characters.</p> 
     * @return Name <p>Large model parsing template name. Length limit: 64 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Large model parsing template name. Length limit: 64 characters.</p>
     * @param Name <p>Large model parsing template name. Length limit: 64 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Large model parsing template description. Length limit: 256 characters.</p> 
     * @return Comment <p>Large model parsing template description. Length limit: 256 characters.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Large model parsing template description. Length limit: 256 characters.</p>
     * @param Comment <p>Large model parsing template description. Length limit: 256 characters.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Segment summary parsing configuration<br>Note: In the current version, segment summary must be enabled for normal parsing</p> 
     * @return Summary <p>Segment summary parsing configuration<br>Note: In the current version, segment summary must be enabled for normal parsing</p>
     */
    public LLMComprehendSummary getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>Segment summary parsing configuration<br>Note: In the current version, segment summary must be enabled for normal parsing</p>
     * @param Summary <p>Segment summary parsing configuration<br>Note: In the current version, segment summary must be enabled for normal parsing</p>
     */
    public void setSummary(LLMComprehendSummary Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>Text transcription parsing configuration</p> 
     * @return Asr <p>Text transcription parsing configuration</p>
     */
    public LLMComprehendAsr getAsr() {
        return this.Asr;
    }

    /**
     * Set <p>Text transcription parsing configuration</p>
     * @param Asr <p>Text transcription parsing configuration</p>
     */
    public void setAsr(LLMComprehendAsr Asr) {
        this.Asr = Asr;
    }

    /**
     * Get <p>Face recognition configuration</p> 
     * @return FaceRecognition <p>Face recognition configuration</p>
     */
    public LLMComprehendFaceRecognition getFaceRecognition() {
        return this.FaceRecognition;
    }

    /**
     * Set <p>Face recognition configuration</p>
     * @param FaceRecognition <p>Face recognition configuration</p>
     */
    public void setFaceRecognition(LLMComprehendFaceRecognition FaceRecognition) {
        this.FaceRecognition = FaceRecognition;
    }

    public CreateLLMComprehendTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLLMComprehendTemplateRequest(CreateLLMComprehendTemplateRequest source) {
        if (source.Level != null) {
            this.Level = new String(source.Level);
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
        if (source.Summary != null) {
            this.Summary = new LLMComprehendSummary(source.Summary);
        }
        if (source.Asr != null) {
            this.Asr = new LLMComprehendAsr(source.Asr);
        }
        if (source.FaceRecognition != null) {
            this.FaceRecognition = new LLMComprehendFaceRecognition(source.FaceRecognition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamObj(map, prefix + "Asr.", this.Asr);
        this.setParamObj(map, prefix + "FaceRecognition.", this.FaceRecognition);

    }
}

