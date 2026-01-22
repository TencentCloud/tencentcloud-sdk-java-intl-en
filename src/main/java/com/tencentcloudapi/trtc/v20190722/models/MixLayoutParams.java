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

public class MixLayoutParams extends AbstractModel {

    /**
    * Layout mode.
1: floating layout.
2: screen sharing layout.
3: nine-grid layout.
4: custom layout.

Floating layout: by default, the video footage of the first host who enters the room (or a specified host) fills the entire screen. other hosts' video images are arranged horizontally from the bottom-left corner in the room entry sequence, displayed as small pictures floating above the large screen. when the number of screens is less than or equal to 17, each line has 4 (4 x 4 arrangement). when the number of screens exceeds 17, the small pictures are rearranged with 5 per line (5 x 5 arrangement). a maximum of 25 screens are supported. if the user only sends audio, it still occupies a screen position.

Screen sharing layout: specifies a large screen position on the left side for one host (if not specified, the large screen position uses the background color). other hosts are arranged vertically on the right side from top to bottom. when the number of screens is less than 17, each column on the right supports up to 8 hosts, occupying a maximum of two columns. when the number of screens exceeds 17, hosts beyond the 17th are arranged horizontally starting from the bottom-left corner. a maximum of 25 screens is supported. if a host only sends audio, it still occupies a screen position.

Nine-Grid layout: automatically adjust the size of each frame based on the number of hosts. each host's frame size is the same, supporting up to 25 frames.

Custom layout: customize the layout of each host's video as needed in MixLayoutList.
    */
    @SerializedName("MixLayoutMode")
    @Expose
    private Long MixLayoutMode;

    /**
    * The custom layout details. This parameter is valid if `MixLayoutMode` is set to `4`. Up to 25 videos can be displayed.
    */
    @SerializedName("MixLayoutList")
    @Expose
    private MixLayout [] MixLayoutList;

    /**
    * The background color, which is a hexadecimal value (starting with "#", followed by the color value) converted from an 8-bit RGB value. For example, the RGB value of orange is `R:255 G:165 B:0`, and its hexadecimal value is `#FFA500`. The default color is black.
    */
    @SerializedName("BackGroundColor")
    @Expose
    private String BackGroundColor;

    /**
    * The user whose video is displayed in the big window. This parameter is valid if `MixLayoutMode` is set to `1` (floating) or `2` (screen sharing). If it is left empty, the first anchor entering the room is displayed in the big window in the floating mode and the canvas background is displayed in the screen sharing mode.
    */
    @SerializedName("MaxResolutionUserId")
    @Expose
    private String MaxResolutionUserId;

    /**
    * The stream type.
0: Primary stream (default)
1: Substream (screen sharing stream)
This parameter specifies the type of the stream displayed in the big window. If it appears in `MixLayoutList`, it indicates the type of the stream of a specified user.
    */
    @SerializedName("MediaId")
    @Expose
    private Long MediaId;

    /**
    * The image url supports only jpg, png, and jpeg. the image resolution is limited to no more than 2K, and the image size limit is no more than 5MB. note that the url must carry the format extension, and only specific strings are supported in the url, including a-z, a-z, 0-9, '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', and '='.
    */
    @SerializedName("BackgroundImageUrl")
    @Expose
    private String BackgroundImageUrl;

    /**
    * Set to 1 to enable the placeholder image function, and 0 to disable it. default is 0. when enabled, the corresponding placeholder image can be displayed in the preset position if the user has no upload audio and video.
    */
    @SerializedName("PlaceHolderMode")
    @Expose
    private Long PlaceHolderMode;

    /**
    * Handling solution when the background image aspect ratio is not the same, consistent with the RenderMode defined in MixLayoutList.
    */
    @SerializedName("BackgroundImageRenderMode")
    @Expose
    private Long BackgroundImageRenderMode;

