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

public class MPSSubtitleBoardConfig extends AbstractModel {

    /**
    * <p>Subtitle suppression module background configuration switch, 0 for off, 1 for on, default 0</p>
    */
    @SerializedName("SubtitleBoardConfigSwitch")
    @Expose
    private Long SubtitleBoardConfigSwitch;

    /**
    * <p>The X-coordinate position of the subtitle background base plate. Supports pixel and percentage formats: - Pixel: Npx, where N ranges from [-4096, 4096]. - Percentage: N%, where N ranges from [-100, 100]; for example, 10% means the X-coordinate of the subtitle background base plate equals 10% of the source video width. Default value: 0px. Note: The origin of the coordinate axes is located at the bottom of the central axis of the source video, and the reference point of the subtitle base plate is at the bottom of its central axis. See the following diagram: <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
    */
    @SerializedName("BoardX")
    @Expose
    private Long BoardX;

    /**
    * <p>BoardX unit, 0 pixel, 1 percentage, default is 0, pixel</p>
    */
    @SerializedName("BoardXUnit")
    @Expose
    private Long BoardXUnit;

    /**
    * <p>Y-coordinate position of the subtitle background base plate. Supports pixel and percentage formats: - Pixel: Npx, where N ranges from [0,4096]. - Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle background base plate Y-coordinate = 10% * source video height. If not specified, the subtitle background base plate is disabled. Note: The coordinate axis origin is located at the bottom of the central axis of the source video, and the reference point of the subtitle background base plate is at the bottom of its central axis. Refer to the figure below: <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
    */
    @SerializedName("BoardY")
    @Expose
    private Long BoardY;

    /**
    * <p>BoardY measurement unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
    */
    @SerializedName("BoardYUnit")
    @Expose
    private Long BoardYUnit;

    /**
    * <p>Width of the base plate, a positive integer. - When representing pixels, value ranges from 0 to 4096. - When representing a percentage, value ranges from 0 to 100. If background is enabled and this parameter is not specified, the default width is 90% of the source video width.</p>
    */
    @SerializedName("BoardWidth")
    @Expose
    private Long BoardWidth;

    /**
    * <p>Background width measurement unit. 0: pixel, 1: percentage. Default is 0 (pixel).</p>
    */
    @SerializedName("BoardWidthUnit")
    @Expose
    private Long BoardWidthUnit;

    /**
    * <p>Height of the base plate, a positive integer. - When representing pixels, the value ranges from 0 to 4096. - When representing a percentage, the value ranges from 0 to 100. If base plate is enabled and this parameter is not specified, the default height is 15% of the source video height.</p>
    */
    @SerializedName("BoardHeight")
    @Expose
    private Long BoardHeight;

    /**
    * <p>Base plate height unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
    */
    @SerializedName("BoardHeightUnit")
    @Expose
    private Long BoardHeightUnit;

    /**
    * <p>Base plate color. Format: 0xRRGGBB. Default value: 0x000000 (black).</p>
    */
    @SerializedName("BoardColor")
    @Expose
    private String BoardColor;

    /**
    * <p>Subtitle background transparency. Value range: [0, 1] <li>0: completely transparent</li> <li>1: completely opaque</li> Default value: 0.8.</p>
    */
    @SerializedName("BoardAlpha")
    @Expose
    private Float BoardAlpha;

    /**
     * Get <p>Subtitle suppression module background configuration switch, 0 for off, 1 for on, default 0</p> 
     * @return SubtitleBoardConfigSwitch <p>Subtitle suppression module background configuration switch, 0 for off, 1 for on, default 0</p>
     */
    public Long getSubtitleBoardConfigSwitch() {
        return this.SubtitleBoardConfigSwitch;
    }

    /**
     * Set <p>Subtitle suppression module background configuration switch, 0 for off, 1 for on, default 0</p>
     * @param SubtitleBoardConfigSwitch <p>Subtitle suppression module background configuration switch, 0 for off, 1 for on, default 0</p>
     */
    public void setSubtitleBoardConfigSwitch(Long SubtitleBoardConfigSwitch) {
        this.SubtitleBoardConfigSwitch = SubtitleBoardConfigSwitch;
    }

