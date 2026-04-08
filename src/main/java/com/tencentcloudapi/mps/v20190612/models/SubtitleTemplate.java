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
    * Input information on the subtitle file to be embedded into the video. Currently, only subtitle files stored in COS are supported.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubtitleFileInput")
    @Expose
    private MediaInputInfo SubtitleFileInput;

    /**
    * Input information of the font file of the burned-in subtitle. URL and COS are supported. If both are specified, the URL information is used. If FontFileInput is specified, FontFileInput takes precedence over FontType.

    */
    @SerializedName("FontFileInput")
    @Expose
    private MediaInputInfo FontFileInput;

    /**
    * Font type. Valid values:
<li>hei.ttf: SimHei</li>
<li>song.ttf: SimSun.</li>
<li>kai.ttf (recommend) or simkai.ttf: KaiTi.</li>
<li>msyh.ttf: Microsoft YaHei.</li>
<li>msyhbd.ttf: Microsoft YaHei Bold.</li>
<li>hkjgt.ttf: DynaFont King Gothic.</li>
<li>dhttx.ttf: DianHei Extra Light.</li>
<li>xqgdzt.ttf: XiQue GuZiDian.</li>
<li>qpcyt.ttf: Smart Splice Super Round Body</li>
<li>arial.ttf: English only.</li>
<li>dinalternate.ttf:DIN Alternate Bold</li>
<li>helveticalt.ttf:Helvetica</li>
<li>helveticains.ttf:Helvetica Inserat</li>
<li>trajanpro.ttf:TrajanPro-Bold</li>
<li>korean.ttf: Korean.</li>
<li>japanese.ttf: Japanese.</li>
<li>thai.ttf: Thai.</li>
<li>roboto.ttf:Roboto</li>
<li>notosans.ttf:NotoSans</li>
<li>notosansthai.ttf: Thai NotoSansThai</li>
<li>sarabun.ttf: Thai Sarabun</li>
<li>kanit.ttf: Thai Kanit</li>
<li>charmonman.ttf: Thai Charmonman.</li>
<li>notonaskharabic.ttf: Arabic NotoNaskhArabic.</li>
<li>notosansdevanagari.ttf: NotoSansDevanagari for India.</li>
<li>notosanstc.ttf: Cantonese Source Han Sans NotoSansTC</li>
<li>notosanskr.ttf: Korean NotoSansKR.</li>
<li>gothica1.ttf: Korean GothicA1.</li>
<li>nanummyeongjo.ttf: Korean NanumMyeongjo.</li>
<li>notosansjp.ttf: Japanese NotoSansJP.</li>
<li>notoserifjp.ttf: Japanese NotoSerifJP.</li>
<li>shipporimincho.ttf: Japanese ShipporiMincho.</li>
Default value: hei.ttf.
<br>Note:
<li>kai.ttf is recommended for SimKai.</li>
<li>FontFileInput takes precedence when specified.</li>

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * Font size. If not specified, the font size of the subtitle file applies. Pixel and percentage formats are supported:

- Pixel: Npx. Value range of N: (0,4096].
- Percentage: N%. Value range of N: (0,100]. For example, 10% means the subtitle font size is 10% of the source video height.

The default size is 5% of the source video height if this parameter is not specified or the font size is not configured in the subtitle file.

Note: This field may return null, indicating that no valid values can be obtained.
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
    * Background width. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If background is enabled and this parameter is not specified, the default width is 90% of the source video width.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BoardWidth")
    @Expose
    private Long BoardWidth;

    /**
    * Background height. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If background is enabled and this parameter is not specified, the default height is 15% of the source video height.

Note: This field may return null, indicating that no valid values can be obtained.
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
    * Stroke width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
If this is not specified, the default width is 0.3% of the source video height.

    */
    @SerializedName("OutlineWidth")
    @Expose
    private Float OutlineWidth;

    /**
    * Stroke color. The value should be a 6-digit hexadecimal RGB value. If this is not specified, the default color is black.

    */
    @SerializedName("OutlineColor")
    @Expose
    private String OutlineColor;

    /**
    * Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.

    */
    @SerializedName("OutlineAlpha")
    @Expose
    private Float OutlineAlpha;

    /**
    * Shadow width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
If this is not specified, no shadow is applied by default.

    */
    @SerializedName("ShadowWidth")
    @Expose
    private Float ShadowWidth;

    /**
    * Shadow color. The value should be a 6-digit hexadecimal RGB value. If this is not specified, the default color is black (with shadow configured).

    */
    @SerializedName("ShadowColor")
    @Expose
    private String ShadowColor;

    /**
    * Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).

    */
    @SerializedName("ShadowAlpha")
    @Expose
    private Float ShadowAlpha;

    /**
    * Line spacing. The value should be a positive integer.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.

    */
    @SerializedName("LineSpacing")
    @Expose
    private Long LineSpacing;

    /**
    * Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.

    */
    @SerializedName("Alignment")
    @Expose
    private String Alignment;

    /**
    * Default value is 0. If this is set to 1, the value of BoardWidth is a percentage based on the video width.

    */
    @SerializedName("BoardWidthUnit")
    @Expose
    private Long BoardWidthUnit;

    /**
    * Default value is 0. If this is set to 1, the value of BoardHeight is a percentage based on the video height.

    */
    @SerializedName("BoardHeightUnit")
    @Expose
    private Long BoardHeightUnit;

    /**
    * Default value is 0. If this is set to 1, the value of OutlineWidth is a percentage based on the video height.

    */
    @SerializedName("OutlineWidthUnit")
    @Expose
    private Long OutlineWidthUnit;

    /**
    * Default value is 0. If this is set to 1, the value of ShadowWidth is a percentage based on the video height.

    */
    @SerializedName("ShadowWidthUnit")
    @Expose
    private Long ShadowWidthUnit;

    /**
    * Default value is 0. If this is set to 1, the value of LineSpacing is a percentage based on the video height.

    */
    @SerializedName("LineSpacingUnit")
    @Expose
    private Long LineSpacingUnit;

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
     * Get Input information on the subtitle file to be embedded into the video. Currently, only subtitle files stored in COS are supported.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubtitleFileInput Input information on the subtitle file to be embedded into the video. Currently, only subtitle files stored in COS are supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaInputInfo getSubtitleFileInput() {
        return this.SubtitleFileInput;
    }

    /**
     * Set Input information on the subtitle file to be embedded into the video. Currently, only subtitle files stored in COS are supported.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubtitleFileInput Input information on the subtitle file to be embedded into the video. Currently, only subtitle files stored in COS are supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubtitleFileInput(MediaInputInfo SubtitleFileInput) {
        this.SubtitleFileInput = SubtitleFileInput;
    }

    /**
     * Get Input information of the font file of the burned-in subtitle. URL and COS are supported. If both are specified, the URL information is used. If FontFileInput is specified, FontFileInput takes precedence over FontType.
 
     * @return FontFileInput Input information of the font file of the burned-in subtitle. URL and COS are supported. If both are specified, the URL information is used. If FontFileInput is specified, FontFileInput takes precedence over FontType.

     */
    public MediaInputInfo getFontFileInput() {
        return this.FontFileInput;
    }

    /**
     * Set Input information of the font file of the burned-in subtitle. URL and COS are supported. If both are specified, the URL information is used. If FontFileInput is specified, FontFileInput takes precedence over FontType.

     * @param FontFileInput Input information of the font file of the burned-in subtitle. URL and COS are supported. If both are specified, the URL information is used. If FontFileInput is specified, FontFileInput takes precedence over FontType.

     */
    public void setFontFileInput(MediaInputInfo FontFileInput) {
        this.FontFileInput = FontFileInput;
    }

    /**
     * Get Font type. Valid values:
<li>hei.ttf: SimHei</li>
<li>song.ttf: SimSun.</li>
<li>kai.ttf (recommend) or simkai.ttf: KaiTi.</li>
<li>msyh.ttf: Microsoft YaHei.</li>
<li>msyhbd.ttf: Microsoft YaHei Bold.</li>
<li>hkjgt.ttf: DynaFont King Gothic.</li>
<li>dhttx.ttf: DianHei Extra Light.</li>
<li>xqgdzt.ttf: XiQue GuZiDian.</li>
<li>qpcyt.ttf: Smart Splice Super Round Body</li>
<li>arial.ttf: English only.</li>
<li>dinalternate.ttf:DIN Alternate Bold</li>
<li>helveticalt.ttf:Helvetica</li>
<li>helveticains.ttf:Helvetica Inserat</li>
<li>trajanpro.ttf:TrajanPro-Bold</li>
<li>korean.ttf: Korean.</li>
<li>japanese.ttf: Japanese.</li>
<li>thai.ttf: Thai.</li>
<li>roboto.ttf:Roboto</li>
<li>notosans.ttf:NotoSans</li>
<li>notosansthai.ttf: Thai NotoSansThai</li>
<li>sarabun.ttf: Thai Sarabun</li>
<li>kanit.ttf: Thai Kanit</li>
<li>charmonman.ttf: Thai Charmonman.</li>
<li>notonaskharabic.ttf: Arabic NotoNaskhArabic.</li>
<li>notosansdevanagari.ttf: NotoSansDevanagari for India.</li>
<li>notosanstc.ttf: Cantonese Source Han Sans NotoSansTC</li>
<li>notosanskr.ttf: Korean NotoSansKR.</li>
<li>gothica1.ttf: Korean GothicA1.</li>
<li>nanummyeongjo.ttf: Korean NanumMyeongjo.</li>
<li>notosansjp.ttf: Japanese NotoSansJP.</li>
<li>notoserifjp.ttf: Japanese NotoSerifJP.</li>
<li>shipporimincho.ttf: Japanese ShipporiMincho.</li>
Default value: hei.ttf.
<br>Note:
<li>kai.ttf is recommended for SimKai.</li>
<li>FontFileInput takes precedence when specified.</li>

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FontType Font type. Valid values:
<li>hei.ttf: SimHei</li>
<li>song.ttf: SimSun.</li>
<li>kai.ttf (recommend) or simkai.ttf: KaiTi.</li>
<li>msyh.ttf: Microsoft YaHei.</li>
<li>msyhbd.ttf: Microsoft YaHei Bold.</li>
<li>hkjgt.ttf: DynaFont King Gothic.</li>
<li>dhttx.ttf: DianHei Extra Light.</li>
<li>xqgdzt.ttf: XiQue GuZiDian.</li>
<li>qpcyt.ttf: Smart Splice Super Round Body</li>
<li>arial.ttf: English only.</li>
<li>dinalternate.ttf:DIN Alternate Bold</li>
<li>helveticalt.ttf:Helvetica</li>
<li>helveticains.ttf:Helvetica Inserat</li>
<li>trajanpro.ttf:TrajanPro-Bold</li>
<li>korean.ttf: Korean.</li>
<li>japanese.ttf: Japanese.</li>
<li>thai.ttf: Thai.</li>
<li>roboto.ttf:Roboto</li>
<li>notosans.ttf:NotoSans</li>
<li>notosansthai.ttf: Thai NotoSansThai</li>
<li>sarabun.ttf: Thai Sarabun</li>
<li>kanit.ttf: Thai Kanit</li>
<li>charmonman.ttf: Thai Charmonman.</li>
<li>notonaskharabic.ttf: Arabic NotoNaskhArabic.</li>
<li>notosansdevanagari.ttf: NotoSansDevanagari for India.</li>
<li>notosanstc.ttf: Cantonese Source Han Sans NotoSansTC</li>
<li>notosanskr.ttf: Korean NotoSansKR.</li>
<li>gothica1.ttf: Korean GothicA1.</li>
<li>nanummyeongjo.ttf: Korean NanumMyeongjo.</li>
<li>notosansjp.ttf: Japanese NotoSansJP.</li>
<li>notoserifjp.ttf: Japanese NotoSerifJP.</li>
<li>shipporimincho.ttf: Japanese ShipporiMincho.</li>
Default value: hei.ttf.
<br>Note:
<li>kai.ttf is recommended for SimKai.</li>
<li>FontFileInput takes precedence when specified.</li>

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFontType() {
        return this.FontType;
    }

    /**
     * Set Font type. Valid values:
<li>hei.ttf: SimHei</li>
<li>song.ttf: SimSun.</li>
<li>kai.ttf (recommend) or simkai.ttf: KaiTi.</li>
<li>msyh.ttf: Microsoft YaHei.</li>
<li>msyhbd.ttf: Microsoft YaHei Bold.</li>
<li>hkjgt.ttf: DynaFont King Gothic.</li>
<li>dhttx.ttf: DianHei Extra Light.</li>
<li>xqgdzt.ttf: XiQue GuZiDian.</li>
<li>qpcyt.ttf: Smart Splice Super Round Body</li>
<li>arial.ttf: English only.</li>
<li>dinalternate.ttf:DIN Alternate Bold</li>
<li>helveticalt.ttf:Helvetica</li>
<li>helveticains.ttf:Helvetica Inserat</li>
<li>trajanpro.ttf:TrajanPro-Bold</li>
<li>korean.ttf: Korean.</li>
<li>japanese.ttf: Japanese.</li>
<li>thai.ttf: Thai.</li>
<li>roboto.ttf:Roboto</li>
<li>notosans.ttf:NotoSans</li>
<li>notosansthai.ttf: Thai NotoSansThai</li>
<li>sarabun.ttf: Thai Sarabun</li>
<li>kanit.ttf: Thai Kanit</li>
<li>charmonman.ttf: Thai Charmonman.</li>
<li>notonaskharabic.ttf: Arabic NotoNaskhArabic.</li>
<li>notosansdevanagari.ttf: NotoSansDevanagari for India.</li>
<li>notosanstc.ttf: Cantonese Source Han Sans NotoSansTC</li>
<li>notosanskr.ttf: Korean NotoSansKR.</li>
<li>gothica1.ttf: Korean GothicA1.</li>
<li>nanummyeongjo.ttf: Korean NanumMyeongjo.</li>
<li>notosansjp.ttf: Japanese NotoSansJP.</li>
<li>notoserifjp.ttf: Japanese NotoSerifJP.</li>
<li>shipporimincho.ttf: Japanese ShipporiMincho.</li>
Default value: hei.ttf.
<br>Note:
<li>kai.ttf is recommended for SimKai.</li>
<li>FontFileInput takes precedence when specified.</li>

Note: This field may return null, indicating that no valid values can be obtained.
     * @param FontType Font type. Valid values:
<li>hei.ttf: SimHei</li>
<li>song.ttf: SimSun.</li>
<li>kai.ttf (recommend) or simkai.ttf: KaiTi.</li>
<li>msyh.ttf: Microsoft YaHei.</li>
<li>msyhbd.ttf: Microsoft YaHei Bold.</li>
<li>hkjgt.ttf: DynaFont King Gothic.</li>
<li>dhttx.ttf: DianHei Extra Light.</li>
<li>xqgdzt.ttf: XiQue GuZiDian.</li>
<li>qpcyt.ttf: Smart Splice Super Round Body</li>
<li>arial.ttf: English only.</li>
<li>dinalternate.ttf:DIN Alternate Bold</li>
<li>helveticalt.ttf:Helvetica</li>
<li>helveticains.ttf:Helvetica Inserat</li>
<li>trajanpro.ttf:TrajanPro-Bold</li>
<li>korean.ttf: Korean.</li>
<li>japanese.ttf: Japanese.</li>
<li>thai.ttf: Thai.</li>
<li>roboto.ttf:Roboto</li>
<li>notosans.ttf:NotoSans</li>
<li>notosansthai.ttf: Thai NotoSansThai</li>
<li>sarabun.ttf: Thai Sarabun</li>
<li>kanit.ttf: Thai Kanit</li>
<li>charmonman.ttf: Thai Charmonman.</li>
<li>notonaskharabic.ttf: Arabic NotoNaskhArabic.</li>
<li>notosansdevanagari.ttf: NotoSansDevanagari for India.</li>
<li>notosanstc.ttf: Cantonese Source Han Sans NotoSansTC</li>
<li>notosanskr.ttf: Korean NotoSansKR.</li>
<li>gothica1.ttf: Korean GothicA1.</li>
<li>nanummyeongjo.ttf: Korean NanumMyeongjo.</li>
<li>notosansjp.ttf: Japanese NotoSansJP.</li>
<li>notoserifjp.ttf: Japanese NotoSerifJP.</li>
<li>shipporimincho.ttf: Japanese ShipporiMincho.</li>
Default value: hei.ttf.
<br>Note:
<li>kai.ttf is recommended for SimKai.</li>
<li>FontFileInput takes precedence when specified.</li>

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFontType(String FontType) {
        this.FontType = FontType;
    }

    /**
     * Get Font size. If not specified, the font size of the subtitle file applies. Pixel and percentage formats are supported:

- Pixel: Npx. Value range of N: (0,4096].
- Percentage: N%. Value range of N: (0,100]. For example, 10% means the subtitle font size is 10% of the source video height.

The default size is 5% of the source video height if this parameter is not specified or the font size is not configured in the subtitle file.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FontSize Font size. If not specified, the font size of the subtitle file applies. Pixel and percentage formats are supported:

- Pixel: Npx. Value range of N: (0,4096].
- Percentage: N%. Value range of N: (0,100]. For example, 10% means the subtitle font size is 10% of the source video height.

The default size is 5% of the source video height if this parameter is not specified or the font size is not configured in the subtitle file.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFontSize() {
        return this.FontSize;
    }

    /**
     * Set Font size. If not specified, the font size of the subtitle file applies. Pixel and percentage formats are supported:

- Pixel: Npx. Value range of N: (0,4096].
- Percentage: N%. Value range of N: (0,100]. For example, 10% means the subtitle font size is 10% of the source video height.

The default size is 5% of the source video height if this parameter is not specified or the font size is not configured in the subtitle file.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param FontSize Font size. If not specified, the font size of the subtitle file applies. Pixel and percentage formats are supported:

- Pixel: Npx. Value range of N: (0,4096].
- Percentage: N%. Value range of N: (0,100]. For example, 10% means the subtitle font size is 10% of the source video height.

The default size is 5% of the source video height if this parameter is not specified or the font size is not configured in the subtitle file.

Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Background width. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If background is enabled and this parameter is not specified, the default width is 90% of the source video width.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BoardWidth Background width. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If background is enabled and this parameter is not specified, the default width is 90% of the source video width.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBoardWidth() {
        return this.BoardWidth;
    }

    /**
     * Set Background width. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If background is enabled and this parameter is not specified, the default width is 90% of the source video width.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param BoardWidth Background width. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If background is enabled and this parameter is not specified, the default width is 90% of the source video width.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBoardWidth(Long BoardWidth) {
        this.BoardWidth = BoardWidth;
    }

    /**
     * Get Background height. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If background is enabled and this parameter is not specified, the default height is 15% of the source video height.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BoardHeight Background height. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If background is enabled and this parameter is not specified, the default height is 15% of the source video height.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBoardHeight() {
        return this.BoardHeight;
    }

    /**
     * Set Background height. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If background is enabled and this parameter is not specified, the default height is 15% of the source video height.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param BoardHeight Background height. The value should be a positive integer.
- Value range for pixels: [0,4096].
- Value range for percentages: [0, 100].
If background is enabled and this parameter is not specified, the default height is 15% of the source video height.

Note: This field may return null, indicating that no valid values can be obtained.
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

    /**
     * Get Stroke width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
If this is not specified, the default width is 0.3% of the source video height.
 
     * @return OutlineWidth Stroke width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
If this is not specified, the default width is 0.3% of the source video height.

     */
    public Float getOutlineWidth() {
        return this.OutlineWidth;
    }

    /**
     * Set Stroke width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
If this is not specified, the default width is 0.3% of the source video height.

     * @param OutlineWidth Stroke width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
If this is not specified, the default width is 0.3% of the source video height.

     */
    public void setOutlineWidth(Float OutlineWidth) {
        this.OutlineWidth = OutlineWidth;
    }

    /**
     * Get Stroke color. The value should be a 6-digit hexadecimal RGB value. If this is not specified, the default color is black.
 
     * @return OutlineColor Stroke color. The value should be a 6-digit hexadecimal RGB value. If this is not specified, the default color is black.

     */
    public String getOutlineColor() {
        return this.OutlineColor;
    }

    /**
     * Set Stroke color. The value should be a 6-digit hexadecimal RGB value. If this is not specified, the default color is black.

     * @param OutlineColor Stroke color. The value should be a 6-digit hexadecimal RGB value. If this is not specified, the default color is black.

     */
    public void setOutlineColor(String OutlineColor) {
        this.OutlineColor = OutlineColor;
    }

    /**
     * Get Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.
 
     * @return OutlineAlpha Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.

     */
    public Float getOutlineAlpha() {
        return this.OutlineAlpha;
    }

    /**
     * Set Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.

     * @param OutlineAlpha Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.

     */
    public void setOutlineAlpha(Float OutlineAlpha) {
        this.OutlineAlpha = OutlineAlpha;
    }

    /**
     * Get Shadow width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
If this is not specified, no shadow is applied by default.
 
     * @return ShadowWidth Shadow width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
If this is not specified, no shadow is applied by default.

     */
    public Float getShadowWidth() {
        return this.ShadowWidth;
    }

    /**
     * Set Shadow width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
If this is not specified, no shadow is applied by default.

     * @param ShadowWidth Shadow width. The value should be a floating-point number.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100].
If this is not specified, no shadow is applied by default.

     */
    public void setShadowWidth(Float ShadowWidth) {
        this.ShadowWidth = ShadowWidth;
    }

    /**
     * Get Shadow color. The value should be a 6-digit hexadecimal RGB value. If this is not specified, the default color is black (with shadow configured).
 
     * @return ShadowColor Shadow color. The value should be a 6-digit hexadecimal RGB value. If this is not specified, the default color is black (with shadow configured).

     */
    public String getShadowColor() {
        return this.ShadowColor;
    }

    /**
     * Set Shadow color. The value should be a 6-digit hexadecimal RGB value. If this is not specified, the default color is black (with shadow configured).

     * @param ShadowColor Shadow color. The value should be a 6-digit hexadecimal RGB value. If this is not specified, the default color is black (with shadow configured).

     */
    public void setShadowColor(String ShadowColor) {
        this.ShadowColor = ShadowColor;
    }

    /**
     * Get Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).
 
     * @return ShadowAlpha Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).

     */
    public Float getShadowAlpha() {
        return this.ShadowAlpha;
    }

    /**
     * Set Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).

     * @param ShadowAlpha Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).

     */
    public void setShadowAlpha(Float ShadowAlpha) {
        this.ShadowAlpha = ShadowAlpha;
    }

    /**
     * Get Line spacing. The value should be a positive integer.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.
 
     * @return LineSpacing Line spacing. The value should be a positive integer.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.

     */
    public Long getLineSpacing() {
        return this.LineSpacing;
    }

    /**
     * Set Line spacing. The value should be a positive integer.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.

     * @param LineSpacing Line spacing. The value should be a positive integer.
- Value range for pixels: [0, 1000].
- Value range for percentages: [0, 100]. If this is not specified, the default value is 0.

     */
    public void setLineSpacing(Long LineSpacing) {
        this.LineSpacing = LineSpacing;
    }

    /**
     * Get Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.
 
     * @return Alignment Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.

     */
    public String getAlignment() {
        return this.Alignment;
    }

    /**
     * Set Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.

     * @param Alignment Alignment mode. Valid values: top: The top position of the subtitle is fixed, while the bottom position changes according to the number of lines. bottom: The bottom position of the subtitle is fixed, while the top position changes according to the number of lines. If this is not specified, bottom alignment is used by default.

     */
    public void setAlignment(String Alignment) {
        this.Alignment = Alignment;
    }

    /**
     * Get Default value is 0. If this is set to 1, the value of BoardWidth is a percentage based on the video width.
 
     * @return BoardWidthUnit Default value is 0. If this is set to 1, the value of BoardWidth is a percentage based on the video width.

     */
    public Long getBoardWidthUnit() {
        return this.BoardWidthUnit;
    }

    /**
     * Set Default value is 0. If this is set to 1, the value of BoardWidth is a percentage based on the video width.

     * @param BoardWidthUnit Default value is 0. If this is set to 1, the value of BoardWidth is a percentage based on the video width.

     */
    public void setBoardWidthUnit(Long BoardWidthUnit) {
        this.BoardWidthUnit = BoardWidthUnit;
    }

    /**
     * Get Default value is 0. If this is set to 1, the value of BoardHeight is a percentage based on the video height.
 
     * @return BoardHeightUnit Default value is 0. If this is set to 1, the value of BoardHeight is a percentage based on the video height.

     */
    public Long getBoardHeightUnit() {
        return this.BoardHeightUnit;
    }

    /**
     * Set Default value is 0. If this is set to 1, the value of BoardHeight is a percentage based on the video height.

     * @param BoardHeightUnit Default value is 0. If this is set to 1, the value of BoardHeight is a percentage based on the video height.

     */
    public void setBoardHeightUnit(Long BoardHeightUnit) {
        this.BoardHeightUnit = BoardHeightUnit;
    }

    /**
     * Get Default value is 0. If this is set to 1, the value of OutlineWidth is a percentage based on the video height.
 
     * @return OutlineWidthUnit Default value is 0. If this is set to 1, the value of OutlineWidth is a percentage based on the video height.

     */
    public Long getOutlineWidthUnit() {
        return this.OutlineWidthUnit;
    }

    /**
     * Set Default value is 0. If this is set to 1, the value of OutlineWidth is a percentage based on the video height.

     * @param OutlineWidthUnit Default value is 0. If this is set to 1, the value of OutlineWidth is a percentage based on the video height.

     */
    public void setOutlineWidthUnit(Long OutlineWidthUnit) {
        this.OutlineWidthUnit = OutlineWidthUnit;
    }

    /**
     * Get Default value is 0. If this is set to 1, the value of ShadowWidth is a percentage based on the video height.
 
     * @return ShadowWidthUnit Default value is 0. If this is set to 1, the value of ShadowWidth is a percentage based on the video height.

     */
    public Long getShadowWidthUnit() {
        return this.ShadowWidthUnit;
    }

    /**
     * Set Default value is 0. If this is set to 1, the value of ShadowWidth is a percentage based on the video height.

     * @param ShadowWidthUnit Default value is 0. If this is set to 1, the value of ShadowWidth is a percentage based on the video height.

     */
    public void setShadowWidthUnit(Long ShadowWidthUnit) {
        this.ShadowWidthUnit = ShadowWidthUnit;
    }

    /**
     * Get Default value is 0. If this is set to 1, the value of LineSpacing is a percentage based on the video height.
 
     * @return LineSpacingUnit Default value is 0. If this is set to 1, the value of LineSpacing is a percentage based on the video height.

     */
    public Long getLineSpacingUnit() {
        return this.LineSpacingUnit;
    }

    /**
     * Set Default value is 0. If this is set to 1, the value of LineSpacing is a percentage based on the video height.

     * @param LineSpacingUnit Default value is 0. If this is set to 1, the value of LineSpacing is a percentage based on the video height.

     */
    public void setLineSpacingUnit(Long LineSpacingUnit) {
        this.LineSpacingUnit = LineSpacingUnit;
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
        if (source.SubtitleFileInput != null) {
            this.SubtitleFileInput = new MediaInputInfo(source.SubtitleFileInput);
        }
        if (source.FontFileInput != null) {
            this.FontFileInput = new MediaInputInfo(source.FontFileInput);
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
        if (source.OutlineWidth != null) {
            this.OutlineWidth = new Float(source.OutlineWidth);
        }
        if (source.OutlineColor != null) {
            this.OutlineColor = new String(source.OutlineColor);
        }
        if (source.OutlineAlpha != null) {
            this.OutlineAlpha = new Float(source.OutlineAlpha);
        }
        if (source.ShadowWidth != null) {
            this.ShadowWidth = new Float(source.ShadowWidth);
        }
        if (source.ShadowColor != null) {
            this.ShadowColor = new String(source.ShadowColor);
        }
        if (source.ShadowAlpha != null) {
            this.ShadowAlpha = new Float(source.ShadowAlpha);
        }
        if (source.LineSpacing != null) {
            this.LineSpacing = new Long(source.LineSpacing);
        }
        if (source.Alignment != null) {
            this.Alignment = new String(source.Alignment);
        }
        if (source.BoardWidthUnit != null) {
            this.BoardWidthUnit = new Long(source.BoardWidthUnit);
        }
        if (source.BoardHeightUnit != null) {
            this.BoardHeightUnit = new Long(source.BoardHeightUnit);
        }
        if (source.OutlineWidthUnit != null) {
            this.OutlineWidthUnit = new Long(source.OutlineWidthUnit);
        }
        if (source.ShadowWidthUnit != null) {
            this.ShadowWidthUnit = new Long(source.ShadowWidthUnit);
        }
        if (source.LineSpacingUnit != null) {
            this.LineSpacingUnit = new Long(source.LineSpacingUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "StreamIndex", this.StreamIndex);
        this.setParamObj(map, prefix + "SubtitleFileInput.", this.SubtitleFileInput);
        this.setParamObj(map, prefix + "FontFileInput.", this.FontFileInput);
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
        this.setParamSimple(map, prefix + "OutlineWidth", this.OutlineWidth);
        this.setParamSimple(map, prefix + "OutlineColor", this.OutlineColor);
        this.setParamSimple(map, prefix + "OutlineAlpha", this.OutlineAlpha);
        this.setParamSimple(map, prefix + "ShadowWidth", this.ShadowWidth);
        this.setParamSimple(map, prefix + "ShadowColor", this.ShadowColor);
        this.setParamSimple(map, prefix + "ShadowAlpha", this.ShadowAlpha);
        this.setParamSimple(map, prefix + "LineSpacing", this.LineSpacing);
        this.setParamSimple(map, prefix + "Alignment", this.Alignment);
        this.setParamSimple(map, prefix + "BoardWidthUnit", this.BoardWidthUnit);
        this.setParamSimple(map, prefix + "BoardHeightUnit", this.BoardHeightUnit);
        this.setParamSimple(map, prefix + "OutlineWidthUnit", this.OutlineWidthUnit);
        this.setParamSimple(map, prefix + "ShadowWidthUnit", this.ShadowWidthUnit);
        this.setParamSimple(map, prefix + "LineSpacingUnit", this.LineSpacingUnit);

    }
}

