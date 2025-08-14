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

public class ModerationParams extends AbstractModel {

    /**
    * Moderation task type. 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio slicing moderation + video frame extraction moderation; 4: audio stream moderation; 5: audio stream moderation + video frame extraction moderation. The default value is 1. (Support from suppliers is required for stream moderation to take effect.)
    */
    @SerializedName("ModerationType")
    @Expose
    private Long ModerationType;

    /**
    * Slicing is stopped automatically when there is no user (anchor) performing upstream push in the room for more than MaxIdleTime. Unit: seconds. Default value: 30 seconds. This value needs to be greater than or equal to 5 seconds and less than or equal to 1800 seconds (0.5 hours). Example value: 30.
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * Audio slicing duration. Default value: 15s. Example value: 15.
    */
    @SerializedName("SliceAudio")
    @Expose
    private Long SliceAudio;

    /**
    * Interval for video frame extraction. Default value: 5s.
    */
    @SerializedName("SliceVideo")
    @Expose
    private Long SliceVideo;

    /**
    * Enumeration values for suppliers.
tianyu: Tencent Tianyu content security. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
ace: ACE content security. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
shumei: shumei moderation. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
Yidun: NetEase Yidun moderation. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
    */
    @SerializedName("ModerationSupplier")
    @Expose
    private String ModerationSupplier;

    /**
    * Configuration information required for submitting content to the third-party moderation supplier.
    */
    @SerializedName("ModerationSupplierParam")
    @Expose
    private ModerationSupplierParam ModerationSupplierParam;

    /**
    * Whether to save the hit file. 0: not save by default; 1: save.
    */
    @SerializedName("SaveModerationFile")
    @Expose
    private Long SaveModerationFile;

    /**
    * Whether to call back all moderation results: 0: call back all results by default; 1: only call back hit results.
    */
    @SerializedName("CallbackAllResults")
    @Expose
    private Long CallbackAllResults;

    /**
    * Specifies the allowlist or blocklist for the subscription stream.
    */
    @SerializedName("SubscribeStreamUserIds")
    @Expose
    private SubscribeModerationUserIds SubscribeStreamUserIds;

    /**
     * Get Moderation task type. 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio slicing moderation + video frame extraction moderation; 4: audio stream moderation; 5: audio stream moderation + video frame extraction moderation. The default value is 1. (Support from suppliers is required for stream moderation to take effect.) 
     * @return ModerationType Moderation task type. 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio slicing moderation + video frame extraction moderation; 4: audio stream moderation; 5: audio stream moderation + video frame extraction moderation. The default value is 1. (Support from suppliers is required for stream moderation to take effect.)
     */
    public Long getModerationType() {
        return this.ModerationType;
    }

    /**
     * Set Moderation task type. 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio slicing moderation + video frame extraction moderation; 4: audio stream moderation; 5: audio stream moderation + video frame extraction moderation. The default value is 1. (Support from suppliers is required for stream moderation to take effect.)
     * @param ModerationType Moderation task type. 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio slicing moderation + video frame extraction moderation; 4: audio stream moderation; 5: audio stream moderation + video frame extraction moderation. The default value is 1. (Support from suppliers is required for stream moderation to take effect.)
     */
    public void setModerationType(Long ModerationType) {
        this.ModerationType = ModerationType;
    }

    /**
     * Get Slicing is stopped automatically when there is no user (anchor) performing upstream push in the room for more than MaxIdleTime. Unit: seconds. Default value: 30 seconds. This value needs to be greater than or equal to 5 seconds and less than or equal to 1800 seconds (0.5 hours). Example value: 30. 
     * @return MaxIdleTime Slicing is stopped automatically when there is no user (anchor) performing upstream push in the room for more than MaxIdleTime. Unit: seconds. Default value: 30 seconds. This value needs to be greater than or equal to 5 seconds and less than or equal to 1800 seconds (0.5 hours). Example value: 30.
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set Slicing is stopped automatically when there is no user (anchor) performing upstream push in the room for more than MaxIdleTime. Unit: seconds. Default value: 30 seconds. This value needs to be greater than or equal to 5 seconds and less than or equal to 1800 seconds (0.5 hours). Example value: 30.
     * @param MaxIdleTime Slicing is stopped automatically when there is no user (anchor) performing upstream push in the room for more than MaxIdleTime. Unit: seconds. Default value: 30 seconds. This value needs to be greater than or equal to 5 seconds and less than or equal to 1800 seconds (0.5 hours). Example value: 30.
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get Audio slicing duration. Default value: 15s. Example value: 15. 
     * @return SliceAudio Audio slicing duration. Default value: 15s. Example value: 15.
     */
    public Long getSliceAudio() {
        return this.SliceAudio;
    }

    /**
     * Set Audio slicing duration. Default value: 15s. Example value: 15.
     * @param SliceAudio Audio slicing duration. Default value: 15s. Example value: 15.
     */
    public void setSliceAudio(Long SliceAudio) {
        this.SliceAudio = SliceAudio;
    }

    /**
     * Get Interval for video frame extraction. Default value: 5s. 
     * @return SliceVideo Interval for video frame extraction. Default value: 5s.
     */
    public Long getSliceVideo() {
        return this.SliceVideo;
    }

    /**
     * Set Interval for video frame extraction. Default value: 5s.
     * @param SliceVideo Interval for video frame extraction. Default value: 5s.
     */
    public void setSliceVideo(Long SliceVideo) {
        this.SliceVideo = SliceVideo;
    }

