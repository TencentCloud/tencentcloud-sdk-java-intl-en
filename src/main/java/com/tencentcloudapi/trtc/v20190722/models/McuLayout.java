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

public class McuLayout extends AbstractModel {

    /**
    * The information of the stream that is displayed. If you do not pass this parameter, TRTC will display the videos of anchors in the room according to their room entry sequence.
    */
    @SerializedName("UserMediaStream")
    @Expose
    private UserMediaStream UserMediaStream;

    /**
    * The video width (pixels). If you do not pass this parameter, 0 will be used.
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * The video height (pixels). If you do not pass this parameter, 0 will be used.
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * The horizontal offset (pixels) of the video. The sum of `LocationX` and `ImageWidth` cannot exceed the width of the canvas. If you do not pass this parameter, 0 will be used.
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * The vertical offset of the video. The sum of `LocationY` and `ImageHeight` cannot exceed the height of the canvas. If you do not pass this parameter, 0 will be used.
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
    * The image layer of the video. If you do not pass this parameter, 0 will be used.
    */
    @SerializedName("ZOrder")
    @Expose
    private Long ZOrder;

    /**
    * The rendering mode of the video. 0 (the video is scaled and the excess parts are cropped), 1 (the video is scaled), 2 (the video is scaled and the blank spaces are filled with black bars). If you do not pass this parameter, 0 will be used.
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
    * (Not supported yet) The background color of a video. Below are the values for some commonly used colors:
Red: `0xcc0033`
Yellow: `0xcc9900`
Green: `0xcccc33`
Blue: `0x99CCFF`
Black: `0x000000`
White: `0xFFFFFF`
Grey: `0x999999`
    */
    @SerializedName("BackGroundColor")
    @Expose
    private String BackGroundColor;

    /**
    * The URL of the background image for the video. This parameter allows you to specify an image to display when the user’s camera is turned off or before the user enters the room. If the dimensions of the image specified are different from those of the video window, the image will be stretched to fit the space. This parameter has a higher priority than `BackGroundColor`.
    */
    @SerializedName("BackgroundImageUrl")
    @Expose
    private String BackgroundImageUrl;

    /**
    * Custom cropping.
    */
    @SerializedName("CustomCrop")
    @Expose
    private McuCustomCrop CustomCrop;

    /**
    * The display mode of the sub-background image during output: 0 for cropping, 1 for scaling and displaying the background, 2 for scaling and displaying the black background, 3 for proportional scaling. If not filled in, the default is 3.
    */
    @SerializedName("BackgroundRenderMode")
    @Expose
    private Long BackgroundRenderMode;

    /**
     * Get The information of the stream that is displayed. If you do not pass this parameter, TRTC will display the videos of anchors in the room according to their room entry sequence. 
     * @return UserMediaStream The information of the stream that is displayed. If you do not pass this parameter, TRTC will display the videos of anchors in the room according to their room entry sequence.
     */
    public UserMediaStream getUserMediaStream() {
        return this.UserMediaStream;
    }

    /**
     * Set The information of the stream that is displayed. If you do not pass this parameter, TRTC will display the videos of anchors in the room according to their room entry sequence.
     * @param UserMediaStream The information of the stream that is displayed. If you do not pass this parameter, TRTC will display the videos of anchors in the room according to their room entry sequence.
     */
    public void setUserMediaStream(UserMediaStream UserMediaStream) {
        this.UserMediaStream = UserMediaStream;
    }

