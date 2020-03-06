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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaImageSpriteItem extends AbstractModel{

    /**
    * Image sprite specification. For more information, please see [Image Sprite Parameter Template](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Subimage height of image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Subimage width of image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Total number of subimages in each image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Address of each image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Image sprite specification. For more information, please see [Image Sprite Parameter Template](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Definition Image sprite specification. For more information, please see [Image Sprite Parameter Template](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Image sprite specification. For more information, please see [Image Sprite Parameter Template](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Definition Image sprite specification. For more information, please see [Image Sprite Parameter Template](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Subimage height of image sprite.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Height Subimage height of image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Subimage height of image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Height Subimage height of image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Subimage width of image sprite.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Width Subimage width of image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Subimage width of image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Width Subimage width of image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Total number of subimages in each image sprite.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of subimages in each image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of subimages in each image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of subimages in each image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Address of each image sprite.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ImageUrlSet Address of each image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getImageUrlSet() {
        return this.ImageUrlSet;
    }

    /**
     * Set Address of each image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ImageUrlSet Address of each image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
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

