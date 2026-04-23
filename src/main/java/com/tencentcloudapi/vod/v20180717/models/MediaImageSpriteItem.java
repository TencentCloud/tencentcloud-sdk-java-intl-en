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

public class MediaImageSpriteItem extends AbstractModel {

    /**
    * <p>Sprite sheet specification. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">sprite sheet parameter template</a>.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Height of the sprite sheet.</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>Width of the sprite sheet.</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>The number of small images in each sprite sheet.</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>The domain names or IP addresses of each sprite sheet.</p>
    */
    @SerializedName("ImageUrlSet")
    @Expose
    private String [] ImageUrlSet;

    /**
    * Address of WebVtt file for the position-time relationship among subimages in an image sprite. The WebVtt file indicates the corresponding time points of each subimage and their coordinates in the image sprite, which is typically used by the player for implementing preview.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WebVttUrl")
    @Expose
    private String WebVttUrl;

    /**
     * Get <p>Sprite sheet specification. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">sprite sheet parameter template</a>.</p> 
     * @return Definition <p>Sprite sheet specification. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">sprite sheet parameter template</a>.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Sprite sheet specification. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">sprite sheet parameter template</a>.</p>
     * @param Definition <p>Sprite sheet specification. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">sprite sheet parameter template</a>.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Height of the sprite sheet.</p> 
     * @return Height <p>Height of the sprite sheet.</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>Height of the sprite sheet.</p>
     * @param Height <p>Height of the sprite sheet.</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>Width of the sprite sheet.</p> 
     * @return Width <p>Width of the sprite sheet.</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>Width of the sprite sheet.</p>
     * @param Width <p>Width of the sprite sheet.</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>The number of small images in each sprite sheet.</p> 
     * @return TotalCount <p>The number of small images in each sprite sheet.</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>The number of small images in each sprite sheet.</p>
     * @param TotalCount <p>The number of small images in each sprite sheet.</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>The domain names or IP addresses of each sprite sheet.</p> 
     * @return ImageUrlSet <p>The domain names or IP addresses of each sprite sheet.</p>
     */
    public String [] getImageUrlSet() {
        return this.ImageUrlSet;
    }

    /**
     * Set <p>The domain names or IP addresses of each sprite sheet.</p>
     * @param ImageUrlSet <p>The domain names or IP addresses of each sprite sheet.</p>
     */
    public void setImageUrlSet(String [] ImageUrlSet) {
        this.ImageUrlSet = ImageUrlSet;
    }

    /**
     * Get Address of WebVtt file for the position-time relationship among subimages in an image sprite. The WebVtt file indicates the corresponding time points of each subimage and their coordinates in the image sprite, which is typically used by the player for implementing preview.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WebVttUrl Address of WebVtt file for the position-time relationship among subimages in an image sprite. The WebVtt file indicates the corresponding time points of each subimage and their coordinates in the image sprite, which is typically used by the player for implementing preview.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getWebVttUrl() {
        return this.WebVttUrl;
    }

    /**
     * Set Address of WebVtt file for the position-time relationship among subimages in an image sprite. The WebVtt file indicates the corresponding time points of each subimage and their coordinates in the image sprite, which is typically used by the player for implementing preview.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WebVttUrl Address of WebVtt file for the position-time relationship among subimages in an image sprite. The WebVtt file indicates the corresponding time points of each subimage and their coordinates in the image sprite, which is typically used by the player for implementing preview.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWebVttUrl(String WebVttUrl) {
        this.WebVttUrl = WebVttUrl;
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
        if (source.ImageUrlSet != null) {
            this.ImageUrlSet = new String[source.ImageUrlSet.length];
            for (int i = 0; i < source.ImageUrlSet.length; i++) {
                this.ImageUrlSet[i] = new String(source.ImageUrlSet[i]);
            }
        }
        if (source.WebVttUrl != null) {
            this.WebVttUrl = new String(source.WebVttUrl);
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
        this.setParamArraySimple(map, prefix + "ImageUrlSet.", this.ImageUrlSet);
        this.setParamSimple(map, prefix + "WebVttUrl", this.WebVttUrl);

    }
}

