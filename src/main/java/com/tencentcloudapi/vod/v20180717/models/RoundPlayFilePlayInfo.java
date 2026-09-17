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

public class RoundPlayFilePlayInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("StartPlayTime")
    @Expose
    private String StartPlayTime;

    /**
    * 
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
     * Get  
     * @return ItemId 
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 
     * @param ItemId 
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

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
     * @return StartPlayTime 
     */
    public String getStartPlayTime() {
        return this.StartPlayTime;
    }

    /**
     * Set 
     * @param StartPlayTime 
     */
    public void setStartPlayTime(String StartPlayTime) {
        this.StartPlayTime = StartPlayTime;
    }

    /**
     * Get  
     * @return Duration 
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 
     * @param Duration 
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get  
     * @return Progress 
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 
     * @param Progress 
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    public RoundPlayFilePlayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoundPlayFilePlayInfo(RoundPlayFilePlayInfo source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.StartPlayTime != null) {
            this.StartPlayTime = new String(source.StartPlayTime);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "StartPlayTime", this.StartPlayTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

