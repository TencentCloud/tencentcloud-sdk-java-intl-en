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
    * User media stream parameters. if left blank, tencent cloud backend fills them automatically by the room entry sequence of the uplink host.
    */
    @SerializedName("UserMediaStream")
    @Expose
    private UserMediaStream UserMediaStream;

    /**
    * The width of the sub-screen in the output, unit: pixel value. defaults to 0 if left blank.
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * The height of the sub-screen in the output, in pixel values. default is 0.
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * The X-axis offset of the sub-screen in the output, unit: pixel value. the sum of LocationX and ImageWidth must not exceed the total width of the mixed stream output. default is 0.
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * The Y-axis offset of the sub-screen in the output, unit: pixel value. the sum of LocationY and ImageHeight must not exceed the total height of the mixed stream output. default is 0 if left blank.
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
    * The hierarchy of the sub-screen in the output. default is 0.
    */
    @SerializedName("ZOrder")
    @Expose
    private Long ZOrder;

    /**
    * The display mode of the sub-screen in the output: 0 for crop, 1 for scale and display background, 2 for scale and display black background. defaults to 0 if left blank.
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
    * [This parameter configuration is invalid and not currently supported] the background color of the sub-picture. commonly used colors are:.
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
    * The url of the placeholder image for the sub-window. fill in this parameter to specify the image displayed in the layout position when the user turns the camera off or has not joined the TRTC room. if the specified image has a different size ratio from the layout position, it will be stretched. this parameter has a higher priority than BackGroundColor. supported formats include png, jpg, jpeg, bmp, gif, and webm. the image size limit is no more than 5MB.
Note:.
1. make sure the image link is accessible. the backend single download timeout period is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the placeholder image will not take effect.
2. supported character sets for urls: ['0-9', 'a-z', 'a-z', '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if characters outside the supported character sets exist, the placeholder image will not take effect.
    */
    @SerializedName("BackgroundImageUrl")
    @Expose
    private String BackgroundImageUrl;

    /**
    * Customer custom crop, targeting the input stream.
    */
    @SerializedName("CustomCrop")
    @Expose
    private McuCustomCrop CustomCrop;

    /**
    * The display mode of the sub-background image in the output: 0 for crop, 1 for scale and display background, 2 for scale and display black background, 3 for variable-scale scaling, 4 for custom rendering. defaults to 3 if left blank.
    */
    @SerializedName("BackgroundRenderMode")
    @Expose
    private Long BackgroundRenderMode;

    /**
    * The sub-screen template url points to a template image with an alpha channel. fill in this parameter, and the backend will extract the alpha channel of the template image during compositing, scale it as the alpha channel of the target frame, and mix it with other frames. you can use the transparent template to achieve a semi-transparent effect and arbitrary shape cropping (such as rounded corners, stars, hearts) for the target frame. png format is supported. the image size limit is no more than 5MB.
Note:.
1. the image aspect ratio of the template should be close to the target frame aspect ratio to avoid deformation of the template effect when scaling to fit the target frame. 2. the transparent template only takes effect when RenderMode is 0 (crop). 3. make sure the image link is accessible. the backend single download timeout period is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the transparent template will not take effect.
2. url supported character sets: ['0-9','a-z','a-z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if characters outside the supported character sets exist, the transparent template will not take effect.
    */
    @SerializedName("TransparentUrl")
    @Expose
    private String TransparentUrl;

    /**
    * 
    */
    @SerializedName("BackgroundCustomRender")
    @Expose
    private McuBackgroundCustomRender BackgroundCustomRender;

    /**
    * Sub-Background color effective mode. default value 0 means disabled.
bit0 specifies whether placeholder image scaling takes effect.
bit1 specifies whether upstream flow scaling takes effect.
You can set the corresponding bit position to 1 to start up and take effect, such as:.
0(00) means the sub background color is disabled.
1(01) indicates the sub-background color is valid only when placeholder image scaling is enabled.
2(10) means the sub background color is valid only when upstream flow scaling.
3(11) indicates the sub-background color takes effect in both placeholder image scaling and upstream flow scaling.

    */
    @SerializedName("BackGroundColorMode")
    @Expose
    private Long BackGroundColorMode;

    /**
     * Get User media stream parameters. if left blank, tencent cloud backend fills them automatically by the room entry sequence of the uplink host. 
     * @return UserMediaStream User media stream parameters. if left blank, tencent cloud backend fills them automatically by the room entry sequence of the uplink host.
     */
    public UserMediaStream getUserMediaStream() {
        return this.UserMediaStream;
    }

    /**
     * Set User media stream parameters. if left blank, tencent cloud backend fills them automatically by the room entry sequence of the uplink host.
     * @param UserMediaStream User media stream parameters. if left blank, tencent cloud backend fills them automatically by the room entry sequence of the uplink host.
     */
    public void setUserMediaStream(UserMediaStream UserMediaStream) {
        this.UserMediaStream = UserMediaStream;
    }

    /**
     * Get The width of the sub-screen in the output, unit: pixel value. defaults to 0 if left blank. 
     * @return ImageWidth The width of the sub-screen in the output, unit: pixel value. defaults to 0 if left blank.
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set The width of the sub-screen in the output, unit: pixel value. defaults to 0 if left blank.
     * @param ImageWidth The width of the sub-screen in the output, unit: pixel value. defaults to 0 if left blank.
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get The height of the sub-screen in the output, in pixel values. default is 0. 
     * @return ImageHeight The height of the sub-screen in the output, in pixel values. default is 0.
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set The height of the sub-screen in the output, in pixel values. default is 0.
     * @param ImageHeight The height of the sub-screen in the output, in pixel values. default is 0.
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get The X-axis offset of the sub-screen in the output, unit: pixel value. the sum of LocationX and ImageWidth must not exceed the total width of the mixed stream output. default is 0. 
     * @return LocationX The X-axis offset of the sub-screen in the output, unit: pixel value. the sum of LocationX and ImageWidth must not exceed the total width of the mixed stream output. default is 0.
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set The X-axis offset of the sub-screen in the output, unit: pixel value. the sum of LocationX and ImageWidth must not exceed the total width of the mixed stream output. default is 0.
     * @param LocationX The X-axis offset of the sub-screen in the output, unit: pixel value. the sum of LocationX and ImageWidth must not exceed the total width of the mixed stream output. default is 0.
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get The Y-axis offset of the sub-screen in the output, unit: pixel value. the sum of LocationY and ImageHeight must not exceed the total height of the mixed stream output. default is 0 if left blank. 
     * @return LocationY The Y-axis offset of the sub-screen in the output, unit: pixel value. the sum of LocationY and ImageHeight must not exceed the total height of the mixed stream output. default is 0 if left blank.
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set The Y-axis offset of the sub-screen in the output, unit: pixel value. the sum of LocationY and ImageHeight must not exceed the total height of the mixed stream output. default is 0 if left blank.
     * @param LocationY The Y-axis offset of the sub-screen in the output, unit: pixel value. the sum of LocationY and ImageHeight must not exceed the total height of the mixed stream output. default is 0 if left blank.
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get The hierarchy of the sub-screen in the output. default is 0. 
     * @return ZOrder The hierarchy of the sub-screen in the output. default is 0.
     */
    public Long getZOrder() {
        return this.ZOrder;
    }

    /**
     * Set The hierarchy of the sub-screen in the output. default is 0.
     * @param ZOrder The hierarchy of the sub-screen in the output. default is 0.
     */
    public void setZOrder(Long ZOrder) {
        this.ZOrder = ZOrder;
    }

    /**
     * Get The display mode of the sub-screen in the output: 0 for crop, 1 for scale and display background, 2 for scale and display black background. defaults to 0 if left blank. 
     * @return RenderMode The display mode of the sub-screen in the output: 0 for crop, 1 for scale and display background, 2 for scale and display black background. defaults to 0 if left blank.
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set The display mode of the sub-screen in the output: 0 for crop, 1 for scale and display background, 2 for scale and display black background. defaults to 0 if left blank.
     * @param RenderMode The display mode of the sub-screen in the output: 0 for crop, 1 for scale and display background, 2 for scale and display black background. defaults to 0 if left blank.
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    /**
     * Get [This parameter configuration is invalid and not currently supported] the background color of the sub-picture. commonly used colors are:.
Red: 0xcc0033.
Yellow: 0xcc9900.
Green: 0xcccc33.
Blue: 0x99CCFF.
Black: 0x000000.
White: 0xFFFFFF.
Gray: 0x999999. 
     * @return BackGroundColor [This parameter configuration is invalid and not currently supported] the background color of the sub-picture. commonly used colors are:.
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
     * Set [This parameter configuration is invalid and not currently supported] the background color of the sub-picture. commonly used colors are:.
Red: 0xcc0033.
Yellow: 0xcc9900.
Green: 0xcccc33.
Blue: 0x99CCFF.
Black: 0x000000.
White: 0xFFFFFF.
Gray: 0x999999.
     * @param BackGroundColor [This parameter configuration is invalid and not currently supported] the background color of the sub-picture. commonly used colors are:.
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
     * Get The url of the placeholder image for the sub-window. fill in this parameter to specify the image displayed in the layout position when the user turns the camera off or has not joined the TRTC room. if the specified image has a different size ratio from the layout position, it will be stretched. this parameter has a higher priority than BackGroundColor. supported formats include png, jpg, jpeg, bmp, gif, and webm. the image size limit is no more than 5MB.
Note:.
1. make sure the image link is accessible. the backend single download timeout period is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the placeholder image will not take effect.
2. supported character sets for urls: ['0-9', 'a-z', 'a-z', '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if characters outside the supported character sets exist, the placeholder image will not take effect. 
     * @return BackgroundImageUrl The url of the placeholder image for the sub-window. fill in this parameter to specify the image displayed in the layout position when the user turns the camera off or has not joined the TRTC room. if the specified image has a different size ratio from the layout position, it will be stretched. this parameter has a higher priority than BackGroundColor. supported formats include png, jpg, jpeg, bmp, gif, and webm. the image size limit is no more than 5MB.
Note:.
1. make sure the image link is accessible. the backend single download timeout period is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the placeholder image will not take effect.
2. supported character sets for urls: ['0-9', 'a-z', 'a-z', '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if characters outside the supported character sets exist, the placeholder image will not take effect.
     */
    public String getBackgroundImageUrl() {
        return this.BackgroundImageUrl;
    }

    /**
     * Set The url of the placeholder image for the sub-window. fill in this parameter to specify the image displayed in the layout position when the user turns the camera off or has not joined the TRTC room. if the specified image has a different size ratio from the layout position, it will be stretched. this parameter has a higher priority than BackGroundColor. supported formats include png, jpg, jpeg, bmp, gif, and webm. the image size limit is no more than 5MB.
Note:.
1. make sure the image link is accessible. the backend single download timeout period is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the placeholder image will not take effect.
2. supported character sets for urls: ['0-9', 'a-z', 'a-z', '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if characters outside the supported character sets exist, the placeholder image will not take effect.
     * @param BackgroundImageUrl The url of the placeholder image for the sub-window. fill in this parameter to specify the image displayed in the layout position when the user turns the camera off or has not joined the TRTC room. if the specified image has a different size ratio from the layout position, it will be stretched. this parameter has a higher priority than BackGroundColor. supported formats include png, jpg, jpeg, bmp, gif, and webm. the image size limit is no more than 5MB.
Note:.
1. make sure the image link is accessible. the backend single download timeout period is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the placeholder image will not take effect.
2. supported character sets for urls: ['0-9', 'a-z', 'a-z', '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if characters outside the supported character sets exist, the placeholder image will not take effect.
     */
    public void setBackgroundImageUrl(String BackgroundImageUrl) {
        this.BackgroundImageUrl = BackgroundImageUrl;
    }

    /**
     * Get Customer custom crop, targeting the input stream. 
     * @return CustomCrop Customer custom crop, targeting the input stream.
     */
    public McuCustomCrop getCustomCrop() {
        return this.CustomCrop;
    }

    /**
     * Set Customer custom crop, targeting the input stream.
     * @param CustomCrop Customer custom crop, targeting the input stream.
     */
    public void setCustomCrop(McuCustomCrop CustomCrop) {
        this.CustomCrop = CustomCrop;
    }

    /**
     * Get The display mode of the sub-background image in the output: 0 for crop, 1 for scale and display background, 2 for scale and display black background, 3 for variable-scale scaling, 4 for custom rendering. defaults to 3 if left blank. 
     * @return BackgroundRenderMode The display mode of the sub-background image in the output: 0 for crop, 1 for scale and display background, 2 for scale and display black background, 3 for variable-scale scaling, 4 for custom rendering. defaults to 3 if left blank.
     */
    public Long getBackgroundRenderMode() {
        return this.BackgroundRenderMode;
    }

    /**
     * Set The display mode of the sub-background image in the output: 0 for crop, 1 for scale and display background, 2 for scale and display black background, 3 for variable-scale scaling, 4 for custom rendering. defaults to 3 if left blank.
     * @param BackgroundRenderMode The display mode of the sub-background image in the output: 0 for crop, 1 for scale and display background, 2 for scale and display black background, 3 for variable-scale scaling, 4 for custom rendering. defaults to 3 if left blank.
     */
    public void setBackgroundRenderMode(Long BackgroundRenderMode) {
        this.BackgroundRenderMode = BackgroundRenderMode;
    }

    /**
     * Get The sub-screen template url points to a template image with an alpha channel. fill in this parameter, and the backend will extract the alpha channel of the template image during compositing, scale it as the alpha channel of the target frame, and mix it with other frames. you can use the transparent template to achieve a semi-transparent effect and arbitrary shape cropping (such as rounded corners, stars, hearts) for the target frame. png format is supported. the image size limit is no more than 5MB.
Note:.
1. the image aspect ratio of the template should be close to the target frame aspect ratio to avoid deformation of the template effect when scaling to fit the target frame. 2. the transparent template only takes effect when RenderMode is 0 (crop). 3. make sure the image link is accessible. the backend single download timeout period is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the transparent template will not take effect.
2. url supported character sets: ['0-9','a-z','a-z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if characters outside the supported character sets exist, the transparent template will not take effect. 
     * @return TransparentUrl The sub-screen template url points to a template image with an alpha channel. fill in this parameter, and the backend will extract the alpha channel of the template image during compositing, scale it as the alpha channel of the target frame, and mix it with other frames. you can use the transparent template to achieve a semi-transparent effect and arbitrary shape cropping (such as rounded corners, stars, hearts) for the target frame. png format is supported. the image size limit is no more than 5MB.
Note:.
1. the image aspect ratio of the template should be close to the target frame aspect ratio to avoid deformation of the template effect when scaling to fit the target frame. 2. the transparent template only takes effect when RenderMode is 0 (crop). 3. make sure the image link is accessible. the backend single download timeout period is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the transparent template will not take effect.
2. url supported character sets: ['0-9','a-z','a-z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if characters outside the supported character sets exist, the transparent template will not take effect.
     */
    public String getTransparentUrl() {
        return this.TransparentUrl;
    }

    /**
     * Set The sub-screen template url points to a template image with an alpha channel. fill in this parameter, and the backend will extract the alpha channel of the template image during compositing, scale it as the alpha channel of the target frame, and mix it with other frames. you can use the transparent template to achieve a semi-transparent effect and arbitrary shape cropping (such as rounded corners, stars, hearts) for the target frame. png format is supported. the image size limit is no more than 5MB.
Note:.
1. the image aspect ratio of the template should be close to the target frame aspect ratio to avoid deformation of the template effect when scaling to fit the target frame. 2. the transparent template only takes effect when RenderMode is 0 (crop). 3. make sure the image link is accessible. the backend single download timeout period is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the transparent template will not take effect.
2. url supported character sets: ['0-9','a-z','a-z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if characters outside the supported character sets exist, the transparent template will not take effect.
     * @param TransparentUrl The sub-screen template url points to a template image with an alpha channel. fill in this parameter, and the backend will extract the alpha channel of the template image during compositing, scale it as the alpha channel of the target frame, and mix it with other frames. you can use the transparent template to achieve a semi-transparent effect and arbitrary shape cropping (such as rounded corners, stars, hearts) for the target frame. png format is supported. the image size limit is no more than 5MB.
Note:.
1. the image aspect ratio of the template should be close to the target frame aspect ratio to avoid deformation of the template effect when scaling to fit the target frame. 2. the transparent template only takes effect when RenderMode is 0 (crop). 3. make sure the image link is accessible. the backend single download timeout period is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the transparent template will not take effect.
2. url supported character sets: ['0-9','a-z','a-z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if characters outside the supported character sets exist, the transparent template will not take effect.
     */
    public void setTransparentUrl(String TransparentUrl) {
        this.TransparentUrl = TransparentUrl;
    }

    /**
     * Get  
     * @return BackgroundCustomRender 
     */
    public McuBackgroundCustomRender getBackgroundCustomRender() {
        return this.BackgroundCustomRender;
    }

    /**
     * Set 
     * @param BackgroundCustomRender 
     */
    public void setBackgroundCustomRender(McuBackgroundCustomRender BackgroundCustomRender) {
        this.BackgroundCustomRender = BackgroundCustomRender;
    }

    /**
     * Get Sub-Background color effective mode. default value 0 means disabled.
bit0 specifies whether placeholder image scaling takes effect.
bit1 specifies whether upstream flow scaling takes effect.
You can set the corresponding bit position to 1 to start up and take effect, such as:.
0(00) means the sub background color is disabled.
1(01) indicates the sub-background color is valid only when placeholder image scaling is enabled.
2(10) means the sub background color is valid only when upstream flow scaling.
3(11) indicates the sub-background color takes effect in both placeholder image scaling and upstream flow scaling.
 
     * @return BackGroundColorMode Sub-Background color effective mode. default value 0 means disabled.
bit0 specifies whether placeholder image scaling takes effect.
bit1 specifies whether upstream flow scaling takes effect.
You can set the corresponding bit position to 1 to start up and take effect, such as:.
0(00) means the sub background color is disabled.
1(01) indicates the sub-background color is valid only when placeholder image scaling is enabled.
2(10) means the sub background color is valid only when upstream flow scaling.
3(11) indicates the sub-background color takes effect in both placeholder image scaling and upstream flow scaling.

     */
    public Long getBackGroundColorMode() {
        return this.BackGroundColorMode;
    }

    /**
     * Set Sub-Background color effective mode. default value 0 means disabled.
bit0 specifies whether placeholder image scaling takes effect.
bit1 specifies whether upstream flow scaling takes effect.
You can set the corresponding bit position to 1 to start up and take effect, such as:.
0(00) means the sub background color is disabled.
1(01) indicates the sub-background color is valid only when placeholder image scaling is enabled.
2(10) means the sub background color is valid only when upstream flow scaling.
3(11) indicates the sub-background color takes effect in both placeholder image scaling and upstream flow scaling.

     * @param BackGroundColorMode Sub-Background color effective mode. default value 0 means disabled.
bit0 specifies whether placeholder image scaling takes effect.
bit1 specifies whether upstream flow scaling takes effect.
You can set the corresponding bit position to 1 to start up and take effect, such as:.
0(00) means the sub background color is disabled.
1(01) indicates the sub-background color is valid only when placeholder image scaling is enabled.
2(10) means the sub background color is valid only when upstream flow scaling.
3(11) indicates the sub-background color takes effect in both placeholder image scaling and upstream flow scaling.

     */
    public void setBackGroundColorMode(Long BackGroundColorMode) {
        this.BackGroundColorMode = BackGroundColorMode;
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
        if (source.TransparentUrl != null) {
            this.TransparentUrl = new String(source.TransparentUrl);
        }
        if (source.BackgroundCustomRender != null) {
            this.BackgroundCustomRender = new McuBackgroundCustomRender(source.BackgroundCustomRender);
        }
        if (source.BackGroundColorMode != null) {
            this.BackGroundColorMode = new Long(source.BackGroundColorMode);
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
        this.setParamSimple(map, prefix + "TransparentUrl", this.TransparentUrl);
        this.setParamObj(map, prefix + "BackgroundCustomRender.", this.BackgroundCustomRender);
        this.setParamSimple(map, prefix + "BackGroundColorMode", this.BackGroundColorMode);

    }
}

