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

public class SubtitleInfoInput extends AbstractModel {

    /**
    * <p>Subtitle ID.</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Font type.</p><p>Enumeration value:</p><ul><li>hei.ttf: Heiti</li><li>song.ttf: Song Typeface</li><li>kai.ttf (recommended) or simkai.ttf: KaiTi</li><li>msyh.ttf: Microsoft YaHei</li><li>msyhbd.ttf: Microsoft YaHei in bold</li><li>hkjgt.ttf: Hwakangangtai</li><li>dhttx.ttf: Dianheiti Ultra Light</li><li>xqgdzt.ttf: Xique Ancient Dictionary</li><li>qpcyt.ttf: Smart Splice Super Round Body</li><li>arial.ttf: only supports English</li><li>dinalternate.ttf: DIN Alternate Bold</li><li>helveticalt.ttf: Helvetica</li><li>helveticains.ttf: Helvetica Inserat</li><li>trajanpro.ttf: TrajanPro-Bold</li><li>korean.ttf: Korean</li><li>japanese.ttf: Japanese</li><li>thai.ttf: Thai</li><li>roboto.ttf: Roboto</li><li>notosans.ttf: NotoSans</li><li>notosansthai.ttf: Thai NotoSansThai</li><li>sarabun.ttf: Thai Sarabun</li><li>kanit.ttf: Thai Kanit</li><li>charmonman.ttf: Thai Charmonman</li><li>notonaskharabic.ttf: Arabic NotoNaskhArabic</li><li>notosansdevanagari.ttf: India NotoSansDevanagari</li><li>notosanstc.ttf: Cantonese NotoSansTC</li><li>notosanskr.ttf: Korean NotoSansKR</li><li>gothica1.ttf: Korean GothicA1</li><li>nanummyeongjo.ttf: Korean NanumMyeongjo</li><li>notosansjp.ttf: Japanese NotoSansJP</li><li>notoserifjp.ttf: Japanese NotoSerifJP</li><li>shipporimincho.ttf: Japanese ShipporiMincho</li></ul><p>Default value: hei.ttf Heiti</p>
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * <p>Font size. If not specified, the font size in the subtitle file applies. Pixel and percentage formats are supported:</p><ul><li>Pixel: Npx, where N ranges from (0,4096].</li><li>Percentage: N%, where N ranges from (0,100]. For example, 10% means the subtitle font size equals 10% of the source video height. If left blank and the subtitle file has no settings, the default is 5% of the source video height.</li></ul>
    */
    @SerializedName("FontSize")
    @Expose
    private String FontSize;

    /**
    * <p>Font color, format: 0xRRGGBB.</p><p>Default value: 0xFFFFFF (white).</p>
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * <p>Text opacity. Value ranges from 0 to 1.</p><ul><li>0: completely transparent;</li><li>1: completely opaque</li></ul><p>Default value: 1</p>
    */
    @SerializedName("FontAlpha")
    @Expose
    private Float FontAlpha;

    /**
    * <p>Subtitle Y-coordinate position. Specify this parameter to ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle Y-coordinate = 10% * source video height. Default value: source video height * 4%.<br>Note: The coordinate axis origin is at the bottom of the central axis of the source video, and the subtitle reference point is at the bottom of the central axis of the subtitle. Refer to the figure below:<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * <p>Subtitle background base plate Y-coordinate position. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle background base plate Y-coordinate = 10% * source video height. If not specified, the subtitle background base plate is disabled.<br>Note: The coordinate axis origin is located at the bottom of the central axis of the source video, and the reference point of the subtitle background base plate is at the bottom of its central axis. Refer to the figure below:<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
    */
    @SerializedName("BoardY")
    @Expose
    private String BoardY;

    /**
    * <p>Width of the base plate, a positive integer.</p><ul><li>Pixel: Npx, where N is in the range of [0,4096].</li><li>Percentage: N%, where N ranges from 0 to 100. If background is enabled and this parameter is not specified, the default width is 90% of the source video width.</li></ul>
    */
    @SerializedName("BoardWidth")
    @Expose
    private String BoardWidth;

    /**
    * <p>Height of the base plate, a positive integer.</p><ul><li>Pixel: Npx, where N ranges from 0 to 4096.</li><li>Percentage: N%, where N ranges from 0 to 100. If background is enabled and this parameter is not specified, the default height is 15% of the source video height.</li></ul>
    */
    @SerializedName("BoardHeight")
    @Expose
    private String BoardHeight;

