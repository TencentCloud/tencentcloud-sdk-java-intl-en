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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaImageSpriteItem extends AbstractModel {

    /**
    * Sprite sheet specification, please refer to the [Sprite Sheet Parameter Template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Height of small images in sprite sheet.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Width of small images in sprite sheet.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Number of small images in each sprite sheet.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Path of each sprite sheet.
    */
    @SerializedName("ImagePathSet")
    @Expose
    private String [] ImagePathSet;

    /**
    * 
    */
    @SerializedName("WebVttPath")
    @Expose
    private String WebVttPath;

    /**
    * Storage location of the sprite sheet file.
    */
    @SerializedName("Storage")
    @Expose
    private TaskOutputStorage Storage;

    /**
     * Get Sprite sheet specification, please refer to the [Sprite Sheet Parameter Template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF). 
     * @return Definition Sprite sheet specification, please refer to the [Sprite Sheet Parameter Template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Sprite sheet specification, please refer to the [Sprite Sheet Parameter Template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     * @param Definition Sprite sheet specification, please refer to the [Sprite Sheet Parameter Template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Height of small images in sprite sheet. 
     * @return Height Height of small images in sprite sheet.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of small images in sprite sheet.
     * @param Height Height of small images in sprite sheet.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Width of small images in sprite sheet. 
     * @return Width Width of small images in sprite sheet.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width of small images in sprite sheet.
     * @param Width Width of small images in sprite sheet.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Number of small images in each sprite sheet. 
     * @return TotalCount Number of small images in each sprite sheet.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of small images in each sprite sheet.
     * @param TotalCount Number of small images in each sprite sheet.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Path of each sprite sheet. 
     * @return ImagePathSet Path of each sprite sheet.
     */
    public String [] getImagePathSet() {
        return this.ImagePathSet;
    }

    /**
     * Set Path of each sprite sheet.
     * @param ImagePathSet Path of each sprite sheet.
     */
    public void setImagePathSet(String [] ImagePathSet) {
        this.ImagePathSet = ImagePathSet;
    }

    /**
     * Get  
     * @return WebVttPath 
     */
    public String getWebVttPath() {
        return this.WebVttPath;
    }

    /**
     * Set 
     * @param WebVttPath 
     */
    public void setWebVttPath(String WebVttPath) {
        this.WebVttPath = WebVttPath;
    }

    /**
     * Get Storage location of the sprite sheet file. 
     * @return Storage Storage location of the sprite sheet file.
     */
    public TaskOutputStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage location of the sprite sheet file.
     * @param Storage Storage location of the sprite sheet file.
     */
    public void setStorage(TaskOutputStorage Storage) {
        this.Storage = Storage;
    }

    public MediaImageSpriteItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaImageSpriteItem(MediaImageSpriteItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ImagePathSet != null) {
            this.ImagePathSet = new String[source.ImagePathSet.length];
            for (int i = 0; i < source.ImagePathSet.length; i++) {
                this.ImagePathSet[i] = new String(source.ImagePathSet[i]);
            }
        }
        if (source.WebVttPath != null) {
            this.WebVttPath = new String(source.WebVttPath);
        }
        if (source.Storage != null) {
            this.Storage = new TaskOutputStorage(source.Storage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "ImagePathSet.", this.ImagePathSet);
        this.setParamSimple(map, prefix + "WebVttPath", this.WebVttPath);
        this.setParamObj(map, prefix + "Storage.", this.Storage);

    }
}

