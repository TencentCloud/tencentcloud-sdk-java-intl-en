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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateLiveWatermarkRequest extends AbstractModel{

    /**
    * Watermark ID.
    */
    @SerializedName("WatermarkId")
    @Expose
    private Long WatermarkId;

    /**
    * Watermark image URL.
    */
    @SerializedName("PictureUrl")
    @Expose
    private String PictureUrl;

    /**
    * Display position: X-axis offset.
    */
    @SerializedName("XPosition")
    @Expose
    private Long XPosition;

    /**
    * Display position: Y-axis offset.
    */
    @SerializedName("YPosition")
    @Expose
    private Long YPosition;

    /**
    * Watermark name.
    */
    @SerializedName("WatermarkName")
    @Expose
    private String WatermarkName;

    /**
    * Watermark width or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Watermark height or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get Watermark ID. 
     * @return WatermarkId Watermark ID.
     */
    public Long getWatermarkId() {
        return this.WatermarkId;
    }

    /**
     * Set Watermark ID.
     * @param WatermarkId Watermark ID.
     */
    public void setWatermarkId(Long WatermarkId) {
        this.WatermarkId = WatermarkId;
    }

    /**
     * Get Watermark image URL. 
     * @return PictureUrl Watermark image URL.
     */
    public String getPictureUrl() {
        return this.PictureUrl;
    }

    /**
     * Set Watermark image URL.
     * @param PictureUrl Watermark image URL.
     */
    public void setPictureUrl(String PictureUrl) {
        this.PictureUrl = PictureUrl;
    }

    /**
     * Get Display position: X-axis offset. 
     * @return XPosition Display position: X-axis offset.
     */
    public Long getXPosition() {
        return this.XPosition;
    }

    /**
     * Set Display position: X-axis offset.
     * @param XPosition Display position: X-axis offset.
     */
    public void setXPosition(Long XPosition) {
        this.XPosition = XPosition;
    }

    /**
     * Get Display position: Y-axis offset. 
     * @return YPosition Display position: Y-axis offset.
     */
    public Long getYPosition() {
        return this.YPosition;
    }

    /**
     * Set Display position: Y-axis offset.
     * @param YPosition Display position: Y-axis offset.
     */
    public void setYPosition(Long YPosition) {
        this.YPosition = YPosition;
    }

    /**
     * Get Watermark name. 
     * @return WatermarkName Watermark name.
     */
    public String getWatermarkName() {
        return this.WatermarkName;
    }

    /**
     * Set Watermark name.
     * @param WatermarkName Watermark name.
     */
    public void setWatermarkName(String WatermarkName) {
        this.WatermarkName = WatermarkName;
    }

    /**
     * Get Watermark width or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions. 
     * @return Width Watermark width or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Watermark width or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions.
     * @param Width Watermark width or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Watermark height or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions. 
     * @return Height Watermark height or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Watermark height or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions.
     * @param Height Watermark height or its percentage of the live streaming video width. It is recommended to just specify either height or width as the other will be scaled proportionally to avoid distortions.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WatermarkId", this.WatermarkId);
        this.setParamSimple(map, prefix + "PictureUrl", this.PictureUrl);
        this.setParamSimple(map, prefix + "XPosition", this.XPosition);
        this.setParamSimple(map, prefix + "YPosition", this.YPosition);
        this.setParamSimple(map, prefix + "WatermarkName", this.WatermarkName);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

