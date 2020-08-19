/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaAnimatedGraphicsItem extends AbstractModel{

    /**
    * Storage location of a generated animated image file.
    */
    @SerializedName("Storage")
    @Expose
    private TaskOutputStorage Storage;

    /**
    * Path to a generated animated image file.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * ID of an animated image generating template. For more information, please see [Animated Image Generating Parameter Template](https://intl.cloud.tencent.com/document/product/266/33481?from_cn_redirect=1#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF).
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Animated image format, such as gif.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Height of an animated image in px.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Width of an animated image in px.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Bitrate of an animated image in bps.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Size of an animated image in bytes.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * MD5 value of an animated image.
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * Start time offset of an animated image in the video in seconds.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of an animated image in the video in seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get Storage location of a generated animated image file. 
     * @return Storage Storage location of a generated animated image file.
     */
    public TaskOutputStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage location of a generated animated image file.
     * @param Storage Storage location of a generated animated image file.
     */
    public void setStorage(TaskOutputStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Path to a generated animated image file. 
     * @return Path Path to a generated animated image file.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path to a generated animated image file.
     * @param Path Path to a generated animated image file.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get ID of an animated image generating template. For more information, please see [Animated Image Generating Parameter Template](https://intl.cloud.tencent.com/document/product/266/33481?from_cn_redirect=1#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF). 
     * @return Definition ID of an animated image generating template. For more information, please see [Animated Image Generating Parameter Template](https://intl.cloud.tencent.com/document/product/266/33481?from_cn_redirect=1#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set ID of an animated image generating template. For more information, please see [Animated Image Generating Parameter Template](https://intl.cloud.tencent.com/document/product/266/33481?from_cn_redirect=1#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     * @param Definition ID of an animated image generating template. For more information, please see [Animated Image Generating Parameter Template](https://intl.cloud.tencent.com/document/product/266/33481?from_cn_redirect=1#.E8.BD.AC.E5.8A.A8.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Animated image format, such as gif. 
     * @return Container Animated image format, such as gif.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Animated image format, such as gif.
     * @param Container Animated image format, such as gif.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Height of an animated image in px. 
     * @return Height Height of an animated image in px.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of an animated image in px.
     * @param Height Height of an animated image in px.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Width of an animated image in px. 
     * @return Width Width of an animated image in px.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width of an animated image in px.
     * @param Width Width of an animated image in px.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Bitrate of an animated image in bps. 
     * @return Bitrate Bitrate of an animated image in bps.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of an animated image in bps.
     * @param Bitrate Bitrate of an animated image in bps.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Size of an animated image in bytes. 
     * @return Size Size of an animated image in bytes.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Size of an animated image in bytes.
     * @param Size Size of an animated image in bytes.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get MD5 value of an animated image. 
     * @return Md5 MD5 value of an animated image.
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set MD5 value of an animated image.
     * @param Md5 MD5 value of an animated image.
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get Start time offset of an animated image in the video in seconds. 
     * @return StartTimeOffset Start time offset of an animated image in the video in seconds.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of an animated image in the video in seconds.
     * @param StartTimeOffset Start time offset of an animated image in the video in seconds.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of an animated image in the video in seconds. 
     * @return EndTimeOffset End time offset of an animated image in the video in seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of an animated image in the video in seconds.
     * @param EndTimeOffset End time offset of an animated image in the video in seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
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

