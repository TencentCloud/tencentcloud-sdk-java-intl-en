/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileUploadTask extends AbstractModel{

    /**
    * Unique file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Basic information of media file generated after upload is completed.
    */
    @SerializedName("MediaBasicInfo")
    @Expose
    private MediaBasicInfo MediaBasicInfo;

    /**
    * If a video processing flow is specified when a video is uploaded, this field will be the ID of the task flow.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
    * Metadata, such as size, duration, video stream information, audio stream information, etc.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * Get Unique file ID. 
     * @return FileId Unique file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Unique file ID.
     * @param FileId Unique file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Basic information of media file generated after upload is completed. 
     * @return MediaBasicInfo Basic information of media file generated after upload is completed.
     */
    public MediaBasicInfo getMediaBasicInfo() {
        return this.MediaBasicInfo;
    }

    /**
     * Set Basic information of media file generated after upload is completed.
     * @param MediaBasicInfo Basic information of media file generated after upload is completed.
     */
    public void setMediaBasicInfo(MediaBasicInfo MediaBasicInfo) {
        this.MediaBasicInfo = MediaBasicInfo;
    }

    /**
     * Get If a video processing flow is specified when a video is uploaded, this field will be the ID of the task flow.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProcedureTaskId If a video processing flow is specified when a video is uploaded, this field will be the ID of the task flow.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * Set If a video processing flow is specified when a video is uploaded, this field will be the ID of the task flow.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProcedureTaskId If a video processing flow is specified when a video is uploaded, this field will be the ID of the task flow.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    /**
     * Get Metadata, such as size, duration, video stream information, audio stream information, etc.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MetaData Metadata, such as size, duration, video stream information, audio stream information, etc.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Metadata, such as size, duration, video stream information, audio stream information, etc.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MetaData Metadata, such as size, duration, video stream information, audio stream information, etc.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "MediaBasicInfo.", this.MediaBasicInfo);
        this.setParamSimple(map, prefix + "ProcedureTaskId", this.ProcedureTaskId);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