    /**
    * Sub-Picture placeholder image url supports only jpg, png, jpeg. resolution limitation is no more than 2K. image size limit is no more than 5MB. note that the url must carry format extension and supports only specific string literals within the range of a-z a-z 0-9 '-', '.', '_', '~', ':', '/', '?', '#', '[', ']' '@', '!', '&', '(', ')', '*', '+', ',', '%', '='.
    */
    @SerializedName("DefaultSubBackgroundImage")
    @Expose
    private String DefaultSubBackgroundImage;

    /**
    * The watermark layout. Up to 25 watermarks are supported.
    */
    @SerializedName("WaterMarkList")
    @Expose
    private WaterMark [] WaterMarkList;

    /**
    * When the aspect ratio of the background image does not match in the template layout, the handling solution is applied. the custom layout is disabled and aligns with the RenderMode defined in MixLayoutList.
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
    * This parameter is valid only if the screen sharing layout is used. If you set it to `1`, the large video window will appear on the right and the small window on the left. The default value is `0`.
    */
    @SerializedName("MaxResolutionUserAlign")
    @Expose
    private Long MaxResolutionUserAlign;

    /**
    * Controls whether audio users inside the room occupy the stream mixing layout. this takes effect only in mixed stream recording and template layout. true: represents that audio users do not occupy placeholders. false: represents that audio users occupy placeholders (false by default).
    */
    @SerializedName("PureAudioDisableLayout")
    @Expose
    private Boolean PureAudioDisableLayout;

    /**
     * Get Layout mode.
1: floating layout.
2: screen sharing layout.
3: nine-grid layout.
4: custom layout.

Floating layout: by default, the video footage of the first host who enters the room (or a specified host) fills the entire screen. other hosts' video images are arranged horizontally from the bottom-left corner in the room entry sequence, displayed as small pictures floating above the large screen. when the number of screens is less than or equal to 17, each line has 4 (4 x 4 arrangement). when the number of screens exceeds 17, the small pictures are rearranged with 5 per line (5 x 5 arrangement). a maximum of 25 screens are supported. if the user only sends audio, it still occupies a screen position.

Screen sharing layout: specifies a large screen position on the left side for one host (if not specified, the large screen position uses the background color). other hosts are arranged vertically on the right side from top to bottom. when the number of screens is less than 17, each column on the right supports up to 8 hosts, occupying a maximum of two columns. when the number of screens exceeds 17, hosts beyond the 17th are arranged horizontally starting from the bottom-left corner. a maximum of 25 screens is supported. if a host only sends audio, it still occupies a screen position.

Nine-Grid layout: automatically adjust the size of each frame based on the number of hosts. each host's frame size is the same, supporting up to 25 frames.

Custom layout: customize the layout of each host's video as needed in MixLayoutList. 
     * @return MixLayoutMode Layout mode.
1: floating layout.
2: screen sharing layout.
3: nine-grid layout.
4: custom layout.

Floating layout: by default, the video footage of the first host who enters the room (or a specified host) fills the entire screen. other hosts' video images are arranged horizontally from the bottom-left corner in the room entry sequence, displayed as small pictures floating above the large screen. when the number of screens is less than or equal to 17, each line has 4 (4 x 4 arrangement). when the number of screens exceeds 17, the small pictures are rearranged with 5 per line (5 x 5 arrangement). a maximum of 25 screens are supported. if the user only sends audio, it still occupies a screen position.

Screen sharing layout: specifies a large screen position on the left side for one host (if not specified, the large screen position uses the background color). other hosts are arranged vertically on the right side from top to bottom. when the number of screens is less than 17, each column on the right supports up to 8 hosts, occupying a maximum of two columns. when the number of screens exceeds 17, hosts beyond the 17th are arranged horizontally starting from the bottom-left corner. a maximum of 25 screens is supported. if a host only sends audio, it still occupies a screen position.

Nine-Grid layout: automatically adjust the size of each frame based on the number of hosts. each host's frame size is the same, supporting up to 25 frames.

Custom layout: customize the layout of each host's video as needed in MixLayoutList.
     */
    public Long getMixLayoutMode() {
        return this.MixLayoutMode;
    }

