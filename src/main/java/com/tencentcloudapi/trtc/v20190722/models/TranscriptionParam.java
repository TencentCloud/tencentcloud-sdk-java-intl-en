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

public class TranscriptionParam extends AbstractModel {

    /**
    * [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#userid) used by the transcription service in the TRTC room. Note that this userId cannot duplicate those already used by other TRTC or transcription services etc. You may use the room ID as part of the user identification.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * User signature for the transcription service to join a TRTC room. The signature verification corresponding to the current UserId serves as the login password. For specific details, see TRTC solution for calculating [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig).
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * Allowlist of user IDs whose audio will be transcribed.
Specifies which anchor audio streams to transcribe when the service starts. If left empty or omitted, audio from all anchors will be transcribed. If one or more values are provided, only audio from the specified anchors will be transcribed.

> Note: If a user ID appears in both the `SubscribeList` and `UnSubscribeList`, the `UnSubscribeList` takes precedence.
    */
    @SerializedName("SubscribeList")
    @Expose
    private TranscriptionUserInfoParams [] SubscribeList;

    /**
    * Blocklist of user IDs whose audio will be excluded from transcription. 
Leave empty or omit to disable the blocklist. Provide specific values to exclude the specified anchors' audio from transcription.

    */
    @SerializedName("UnSubscribeList")
    @Expose
    private TranscriptionUserInfoParams [] UnSubscribeList;

    /**
    * Maximum idle duration before the transcription task is automatically stopped, in seconds.
If all anchors being transcribed continuously leave the TRTC room or switch to the audience role for longer than this value, the transcription task stops automatically.
- Default: 30
- Range: 5 - 86400 (24 hours)
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * Controls whether the custom data channel is enabled. Accepted values: 0 (disabled) or 1 (enabled). Defaults to 0 if omitted.
    */
    @SerializedName("SendCustomMode")
    @Expose
    private Long SendCustomMode;

    /**
     * Get [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#userid) used by the transcription service in the TRTC room. Note that this userId cannot duplicate those already used by other TRTC or transcription services etc. You may use the room ID as part of the user identification. 
     * @return UserId [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#userid) used by the transcription service in the TRTC room. Note that this userId cannot duplicate those already used by other TRTC or transcription services etc. You may use the room ID as part of the user identification.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#userid) used by the transcription service in the TRTC room. Note that this userId cannot duplicate those already used by other TRTC or transcription services etc. You may use the room ID as part of the user identification.
     * @param UserId [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#userid) used by the transcription service in the TRTC room. Note that this userId cannot duplicate those already used by other TRTC or transcription services etc. You may use the room ID as part of the user identification.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get User signature for the transcription service to join a TRTC room. The signature verification corresponding to the current UserId serves as the login password. For specific details, see TRTC solution for calculating [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig). 
     * @return UserSig User signature for the transcription service to join a TRTC room. The signature verification corresponding to the current UserId serves as the login password. For specific details, see TRTC solution for calculating [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig).
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set User signature for the transcription service to join a TRTC room. The signature verification corresponding to the current UserId serves as the login password. For specific details, see TRTC solution for calculating [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig).
     * @param UserSig User signature for the transcription service to join a TRTC room. The signature verification corresponding to the current UserId serves as the login password. For specific details, see TRTC solution for calculating [UserSig](https://www.tencentcloud.com/document/product/647/45910?from_cn_redirect=1#UserSig).
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get Allowlist of user IDs whose audio will be transcribed.
Specifies which anchor audio streams to transcribe when the service starts. If left empty or omitted, audio from all anchors will be transcribed. If one or more values are provided, only audio from the specified anchors will be transcribed.

> Note: If a user ID appears in both the `SubscribeList` and `UnSubscribeList`, the `UnSubscribeList` takes precedence. 
     * @return SubscribeList Allowlist of user IDs whose audio will be transcribed.
Specifies which anchor audio streams to transcribe when the service starts. If left empty or omitted, audio from all anchors will be transcribed. If one or more values are provided, only audio from the specified anchors will be transcribed.

> Note: If a user ID appears in both the `SubscribeList` and `UnSubscribeList`, the `UnSubscribeList` takes precedence.
     */
    public TranscriptionUserInfoParams [] getSubscribeList() {
        return this.SubscribeList;
    }

