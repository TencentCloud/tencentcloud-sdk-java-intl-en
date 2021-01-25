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

public class TaskOutputMediaInfo extends AbstractModel{

    /**
    * Media file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("MediaBasicInfo")
    @Expose
    private MediaBasicInfo MediaBasicInfo;

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
     * Get  
     * @return MediaBasicInfo 
     */
    public MediaBasicInfo getMediaBasicInfo() {
        return this.MediaBasicInfo;
    }

    /**
     * Set 
     * @param MediaBasicInfo 
     */
    public void setMediaBasicInfo(MediaBasicInfo MediaBasicInfo) {
        this.MediaBasicInfo = MediaBasicInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "MediaBasicInfo.", this.MediaBasicInfo);

    }
}

