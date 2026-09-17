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

public class SceneAigcImageOutputConfig extends AbstractModel {

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
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 
    */
    @SerializedName("EncodeConfig")
    @Expose
    private ImageSceneAigcEncodeConfig EncodeConfig;

    /**
    * 
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * 
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * 
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

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
     * @return AspectRatio 
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 
     * @param AspectRatio 
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get  
     * @return EncodeConfig 
     */
    public ImageSceneAigcEncodeConfig getEncodeConfig() {
        return this.EncodeConfig;
    }

    /**
     * Set 
     * @param EncodeConfig 
     */
    public void setEncodeConfig(ImageSceneAigcEncodeConfig EncodeConfig) {
        this.EncodeConfig = EncodeConfig;
    }

    /**
     * Get  
     * @return ImageWidth 
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set 
     * @param ImageWidth 
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get  
     * @return ImageHeight 
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set 
     * @param ImageHeight 
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get  
     * @return Resolution 
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 
     * @param Resolution 
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public SceneAigcImageOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcImageOutputConfig(SceneAigcImageOutputConfig source) {
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
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.EncodeConfig != null) {
            this.EncodeConfig = new ImageSceneAigcEncodeConfig(source.EncodeConfig);
        }
        if (source.ImageWidth != null) {
            this.ImageWidth = new Long(source.ImageWidth);
        }
        if (source.ImageHeight != null) {
            this.ImageHeight = new Long(source.ImageHeight);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
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
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamObj(map, prefix + "EncodeConfig.", this.EncodeConfig);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

