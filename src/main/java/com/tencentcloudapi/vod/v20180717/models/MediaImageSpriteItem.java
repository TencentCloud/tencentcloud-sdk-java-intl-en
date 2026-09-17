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
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 
    */
    @SerializedName("ImageUrlSet")
    @Expose
    private String [] ImageUrlSet;

    /**
    * 
    */
    @SerializedName("WebVttUrl")
    @Expose
    private String WebVttUrl;

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return Height 
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 
     * @param Height 
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get  
     * @return Width 
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 
     * @param Width 
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get  
     * @return TotalCount 
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 
     * @param TotalCount 
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get  
     * @return ImageUrlSet 
     */
    public String [] getImageUrlSet() {
        return this.ImageUrlSet;
    }

    /**
     * Set 
     * @param ImageUrlSet 
     */
    public void setImageUrlSet(String [] ImageUrlSet) {
        this.ImageUrlSet = ImageUrlSet;
    }

    /**
     * Get  
     * @return WebVttUrl 
     */
    public String getWebVttUrl() {
        return this.WebVttUrl;
    }

    /**
     * Set 
     * @param WebVttUrl 
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

