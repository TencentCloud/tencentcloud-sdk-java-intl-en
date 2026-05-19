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

public class CreateAigcAdvancedCustomElementRequest extends AbstractModel {

    /**
    * <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Subject name cannot exceed 20 characters.</p>
    */
    @SerializedName("ElementName")
    @Expose
    private String ElementName;

    /**
    * <p>Subject description, with a length limit of 100 characters.</p>
    */
    @SerializedName("ElementDescription")
    @Expose
    private String ElementDescription;

    /**
    * <p>Reference method for the subject. The availability area differs between subjects customized via video and those customized via images.</p><p>Enumeration value:</p><ul><li>video_refer: Video character subject. At this point, the subject appearance is defined by referring to element_video_list.</li><li>image_refer: Multi-image subject. At this point, the subject appearance is defined by referring to element_image_list.</li></ul>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * <p>Voice type of the current entity. You can bind an existing timbre from the timbre library.</p><ul><li>When the current parameter is empty, the current entity is not bound to a timbre.</li><li>Only customized video entities support binding a timbre.</li></ul>
    */
    @SerializedName("ElementVoiceId")
    @Expose
    private String ElementVoiceId;

    /**
    * <p>Reference video for the entity. You can set the entity and its details through the video.</p><ul><li>You can upload a video with sound. If the video contains voice, it will trigger timbre customization (customization + adding to the timbre library + binding to the entity).</li><li>The current parameter is required when referencing a video and is invalid when referencing an image.</li><li>Use key:value pairs as follows:<br><pre><code>{  "refer_videos":[    {      "video_url":"video_url_1"    }  ]}</code></pre>● Only MP4/MOV video formats are supported.<br>● Only 1080p videos with a duration between 3s–8s and an aspect ratio of 16:9 or 9:16 are supported.<br>● Up to 1 video can be uploaded, with a video size of no more than 200MB.<br>● The video_url parameter value cannot be empty.</li></ul>
    */
    @SerializedName("ElementVideoList")
    @Expose
    private String ElementVideoList;

    /**
    * <p>Reference images of the subject can be set with multiple images and its details.</p><ul><li>Including front reference images and other perspectives or close-up reference images. Among them:<ul><li>At least 1 front reference image is required, defined by the frontal_image parameter.</li><li>1–3 other reference images are required, with differences from the front reference image, defined by the image_url parameter.</li></ul></li><li>Use key:value to carry, as follows:<br><pre><code>{  &quot;frontal_image&quot;:&quot;image_url_0&quot;,  &quot;refer_images&quot;:[    {      &quot;image_url&quot;:&quot;image_url_1&quot;    },    {      &quot;image_url&quot;:&quot;image_url_2&quot;    },    {      &quot;image_url&quot;:&quot;image_url_3&quot;    }  ]}</code></pre></li></ul>
    */
    @SerializedName("ElementImageList")
    @Expose
    private String ElementImageList;

    /**
    * <p>Configure tags for a subject. A subject can be configured with multiple tags.</p><ul><li>Use key:value pairs to carry them. Details are given below:</li></ul><p><pre><code>[  {        "tag_id": "o_101"  }, {        "tag_id": "o_102"    }]</code></pre></p>
    */
    @SerializedName("TagList")
    @Expose
    private String TagList;

    /**
    * <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Source context. This is used to pass through user request information. The task complete callback returns the value of this field. The maximum length is 1000 characters.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Subject name cannot exceed 20 characters.</p> 
     * @return ElementName <p>Subject name cannot exceed 20 characters.</p>
     */
    public String getElementName() {
        return this.ElementName;
    }