    /**
     * Get Enumeration values for suppliers.
tianyu: Tencent Tianyu content security. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
ace: ACE content security. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
shumei: shumei moderation. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
Yidun: NetEase Yidun moderation. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.) 
     * @return ModerationSupplier Enumeration values for suppliers.
tianyu: Tencent Tianyu content security. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
ace: ACE content security. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
shumei: shumei moderation. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
Yidun: NetEase Yidun moderation. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
     */
    public String getModerationSupplier() {
        return this.ModerationSupplier;
    }

    /**
     * Set Enumeration values for suppliers.
tianyu: Tencent Tianyu content security. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
ace: ACE content security. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
shumei: shumei moderation. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
Yidun: NetEase Yidun moderation. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
     * @param ModerationSupplier Enumeration values for suppliers.
tianyu: Tencent Tianyu content security. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
ace: ACE content security. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
shumei: shumei moderation. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
Yidun: NetEase Yidun moderation. (Valid values: 1: audio slicing moderation; 2: video frame extraction moderation; 3: audio-visual slicing moderation + video frame extraction moderation.)
     */
    public void setModerationSupplier(String ModerationSupplier) {
        this.ModerationSupplier = ModerationSupplier;
    }

    /**
     * Get Configuration information required for submitting content to the third-party moderation supplier. 
     * @return ModerationSupplierParam Configuration information required for submitting content to the third-party moderation supplier.
     */
    public ModerationSupplierParam getModerationSupplierParam() {
        return this.ModerationSupplierParam;
    }

    /**
     * Set Configuration information required for submitting content to the third-party moderation supplier.
     * @param ModerationSupplierParam Configuration information required for submitting content to the third-party moderation supplier.
     */
    public void setModerationSupplierParam(ModerationSupplierParam ModerationSupplierParam) {
        this.ModerationSupplierParam = ModerationSupplierParam;
    }

    /**
     * Get Whether to save the hit file. 0: not save by default; 1: save. 
     * @return SaveModerationFile Whether to save the hit file. 0: not save by default; 1: save.
     */
    public Long getSaveModerationFile() {
        return this.SaveModerationFile;
    }

    /**
     * Set Whether to save the hit file. 0: not save by default; 1: save.
     * @param SaveModerationFile Whether to save the hit file. 0: not save by default; 1: save.
     */
    public void setSaveModerationFile(Long SaveModerationFile) {
        this.SaveModerationFile = SaveModerationFile;
    }

    /**
     * Get Whether to call back all moderation results: 0: call back all results by default; 1: only call back hit results. 
     * @return CallbackAllResults Whether to call back all moderation results: 0: call back all results by default; 1: only call back hit results.
     */
    public Long getCallbackAllResults() {
        return this.CallbackAllResults;
    }

    /**
     * Set Whether to call back all moderation results: 0: call back all results by default; 1: only call back hit results.
     * @param CallbackAllResults Whether to call back all moderation results: 0: call back all results by default; 1: only call back hit results.
     */
    public void setCallbackAllResults(Long CallbackAllResults) {
        this.CallbackAllResults = CallbackAllResults;
    }

    /**
     * Get Specifies the allowlist or blocklist for the subscription stream. 
     * @return SubscribeStreamUserIds Specifies the allowlist or blocklist for the subscription stream.
     */
    public SubscribeModerationUserIds getSubscribeStreamUserIds() {
        return this.SubscribeStreamUserIds;
    }

    /**
     * Set Specifies the allowlist or blocklist for the subscription stream.
     * @param SubscribeStreamUserIds Specifies the allowlist or blocklist for the subscription stream.
     */
    public void setSubscribeStreamUserIds(SubscribeModerationUserIds SubscribeStreamUserIds) {
        this.SubscribeStreamUserIds = SubscribeStreamUserIds;
    }

    public ModerationParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModerationParams(ModerationParams source) {
        if (source.ModerationType != null) {
            this.ModerationType = new Long(source.ModerationType);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.SliceAudio != null) {
            this.SliceAudio = new Long(source.SliceAudio);
        }
        if (source.SliceVideo != null) {
            this.SliceVideo = new Long(source.SliceVideo);
        }
        if (source.ModerationSupplier != null) {
            this.ModerationSupplier = new String(source.ModerationSupplier);
        }
        if (source.ModerationSupplierParam != null) {
            this.ModerationSupplierParam = new ModerationSupplierParam(source.ModerationSupplierParam);
        }
        if (source.SaveModerationFile != null) {
            this.SaveModerationFile = new Long(source.SaveModerationFile);
        }
        if (source.CallbackAllResults != null) {
            this.CallbackAllResults = new Long(source.CallbackAllResults);
        }
        if (source.SubscribeStreamUserIds != null) {
            this.SubscribeStreamUserIds = new SubscribeModerationUserIds(source.SubscribeStreamUserIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModerationType", this.ModerationType);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "SliceAudio", this.SliceAudio);
        this.setParamSimple(map, prefix + "SliceVideo", this.SliceVideo);
        this.setParamSimple(map, prefix + "ModerationSupplier", this.ModerationSupplier);
        this.setParamObj(map, prefix + "ModerationSupplierParam.", this.ModerationSupplierParam);
        this.setParamSimple(map, prefix + "SaveModerationFile", this.SaveModerationFile);
        this.setParamSimple(map, prefix + "CallbackAllResults", this.CallbackAllResults);
        this.setParamObj(map, prefix + "SubscribeStreamUserIds.", this.SubscribeStreamUserIds);

    }
}