    /**
     * Get <p>The X-coordinate position of the subtitle background base plate. Supports pixel and percentage formats: - Pixel: Npx, where N ranges from [-4096, 4096]. - Percentage: N%, where N ranges from [-100, 100]; for example, 10% means the X-coordinate of the subtitle background base plate equals 10% of the source video width. Default value: 0px. Note: The origin of the coordinate axes is located at the bottom of the central axis of the source video, and the reference point of the subtitle base plate is at the bottom of its central axis. See the following diagram: <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p> 
     * @return BoardX <p>The X-coordinate position of the subtitle background base plate. Supports pixel and percentage formats: - Pixel: Npx, where N ranges from [-4096, 4096]. - Percentage: N%, where N ranges from [-100, 100]; for example, 10% means the X-coordinate of the subtitle background base plate equals 10% of the source video width. Default value: 0px. Note: The origin of the coordinate axes is located at the bottom of the central axis of the source video, and the reference point of the subtitle base plate is at the bottom of its central axis. See the following diagram: <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public Long getBoardX() {
        return this.BoardX;
    }

    /**
     * Set <p>The X-coordinate position of the subtitle background base plate. Supports pixel and percentage formats: - Pixel: Npx, where N ranges from [-4096, 4096]. - Percentage: N%, where N ranges from [-100, 100]; for example, 10% means the X-coordinate of the subtitle background base plate equals 10% of the source video width. Default value: 0px. Note: The origin of the coordinate axes is located at the bottom of the central axis of the source video, and the reference point of the subtitle base plate is at the bottom of its central axis. See the following diagram: <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     * @param BoardX <p>The X-coordinate position of the subtitle background base plate. Supports pixel and percentage formats: - Pixel: Npx, where N ranges from [-4096, 4096]. - Percentage: N%, where N ranges from [-100, 100]; for example, 10% means the X-coordinate of the subtitle background base plate equals 10% of the source video width. Default value: 0px. Note: The origin of the coordinate axes is located at the bottom of the central axis of the source video, and the reference point of the subtitle base plate is at the bottom of its central axis. See the following diagram: <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public void setBoardX(Long BoardX) {
        this.BoardX = BoardX;
    }

    /**
     * Get <p>BoardX unit, 0 pixel, 1 percentage, default is 0, pixel</p> 
     * @return BoardXUnit <p>BoardX unit, 0 pixel, 1 percentage, default is 0, pixel</p>
     */
    public Long getBoardXUnit() {
        return this.BoardXUnit;
    }

    /**
     * Set <p>BoardX unit, 0 pixel, 1 percentage, default is 0, pixel</p>
     * @param BoardXUnit <p>BoardX unit, 0 pixel, 1 percentage, default is 0, pixel</p>
     */
    public void setBoardXUnit(Long BoardXUnit) {
        this.BoardXUnit = BoardXUnit;
    }

    /**
     * Get <p>Y-coordinate position of the subtitle background base plate. Supports pixel and percentage formats: - Pixel: Npx, where N ranges from [0,4096]. - Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle background base plate Y-coordinate = 10% * source video height. If not specified, the subtitle background base plate is disabled. Note: The coordinate axis origin is located at the bottom of the central axis of the source video, and the reference point of the subtitle background base plate is at the bottom of its central axis. Refer to the figure below: <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p> 
     * @return BoardY <p>Y-coordinate position of the subtitle background base plate. Supports pixel and percentage formats: - Pixel: Npx, where N ranges from [0,4096]. - Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle background base plate Y-coordinate = 10% * source video height. If not specified, the subtitle background base plate is disabled. Note: The coordinate axis origin is located at the bottom of the central axis of the source video, and the reference point of the subtitle background base plate is at the bottom of its central axis. Refer to the figure below: <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public Long getBoardY() {
        return this.BoardY;
    }

    /**
     * Set <p>Y-coordinate position of the subtitle background base plate. Supports pixel and percentage formats: - Pixel: Npx, where N ranges from [0,4096]. - Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle background base plate Y-coordinate = 10% * source video height. If not specified, the subtitle background base plate is disabled. Note: The coordinate axis origin is located at the bottom of the central axis of the source video, and the reference point of the subtitle background base plate is at the bottom of its central axis. Refer to the figure below: <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     * @param BoardY <p>Y-coordinate position of the subtitle background base plate. Supports pixel and percentage formats: - Pixel: Npx, where N ranges from [0,4096]. - Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle background base plate Y-coordinate = 10% * source video height. If not specified, the subtitle background base plate is disabled. Note: The coordinate axis origin is located at the bottom of the central axis of the source video, and the reference point of the subtitle background base plate is at the bottom of its central axis. Refer to the figure below: <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public void setBoardY(Long BoardY) {
        this.BoardY = BoardY;
    }

    /**
     * Get <p>BoardY measurement unit, 0 pixel, 1 percentage, defaults to 0, pixel</p> 
     * @return BoardYUnit <p>BoardY measurement unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public Long getBoardYUnit() {
        return this.BoardYUnit;
    }

    /**
     * Set <p>BoardY measurement unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     * @param BoardYUnit <p>BoardY measurement unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public void setBoardYUnit(Long BoardYUnit) {
        this.BoardYUnit = BoardYUnit;
    }

    /**
     * Get <p>Width of the base plate, a positive integer. - When representing pixels, value ranges from 0 to 4096. - When representing a percentage, value ranges from 0 to 100. If background is enabled and this parameter is not specified, the default width is 90% of the source video width.</p> 
     * @return BoardWidth <p>Width of the base plate, a positive integer. - When representing pixels, value ranges from 0 to 4096. - When representing a percentage, value ranges from 0 to 100. If background is enabled and this parameter is not specified, the default width is 90% of the source video width.</p>
     */
    public Long getBoardWidth() {
        return this.BoardWidth;
    }