    /**
     * Set Layout mode.
1: floating layout.
2: screen sharing layout.
3: nine-grid layout.
4: custom layout.

Floating layout: by default, the video footage of the first host who enters the room (or a specified host) fills the entire screen. other hosts' video images are arranged horizontally from the bottom-left corner in the room entry sequence, displayed as small pictures floating above the large screen. when the number of screens is less than or equal to 17, each line has 4 (4 x 4 arrangement). when the number of screens exceeds 17, the small pictures are rearranged with 5 per line (5 x 5 arrangement). a maximum of 25 screens are supported. if the user only sends audio, it still occupies a screen position.

Screen sharing layout: specifies a large screen position on the left side for one host (if not specified, the large screen position uses the background color). other hosts are arranged vertically on the right side from top to bottom. when the number of screens is less than 17, each column on the right supports up to 8 hosts, occupying a maximum of two columns. when the number of screens exceeds 17, hosts beyond the 17th are arranged horizontally starting from the bottom-left corner. a maximum of 25 screens is supported. if a host only sends audio, it still occupies a screen position.

Nine-Grid layout: automatically adjust the size of each frame based on the number of hosts. each host's frame size is the same, supporting up to 25 frames.

Custom layout: customize the layout of each host's video as needed in MixLayoutList.
     * @param MixLayoutMode Layout mode.
1: floating layout.
2: screen sharing layout.
3: nine-grid layout.
4: custom layout.

Floating layout: by default, the video footage of the first host who enters the room (or a specified host) fills the entire screen. other hosts' video images are arranged horizontally from the bottom-left corner in the room entry sequence, displayed as small pictures floating above the large screen. when the number of screens is less than or equal to 17, each line has 4 (4 x 4 arrangement). when the number of screens exceeds 17, the small pictures are rearranged with 5 per line (5 x 5 arrangement). a maximum of 25 screens are supported. if the user only sends audio, it still occupies a screen position.

Screen sharing layout: specifies a large screen position on the left side for one host (if not specified, the large screen position uses the background color). other hosts are arranged vertically on the right side from top to bottom. when the number of screens is less than 17, each column on the right supports up to 8 hosts, occupying a maximum of two columns. when the number of screens exceeds 17, hosts beyond the 17th are arranged horizontally starting from the bottom-left corner. a maximum of 25 screens is supported. if a host only sends audio, it still occupies a screen position.

Nine-Grid layout: automatically adjust the size of each frame based on the number of hosts. each host's frame size is the same, supporting up to 25 frames.

Custom layout: customize the layout of each host's video as needed in MixLayoutList.
     */
    public void setMixLayoutMode(Long MixLayoutMode) {
        this.MixLayoutMode = MixLayoutMode;
    }

    /**
     * Get The custom layout details. This parameter is valid if `MixLayoutMode` is set to `4`. Up to 25 videos can be displayed. 
     * @return MixLayoutList The custom layout details. This parameter is valid if `MixLayoutMode` is set to `4`. Up to 25 videos can be displayed.
     */
    public MixLayout [] getMixLayoutList() {
        return this.MixLayoutList;
    }

    /**
     * Set The custom layout details. This parameter is valid if `MixLayoutMode` is set to `4`. Up to 25 videos can be displayed.
     * @param MixLayoutList The custom layout details. This parameter is valid if `MixLayoutMode` is set to `4`. Up to 25 videos can be displayed.
     */
    public void setMixLayoutList(MixLayout [] MixLayoutList) {
        this.MixLayoutList = MixLayoutList;
    }