    /**
    * <p>Base plate color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black).</p>
    */
    @SerializedName("BoardColor")
    @Expose
    private String BoardColor;

    /**
    * <p>Subtitle background transparency. Value range: [0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 0.8.</p>
    */
    @SerializedName("BoardAlpha")
    @Expose
    private Float BoardAlpha;

    /**
    * <p>Alignment mode.</p><p>Enumeration values:</p><ul><li>top: top alignment. The top position of subtitles is fixed, while the bottom position changes according to the line count.</li><li>bottom: bottom alignment. The bottom position of subtitles is fixed, while the top position changes according to the line count.</li></ul><p>Default value: bottom</p>
    */
    @SerializedName("Alignment")
    @Expose
    private String Alignment;

    /**
    * <p>Stroke width. Floating-point number.</p><ul><li>Pixel: Npx, where N is in the range of [0,1000].</li><li>Percentage: N%, where N ranges from 0 to 100.</li></ul><p>By default if left blank, it is 0.3% of the source video height.</p>
    */
    @SerializedName("OutlineWidth")
    @Expose
    private String OutlineWidth;

    /**
    * <p>Border color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black).</p>
    */
    @SerializedName("OutlineColor")
    @Expose
    private String OutlineColor;

    /**
    * <p>Stroke transparency. The value should be a positive floating-point number in the range of (0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 1</p>
    */
    @SerializedName("OutlineAlpha")
    @Expose
    private Float OutlineAlpha;

    /**
    * <p>Shadow width. Floating-point number.</p><ul><li>Pixel: Npx, N value ranges from 0 to 1000.</li><li>Percentage: N%, N value ranges from 0 to 100. No shading by default if left blank.</li></ul>
    */
    @SerializedName("ShadowWidth")
    @Expose
    private String ShadowWidth;

    /**
    * <p>Shadow color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black) when shadow has set.</p>
    */
    @SerializedName("ShadowColor")
    @Expose
    private String ShadowColor;

    /**
    * <p>Shadow transparency. The value should be a positive floating-point number in the range of (0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 1, completely opaque, with shadow configured.</p>
    */
    @SerializedName("ShadowAlpha")
    @Expose
    private Float ShadowAlpha;

    /**
    * <p>Line spacing. Positive integer.</p><ul><li>Pixel: Npx, N value ranges from 0 to 1000.</li><li>Percentage: N%, N value ranges from 0 to 100.</li></ul><p>Default value: 0</p>
    */
    @SerializedName("LineSpacing")
    @Expose
    private String LineSpacing;