    /**
     * Set <p>Width of the base plate, a positive integer. - When representing pixels, value ranges from 0 to 4096. - When representing a percentage, value ranges from 0 to 100. If background is enabled and this parameter is not specified, the default width is 90% of the source video width.</p>
     * @param BoardWidth <p>Width of the base plate, a positive integer. - When representing pixels, value ranges from 0 to 4096. - When representing a percentage, value ranges from 0 to 100. If background is enabled and this parameter is not specified, the default width is 90% of the source video width.</p>
     */
    public void setBoardWidth(Long BoardWidth) {
        this.BoardWidth = BoardWidth;
    }

    /**
     * Get <p>Background width measurement unit. 0: pixel, 1: percentage. Default is 0 (pixel).</p> 
     * @return BoardWidthUnit <p>Background width measurement unit. 0: pixel, 1: percentage. Default is 0 (pixel).</p>
     */
    public Long getBoardWidthUnit() {
        return this.BoardWidthUnit;
    }

    /**
     * Set <p>Background width measurement unit. 0: pixel, 1: percentage. Default is 0 (pixel).</p>
     * @param BoardWidthUnit <p>Background width measurement unit. 0: pixel, 1: percentage. Default is 0 (pixel).</p>
     */
    public void setBoardWidthUnit(Long BoardWidthUnit) {
        this.BoardWidthUnit = BoardWidthUnit;
    }

    /**
     * Get <p>Height of the base plate, a positive integer. - When representing pixels, the value ranges from 0 to 4096. - When representing a percentage, the value ranges from 0 to 100. If base plate is enabled and this parameter is not specified, the default height is 15% of the source video height.</p> 
     * @return BoardHeight <p>Height of the base plate, a positive integer. - When representing pixels, the value ranges from 0 to 4096. - When representing a percentage, the value ranges from 0 to 100. If base plate is enabled and this parameter is not specified, the default height is 15% of the source video height.</p>
     */
    public Long getBoardHeight() {
        return this.BoardHeight;
    }

    /**
     * Set <p>Height of the base plate, a positive integer. - When representing pixels, the value ranges from 0 to 4096. - When representing a percentage, the value ranges from 0 to 100. If base plate is enabled and this parameter is not specified, the default height is 15% of the source video height.</p>
     * @param BoardHeight <p>Height of the base plate, a positive integer. - When representing pixels, the value ranges from 0 to 4096. - When representing a percentage, the value ranges from 0 to 100. If base plate is enabled and this parameter is not specified, the default height is 15% of the source video height.</p>
     */
    public void setBoardHeight(Long BoardHeight) {
        this.BoardHeight = BoardHeight;
    }

    /**
     * Get <p>Base plate height unit, 0 pixel, 1 percentage, defaults to 0, pixel</p> 
     * @return BoardHeightUnit <p>Base plate height unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public Long getBoardHeightUnit() {
        return this.BoardHeightUnit;
    }

    /**
     * Set <p>Base plate height unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     * @param BoardHeightUnit <p>Base plate height unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public void setBoardHeightUnit(Long BoardHeightUnit) {
        this.BoardHeightUnit = BoardHeightUnit;
    }

    /**
     * Get <p>Base plate color. Format: 0xRRGGBB. Default value: 0x000000 (black).</p> 
     * @return BoardColor <p>Base plate color. Format: 0xRRGGBB. Default value: 0x000000 (black).</p>
     */
    public String getBoardColor() {
        return this.BoardColor;
    }

    /**
     * Set <p>Base plate color. Format: 0xRRGGBB. Default value: 0x000000 (black).</p>
     * @param BoardColor <p>Base plate color. Format: 0xRRGGBB. Default value: 0x000000 (black).</p>
     */
    public void setBoardColor(String BoardColor) {
        this.BoardColor = BoardColor;
    }

    /**
     * Get <p>Subtitle background transparency. Value range: [0, 1] <li>0: completely transparent</li> <li>1: completely opaque</li> Default value: 0.8.</p> 
     * @return BoardAlpha <p>Subtitle background transparency. Value range: [0, 1] <li>0: completely transparent</li> <li>1: completely opaque</li> Default value: 0.8.</p>
     */
    public Float getBoardAlpha() {
        return this.BoardAlpha;
    }

    /**
     * Set <p>Subtitle background transparency. Value range: [0, 1] <li>0: completely transparent</li> <li>1: completely opaque</li> Default value: 0.8.</p>
     * @param BoardAlpha <p>Subtitle background transparency. Value range: [0, 1] <li>0: completely transparent</li> <li>1: completely opaque</li> Default value: 0.8.</p>
     */
    public void setBoardAlpha(Float BoardAlpha) {
        this.BoardAlpha = BoardAlpha;
    }

    public MPSSubtitleBoardConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSubtitleBoardConfig(MPSSubtitleBoardConfig source) {
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

