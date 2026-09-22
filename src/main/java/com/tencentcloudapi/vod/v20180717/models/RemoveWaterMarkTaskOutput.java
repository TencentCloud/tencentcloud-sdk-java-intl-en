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
    * Media file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * File type, such as mp4 and mp3.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Media file playback address.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * Filename. It can contain up to 64 characters.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Meta information, including size, duration, video stream information, and audio stream information.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * Get Media file ID. 
     * @return FileId Media file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID.
     * @param FileId Media file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get File type, such as mp4 and mp3. 
     * @return FileType File type, such as mp4 and mp3.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type, such as mp4 and mp3.
     * @param FileType File type, such as mp4 and mp3.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Media file playback address. 
     * @return FileUrl Media file playback address.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set Media file playback address.
     * @param FileUrl Media file playback address.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get Filename. It can contain up to 64 characters. 
     * @return MediaName Filename. It can contain up to 64 characters.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Filename. It can contain up to 64 characters.
     * @param MediaName Filename. It can contain up to 64 characters.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get Meta information, including size, duration, video stream information, and audio stream information. 
     * @return MetaData Meta information, including size, duration, video stream information, and audio stream information.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Meta information, including size, duration, video stream information, and audio stream information.
     * @param MetaData Meta information, including size, duration, video stream information, and audio stream information.
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

