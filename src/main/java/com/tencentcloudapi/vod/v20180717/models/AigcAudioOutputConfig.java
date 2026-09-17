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

public class AigcAudioOutputConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * 
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * 
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 
    */
    @SerializedName("OutputAudioFormat")
    @Expose
    private String OutputAudioFormat;

    /**
     * Get  
     * @return StorageMode 
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set 
     * @param StorageMode 
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get  
     * @return MediaName 
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set 
     * @param MediaName 
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get  
     * @return ClassId 
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 
     * @param ClassId 
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get  
     * @return ExpireTime 
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 
     * @param ExpireTime 
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get  
     * @return Duration 
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 
     * @param Duration 
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get  
     * @return OutputAudioFormat 
     */
    public String getOutputAudioFormat() {
        return this.OutputAudioFormat;
    }

    /**
     * Set 
     * @param OutputAudioFormat 
     */
    public void setOutputAudioFormat(String OutputAudioFormat) {
        this.OutputAudioFormat = OutputAudioFormat;
    }

    public AigcAudioOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcAudioOutputConfig(AigcAudioOutputConfig source) {
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.OutputAudioFormat != null) {
            this.OutputAudioFormat = new String(source.OutputAudioFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "OutputAudioFormat", this.OutputAudioFormat);

    }
}

