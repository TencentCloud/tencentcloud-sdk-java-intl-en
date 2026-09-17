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

public class FileUploadTask extends AbstractModel {

    /**
    * 
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
    * 
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
    * 
    */
    @SerializedName("ReviewAudioVideoTaskId")
    @Expose
    private String ReviewAudioVideoTaskId;

    /**
    * 
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
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
     * Get  
     * @return ProcedureTaskId 
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * Set 
     * @param ProcedureTaskId 
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    /**
     * Get  
     * @return ReviewAudioVideoTaskId 
     */
    public String getReviewAudioVideoTaskId() {
        return this.ReviewAudioVideoTaskId;
    }

    /**
     * Set 
     * @param ReviewAudioVideoTaskId 
     */
    public void setReviewAudioVideoTaskId(String ReviewAudioVideoTaskId) {
        this.ReviewAudioVideoTaskId = ReviewAudioVideoTaskId;
    }

    /**
     * Get  
     * @return MetaData 
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 
     * @param MetaData 
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    public FileUploadTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileUploadTask(FileUploadTask source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.MediaBasicInfo != null) {
            this.MediaBasicInfo = new MediaBasicInfo(source.MediaBasicInfo);
        }
        if (source.ProcedureTaskId != null) {
            this.ProcedureTaskId = new String(source.ProcedureTaskId);
        }
        if (source.ReviewAudioVideoTaskId != null) {
            this.ReviewAudioVideoTaskId = new String(source.ReviewAudioVideoTaskId);
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
        this.setParamObj(map, prefix + "MediaBasicInfo.", this.MediaBasicInfo);
        this.setParamSimple(map, prefix + "ProcedureTaskId", this.ProcedureTaskId);
        this.setParamSimple(map, prefix + "ReviewAudioVideoTaskId", this.ReviewAudioVideoTaskId);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