    /**
     * Set <p>Subject name cannot exceed 20 characters.</p>
     * @param ElementName <p>Subject name cannot exceed 20 characters.</p>
     */
    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }

    /**
     * Get <p>Subject description, with a length limit of 100 characters.</p> 
     * @return ElementDescription <p>Subject description, with a length limit of 100 characters.</p>
     */
    public String getElementDescription() {
        return this.ElementDescription;
    }

    /**
     * Set <p>Subject description, with a length limit of 100 characters.</p>
     * @param ElementDescription <p>Subject description, with a length limit of 100 characters.</p>
     */
    public void setElementDescription(String ElementDescription) {
        this.ElementDescription = ElementDescription;
    }

    /**
     * Get <p>Reference method for the subject. The availability area differs between subjects customized via video and those customized via images.</p><p>Enumeration value:</p><ul><li>video_refer: Video character subject. At this point, the subject appearance is defined by referring to element_video_list.</li><li>image_refer: Multi-image subject. At this point, the subject appearance is defined by referring to element_image_list.</li></ul> 
     * @return ReferenceType <p>Reference method for the subject. The availability area differs between subjects customized via video and those customized via images.</p><p>Enumeration value:</p><ul><li>video_refer: Video character subject. At this point, the subject appearance is defined by referring to element_video_list.</li><li>image_refer: Multi-image subject. At this point, the subject appearance is defined by referring to element_image_list.</li></ul>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p>Reference method for the subject. The availability area differs between subjects customized via video and those customized via images.</p><p>Enumeration value:</p><ul><li>video_refer: Video character subject. At this point, the subject appearance is defined by referring to element_video_list.</li><li>image_refer: Multi-image subject. At this point, the subject appearance is defined by referring to element_image_list.</li></ul>
     * @param ReferenceType <p>Reference method for the subject. The availability area differs between subjects customized via video and those customized via images.</p><p>Enumeration value:</p><ul><li>video_refer: Video character subject. At this point, the subject appearance is defined by referring to element_video_list.</li><li>image_refer: Multi-image subject. At this point, the subject appearance is defined by referring to element_image_list.</li></ul>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get <p>Voice type of the current entity. You can bind an existing timbre from the timbre library.</p><ul><li>When the current parameter is empty, the current entity is not bound to a timbre.</li><li>Only customized video entities support binding a timbre.</li></ul> 
     * @return ElementVoiceId <p>Voice type of the current entity. You can bind an existing timbre from the timbre library.</p><ul><li>When the current parameter is empty, the current entity is not bound to a timbre.</li><li>Only customized video entities support binding a timbre.</li></ul>
     */
    public String getElementVoiceId() {
        return this.ElementVoiceId;
    }

    /**
     * Set <p>Voice type of the current entity. You can bind an existing timbre from the timbre library.</p><ul><li>When the current parameter is empty, the current entity is not bound to a timbre.</li><li>Only customized video entities support binding a timbre.</li></ul>
     * @param ElementVoiceId <p>Voice type of the current entity. You can bind an existing timbre from the timbre library.</p><ul><li>When the current parameter is empty, the current entity is not bound to a timbre.</li><li>Only customized video entities support binding a timbre.</li></ul>
     */
    public void setElementVoiceId(String ElementVoiceId) {
        this.ElementVoiceId = ElementVoiceId;
    }

    /**
     * Get <p>Reference video for the entity. You can set the entity and its details through the video.</p><ul><li>You can upload a video with sound. If the video contains voice, it will trigger timbre customization (customization + adding to the timbre library + binding to the entity).</li><li>The current parameter is required when referencing a video and is invalid when referencing an image.</li><li>Use key:value pairs as follows:<br><pre><code>{  "refer_videos":[    {      "video_url":"video_url_1"    }  ]}</code></pre>● Only MP4/MOV video formats are supported.<br>● Only 1080p videos with a duration between 3s–8s and an aspect ratio of 16:9 or 9:16 are supported.<br>● Up to 1 video can be uploaded, with a video size of no more than 200MB.<br>● The video_url parameter value cannot be empty.</li></ul> 
     * @return ElementVideoList <p>Reference video for the entity. You can set the entity and its details through the video.</p><ul><li>You can upload a video with sound. If the video contains voice, it will trigger timbre customization (customization + adding to the timbre library + binding to the entity).</li><li>The current parameter is required when referencing a video and is invalid when referencing an image.</li><li>Use key:value pairs as follows:<br><pre><code>{  "refer_videos":[    {      "video_url":"video_url_1"    }  ]}</code></pre>● Only MP4/MOV video formats are supported.<br>● Only 1080p videos with a duration between 3s–8s and an aspect ratio of 16:9 or 9:16 are supported.<br>● Up to 1 video can be uploaded, with a video size of no more than 200MB.<br>● The video_url parameter value cannot be empty.</li></ul>
     */
    public String getElementVideoList() {
        return this.ElementVideoList;
    }

    /**
     * Set <p>Reference video for the entity. You can set the entity and its details through the video.</p><ul><li>You can upload a video with sound. If the video contains voice, it will trigger timbre customization (customization + adding to the timbre library + binding to the entity).</li><li>The current parameter is required when referencing a video and is invalid when referencing an image.</li><li>Use key:value pairs as follows:<br><pre><code>{  "refer_videos":[    {      "video_url":"video_url_1"    }  ]}</code></pre>● Only MP4/MOV video formats are supported.<br>● Only 1080p videos with a duration between 3s–8s and an aspect ratio of 16:9 or 9:16 are supported.<br>● Up to 1 video can be uploaded, with a video size of no more than 200MB.<br>● The video_url parameter value cannot be empty.</li></ul>
     * @param ElementVideoList <p>Reference video for the entity. You can set the entity and its details through the video.</p><ul><li>You can upload a video with sound. If the video contains voice, it will trigger timbre customization (customization + adding to the timbre library + binding to the entity).</li><li>The current parameter is required when referencing a video and is invalid when referencing an image.</li><li>Use key:value pairs as follows:<br><pre><code>{  "refer_videos":[    {      "video_url":"video_url_1"    }  ]}</code></pre>● Only MP4/MOV video formats are supported.<br>● Only 1080p videos with a duration between 3s–8s and an aspect ratio of 16:9 or 9:16 are supported.<br>● Up to 1 video can be uploaded, with a video size of no more than 200MB.<br>● The video_url parameter value cannot be empty.</li></ul>
     */
    public void setElementVideoList(String ElementVideoList) {
        this.ElementVideoList = ElementVideoList;
    }

    /**
     * Get <p>Reference images of the subject can be set with multiple images and its details.</p><ul><li>Including front reference images and other perspectives or close-up reference images. Among them:<ul><li>At least 1 front reference image is required, defined by the frontal_image parameter.</li><li>1–3 other reference images are required, with differences from the front reference image, defined by the image_url parameter.</li></ul></li><li>Use key:value to carry, as follows:<br><pre><code>{  &quot;frontal_image&quot;:&quot;image_url_0&quot;,  &quot;refer_images&quot;:[    {      &quot;image_url&quot;:&quot;image_url_1&quot;    },    {      &quot;image_url&quot;:&quot;image_url_2&quot;    },    {      &quot;image_url&quot;:&quot;image_url_3&quot;    }  ]}</code></pre></li></ul> 
     * @return ElementImageList <p>Reference images of the subject can be set with multiple images and its details.</p><ul><li>Including front reference images and other perspectives or close-up reference images. Among them:<ul><li>At least 1 front reference image is required, defined by the frontal_image parameter.</li><li>1–3 other reference images are required, with differences from the front reference image, defined by the image_url parameter.</li></ul></li><li>Use key:value to carry, as follows:<br><pre><code>{  &quot;frontal_image&quot;:&quot;image_url_0&quot;,  &quot;refer_images&quot;:[    {      &quot;image_url&quot;:&quot;image_url_1&quot;    },    {      &quot;image_url&quot;:&quot;image_url_2&quot;    },    {      &quot;image_url&quot;:&quot;image_url_3&quot;    }  ]}</code></pre></li></ul>
     */
    public String getElementImageList() {
        return this.ElementImageList;
    }

    /**
     * Set <p>Reference images of the subject can be set with multiple images and its details.</p><ul><li>Including front reference images and other perspectives or close-up reference images. Among them:<ul><li>At least 1 front reference image is required, defined by the frontal_image parameter.</li><li>1–3 other reference images are required, with differences from the front reference image, defined by the image_url parameter.</li></ul></li><li>Use key:value to carry, as follows:<br><pre><code>{  &quot;frontal_image&quot;:&quot;image_url_0&quot;,  &quot;refer_images&quot;:[    {      &quot;image_url&quot;:&quot;image_url_1&quot;    },    {      &quot;image_url&quot;:&quot;image_url_2&quot;    },    {      &quot;image_url&quot;:&quot;image_url_3&quot;    }  ]}</code></pre></li></ul>
     * @param ElementImageList <p>Reference images of the subject can be set with multiple images and its details.</p><ul><li>Including front reference images and other perspectives or close-up reference images. Among them:<ul><li>At least 1 front reference image is required, defined by the frontal_image parameter.</li><li>1–3 other reference images are required, with differences from the front reference image, defined by the image_url parameter.</li></ul></li><li>Use key:value to carry, as follows:<br><pre><code>{  &quot;frontal_image&quot;:&quot;image_url_0&quot;,  &quot;refer_images&quot;:[    {      &quot;image_url&quot;:&quot;image_url_1&quot;    },    {      &quot;image_url&quot;:&quot;image_url_2&quot;    },    {      &quot;image_url&quot;:&quot;image_url_3&quot;    }  ]}</code></pre></li></ul>
     */
    public void setElementImageList(String ElementImageList) {
        this.ElementImageList = ElementImageList;
    }

    /**
     * Get <p>Configure tags for a subject. A subject can be configured with multiple tags.</p><ul><li>Use key:value pairs to carry them. Details are given below:</li></ul><p><pre><code>[  {        "tag_id": "o_101"  }, {        "tag_id": "o_102"    }]</code></pre></p> 
     * @return TagList <p>Configure tags for a subject. A subject can be configured with multiple tags.</p><ul><li>Use key:value pairs to carry them. Details are given below:</li></ul><p><pre><code>[  {        "tag_id": "o_101"  }, {        "tag_id": "o_102"    }]</code></pre></p>
     */
    public String getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>Configure tags for a subject. A subject can be configured with multiple tags.</p><ul><li>Use key:value pairs to carry them. Details are given below:</li></ul><p><pre><code>[  {        "tag_id": "o_101"  }, {        "tag_id": "o_102"    }]</code></pre></p>
     * @param TagList <p>Configure tags for a subject. A subject can be configured with multiple tags.</p><ul><li>Use key:value pairs to carry them. Details are given below:</li></ul><p><pre><code>[  {        "tag_id": "o_101"  }, {        "tag_id": "o_102"    }]</code></pre></p>
     */
    public void setTagList(String TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p> 
     * @return SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     * @param SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Source context. This is used to pass through user request information. The task complete callback returns the value of this field. The maximum length is 1000 characters.</p> 
     * @return SessionContext <p>Source context. This is used to pass through user request information. The task complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Source context. This is used to pass through user request information. The task complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     * @param SessionContext <p>Source context. This is used to pass through user request information. The task complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p> 
     * @return TasksPriority <p>Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p>
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set <p>Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p>
     * @param TasksPriority <p>Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p>
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    public CreateAigcAdvancedCustomElementRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAdvancedCustomElementRequest(CreateAigcAdvancedCustomElementRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ElementName != null) {
            this.ElementName = new String(source.ElementName);
        }
        if (source.ElementDescription != null) {
            this.ElementDescription = new String(source.ElementDescription);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
        if (source.ElementVoiceId != null) {
            this.ElementVoiceId = new String(source.ElementVoiceId);
        }
        if (source.ElementVideoList != null) {
            this.ElementVideoList = new String(source.ElementVideoList);
        }
        if (source.ElementImageList != null) {
            this.ElementImageList = new String(source.ElementImageList);
        }
        if (source.TagList != null) {
            this.TagList = new String(source.TagList);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ElementName", this.ElementName);
        this.setParamSimple(map, prefix + "ElementDescription", this.ElementDescription);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "ElementVoiceId", this.ElementVoiceId);
        this.setParamSimple(map, prefix + "ElementVideoList", this.ElementVideoList);
        this.setParamSimple(map, prefix + "ElementImageList", this.ElementImageList);
        this.setParamSimple(map, prefix + "TagList", this.TagList);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