    /**
     * Get The background color, which is a hexadecimal value (starting with "#", followed by the color value) converted from an 8-bit RGB value. For example, the RGB value of orange is `R:255 G:165 B:0`, and its hexadecimal value is `#FFA500`. The default color is black. 
     * @return BackGroundColor The background color, which is a hexadecimal value (starting with "#", followed by the color value) converted from an 8-bit RGB value. For example, the RGB value of orange is `R:255 G:165 B:0`, and its hexadecimal value is `#FFA500`. The default color is black.
     */
    public String getBackGroundColor() {
        return this.BackGroundColor;
    }

    /**
     * Set The background color, which is a hexadecimal value (starting with "#", followed by the color value) converted from an 8-bit RGB value. For example, the RGB value of orange is `R:255 G:165 B:0`, and its hexadecimal value is `#FFA500`. The default color is black.
     * @param BackGroundColor The background color, which is a hexadecimal value (starting with "#", followed by the color value) converted from an 8-bit RGB value. For example, the RGB value of orange is `R:255 G:165 B:0`, and its hexadecimal value is `#FFA500`. The default color is black.
     */
    public void setBackGroundColor(String BackGroundColor) {
        this.BackGroundColor = BackGroundColor;
    }

    /**
     * Get The user whose video is displayed in the big window. This parameter is valid if `MixLayoutMode` is set to `1` (floating) or `2` (screen sharing). If it is left empty, the first anchor entering the room is displayed in the big window in the floating mode and the canvas background is displayed in the screen sharing mode. 
     * @return MaxResolutionUserId The user whose video is displayed in the big window. This parameter is valid if `MixLayoutMode` is set to `1` (floating) or `2` (screen sharing). If it is left empty, the first anchor entering the room is displayed in the big window in the floating mode and the canvas background is displayed in the screen sharing mode.
     */
    public String getMaxResolutionUserId() {
        return this.MaxResolutionUserId;
    }

    /**
     * Set The user whose video is displayed in the big window. This parameter is valid if `MixLayoutMode` is set to `1` (floating) or `2` (screen sharing). If it is left empty, the first anchor entering the room is displayed in the big window in the floating mode and the canvas background is displayed in the screen sharing mode.
     * @param MaxResolutionUserId The user whose video is displayed in the big window. This parameter is valid if `MixLayoutMode` is set to `1` (floating) or `2` (screen sharing). If it is left empty, the first anchor entering the room is displayed in the big window in the floating mode and the canvas background is displayed in the screen sharing mode.
     */
    public void setMaxResolutionUserId(String MaxResolutionUserId) {
        this.MaxResolutionUserId = MaxResolutionUserId;
    }

    /**
     * Get The stream type.
0: Primary stream (default)
1: Substream (screen sharing stream)
This parameter specifies the type of the stream displayed in the big window. If it appears in `MixLayoutList`, it indicates the type of the stream of a specified user. 
     * @return MediaId The stream type.
0: Primary stream (default)
1: Substream (screen sharing stream)
This parameter specifies the type of the stream displayed in the big window. If it appears in `MixLayoutList`, it indicates the type of the stream of a specified user.
     */
    public Long getMediaId() {
        return this.MediaId;
    }

    /**
     * Set The stream type.
0: Primary stream (default)
1: Substream (screen sharing stream)
This parameter specifies the type of the stream displayed in the big window. If it appears in `MixLayoutList`, it indicates the type of the stream of a specified user.
     * @param MediaId The stream type.
0: Primary stream (default)
1: Substream (screen sharing stream)
This parameter specifies the type of the stream displayed in the big window. If it appears in `MixLayoutList`, it indicates the type of the stream of a specified user.
     */
    public void setMediaId(Long MediaId) {
        this.MediaId = MediaId;
    }

