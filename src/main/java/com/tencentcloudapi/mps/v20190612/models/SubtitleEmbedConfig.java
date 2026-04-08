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

public class SubtitleEmbedConfig extends AbstractModel {

    /**
    * <p>Font type, supports:</p><li>hei.ttf: Heiti</li><li>song.ttf: Song Typeface</li><li>kai.ttf (recommended) or simkai.ttf: KaiTi</li><li>msyh.ttf: Microsoft YaHei</li><li>msyhbd.ttf: Microsoft YaHei in bold</li><li>hkjgt.ttf: Hwakangangtai</li><li>dhttx.ttf: Dianheiti Ultra Light</li><li>xqgdzt.ttf: Xique Ancient Dictionary</li><li>qpcyt.ttf: Smart Splice Super Round Body</li><li>arial.ttf: only supports English</li><li>dinalternate.ttf: DIN Alternate Bold</li><li>helveticalt.ttf: Helvetica</li><li>helveticains.ttf: Helvetica Inserat</li><li>trajanpro.ttf: TrajanPro-Bold</li><li>korean.ttf: Korean</li><li>japanese.ttf: Japanese</li><li>thai.ttf: Thai</li><li>roboto.ttf: Roboto</li><li>notosans.ttf: NotoSans</li><li>notosansthai.ttf: Thai NotoSansThai</li><li>sarabun.ttf: Thai Sarabun</li><li>kanit.ttf: Thai Kanit</li><li>charmonman.ttf: Thai Charmonman</li><li>notonaskharabic.ttf: Arabic NotoNaskhArabic</li><li>notosansdevanagari.ttf: India NotoSansDevanagari</li><li>notosanstc.ttf: Cantonese NotoSansTC</li><li>notosanskr.ttf: Korean NotoSansKR</li><li>gothica1.ttf: Korean GothicA1</li><li>nanummyeongjo.ttf: Korean NanumMyeongjo</li><li>notosansjp.ttf: Japanese NotoSansJP</li><li>notoserifjp.ttf: Japanese NotoSerifJP</li><li>shipporimincho.ttf: Japanese ShipporiMincho</li>Default: hei.ttf Heiti.<br>Note:<li>KaiTi is recommended for use with kai.ttf</li><li>FontPath takes precedence when filled</li>
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * <p>Custom font file url address, either this or CosInputInfo</p>
    */
    @SerializedName("FontPath")
    @Expose
    private String FontPath;

    /**
    * <p>Custom font file cos bucket address</p>
    */
    @SerializedName("CosInputInfo")
    @Expose
    private CosInputInfo CosInputInfo;

    /**
    * <p>Font size. If not specified, the font size of the subtitle file applies. Pixel and percentage formats are supported:</p><ul><li>Pixel: Npx, where N ranges from (0,4096].</li><li>Percentage: N%, where N ranges from (0,100]. For example, 10% means the subtitle font size equals 10% of the source video height.</li></ul><p>If left blank and the subtitle file has no settings, the default is 5% of the source video height.</p>
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * <p>FontSize unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
    */
    @SerializedName("FontSizeUnit")
    @Expose
    private Long FontSizeUnit;

    /**
    * <p>Font color. Format: 0xRRGGBB. Default value: 0xFFFFFF (white).</p>
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * <p>Text opacity, value ranges from 0 to 1.</p><li>0: completely transparent</li><li>1: completely opaque</li>Default value: 1.
    */
    @SerializedName("FontAlpha")
    @Expose
    private Float FontAlpha;

    /**
    * <p>The X-coordinate position of subtitles. Specifying this parameter will ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [-4096, 4096].</li><li>Percentage: N%, where N ranges from [-100, 100]; for example, 10% means the X-coordinate of the subtitle equals 10% of the source video width.</li></ul><p>Default value: 0px.<br>Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the subtitle reference position is at the bottom of the central axis of the subtitles, as shown in the figure below:<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
    */
    @SerializedName("PosX")
    @Expose
    private Long PosX;

    /**
    * <p>PosX unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
    */
    @SerializedName("PosXUnit")
    @Expose
    private Long PosXUnit;

