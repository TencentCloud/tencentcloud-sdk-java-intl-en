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

public class RemoveWaterMarkTaskOutput extends AbstractModel {

    /**
    * The file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * The file type, such as MP4 or MP3.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * The playback URL of the output file.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * The filename, which can be up to 64 characters long.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * The metadata of the video, including size, duration, video stream information, and audio stream information.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * Get The file ID. 
     * @return FileId The file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set The file ID.
     * @param FileId The file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get The file type, such as MP4 or MP3. 
     * @return FileType The file type, such as MP4 or MP3.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set The file type, such as MP4 or MP3.
     * @param FileType The file type, such as MP4 or MP3.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get The playback URL of the output file. 
     * @return FileUrl The playback URL of the output file.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set The playback URL of the output file.
     * @param FileUrl The playback URL of the output file.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get The filename, which can be up to 64 characters long. 
     * @return MediaName The filename, which can be up to 64 characters long.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set The filename, which can be up to 64 characters long.
     * @param MediaName The filename, which can be up to 64 characters long.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get The metadata of the video, including size, duration, video stream information, and audio stream information. 
     * @return MetaData The metadata of the video, including size, duration, video stream information, and audio stream information.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set The metadata of the video, including size, duration, video stream information, and audio stream information.
     * @param MetaData The metadata of the video, including size, duration, video stream information, and audio stream information.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    public RemoveWaterMarkTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveWaterMarkTaskOutput(RemoveWaterMarkTaskOutput source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

