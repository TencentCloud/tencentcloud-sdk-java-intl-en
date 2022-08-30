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

public class RemoveWaterMarkTaskOutput extends AbstractModel{

    /**
    * The file ID of the video.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * The metadata of the video, including size, duration, video stream information, and audio stream information.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * Get The file ID of the video. 
     * @return FileId The file ID of the video.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set The file ID of the video.
     * @param FileId The file ID of the video.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
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
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

