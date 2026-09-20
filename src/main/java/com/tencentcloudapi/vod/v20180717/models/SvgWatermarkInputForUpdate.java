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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SvgWatermarkInputForUpdate extends AbstractModel {

    /**
    * Width of a watermark, supporting six formats: px, %, W%, H%, S%, and L%.
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels. If 0px is entered and
When Height is not 0px, it means the width of the watermark is proportionally scaled based on the original SVG image. When both Width and Height are set to 0px, it means the width of the watermark is the width of the original SVG image.</li>
<li>If a string ends with W%, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10W%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with H%, it indicates that the `Width` of a watermark is a percentage of a video's height. For example, `10H%` means that `Width` is 10% of a video's height.</li>
<li>If a string ends with S%, it indicates that the `Width` of a watermark is a percentage of a video's short side. For example, `10S%` means that `Width` is 10% of a video's short side.</li>
<li>If a string ends with L%, it indicates that the `Width` of a watermark is a percentage of the long side of the video. For example, `10L%` means that `Width` is 10% of the long side of the video.</li>
<li>When the string ends with %, it has the same meaning as W%.</li>
Default value: 10W%.
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * Height of a watermark, supporting six formats: px, %, W%, H%, S%, and L%.
<li>If a string ends with px, it means the watermark Height is in pixels. For example, 100px means the Height is 100 pixels. If 0px is entered and
When Width is not 0px, it means the height of the watermark is proportionally scaled based on the original SVG image. When both Width and Height are set to 0px, it means the height of the watermark is the height of the original SVG image.</li>
<li>If a string ends with W%, it indicates that the `Height` of a watermark is a percentage of a video's width. For example, `10W%` means that `Height` is 10% of a video's width.</li>
<li>If a string ends with H%, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10H%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with S%, it indicates that the `Height` of a watermark is a percentage of a video's short side. For example, `10S%` means that `Height` is 10% of a video's short side.</li>
<li>If a string ends with L%, it indicates that the `Height` of a watermark is a percentage of the video long side. For example, `10L%` means that `Height` is 10% of the video long side.</li>
<li>When the string ends with %, it has the same meaning as H%.</li>
Default value: 0px.
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * Watermark cycle configuration, for configuring the periodic display and hiding of watermarks.
Main usage scenarios: to prevent watermark occlusion in videos, set watermarks in multiple places. These watermarks are displayed and hidden periodically in a fixed sequence.
For example, set four watermarks A, B, C, and D at the upper left corner, upper right corner, bottom-right corner, and bottom-left corner of the video respectively. When the video starts, { A displays for 5 seconds -> B displays for 5 seconds -> C displays for 5 seconds -> D displays for 5 seconds } -> A displays for 5 seconds -> B displays for 5 seconds -> ..., and only one watermark is displayed at any time.
Curly braces {} represent a long cycle consisting of 4 watermarks: A, B, C, and D. You can see each long cycle lasts 20 seconds.
You can see that A, B, C, and D are all displayed for 5 seconds and hidden for 15 seconds periodically, and they have a fixed display order.
This configuration item is used to describe the cycle configuration of each watermark.
    */
    @SerializedName("CycleConfig")
    @Expose
    private WatermarkCycleConfigForUpdate CycleConfig;

    /**
     * Get Width of a watermark, supporting six formats: px, %, W%, H%, S%, and L%.
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels. If 0px is entered and
When Height is not 0px, it means the width of the watermark is proportionally scaled based on the original SVG image. When both Width and Height are set to 0px, it means the width of the watermark is the width of the original SVG image.</li>
<li>If a string ends with W%, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10W%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with H%, it indicates that the `Width` of a watermark is a percentage of a video's height. For example, `10H%` means that `Width` is 10% of a video's height.</li>
<li>If a string ends with S%, it indicates that the `Width` of a watermark is a percentage of a video's short side. For example, `10S%` means that `Width` is 10% of a video's short side.</li>
<li>If a string ends with L%, it indicates that the `Width` of a watermark is a percentage of the long side of the video. For example, `10L%` means that `Width` is 10% of the long side of the video.</li>
<li>When the string ends with %, it has the same meaning as W%.</li>
Default value: 10W%. 
     * @return Width Width of a watermark, supporting six formats: px, %, W%, H%, S%, and L%.
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels. If 0px is entered and
When Height is not 0px, it means the width of the watermark is proportionally scaled based on the original SVG image. When both Width and Height are set to 0px, it means the width of the watermark is the width of the original SVG image.</li>
<li>If a string ends with W%, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10W%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with H%, it indicates that the `Width` of a watermark is a percentage of a video's height. For example, `10H%` means that `Width` is 10% of a video's height.</li>
<li>If a string ends with S%, it indicates that the `Width` of a watermark is a percentage of a video's short side. For example, `10S%` means that `Width` is 10% of a video's short side.</li>
<li>If a string ends with L%, it indicates that the `Width` of a watermark is a percentage of the long side of the video. For example, `10L%` means that `Width` is 10% of the long side of the video.</li>
<li>When the string ends with %, it has the same meaning as W%.</li>
Default value: 10W%.
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set Width of a watermark, supporting six formats: px, %, W%, H%, S%, and L%.
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels. If 0px is entered and
When Height is not 0px, it means the width of the watermark is proportionally scaled based on the original SVG image. When both Width and Height are set to 0px, it means the width of the watermark is the width of the original SVG image.</li>
<li>If a string ends with W%, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10W%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with H%, it indicates that the `Width` of a watermark is a percentage of a video's height. For example, `10H%` means that `Width` is 10% of a video's height.</li>
<li>If a string ends with S%, it indicates that the `Width` of a watermark is a percentage of a video's short side. For example, `10S%` means that `Width` is 10% of a video's short side.</li>
<li>If a string ends with L%, it indicates that the `Width` of a watermark is a percentage of the long side of the video. For example, `10L%` means that `Width` is 10% of the long side of the video.</li>
<li>When the string ends with %, it has the same meaning as W%.</li>
Default value: 10W%.
     * @param Width Width of a watermark, supporting six formats: px, %, W%, H%, S%, and L%.
<li>If a string ends with px, it means the watermark Width is in pixels. For example, 100px means the Width is 100 pixels. If 0px is entered and
When Height is not 0px, it means the width of the watermark is proportionally scaled based on the original SVG image. When both Width and Height are set to 0px, it means the width of the watermark is the width of the original SVG image.</li>
<li>If a string ends with W%, it indicates that the `Width` of a watermark is a percentage of a video's width. For example, `10W%` means that `Width` is 10% of a video's width.</li>
<li>If a string ends with H%, it indicates that the `Width` of a watermark is a percentage of a video's height. For example, `10H%` means that `Width` is 10% of a video's height.</li>
<li>If a string ends with S%, it indicates that the `Width` of a watermark is a percentage of a video's short side. For example, `10S%` means that `Width` is 10% of a video's short side.</li>
<li>If a string ends with L%, it indicates that the `Width` of a watermark is a percentage of the long side of the video. For example, `10L%` means that `Width` is 10% of the long side of the video.</li>
<li>When the string ends with %, it has the same meaning as W%.</li>
Default value: 10W%.
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get Height of a watermark, supporting six formats: px, %, W%, H%, S%, and L%.
<li>If a string ends with px, it means the watermark Height is in pixels. For example, 100px means the Height is 100 pixels. If 0px is entered and
When Width is not 0px, it means the height of the watermark is proportionally scaled based on the original SVG image. When both Width and Height are set to 0px, it means the height of the watermark is the height of the original SVG image.</li>
<li>If a string ends with W%, it indicates that the `Height` of a watermark is a percentage of a video's width. For example, `10W%` means that `Height` is 10% of a video's width.</li>
<li>If a string ends with H%, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10H%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with S%, it indicates that the `Height` of a watermark is a percentage of a video's short side. For example, `10S%` means that `Height` is 10% of a video's short side.</li>
<li>If a string ends with L%, it indicates that the `Height` of a watermark is a percentage of the video long side. For example, `10L%` means that `Height` is 10% of the video long side.</li>
<li>When the string ends with %, it has the same meaning as H%.</li>
Default value: 0px. 
     * @return Height Height of a watermark, supporting six formats: px, %, W%, H%, S%, and L%.
<li>If a string ends with px, it means the watermark Height is in pixels. For example, 100px means the Height is 100 pixels. If 0px is entered and
When Width is not 0px, it means the height of the watermark is proportionally scaled based on the original SVG image. When both Width and Height are set to 0px, it means the height of the watermark is the height of the original SVG image.</li>
<li>If a string ends with W%, it indicates that the `Height` of a watermark is a percentage of a video's width. For example, `10W%` means that `Height` is 10% of a video's width.</li>
<li>If a string ends with H%, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10H%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with S%, it indicates that the `Height` of a watermark is a percentage of a video's short side. For example, `10S%` means that `Height` is 10% of a video's short side.</li>
<li>If a string ends with L%, it indicates that the `Height` of a watermark is a percentage of the video long side. For example, `10L%` means that `Height` is 10% of the video long side.</li>
<li>When the string ends with %, it has the same meaning as H%.</li>
Default value: 0px.
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set Height of a watermark, supporting six formats: px, %, W%, H%, S%, and L%.
<li>If a string ends with px, it means the watermark Height is in pixels. For example, 100px means the Height is 100 pixels. If 0px is entered and
When Width is not 0px, it means the height of the watermark is proportionally scaled based on the original SVG image. When both Width and Height are set to 0px, it means the height of the watermark is the height of the original SVG image.</li>
<li>If a string ends with W%, it indicates that the `Height` of a watermark is a percentage of a video's width. For example, `10W%` means that `Height` is 10% of a video's width.</li>
<li>If a string ends with H%, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10H%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with S%, it indicates that the `Height` of a watermark is a percentage of a video's short side. For example, `10S%` means that `Height` is 10% of a video's short side.</li>
<li>If a string ends with L%, it indicates that the `Height` of a watermark is a percentage of the video long side. For example, `10L%` means that `Height` is 10% of the video long side.</li>
<li>When the string ends with %, it has the same meaning as H%.</li>
Default value: 0px.
     * @param Height Height of a watermark, supporting six formats: px, %, W%, H%, S%, and L%.
<li>If a string ends with px, it means the watermark Height is in pixels. For example, 100px means the Height is 100 pixels. If 0px is entered and
When Width is not 0px, it means the height of the watermark is proportionally scaled based on the original SVG image. When both Width and Height are set to 0px, it means the height of the watermark is the height of the original SVG image.</li>
<li>If a string ends with W%, it indicates that the `Height` of a watermark is a percentage of a video's width. For example, `10W%` means that `Height` is 10% of a video's width.</li>
<li>If a string ends with H%, it indicates that the `Height` of a watermark is a percentage of a video's height. For example, `10H%` means that `Height` is 10% of a video's height.</li>
<li>If a string ends with S%, it indicates that the `Height` of a watermark is a percentage of a video's short side. For example, `10S%` means that `Height` is 10% of a video's short side.</li>
<li>If a string ends with L%, it indicates that the `Height` of a watermark is a percentage of the video long side. For example, `10L%` means that `Height` is 10% of the video long side.</li>
<li>When the string ends with %, it has the same meaning as H%.</li>
Default value: 0px.
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get Watermark cycle configuration, for configuring the periodic display and hiding of watermarks.
Main usage scenarios: to prevent watermark occlusion in videos, set watermarks in multiple places. These watermarks are displayed and hidden periodically in a fixed sequence.
For example, set four watermarks A, B, C, and D at the upper left corner, upper right corner, bottom-right corner, and bottom-left corner of the video respectively. When the video starts, { A displays for 5 seconds -> B displays for 5 seconds -> C displays for 5 seconds -> D displays for 5 seconds } -> A displays for 5 seconds -> B displays for 5 seconds -> ..., and only one watermark is displayed at any time.
Curly braces {} represent a long cycle consisting of 4 watermarks: A, B, C, and D. You can see each long cycle lasts 20 seconds.
You can see that A, B, C, and D are all displayed for 5 seconds and hidden for 15 seconds periodically, and they have a fixed display order.
This configuration item is used to describe the cycle configuration of each watermark. 
     * @return CycleConfig Watermark cycle configuration, for configuring the periodic display and hiding of watermarks.
Main usage scenarios: to prevent watermark occlusion in videos, set watermarks in multiple places. These watermarks are displayed and hidden periodically in a fixed sequence.
For example, set four watermarks A, B, C, and D at the upper left corner, upper right corner, bottom-right corner, and bottom-left corner of the video respectively. When the video starts, { A displays for 5 seconds -> B displays for 5 seconds -> C displays for 5 seconds -> D displays for 5 seconds } -> A displays for 5 seconds -> B displays for 5 seconds -> ..., and only one watermark is displayed at any time.
Curly braces {} represent a long cycle consisting of 4 watermarks: A, B, C, and D. You can see each long cycle lasts 20 seconds.
You can see that A, B, C, and D are all displayed for 5 seconds and hidden for 15 seconds periodically, and they have a fixed display order.
This configuration item is used to describe the cycle configuration of each watermark.
     * @deprecated
     */
    @Deprecated
    public WatermarkCycleConfigForUpdate getCycleConfig() {
        return this.CycleConfig;
    }

    /**
     * Set Watermark cycle configuration, for configuring the periodic display and hiding of watermarks.
Main usage scenarios: to prevent watermark occlusion in videos, set watermarks in multiple places. These watermarks are displayed and hidden periodically in a fixed sequence.
For example, set four watermarks A, B, C, and D at the upper left corner, upper right corner, bottom-right corner, and bottom-left corner of the video respectively. When the video starts, { A displays for 5 seconds -> B displays for 5 seconds -> C displays for 5 seconds -> D displays for 5 seconds } -> A displays for 5 seconds -> B displays for 5 seconds -> ..., and only one watermark is displayed at any time.
Curly braces {} represent a long cycle consisting of 4 watermarks: A, B, C, and D. You can see each long cycle lasts 20 seconds.
You can see that A, B, C, and D are all displayed for 5 seconds and hidden for 15 seconds periodically, and they have a fixed display order.
This configuration item is used to describe the cycle configuration of each watermark.
     * @param CycleConfig Watermark cycle configuration, for configuring the periodic display and hiding of watermarks.
Main usage scenarios: to prevent watermark occlusion in videos, set watermarks in multiple places. These watermarks are displayed and hidden periodically in a fixed sequence.
For example, set four watermarks A, B, C, and D at the upper left corner, upper right corner, bottom-right corner, and bottom-left corner of the video respectively. When the video starts, { A displays for 5 seconds -> B displays for 5 seconds -> C displays for 5 seconds -> D displays for 5 seconds } -> A displays for 5 seconds -> B displays for 5 seconds -> ..., and only one watermark is displayed at any time.
Curly braces {} represent a long cycle consisting of 4 watermarks: A, B, C, and D. You can see each long cycle lasts 20 seconds.
You can see that A, B, C, and D are all displayed for 5 seconds and hidden for 15 seconds periodically, and they have a fixed display order.
This configuration item is used to describe the cycle configuration of each watermark.
     * @deprecated
     */
    @Deprecated
    public void setCycleConfig(WatermarkCycleConfigForUpdate CycleConfig) {
        this.CycleConfig = CycleConfig;
    }

    public SvgWatermarkInputForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SvgWatermarkInputForUpdate(SvgWatermarkInputForUpdate source) {
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.CycleConfig != null) {
            this.CycleConfig = new WatermarkCycleConfigForUpdate(source.CycleConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamObj(map, prefix + "CycleConfig.", this.CycleConfig);

    }
}

