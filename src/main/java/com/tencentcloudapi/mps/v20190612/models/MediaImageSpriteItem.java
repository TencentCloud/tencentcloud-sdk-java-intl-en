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
    * Sprite screenshot specification. See [sprite sheet parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Height of small images in sprite image.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Width of a small image in the sprite sheet.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Number of small images in each sprite image.
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
    * Path of the WebVtt file that describes the temporal relationship between sprite sub-images and their positions. The WebVtt file indicates the time point corresponding to each sprite sub-image and its coordinate position in the sprite sheet. It is generally used by the player to implement preview.
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
     * Get Sprite screenshot specification. See [sprite sheet parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF). 
     * @return Definition Sprite screenshot specification. See [sprite sheet parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Sprite screenshot specification. See [sprite sheet parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     * @param Definition Sprite screenshot specification. See [sprite sheet parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Height of small images in sprite image. 
     * @return Height Height of small images in sprite image.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of small images in sprite image.
     * @param Height Height of small images in sprite image.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Width of a small image in the sprite sheet. 
     * @return Width Width of a small image in the sprite sheet.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width of a small image in the sprite sheet.
     * @param Width Width of a small image in the sprite sheet.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Number of small images in each sprite image. 
     * @return TotalCount Number of small images in each sprite image.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of small images in each sprite image.
     * @param TotalCount Number of small images in each sprite image.
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
     * Get Path of the WebVtt file that describes the temporal relationship between sprite sub-images and their positions. The WebVtt file indicates the time point corresponding to each sprite sub-image and its coordinate position in the sprite sheet. It is generally used by the player to implement preview. 
     * @return WebVttPath Path of the WebVtt file that describes the temporal relationship between sprite sub-images and their positions. The WebVtt file indicates the time point corresponding to each sprite sub-image and its coordinate position in the sprite sheet. It is generally used by the player to implement preview.
     */
    public String getWebVttPath() {
        return this.WebVttPath;
    }

    /**
     * Set Path of the WebVtt file that describes the temporal relationship between sprite sub-images and their positions. The WebVtt file indicates the time point corresponding to each sprite sub-image and its coordinate position in the sprite sheet. It is generally used by the player to implement preview.
     * @param WebVttPath Path of the WebVtt file that describes the temporal relationship between sprite sub-images and their positions. The WebVtt file indicates the time point corresponding to each sprite sub-image and its coordinate position in the sprite sheet. It is generally used by the player to implement preview.
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