    /**
     * Get The video width (pixels). If you do not pass this parameter, 0 will be used. 
     * @return ImageWidth The video width (pixels). If you do not pass this parameter, 0 will be used.
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set The video width (pixels). If you do not pass this parameter, 0 will be used.
     * @param ImageWidth The video width (pixels). If you do not pass this parameter, 0 will be used.
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get The video height (pixels). If you do not pass this parameter, 0 will be used. 
     * @return ImageHeight The video height (pixels). If you do not pass this parameter, 0 will be used.
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set The video height (pixels). If you do not pass this parameter, 0 will be used.
     * @param ImageHeight The video height (pixels). If you do not pass this parameter, 0 will be used.
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get The horizontal offset (pixels) of the video. The sum of `LocationX` and `ImageWidth` cannot exceed the width of the canvas. If you do not pass this parameter, 0 will be used. 
     * @return LocationX The horizontal offset (pixels) of the video. The sum of `LocationX` and `ImageWidth` cannot exceed the width of the canvas. If you do not pass this parameter, 0 will be used.
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set The horizontal offset (pixels) of the video. The sum of `LocationX` and `ImageWidth` cannot exceed the width of the canvas. If you do not pass this parameter, 0 will be used.
     * @param LocationX The horizontal offset (pixels) of the video. The sum of `LocationX` and `ImageWidth` cannot exceed the width of the canvas. If you do not pass this parameter, 0 will be used.
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get The vertical offset of the video. The sum of `LocationY` and `ImageHeight` cannot exceed the height of the canvas. If you do not pass this parameter, 0 will be used. 
     * @return LocationY The vertical offset of the video. The sum of `LocationY` and `ImageHeight` cannot exceed the height of the canvas. If you do not pass this parameter, 0 will be used.
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set The vertical offset of the video. The sum of `LocationY` and `ImageHeight` cannot exceed the height of the canvas. If you do not pass this parameter, 0 will be used.
     * @param LocationY The vertical offset of the video. The sum of `LocationY` and `ImageHeight` cannot exceed the height of the canvas. If you do not pass this parameter, 0 will be used.
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get The image layer of the video. If you do not pass this parameter, 0 will be used. 
     * @return ZOrder The image layer of the video. If you do not pass this parameter, 0 will be used.
     */
    public Long getZOrder() {
        return this.ZOrder;
    }

    /**
     * Set The image layer of the video. If you do not pass this parameter, 0 will be used.
     * @param ZOrder The image layer of the video. If you do not pass this parameter, 0 will be used.
     */
    public void setZOrder(Long ZOrder) {
        this.ZOrder = ZOrder;
    }

    /**
     * Get The rendering mode of the video. 0 (the video is scaled and the excess parts are cropped), 1 (the video is scaled), 2 (the video is scaled and the blank spaces are filled with black bars). If you do not pass this parameter, 0 will be used. 
     * @return RenderMode The rendering mode of the video. 0 (the video is scaled and the excess parts are cropped), 1 (the video is scaled), 2 (the video is scaled and the blank spaces are filled with black bars). If you do not pass this parameter, 0 will be used.
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set The rendering mode of the video. 0 (the video is scaled and the excess parts are cropped), 1 (the video is scaled), 2 (the video is scaled and the blank spaces are filled with black bars). If you do not pass this parameter, 0 will be used.
     * @param RenderMode The rendering mode of the video. 0 (the video is scaled and the excess parts are cropped), 1 (the video is scaled), 2 (the video is scaled and the blank spaces are filled with black bars). If you do not pass this parameter, 0 will be used.
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    /**
     * Get (Not supported yet) The background color of a video. Below are the values for some commonly used colors:
Red: `0xcc0033`
Yellow: `0xcc9900`
Green: `0xcccc33`
Blue: `0x99CCFF`
Black: `0x000000`
White: `0xFFFFFF`
Grey: `0x999999` 
     * @return BackGroundColor (Not supported yet) The background color of a video. Below are the values for some commonly used colors:
Red: `0xcc0033`
Yellow: `0xcc9900`
Green: `0xcccc33`
Blue: `0x99CCFF`
Black: `0x000000`
White: `0xFFFFFF`
Grey: `0x999999`
     */
    public String getBackGroundColor() {
        return this.BackGroundColor;
    }

    /**
     * Set (Not supported yet) The background color of a video. Below are the values for some commonly used colors:
Red: `0xcc0033`
Yellow: `0xcc9900`
Green: `0xcccc33`
Blue: `0x99CCFF`
Black: `0x000000`
White: `0xFFFFFF`
Grey: `0x999999`
     * @param BackGroundColor (Not supported yet) The background color of a video. Below are the values for some commonly used colors:
Red: `0xcc0033`
Yellow: `0xcc9900`
Green: `0xcccc33`
Blue: `0x99CCFF`
Black: `0x000000`
White: `0xFFFFFF`
Grey: `0x999999`
     */
    public void setBackGroundColor(String BackGroundColor) {
        this.BackGroundColor = BackGroundColor;
    }

    /**
     * Get The URL of the background image for the video. This parameter allows you to specify an image to display when the user’s camera is turned off or before the user enters the room. If the dimensions of the image specified are different from those of the video window, the image will be stretched to fit the space. This parameter has a higher priority than `BackGroundColor`. 
     * @return BackgroundImageUrl The URL of the background image for the video. This parameter allows you to specify an image to display when the user’s camera is turned off or before the user enters the room. If the dimensions of the image specified are different from those of the video window, the image will be stretched to fit the space. This parameter has a higher priority than `BackGroundColor`.
     */
    public String getBackgroundImageUrl() {
        return this.BackgroundImageUrl;
    }

