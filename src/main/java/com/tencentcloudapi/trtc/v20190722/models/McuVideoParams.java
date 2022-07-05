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

public class McuVideoParams extends AbstractModel{

    /**
    * The video encoding parameters.
    */
    @SerializedName("VideoEncode")
    @Expose
    private VideoEncode VideoEncode;

    /**
    * The layout parameters.
    */
    @SerializedName("LayoutParams")
    @Expose
    private McuLayoutParams LayoutParams;

    /**
    * The canvas color. Below are the values for some common colors:
Red: 0xcc0033
Yellow: 0xcc9900
Green: 0xcccc33
Blue: 0x99CCFF
Black: 0x000000
White: 0xFFFFFF
Grey: 0x999999
    */
    @SerializedName("BackGroundColor")
    @Expose
    private String BackGroundColor;

    /**
    * The URL of the background image for the canvas. This parameter has a higher priority than `BackGroundColor`.
    */
    @SerializedName("BackgroundImageUrl")
    @Expose
    private String BackgroundImageUrl;

    /**
    * The watermark information for the mixed stream.
    */
    @SerializedName("WaterMarkList")
    @Expose
    private McuWaterMarkParams [] WaterMarkList;

    /**
     * Get The video encoding parameters. 
     * @return VideoEncode The video encoding parameters.
     */
    public VideoEncode getVideoEncode() {
        return this.VideoEncode;
    }

    /**
     * Set The video encoding parameters.
     * @param VideoEncode The video encoding parameters.
     */
    public void setVideoEncode(VideoEncode VideoEncode) {
        this.VideoEncode = VideoEncode;
    }

    /**
     * Get The layout parameters. 
     * @return LayoutParams The layout parameters.
     */
    public McuLayoutParams getLayoutParams() {
        return this.LayoutParams;
    }

    /**
     * Set The layout parameters.
     * @param LayoutParams The layout parameters.
     */
    public void setLayoutParams(McuLayoutParams LayoutParams) {
        this.LayoutParams = LayoutParams;
    }

    /**
     * Get The canvas color. Below are the values for some common colors:
Red: 0xcc0033
Yellow: 0xcc9900
Green: 0xcccc33
Blue: 0x99CCFF
Black: 0x000000
White: 0xFFFFFF
Grey: 0x999999 
     * @return BackGroundColor The canvas color. Below are the values for some common colors:
Red: 0xcc0033
Yellow: 0xcc9900
Green: 0xcccc33
Blue: 0x99CCFF
Black: 0x000000
White: 0xFFFFFF
Grey: 0x999999
     */
    public String getBackGroundColor() {
        return this.BackGroundColor;
    }

    /**
     * Set The canvas color. Below are the values for some common colors:
Red: 0xcc0033
Yellow: 0xcc9900
Green: 0xcccc33
Blue: 0x99CCFF
Black: 0x000000
White: 0xFFFFFF
Grey: 0x999999
     * @param BackGroundColor The canvas color. Below are the values for some common colors:
Red: 0xcc0033
Yellow: 0xcc9900
Green: 0xcccc33
Blue: 0x99CCFF
Black: 0x000000
White: 0xFFFFFF
Grey: 0x999999
     */
    public void setBackGroundColor(String BackGroundColor) {
        this.BackGroundColor = BackGroundColor;
    }

    /**
     * Get The URL of the background image for the canvas. This parameter has a higher priority than `BackGroundColor`. 
     * @return BackgroundImageUrl The URL of the background image for the canvas. This parameter has a higher priority than `BackGroundColor`.
     */
    public String getBackgroundImageUrl() {
        return this.BackgroundImageUrl;
    }

    /**
     * Set The URL of the background image for the canvas. This parameter has a higher priority than `BackGroundColor`.
     * @param BackgroundImageUrl The URL of the background image for the canvas. This parameter has a higher priority than `BackGroundColor`.
     */
    public void setBackgroundImageUrl(String BackgroundImageUrl) {
        this.BackgroundImageUrl = BackgroundImageUrl;
    }

    /**
     * Get The watermark information for the mixed stream. 
     * @return WaterMarkList The watermark information for the mixed stream.
     */
    public McuWaterMarkParams [] getWaterMarkList() {
        return this.WaterMarkList;
    }

    /**
     * Set The watermark information for the mixed stream.
     * @param WaterMarkList The watermark information for the mixed stream.
     */
    public void setWaterMarkList(McuWaterMarkParams [] WaterMarkList) {
        this.WaterMarkList = WaterMarkList;
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

    }
}

