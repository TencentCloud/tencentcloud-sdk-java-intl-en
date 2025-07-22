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

public class SubtitleTemplate extends AbstractModel {

    /**
    * The URL of the subtitles to add to the video.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Specifies the subtitle track for embedding subtitles into the video. the Streamindex parameter takes value starting from 0, where 0 indicates usage of the first subtitle track in the source video. if Path is specified, use Path preferentially. either Path or Streamindex should be specified.

-Note: StreamIndex must match the subtitle track index in the source file. for example, if the subtitle track in the source file is stream#0:3, StreamIndex should be 3. otherwise, task processing failed.


Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StreamIndex")
    @Expose
    private Long StreamIndex;

    /**
    * Font type. valid values:.
<li>hei.ttf: simhei.</li>.
<li>song.ttf: simsun.</li>.
<Li>Kai.Ttf (recommend) or simkai.ttf: kaiti.</li>.
<li>msyh.ttf: microsoft yahei</li>.
<li>msyhbd.ttf: microsoft yahei in bold.</li>.
<li>hkjgt.ttf: dynafont king gothic</li>.
<li>dhttx.ttf: dianheitexiti.</li>.
<li>xqgdzt.ttf: xiqueguzidianti</li>.
<li>qpcyt.ttf: smart splice super round body.</li>.
<li>arial.ttf: english only.</li>.
<li>dinalternate.ttf:DIN Alternate Bold</li>
<li>helveticalt.ttf:Helvetica</li>
<li>helveticains.ttf:Helvetica Inserat</li>
<li>trajanpro.ttf:TrajanPro-Bold</li>
<li>korean.ttf: specifies the korean language.</li>.
<li>japanese.ttf: specifies the japanese language.</li>.
<li>thai.ttf: specifies the thai language.</li>.
Default: hei.ttf (heiti). note: kaiti is recommended for use with kai.ttf.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * Font size. Format: Npx, where N is a numerical value. If it is not specified, the font size of the subtitle file applies.
It is 5% of the source video height by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FontSize")
    @Expose
    private String FontSize;

    /**
    * Font color. Format: 0xRRGGBB. Default value: 0xFFFFFF (white).
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * The text transparency. Value range: 0-1.
<li>`0`: Fully transparent.</li>
<li>`1`: Fully opaque.</li>
Default value: 1.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FontAlpha")
    @Expose
    private Float FontAlpha;

    /**
    * Subtitle position on the Y-axis. If this parameter is specified, the built-in coordinates in the subtitle file will be ignored. The pixel and percentage formats are supported.

 - Pixel: Npx. Value range of N: [0,4096].
 - Percentage: N%. Value range of N: [0,100]. For example, 10% indicates that the subtitle position on the Y-axis is 10% of the video height.

By default, the position is 4% of the source video height.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the subtitle reference position is at the bottom of the central axis of the subtitles, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * Subtitle background position on the Y-axis. Pixel and percentage formats are supported.

 - Pixel: Npx. Value range of N: [0,4096].
 - Percentage: N%. Value range of N: [0,100]. For example, 10% indicates that the subtitle background position on the Y-axis is 10% of the video height.

If this parameter is not specified, the subtitle background is disabled.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the reference position of the subtitle background is at the bottom of the central axis of the source video, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BoardY")
    @Expose
    private String BoardY;

    /**
    * Board width. Unit: pixels. Value range: [0,4096].
It is 90% of the source video width by default.

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BoardWidth")
    @Expose
    private Long BoardWidth;

    /**
    * Board height. Unit: pixels. Value range: [0,4096].
It is 15% of the source video height by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BoardHeight")
    @Expose
    private Long BoardHeight;

    /**
    * Board color. Format: 0xRRGGBB.
Default value: 0x000000 (black).
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BoardColor")
    @Expose
    private String BoardColor;

    /**
    * Subtitle background transparency. Value range: [0, 1].
<li>0: completely transparent.</li>
<li>1: completely opaque.</li>
Default value: 0.8.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BoardAlpha")
    @Expose
    private Float BoardAlpha;

    /**
     * Get The URL of the subtitles to add to the video.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Path The URL of the subtitles to add to the video.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set The URL of the subtitles to add to the video.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Path The URL of the subtitles to add to the video.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Specifies the subtitle track for embedding subtitles into the video. the Streamindex parameter takes value starting from 0, where 0 indicates usage of the first subtitle track in the source video. if Path is specified, use Path preferentially. either Path or Streamindex should be specified.

-Note: StreamIndex must match the subtitle track index in the source file. for example, if the subtitle track in the source file is stream#0:3, StreamIndex should be 3. otherwise, task processing failed.


Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StreamIndex Specifies the subtitle track for embedding subtitles into the video. the Streamindex parameter takes value starting from 0, where 0 indicates usage of the first subtitle track in the source video. if Path is specified, use Path preferentially. either Path or Streamindex should be specified.

-Note: StreamIndex must match the subtitle track index in the source file. for example, if the subtitle track in the source file is stream#0:3, StreamIndex should be 3. otherwise, task processing failed.


Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStreamIndex() {
        return this.StreamIndex;
    }

    /**
     * Set Specifies the subtitle track for embedding subtitles into the video. the Streamindex parameter takes value starting from 0, where 0 indicates usage of the first subtitle track in the source video. if Path is specified, use Path preferentially. either Path or Streamindex should be specified.

-Note: StreamIndex must match the subtitle track index in the source file. for example, if the subtitle track in the source file is stream#0:3, StreamIndex should be 3. otherwise, task processing failed.


Note: This field may return null, indicating that no valid value can be obtained.
     * @param StreamIndex Specifies the subtitle track for embedding subtitles into the video. the Streamindex parameter takes value starting from 0, where 0 indicates usage of the first subtitle track in the source video. if Path is specified, use Path preferentially. either Path or Streamindex should be specified.

-Note: StreamIndex must match the subtitle track index in the source file. for example, if the subtitle track in the source file is stream#0:3, StreamIndex should be 3. otherwise, task processing failed.


Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStreamIndex(Long StreamIndex) {
        this.StreamIndex = StreamIndex;
    }

    /**
     * Get Font type. valid values:.
<li>hei.ttf: simhei.</li>.
<li>song.ttf: simsun.</li>.
<Li>Kai.Ttf (recommend) or simkai.ttf: kaiti.</li>.
<li>msyh.ttf: microsoft yahei</li>.
<li>msyhbd.ttf: microsoft yahei in bold.</li>.
<li>hkjgt.ttf: dynafont king gothic</li>.
<li>dhttx.ttf: dianheitexiti.</li>.
<li>xqgdzt.ttf: xiqueguzidianti</li>.
<li>qpcyt.ttf: smart splice super round body.</li>.
<li>arial.ttf: english only.</li>.
<li>dinalternate.ttf:DIN Alternate Bold</li>
<li>helveticalt.ttf:Helvetica</li>
<li>helveticains.ttf:Helvetica Inserat</li>
<li>trajanpro.ttf:TrajanPro-Bold</li>
<li>korean.ttf: specifies the korean language.</li>.
<li>japanese.ttf: specifies the japanese language.</li>.
<li>thai.ttf: specifies the thai language.</li>.
Default: hei.ttf (heiti). note: kaiti is recommended for use with kai.ttf.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FontType Font type. valid values:.
<li>hei.ttf: simhei.</li>.
<li>song.ttf: simsun.</li>.
<Li>Kai.Ttf (recommend) or simkai.ttf: kaiti.</li>.
<li>msyh.ttf: microsoft yahei</li>.
<li>msyhbd.ttf: microsoft yahei in bold.</li>.
<li>hkjgt.ttf: dynafont king gothic</li>.
<li>dhttx.ttf: dianheitexiti.</li>.
<li>xqgdzt.ttf: xiqueguzidianti</li>.
<li>qpcyt.ttf: smart splice super round body.</li>.
<li>arial.ttf: english only.</li>.
<li>dinalternate.ttf:DIN Alternate Bold</li>
<li>helveticalt.ttf:Helvetica</li>
<li>helveticains.ttf:Helvetica Inserat</li>
<li>trajanpro.ttf:TrajanPro-Bold</li>
<li>korean.ttf: specifies the korean language.</li>.
<li>japanese.ttf: specifies the japanese language.</li>.
<li>thai.ttf: specifies the thai language.</li>.
Default: hei.ttf (heiti). note: kaiti is recommended for use with kai.ttf.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFontType() {
        return this.FontType;
    }

    /**
     * Set Font type. valid values:.
<li>hei.ttf: simhei.</li>.
<li>song.ttf: simsun.</li>.
<Li>Kai.Ttf (recommend) or simkai.ttf: kaiti.</li>.
<li>msyh.ttf: microsoft yahei</li>.
<li>msyhbd.ttf: microsoft yahei in bold.</li>.
<li>hkjgt.ttf: dynafont king gothic</li>.
<li>dhttx.ttf: dianheitexiti.</li>.
<li>xqgdzt.ttf: xiqueguzidianti</li>.
<li>qpcyt.ttf: smart splice super round body.</li>.
<li>arial.ttf: english only.</li>.
<li>dinalternate.ttf:DIN Alternate Bold</li>
<li>helveticalt.ttf:Helvetica</li>
<li>helveticains.ttf:Helvetica Inserat</li>
<li>trajanpro.ttf:TrajanPro-Bold</li>
<li>korean.ttf: specifies the korean language.</li>.
<li>japanese.ttf: specifies the japanese language.</li>.
<li>thai.ttf: specifies the thai language.</li>.
Default: hei.ttf (heiti). note: kaiti is recommended for use with kai.ttf.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FontType Font type. valid values:.
<li>hei.ttf: simhei.</li>.
<li>song.ttf: simsun.</li>.
<Li>Kai.Ttf (recommend) or simkai.ttf: kaiti.</li>.
<li>msyh.ttf: microsoft yahei</li>.
<li>msyhbd.ttf: microsoft yahei in bold.</li>.
<li>hkjgt.ttf: dynafont king gothic</li>.
<li>dhttx.ttf: dianheitexiti.</li>.
<li>xqgdzt.ttf: xiqueguzidianti</li>.
<li>qpcyt.ttf: smart splice super round body.</li>.
<li>arial.ttf: english only.</li>.
<li>dinalternate.ttf:DIN Alternate Bold</li>
<li>helveticalt.ttf:Helvetica</li>
<li>helveticains.ttf:Helvetica Inserat</li>
<li>trajanpro.ttf:TrajanPro-Bold</li>
<li>korean.ttf: specifies the korean language.</li>.
<li>japanese.ttf: specifies the japanese language.</li>.
<li>thai.ttf: specifies the thai language.</li>.
Default: hei.ttf (heiti). note: kaiti is recommended for use with kai.ttf.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFontType(String FontType) {
        this.FontType = FontType;
    }

    /**
     * Get Font size. Format: Npx, where N is a numerical value. If it is not specified, the font size of the subtitle file applies.
It is 5% of the source video height by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FontSize Font size. Format: Npx, where N is a numerical value. If it is not specified, the font size of the subtitle file applies.
It is 5% of the source video height by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFontSize() {
        return this.FontSize;
    }

    /**
     * Set Font size. Format: Npx, where N is a numerical value. If it is not specified, the font size of the subtitle file applies.
It is 5% of the source video height by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FontSize Font size. Format: Npx, where N is a numerical value. If it is not specified, the font size of the subtitle file applies.
It is 5% of the source video height by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFontSize(String FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get Font color. Format: 0xRRGGBB. Default value: 0xFFFFFF (white).
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FontColor Font color. Format: 0xRRGGBB. Default value: 0xFFFFFF (white).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set Font color. Format: 0xRRGGBB. Default value: 0xFFFFFF (white).
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FontColor Font color. Format: 0xRRGGBB. Default value: 0xFFFFFF (white).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get The text transparency. Value range: 0-1.
<li>`0`: Fully transparent.</li>
<li>`1`: Fully opaque.</li>
Default value: 1.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FontAlpha The text transparency. Value range: 0-1.
<li>`0`: Fully transparent.</li>
<li>`1`: Fully opaque.</li>
Default value: 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getFontAlpha() {
        return this.FontAlpha;
    }

    /**
     * Set The text transparency. Value range: 0-1.
<li>`0`: Fully transparent.</li>
<li>`1`: Fully opaque.</li>
Default value: 1.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FontAlpha The text transparency. Value range: 0-1.
<li>`0`: Fully transparent.</li>
<li>`1`: Fully opaque.</li>
Default value: 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFontAlpha(Float FontAlpha) {
        this.FontAlpha = FontAlpha;
    }

    /**
     * Get Subtitle position on the Y-axis. If this parameter is specified, the built-in coordinates in the subtitle file will be ignored. The pixel and percentage formats are supported.

 - Pixel: Npx. Value range of N: [0,4096].
 - Percentage: N%. Value range of N: [0,100]. For example, 10% indicates that the subtitle position on the Y-axis is 10% of the video height.

By default, the position is 4% of the source video height.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the subtitle reference position is at the bottom of the central axis of the subtitles, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return YPos Subtitle position on the Y-axis. If this parameter is specified, the built-in coordinates in the subtitle file will be ignored. The pixel and percentage formats are supported.

 - Pixel: Npx. Value range of N: [0,4096].
 - Percentage: N%. Value range of N: [0,100]. For example, 10% indicates that the subtitle position on the Y-axis is 10% of the video height.

By default, the position is 4% of the source video height.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the subtitle reference position is at the bottom of the central axis of the subtitles, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set Subtitle position on the Y-axis. If this parameter is specified, the built-in coordinates in the subtitle file will be ignored. The pixel and percentage formats are supported.

 - Pixel: Npx. Value range of N: [0,4096].
 - Percentage: N%. Value range of N: [0,100]. For example, 10% indicates that the subtitle position on the Y-axis is 10% of the video height.

By default, the position is 4% of the source video height.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the subtitle reference position is at the bottom of the central axis of the subtitles, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

Note: This field may return null, indicating that no valid value can be obtained.
     * @param YPos Subtitle position on the Y-axis. If this parameter is specified, the built-in coordinates in the subtitle file will be ignored. The pixel and percentage formats are supported.

 - Pixel: Npx. Value range of N: [0,4096].
 - Percentage: N%. Value range of N: [0,100]. For example, 10% indicates that the subtitle position on the Y-axis is 10% of the video height.

By default, the position is 4% of the source video height.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the subtitle reference position is at the bottom of the central axis of the subtitles, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get Subtitle background position on the Y-axis. Pixel and percentage formats are supported.

 - Pixel: Npx. Value range of N: [0,4096].
 - Percentage: N%. Value range of N: [0,100]. For example, 10% indicates that the subtitle background position on the Y-axis is 10% of the video height.

If this parameter is not specified, the subtitle background is disabled.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the reference position of the subtitle background is at the bottom of the central axis of the source video, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BoardY Subtitle background position on the Y-axis. Pixel and percentage formats are supported.

 - Pixel: Npx. Value range of N: [0,4096].
 - Percentage: N%. Value range of N: [0,100]. For example, 10% indicates that the subtitle background position on the Y-axis is 10% of the video height.

If this parameter is not specified, the subtitle background is disabled.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the reference position of the subtitle background is at the bottom of the central axis of the source video, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getBoardY() {
        return this.BoardY;
    }

    /**
     * Set Subtitle background position on the Y-axis. Pixel and percentage formats are supported.

 - Pixel: Npx. Value range of N: [0,4096].
 - Percentage: N%. Value range of N: [0,100]. For example, 10% indicates that the subtitle background position on the Y-axis is 10% of the video height.

If this parameter is not specified, the subtitle background is disabled.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the reference position of the subtitle background is at the bottom of the central axis of the source video, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

Note: This field may return null, indicating that no valid value can be obtained.
     * @param BoardY Subtitle background position on the Y-axis. Pixel and percentage formats are supported.

 - Pixel: Npx. Value range of N: [0,4096].
 - Percentage: N%. Value range of N: [0,100]. For example, 10% indicates that the subtitle background position on the Y-axis is 10% of the video height.

If this parameter is not specified, the subtitle background is disabled.
Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the reference position of the subtitle background is at the bottom of the central axis of the source video, as shown in the figure below.
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBoardY(String BoardY) {
        this.BoardY = BoardY;
    }

    /**
     * Get Board width. Unit: pixels. Value range: [0,4096].
It is 90% of the source video width by default.

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BoardWidth Board width. Unit: pixels. Value range: [0,4096].
It is 90% of the source video width by default.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getBoardWidth() {
        return this.BoardWidth;
    }

    /**
     * Set Board width. Unit: pixels. Value range: [0,4096].
It is 90% of the source video width by default.

Note: This field may return null, indicating that no valid value can be obtained.
     * @param BoardWidth Board width. Unit: pixels. Value range: [0,4096].
It is 90% of the source video width by default.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBoardWidth(Long BoardWidth) {
        this.BoardWidth = BoardWidth;
    }

    /**
     * Get Board height. Unit: pixels. Value range: [0,4096].
It is 15% of the source video height by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BoardHeight Board height. Unit: pixels. Value range: [0,4096].
It is 15% of the source video height by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getBoardHeight() {
        return this.BoardHeight;
    }

    /**
     * Set Board height. Unit: pixels. Value range: [0,4096].
It is 15% of the source video height by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BoardHeight Board height. Unit: pixels. Value range: [0,4096].
It is 15% of the source video height by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBoardHeight(Long BoardHeight) {
        this.BoardHeight = BoardHeight;
    }

    /**
     * Get Board color. Format: 0xRRGGBB.
Default value: 0x000000 (black).
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BoardColor Board color. Format: 0xRRGGBB.
Default value: 0x000000 (black).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getBoardColor() {
        return this.BoardColor;
    }

    /**
     * Set Board color. Format: 0xRRGGBB.
Default value: 0x000000 (black).
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BoardColor Board color. Format: 0xRRGGBB.
Default value: 0x000000 (black).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBoardColor(String BoardColor) {
        this.BoardColor = BoardColor;
    }

    /**
     * Get Subtitle background transparency. Value range: [0, 1].
<li>0: completely transparent.</li>
<li>1: completely opaque.</li>
Default value: 0.8.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BoardAlpha Subtitle background transparency. Value range: [0, 1].
<li>0: completely transparent.</li>
<li>1: completely opaque.</li>
Default value: 0.8.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getBoardAlpha() {
        return this.BoardAlpha;
    }

    /**
     * Set Subtitle background transparency. Value range: [0, 1].
<li>0: completely transparent.</li>
<li>1: completely opaque.</li>
Default value: 0.8.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BoardAlpha Subtitle background transparency. Value range: [0, 1].
<li>0: completely transparent.</li>
<li>1: completely opaque.</li>
Default value: 0.8.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBoardAlpha(Float BoardAlpha) {
        this.BoardAlpha = BoardAlpha;
    }

    public SubtitleTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleTemplate(SubtitleTemplate source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.StreamIndex != null) {
            this.StreamIndex = new Long(source.StreamIndex);
        }
        if (source.FontType != null) {
            this.FontType = new String(source.FontType);
        }
        if (source.FontSize != null) {
            this.FontSize = new String(source.FontSize);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontAlpha != null) {
            this.FontAlpha = new Float(source.FontAlpha);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
        if (source.BoardY != null) {
            this.BoardY = new String(source.BoardY);
        }
        if (source.BoardWidth != null) {
            this.BoardWidth = new Long(source.BoardWidth);
        }
        if (source.BoardHeight != null) {
            this.BoardHeight = new Long(source.BoardHeight);
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
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "StreamIndex", this.StreamIndex);
        this.setParamSimple(map, prefix + "FontType", this.FontType);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlpha", this.FontAlpha);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "BoardY", this.BoardY);
        this.setParamSimple(map, prefix + "BoardWidth", this.BoardWidth);
        this.setParamSimple(map, prefix + "BoardHeight", this.BoardHeight);
        this.setParamSimple(map, prefix + "BoardColor", this.BoardColor);
        this.setParamSimple(map, prefix + "BoardAlpha", this.BoardAlpha);

    }
}

