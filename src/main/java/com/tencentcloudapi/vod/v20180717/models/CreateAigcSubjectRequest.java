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

public class CreateAigcSubjectRequest extends AbstractModel {

    /**
    * <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Subject name.</p>
    */
    @SerializedName("SubjectName")
    @Expose
    private String SubjectName;

    /**
    * <p>Subject image. Upload at least 1 subject image. * Note 1: Support passing image URL (ensure it is accessible); * Note 2: Input limit of 3 images; * Note 3: Image format supports png, jpeg, jpg, webp; * Note 4: Image ratio must be less than 1:4 or 4:1; * Note 5: Image size no more than 50 MB;</p>
    */
    @SerializedName("SubjectImages")
    @Expose
    private String [] SubjectImages;

    /**
    * <p>The video reference allows uploading 1 main video.</p><ul><li>Note 1: Only the reference viduq2-pro model supports using the video subject.</li><li>Note 2: A maximum of 1 video of 5 seconds is supported.</li><li>Note 3: The video supports mp4, avi, or mov format.</li><li>Note 4: The video pixel cannot be less than 128*128, the ratio must be less than 1:4 or 4:1, and the size must be no more than 100M.</li></ul>
    */
    @SerializedName("SubjectVideos")
    @Expose
    private String [] SubjectVideos;

    /**
    * <p>Voice type Id. This information is used when creating an audio and video direct output task.</p><ul><li>Note 1: If no voice type Id is provided when generating an audio and video direct output task, the system will automatically recommend a voice type.</li><li>Note 2: Voice type Id cannot be used in q2-pro.</li></ul>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

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
    * <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Subject name.</p> 
     * @return SubjectName <p>Subject name.</p>
     */
    public String getSubjectName() {
        return this.SubjectName;
    }

    /**
     * Set <p>Subject name.</p>
     * @param SubjectName <p>Subject name.</p>
     */
    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    /**
     * Get <p>Subject image. Upload at least 1 subject image. * Note 1: Support passing image URL (ensure it is accessible); * Note 2: Input limit of 3 images; * Note 3: Image format supports png, jpeg, jpg, webp; * Note 4: Image ratio must be less than 1:4 or 4:1; * Note 5: Image size no more than 50 MB;</p> 
     * @return SubjectImages <p>Subject image. Upload at least 1 subject image. * Note 1: Support passing image URL (ensure it is accessible); * Note 2: Input limit of 3 images; * Note 3: Image format supports png, jpeg, jpg, webp; * Note 4: Image ratio must be less than 1:4 or 4:1; * Note 5: Image size no more than 50 MB;</p>
     */
    public String [] getSubjectImages() {
        return this.SubjectImages;
    }

    /**
     * Set <p>Subject image. Upload at least 1 subject image. * Note 1: Support passing image URL (ensure it is accessible); * Note 2: Input limit of 3 images; * Note 3: Image format supports png, jpeg, jpg, webp; * Note 4: Image ratio must be less than 1:4 or 4:1; * Note 5: Image size no more than 50 MB;</p>
     * @param SubjectImages <p>Subject image. Upload at least 1 subject image. * Note 1: Support passing image URL (ensure it is accessible); * Note 2: Input limit of 3 images; * Note 3: Image format supports png, jpeg, jpg, webp; * Note 4: Image ratio must be less than 1:4 or 4:1; * Note 5: Image size no more than 50 MB;</p>
     */
    public void setSubjectImages(String [] SubjectImages) {
        this.SubjectImages = SubjectImages;
    }

