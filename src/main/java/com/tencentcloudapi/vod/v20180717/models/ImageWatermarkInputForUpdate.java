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

public class ImageWatermarkInputForUpdate extends AbstractModel {

    /**
    * 
    */
    @SerializedName("ImageContent")
    @Expose
    private String ImageContent;

    /**
    * 
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * 
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * 
    */
    @SerializedName("RepeatType")
    @Expose
    private String RepeatType;

    /**
    * 
    */
    @SerializedName("Transparency")
    @Expose
    private Long Transparency;

    /**
     * Get  
     * @return ImageContent 
     */
    public String getImageContent() {
        return this.ImageContent;
    }

    /**
     * Set 
     * @param ImageContent 
     */
    public void setImageContent(String ImageContent) {
        this.ImageContent = ImageContent;
    }

    /**
     * Get  
     * @return Width 
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set 
     * @param Width 
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get  
     * @return Height 
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set 
     * @param Height 
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get  
     * @return RepeatType 
     */
    public String getRepeatType() {
        return this.RepeatType;
    }

    /**
     * Set 
     * @param RepeatType 
     */
    public void setRepeatType(String RepeatType) {
        this.RepeatType = RepeatType;
    }

    /**
     * Get  
     * @return Transparency 
     */
    public Long getTransparency() {
        return this.Transparency;
    }

    /**
     * Set 
     * @param Transparency 
     */
    public void setTransparency(Long Transparency) {
        this.Transparency = Transparency;
    }

    public ImageWatermarkInputForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageWatermarkInputForUpdate(ImageWatermarkInputForUpdate source) {
        if (source.ImageContent != null) {
            this.ImageContent = new String(source.ImageContent);
        }
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.RepeatType != null) {
            this.RepeatType = new String(source.RepeatType);
        }
        if (source.Transparency != null) {
            this.Transparency = new Long(source.Transparency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageContent", this.ImageContent);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "RepeatType", this.RepeatType);
        this.setParamSimple(map, prefix + "Transparency", this.Transparency);

    }
}

