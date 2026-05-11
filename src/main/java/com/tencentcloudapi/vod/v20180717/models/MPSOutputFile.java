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

public class MPSOutputFile extends AbstractModel {

    /**
    * File type. Used to identify specific return files in the execution result of an MPS video processing task.
Value: <li>AiAnalysis.DeLogo.Video: The erased video file generated in the intelligent erasure task, stored in the original file type by default;</li> <li>AiAnalysis.DeLogo.OriginSubtitle: The subtitle file extracted from video in the intelligent erasure task;</li> <li>AiAnalysis.DeLogo.TranslateSubtitle: The translation file of subtitles extracted from video in the intelligent erasure task.</li> <li>MediaProcess.Transcode.Video: The enhanced audio and video file in the audio and video enhancement task, stored in the transcoded file type by default.</li>
<li>AiAnalysis.HorizontalToVerticalTask.Video: The generated video file in the horizontal to vertical task is stored as an intelligent media type by default.</li>
<li>AiAnalysis.VideoRemakeTaskk.Video: The generated video file in the intelligent deduplication task, stored as an intelligent media type by default.</li>
<li>AiAnalysis.SegmentTask.Video: Generated video file in the intelligent video splitting task, stored as intelligent media type by default.</li>
<li>SmartErase.Video: Generated video file in the intelligent erasure task, stored as intelligent media type by default.</li>

    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Storage format. To represent the storage format of the result file. Valid values: <li>Permanent: permanent storage;</li> <li>Temporary: temporary storage.</li>
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * Media file ID. Valid when Type is Permanent, indicating that the result file is stored as a media asset on the VOD platform, with the field value being the FileId of the media asset.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Downloadable Url of the result file.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Transcoding specification ID. Valid when FileType equals MediaProcess.Transcode.Video. A value of 0 means the original file.
    */
    @SerializedName("Definition")
    @Expose
    private String Definition;