    /**
     * Get <p>Subtitle ID.</p> 
     * @return Id <p>Subtitle ID.</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Subtitle ID.</p>
     * @param Id <p>Subtitle ID.</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Font type.</p><p>Enumeration value:</p><ul><li>hei.ttf: Heiti</li><li>song.ttf: Song Typeface</li><li>kai.ttf (recommended) or simkai.ttf: KaiTi</li><li>msyh.ttf: Microsoft YaHei</li><li>msyhbd.ttf: Microsoft YaHei in bold</li><li>hkjgt.ttf: Hwakangangtai</li><li>dhttx.ttf: Dianheiti Ultra Light</li><li>xqgdzt.ttf: Xique Ancient Dictionary</li><li>qpcyt.ttf: Smart Splice Super Round Body</li><li>arial.ttf: only supports English</li><li>dinalternate.ttf: DIN Alternate Bold</li><li>helveticalt.ttf: Helvetica</li><li>helveticains.ttf: Helvetica Inserat</li><li>trajanpro.ttf: TrajanPro-Bold</li><li>korean.ttf: Korean</li><li>japanese.ttf: Japanese</li><li>thai.ttf: Thai</li><li>roboto.ttf: Roboto</li><li>notosans.ttf: NotoSans</li><li>notosansthai.ttf: Thai NotoSansThai</li><li>sarabun.ttf: Thai Sarabun</li><li>kanit.ttf: Thai Kanit</li><li>charmonman.ttf: Thai Charmonman</li><li>notonaskharabic.ttf: Arabic NotoNaskhArabic</li><li>notosansdevanagari.ttf: India NotoSansDevanagari</li><li>notosanstc.ttf: Cantonese NotoSansTC</li><li>notosanskr.ttf: Korean NotoSansKR</li><li>gothica1.ttf: Korean GothicA1</li><li>nanummyeongjo.ttf: Korean NanumMyeongjo</li><li>notosansjp.ttf: Japanese NotoSansJP</li><li>notoserifjp.ttf: Japanese NotoSerifJP</li><li>shipporimincho.ttf: Japanese ShipporiMincho</li></ul><p>Default value: hei.ttf Heiti</p> 
     * @return FontType <p>Font type.</p><p>Enumeration value:</p><ul><li>hei.ttf: Heiti</li><li>song.ttf: Song Typeface</li><li>kai.ttf (recommended) or simkai.ttf: KaiTi</li><li>msyh.ttf: Microsoft YaHei</li><li>msyhbd.ttf: Microsoft YaHei in bold</li><li>hkjgt.ttf: Hwakangangtai</li><li>dhttx.ttf: Dianheiti Ultra Light</li><li>xqgdzt.ttf: Xique Ancient Dictionary</li><li>qpcyt.ttf: Smart Splice Super Round Body</li><li>arial.ttf: only supports English</li><li>dinalternate.ttf: DIN Alternate Bold</li><li>helveticalt.ttf: Helvetica</li><li>helveticains.ttf: Helvetica Inserat</li><li>trajanpro.ttf: TrajanPro-Bold</li><li>korean.ttf: Korean</li><li>japanese.ttf: Japanese</li><li>thai.ttf: Thai</li><li>roboto.ttf: Roboto</li><li>notosans.ttf: NotoSans</li><li>notosansthai.ttf: Thai NotoSansThai</li><li>sarabun.ttf: Thai Sarabun</li><li>kanit.ttf: Thai Kanit</li><li>charmonman.ttf: Thai Charmonman</li><li>notonaskharabic.ttf: Arabic NotoNaskhArabic</li><li>notosansdevanagari.ttf: India NotoSansDevanagari</li><li>notosanstc.ttf: Cantonese NotoSansTC</li><li>notosanskr.ttf: Korean NotoSansKR</li><li>gothica1.ttf: Korean GothicA1</li><li>nanummyeongjo.ttf: Korean NanumMyeongjo</li><li>notosansjp.ttf: Japanese NotoSansJP</li><li>notoserifjp.ttf: Japanese NotoSerifJP</li><li>shipporimincho.ttf: Japanese ShipporiMincho</li></ul><p>Default value: hei.ttf Heiti</p>
     */
    public String getFontType() {
        return this.FontType;
    }

