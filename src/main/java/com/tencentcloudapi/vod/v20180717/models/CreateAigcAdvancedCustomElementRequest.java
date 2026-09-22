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
    * <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Subject name, cannot exceed 20 characters.</p>
    */
    @SerializedName("ElementName")
    @Expose
    private String ElementName;

    /**
    * <p>Subject description, up to 100 characters.</p>
    */
    @SerializedName("ElementDescription")
    @Expose
    private String ElementDescription;

    /**
    * <p>Subject reference method. The availability of subjects customized via video and via images differs.</p><p>Enumeration values:</p><ul><li>video_refer: Video character subject. At this point, refer to element_video_list to define the subject appearance.</li><li>image_refer: Multi-image subject. At this point, refer to element_image_list to define the subject appearance.</li></ul>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * <p>Entity timbre, bindable to existing timbres in the timbre library.</p><ul><li>If the current parameter is empty, the current entity is not bound to a timbre.</li><li>Only entities customized for video support binding timbres.</li></ul>
    */
    @SerializedName("ElementVoiceId")
    @Expose
    private String ElementVoiceId;

    /**
    * <p>Entity reference video, used to set the entity and its details via video.</p><ul><li>videos with audio can be uploaded. If the video contains voice, it triggers timbre customization (customize + add to timbre library + bind with entity).</li><li>The current parameter is required when referencing a video, and invalid when referencing an image.</li><li>Carried in key:value format, as follows:<br><pre><code>{  "refer_videos":[    {      "video_url":"video_url_1"    }  ]}</code></pre>● video format supports only MP4/MOV<br>● Only 1080p videos with duration between 3s and 8s and an aspect ratio of 16:9 or 9:16 are supported<br>● Up to 1 video can be uploaded, with a video size no more than 200MB<br>● The video_url parameter value cannot be empty</li></ul>
    */
    @SerializedName("ElementVideoList")
    @Expose
    private String ElementVideoList;

    /**
    * <p>Subject reference image. You can set the subject and its details through multiple images.</p><ul><li>Including a front reference image and other angle or close-up reference images, where:<ul><li>At least 1 front reference image is required, defined by the frontal_image parameter.</li><li>1–3 other reference images are required. They must have differences from the front reference image and are defined by the image_url parameter.</li></ul></li><li>Carried in key:value format as follows:<br><pre><code>{  "frontal_image":"image_url_0",  "refer_images":[    {      "image_url":"image_url_1"    },    {      "image_url":"image_url_2"    },    {      "image_url":"image_url_3"    }  ]}</code></pre></li></ul>
    */
    @SerializedName("ElementImageList")
    @Expose
    private String ElementImageList;

    /**
    * <p>Configure tags for a principal. A principal can be configured with multiple tags.</p><ul><li>Use key:value to carry them. Details are given below:</li></ul><p><pre><code>[  {        &quot;tag_id&quot;: &quot;o_101&quot;  }, {        &quot;tag_id&quot;: &quot;o_102&quot;    }]</code></pre></p>
    */
    @SerializedName("TagList")
    @Expose
    private String TagList;

    /**
    * <p>If the overseas custom subject library is enabled, you can pass in <code>True</code> to use it.</p><p>Enumeration values:</p><ul><li>True: Use the overseas custom subject library.</li><li>False: Do not use the overseas custom subject library.</li></ul>
    */
    @SerializedName("DisableModeration")
    @Expose
    private String DisableModeration;

    /**
    * <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Source context. This is used to pass user request information. The task complete callback returns the value of this field. The maximum length is 1000 characters.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Subject name, cannot exceed 20 characters.</p> 
     * @return ElementName <p>Subject name, cannot exceed 20 characters.</p>
     */
    public String getElementName() {
        return this.ElementName;
    }

    /**
     * Set <p>Subject name, cannot exceed 20 characters.</p>
     * @param ElementName <p>Subject name, cannot exceed 20 characters.</p>
     */
    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }

    /**
     * Get <p>Subject description, up to 100 characters.</p> 
     * @return ElementDescription <p>Subject description, up to 100 characters.</p>
     */
    public String getElementDescription() {
        return this.ElementDescription;
    }

    /**
     * Set <p>Subject description, up to 100 characters.</p>
     * @param ElementDescription <p>Subject description, up to 100 characters.</p>
     */
    public void setElementDescription(String ElementDescription) {
        this.ElementDescription = ElementDescription;
    }

    /**
     * Get <p>Subject reference method. The availability of subjects customized via video and via images differs.</p><p>Enumeration values:</p><ul><li>video_refer: Video character subject. At this point, refer to element_video_list to define the subject appearance.</li><li>image_refer: Multi-image subject. At this point, refer to element_image_list to define the subject appearance.</li></ul> 
     * @return ReferenceType <p>Subject reference method. The availability of subjects customized via video and via images differs.</p><p>Enumeration values:</p><ul><li>video_refer: Video character subject. At this point, refer to element_video_list to define the subject appearance.</li><li>image_refer: Multi-image subject. At this point, refer to element_image_list to define the subject appearance.</li></ul>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p>Subject reference method. The availability of subjects customized via video and via images differs.</p><p>Enumeration values:</p><ul><li>video_refer: Video character subject. At this point, refer to element_video_list to define the subject appearance.</li><li>image_refer: Multi-image subject. At this point, refer to element_image_list to define the subject appearance.</li></ul>
     * @param ReferenceType <p>Subject reference method. The availability of subjects customized via video and via images differs.</p><p>Enumeration values:</p><ul><li>video_refer: Video character subject. At this point, refer to element_video_list to define the subject appearance.</li><li>image_refer: Multi-image subject. At this point, refer to element_image_list to define the subject appearance.</li></ul>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get <p>Entity timbre, bindable to existing timbres in the timbre library.</p><ul><li>If the current parameter is empty, the current entity is not bound to a timbre.</li><li>Only entities customized for video support binding timbres.</li></ul> 
     * @return ElementVoiceId <p>Entity timbre, bindable to existing timbres in the timbre library.</p><ul><li>If the current parameter is empty, the current entity is not bound to a timbre.</li><li>Only entities customized for video support binding timbres.</li></ul>
     */
    public String getElementVoiceId() {
        return this.ElementVoiceId;
    }

    /**
     * Set <p>Entity timbre, bindable to existing timbres in the timbre library.</p><ul><li>If the current parameter is empty, the current entity is not bound to a timbre.</li><li>Only entities customized for video support binding timbres.</li></ul>
     * @param ElementVoiceId <p>Entity timbre, bindable to existing timbres in the timbre library.</p><ul><li>If the current parameter is empty, the current entity is not bound to a timbre.</li><li>Only entities customized for video support binding timbres.</li></ul>
     */
    public void setElementVoiceId(String ElementVoiceId) {
        this.ElementVoiceId = ElementVoiceId;
    }

    /**
     * Get <p>Entity reference video, used to set the entity and its details via video.</p><ul><li>videos with audio can be uploaded. If the video contains voice, it triggers timbre customization (customize + add to timbre library + bind with entity).</li><li>The current parameter is required when referencing a video, and invalid when referencing an image.</li><li>Carried in key:value format, as follows:<br><pre><code>{  "refer_videos":[    {      "video_url":"video_url_1"    }  ]}</code></pre>● video format supports only MP4/MOV<br>● Only 1080p videos with duration between 3s and 8s and an aspect ratio of 16:9 or 9:16 are supported<br>● Up to 1 video can be uploaded, with a video size no more than 200MB<br>● The video_url parameter value cannot be empty</li></ul> 
     * @return ElementVideoList <p>Entity reference video, used to set the entity and its details via video.</p><ul><li>videos with audio can be uploaded. If the video contains voice, it triggers timbre customization (customize + add to timbre library + bind with entity).</li><li>The current parameter is required when referencing a video, and invalid when referencing an image.</li><li>Carried in key:value format, as follows:<br><pre><code>{  "refer_videos":[    {      "video_url":"video_url_1"    }  ]}</code></pre>● video format supports only MP4/MOV<br>● Only 1080p videos with duration between 3s and 8s and an aspect ratio of 16:9 or 9:16 are supported<br>● Up to 1 video can be uploaded, with a video size no more than 200MB<br>● The video_url parameter value cannot be empty</li></ul>
     */
    public String getElementVideoList() {
        return this.ElementVideoList;
    }

    /**
     * Set <p>Entity reference video, used to set the entity and its details via video.</p><ul><li>videos with audio can be uploaded. If the video contains voice, it triggers timbre customization (customize + add to timbre library + bind with entity).</li><li>The current parameter is required when referencing a video, and invalid when referencing an image.</li><li>Carried in key:value format, as follows:<br><pre><code>{  "refer_videos":[    {      "video_url":"video_url_1"    }  ]}</code></pre>● video format supports only MP4/MOV<br>● Only 1080p videos with duration between 3s and 8s and an aspect ratio of 16:9 or 9:16 are supported<br>● Up to 1 video can be uploaded, with a video size no more than 200MB<br>● The video_url parameter value cannot be empty</li></ul>
     * @param ElementVideoList <p>Entity reference video, used to set the entity and its details via video.</p><ul><li>videos with audio can be uploaded. If the video contains voice, it triggers timbre customization (customize + add to timbre library + bind with entity).</li><li>The current parameter is required when referencing a video, and invalid when referencing an image.</li><li>Carried in key:value format, as follows:<br><pre><code>{  "refer_videos":[    {      "video_url":"video_url_1"    }  ]}</code></pre>● video format supports only MP4/MOV<br>● Only 1080p videos with duration between 3s and 8s and an aspect ratio of 16:9 or 9:16 are supported<br>● Up to 1 video can be uploaded, with a video size no more than 200MB<br>● The video_url parameter value cannot be empty</li></ul>
     */
    public void setElementVideoList(String ElementVideoList) {
        this.ElementVideoList = ElementVideoList;
    }

    /**
     * Get <p>Subject reference image. You can set the subject and its details through multiple images.</p><ul><li>Including a front reference image and other angle or close-up reference images, where:<ul><li>At least 1 front reference image is required, defined by the frontal_image parameter.</li><li>1–3 other reference images are required. They must have differences from the front reference image and are defined by the image_url parameter.</li></ul></li><li>Carried in key:value format as follows:<br><pre><code>{  "frontal_image":"image_url_0",  "refer_images":[    {      "image_url":"image_url_1"    },    {      "image_url":"image_url_2"    },    {      "image_url":"image_url_3"    }  ]}</code></pre></li></ul> 
     * @return ElementImageList <p>Subject reference image. You can set the subject and its details through multiple images.</p><ul><li>Including a front reference image and other angle or close-up reference images, where:<ul><li>At least 1 front reference image is required, defined by the frontal_image parameter.</li><li>1–3 other reference images are required. They must have differences from the front reference image and are defined by the image_url parameter.</li></ul></li><li>Carried in key:value format as follows:<br><pre><code>{  "frontal_image":"image_url_0",  "refer_images":[    {      "image_url":"image_url_1"    },    {      "image_url":"image_url_2"    },    {      "image_url":"image_url_3"    }  ]}</code></pre></li></ul>
     */
    public String getElementImageList() {
        return this.ElementImageList;
    }

    /**
     * Set <p>Subject reference image. You can set the subject and its details through multiple images.</p><ul><li>Including a front reference image and other angle or close-up reference images, where:<ul><li>At least 1 front reference image is required, defined by the frontal_image parameter.</li><li>1–3 other reference images are required. They must have differences from the front reference image and are defined by the image_url parameter.</li></ul></li><li>Carried in key:value format as follows:<br><pre><code>{  "frontal_image":"image_url_0",  "refer_images":[    {      "image_url":"image_url_1"    },    {      "image_url":"image_url_2"    },    {      "image_url":"image_url_3"    }  ]}</code></pre></li></ul>
     * @param ElementImageList <p>Subject reference image. You can set the subject and its details through multiple images.</p><ul><li>Including a front reference image and other angle or close-up reference images, where:<ul><li>At least 1 front reference image is required, defined by the frontal_image parameter.</li><li>1–3 other reference images are required. They must have differences from the front reference image and are defined by the image_url parameter.</li></ul></li><li>Carried in key:value format as follows:<br><pre><code>{  "frontal_image":"image_url_0",  "refer_images":[    {      "image_url":"image_url_1"    },    {      "image_url":"image_url_2"    },    {      "image_url":"image_url_3"    }  ]}</code></pre></li></ul>
     */
    public void setElementImageList(String ElementImageList) {
        this.ElementImageList = ElementImageList;
    }

    /**
     * Get <p>Configure tags for a principal. A principal can be configured with multiple tags.</p><ul><li>Use key:value to carry them. Details are given below:</li></ul><p><pre><code>[  {        &quot;tag_id&quot;: &quot;o_101&quot;  }, {        &quot;tag_id&quot;: &quot;o_102&quot;    }]</code></pre></p> 
     * @return TagList <p>Configure tags for a principal. A principal can be configured with multiple tags.</p><ul><li>Use key:value to carry them. Details are given below:</li></ul><p><pre><code>[  {        &quot;tag_id&quot;: &quot;o_101&quot;  }, {        &quot;tag_id&quot;: &quot;o_102&quot;    }]</code></pre></p>
     */
    public String getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>Configure tags for a principal. A principal can be configured with multiple tags.</p><ul><li>Use key:value to carry them. Details are given below:</li></ul><p><pre><code>[  {        &quot;tag_id&quot;: &quot;o_101&quot;  }, {        &quot;tag_id&quot;: &quot;o_102&quot;    }]</code></pre></p>
     * @param TagList <p>Configure tags for a principal. A principal can be configured with multiple tags.</p><ul><li>Use key:value to carry them. Details are given below:</li></ul><p><pre><code>[  {        &quot;tag_id&quot;: &quot;o_101&quot;  }, {        &quot;tag_id&quot;: &quot;o_102&quot;    }]</code></pre></p>
     */
    public void setTagList(String TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>If the overseas custom subject library is enabled, you can pass in <code>True</code> to use it.</p><p>Enumeration values:</p><ul><li>True: Use the overseas custom subject library.</li><li>False: Do not use the overseas custom subject library.</li></ul> 
     * @return DisableModeration <p>If the overseas custom subject library is enabled, you can pass in <code>True</code> to use it.</p><p>Enumeration values:</p><ul><li>True: Use the overseas custom subject library.</li><li>False: Do not use the overseas custom subject library.</li></ul>
     */
    public String getDisableModeration() {
        return this.DisableModeration;
    }

    /**
     * Set <p>If the overseas custom subject library is enabled, you can pass in <code>True</code> to use it.</p><p>Enumeration values:</p><ul><li>True: Use the overseas custom subject library.</li><li>False: Do not use the overseas custom subject library.</li></ul>
     * @param DisableModeration <p>If the overseas custom subject library is enabled, you can pass in <code>True</code> to use it.</p><p>Enumeration values:</p><ul><li>True: Use the overseas custom subject library.</li><li>False: Do not use the overseas custom subject library.</li></ul>
     */
    public void setDisableModeration(String DisableModeration) {
        this.DisableModeration = DisableModeration;
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
     * Get <p>Source context. This is used to pass user request information. The task complete callback returns the value of this field. The maximum length is 1000 characters.</p> 
     * @return SessionContext <p>Source context. This is used to pass user request information. The task complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Source context. This is used to pass user request information. The task complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     * @param SessionContext <p>Source context. This is used to pass user request information. The task complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.</p> 
     * @return TasksPriority <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.</p>
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.</p>
     * @param TasksPriority <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.</p>
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
        if (source.DisableModeration != null) {
            this.DisableModeration = new String(source.DisableModeration);
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
        this.setParamSimple(map, prefix + "DisableModeration", this.DisableModeration);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