    /**
     * Get <p>The video reference allows uploading 1 main video.</p><ul><li>Note 1: Only the reference viduq2-pro model supports using the video subject.</li><li>Note 2: A maximum of 1 video of 5 seconds is supported.</li><li>Note 3: The video supports mp4, avi, or mov format.</li><li>Note 4: The video pixel cannot be less than 128*128, the ratio must be less than 1:4 or 4:1, and the size must be no more than 100M.</li></ul> 
     * @return SubjectVideos <p>The video reference allows uploading 1 main video.</p><ul><li>Note 1: Only the reference viduq2-pro model supports using the video subject.</li><li>Note 2: A maximum of 1 video of 5 seconds is supported.</li><li>Note 3: The video supports mp4, avi, or mov format.</li><li>Note 4: The video pixel cannot be less than 128*128, the ratio must be less than 1:4 or 4:1, and the size must be no more than 100M.</li></ul>
     */
    public String [] getSubjectVideos() {
        return this.SubjectVideos;
    }

    /**
     * Set <p>The video reference allows uploading 1 main video.</p><ul><li>Note 1: Only the reference viduq2-pro model supports using the video subject.</li><li>Note 2: A maximum of 1 video of 5 seconds is supported.</li><li>Note 3: The video supports mp4, avi, or mov format.</li><li>Note 4: The video pixel cannot be less than 128*128, the ratio must be less than 1:4 or 4:1, and the size must be no more than 100M.</li></ul>
     * @param SubjectVideos <p>The video reference allows uploading 1 main video.</p><ul><li>Note 1: Only the reference viduq2-pro model supports using the video subject.</li><li>Note 2: A maximum of 1 video of 5 seconds is supported.</li><li>Note 3: The video supports mp4, avi, or mov format.</li><li>Note 4: The video pixel cannot be less than 128*128, the ratio must be less than 1:4 or 4:1, and the size must be no more than 100M.</li></ul>
     */
    public void setSubjectVideos(String [] SubjectVideos) {
        this.SubjectVideos = SubjectVideos;
    }

    /**
     * Get <p>Voice type Id. This information is used when creating an audio and video direct output task.</p><ul><li>Note 1: If no voice type Id is provided when generating an audio and video direct output task, the system will automatically recommend a voice type.</li><li>Note 2: Voice type Id cannot be used in q2-pro.</li></ul> 
     * @return VoiceId <p>Voice type Id. This information is used when creating an audio and video direct output task.</p><ul><li>Note 1: If no voice type Id is provided when generating an audio and video direct output task, the system will automatically recommend a voice type.</li><li>Note 2: Voice type Id cannot be used in q2-pro.</li></ul>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Voice type Id. This information is used when creating an audio and video direct output task.</p><ul><li>Note 1: If no voice type Id is provided when generating an audio and video direct output task, the system will automatically recommend a voice type.</li><li>Note 2: Voice type Id cannot be used in q2-pro.</li></ul>
     * @param VoiceId <p>Voice type Id. This information is used when creating an audio and video direct output task.</p><ul><li>Note 1: If no voice type Id is provided when generating an audio and video direct output task, the system will automatically recommend a voice type.</li><li>Note 2: Voice type Id cannot be used in q2-pro.</li></ul>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
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

    public CreateAigcSubjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcSubjectRequest(CreateAigcSubjectRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.SubjectName != null) {
            this.SubjectName = new String(source.SubjectName);
        }
        if (source.SubjectImages != null) {
            this.SubjectImages = new String[source.SubjectImages.length];
            for (int i = 0; i < source.SubjectImages.length; i++) {
                this.SubjectImages[i] = new String(source.SubjectImages[i]);
            }
        }
        if (source.SubjectVideos != null) {
            this.SubjectVideos = new String[source.SubjectVideos.length];
            for (int i = 0; i < source.SubjectVideos.length; i++) {
                this.SubjectVideos[i] = new String(source.SubjectVideos[i]);
            }
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
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
        this.setParamSimple(map, prefix + "SubjectName", this.SubjectName);
        this.setParamArraySimple(map, prefix + "SubjectImages.", this.SubjectImages);
        this.setParamArraySimple(map, prefix + "SubjectVideos.", this.SubjectVideos);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