    /**
     * Set <p>Font type.</p><p>Enumeration value:</p><ul><li>hei.ttf: Heiti</li><li>song.ttf: Song Typeface</li><li>kai.ttf (recommended) or simkai.ttf: KaiTi</li><li>msyh.ttf: Microsoft YaHei</li><li>msyhbd.ttf: Microsoft YaHei in bold</li><li>hkjgt.ttf: Hwakangangtai</li><li>dhttx.ttf: Dianheiti Ultra Light</li><li>xqgdzt.ttf: Xique Ancient Dictionary</li><li>qpcyt.ttf: Smart Splice Super Round Body</li><li>arial.ttf: only supports English</li><li>dinalternate.ttf: DIN Alternate Bold</li><li>helveticalt.ttf: Helvetica</li><li>helveticains.ttf: Helvetica Inserat</li><li>trajanpro.ttf: TrajanPro-Bold</li><li>korean.ttf: Korean</li><li>japanese.ttf: Japanese</li><li>thai.ttf: Thai</li><li>roboto.ttf: Roboto</li><li>notosans.ttf: NotoSans</li><li>notosansthai.ttf: Thai NotoSansThai</li><li>sarabun.ttf: Thai Sarabun</li><li>kanit.ttf: Thai Kanit</li><li>charmonman.ttf: Thai Charmonman</li><li>notonaskharabic.ttf: Arabic NotoNaskhArabic</li><li>notosansdevanagari.ttf: India NotoSansDevanagari</li><li>notosanstc.ttf: Cantonese NotoSansTC</li><li>notosanskr.ttf: Korean NotoSansKR</li><li>gothica1.ttf: Korean GothicA1</li><li>nanummyeongjo.ttf: Korean NanumMyeongjo</li><li>notosansjp.ttf: Japanese NotoSansJP</li><li>notoserifjp.ttf: Japanese NotoSerifJP</li><li>shipporimincho.ttf: Japanese ShipporiMincho</li></ul><p>Default value: hei.ttf Heiti</p>
     * @param FontType <p>Font type.</p><p>Enumeration value:</p><ul><li>hei.ttf: Heiti</li><li>song.ttf: Song Typeface</li><li>kai.ttf (recommended) or simkai.ttf: KaiTi</li><li>msyh.ttf: Microsoft YaHei</li><li>msyhbd.ttf: Microsoft YaHei in bold</li><li>hkjgt.ttf: Hwakangangtai</li><li>dhttx.ttf: Dianheiti Ultra Light</li><li>xqgdzt.ttf: Xique Ancient Dictionary</li><li>qpcyt.ttf: Smart Splice Super Round Body</li><li>arial.ttf: only supports English</li><li>dinalternate.ttf: DIN Alternate Bold</li><li>helveticalt.ttf: Helvetica</li><li>helveticains.ttf: Helvetica Inserat</li><li>trajanpro.ttf: TrajanPro-Bold</li><li>korean.ttf: Korean</li><li>japanese.ttf: Japanese</li><li>thai.ttf: Thai</li><li>roboto.ttf: Roboto</li><li>notosans.ttf: NotoSans</li><li>notosansthai.ttf: Thai NotoSansThai</li><li>sarabun.ttf: Thai Sarabun</li><li>kanit.ttf: Thai Kanit</li><li>charmonman.ttf: Thai Charmonman</li><li>notonaskharabic.ttf: Arabic NotoNaskhArabic</li><li>notosansdevanagari.ttf: India NotoSansDevanagari</li><li>notosanstc.ttf: Cantonese NotoSansTC</li><li>notosanskr.ttf: Korean NotoSansKR</li><li>gothica1.ttf: Korean GothicA1</li><li>nanummyeongjo.ttf: Korean NanumMyeongjo</li><li>notosansjp.ttf: Japanese NotoSansJP</li><li>notoserifjp.ttf: Japanese NotoSerifJP</li><li>shipporimincho.ttf: Japanese ShipporiMincho</li></ul><p>Default value: hei.ttf Heiti</p>
     */
    public void setFontType(String FontType) {
        this.FontType = FontType;
    }

    /**
     * Get <p>Font size. If not specified, the font size in the subtitle file applies. Pixel and percentage formats are supported:</p><ul><li>Pixel: Npx, where N ranges from (0,4096].</li><li>Percentage: N%, where N ranges from (0,100]. For example, 10% means the subtitle font size equals 10% of the source video height. If left blank and the subtitle file has no settings, the default is 5% of the source video height.</li></ul> 
     * @return FontSize <p>Font size. If not specified, the font size in the subtitle file applies. Pixel and percentage formats are supported:</p><ul><li>Pixel: Npx, where N ranges from (0,4096].</li><li>Percentage: N%, where N ranges from (0,100]. For example, 10% means the subtitle font size equals 10% of the source video height. If left blank and the subtitle file has no settings, the default is 5% of the source video height.</li></ul>
     */
    public String getFontSize() {
        return this.FontSize;
    }