    /**
    * <p>Subtitle Y-coordinate position. Specify this parameter to ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle Y-coordinate = 10% * source video height.</li></ul><p>Default value: source video height * 4%.<br>Note: The coordinate axis origin is at the bottom of the central axis of the source video, and the subtitle reference point is at the bottom of the central axis of the subtitle. Refer to the figure below:<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
    */
    @SerializedName("PosY")
    @Expose
    private Long PosY;

    /**
    * <p>PosY measurement unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
    */
    @SerializedName("PosYUnit")
    @Expose
    private Long PosYUnit;

    /**
    * <p>Background configuration</p>
    */
    @SerializedName("SubtitleBoardConfig")
    @Expose
    private SubtitleBoardConfig SubtitleBoardConfig;

    /**
    * <p>Column configuration</p>
    */
    @SerializedName("SubtitleLayoutConfig")
    @Expose
    private SubtitleLayoutConfig SubtitleLayoutConfig;

    /**
    * <p>Text stroke configuration</p>
    */
    @SerializedName("SubtitleOutlineConfig")
    @Expose
    private SubtitleOutlineConfig SubtitleOutlineConfig;

    /**
    * <p>Text shadow configuration</p>
    */
    @SerializedName("SubtitleShadowConfig")
    @Expose
    private SubtitleShadowConfig SubtitleShadowConfig;

    /**
    * <p>Width of the source video dimensions, in pixels</p>
    */
    @SerializedName("SampleWidth")
    @Expose
    private Long SampleWidth;

    /**
    * <p>Height of the source video dimensions, in unit pixel</p>
    */
    @SerializedName("SampleHeight")
    @Expose
    private Long SampleHeight;

    /**
     * Get <p>Font type, supports:</p><li>hei.ttf: Heiti</li><li>song.ttf: Song Typeface</li><li>kai.ttf (recommended) or simkai.ttf: KaiTi</li><li>msyh.ttf: Microsoft YaHei</li><li>msyhbd.ttf: Microsoft YaHei in bold</li><li>hkjgt.ttf: Hwakangangtai</li><li>dhttx.ttf: Dianheiti Ultra Light</li><li>xqgdzt.ttf: Xique Ancient Dictionary</li><li>qpcyt.ttf: Smart Splice Super Round Body</li><li>arial.ttf: only supports English</li><li>dinalternate.ttf: DIN Alternate Bold</li><li>helveticalt.ttf: Helvetica</li><li>helveticains.ttf: Helvetica Inserat</li><li>trajanpro.ttf: TrajanPro-Bold</li><li>korean.ttf: Korean</li><li>japanese.ttf: Japanese</li><li>thai.ttf: Thai</li><li>roboto.ttf: Roboto</li><li>notosans.ttf: NotoSans</li><li>notosansthai.ttf: Thai NotoSansThai</li><li>sarabun.ttf: Thai Sarabun</li><li>kanit.ttf: Thai Kanit</li><li>charmonman.ttf: Thai Charmonman</li><li>notonaskharabic.ttf: Arabic NotoNaskhArabic</li><li>notosansdevanagari.ttf: India NotoSansDevanagari</li><li>notosanstc.ttf: Cantonese NotoSansTC</li><li>notosanskr.ttf: Korean NotoSansKR</li><li>gothica1.ttf: Korean GothicA1</li><li>nanummyeongjo.ttf: Korean NanumMyeongjo</li><li>notosansjp.ttf: Japanese NotoSansJP</li><li>notoserifjp.ttf: Japanese NotoSerifJP</li><li>shipporimincho.ttf: Japanese ShipporiMincho</li>Default: hei.ttf Heiti.<br>Note:<li>KaiTi is recommended for use with kai.ttf</li><li>FontPath takes precedence when filled</li> 
     * @return FontType <p>Font type, supports:</p><li>hei.ttf: Heiti</li><li>song.ttf: Song Typeface</li><li>kai.ttf (recommended) or simkai.ttf: KaiTi</li><li>msyh.ttf: Microsoft YaHei</li><li>msyhbd.ttf: Microsoft YaHei in bold</li><li>hkjgt.ttf: Hwakangangtai</li><li>dhttx.ttf: Dianheiti Ultra Light</li><li>xqgdzt.ttf: Xique Ancient Dictionary</li><li>qpcyt.ttf: Smart Splice Super Round Body</li><li>arial.ttf: only supports English</li><li>dinalternate.ttf: DIN Alternate Bold</li><li>helveticalt.ttf: Helvetica</li><li>helveticains.ttf: Helvetica Inserat</li><li>trajanpro.ttf: TrajanPro-Bold</li><li>korean.ttf: Korean</li><li>japanese.ttf: Japanese</li><li>thai.ttf: Thai</li><li>roboto.ttf: Roboto</li><li>notosans.ttf: NotoSans</li><li>notosansthai.ttf: Thai NotoSansThai</li><li>sarabun.ttf: Thai Sarabun</li><li>kanit.ttf: Thai Kanit</li><li>charmonman.ttf: Thai Charmonman</li><li>notonaskharabic.ttf: Arabic NotoNaskhArabic</li><li>notosansdevanagari.ttf: India NotoSansDevanagari</li><li>notosanstc.ttf: Cantonese NotoSansTC</li><li>notosanskr.ttf: Korean NotoSansKR</li><li>gothica1.ttf: Korean GothicA1</li><li>nanummyeongjo.ttf: Korean NanumMyeongjo</li><li>notosansjp.ttf: Japanese NotoSansJP</li><li>notoserifjp.ttf: Japanese NotoSerifJP</li><li>shipporimincho.ttf: Japanese ShipporiMincho</li>Default: hei.ttf Heiti.<br>Note:<li>KaiTi is recommended for use with kai.ttf</li><li>FontPath takes precedence when filled</li>
     */
    public String getFontType() {
        return this.FontType;
    }

