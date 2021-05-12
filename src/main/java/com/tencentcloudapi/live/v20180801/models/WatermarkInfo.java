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

public class WatermarkInfo extends AbstractModel{

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
    * Current status. 0: not used. 1: in use.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Watermark width.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Watermark height.
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
     * Get Current status. 0: not used. 1: in use. 
     * @return Status Current status. 0: not used. 1: in use.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Current status. 0: not used. 1: in use.
     * @param Status Current status. 0: not used. 1: in use.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Watermark width. 
     * @return Width Watermark width.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Watermark width.
     * @param Width Watermark width.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Watermark height. 
     * @return Height Watermark height.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Watermark height.
     * @param Height Watermark height.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public WatermarkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WatermarkInfo(WatermarkInfo source) {
        if (source.WatermarkId != null) {
            this.WatermarkId = new Long(source.WatermarkId);
        }
        if (source.PictureUrl != null) {
            this.PictureUrl = new String(source.PictureUrl);
        }
        if (source.XPosition != null) {
            this.XPosition = new Long(source.XPosition);
        }
        if (source.YPosition != null) {
            this.YPosition = new Long(source.YPosition);
        }
        if (source.WatermarkName != null) {
            this.WatermarkName = new String(source.WatermarkName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

