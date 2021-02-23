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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LayoutParams extends AbstractModel{

    /**
    * On-cloud stream mix layout template ID. 0: floating template (default value); 1: grid template; 2: screen sharing template; 3: picture-in-picture template; 4: custom template.
    */
    @SerializedName("Template")
    @Expose
    private Long Template;

    /**
    * ID of the user in the big image, which takes effect in a screen sharing, floating, or picture-in-picture template.
    */
    @SerializedName("MainVideoUserId")
    @Expose
    private String MainVideoUserId;

    /**
    * Stream type of the big image, which takes effect in a screen sharing, floating, or picture-in-picture template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter.
    */
    @SerializedName("MainVideoStreamType")
    @Expose
    private Long MainVideoStreamType;

    /**
    * Layout parameter of the small image, which takes effect in a picture-in-picture template.
    */
    @SerializedName("SmallVideoLayoutParams")
    @Expose
    private SmallVideoLayoutParams SmallVideoLayoutParams;

    /**
    * You can set the layout parameter as 1 or 0 in the screen sharing template. 1: big image on the right and small images on the left, 0: big image on the left and small images on the right. The default value is 0. 
    */
    @SerializedName("MainVideoRightAlign")
    @Expose
    private Long MainVideoRightAlign;

    /**
    * A user list, which takes effect for floating, grid, or screen sharing templates. When the user list has been set, the stream mix output for users in this user list will include both audio and video; the stream mix output for users not in the list will only include audio. Up to 16 users can be set.
    */
    @SerializedName("MixVideoUids")
    @Expose
    private String [] MixVideoUids;

    /**
    * Valid in custom template, used to specify the video image position of a user in mixed streams.
    */
    @SerializedName("PresetLayoutConfig")
    @Expose
    private PresetLayoutConfig [] PresetLayoutConfig;

    /**
    * Valid in custom templates. 1: the placeholding feature is enabled; 0 (default): the feature is disabled. When the feature is enabled, but a user for whom a position is reserved is not sending video data, the position will show the corresponding placeholder image.
    */
    @SerializedName("PlaceHolderMode")
    @Expose
    private Long PlaceHolderMode;

    /**
    * Whether an audio-only stream occupies an image spot, which takes effect in a floating, grid, or screen sharing template. Valid values: 0 (default): when a floating or grid template is used, users sending audio only occupy image spots; when a screen sharing template is used, users (except the user whose screen is shared) sending audio only do not occupy image spots; 1: users sending audio only occupy image spots; 2: users sending audio only do not occupy image spots.
    */
    @SerializedName("PureAudioHoldPlaceMode")
    @Expose
    private Long PureAudioHoldPlaceMode;

    /**
     * Get On-cloud stream mix layout template ID. 0: floating template (default value); 1: grid template; 2: screen sharing template; 3: picture-in-picture template; 4: custom template. 
     * @return Template On-cloud stream mix layout template ID. 0: floating template (default value); 1: grid template; 2: screen sharing template; 3: picture-in-picture template; 4: custom template.
     */
    public Long getTemplate() {
        return this.Template;
    }

    /**
     * Set On-cloud stream mix layout template ID. 0: floating template (default value); 1: grid template; 2: screen sharing template; 3: picture-in-picture template; 4: custom template.
     * @param Template On-cloud stream mix layout template ID. 0: floating template (default value); 1: grid template; 2: screen sharing template; 3: picture-in-picture template; 4: custom template.
     */
    public void setTemplate(Long Template) {
        this.Template = Template;
    }

    /**
     * Get ID of the user in the big image, which takes effect in a screen sharing, floating, or picture-in-picture template. 
     * @return MainVideoUserId ID of the user in the big image, which takes effect in a screen sharing, floating, or picture-in-picture template.
     */
    public String getMainVideoUserId() {
        return this.MainVideoUserId;
    }

    /**
     * Set ID of the user in the big image, which takes effect in a screen sharing, floating, or picture-in-picture template.
     * @param MainVideoUserId ID of the user in the big image, which takes effect in a screen sharing, floating, or picture-in-picture template.
     */
    public void setMainVideoUserId(String MainVideoUserId) {
        this.MainVideoUserId = MainVideoUserId;
    }

    /**
     * Get Stream type of the big image, which takes effect in a screen sharing, floating, or picture-in-picture template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter. 
     * @return MainVideoStreamType Stream type of the big image, which takes effect in a screen sharing, floating, or picture-in-picture template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter.
     */
    public Long getMainVideoStreamType() {
        return this.MainVideoStreamType;
    }

    /**
     * Set Stream type of the big image, which takes effect in a screen sharing, floating, or picture-in-picture template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter.
     * @param MainVideoStreamType Stream type of the big image, which takes effect in a screen sharing, floating, or picture-in-picture template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter.
     */
    public void setMainVideoStreamType(Long MainVideoStreamType) {
        this.MainVideoStreamType = MainVideoStreamType;
    }

    /**
     * Get Layout parameter of the small image, which takes effect in a picture-in-picture template. 
     * @return SmallVideoLayoutParams Layout parameter of the small image, which takes effect in a picture-in-picture template.
     */
    public SmallVideoLayoutParams getSmallVideoLayoutParams() {
        return this.SmallVideoLayoutParams;
    }

    /**
     * Set Layout parameter of the small image, which takes effect in a picture-in-picture template.
     * @param SmallVideoLayoutParams Layout parameter of the small image, which takes effect in a picture-in-picture template.
     */
    public void setSmallVideoLayoutParams(SmallVideoLayoutParams SmallVideoLayoutParams) {
        this.SmallVideoLayoutParams = SmallVideoLayoutParams;
    }

    /**
     * Get You can set the layout parameter as 1 or 0 in the screen sharing template. 1: big image on the right and small images on the left, 0: big image on the left and small images on the right. The default value is 0.  
     * @return MainVideoRightAlign You can set the layout parameter as 1 or 0 in the screen sharing template. 1: big image on the right and small images on the left, 0: big image on the left and small images on the right. The default value is 0. 
     */
    public Long getMainVideoRightAlign() {
        return this.MainVideoRightAlign;
    }

    /**
     * Set You can set the layout parameter as 1 or 0 in the screen sharing template. 1: big image on the right and small images on the left, 0: big image on the left and small images on the right. The default value is 0. 
     * @param MainVideoRightAlign You can set the layout parameter as 1 or 0 in the screen sharing template. 1: big image on the right and small images on the left, 0: big image on the left and small images on the right. The default value is 0. 
     */
    public void setMainVideoRightAlign(Long MainVideoRightAlign) {
        this.MainVideoRightAlign = MainVideoRightAlign;
    }

    /**
     * Get A user list, which takes effect for floating, grid, or screen sharing templates. When the user list has been set, the stream mix output for users in this user list will include both audio and video; the stream mix output for users not in the list will only include audio. Up to 16 users can be set. 
     * @return MixVideoUids A user list, which takes effect for floating, grid, or screen sharing templates. When the user list has been set, the stream mix output for users in this user list will include both audio and video; the stream mix output for users not in the list will only include audio. Up to 16 users can be set.
     */
    public String [] getMixVideoUids() {
        return this.MixVideoUids;
    }

    /**
     * Set A user list, which takes effect for floating, grid, or screen sharing templates. When the user list has been set, the stream mix output for users in this user list will include both audio and video; the stream mix output for users not in the list will only include audio. Up to 16 users can be set.
     * @param MixVideoUids A user list, which takes effect for floating, grid, or screen sharing templates. When the user list has been set, the stream mix output for users in this user list will include both audio and video; the stream mix output for users not in the list will only include audio. Up to 16 users can be set.
     */
    public void setMixVideoUids(String [] MixVideoUids) {
        this.MixVideoUids = MixVideoUids;
    }

    /**
     * Get Valid in custom template, used to specify the video image position of a user in mixed streams. 
     * @return PresetLayoutConfig Valid in custom template, used to specify the video image position of a user in mixed streams.
     */
    public PresetLayoutConfig [] getPresetLayoutConfig() {
        return this.PresetLayoutConfig;
    }

    /**
     * Set Valid in custom template, used to specify the video image position of a user in mixed streams.
     * @param PresetLayoutConfig Valid in custom template, used to specify the video image position of a user in mixed streams.
     */
    public void setPresetLayoutConfig(PresetLayoutConfig [] PresetLayoutConfig) {
        this.PresetLayoutConfig = PresetLayoutConfig;
    }

    /**
     * Get Valid in custom templates. 1: the placeholding feature is enabled; 0 (default): the feature is disabled. When the feature is enabled, but a user for whom a position is reserved is not sending video data, the position will show the corresponding placeholder image. 
     * @return PlaceHolderMode Valid in custom templates. 1: the placeholding feature is enabled; 0 (default): the feature is disabled. When the feature is enabled, but a user for whom a position is reserved is not sending video data, the position will show the corresponding placeholder image.
     */
    public Long getPlaceHolderMode() {
        return this.PlaceHolderMode;
    }

    /**
     * Set Valid in custom templates. 1: the placeholding feature is enabled; 0 (default): the feature is disabled. When the feature is enabled, but a user for whom a position is reserved is not sending video data, the position will show the corresponding placeholder image.
     * @param PlaceHolderMode Valid in custom templates. 1: the placeholding feature is enabled; 0 (default): the feature is disabled. When the feature is enabled, but a user for whom a position is reserved is not sending video data, the position will show the corresponding placeholder image.
     */
    public void setPlaceHolderMode(Long PlaceHolderMode) {
        this.PlaceHolderMode = PlaceHolderMode;
    }

    /**
     * Get Whether an audio-only stream occupies an image spot, which takes effect in a floating, grid, or screen sharing template. Valid values: 0 (default): when a floating or grid template is used, users sending audio only occupy image spots; when a screen sharing template is used, users (except the user whose screen is shared) sending audio only do not occupy image spots; 1: users sending audio only occupy image spots; 2: users sending audio only do not occupy image spots. 
     * @return PureAudioHoldPlaceMode Whether an audio-only stream occupies an image spot, which takes effect in a floating, grid, or screen sharing template. Valid values: 0 (default): when a floating or grid template is used, users sending audio only occupy image spots; when a screen sharing template is used, users (except the user whose screen is shared) sending audio only do not occupy image spots; 1: users sending audio only occupy image spots; 2: users sending audio only do not occupy image spots.
     */
    public Long getPureAudioHoldPlaceMode() {
        return this.PureAudioHoldPlaceMode;
    }

    /**
     * Set Whether an audio-only stream occupies an image spot, which takes effect in a floating, grid, or screen sharing template. Valid values: 0 (default): when a floating or grid template is used, users sending audio only occupy image spots; when a screen sharing template is used, users (except the user whose screen is shared) sending audio only do not occupy image spots; 1: users sending audio only occupy image spots; 2: users sending audio only do not occupy image spots.
     * @param PureAudioHoldPlaceMode Whether an audio-only stream occupies an image spot, which takes effect in a floating, grid, or screen sharing template. Valid values: 0 (default): when a floating or grid template is used, users sending audio only occupy image spots; when a screen sharing template is used, users (except the user whose screen is shared) sending audio only do not occupy image spots; 1: users sending audio only occupy image spots; 2: users sending audio only do not occupy image spots.
     */
    public void setPureAudioHoldPlaceMode(Long PureAudioHoldPlaceMode) {
        this.PureAudioHoldPlaceMode = PureAudioHoldPlaceMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Template", this.Template);
        this.setParamSimple(map, prefix + "MainVideoUserId", this.MainVideoUserId);
        this.setParamSimple(map, prefix + "MainVideoStreamType", this.MainVideoStreamType);
        this.setParamObj(map, prefix + "SmallVideoLayoutParams.", this.SmallVideoLayoutParams);
        this.setParamSimple(map, prefix + "MainVideoRightAlign", this.MainVideoRightAlign);
        this.setParamArraySimple(map, prefix + "MixVideoUids.", this.MixVideoUids);
        this.setParamArrayObj(map, prefix + "PresetLayoutConfig.", this.PresetLayoutConfig);
        this.setParamSimple(map, prefix + "PlaceHolderMode", this.PlaceHolderMode);
        this.setParamSimple(map, prefix + "PureAudioHoldPlaceMode", this.PureAudioHoldPlaceMode);

    }
}

