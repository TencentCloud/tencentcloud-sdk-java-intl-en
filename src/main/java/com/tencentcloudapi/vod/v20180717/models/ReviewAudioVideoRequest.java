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

public class ReviewAudioVideoRequest extends AbstractModel {

    /**
    * Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after a successful upload. You can obtain this field in the video upload completion event notification (https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or the VOD console (https://console.cloud.tencent.com/vod/media).
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Media storage path.
Only sub-apps in [FileID + Path mode](https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1) can initiate tasks through MediaStoragePath.
Either FileId or MediaStoragePath must be provided.
    */
    @SerializedName("MediaStoragePath")
    @Expose
    private String MediaStoragePath;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Content to review. Optional values:
<li>Media: original audio/video;</li>
<li>Cover: cover.</li>
If this parameter is not specified or is set to an empty array, Media will be reviewed by default.
    */
    @SerializedName("ReviewContents")
    @Expose
    private String [] ReviewContents;

    /**
    * Content Review Template ID. Default value: 10. Value range:
<li>10: [Preset template](https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1#.E9.A2.84.E7.BD.AE.E9.9F.B3.E8.A7.86.E9.A2.91.E5.AE.A1.E6.A0.B8.E6.A8.A1.E6.9D.BF.5B.5D(id.3Averify)), supports detecting violation labels including Porn, Terror, Polity, and Moan.</li>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * Source context, used to pass through user request information. The value of this field will be returned in the audio/video moderation completed callback. Maximum length: 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * An identifier for deduplication. If there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Reserved field, used for special purposes.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after a successful upload. You can obtain this field in the video upload completion event notification (https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or the VOD console (https://console.cloud.tencent.com/vod/media). 
     * @return FileId Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after a successful upload. You can obtain this field in the video upload completion event notification (https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or the VOD console (https://console.cloud.tencent.com/vod/media).
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after a successful upload. You can obtain this field in the video upload completion event notification (https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or the VOD console (https://console.cloud.tencent.com/vod/media).
     * @param FileId Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after a successful upload. You can obtain this field in the video upload completion event notification (https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or the VOD console (https://console.cloud.tencent.com/vod/media).
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Media storage path.
Only sub-apps in [FileID + Path mode](https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1) can initiate tasks through MediaStoragePath.
Either FileId or MediaStoragePath must be provided. 
     * @return MediaStoragePath Media storage path.
Only sub-apps in [FileID + Path mode](https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1) can initiate tasks through MediaStoragePath.
Either FileId or MediaStoragePath must be provided.
     */
    public String getMediaStoragePath() {
        return this.MediaStoragePath;
    }

    /**
     * Set Media storage path.
Only sub-apps in [FileID + Path mode](https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1) can initiate tasks through MediaStoragePath.
Either FileId or MediaStoragePath must be provided.
     * @param MediaStoragePath Media storage path.
Only sub-apps in [FileID + Path mode](https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1) can initiate tasks through MediaStoragePath.
Either FileId or MediaStoragePath must be provided.
     */
    public void setMediaStoragePath(String MediaStoragePath) {
        this.MediaStoragePath = MediaStoragePath;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Content to review. Optional values:
<li>Media: original audio/video;</li>
<li>Cover: cover.</li>
If this parameter is not specified or is set to an empty array, Media will be reviewed by default. 
     * @return ReviewContents Content to review. Optional values:
<li>Media: original audio/video;</li>
<li>Cover: cover.</li>
If this parameter is not specified or is set to an empty array, Media will be reviewed by default.
     */
    public String [] getReviewContents() {
        return this.ReviewContents;
    }

    /**
     * Set Content to review. Optional values:
<li>Media: original audio/video;</li>
<li>Cover: cover.</li>
If this parameter is not specified or is set to an empty array, Media will be reviewed by default.
     * @param ReviewContents Content to review. Optional values:
<li>Media: original audio/video;</li>
<li>Cover: cover.</li>
If this parameter is not specified or is set to an empty array, Media will be reviewed by default.
     */
    public void setReviewContents(String [] ReviewContents) {
        this.ReviewContents = ReviewContents;
    }

    /**
     * Get Content Review Template ID. Default value: 10. Value range:
<li>10: [Preset template](https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1#.E9.A2.84.E7.BD.AE.E9.9F.B3.E8.A7.86.E9.A2.91.E5.AE.A1.E6.A0.B8.E6.A8.A1.E6.9D.BF.5B.5D(id.3Averify)), supports detecting violation labels including Porn, Terror, Polity, and Moan.</li> 
     * @return Definition Content Review Template ID. Default value: 10. Value range:
<li>10: [Preset template](https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1#.E9.A2.84.E7.BD.AE.E9.9F.B3.E8.A7.86.E9.A2.91.E5.AE.A1.E6.A0.B8.E6.A8.A1.E6.9D.BF.5B.5D(id.3Averify)), supports detecting violation labels including Porn, Terror, Polity, and Moan.</li>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Content Review Template ID. Default value: 10. Value range:
<li>10: [Preset template](https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1#.E9.A2.84.E7.BD.AE.E9.9F.B3.E8.A7.86.E9.A2.91.E5.AE.A1.E6.A0.B8.E6.A8.A1.E6.9D.BF.5B.5D(id.3Averify)), supports detecting violation labels including Porn, Terror, Polity, and Moan.</li>
     * @param Definition Content Review Template ID. Default value: 10. Value range:
<li>10: [Preset template](https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1#.E9.A2.84.E7.BD.AE.E9.9F.B3.E8.A7.86.E9.A2.91.E5.AE.A1.E6.A0.B8.E6.A8.A1.E6.9D.BF.5B.5D(id.3Averify)), supports detecting violation labels including Porn, Terror, Polity, and Moan.</li>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0. 
     * @return TasksPriority Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     * @param TasksPriority Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get Source context, used to pass through user request information. The value of this field will be returned in the audio/video moderation completed callback. Maximum length: 1000 characters. 
     * @return SessionContext Source context, used to pass through user request information. The value of this field will be returned in the audio/video moderation completed callback. Maximum length: 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, used to pass through user request information. The value of this field will be returned in the audio/video moderation completed callback. Maximum length: 1000 characters.
     * @param SessionContext Source context, used to pass through user request information. The value of this field will be returned in the audio/video moderation completed callback. Maximum length: 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get An identifier for deduplication. If there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required. 
     * @return SessionId An identifier for deduplication. If there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set An identifier for deduplication. If there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     * @param SessionId An identifier for deduplication. If there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Reserved field, used for special purposes. 
     * @return ExtInfo Reserved field, used for special purposes.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Reserved field, used for special purposes.
     * @param ExtInfo Reserved field, used for special purposes.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public ReviewAudioVideoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewAudioVideoRequest(ReviewAudioVideoRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.MediaStoragePath != null) {
            this.MediaStoragePath = new String(source.MediaStoragePath);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ReviewContents != null) {
            this.ReviewContents = new String[source.ReviewContents.length];
            for (int i = 0; i < source.ReviewContents.length; i++) {
                this.ReviewContents[i] = new String(source.ReviewContents[i]);
            }
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "MediaStoragePath", this.MediaStoragePath);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "ReviewContents.", this.ReviewContents);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