    /**
     * Set <p>Font type, supports:</p><li>hei.ttf: Heiti</li><li>song.ttf: Song Typeface</li><li>kai.ttf (recommended) or simkai.ttf: KaiTi</li><li>msyh.ttf: Microsoft YaHei</li><li>msyhbd.ttf: Microsoft YaHei in bold</li><li>hkjgt.ttf: Hwakangangtai</li><li>dhttx.ttf: Dianheiti Ultra Light</li><li>xqgdzt.ttf: Xique Ancient Dictionary</li><li>qpcyt.ttf: Smart Splice Super Round Body</li><li>arial.ttf: only supports English</li><li>dinalternate.ttf: DIN Alternate Bold</li><li>helveticalt.ttf: Helvetica</li><li>helveticains.ttf: Helvetica Inserat</li><li>trajanpro.ttf: TrajanPro-Bold</li><li>korean.ttf: Korean</li><li>japanese.ttf: Japanese</li><li>thai.ttf: Thai</li><li>roboto.ttf: Roboto</li><li>notosans.ttf: NotoSans</li><li>notosansthai.ttf: Thai NotoSansThai</li><li>sarabun.ttf: Thai Sarabun</li><li>kanit.ttf: Thai Kanit</li><li>charmonman.ttf: Thai Charmonman</li><li>notonaskharabic.ttf: Arabic NotoNaskhArabic</li><li>notosansdevanagari.ttf: India NotoSansDevanagari</li><li>notosanstc.ttf: Cantonese NotoSansTC</li><li>notosanskr.ttf: Korean NotoSansKR</li><li>gothica1.ttf: Korean GothicA1</li><li>nanummyeongjo.ttf: Korean NanumMyeongjo</li><li>notosansjp.ttf: Japanese NotoSansJP</li><li>notoserifjp.ttf: Japanese NotoSerifJP</li><li>shipporimincho.ttf: Japanese ShipporiMincho</li>Default: hei.ttf Heiti.<br>Note:<li>KaiTi is recommended for use with kai.ttf</li><li>FontPath takes precedence when filled</li>
     * @param FontType <p>Font type, supports:</p><li>hei.ttf: Heiti</li><li>song.ttf: Song Typeface</li><li>kai.ttf (recommended) or simkai.ttf: KaiTi</li><li>msyh.ttf: Microsoft YaHei</li><li>msyhbd.ttf: Microsoft YaHei in bold</li><li>hkjgt.ttf: Hwakangangtai</li><li>dhttx.ttf: Dianheiti Ultra Light</li><li>xqgdzt.ttf: Xique Ancient Dictionary</li><li>qpcyt.ttf: Smart Splice Super Round Body</li><li>arial.ttf: only supports English</li><li>dinalternate.ttf: DIN Alternate Bold</li><li>helveticalt.ttf: Helvetica</li><li>helveticains.ttf: Helvetica Inserat</li><li>trajanpro.ttf: TrajanPro-Bold</li><li>korean.ttf: Korean</li><li>japanese.ttf: Japanese</li><li>thai.ttf: Thai</li><li>roboto.ttf: Roboto</li><li>notosans.ttf: NotoSans</li><li>notosansthai.ttf: Thai NotoSansThai</li><li>sarabun.ttf: Thai Sarabun</li><li>kanit.ttf: Thai Kanit</li><li>charmonman.ttf: Thai Charmonman</li><li>notonaskharabic.ttf: Arabic NotoNaskhArabic</li><li>notosansdevanagari.ttf: India NotoSansDevanagari</li><li>notosanstc.ttf: Cantonese NotoSansTC</li><li>notosanskr.ttf: Korean NotoSansKR</li><li>gothica1.ttf: Korean GothicA1</li><li>nanummyeongjo.ttf: Korean NanumMyeongjo</li><li>notosansjp.ttf: Japanese NotoSansJP</li><li>notoserifjp.ttf: Japanese NotoSerifJP</li><li>shipporimincho.ttf: Japanese ShipporiMincho</li>Default: hei.ttf Heiti.<br>Note:<li>KaiTi is recommended for use with kai.ttf</li><li>FontPath takes precedence when filled</li>
     */
    public void setFontType(String FontType) {
        this.FontType = FontType;
    }

