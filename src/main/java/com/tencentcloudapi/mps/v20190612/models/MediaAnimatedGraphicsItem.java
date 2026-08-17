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

public class MediaAnimatedGraphicsItem extends AbstractModel {

    /**
    * Storage location of the animated image file.
    */
    @SerializedName("Storage")
    @Expose
    private TaskOutputStorage Storage;

    /**
    * File path of the animated image.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Rotating image template ID. Please refer to the [Rotating Image Template](https://www.tencentcloud.com/document/product/862/77168?from_cn_redirect=1#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF.5B.5D(id.3Amove)).
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Animated image file format, for example gif.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Height of the animated image, measurement unit: px.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Width of the animated image, measurement unit: px.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Animated image bitrate. Measurement unit: bps.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Animated image size, unit: byte.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * md5 value of the animated image.
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * Start time offset of the GIF in the video, in seconds.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of the GIF in the video, in seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get Storage location of the animated image file. 
     * @return Storage Storage location of the animated image file.
     */
    public TaskOutputStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage location of the animated image file.
     * @param Storage Storage location of the animated image file.
     */
    public void setStorage(TaskOutputStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get File path of the animated image. 
     * @return Path File path of the animated image.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set File path of the animated image.
     * @param Path File path of the animated image.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Rotating image template ID. Please refer to the [Rotating Image Template](https://www.tencentcloud.com/document/product/862/77168?from_cn_redirect=1#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF.5B.5D(id.3Amove)). 
     * @return Definition Rotating image template ID. Please refer to the [Rotating Image Template](https://www.tencentcloud.com/document/product/862/77168?from_cn_redirect=1#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF.5B.5D(id.3Amove)).
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Rotating image template ID. Please refer to the [Rotating Image Template](https://www.tencentcloud.com/document/product/862/77168?from_cn_redirect=1#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF.5B.5D(id.3Amove)).
     * @param Definition Rotating image template ID. Please refer to the [Rotating Image Template](https://www.tencentcloud.com/document/product/862/77168?from_cn_redirect=1#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF.5B.5D(id.3Amove)).
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Animated image file format, for example gif. 
     * @return Container Animated image file format, for example gif.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Animated image file format, for example gif.
     * @param Container Animated image file format, for example gif.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Height of the animated image, measurement unit: px. 
     * @return Height Height of the animated image, measurement unit: px.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of the animated image, measurement unit: px.
     * @param Height Height of the animated image, measurement unit: px.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Width of the animated image, measurement unit: px. 
     * @return Width Width of the animated image, measurement unit: px.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width of the animated image, measurement unit: px.
     * @param Width Width of the animated image, measurement unit: px.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Animated image bitrate. Measurement unit: bps. 
     * @return Bitrate Animated image bitrate. Measurement unit: bps.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Animated image bitrate. Measurement unit: bps.
     * @param Bitrate Animated image bitrate. Measurement unit: bps.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Animated image size, unit: byte. 
     * @return Size Animated image size, unit: byte.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Animated image size, unit: byte.
     * @param Size Animated image size, unit: byte.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get md5 value of the animated image. 
     * @return Md5 md5 value of the animated image.
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set md5 value of the animated image.
     * @param Md5 md5 value of the animated image.
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get Start time offset of the GIF in the video, in seconds. 
     * @return StartTimeOffset Start time offset of the GIF in the video, in seconds.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of the GIF in the video, in seconds.
     * @param StartTimeOffset Start time offset of the GIF in the video, in seconds.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of the GIF in the video, in seconds. 
     * @return EndTimeOffset End time offset of the GIF in the video, in seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of the GIF in the video, in seconds.
     * @param EndTimeOffset End time offset of the GIF in the video, in seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    public MediaAnimatedGraphicsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAnimatedGraphicsItem(MediaAnimatedGraphicsItem source) {
        if (source.Storage != null) {
            this.Storage = new TaskOutputStorage(source.Storage);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