    /**
    * Expiration time. Valid when StorageMode is Temporary, indicates the expiry date of the Url, in seconds.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
     * Get File type. Used to identify specific return files in the execution result of an MPS video processing task.
Value: <li>AiAnalysis.DeLogo.Video: The erased video file generated in the intelligent erasure task, stored in the original file type by default;</li> <li>AiAnalysis.DeLogo.OriginSubtitle: The subtitle file extracted from video in the intelligent erasure task;</li> <li>AiAnalysis.DeLogo.TranslateSubtitle: The translation file of subtitles extracted from video in the intelligent erasure task.</li> <li>MediaProcess.Transcode.Video: The enhanced audio and video file in the audio and video enhancement task, stored in the transcoded file type by default.</li>
<li>AiAnalysis.HorizontalToVerticalTask.Video: The generated video file in the horizontal to vertical task is stored as an intelligent media type by default.</li>
<li>AiAnalysis.VideoRemakeTaskk.Video: The generated video file in the intelligent deduplication task, stored as an intelligent media type by default.</li>
<li>AiAnalysis.SegmentTask.Video: Generated video file in the intelligent video splitting task, stored as intelligent media type by default.</li>
<li>SmartErase.Video: Generated video file in the intelligent erasure task, stored as intelligent media type by default.</li>
 
     * @return FileType File type. Used to identify specific return files in the execution result of an MPS video processing task.
Value: <li>AiAnalysis.DeLogo.Video: The erased video file generated in the intelligent erasure task, stored in the original file type by default;</li> <li>AiAnalysis.DeLogo.OriginSubtitle: The subtitle file extracted from video in the intelligent erasure task;</li> <li>AiAnalysis.DeLogo.TranslateSubtitle: The translation file of subtitles extracted from video in the intelligent erasure task.</li> <li>MediaProcess.Transcode.Video: The enhanced audio and video file in the audio and video enhancement task, stored in the transcoded file type by default.</li>
<li>AiAnalysis.HorizontalToVerticalTask.Video: The generated video file in the horizontal to vertical task is stored as an intelligent media type by default.</li>
<li>AiAnalysis.VideoRemakeTaskk.Video: The generated video file in the intelligent deduplication task, stored as an intelligent media type by default.</li>
<li>AiAnalysis.SegmentTask.Video: Generated video file in the intelligent video splitting task, stored as intelligent media type by default.</li>
<li>SmartErase.Video: Generated video file in the intelligent erasure task, stored as intelligent media type by default.</li>

     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type. Used to identify specific return files in the execution result of an MPS video processing task.
Value: <li>AiAnalysis.DeLogo.Video: The erased video file generated in the intelligent erasure task, stored in the original file type by default;</li> <li>AiAnalysis.DeLogo.OriginSubtitle: The subtitle file extracted from video in the intelligent erasure task;</li> <li>AiAnalysis.DeLogo.TranslateSubtitle: The translation file of subtitles extracted from video in the intelligent erasure task.</li> <li>MediaProcess.Transcode.Video: The enhanced audio and video file in the audio and video enhancement task, stored in the transcoded file type by default.</li>
<li>AiAnalysis.HorizontalToVerticalTask.Video: The generated video file in the horizontal to vertical task is stored as an intelligent media type by default.</li>
<li>AiAnalysis.VideoRemakeTaskk.Video: The generated video file in the intelligent deduplication task, stored as an intelligent media type by default.</li>
<li>AiAnalysis.SegmentTask.Video: Generated video file in the intelligent video splitting task, stored as intelligent media type by default.</li>
<li>SmartErase.Video: Generated video file in the intelligent erasure task, stored as intelligent media type by default.</li>

     * @param FileType File type. Used to identify specific return files in the execution result of an MPS video processing task.
Value: <li>AiAnalysis.DeLogo.Video: The erased video file generated in the intelligent erasure task, stored in the original file type by default;</li> <li>AiAnalysis.DeLogo.OriginSubtitle: The subtitle file extracted from video in the intelligent erasure task;</li> <li>AiAnalysis.DeLogo.TranslateSubtitle: The translation file of subtitles extracted from video in the intelligent erasure task.</li> <li>MediaProcess.Transcode.Video: The enhanced audio and video file in the audio and video enhancement task, stored in the transcoded file type by default.</li>
<li>AiAnalysis.HorizontalToVerticalTask.Video: The generated video file in the horizontal to vertical task is stored as an intelligent media type by default.</li>
<li>AiAnalysis.VideoRemakeTaskk.Video: The generated video file in the intelligent deduplication task, stored as an intelligent media type by default.</li>
<li>AiAnalysis.SegmentTask.Video: Generated video file in the intelligent video splitting task, stored as intelligent media type by default.</li>
<li>SmartErase.Video: Generated video file in the intelligent erasure task, stored as intelligent media type by default.</li>

     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Storage format. To represent the storage format of the result file. Valid values: <li>Permanent: permanent storage;</li> <li>Temporary: temporary storage.</li> 
     * @return StorageMode Storage format. To represent the storage format of the result file. Valid values: <li>Permanent: permanent storage;</li> <li>Temporary: temporary storage.</li>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set Storage format. To represent the storage format of the result file. Valid values: <li>Permanent: permanent storage;</li> <li>Temporary: temporary storage.</li>
     * @param StorageMode Storage format. To represent the storage format of the result file. Valid values: <li>Permanent: permanent storage;</li> <li>Temporary: temporary storage.</li>
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get Media file ID. Valid when Type is Permanent, indicating that the result file is stored as a media asset on the VOD platform, with the field value being the FileId of the media asset. 
     * @return FileId Media file ID. Valid when Type is Permanent, indicating that the result file is stored as a media asset on the VOD platform, with the field value being the FileId of the media asset.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID. Valid when Type is Permanent, indicating that the result file is stored as a media asset on the VOD platform, with the field value being the FileId of the media asset.
     * @param FileId Media file ID. Valid when Type is Permanent, indicating that the result file is stored as a media asset on the VOD platform, with the field value being the FileId of the media asset.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Downloadable Url of the result file. 
     * @return Url Downloadable Url of the result file.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Downloadable Url of the result file.
     * @param Url Downloadable Url of the result file.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Transcoding specification ID. Valid when FileType equals MediaProcess.Transcode.Video. A value of 0 means the original file. 
     * @return Definition Transcoding specification ID. Valid when FileType equals MediaProcess.Transcode.Video. A value of 0 means the original file.
     */
    public String getDefinition() {
        return this.Definition;
    }

    /**
     * Set Transcoding specification ID. Valid when FileType equals MediaProcess.Transcode.Video. A value of 0 means the original file.
     * @param Definition Transcoding specification ID. Valid when FileType equals MediaProcess.Transcode.Video. A value of 0 means the original file.
     */
    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Expiration time. Valid when StorageMode is Temporary, indicates the expiry date of the Url, in seconds. 
     * @return ExpiredTime Expiration time. Valid when StorageMode is Temporary, indicates the expiry date of the Url, in seconds.
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration time. Valid when StorageMode is Temporary, indicates the expiry date of the Url, in seconds.
     * @param ExpiredTime Expiration time. Valid when StorageMode is Temporary, indicates the expiry date of the Url, in seconds.
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public MPSOutputFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSOutputFile(MPSOutputFile source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Definition != null) {
            this.Definition = new String(source.Definition);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