    /**
     * Get <p>Custom font file url address, either this or CosInputInfo</p> 
     * @return FontPath <p>Custom font file url address, either this or CosInputInfo</p>
     */
    public String getFontPath() {
        return this.FontPath;
    }

    /**
     * Set <p>Custom font file url address, either this or CosInputInfo</p>
     * @param FontPath <p>Custom font file url address, either this or CosInputInfo</p>
     */
    public void setFontPath(String FontPath) {
        this.FontPath = FontPath;
    }

    /**
     * Get <p>Custom font file cos bucket address</p> 
     * @return CosInputInfo <p>Custom font file cos bucket address</p>
     */
    public CosInputInfo getCosInputInfo() {
        return this.CosInputInfo;
    }

    /**
     * Set <p>Custom font file cos bucket address</p>
     * @param CosInputInfo <p>Custom font file cos bucket address</p>
     */
    public void setCosInputInfo(CosInputInfo CosInputInfo) {
        this.CosInputInfo = CosInputInfo;
    }

    /**
     * Get <p>Font size. If not specified, the font size of the subtitle file applies. Pixel and percentage formats are supported:</p><ul><li>Pixel: Npx, where N ranges from (0,4096].</li><li>Percentage: N%, where N ranges from (0,100]. For example, 10% means the subtitle font size equals 10% of the source video height.</li></ul><p>If left blank and the subtitle file has no settings, the default is 5% of the source video height.</p> 
     * @return FontSize <p>Font size. If not specified, the font size of the subtitle file applies. Pixel and percentage formats are supported:</p><ul><li>Pixel: Npx, where N ranges from (0,4096].</li><li>Percentage: N%, where N ranges from (0,100]. For example, 10% means the subtitle font size equals 10% of the source video height.</li></ul><p>If left blank and the subtitle file has no settings, the default is 5% of the source video height.</p>
     */
    public Long getFontSize() {
        return this.FontSize;
    }