    /**
     * Get The image url supports only jpg, png, and jpeg. the image resolution is limited to no more than 2K, and the image size limit is no more than 5MB. note that the url must carry the format extension, and only specific strings are supported in the url, including a-z, a-z, 0-9, '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', and '='. 
     * @return BackgroundImageUrl The image url supports only jpg, png, and jpeg. the image resolution is limited to no more than 2K, and the image size limit is no more than 5MB. note that the url must carry the format extension, and only specific strings are supported in the url, including a-z, a-z, 0-9, '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', and '='.
     */
    public String getBackgroundImageUrl() {
        return this.BackgroundImageUrl;
    }

    /**
     * Set The image url supports only jpg, png, and jpeg. the image resolution is limited to no more than 2K, and the image size limit is no more than 5MB. note that the url must carry the format extension, and only specific strings are supported in the url, including a-z, a-z, 0-9, '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', and '='.
     * @param BackgroundImageUrl The image url supports only jpg, png, and jpeg. the image resolution is limited to no more than 2K, and the image size limit is no more than 5MB. note that the url must carry the format extension, and only specific strings are supported in the url, including a-z, a-z, 0-9, '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', and '='.
     */
    public void setBackgroundImageUrl(String BackgroundImageUrl) {
        this.BackgroundImageUrl = BackgroundImageUrl;
    }

    /**
     * Get Set to 1 to enable the placeholder image function, and 0 to disable it. default is 0. when enabled, the corresponding placeholder image can be displayed in the preset position if the user has no upload audio and video. 
     * @return PlaceHolderMode Set to 1 to enable the placeholder image function, and 0 to disable it. default is 0. when enabled, the corresponding placeholder image can be displayed in the preset position if the user has no upload audio and video.
     */
    public Long getPlaceHolderMode() {
        return this.PlaceHolderMode;
    }

    /**
     * Set Set to 1 to enable the placeholder image function, and 0 to disable it. default is 0. when enabled, the corresponding placeholder image can be displayed in the preset position if the user has no upload audio and video.
     * @param PlaceHolderMode Set to 1 to enable the placeholder image function, and 0 to disable it. default is 0. when enabled, the corresponding placeholder image can be displayed in the preset position if the user has no upload audio and video.
     */
    public void setPlaceHolderMode(Long PlaceHolderMode) {
        this.PlaceHolderMode = PlaceHolderMode;
    }

    /**
     * Get Handling solution when the background image aspect ratio is not the same, consistent with the RenderMode defined in MixLayoutList. 
     * @return BackgroundImageRenderMode Handling solution when the background image aspect ratio is not the same, consistent with the RenderMode defined in MixLayoutList.
     */
    public Long getBackgroundImageRenderMode() {
        return this.BackgroundImageRenderMode;
    }

    /**
     * Set Handling solution when the background image aspect ratio is not the same, consistent with the RenderMode defined in MixLayoutList.
     * @param BackgroundImageRenderMode Handling solution when the background image aspect ratio is not the same, consistent with the RenderMode defined in MixLayoutList.
     */
    public void setBackgroundImageRenderMode(Long BackgroundImageRenderMode) {
        this.BackgroundImageRenderMode = BackgroundImageRenderMode;
    }

    /**
     * Get Sub-Picture placeholder image url supports only jpg, png, jpeg. resolution limitation is no more than 2K. image size limit is no more than 5MB. note that the url must carry format extension and supports only specific string literals within the range of a-z a-z 0-9 '-', '.', '_', '~', ':', '/', '?', '#', '[', ']' '@', '!', '&', '(', ')', '*', '+', ',', '%', '='. 
     * @return DefaultSubBackgroundImage Sub-Picture placeholder image url supports only jpg, png, jpeg. resolution limitation is no more than 2K. image size limit is no more than 5MB. note that the url must carry format extension and supports only specific string literals within the range of a-z a-z 0-9 '-', '.', '_', '~', ':', '/', '?', '#', '[', ']' '@', '!', '&', '(', ')', '*', '+', ',', '%', '='.
     */
    public String getDefaultSubBackgroundImage() {
        return this.DefaultSubBackgroundImage;
    }

