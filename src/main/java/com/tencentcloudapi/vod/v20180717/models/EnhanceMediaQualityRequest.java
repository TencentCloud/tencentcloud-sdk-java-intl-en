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

public class EnhanceMediaQualityRequest extends AbstractModel {

    /**
    * Audio-visual quality rebirth template ID.
For typical usage scenarios, VOD provides multiple preset templates (https://www.tencentcloud.com/document/product/266/102586?from_cn_redirect=1#50604b3f-0286-4a10-a3f7-18218116aff7).
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the video upload completion event notification (https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or the VOD console (https://console.cloud.tencent.com/vod/media).
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
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, when accessing resources in VOD applications (whether the default application or a newly created application), this field must be set to the app ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Media file configuration after audio and video quality revival.
    */
    @SerializedName("OutputConfig")
    @Expose
    private EnhanceMediaQualityOutputConfig OutputConfig;

    /**
    * An identifier for deduplication. If there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, used to pass through user request information. The audio and video quality revival completion callback will return the value of this field. Maximum length: 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
     * Get Audio-visual quality rebirth template ID.
For typical usage scenarios, VOD provides multiple preset templates (https://www.tencentcloud.com/document/product/266/102586?from_cn_redirect=1#50604b3f-0286-4a10-a3f7-18218116aff7). 
     * @return Definition Audio-visual quality rebirth template ID.
For typical usage scenarios, VOD provides multiple preset templates (https://www.tencentcloud.com/document/product/266/102586?from_cn_redirect=1#50604b3f-0286-4a10-a3f7-18218116aff7).
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Audio-visual quality rebirth template ID.
For typical usage scenarios, VOD provides multiple preset templates (https://www.tencentcloud.com/document/product/266/102586?from_cn_redirect=1#50604b3f-0286-4a10-a3f7-18218116aff7).
     * @param Definition Audio-visual quality rebirth template ID.
For typical usage scenarios, VOD provides multiple preset templates (https://www.tencentcloud.com/document/product/266/102586?from_cn_redirect=1#50604b3f-0286-4a10-a3f7-18218116aff7).
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the video upload completion event notification (https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or the VOD console (https://console.cloud.tencent.com/vod/media). 
     * @return FileId Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the video upload completion event notification (https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or the VOD console (https://console.cloud.tencent.com/vod/media).
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the video upload completion event notification (https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or the VOD console (https://console.cloud.tencent.com/vod/media).
     * @param FileId Media file ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the video upload completion event notification (https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or the VOD console (https://console.cloud.tencent.com/vod/media).
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
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, when accessing resources in VOD applications (whether the default application or a newly created application), this field must be set to the app ID.</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, when accessing resources in VOD applications (whether the default application or a newly created application), this field must be set to the app ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, when accessing resources in VOD applications (whether the default application or a newly created application), this field must be set to the app ID.</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, when accessing resources in VOD applications (whether the default application or a newly created application), this field must be set to the app ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Media file configuration after audio and video quality revival. 
     * @return OutputConfig Media file configuration after audio and video quality revival.
     */
    public EnhanceMediaQualityOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Media file configuration after audio and video quality revival.
     * @param OutputConfig Media file configuration after audio and video quality revival.
     */
    public void setOutputConfig(EnhanceMediaQualityOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
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
     * Get Source context, used to pass through user request information. The audio and video quality revival completion callback will return the value of this field. Maximum length: 1000 characters. 
     * @return SessionContext Source context, used to pass through user request information. The audio and video quality revival completion callback will return the value of this field. Maximum length: 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, used to pass through user request information. The audio and video quality revival completion callback will return the value of this field. Maximum length: 1000 characters.
     * @param SessionContext Source context, used to pass through user request information. The audio and video quality revival completion callback will return the value of this field. Maximum length: 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0. 
     * @return TasksPriority Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.
     * @param TasksPriority Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If this is not specified, the default value is 0.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    public EnhanceMediaQualityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnhanceMediaQualityRequest(EnhanceMediaQualityRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.MediaStoragePath != null) {
            this.MediaStoragePath = new String(source.MediaStoragePath);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new EnhanceMediaQualityOutputConfig(source.OutputConfig);
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
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "MediaStoragePath", this.MediaStoragePath);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

