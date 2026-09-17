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

public class StickerTrackItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SourceMedia")
    @Expose
    private String SourceMedia;

    /**
    * 
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * 
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
    * 
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * 
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

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
    @SerializedName("ImageOperations")
    @Expose
    private ImageTransform [] ImageOperations;

    /**
     * Get  
     * @return SourceMedia 
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set 
     * @param SourceMedia 
     */
    public void setSourceMedia(String SourceMedia) {
        this.SourceMedia = SourceMedia;
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
     * @return StartTime 
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 
     * @param StartTime 
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get  
     * @return CoordinateOrigin 
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set 
     * @param CoordinateOrigin 
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    /**
     * Get  
     * @return XPos 
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set 
     * @param XPos 
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get  
     * @return YPos 
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set 
     * @param YPos 
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
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
     * @return ImageOperations 
     */
    public ImageTransform [] getImageOperations() {
        return this.ImageOperations;
    }

    /**
     * Set 
     * @param ImageOperations 
     */
    public void setImageOperations(ImageTransform [] ImageOperations) {
        this.ImageOperations = ImageOperations;
    }

    public StickerTrackItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StickerTrackItem(StickerTrackItem source) {
        if (source.SourceMedia != null) {
            this.SourceMedia = new String(source.SourceMedia);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.StartTime != null) {
            this.StartTime = new Float(source.StartTime);
        }
        if (source.CoordinateOrigin != null) {
            this.CoordinateOrigin = new String(source.CoordinateOrigin);
        }
        if (source.XPos != null) {
            this.XPos = new String(source.XPos);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.ImageOperations != null) {
            this.ImageOperations = new ImageTransform[source.ImageOperations.length];
            for (int i = 0; i < source.ImageOperations.length; i++) {
                this.ImageOperations[i] = new ImageTransform(source.ImageOperations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceMedia", this.SourceMedia);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamArrayObj(map, prefix + "ImageOperations.", this.ImageOperations);

    }
}