    /**
     * Set <p>Font size. If not specified, the font size of the subtitle file applies. Pixel and percentage formats are supported:</p><ul><li>Pixel: Npx, where N ranges from (0,4096].</li><li>Percentage: N%, where N ranges from (0,100]. For example, 10% means the subtitle font size equals 10% of the source video height.</li></ul><p>If left blank and the subtitle file has no settings, the default is 5% of the source video height.</p>
     * @param FontSize <p>Font size. If not specified, the font size of the subtitle file applies. Pixel and percentage formats are supported:</p><ul><li>Pixel: Npx, where N ranges from (0,4096].</li><li>Percentage: N%, where N ranges from (0,100]. For example, 10% means the subtitle font size equals 10% of the source video height.</li></ul><p>If left blank and the subtitle file has no settings, the default is 5% of the source video height.</p>
     */
    public void setFontSize(Long FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get <p>FontSize unit, 0 pixel, 1 percentage, defaults to 0, pixel</p> 
     * @return FontSizeUnit <p>FontSize unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public Long getFontSizeUnit() {
        return this.FontSizeUnit;
    }

    /**
     * Set <p>FontSize unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     * @param FontSizeUnit <p>FontSize unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public void setFontSizeUnit(Long FontSizeUnit) {
        this.FontSizeUnit = FontSizeUnit;
    }

    /**
     * Get <p>Font color. Format: 0xRRGGBB. Default value: 0xFFFFFF (white).</p> 
     * @return FontColor <p>Font color. Format: 0xRRGGBB. Default value: 0xFFFFFF (white).</p>
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set <p>Font color. Format: 0xRRGGBB. Default value: 0xFFFFFF (white).</p>
     * @param FontColor <p>Font color. Format: 0xRRGGBB. Default value: 0xFFFFFF (white).</p>
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get <p>Text opacity, value ranges from 0 to 1.</p><li>0: completely transparent</li><li>1: completely opaque</li>Default value: 1. 
     * @return FontAlpha <p>Text opacity, value ranges from 0 to 1.</p><li>0: completely transparent</li><li>1: completely opaque</li>Default value: 1.
     */
    public Float getFontAlpha() {
        return this.FontAlpha;
    }

    /**
     * Set <p>Text opacity, value ranges from 0 to 1.</p><li>0: completely transparent</li><li>1: completely opaque</li>Default value: 1.
     * @param FontAlpha <p>Text opacity, value ranges from 0 to 1.</p><li>0: completely transparent</li><li>1: completely opaque</li>Default value: 1.
     */
    public void setFontAlpha(Float FontAlpha) {
        this.FontAlpha = FontAlpha;
    }

    /**
     * Get <p>The X-coordinate position of subtitles. Specifying this parameter will ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [-4096, 4096].</li><li>Percentage: N%, where N ranges from [-100, 100]; for example, 10% means the X-coordinate of the subtitle equals 10% of the source video width.</li></ul><p>Default value: 0px.<br>Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the subtitle reference position is at the bottom of the central axis of the subtitles, as shown in the figure below:<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p> 
     * @return PosX <p>The X-coordinate position of subtitles. Specifying this parameter will ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [-4096, 4096].</li><li>Percentage: N%, where N ranges from [-100, 100]; for example, 10% means the X-coordinate of the subtitle equals 10% of the source video width.</li></ul><p>Default value: 0px.<br>Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the subtitle reference position is at the bottom of the central axis of the subtitles, as shown in the figure below:<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public Long getPosX() {
        return this.PosX;
    }

    /**
     * Set <p>The X-coordinate position of subtitles. Specifying this parameter will ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [-4096, 4096].</li><li>Percentage: N%, where N ranges from [-100, 100]; for example, 10% means the X-coordinate of the subtitle equals 10% of the source video width.</li></ul><p>Default value: 0px.<br>Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the subtitle reference position is at the bottom of the central axis of the subtitles, as shown in the figure below:<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     * @param PosX <p>The X-coordinate position of subtitles. Specifying this parameter will ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [-4096, 4096].</li><li>Percentage: N%, where N ranges from [-100, 100]; for example, 10% means the X-coordinate of the subtitle equals 10% of the source video width.</li></ul><p>Default value: 0px.<br>Note: The origin of the coordinate axes is at the bottom of the central axis of the source video, and the subtitle reference position is at the bottom of the central axis of the subtitles, as shown in the figure below:<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public void setPosX(Long PosX) {
        this.PosX = PosX;
    }

    /**
     * Get <p>PosX unit, 0 pixel, 1 percentage, defaults to 0, pixel</p> 
     * @return PosXUnit <p>PosX unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public Long getPosXUnit() {
        return this.PosXUnit;
    }

    /**
     * Set <p>PosX unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     * @param PosXUnit <p>PosX unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public void setPosXUnit(Long PosXUnit) {
        this.PosXUnit = PosXUnit;
    }

    /**
     * Get <p>Subtitle Y-coordinate position. Specify this parameter to ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle Y-coordinate = 10% * source video height.</li></ul><p>Default value: source video height * 4%.<br>Note: The coordinate axis origin is at the bottom of the central axis of the source video, and the subtitle reference point is at the bottom of the central axis of the subtitle. Refer to the figure below:<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p> 
     * @return PosY <p>Subtitle Y-coordinate position. Specify this parameter to ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle Y-coordinate = 10% * source video height.</li></ul><p>Default value: source video height * 4%.<br>Note: The coordinate axis origin is at the bottom of the central axis of the source video, and the subtitle reference point is at the bottom of the central axis of the subtitle. Refer to the figure below:<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public Long getPosY() {
        return this.PosY;
    }

    /**
     * Set <p>Subtitle Y-coordinate position. Specify this parameter to ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle Y-coordinate = 10% * source video height.</li></ul><p>Default value: source video height * 4%.<br>Note: The coordinate axis origin is at the bottom of the central axis of the source video, and the subtitle reference point is at the bottom of the central axis of the subtitle. Refer to the figure below:<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     * @param PosY <p>Subtitle Y-coordinate position. Specify this parameter to ignore the built-in coordinates in the subtitle file. Supports pixel and percentage formats:</p><ul><li>Pixel: Npx, where N ranges from [0,4096].</li><li>Percentage: N%, where N ranges from [0,100]. For example, 10% means the subtitle Y-coordinate = 10% * source video height.</li></ul><p>Default value: source video height * 4%.<br>Note: The coordinate axis origin is at the bottom of the central axis of the source video, and the subtitle reference point is at the bottom of the central axis of the subtitle. Refer to the figure below:<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public void setPosY(Long PosY) {
        this.PosY = PosY;
    }

    /**
     * Get <p>PosY measurement unit, 0 pixel, 1 percentage, defaults to 0, pixel</p> 
     * @return PosYUnit <p>PosY measurement unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public Long getPosYUnit() {
        return this.PosYUnit;
    }

    /**
     * Set <p>PosY measurement unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     * @param PosYUnit <p>PosY measurement unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public void setPosYUnit(Long PosYUnit) {
        this.PosYUnit = PosYUnit;
    }

    /**
     * Get <p>Background configuration</p> 
     * @return SubtitleBoardConfig <p>Background configuration</p>
     */
    public SubtitleBoardConfig getSubtitleBoardConfig() {
        return this.SubtitleBoardConfig;
    }

    /**
     * Set <p>Background configuration</p>
     * @param SubtitleBoardConfig <p>Background configuration</p>
     */
    public void setSubtitleBoardConfig(SubtitleBoardConfig SubtitleBoardConfig) {
        this.SubtitleBoardConfig = SubtitleBoardConfig;
    }

    /**
     * Get <p>Column configuration</p> 
     * @return SubtitleLayoutConfig <p>Column configuration</p>
     */
    public SubtitleLayoutConfig getSubtitleLayoutConfig() {
        return this.SubtitleLayoutConfig;
    }

    /**
     * Set <p>Column configuration</p>
     * @param SubtitleLayoutConfig <p>Column configuration</p>
     */
    public void setSubtitleLayoutConfig(SubtitleLayoutConfig SubtitleLayoutConfig) {
        this.SubtitleLayoutConfig = SubtitleLayoutConfig;
    }

    /**
     * Get <p>Text stroke configuration</p> 
     * @return SubtitleOutlineConfig <p>Text stroke configuration</p>
     */
    public SubtitleOutlineConfig getSubtitleOutlineConfig() {
        return this.SubtitleOutlineConfig;
    }

    /**
     * Set <p>Text stroke configuration</p>
     * @param SubtitleOutlineConfig <p>Text stroke configuration</p>
     */
    public void setSubtitleOutlineConfig(SubtitleOutlineConfig SubtitleOutlineConfig) {
        this.SubtitleOutlineConfig = SubtitleOutlineConfig;
    }

    /**
     * Get <p>Text shadow configuration</p> 
     * @return SubtitleShadowConfig <p>Text shadow configuration</p>
     */
    public SubtitleShadowConfig getSubtitleShadowConfig() {
        return this.SubtitleShadowConfig;
    }

    /**
     * Set <p>Text shadow configuration</p>
     * @param SubtitleShadowConfig <p>Text shadow configuration</p>
     */
    public void setSubtitleShadowConfig(SubtitleShadowConfig SubtitleShadowConfig) {
        this.SubtitleShadowConfig = SubtitleShadowConfig;
    }

    /**
     * Get <p>Width of the source video dimensions, in pixels</p> 
     * @return SampleWidth <p>Width of the source video dimensions, in pixels</p>
     */
    public Long getSampleWidth() {
        return this.SampleWidth;
    }

    /**
     * Set <p>Width of the source video dimensions, in pixels</p>
     * @param SampleWidth <p>Width of the source video dimensions, in pixels</p>
     */
    public void setSampleWidth(Long SampleWidth) {
        this.SampleWidth = SampleWidth;
    }

    /**
     * Get <p>Height of the source video dimensions, in unit pixel</p> 
     * @return SampleHeight <p>Height of the source video dimensions, in unit pixel</p>
     */
    public Long getSampleHeight() {
        return this.SampleHeight;
    }

    /**
     * Set <p>Height of the source video dimensions, in unit pixel</p>
     * @param SampleHeight <p>Height of the source video dimensions, in unit pixel</p>
     */
    public void setSampleHeight(Long SampleHeight) {
        this.SampleHeight = SampleHeight;
    }

    public SubtitleEmbedConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleEmbedConfig(SubtitleEmbedConfig source) {
        if (source.FontType != null) {
            this.FontType = new String(source.FontType);
        }
        if (source.FontPath != null) {
            this.FontPath = new String(source.FontPath);
        }
        if (source.CosInputInfo != null) {
            this.CosInputInfo = new CosInputInfo(source.CosInputInfo);
        }
        if (source.FontSize != null) {
            this.FontSize = new Long(source.FontSize);
        }
        if (source.FontSizeUnit != null) {
            this.FontSizeUnit = new Long(source.FontSizeUnit);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontAlpha != null) {
            this.FontAlpha = new Float(source.FontAlpha);
        }
        if (source.PosX != null) {
            this.PosX = new Long(source.PosX);
        }
        if (source.PosXUnit != null) {
            this.PosXUnit = new Long(source.PosXUnit);
        }
        if (source.PosY != null) {
            this.PosY = new Long(source.PosY);
        }
        if (source.PosYUnit != null) {
            this.PosYUnit = new Long(source.PosYUnit);
        }
        if (source.SubtitleBoardConfig != null) {
            this.SubtitleBoardConfig = new SubtitleBoardConfig(source.SubtitleBoardConfig);
        }
        if (source.SubtitleLayoutConfig != null) {
            this.SubtitleLayoutConfig = new SubtitleLayoutConfig(source.SubtitleLayoutConfig);
        }
        if (source.SubtitleOutlineConfig != null) {
            this.SubtitleOutlineConfig = new SubtitleOutlineConfig(source.SubtitleOutlineConfig);
        }
        if (source.SubtitleShadowConfig != null) {
            this.SubtitleShadowConfig = new SubtitleShadowConfig(source.SubtitleShadowConfig);
        }
        if (source.SampleWidth != null) {
            this.SampleWidth = new Long(source.SampleWidth);
        }
        if (source.SampleHeight != null) {
            this.SampleHeight = new Long(source.SampleHeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FontType", this.FontType);
        this.setParamSimple(map, prefix + "FontPath", this.FontPath);
        this.setParamObj(map, prefix + "CosInputInfo.", this.CosInputInfo);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontSizeUnit", this.FontSizeUnit);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlpha", this.FontAlpha);
        this.setParamSimple(map, prefix + "PosX", this.PosX);
        this.setParamSimple(map, prefix + "PosXUnit", this.PosXUnit);
        this.setParamSimple(map, prefix + "PosY", this.PosY);
        this.setParamSimple(map, prefix + "PosYUnit", this.PosYUnit);
        this.setParamObj(map, prefix + "SubtitleBoardConfig.", this.SubtitleBoardConfig);
        this.setParamObj(map, prefix + "SubtitleLayoutConfig.", this.SubtitleLayoutConfig);
        this.setParamObj(map, prefix + "SubtitleOutlineConfig.", this.SubtitleOutlineConfig);
        this.setParamObj(map, prefix + "SubtitleShadowConfig.", this.SubtitleShadowConfig);
        this.setParamSimple(map, prefix + "SampleWidth", this.SampleWidth);
        this.setParamSimple(map, prefix + "SampleHeight", this.SampleHeight);

    }
}