    /**
     * Set Sub-Picture placeholder image url supports only jpg, png, jpeg. resolution limitation is no more than 2K. image size limit is no more than 5MB. note that the url must carry format extension and supports only specific string literals within the range of a-z a-z 0-9 '-', '.', '_', '~', ':', '/', '?', '#', '[', ']' '@', '!', '&', '(', ')', '*', '+', ',', '%', '='.
     * @param DefaultSubBackgroundImage Sub-Picture placeholder image url supports only jpg, png, jpeg. resolution limitation is no more than 2K. image size limit is no more than 5MB. note that the url must carry format extension and supports only specific string literals within the range of a-z a-z 0-9 '-', '.', '_', '~', ':', '/', '?', '#', '[', ']' '@', '!', '&', '(', ')', '*', '+', ',', '%', '='.
     */
    public void setDefaultSubBackgroundImage(String DefaultSubBackgroundImage) {
        this.DefaultSubBackgroundImage = DefaultSubBackgroundImage;
    }

    /**
     * Get The watermark layout. Up to 25 watermarks are supported. 
     * @return WaterMarkList The watermark layout. Up to 25 watermarks are supported.
     */
    public WaterMark [] getWaterMarkList() {
        return this.WaterMarkList;
    }

    /**
     * Set The watermark layout. Up to 25 watermarks are supported.
     * @param WaterMarkList The watermark layout. Up to 25 watermarks are supported.
     */
    public void setWaterMarkList(WaterMark [] WaterMarkList) {
        this.WaterMarkList = WaterMarkList;
    }

    /**
     * Get When the aspect ratio of the background image does not match in the template layout, the handling solution is applied. the custom layout is disabled and aligns with the RenderMode defined in MixLayoutList. 
     * @return RenderMode When the aspect ratio of the background image does not match in the template layout, the handling solution is applied. the custom layout is disabled and aligns with the RenderMode defined in MixLayoutList.
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set When the aspect ratio of the background image does not match in the template layout, the handling solution is applied. the custom layout is disabled and aligns with the RenderMode defined in MixLayoutList.
     * @param RenderMode When the aspect ratio of the background image does not match in the template layout, the handling solution is applied. the custom layout is disabled and aligns with the RenderMode defined in MixLayoutList.
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    /**
     * Get This parameter is valid only if the screen sharing layout is used. If you set it to `1`, the large video window will appear on the right and the small window on the left. The default value is `0`. 
     * @return MaxResolutionUserAlign This parameter is valid only if the screen sharing layout is used. If you set it to `1`, the large video window will appear on the right and the small window on the left. The default value is `0`.
     */
    public Long getMaxResolutionUserAlign() {
        return this.MaxResolutionUserAlign;
    }

    /**
     * Set This parameter is valid only if the screen sharing layout is used. If you set it to `1`, the large video window will appear on the right and the small window on the left. The default value is `0`.
     * @param MaxResolutionUserAlign This parameter is valid only if the screen sharing layout is used. If you set it to `1`, the large video window will appear on the right and the small window on the left. The default value is `0`.
     */
    public void setMaxResolutionUserAlign(Long MaxResolutionUserAlign) {
        this.MaxResolutionUserAlign = MaxResolutionUserAlign;
    }

    /**
     * Get Controls whether audio users inside the room occupy the stream mixing layout. this takes effect only in mixed stream recording and template layout. true: represents that audio users do not occupy placeholders. false: represents that audio users occupy placeholders (false by default). 
     * @return PureAudioDisableLayout Controls whether audio users inside the room occupy the stream mixing layout. this takes effect only in mixed stream recording and template layout. true: represents that audio users do not occupy placeholders. false: represents that audio users occupy placeholders (false by default).
     */
    public Boolean getPureAudioDisableLayout() {
        return this.PureAudioDisableLayout;
    }