    /**
     * Set Allowlist of user IDs whose audio will be transcribed.
Specifies which anchor audio streams to transcribe when the service starts. If left empty or omitted, audio from all anchors will be transcribed. If one or more values are provided, only audio from the specified anchors will be transcribed.

> Note: If a user ID appears in both the `SubscribeList` and `UnSubscribeList`, the `UnSubscribeList` takes precedence.
     * @param SubscribeList Allowlist of user IDs whose audio will be transcribed.
Specifies which anchor audio streams to transcribe when the service starts. If left empty or omitted, audio from all anchors will be transcribed. If one or more values are provided, only audio from the specified anchors will be transcribed.

> Note: If a user ID appears in both the `SubscribeList` and `UnSubscribeList`, the `UnSubscribeList` takes precedence.
     */
    public void setSubscribeList(TranscriptionUserInfoParams [] SubscribeList) {
        this.SubscribeList = SubscribeList;
    }

    /**
     * Get Blocklist of user IDs whose audio will be excluded from transcription. 
Leave empty or omit to disable the blocklist. Provide specific values to exclude the specified anchors' audio from transcription.
 
     * @return UnSubscribeList Blocklist of user IDs whose audio will be excluded from transcription. 
Leave empty or omit to disable the blocklist. Provide specific values to exclude the specified anchors' audio from transcription.

     */
    public TranscriptionUserInfoParams [] getUnSubscribeList() {
        return this.UnSubscribeList;
    }

    /**
     * Set Blocklist of user IDs whose audio will be excluded from transcription. 
Leave empty or omit to disable the blocklist. Provide specific values to exclude the specified anchors' audio from transcription.

     * @param UnSubscribeList Blocklist of user IDs whose audio will be excluded from transcription. 
Leave empty or omit to disable the blocklist. Provide specific values to exclude the specified anchors' audio from transcription.

     */
    public void setUnSubscribeList(TranscriptionUserInfoParams [] UnSubscribeList) {
        this.UnSubscribeList = UnSubscribeList;
    }

    /**
     * Get Maximum idle duration before the transcription task is automatically stopped, in seconds.
If all anchors being transcribed continuously leave the TRTC room or switch to the audience role for longer than this value, the transcription task stops automatically.
- Default: 30
- Range: 5 - 86400 (24 hours) 
     * @return MaxIdleTime Maximum idle duration before the transcription task is automatically stopped, in seconds.
If all anchors being transcribed continuously leave the TRTC room or switch to the audience role for longer than this value, the transcription task stops automatically.
- Default: 30
- Range: 5 - 86400 (24 hours)
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set Maximum idle duration before the transcription task is automatically stopped, in seconds.
If all anchors being transcribed continuously leave the TRTC room or switch to the audience role for longer than this value, the transcription task stops automatically.
- Default: 30
- Range: 5 - 86400 (24 hours)
     * @param MaxIdleTime Maximum idle duration before the transcription task is automatically stopped, in seconds.
If all anchors being transcribed continuously leave the TRTC room or switch to the audience role for longer than this value, the transcription task stops automatically.
- Default: 30
- Range: 5 - 86400 (24 hours)
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get Controls whether the custom data channel is enabled. Accepted values: 0 (disabled) or 1 (enabled). Defaults to 0 if omitted. 
     * @return SendCustomMode Controls whether the custom data channel is enabled. Accepted values: 0 (disabled) or 1 (enabled). Defaults to 0 if omitted.
     */
    public Long getSendCustomMode() {
        return this.SendCustomMode;
    }

    /**
     * Set Controls whether the custom data channel is enabled. Accepted values: 0 (disabled) or 1 (enabled). Defaults to 0 if omitted.
     * @param SendCustomMode Controls whether the custom data channel is enabled. Accepted values: 0 (disabled) or 1 (enabled). Defaults to 0 if omitted.
     */
    public void setSendCustomMode(Long SendCustomMode) {
        this.SendCustomMode = SendCustomMode;
    }

    public TranscriptionParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscriptionParam(TranscriptionParam source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.SubscribeList != null) {
            this.SubscribeList = new TranscriptionUserInfoParams[source.SubscribeList.length];
            for (int i = 0; i < source.SubscribeList.length; i++) {
                this.SubscribeList[i] = new TranscriptionUserInfoParams(source.SubscribeList[i]);
            }
        }
        if (source.UnSubscribeList != null) {
            this.UnSubscribeList = new TranscriptionUserInfoParams[source.UnSubscribeList.length];
            for (int i = 0; i < source.UnSubscribeList.length; i++) {
                this.UnSubscribeList[i] = new TranscriptionUserInfoParams(source.UnSubscribeList[i]);
            }
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.SendCustomMode != null) {
            this.SendCustomMode = new Long(source.SendCustomMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamArrayObj(map, prefix + "SubscribeList.", this.SubscribeList);
        this.setParamArrayObj(map, prefix + "UnSubscribeList.", this.UnSubscribeList);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "SendCustomMode", this.SendCustomMode);

    }
}

