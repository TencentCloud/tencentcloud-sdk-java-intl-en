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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPictureRequest extends AbstractModel{

    /**
    * Image ID
    */
    @SerializedName("PictureId")
    @Expose
    private Long PictureId;

    /**
    * Application ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Image height
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Image width
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * X-axis value of the image’s position
    */
    @SerializedName("XPosition")
    @Expose
    private Long XPosition;

    /**
    * Y-axis value of the image’s position
    */
    @SerializedName("YPosition")
    @Expose
    private Long YPosition;

    /**
     * Get Image ID 
     * @return PictureId Image ID
     */
    public Long getPictureId() {
        return this.PictureId;
    }

    /**
     * Set Image ID
     * @param PictureId Image ID
     */
    public void setPictureId(Long PictureId) {
        this.PictureId = PictureId;
    }

    /**
     * Get Application ID 
     * @return SdkAppId Application ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID
     * @param SdkAppId Application ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Image height 
     * @return Height Image height
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Image height
     * @param Height Image height
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Image width 
     * @return Width Image width
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Image width
     * @param Width Image width
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get X-axis value of the image’s position 
     * @return XPosition X-axis value of the image’s position
     */
    public Long getXPosition() {
        return this.XPosition;
    }

    /**
     * Set X-axis value of the image’s position
     * @param XPosition X-axis value of the image’s position
     */
    public void setXPosition(Long XPosition) {
        this.XPosition = XPosition;
    }

    /**
     * Get Y-axis value of the image’s position 
     * @return YPosition Y-axis value of the image’s position
     */
    public Long getYPosition() {
        return this.YPosition;
    }

    /**
     * Set Y-axis value of the image’s position
     * @param YPosition Y-axis value of the image’s position
     */
    public void setYPosition(Long YPosition) {
        this.YPosition = YPosition;
    }

    public ModifyPictureRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPictureRequest(ModifyPictureRequest source) {
        if (source.PictureId != null) {
            this.PictureId = new Long(source.PictureId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.XPosition != null) {
            this.XPosition = new Long(source.XPosition);
        }
        if (source.YPosition != null) {
            this.YPosition = new Long(source.YPosition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PictureId", this.PictureId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "XPosition", this.XPosition);
        this.setParamSimple(map, prefix + "YPosition", this.YPosition);

    }
}

