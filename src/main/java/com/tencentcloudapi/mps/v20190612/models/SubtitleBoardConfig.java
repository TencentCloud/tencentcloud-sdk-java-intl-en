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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleBoardConfig extends AbstractModel {

    /**
    * Subtitle suppression module background configuration switch, 0 for off, 1 for on, default 0
    */
    @SerializedName("SubtitleBoardConfigSwitch")
    @Expose
    private Long SubtitleBoardConfigSwitch;

    /**
    * Subtitle background base plate x-axis coordinate position; Supports pixel and percentage format:

- Pixel: Npx. Value range of N: [-4096,4096].
-Percentage: N%, N range: [-100,100]. For example, 10% means the X-coordinate of the subtitle background base plate is 10% of the source video width.

Default value: 0px.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the reference position of the subtitle base plate is at the bottom of the central axis, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

    */
    @SerializedName("BoardX")
    @Expose
    private Long BoardX;

    /**
    * BoardX unit, 0 pixel, 1 percentage, default is 0, pixel
    */
    @SerializedName("BoardXUnit")
    @Expose
    private Long BoardXUnit;

    /**
    * Subtitle background base plate y-axis coordinate position; Supports pixel and percentage format:

- Pixel: Npx. Value range of N: [0,4096].
-Percentage: N%, where N ranges from [0,100]. For example, 10% means the y-coordinate of the subtitle background base plate equals 10% of the video height.

If this parameter is not specified, the subtitle background is disabled.
Note: The origin point of the coordinate axis is located at the bottom of the central axis of the source video, and the benchmark of the subtitle background base plate is at the bottom of its central axis. See the following diagram.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

    */
    @SerializedName("BoardY")
    @Expose
    private Long BoardY;

    /**
    * BoardY unit, 0 pixel, 1 percentage, default is 0, pixel
    */
    @SerializedName("BoardYUnit")
    @Expose
    private Long BoardYUnit;

    /**
    * Background width. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If the base plate is enabled and this parameter is not specified, the default width is 90% of the source video width.

    */
    @SerializedName("BoardWidth")
    @Expose
    private Long BoardWidth;

    /**
    * Background width measurement unit. 0: pixel, 1: percentage. Default is 0 (pixel).

    */
    @SerializedName("BoardWidthUnit")
    @Expose
    private Long BoardWidthUnit;

    /**
    * Background height. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If the base plate is enabled and this parameter is not specified, the default height is 15% of the source video height.

    */
    @SerializedName("BoardHeight")
    @Expose
    private Long BoardHeight;

    /**
    * Base plate height unit, 0 pixel, 1 percentage, defaults to 0, pixel

    */
    @SerializedName("BoardHeightUnit")
    @Expose
    private Long BoardHeightUnit;

    /**
    * Board color. Format: 0xRRGGBB.
Default value: 0x000000 (black).
    */
    @SerializedName("BoardColor")
    @Expose
    private String BoardColor;

    /**
    * Subtitle background transparency. Value range: [0, 1].
<li>0: completely transparent.</li>
<li>1: completely opaque.</li>
Default value: 0.8.
    */
    @SerializedName("BoardAlpha")
    @Expose
    private Float BoardAlpha;

    /**
     * Get Subtitle suppression module background configuration switch, 0 for off, 1 for on, default 0 
     * @return SubtitleBoardConfigSwitch Subtitle suppression module background configuration switch, 0 for off, 1 for on, default 0
     */
    public Long getSubtitleBoardConfigSwitch() {
        return this.SubtitleBoardConfigSwitch;
    }

    /**
     * Set Subtitle suppression module background configuration switch, 0 for off, 1 for on, default 0
     * @param SubtitleBoardConfigSwitch Subtitle suppression module background configuration switch, 0 for off, 1 for on, default 0
     */
    public void setSubtitleBoardConfigSwitch(Long SubtitleBoardConfigSwitch) {
        this.SubtitleBoardConfigSwitch = SubtitleBoardConfigSwitch;
    }

    /**
     * Get Subtitle background base plate x-axis coordinate position; Supports pixel and percentage format:

- Pixel: Npx. Value range of N: [-4096,4096].
-Percentage: N%, N range: [-100,100]. For example, 10% means the X-coordinate of the subtitle background base plate is 10% of the source video width.

Default value: 0px.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the reference position of the subtitle base plate is at the bottom of the central axis, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)
 
     * @return BoardX Subtitle background base plate x-axis coordinate position; Supports pixel and percentage format:

- Pixel: Npx. Value range of N: [-4096,4096].
-Percentage: N%, N range: [-100,100]. For example, 10% means the X-coordinate of the subtitle background base plate is 10% of the source video width.

Default value: 0px.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the reference position of the subtitle base plate is at the bottom of the central axis, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

     */
    public Long getBoardX() {
        return this.BoardX;
    }

    /**
     * Set Subtitle background base plate x-axis coordinate position; Supports pixel and percentage format:

- Pixel: Npx. Value range of N: [-4096,4096].
-Percentage: N%, N range: [-100,100]. For example, 10% means the X-coordinate of the subtitle background base plate is 10% of the source video width.

Default value: 0px.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the reference position of the subtitle base plate is at the bottom of the central axis, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

     * @param BoardX Subtitle background base plate x-axis coordinate position; Supports pixel and percentage format:

- Pixel: Npx. Value range of N: [-4096,4096].
-Percentage: N%, N range: [-100,100]. For example, 10% means the X-coordinate of the subtitle background base plate is 10% of the source video width.

Default value: 0px.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the reference position of the subtitle base plate is at the bottom of the central axis, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

     */
    public void setBoardX(Long BoardX) {
        this.BoardX = BoardX;
    }

    /**
     * Get BoardX unit, 0 pixel, 1 percentage, default is 0, pixel 
     * @return BoardXUnit BoardX unit, 0 pixel, 1 percentage, default is 0, pixel
     */
    public Long getBoardXUnit() {
        return this.BoardXUnit;
    }

    /**
     * Set BoardX unit, 0 pixel, 1 percentage, default is 0, pixel
     * @param BoardXUnit BoardX unit, 0 pixel, 1 percentage, default is 0, pixel
     */
    public void setBoardXUnit(Long BoardXUnit) {
        this.BoardXUnit = BoardXUnit;
    }

    /**
     * Get Subtitle background base plate y-axis coordinate position; Supports pixel and percentage format:

- Pixel: Npx. Value range of N: [0,4096].
-Percentage: N%, where N ranges from [0,100]. For example, 10% means the y-coordinate of the subtitle background base plate equals 10% of the video height.

If this parameter is not specified, the subtitle background is disabled.
Note: The origin point of the coordinate axis is located at the bottom of the central axis of the source video, and the benchmark of the subtitle background base plate is at the bottom of its central axis. See the following diagram.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)
 
     * @return BoardY Subtitle background base plate y-axis coordinate position; Supports pixel and percentage format:

- Pixel: Npx. Value range of N: [0,4096].
-Percentage: N%, where N ranges from [0,100]. For example, 10% means the y-coordinate of the subtitle background base plate equals 10% of the video height.

If this parameter is not specified, the subtitle background is disabled.
Note: The origin point of the coordinate axis is located at the bottom of the central axis of the source video, and the benchmark of the subtitle background base plate is at the bottom of its central axis. See the following diagram.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

     */
    public Long getBoardY() {
        return this.BoardY;
    }

    /**
     * Set Subtitle background base plate y-axis coordinate position; Supports pixel and percentage format:

- Pixel: Npx. Value range of N: [0,4096].
-Percentage: N%, where N ranges from [0,100]. For example, 10% means the y-coordinate of the subtitle background base plate equals 10% of the video height.

If this parameter is not specified, the subtitle background is disabled.
Note: The origin point of the coordinate axis is located at the bottom of the central axis of the source video, and the benchmark of the subtitle background base plate is at the bottom of its central axis. See the following diagram.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

     * @param BoardY Subtitle background base plate y-axis coordinate position; Supports pixel and percentage format:

- Pixel: Npx. Value range of N: [0,4096].
-Percentage: N%, where N ranges from [0,100]. For example, 10% means the y-coordinate of the subtitle background base plate equals 10% of the video height.

If this parameter is not specified, the subtitle background is disabled.
Note: The origin point of the coordinate axis is located at the bottom of the central axis of the source video, and the benchmark of the subtitle background base plate is at the bottom of its central axis. See the following diagram.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

     */
    public void setBoardY(Long BoardY) {
        this.BoardY = BoardY;
    }

    /**
     * Get BoardY unit, 0 pixel, 1 percentage, default is 0, pixel 
     * @return BoardYUnit BoardY unit, 0 pixel, 1 percentage, default is 0, pixel
     */
    public Long getBoardYUnit() {
        return this.BoardYUnit;
    }

    /**
     * Set BoardY unit, 0 pixel, 1 percentage, default is 0, pixel
     * @param BoardYUnit BoardY unit, 0 pixel, 1 percentage, default is 0, pixel
     */
    public void setBoardYUnit(Long BoardYUnit) {
        this.BoardYUnit = BoardYUnit;
    }

    /**
     * Get Background width. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If the base plate is enabled and this parameter is not specified, the default width is 90% of the source video width.
 
     * @return BoardWidth Background width. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If the base plate is enabled and this parameter is not specified, the default width is 90% of the source video width.

     */
    public Long getBoardWidth() {
        return this.BoardWidth;
    }

    /**
     * Set Background width. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If the base plate is enabled and this parameter is not specified, the default width is 90% of the source video width.

     * @param BoardWidth Background width. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If the base plate is enabled and this parameter is not specified, the default width is 90% of the source video width.

     */
    public void setBoardWidth(Long BoardWidth) {
        this.BoardWidth = BoardWidth;
    }

    /**
     * Get Background width measurement unit. 0: pixel, 1: percentage. Default is 0 (pixel).
 
     * @return BoardWidthUnit Background width measurement unit. 0: pixel, 1: percentage. Default is 0 (pixel).

     */
    public Long getBoardWidthUnit() {
        return this.BoardWidthUnit;
    }

    /**
     * Set Background width measurement unit. 0: pixel, 1: percentage. Default is 0 (pixel).

     * @param BoardWidthUnit Background width measurement unit. 0: pixel, 1: percentage. Default is 0 (pixel).

     */
    public void setBoardWidthUnit(Long BoardWidthUnit) {
        this.BoardWidthUnit = BoardWidthUnit;
    }

    /**
     * Get Background height. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If the base plate is enabled and this parameter is not specified, the default height is 15% of the source video height.
 
     * @return BoardHeight Background height. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If the base plate is enabled and this parameter is not specified, the default height is 15% of the source video height.

     */
    public Long getBoardHeight() {
        return this.BoardHeight;
    }

    /**
     * Set Background height. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If the base plate is enabled and this parameter is not specified, the default height is 15% of the source video height.

     * @param BoardHeight Background height. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If the base plate is enabled and this parameter is not specified, the default height is 15% of the source video height.

     */
    public void setBoardHeight(Long BoardHeight) {
        this.BoardHeight = BoardHeight;
    }

    /**
     * Get Base plate height unit, 0 pixel, 1 percentage, defaults to 0, pixel
 
     * @return BoardHeightUnit Base plate height unit, 0 pixel, 1 percentage, defaults to 0, pixel

     */
    public Long getBoardHeightUnit() {
        return this.BoardHeightUnit;
    }

    /**
     * Set Base plate height unit, 0 pixel, 1 percentage, defaults to 0, pixel

     * @param BoardHeightUnit Base plate height unit, 0 pixel, 1 percentage, defaults to 0, pixel

     */
    public void setBoardHeightUnit(Long BoardHeightUnit) {
        this.BoardHeightUnit = BoardHeightUnit;
    }

    /**
     * Get Board color. Format: 0xRRGGBB.
Default value: 0x000000 (black). 
     * @return BoardColor Board color. Format: 0xRRGGBB.
Default value: 0x000000 (black).
     */
    public String getBoardColor() {
        return this.BoardColor;
    }

    /**
     * Set Board color. Format: 0xRRGGBB.
Default value: 0x000000 (black).
     * @param BoardColor Board color. Format: 0xRRGGBB.
Default value: 0x000000 (black).
     */
    public void setBoardColor(String BoardColor) {
        this.BoardColor = BoardColor;
    }

    /**
     * Get Subtitle background transparency. Value range: [0, 1].
<li>0: completely transparent.</li>
<li>1: completely opaque.</li>
Default value: 0.8. 
     * @return BoardAlpha Subtitle background transparency. Value range: [0, 1].
<li>0: completely transparent.</li>
<li>1: completely opaque.</li>
Default value: 0.8.
     */
    public Float getBoardAlpha() {
        return this.BoardAlpha;
    }

    /**
     * Set Subtitle background transparency. Value range: [0, 1].
<li>0: completely transparent.</li>
<li>1: completely opaque.</li>
Default value: 0.8.
     * @param BoardAlpha Subtitle background transparency. Value range: [0, 1].
<li>0: completely transparent.</li>
<li>1: completely opaque.</li>
Default value: 0.8.
     */
    public void setBoardAlpha(Float BoardAlpha) {
        this.BoardAlpha = BoardAlpha;
    }

    public SubtitleBoardConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleBoardConfig(SubtitleBoardConfig source) {
        if (source.SubtitleBoardConfigSwitch != null) {
            this.SubtitleBoardConfigSwitch = new Long(source.SubtitleBoardConfigSwitch);
        }
        if (source.BoardX != null) {
            this.BoardX = new Long(source.BoardX);
        }
        if (source.BoardXUnit != null) {
            this.BoardXUnit = new Long(source.BoardXUnit);
        }
        if (source.BoardY != null) {
            this.BoardY = new Long(source.BoardY);
        }
        if (source.BoardYUnit != null) {
            this.BoardYUnit = new Long(source.BoardYUnit);
        }
        if (source.BoardWidth != null) {
            this.BoardWidth = new Long(source.BoardWidth);
        }
        if (source.BoardWidthUnit != null) {
            this.BoardWidthUnit = new Long(source.BoardWidthUnit);
        }
        if (source.BoardHeight != null) {
            this.BoardHeight = new Long(source.BoardHeight);
        }
        if (source.BoardHeightUnit != null) {
            this.BoardHeightUnit = new Long(source.BoardHeightUnit);
        }
        if (source.BoardColor != null) {
            this.BoardColor = new String(source.BoardColor);
        }
        if (source.BoardAlpha != null) {
            this.BoardAlpha = new Float(source.BoardAlpha);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleBoardConfigSwitch", this.SubtitleBoardConfigSwitch);
        this.setParamSimple(map, prefix + "BoardX", this.BoardX);
        this.setParamSimple(map, prefix + "BoardXUnit", this.BoardXUnit);
        this.setParamSimple(map, prefix + "BoardY", this.BoardY);
        this.setParamSimple(map, prefix + "BoardYUnit", this.BoardYUnit);
        this.setParamSimple(map, prefix + "BoardWidth", this.BoardWidth);
        this.setParamSimple(map, prefix + "BoardWidthUnit", this.BoardWidthUnit);
        this.setParamSimple(map, prefix + "BoardHeight", this.BoardHeight);
        this.setParamSimple(map, prefix + "BoardHeightUnit", this.BoardHeightUnit);
        this.setParamSimple(map, prefix + "BoardColor", this.BoardColor);
        this.setParamSimple(map, prefix + "BoardAlpha", this.BoardAlpha);

    }
}