    /**
     * Set <p>Font size. If not specified, the font size in the subtitle file applies. Pixel and percentage formats are supported:</p><ul><li>Pixel: Npx, where N ranges from (0,4096].</li><li>Percentage: N%, where N ranges from (0,100]. For example, 10% means the subtitle font size equals 10% of the source video height. If left blank and the subtitle file has no settings, the default is 5% of the source video height.</li></ul>
     * @param FontSize <p>Font size. If not specified, the font size in the subtitle file applies. Pixel and percentage formats are supported:</p><ul><li>Pixel: Npx, where N ranges from (0,4096].</li><li>Percentage: N%, where N ranges from (0,100]. For example, 10% means the subtitle font size equals 10% of the source video height. If left blank and the subtitle file has no settings, the default is 5% of the source video height.</li></ul>
     */
    public void setFontSize(String FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get <p>Font color, format: 0xRRGGBB.</p><p>Default value: 0xFFFFFF (white).</p> 
     * @return FontColor <p>Font color, format: 0xRRGGBB.</p><p>Default value: 0xFFFFFF (white).</p>
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set <p>Font color, format: 0xRRGGBB.</p><p>Default value: 0xFFFFFF (white).</p>
     * @param FontColor <p>Font color, format: 0xRRGGBB.</p><p>Default value: 0xFFFFFF (white).</p>
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get <p>Text opacity. Value ranges from 0 to 1.</p><ul><li>0: completely transparent;</li><li>1: completely opaque</li></ul><p>Default value: 1</p> 
     * @return FontAlpha <p>Text opacity. Value ranges from 0 to 1.</p><ul><li>0: completely transparent;</li><li>1: completely opaque</li></ul><p>Default value: 1</p>
     */
    public Float getFontAlpha() {
        return this.FontAlpha;
    }

    /**
     * Set <p>Text opacity. Value ranges from 0 to 1.</p><ul><li>0: completely transparent;</li><li>1: completely opaque</li></ul><p>Default value: 1</p>
     * @param FontAlpha <p>Text opacity. Value ranges from 0 to 1.</p><ul><li>0: completely transparent;</li><li>1: completely opaque</li></ul><p>Default value: 1</p>
     */
    public void setFontAlpha(Float FontAlpha) {
        this.FontAlpha = FontAlpha;
    }

    /**
     * Get <p>Subtitle Y-coordinate position. Specify this parameter to ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle Y-coordinate = 10% * source video height. Default value: source video height * 4%.<br>Note: The coordinate axis origin is at the bottom of the central axis of the source video, and the subtitle reference point is at the bottom of the central axis of the subtitle. Refer to the figure below:<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul> 
     * @return YPos <p>Subtitle Y-coordinate position. Specify this parameter to ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle Y-coordinate = 10% * source video height. Default value: source video height * 4%.<br>Note: The coordinate axis origin is at the bottom of the central axis of the source video, and the subtitle reference point is at the bottom of the central axis of the subtitle. Refer to the figure below:<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set <p>Subtitle Y-coordinate position. Specify this parameter to ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle Y-coordinate = 10% * source video height. Default value: source video height * 4%.<br>Note: The coordinate axis origin is at the bottom of the central axis of the source video, and the subtitle reference point is at the bottom of the central axis of the subtitle. Refer to the figure below:<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
     * @param YPos <p>Subtitle Y-coordinate position. Specify this parameter to ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle Y-coordinate = 10% * source video height. Default value: source video height * 4%.<br>Note: The coordinate axis origin is at the bottom of the central axis of the source video, and the subtitle reference point is at the bottom of the central axis of the subtitle. Refer to the figure below:<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get <p>Subtitle background base plate Y-coordinate position. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle background base plate Y-coordinate = 10% * source video height. If not specified, the subtitle background base plate is disabled.<br>Note: The coordinate axis origin is located at the bottom of the central axis of the source video, and the reference point of the subtitle background base plate is at the bottom of its central axis. Refer to the figure below:<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul> 
     * @return BoardY <p>Subtitle background base plate Y-coordinate position. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle background base plate Y-coordinate = 10% * source video height. If not specified, the subtitle background base plate is disabled.<br>Note: The coordinate axis origin is located at the bottom of the central axis of the source video, and the reference point of the subtitle background base plate is at the bottom of its central axis. Refer to the figure below:<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
     */
    public String getBoardY() {
        return this.BoardY;
    }

    /**
     * Set <p>Subtitle background base plate Y-coordinate position. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle background base plate Y-coordinate = 10% * source video height. If not specified, the subtitle background base plate is disabled.<br>Note: The coordinate axis origin is located at the bottom of the central axis of the source video, and the reference point of the subtitle background base plate is at the bottom of its central axis. Refer to the figure below:<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
     * @param BoardY <p>Subtitle background base plate Y-coordinate position. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle background base plate Y-coordinate = 10% * source video height. If not specified, the subtitle background base plate is disabled.<br>Note: The coordinate axis origin is located at the bottom of the central axis of the source video, and the reference point of the subtitle background base plate is at the bottom of its central axis. Refer to the figure below:<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
     */
    public void setBoardY(String BoardY) {
        this.BoardY = BoardY;
    }

    /**
     * Get <p>Width of the base plate, a positive integer.</p><ul><li>Pixel: Npx, where N is in the range of [0,4096].</li><li>Percentage: N%, where N ranges from 0 to 100. If background is enabled and this parameter is not specified, the default width is 90% of the source video width.</li></ul> 
     * @return BoardWidth <p>Width of the base plate, a positive integer.</p><ul><li>Pixel: Npx, where N is in the range of [0,4096].</li><li>Percentage: N%, where N ranges from 0 to 100. If background is enabled and this parameter is not specified, the default width is 90% of the source video width.</li></ul>
     */
    public String getBoardWidth() {
        return this.BoardWidth;
    }

    /**
     * Set <p>Width of the base plate, a positive integer.</p><ul><li>Pixel: Npx, where N is in the range of [0,4096].</li><li>Percentage: N%, where N ranges from 0 to 100. If background is enabled and this parameter is not specified, the default width is 90% of the source video width.</li></ul>
     * @param BoardWidth <p>Width of the base plate, a positive integer.</p><ul><li>Pixel: Npx, where N is in the range of [0,4096].</li><li>Percentage: N%, where N ranges from 0 to 100. If background is enabled and this parameter is not specified, the default width is 90% of the source video width.</li></ul>
     */
    public void setBoardWidth(String BoardWidth) {
        this.BoardWidth = BoardWidth;
    }

    /**
     * Get <p>Height of the base plate, a positive integer.</p><ul><li>Pixel: Npx, where N ranges from 0 to 4096.</li><li>Percentage: N%, where N ranges from 0 to 100. If background is enabled and this parameter is not specified, the default height is 15% of the source video height.</li></ul> 
     * @return BoardHeight <p>Height of the base plate, a positive integer.</p><ul><li>Pixel: Npx, where N ranges from 0 to 4096.</li><li>Percentage: N%, where N ranges from 0 to 100. If background is enabled and this parameter is not specified, the default height is 15% of the source video height.</li></ul>
     */
    public String getBoardHeight() {
        return this.BoardHeight;
    }

    /**
     * Set <p>Height of the base plate, a positive integer.</p><ul><li>Pixel: Npx, where N ranges from 0 to 4096.</li><li>Percentage: N%, where N ranges from 0 to 100. If background is enabled and this parameter is not specified, the default height is 15% of the source video height.</li></ul>
     * @param BoardHeight <p>Height of the base plate, a positive integer.</p><ul><li>Pixel: Npx, where N ranges from 0 to 4096.</li><li>Percentage: N%, where N ranges from 0 to 100. If background is enabled and this parameter is not specified, the default height is 15% of the source video height.</li></ul>
     */
    public void setBoardHeight(String BoardHeight) {
        this.BoardHeight = BoardHeight;
    }

    /**
     * Get <p>Base plate color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black).</p> 
     * @return BoardColor <p>Base plate color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black).</p>
     */
    public String getBoardColor() {
        return this.BoardColor;
    }

    /**
     * Set <p>Base plate color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black).</p>
     * @param BoardColor <p>Base plate color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black).</p>
     */
    public void setBoardColor(String BoardColor) {
        this.BoardColor = BoardColor;
    }

    /**
     * Get <p>Subtitle background transparency. Value range: [0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 0.8.</p> 
     * @return BoardAlpha <p>Subtitle background transparency. Value range: [0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 0.8.</p>
     */
    public Float getBoardAlpha() {
        return this.BoardAlpha;
    }

    /**
     * Set <p>Subtitle background transparency. Value range: [0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 0.8.</p>
     * @param BoardAlpha <p>Subtitle background transparency. Value range: [0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 0.8.</p>
     */
    public void setBoardAlpha(Float BoardAlpha) {
        this.BoardAlpha = BoardAlpha;
    }

    /**
     * Get <p>Alignment mode.</p><p>Enumeration values:</p><ul><li>top: top alignment. The top position of subtitles is fixed, while the bottom position changes according to the line count.</li><li>bottom: bottom alignment. The bottom position of subtitles is fixed, while the top position changes according to the line count.</li></ul><p>Default value: bottom</p> 
     * @return Alignment <p>Alignment mode.</p><p>Enumeration values:</p><ul><li>top: top alignment. The top position of subtitles is fixed, while the bottom position changes according to the line count.</li><li>bottom: bottom alignment. The bottom position of subtitles is fixed, while the top position changes according to the line count.</li></ul><p>Default value: bottom</p>
     */
    public String getAlignment() {
        return this.Alignment;
    }

    /**
     * Set <p>Alignment mode.</p><p>Enumeration values:</p><ul><li>top: top alignment. The top position of subtitles is fixed, while the bottom position changes according to the line count.</li><li>bottom: bottom alignment. The bottom position of subtitles is fixed, while the top position changes according to the line count.</li></ul><p>Default value: bottom</p>
     * @param Alignment <p>Alignment mode.</p><p>Enumeration values:</p><ul><li>top: top alignment. The top position of subtitles is fixed, while the bottom position changes according to the line count.</li><li>bottom: bottom alignment. The bottom position of subtitles is fixed, while the top position changes according to the line count.</li></ul><p>Default value: bottom</p>
     */
    public void setAlignment(String Alignment) {
        this.Alignment = Alignment;
    }

    /**
     * Get <p>Stroke width. Floating-point number.</p><ul><li>Pixel: Npx, where N is in the range of [0,1000].</li><li>Percentage: N%, where N ranges from 0 to 100.</li></ul><p>By default if left blank, it is 0.3% of the source video height.</p> 
     * @return OutlineWidth <p>Stroke width. Floating-point number.</p><ul><li>Pixel: Npx, where N is in the range of [0,1000].</li><li>Percentage: N%, where N ranges from 0 to 100.</li></ul><p>By default if left blank, it is 0.3% of the source video height.</p>
     */
    public String getOutlineWidth() {
        return this.OutlineWidth;
    }

    /**
     * Set <p>Stroke width. Floating-point number.</p><ul><li>Pixel: Npx, where N is in the range of [0,1000].</li><li>Percentage: N%, where N ranges from 0 to 100.</li></ul><p>By default if left blank, it is 0.3% of the source video height.</p>
     * @param OutlineWidth <p>Stroke width. Floating-point number.</p><ul><li>Pixel: Npx, where N is in the range of [0,1000].</li><li>Percentage: N%, where N ranges from 0 to 100.</li></ul><p>By default if left blank, it is 0.3% of the source video height.</p>
     */
    public void setOutlineWidth(String OutlineWidth) {
        this.OutlineWidth = OutlineWidth;
    }

    /**
     * Get <p>Border color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black).</p> 
     * @return OutlineColor <p>Border color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black).</p>
     */
    public String getOutlineColor() {
        return this.OutlineColor;
    }

    /**
     * Set <p>Border color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black).</p>
     * @param OutlineColor <p>Border color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black).</p>
     */
    public void setOutlineColor(String OutlineColor) {
        this.OutlineColor = OutlineColor;
    }

    /**
     * Get <p>Stroke transparency. The value should be a positive floating-point number in the range of (0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 1</p> 
     * @return OutlineAlpha <p>Stroke transparency. The value should be a positive floating-point number in the range of (0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 1</p>
     */
    public Float getOutlineAlpha() {
        return this.OutlineAlpha;
    }

    /**
     * Set <p>Stroke transparency. The value should be a positive floating-point number in the range of (0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 1</p>
     * @param OutlineAlpha <p>Stroke transparency. The value should be a positive floating-point number in the range of (0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 1</p>
     */
    public void setOutlineAlpha(Float OutlineAlpha) {
        this.OutlineAlpha = OutlineAlpha;
    }

    /**
     * Get <p>Shadow width. Floating-point number.</p><ul><li>Pixel: Npx, N value ranges from 0 to 1000.</li><li>Percentage: N%, N value ranges from 0 to 100. No shading by default if left blank.</li></ul> 
     * @return ShadowWidth <p>Shadow width. Floating-point number.</p><ul><li>Pixel: Npx, N value ranges from 0 to 1000.</li><li>Percentage: N%, N value ranges from 0 to 100. No shading by default if left blank.</li></ul>
     */
    public String getShadowWidth() {
        return this.ShadowWidth;
    }

    /**
     * Set <p>Shadow width. Floating-point number.</p><ul><li>Pixel: Npx, N value ranges from 0 to 1000.</li><li>Percentage: N%, N value ranges from 0 to 100. No shading by default if left blank.</li></ul>
     * @param ShadowWidth <p>Shadow width. Floating-point number.</p><ul><li>Pixel: Npx, N value ranges from 0 to 1000.</li><li>Percentage: N%, N value ranges from 0 to 100. No shading by default if left blank.</li></ul>
     */
    public void setShadowWidth(String ShadowWidth) {
        this.ShadowWidth = ShadowWidth;
    }

    /**
     * Get <p>Shadow color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black) when shadow has set.</p> 
     * @return ShadowColor <p>Shadow color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black) when shadow has set.</p>
     */
    public String getShadowColor() {
        return this.ShadowColor;
    }

    /**
     * Set <p>Shadow color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black) when shadow has set.</p>
     * @param ShadowColor <p>Shadow color. Format: 0xRRGGBB.</p><p>Default value: 0x000000 (black) when shadow has set.</p>
     */
    public void setShadowColor(String ShadowColor) {
        this.ShadowColor = ShadowColor;
    }

    /**
     * Get <p>Shadow transparency. The value should be a positive floating-point number in the range of (0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 1, completely opaque, with shadow configured.</p> 
     * @return ShadowAlpha <p>Shadow transparency. The value should be a positive floating-point number in the range of (0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 1, completely opaque, with shadow configured.</p>
     */
    public Float getShadowAlpha() {
        return this.ShadowAlpha;
    }

    /**
     * Set <p>Shadow transparency. The value should be a positive floating-point number in the range of (0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 1, completely opaque, with shadow configured.</p>
     * @param ShadowAlpha <p>Shadow transparency. The value should be a positive floating-point number in the range of (0, 1].</p><ul><li>0: completely transparent;</li><li>1: completely opaque.</li></ul><p>Default value: 1, completely opaque, with shadow configured.</p>
     */
    public void setShadowAlpha(Float ShadowAlpha) {
        this.ShadowAlpha = ShadowAlpha;
    }

    /**
     * Get <p>Line spacing. Positive integer.</p><ul><li>Pixel: Npx, N value ranges from 0 to 1000.</li><li>Percentage: N%, N value ranges from 0 to 100.</li></ul><p>Default value: 0</p> 
     * @return LineSpacing <p>Line spacing. Positive integer.</p><ul><li>Pixel: Npx, N value ranges from 0 to 1000.</li><li>Percentage: N%, N value ranges from 0 to 100.</li></ul><p>Default value: 0</p>
     */
    public String getLineSpacing() {
        return this.LineSpacing;
    }

    /**
     * Set <p>Line spacing. Positive integer.</p><ul><li>Pixel: Npx, N value ranges from 0 to 1000.</li><li>Percentage: N%, N value ranges from 0 to 100.</li></ul><p>Default value: 0</p>
     * @param LineSpacing <p>Line spacing. Positive integer.</p><ul><li>Pixel: Npx, N value ranges from 0 to 1000.</li><li>Percentage: N%, N value ranges from 0 to 100.</li></ul><p>Default value: 0</p>
     */
    public void setLineSpacing(String LineSpacing) {
        this.LineSpacing = LineSpacing;
    }

    public SubtitleInfoInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleInfoInput(SubtitleInfoInput source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
            this.BoardWidth = new String(source.BoardWidth);
        }
        if (source.BoardHeight != null) {
            this.BoardHeight = new String(source.BoardHeight);
        }
        if (source.BoardColor != null) {
            this.BoardColor = new String(source.BoardColor);
        }
        if (source.BoardAlpha != null) {
            this.BoardAlpha = new Float(source.BoardAlpha);
        }
        if (source.Alignment != null) {
            this.Alignment = new String(source.Alignment);
        }
        if (source.OutlineWidth != null) {
            this.OutlineWidth = new String(source.OutlineWidth);
        }
        if (source.OutlineColor != null) {
            this.OutlineColor = new String(source.OutlineColor);
        }
        if (source.OutlineAlpha != null) {
            this.OutlineAlpha = new Float(source.OutlineAlpha);
        }
        if (source.ShadowWidth != null) {
            this.ShadowWidth = new String(source.ShadowWidth);
        }
        if (source.ShadowColor != null) {
            this.ShadowColor = new String(source.ShadowColor);
        }
        if (source.ShadowAlpha != null) {
            this.ShadowAlpha = new Float(source.ShadowAlpha);
        }
        if (source.LineSpacing != null) {
            this.LineSpacing = new String(source.LineSpacing);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
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
        this.setParamSimple(map, prefix + "Alignment", this.Alignment);
        this.setParamSimple(map, prefix + "OutlineWidth", this.OutlineWidth);
        this.setParamSimple(map, prefix + "OutlineColor", this.OutlineColor);
        this.setParamSimple(map, prefix + "OutlineAlpha", this.OutlineAlpha);
        this.setParamSimple(map, prefix + "ShadowWidth", this.ShadowWidth);
        this.setParamSimple(map, prefix + "ShadowColor", this.ShadowColor);
        this.setParamSimple(map, prefix + "ShadowAlpha", this.ShadowAlpha);
        this.setParamSimple(map, prefix + "LineSpacing", this.LineSpacing);

    }
}