    /**
     * Set Controls whether audio users inside the room occupy the stream mixing layout. this takes effect only in mixed stream recording and template layout. true: represents that audio users do not occupy placeholders. false: represents that audio users occupy placeholders (false by default).
     * @param PureAudioDisableLayout Controls whether audio users inside the room occupy the stream mixing layout. this takes effect only in mixed stream recording and template layout. true: represents that audio users do not occupy placeholders. false: represents that audio users occupy placeholders (false by default).
     */
    public void setPureAudioDisableLayout(Boolean PureAudioDisableLayout) {
        this.PureAudioDisableLayout = PureAudioDisableLayout;
    }

    public MixLayoutParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MixLayoutParams(MixLayoutParams source) {
        if (source.MixLayoutMode != null) {
            this.MixLayoutMode = new Long(source.MixLayoutMode);
        }
        if (source.MixLayoutList != null) {
            this.MixLayoutList = new MixLayout[source.MixLayoutList.length];
            for (int i = 0; i < source.MixLayoutList.length; i++) {
                this.MixLayoutList[i] = new MixLayout(source.MixLayoutList[i]);
            }
        }
        if (source.BackGroundColor != null) {
            this.BackGroundColor = new String(source.BackGroundColor);
        }
        if (source.MaxResolutionUserId != null) {
            this.MaxResolutionUserId = new String(source.MaxResolutionUserId);
        }
        if (source.MediaId != null) {
            this.MediaId = new Long(source.MediaId);
        }
        if (source.BackgroundImageUrl != null) {
            this.BackgroundImageUrl = new String(source.BackgroundImageUrl);
        }
        if (source.PlaceHolderMode != null) {
            this.PlaceHolderMode = new Long(source.PlaceHolderMode);
        }
        if (source.BackgroundImageRenderMode != null) {
            this.BackgroundImageRenderMode = new Long(source.BackgroundImageRenderMode);
        }
        if (source.DefaultSubBackgroundImage != null) {
            this.DefaultSubBackgroundImage = new String(source.DefaultSubBackgroundImage);
        }
        if (source.WaterMarkList != null) {
            this.WaterMarkList = new WaterMark[source.WaterMarkList.length];
            for (int i = 0; i < source.WaterMarkList.length; i++) {
                this.WaterMarkList[i] = new WaterMark(source.WaterMarkList[i]);
            }
        }
        if (source.RenderMode != null) {
            this.RenderMode = new Long(source.RenderMode);
        }
        if (source.MaxResolutionUserAlign != null) {
            this.MaxResolutionUserAlign = new Long(source.MaxResolutionUserAlign);
        }
        if (source.PureAudioDisableLayout != null) {
            this.PureAudioDisableLayout = new Boolean(source.PureAudioDisableLayout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MixLayoutMode", this.MixLayoutMode);
        this.setParamArrayObj(map, prefix + "MixLayoutList.", this.MixLayoutList);
        this.setParamSimple(map, prefix + "BackGroundColor", this.BackGroundColor);
        this.setParamSimple(map, prefix + "MaxResolutionUserId", this.MaxResolutionUserId);
        this.setParamSimple(map, prefix + "MediaId", this.MediaId);
        this.setParamSimple(map, prefix + "BackgroundImageUrl", this.BackgroundImageUrl);
        this.setParamSimple(map, prefix + "PlaceHolderMode", this.PlaceHolderMode);
        this.setParamSimple(map, prefix + "BackgroundImageRenderMode", this.BackgroundImageRenderMode);
        this.setParamSimple(map, prefix + "DefaultSubBackgroundImage", this.DefaultSubBackgroundImage);
        this.setParamArrayObj(map, prefix + "WaterMarkList.", this.WaterMarkList);
        this.setParamSimple(map, prefix + "RenderMode", this.RenderMode);
        this.setParamSimple(map, prefix + "MaxResolutionUserAlign", this.MaxResolutionUserAlign);
        this.setParamSimple(map, prefix + "PureAudioDisableLayout", this.PureAudioDisableLayout);

    }
}

