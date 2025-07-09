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

public class MixLayout extends AbstractModel {

    /**
    * The Y axis of the window’s top-left corner. Value range: [0, 1920]. The value cannot be larger than the canvas height.
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * The X axis of the window’s top-left corner. Value range: [0, 1920]. The value cannot be larger than the canvas width.
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
    * The relative width of the window. Value range: [0, 1920]. The sum of the values of this parameter and `Left` cannot exceed the canvas width.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The relative height of the window. Value range: [0, 1920]. The sum of the values of this parameter and `Top` cannot exceed the canvas height.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * The user ID (string) of the anchor whose video is shown in the window. If you do not set this parameter, anchors’ videos will be shown in their room entry sequence.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * The degree of transparency of the canvas. Value range: [0, 255]. 0 means fully opaque, and 255 means fully transparent.
    */
    @SerializedName("Alpha")
    @Expose
    private Long Alpha;

    /**
    * 0: Stretch. In this mode, the image is stretched to fill the space available. The whole image is visible after scaling. However, if the original aspect ratio is different from the target, the image may be distorted.

1: Crop (default). In this mode, if the original aspect ratio is different from the target, the image will be cropped according to the target before being stretched to fill the space available. The image will not be distorted.

2: Blank. This mode stretches the image while keeping its original aspect ratio. If the original aspect ratio is different from the target, there may be blank spaces to the top and bottom or to the left and right of the window.

3: Smart stretch. This mode is similar to the crop mode, except that it restricts cropping to 20% of the image’s width or height at most.
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
    * The type of the stream subscribed to.
0: Primary stream (default)
1: Substream
    */
    @SerializedName("MediaId")
    @Expose
    private Long MediaId;

    /**
    * The image layer. 0 is the default value and means the bottommost layer.
    */
    @SerializedName("ImageLayer")
    @Expose
    private Long ImageLayer;

    /**
    * The URL of the background image for a window. The image must be in JPG or PNG format and cannot be larger than 5 MB. If the image’s aspect ratio is different from that of the window, the image will be rendered according to the value of `RenderMode`.
    */
    @SerializedName("SubBackgroundImage")
    @Expose
    private String SubBackgroundImage;

    /**
     * Get The Y axis of the window’s top-left corner. Value range: [0, 1920]. The value cannot be larger than the canvas height. 
     * @return Top The Y axis of the window’s top-left corner. Value range: [0, 1920]. The value cannot be larger than the canvas height.
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set The Y axis of the window’s top-left corner. Value range: [0, 1920]. The value cannot be larger than the canvas height.
     * @param Top The Y axis of the window’s top-left corner. Value range: [0, 1920]. The value cannot be larger than the canvas height.
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get The X axis of the window’s top-left corner. Value range: [0, 1920]. The value cannot be larger than the canvas width. 
     * @return Left The X axis of the window’s top-left corner. Value range: [0, 1920]. The value cannot be larger than the canvas width.
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * Set The X axis of the window’s top-left corner. Value range: [0, 1920]. The value cannot be larger than the canvas width.
     * @param Left The X axis of the window’s top-left corner. Value range: [0, 1920]. The value cannot be larger than the canvas width.
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    /**
     * Get The relative width of the window. Value range: [0, 1920]. The sum of the values of this parameter and `Left` cannot exceed the canvas width. 
     * @return Width The relative width of the window. Value range: [0, 1920]. The sum of the values of this parameter and `Left` cannot exceed the canvas width.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The relative width of the window. Value range: [0, 1920]. The sum of the values of this parameter and `Left` cannot exceed the canvas width.
     * @param Width The relative width of the window. Value range: [0, 1920]. The sum of the values of this parameter and `Left` cannot exceed the canvas width.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The relative height of the window. Value range: [0, 1920]. The sum of the values of this parameter and `Top` cannot exceed the canvas height. 
     * @return Height The relative height of the window. Value range: [0, 1920]. The sum of the values of this parameter and `Top` cannot exceed the canvas height.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The relative height of the window. Value range: [0, 1920]. The sum of the values of this parameter and `Top` cannot exceed the canvas height.
     * @param Height The relative height of the window. Value range: [0, 1920]. The sum of the values of this parameter and `Top` cannot exceed the canvas height.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get The user ID (string) of the anchor whose video is shown in the window. If you do not set this parameter, anchors’ videos will be shown in their room entry sequence. 
     * @return UserId The user ID (string) of the anchor whose video is shown in the window. If you do not set this parameter, anchors’ videos will be shown in their room entry sequence.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The user ID (string) of the anchor whose video is shown in the window. If you do not set this parameter, anchors’ videos will be shown in their room entry sequence.
     * @param UserId The user ID (string) of the anchor whose video is shown in the window. If you do not set this parameter, anchors’ videos will be shown in their room entry sequence.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get The degree of transparency of the canvas. Value range: [0, 255]. 0 means fully opaque, and 255 means fully transparent. 
     * @return Alpha The degree of transparency of the canvas. Value range: [0, 255]. 0 means fully opaque, and 255 means fully transparent.
     */
    public Long getAlpha() {
        return this.Alpha;
    }

    /**
     * Set The degree of transparency of the canvas. Value range: [0, 255]. 0 means fully opaque, and 255 means fully transparent.
     * @param Alpha The degree of transparency of the canvas. Value range: [0, 255]. 0 means fully opaque, and 255 means fully transparent.
     */
    public void setAlpha(Long Alpha) {
        this.Alpha = Alpha;
    }