    /**
     * Set The URL of the background image for the video. This parameter allows you to specify an image to display when the user’s camera is turned off or before the user enters the room. If the dimensions of the image specified are different from those of the video window, the image will be stretched to fit the space. This parameter has a higher priority than `BackGroundColor`.
     * @param BackgroundImageUrl The URL of the background image for the video. This parameter allows you to specify an image to display when the user’s camera is turned off or before the user enters the room. If the dimensions of the image specified are different from those of the video window, the image will be stretched to fit the space. This parameter has a higher priority than `BackGroundColor`.
     */
    public void setBackgroundImageUrl(String BackgroundImageUrl) {
        this.BackgroundImageUrl = BackgroundImageUrl;
    }

    /**
     * Get Custom cropping. 
     * @return CustomCrop Custom cropping.
     */
    public McuCustomCrop getCustomCrop() {
        return this.CustomCrop;
    }

    /**
     * Set Custom cropping.
     * @param CustomCrop Custom cropping.
     */
    public void setCustomCrop(McuCustomCrop CustomCrop) {
        this.CustomCrop = CustomCrop;
    }

    /**
     * Get The display mode of the sub-background image during output: 0 for cropping, 1 for scaling and displaying the background, 2 for scaling and displaying the black background, 3 for proportional scaling. If not filled in, the default is 3. 
     * @return BackgroundRenderMode The display mode of the sub-background image during output: 0 for cropping, 1 for scaling and displaying the background, 2 for scaling and displaying the black background, 3 for proportional scaling. If not filled in, the default is 3.
     */
    public Long getBackgroundRenderMode() {
        return this.BackgroundRenderMode;
    }

    /**
     * Set The display mode of the sub-background image during output: 0 for cropping, 1 for scaling and displaying the background, 2 for scaling and displaying the black background, 3 for proportional scaling. If not filled in, the default is 3.
     * @param BackgroundRenderMode The display mode of the sub-background image during output: 0 for cropping, 1 for scaling and displaying the background, 2 for scaling and displaying the black background, 3 for proportional scaling. If not filled in, the default is 3.
     */
    public void setBackgroundRenderMode(Long BackgroundRenderMode) {
        this.BackgroundRenderMode = BackgroundRenderMode;
    }

    public McuLayout() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuLayout(McuLayout source) {
        if (source.UserMediaStream != null) {
            this.UserMediaStream = new UserMediaStream(source.UserMediaStream);
        }
        if (source.ImageWidth != null) {
            this.ImageWidth = new Long(source.ImageWidth);
        }
        if (source.ImageHeight != null) {
            this.ImageHeight = new Long(source.ImageHeight);
        }
        if (source.LocationX != null) {
            this.LocationX = new Long(source.LocationX);
        }
        if (source.LocationY != null) {
            this.LocationY = new Long(source.LocationY);
        }
        if (source.ZOrder != null) {
            this.ZOrder = new Long(source.ZOrder);
        }
        if (source.RenderMode != null) {
            this.RenderMode = new Long(source.RenderMode);
        }
        if (source.BackGroundColor != null) {
            this.BackGroundColor = new String(source.BackGroundColor);
        }
        if (source.BackgroundImageUrl != null) {
            this.BackgroundImageUrl = new String(source.BackgroundImageUrl);
        }
        if (source.CustomCrop != null) {
            this.CustomCrop = new McuCustomCrop(source.CustomCrop);
        }
        if (source.BackgroundRenderMode != null) {
            this.BackgroundRenderMode = new Long(source.BackgroundRenderMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserMediaStream.", this.UserMediaStream);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "ZOrder", this.ZOrder);
        this.setParamSimple(map, prefix + "RenderMode", this.RenderMode);
        this.setParamSimple(map, prefix + "BackGroundColor", this.BackGroundColor);
        this.setParamSimple(map, prefix + "BackgroundImageUrl", this.BackgroundImageUrl);
        this.setParamObj(map, prefix + "CustomCrop.", this.CustomCrop);
        this.setParamSimple(map, prefix + "BackgroundRenderMode", this.BackgroundRenderMode);

    }
}

