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
    * <p>Sprite sheet specification. See <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">sprite sheet parameter template</a>.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Height of the small image in the sprite sheet.</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>Width of the small image in the sprite sheet.</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>The number of small images in each large sprite sheet.</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>Address of each sprite sheet.</p>
    */
    @SerializedName("ImageUrlSet")
    @Expose
    private String [] ImageUrlSet;

    /**
    * <p>Address of the WebVtt file that describes the positional and temporal relationship of sprite subimages. The WebVtt file indicates the time point corresponding to each sprite and its coordinates in the sprite sheet. It is generally used by the player to implement preview.</p>
    */
    @SerializedName("WebVttUrl")
    @Expose
    private String WebVttUrl;

    /**
     * Get <p>Sprite sheet specification. See <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">sprite sheet parameter template</a>.</p> 
     * @return Definition <p>Sprite sheet specification. See <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">sprite sheet parameter template</a>.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Sprite sheet specification. See <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">sprite sheet parameter template</a>.</p>
     * @param Definition <p>Sprite sheet specification. See <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">sprite sheet parameter template</a>.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Height of the small image in the sprite sheet.</p> 
     * @return Height <p>Height of the small image in the sprite sheet.</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>Height of the small image in the sprite sheet.</p>
     * @param Height <p>Height of the small image in the sprite sheet.</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>Width of the small image in the sprite sheet.</p> 
     * @return Width <p>Width of the small image in the sprite sheet.</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>Width of the small image in the sprite sheet.</p>
     * @param Width <p>Width of the small image in the sprite sheet.</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>The number of small images in each large sprite sheet.</p> 
     * @return TotalCount <p>The number of small images in each large sprite sheet.</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>The number of small images in each large sprite sheet.</p>
     * @param TotalCount <p>The number of small images in each large sprite sheet.</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>Address of each sprite sheet.</p> 
     * @return ImageUrlSet <p>Address of each sprite sheet.</p>
     */
    public String [] getImageUrlSet() {
        return this.ImageUrlSet;
    }

    /**
     * Set <p>Address of each sprite sheet.</p>
     * @param ImageUrlSet <p>Address of each sprite sheet.</p>
     */
    public void setImageUrlSet(String [] ImageUrlSet) {
        this.ImageUrlSet = ImageUrlSet;
    }

    /**
     * Get <p>Address of the WebVtt file that describes the positional and temporal relationship of sprite subimages. The WebVtt file indicates the time point corresponding to each sprite and its coordinates in the sprite sheet. It is generally used by the player to implement preview.</p> 
     * @return WebVttUrl <p>Address of the WebVtt file that describes the positional and temporal relationship of sprite subimages. The WebVtt file indicates the time point corresponding to each sprite and its coordinates in the sprite sheet. It is generally used by the player to implement preview.</p>
     */
    public String getWebVttUrl() {
        return this.WebVttUrl;
    }

    /**
     * Set <p>Address of the WebVtt file that describes the positional and temporal relationship of sprite subimages. The WebVtt file indicates the time point corresponding to each sprite and its coordinates in the sprite sheet. It is generally used by the player to implement preview.</p>
     * @param WebVttUrl <p>Address of the WebVtt file that describes the positional and temporal relationship of sprite subimages. The WebVtt file indicates the time point corresponding to each sprite and its coordinates in the sprite sheet. It is generally used by the player to implement preview.</p>
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