    /**
     * Get 0: Stretch. In this mode, the image is stretched to fill the space available. The whole image is visible after scaling. However, if the original aspect ratio is different from the target, the image may be distorted.

1: Crop (default). In this mode, if the original aspect ratio is different from the target, the image will be cropped according to the target before being stretched to fill the space available. The image will not be distorted.

2: Blank. This mode stretches the image while keeping its original aspect ratio. If the original aspect ratio is different from the target, there may be blank spaces to the top and bottom or to the left and right of the window.

3: Smart stretch. This mode is similar to the crop mode, except that it restricts cropping to 20% of the image’s width or height at most. 
     * @return RenderMode 0: Stretch. In this mode, the image is stretched to fill the space available. The whole image is visible after scaling. However, if the original aspect ratio is different from the target, the image may be distorted.

1: Crop (default). In this mode, if the original aspect ratio is different from the target, the image will be cropped according to the target before being stretched to fill the space available. The image will not be distorted.

2: Blank. This mode stretches the image while keeping its original aspect ratio. If the original aspect ratio is different from the target, there may be blank spaces to the top and bottom or to the left and right of the window.

3: Smart stretch. This mode is similar to the crop mode, except that it restricts cropping to 20% of the image’s width or height at most.
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set 0: Stretch. In this mode, the image is stretched to fill the space available. The whole image is visible after scaling. However, if the original aspect ratio is different from the target, the image may be distorted.

1: Crop (default). In this mode, if the original aspect ratio is different from the target, the image will be cropped according to the target before being stretched to fill the space available. The image will not be distorted.

2: Blank. This mode stretches the image while keeping its original aspect ratio. If the original aspect ratio is different from the target, there may be blank spaces to the top and bottom or to the left and right of the window.

3: Smart stretch. This mode is similar to the crop mode, except that it restricts cropping to 20% of the image’s width or height at most.
     * @param RenderMode 0: Stretch. In this mode, the image is stretched to fill the space available. The whole image is visible after scaling. However, if the original aspect ratio is different from the target, the image may be distorted.

1: Crop (default). In this mode, if the original aspect ratio is different from the target, the image will be cropped according to the target before being stretched to fill the space available. The image will not be distorted.

2: Blank. This mode stretches the image while keeping its original aspect ratio. If the original aspect ratio is different from the target, there may be blank spaces to the top and bottom or to the left and right of the window.

3: Smart stretch. This mode is similar to the crop mode, except that it restricts cropping to 20% of the image’s width or height at most.
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    /**
     * Get The type of the stream subscribed to.
0: Primary stream (default)
1: Substream 
     * @return MediaId The type of the stream subscribed to.
0: Primary stream (default)
1: Substream
     */
    public Long getMediaId() {
        return this.MediaId;
    }

    /**
     * Set The type of the stream subscribed to.
0: Primary stream (default)
1: Substream
     * @param MediaId The type of the stream subscribed to.
0: Primary stream (default)
1: Substream
     */
    public void setMediaId(Long MediaId) {
        this.MediaId = MediaId;
    }

    /**
     * Get The image layer. 0 is the default value and means the bottommost layer. 
     * @return ImageLayer The image layer. 0 is the default value and means the bottommost layer.
     */
    public Long getImageLayer() {
        return this.ImageLayer;
    }

    /**
     * Set The image layer. 0 is the default value and means the bottommost layer.
     * @param ImageLayer The image layer. 0 is the default value and means the bottommost layer.
     */
    public void setImageLayer(Long ImageLayer) {
        this.ImageLayer = ImageLayer;
    }

    /**
     * Get The URL of the background image for a window. The image must be in JPG or PNG format and cannot be larger than 5 MB. If the image’s aspect ratio is different from that of the window, the image will be rendered according to the value of `RenderMode`. 
     * @return SubBackgroundImage The URL of the background image for a window. The image must be in JPG or PNG format and cannot be larger than 5 MB. If the image’s aspect ratio is different from that of the window, the image will be rendered according to the value of `RenderMode`.
     */
    public String getSubBackgroundImage() {
        return this.SubBackgroundImage;
    }

    /**
     * Set The URL of the background image for a window. The image must be in JPG or PNG format and cannot be larger than 5 MB. If the image’s aspect ratio is different from that of the window, the image will be rendered according to the value of `RenderMode`.
     * @param SubBackgroundImage The URL of the background image for a window. The image must be in JPG or PNG format and cannot be larger than 5 MB. If the image’s aspect ratio is different from that of the window, the image will be rendered according to the value of `RenderMode`.
     */
    public void setSubBackgroundImage(String SubBackgroundImage) {
        this.SubBackgroundImage = SubBackgroundImage;
    }

    public MixLayout() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MixLayout(MixLayout source) {
        if (source.Top != null) {
            this.Top = new Long(source.Top);
        }
        if (source.Left != null) {
            this.Left = new Long(source.Left);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Alpha != null) {
            this.Alpha = new Long(source.Alpha);
        }
        if (source.RenderMode != null) {
            this.RenderMode = new Long(source.RenderMode);
        }
        if (source.MediaId != null) {
            this.MediaId = new Long(source.MediaId);
        }
        if (source.ImageLayer != null) {
            this.ImageLayer = new Long(source.ImageLayer);
        }
        if (source.SubBackgroundImage != null) {
            this.SubBackgroundImage = new String(source.SubBackgroundImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "Left", this.Left);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Alpha", this.Alpha);
        this.setParamSimple(map, prefix + "RenderMode", this.RenderMode);
        this.setParamSimple(map, prefix + "MediaId", this.MediaId);
        this.setParamSimple(map, prefix + "ImageLayer", this.ImageLayer);
        this.setParamSimple(map, prefix + "SubBackgroundImage", this.SubBackgroundImage);

    }
}

