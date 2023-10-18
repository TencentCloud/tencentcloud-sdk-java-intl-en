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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeImageItem extends AbstractModel {

    /**
    * The media information of the element.
    */
    @SerializedName("SourceMedia")
    @Expose
    private ComposeSourceMedia SourceMedia;

    /**
    * The time of the element in the timeline. If this is not specified, the element will follow the previous element.
    */
    @SerializedName("TrackTime")
    @Expose
    private ComposeTrackTime TrackTime;

    /**
    * The horizontal distance of the element's center from the canvas origin. Two formats are supported:
<li>If the value ends with %, it specifies the distance as a percentage of the canvas width. For example, `10%` means that the distance is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the distance in pixels. For example, `100px` means that the distance is 100 pixels. </li>
Default value: `50%`.
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * The vertical distance of the element's center from the canvas origin. Two formats are supported:
u200c<li>If the value ends with %, it specifies the distance as a percentage of the canvas height. For example, `10%` means that the distance is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the distance in pixels. For example, `100px` means that the distance is 100 pixels. </li>
Default value: `50%`.
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * The width of the video segment. Two formats are supported:
u200c<li>If the value ends with %, it specifies the width as a percentage of the canvas width. For example, `10%` means that the video width is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the width in pixels. For example, `100px` means that the video width is 100 pixels. </li>
If one or both parameters are empty or set to `0`:
<li>If both `Width` and `Height` are empty, the original width and height of the element will be kept. </li>
<li>If `Width` is empty and `Height` is not, the width will be auto scaled. </li>
<li>If `Width` is not empty and `Height` is, the height will be auto scaled. </li>
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * The height of the element. Two formats are supported:
u200c<li>If the value ends with %, it specifies the height as a percentage of the canvas height. For example, `10%` means that the height is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the height in pixels. For example, `100px` means that the height is 100 pixels. </li>
If one or both parameters are empty or set to `0`:
<li>If both `Width` and `Height` are empty, the original width and height of the video will be kept. </li>
<li>If `Width` is empty and `Height` is not, the width will be auto scaled. </li>
<li>If `Width` is not empty and `Height` is, the height will be auto scaled. </li>
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * The image operations, such as image rotation.
    */
    @SerializedName("ImageOperations")
    @Expose
    private ComposeImageOperation [] ImageOperations;

    /**
     * Get The media information of the element. 
     * @return SourceMedia The media information of the element.
     */
    public ComposeSourceMedia getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set The media information of the element.
     * @param SourceMedia The media information of the element.
     */
    public void setSourceMedia(ComposeSourceMedia SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * Get The time of the element in the timeline. If this is not specified, the element will follow the previous element. 
     * @return TrackTime The time of the element in the timeline. If this is not specified, the element will follow the previous element.
     */
    public ComposeTrackTime getTrackTime() {
        return this.TrackTime;
    }

    /**
     * Set The time of the element in the timeline. If this is not specified, the element will follow the previous element.
     * @param TrackTime The time of the element in the timeline. If this is not specified, the element will follow the previous element.
     */
    public void setTrackTime(ComposeTrackTime TrackTime) {
        this.TrackTime = TrackTime;
    }

    /**
     * Get The horizontal distance of the element's center from the canvas origin. Two formats are supported:
<li>If the value ends with %, it specifies the distance as a percentage of the canvas width. For example, `10%` means that the distance is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the distance in pixels. For example, `100px` means that the distance is 100 pixels. </li>
Default value: `50%`. 
     * @return XPos The horizontal distance of the element's center from the canvas origin. Two formats are supported:
<li>If the value ends with %, it specifies the distance as a percentage of the canvas width. For example, `10%` means that the distance is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the distance in pixels. For example, `100px` means that the distance is 100 pixels. </li>
Default value: `50%`.
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set The horizontal distance of the element's center from the canvas origin. Two formats are supported:
<li>If the value ends with %, it specifies the distance as a percentage of the canvas width. For example, `10%` means that the distance is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the distance in pixels. For example, `100px` means that the distance is 100 pixels. </li>
Default value: `50%`.
     * @param XPos The horizontal distance of the element's center from the canvas origin. Two formats are supported:
<li>If the value ends with %, it specifies the distance as a percentage of the canvas width. For example, `10%` means that the distance is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the distance in pixels. For example, `100px` means that the distance is 100 pixels. </li>
Default value: `50%`.
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get The vertical distance of the element's center from the canvas origin. Two formats are supported:
u200c<li>If the value ends with %, it specifies the distance as a percentage of the canvas height. For example, `10%` means that the distance is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the distance in pixels. For example, `100px` means that the distance is 100 pixels. </li>
Default value: `50%`. 
     * @return YPos The vertical distance of the element's center from the canvas origin. Two formats are supported:
u200c<li>If the value ends with %, it specifies the distance as a percentage of the canvas height. For example, `10%` means that the distance is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the distance in pixels. For example, `100px` means that the distance is 100 pixels. </li>
Default value: `50%`.
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set The vertical distance of the element's center from the canvas origin. Two formats are supported:
u200c<li>If the value ends with %, it specifies the distance as a percentage of the canvas height. For example, `10%` means that the distance is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the distance in pixels. For example, `100px` means that the distance is 100 pixels. </li>
Default value: `50%`.
     * @param YPos The vertical distance of the element's center from the canvas origin. Two formats are supported:
u200c<li>If the value ends with %, it specifies the distance as a percentage of the canvas height. For example, `10%` means that the distance is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the distance in pixels. For example, `100px` means that the distance is 100 pixels. </li>
Default value: `50%`.
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get The width of the video segment. Two formats are supported:
u200c<li>If the value ends with %, it specifies the width as a percentage of the canvas width. For example, `10%` means that the video width is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the width in pixels. For example, `100px` means that the video width is 100 pixels. </li>
If one or both parameters are empty or set to `0`:
<li>If both `Width` and `Height` are empty, the original width and height of the element will be kept. </li>
<li>If `Width` is empty and `Height` is not, the width will be auto scaled. </li>
<li>If `Width` is not empty and `Height` is, the height will be auto scaled. </li> 
     * @return Width The width of the video segment. Two formats are supported:
u200c<li>If the value ends with %, it specifies the width as a percentage of the canvas width. For example, `10%` means that the video width is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the width in pixels. For example, `100px` means that the video width is 100 pixels. </li>
If one or both parameters are empty or set to `0`:
<li>If both `Width` and `Height` are empty, the original width and height of the element will be kept. </li>
<li>If `Width` is empty and `Height` is not, the width will be auto scaled. </li>
<li>If `Width` is not empty and `Height` is, the height will be auto scaled. </li>
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set The width of the video segment. Two formats are supported:
u200c<li>If the value ends with %, it specifies the width as a percentage of the canvas width. For example, `10%` means that the video width is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the width in pixels. For example, `100px` means that the video width is 100 pixels. </li>
If one or both parameters are empty or set to `0`:
<li>If both `Width` and `Height` are empty, the original width and height of the element will be kept. </li>
<li>If `Width` is empty and `Height` is not, the width will be auto scaled. </li>
<li>If `Width` is not empty and `Height` is, the height will be auto scaled. </li>
     * @param Width The width of the video segment. Two formats are supported:
u200c<li>If the value ends with %, it specifies the width as a percentage of the canvas width. For example, `10%` means that the video width is 10% of the canvas width. </li>
u200c<li>If the value ends with px, it specifies the width in pixels. For example, `100px` means that the video width is 100 pixels. </li>
If one or both parameters are empty or set to `0`:
<li>If both `Width` and `Height` are empty, the original width and height of the element will be kept. </li>
<li>If `Width` is empty and `Height` is not, the width will be auto scaled. </li>
<li>If `Width` is not empty and `Height` is, the height will be auto scaled. </li>
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get The height of the element. Two formats are supported:
u200c<li>If the value ends with %, it specifies the height as a percentage of the canvas height. For example, `10%` means that the height is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the height in pixels. For example, `100px` means that the height is 100 pixels. </li>
If one or both parameters are empty or set to `0`:
<li>If both `Width` and `Height` are empty, the original width and height of the video will be kept. </li>
<li>If `Width` is empty and `Height` is not, the width will be auto scaled. </li>
<li>If `Width` is not empty and `Height` is, the height will be auto scaled. </li> 
     * @return Height The height of the element. Two formats are supported:
u200c<li>If the value ends with %, it specifies the height as a percentage of the canvas height. For example, `10%` means that the height is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the height in pixels. For example, `100px` means that the height is 100 pixels. </li>
If one or both parameters are empty or set to `0`:
<li>If both `Width` and `Height` are empty, the original width and height of the video will be kept. </li>
<li>If `Width` is empty and `Height` is not, the width will be auto scaled. </li>
<li>If `Width` is not empty and `Height` is, the height will be auto scaled. </li>
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set The height of the element. Two formats are supported:
u200c<li>If the value ends with %, it specifies the height as a percentage of the canvas height. For example, `10%` means that the height is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the height in pixels. For example, `100px` means that the height is 100 pixels. </li>
If one or both parameters are empty or set to `0`:
<li>If both `Width` and `Height` are empty, the original width and height of the video will be kept. </li>
<li>If `Width` is empty and `Height` is not, the width will be auto scaled. </li>
<li>If `Width` is not empty and `Height` is, the height will be auto scaled. </li>
     * @param Height The height of the element. Two formats are supported:
u200c<li>If the value ends with %, it specifies the height as a percentage of the canvas height. For example, `10%` means that the height is 10% of the canvas height. </li>
u200c<li>If the value ends with px, it specifies the height in pixels. For example, `100px` means that the height is 100 pixels. </li>
If one or both parameters are empty or set to `0`:
<li>If both `Width` and `Height` are empty, the original width and height of the video will be kept. </li>
<li>If `Width` is empty and `Height` is not, the width will be auto scaled. </li>
<li>If `Width` is not empty and `Height` is, the height will be auto scaled. </li>
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get The image operations, such as image rotation. 
     * @return ImageOperations The image operations, such as image rotation.
     */
    public ComposeImageOperation [] getImageOperations() {
        return this.ImageOperations;
    }

    /**
     * Set The image operations, such as image rotation.
     * @param ImageOperations The image operations, such as image rotation.
     */
    public void setImageOperations(ComposeImageOperation [] ImageOperations) {
        this.ImageOperations = ImageOperations;
    }

    public ComposeImageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeImageItem(ComposeImageItem source) {
        if (source.SourceMedia != null) {
            this.SourceMedia = new ComposeSourceMedia(source.SourceMedia);
        }
        if (source.TrackTime != null) {
            this.TrackTime = new ComposeTrackTime(source.TrackTime);
        }
        if (source.XPos != null) {
            this.XPos = new String(source.XPos);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.ImageOperations != null) {
            this.ImageOperations = new ComposeImageOperation[source.ImageOperations.length];
            for (int i = 0; i < source.ImageOperations.length; i++) {
                this.ImageOperations[i] = new ComposeImageOperation(source.ImageOperations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SourceMedia.", this.SourceMedia);
        this.setParamObj(map, prefix + "TrackTime.", this.TrackTime);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamArrayObj(map, prefix + "ImageOperations.", this.ImageOperations);

    }
}

