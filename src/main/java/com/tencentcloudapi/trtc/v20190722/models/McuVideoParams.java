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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuVideoParams extends AbstractModel {

    /**
    * Video encoding parameter for the output stream.
    */
    @SerializedName("VideoEncode")
    @Expose
    private VideoEncode VideoEncode;

    /**
    * Stream mixing layout parameter.
    */
    @SerializedName("LayoutParams")
    @Expose
    private McuLayoutParams LayoutParams;

    /**
    * The entire canvas background color. commonly used colors:.
Red: 0xcc0033.
Yellow: 0xcc9900.
Green: 0xcccc33.
Blue: 0x99CCFF.
Black: 0x000000.
White: 0xFFFFFF.
Gray: 0x999999.
    */
    @SerializedName("BackGroundColor")
    @Expose
    private String BackGroundColor;

    /**
    * The url of the background image for the entire canvas. priority is higher than BackGroundColor. supports png, jpg, and jpeg formats. image size limit is not more than 5MB.
Note:.
1. make sure the image link is accessible. the backend download timeout is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the background image will not take effect.
2. url supported character sets: ['0-9','a-z','a-z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if any character outside the supported character sets exists, the background image will not take effect.
    */
    @SerializedName("BackgroundImageUrl")
    @Expose
    private String BackgroundImageUrl;

    /**
    * Watermark parameters for the stream mixing layout.
    */
    @SerializedName("WaterMarkList")
    @Expose
    private McuWaterMarkParams [] WaterMarkList;

    /**
    * The display mode of the background image in the output: 0 for crop, 1 for scale and display black background, 2 for variable-scale scaling. the backend defaults to variable-scale scaling.
    */
    @SerializedName("BackgroundRenderMode")
    @Expose
    private Long BackgroundRenderMode;

    /**
     * Get Video encoding parameter for the output stream. 
     * @return VideoEncode Video encoding parameter for the output stream.
     */
    public VideoEncode getVideoEncode() {
        return this.VideoEncode;
    }

    /**
     * Set Video encoding parameter for the output stream.
     * @param VideoEncode Video encoding parameter for the output stream.
     */
    public void setVideoEncode(VideoEncode VideoEncode) {
        this.VideoEncode = VideoEncode;
    }

    /**
     * Get Stream mixing layout parameter. 
     * @return LayoutParams Stream mixing layout parameter.
     */
    public McuLayoutParams getLayoutParams() {
        return this.LayoutParams;
    }

    /**
     * Set Stream mixing layout parameter.
     * @param LayoutParams Stream mixing layout parameter.
     */
    public void setLayoutParams(McuLayoutParams LayoutParams) {
        this.LayoutParams = LayoutParams;
    }

    /**
     * Get The entire canvas background color. commonly used colors:.
Red: 0xcc0033.
Yellow: 0xcc9900.
Green: 0xcccc33.
Blue: 0x99CCFF.
Black: 0x000000.
White: 0xFFFFFF.
Gray: 0x999999. 
     * @return BackGroundColor The entire canvas background color. commonly used colors:.
Red: 0xcc0033.
Yellow: 0xcc9900.
Green: 0xcccc33.
Blue: 0x99CCFF.
Black: 0x000000.
White: 0xFFFFFF.
Gray: 0x999999.
     */
    public String getBackGroundColor() {
        return this.BackGroundColor;
    }

    /**
     * Set The entire canvas background color. commonly used colors:.
Red: 0xcc0033.
Yellow: 0xcc9900.
Green: 0xcccc33.
Blue: 0x99CCFF.
Black: 0x000000.
White: 0xFFFFFF.
Gray: 0x999999.
     * @param BackGroundColor The entire canvas background color. commonly used colors:.
Red: 0xcc0033.
Yellow: 0xcc9900.
Green: 0xcccc33.
Blue: 0x99CCFF.
Black: 0x000000.
White: 0xFFFFFF.
Gray: 0x999999.
     */
    public void setBackGroundColor(String BackGroundColor) {
        this.BackGroundColor = BackGroundColor;
    }

    /**
     * Get The url of the background image for the entire canvas. priority is higher than BackGroundColor. supports png, jpg, and jpeg formats. image size limit is not more than 5MB.
Note:.
1. make sure the image link is accessible. the backend download timeout is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the background image will not take effect.
2. url supported character sets: ['0-9','a-z','a-z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if any character outside the supported character sets exists, the background image will not take effect. 
     * @return BackgroundImageUrl The url of the background image for the entire canvas. priority is higher than BackGroundColor. supports png, jpg, and jpeg formats. image size limit is not more than 5MB.
Note:.
1. make sure the image link is accessible. the backend download timeout is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the background image will not take effect.
2. url supported character sets: ['0-9','a-z','a-z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if any character outside the supported character sets exists, the background image will not take effect.
     */
    public String getBackgroundImageUrl() {
        return this.BackgroundImageUrl;
    }

    /**
     * Set The url of the background image for the entire canvas. priority is higher than BackGroundColor. supports png, jpg, and jpeg formats. image size limit is not more than 5MB.
Note:.
1. make sure the image link is accessible. the backend download timeout is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the background image will not take effect.
2. url supported character sets: ['0-9','a-z','a-z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if any character outside the supported character sets exists, the background image will not take effect.
     * @param BackgroundImageUrl The url of the background image for the entire canvas. priority is higher than BackGroundColor. supports png, jpg, and jpeg formats. image size limit is not more than 5MB.
Note:.
1. make sure the image link is accessible. the backend download timeout is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the background image will not take effect.
2. url supported character sets: ['0-9','a-z','a-z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if any character outside the supported character sets exists, the background image will not take effect.
     */
    public void setBackgroundImageUrl(String BackgroundImageUrl) {
        this.BackgroundImageUrl = BackgroundImageUrl;
    }

    /**
     * Get Watermark parameters for the stream mixing layout. 
     * @return WaterMarkList Watermark parameters for the stream mixing layout.
     */
    public McuWaterMarkParams [] getWaterMarkList() {
        return this.WaterMarkList;
    }

    /**
     * Set Watermark parameters for the stream mixing layout.
     * @param WaterMarkList Watermark parameters for the stream mixing layout.
     */
    public void setWaterMarkList(McuWaterMarkParams [] WaterMarkList) {
        this.WaterMarkList = WaterMarkList;
    }

    /**
     * Get The display mode of the background image in the output: 0 for crop, 1 for scale and display black background, 2 for variable-scale scaling. the backend defaults to variable-scale scaling. 
     * @return BackgroundRenderMode The display mode of the background image in the output: 0 for crop, 1 for scale and display black background, 2 for variable-scale scaling. the backend defaults to variable-scale scaling.
     */
    public Long getBackgroundRenderMode() {
        return this.BackgroundRenderMode;
    }

    /**
     * Set The display mode of the background image in the output: 0 for crop, 1 for scale and display black background, 2 for variable-scale scaling. the backend defaults to variable-scale scaling.
     * @param BackgroundRenderMode The display mode of the background image in the output: 0 for crop, 1 for scale and display black background, 2 for variable-scale scaling. the backend defaults to variable-scale scaling.
     */
    public void setBackgroundRenderMode(Long BackgroundRenderMode) {
        this.BackgroundRenderMode = BackgroundRenderMode;
    }

    public McuVideoParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuVideoParams(McuVideoParams source) {
        if (source.VideoEncode != null) {
            this.VideoEncode = new VideoEncode(source.VideoEncode);
        }
        if (source.LayoutParams != null) {
            this.LayoutParams = new McuLayoutParams(source.LayoutParams);
        }
        if (source.BackGroundColor != null) {
            this.BackGroundColor = new String(source.BackGroundColor);
        }
        if (source.BackgroundImageUrl != null) {
            this.BackgroundImageUrl = new String(source.BackgroundImageUrl);
        }
        if (source.WaterMarkList != null) {
            this.WaterMarkList = new McuWaterMarkParams[source.WaterMarkList.length];
            for (int i = 0; i < source.WaterMarkList.length; i++) {
                this.WaterMarkList[i] = new McuWaterMarkParams(source.WaterMarkList[i]);
            }
        }
        if (source.BackgroundRenderMode != null) {
            this.BackgroundRenderMode = new Long(source.BackgroundRenderMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VideoEncode.", this.VideoEncode);
        this.setParamObj(map, prefix + "LayoutParams.", this.LayoutParams);
        this.setParamSimple(map, prefix + "BackGroundColor", this.BackGroundColor);
        this.setParamSimple(map, prefix + "BackgroundImageUrl", this.BackgroundImageUrl);
        this.setParamArrayObj(map, prefix + "WaterMarkList.", this.WaterMarkList);
        this.setParamSimple(map, prefix + "BackgroundRenderMode", this.BackgroundRenderMode);

    }
}

