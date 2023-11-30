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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartStreamIngestRequest extends AbstractModel {

    /**
    * TRTC's [SdkAppId](https://intl.cloud.tencent.com/document/product/647/46351?from_cn_redirect=1#sdkappid), the same as the SdkAppId corresponding to the Record room.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * TRTC's [RoomId](https://intl.cloud.tencent.com/document/product/647/46351?from_cn_redirect=1#roomid), the RoomId corresponding to the Record TRTC room.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Type of TRTC RoomId. 【*Note】Must be the same as the RoomId type corresponding to the Record room: 0: String type RoomId 1: 32-bit Integer type RoomId (default)
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * UserId of the Pull stream Relay Robot, used to enter the room and initiate the Pull stream Relay Task.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * UserSig corresponding to the Pull stream Relay Robot UserId, i.e., UserId and UserSig are equivalent to the Robot's Login password for entering the room. For the specific Calculation method, please refer to the TRTC [UserSig](https://intl.cloud.tencent.com/document/product/647/45910?from_cn_redirect=1#UserSig) Scheme.
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * 	
Source URL. Example value: https://a.b/test.mp4
    */
    @SerializedName("SourceUrl")
    @Expose
    private String [] SourceUrl;

    /**
    * TRTC room permission Encryption ticket, only needed when advanced permission control is enabled in the Console. After enabling advanced permission control in the TRTC Console, TRTC's backend service system will verify a so-called [PrivateMapKey] 'Permission ticket', which contains an encrypted RoomId and an encrypted 'Permission bit list'. Since PrivateMapKey contains RoomId, providing only UserSig without PrivateMapKey does not allow entry into the specified room.
    */
    @SerializedName("PrivateMapKey")
    @Expose
    private String PrivateMapKey;

    /**
    * Video Codec Parameters. Optional, if not filled, Keep original stream Parameters.
    */
    @SerializedName("VideoEncodeParams")
    @Expose
    private VideoEncodeParams VideoEncodeParams;

    /**
    * Audio Codec Parameters. Optional, if not filled, Keep original stream Parameters.
    */
    @SerializedName("AudioEncodeParams")
    @Expose
    private AudioEncodeParams AudioEncodeParams;

    /**
     * Get TRTC's [SdkAppId](https://intl.cloud.tencent.com/document/product/647/46351?from_cn_redirect=1#sdkappid), the same as the SdkAppId corresponding to the Record room. 
     * @return SdkAppId TRTC's [SdkAppId](https://intl.cloud.tencent.com/document/product/647/46351?from_cn_redirect=1#sdkappid), the same as the SdkAppId corresponding to the Record room.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC's [SdkAppId](https://intl.cloud.tencent.com/document/product/647/46351?from_cn_redirect=1#sdkappid), the same as the SdkAppId corresponding to the Record room.
     * @param SdkAppId TRTC's [SdkAppId](https://intl.cloud.tencent.com/document/product/647/46351?from_cn_redirect=1#sdkappid), the same as the SdkAppId corresponding to the Record room.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get TRTC's [RoomId](https://intl.cloud.tencent.com/document/product/647/46351?from_cn_redirect=1#roomid), the RoomId corresponding to the Record TRTC room. 
     * @return RoomId TRTC's [RoomId](https://intl.cloud.tencent.com/document/product/647/46351?from_cn_redirect=1#roomid), the RoomId corresponding to the Record TRTC room.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set TRTC's [RoomId](https://intl.cloud.tencent.com/document/product/647/46351?from_cn_redirect=1#roomid), the RoomId corresponding to the Record TRTC room.
     * @param RoomId TRTC's [RoomId](https://intl.cloud.tencent.com/document/product/647/46351?from_cn_redirect=1#roomid), the RoomId corresponding to the Record TRTC room.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Type of TRTC RoomId. 【*Note】Must be the same as the RoomId type corresponding to the Record room: 0: String type RoomId 1: 32-bit Integer type RoomId (default) 
     * @return RoomIdType Type of TRTC RoomId. 【*Note】Must be the same as the RoomId type corresponding to the Record room: 0: String type RoomId 1: 32-bit Integer type RoomId (default)
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set Type of TRTC RoomId. 【*Note】Must be the same as the RoomId type corresponding to the Record room: 0: String type RoomId 1: 32-bit Integer type RoomId (default)
     * @param RoomIdType Type of TRTC RoomId. 【*Note】Must be the same as the RoomId type corresponding to the Record room: 0: String type RoomId 1: 32-bit Integer type RoomId (default)
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get UserId of the Pull stream Relay Robot, used to enter the room and initiate the Pull stream Relay Task. 
     * @return UserId UserId of the Pull stream Relay Robot, used to enter the room and initiate the Pull stream Relay Task.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set UserId of the Pull stream Relay Robot, used to enter the room and initiate the Pull stream Relay Task.
     * @param UserId UserId of the Pull stream Relay Robot, used to enter the room and initiate the Pull stream Relay Task.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get UserSig corresponding to the Pull stream Relay Robot UserId, i.e., UserId and UserSig are equivalent to the Robot's Login password for entering the room. For the specific Calculation method, please refer to the TRTC [UserSig](https://intl.cloud.tencent.com/document/product/647/45910?from_cn_redirect=1#UserSig) Scheme. 
     * @return UserSig UserSig corresponding to the Pull stream Relay Robot UserId, i.e., UserId and UserSig are equivalent to the Robot's Login password for entering the room. For the specific Calculation method, please refer to the TRTC [UserSig](https://intl.cloud.tencent.com/document/product/647/45910?from_cn_redirect=1#UserSig) Scheme.
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set UserSig corresponding to the Pull stream Relay Robot UserId, i.e., UserId and UserSig are equivalent to the Robot's Login password for entering the room. For the specific Calculation method, please refer to the TRTC [UserSig](https://intl.cloud.tencent.com/document/product/647/45910?from_cn_redirect=1#UserSig) Scheme.
     * @param UserSig UserSig corresponding to the Pull stream Relay Robot UserId, i.e., UserId and UserSig are equivalent to the Robot's Login password for entering the room. For the specific Calculation method, please refer to the TRTC [UserSig](https://intl.cloud.tencent.com/document/product/647/45910?from_cn_redirect=1#UserSig) Scheme.
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get 	
Source URL. Example value: https://a.b/test.mp4 
     * @return SourceUrl 	
Source URL. Example value: https://a.b/test.mp4
     */
    public String [] getSourceUrl() {
        return this.SourceUrl;
    }

    /**
     * Set 	
Source URL. Example value: https://a.b/test.mp4
     * @param SourceUrl 	
Source URL. Example value: https://a.b/test.mp4
     */
    public void setSourceUrl(String [] SourceUrl) {
        this.SourceUrl = SourceUrl;
    }

    /**
     * Get TRTC room permission Encryption ticket, only needed when advanced permission control is enabled in the Console. After enabling advanced permission control in the TRTC Console, TRTC's backend service system will verify a so-called [PrivateMapKey] 'Permission ticket', which contains an encrypted RoomId and an encrypted 'Permission bit list'. Since PrivateMapKey contains RoomId, providing only UserSig without PrivateMapKey does not allow entry into the specified room. 
     * @return PrivateMapKey TRTC room permission Encryption ticket, only needed when advanced permission control is enabled in the Console. After enabling advanced permission control in the TRTC Console, TRTC's backend service system will verify a so-called [PrivateMapKey] 'Permission ticket', which contains an encrypted RoomId and an encrypted 'Permission bit list'. Since PrivateMapKey contains RoomId, providing only UserSig without PrivateMapKey does not allow entry into the specified room.
     */
    public String getPrivateMapKey() {
        return this.PrivateMapKey;
    }

    /**
     * Set TRTC room permission Encryption ticket, only needed when advanced permission control is enabled in the Console. After enabling advanced permission control in the TRTC Console, TRTC's backend service system will verify a so-called [PrivateMapKey] 'Permission ticket', which contains an encrypted RoomId and an encrypted 'Permission bit list'. Since PrivateMapKey contains RoomId, providing only UserSig without PrivateMapKey does not allow entry into the specified room.
     * @param PrivateMapKey TRTC room permission Encryption ticket, only needed when advanced permission control is enabled in the Console. After enabling advanced permission control in the TRTC Console, TRTC's backend service system will verify a so-called [PrivateMapKey] 'Permission ticket', which contains an encrypted RoomId and an encrypted 'Permission bit list'. Since PrivateMapKey contains RoomId, providing only UserSig without PrivateMapKey does not allow entry into the specified room.
     */
    public void setPrivateMapKey(String PrivateMapKey) {
        this.PrivateMapKey = PrivateMapKey;
    }

    /**
     * Get Video Codec Parameters. Optional, if not filled, Keep original stream Parameters. 
     * @return VideoEncodeParams Video Codec Parameters. Optional, if not filled, Keep original stream Parameters.
     */
    public VideoEncodeParams getVideoEncodeParams() {
        return this.VideoEncodeParams;
    }

    /**
     * Set Video Codec Parameters. Optional, if not filled, Keep original stream Parameters.
     * @param VideoEncodeParams Video Codec Parameters. Optional, if not filled, Keep original stream Parameters.
     */
    public void setVideoEncodeParams(VideoEncodeParams VideoEncodeParams) {
        this.VideoEncodeParams = VideoEncodeParams;
    }

    /**
     * Get Audio Codec Parameters. Optional, if not filled, Keep original stream Parameters. 
     * @return AudioEncodeParams Audio Codec Parameters. Optional, if not filled, Keep original stream Parameters.
     */
    public AudioEncodeParams getAudioEncodeParams() {
        return this.AudioEncodeParams;
    }

    /**
     * Set Audio Codec Parameters. Optional, if not filled, Keep original stream Parameters.
     * @param AudioEncodeParams Audio Codec Parameters. Optional, if not filled, Keep original stream Parameters.
     */
    public void setAudioEncodeParams(AudioEncodeParams AudioEncodeParams) {
        this.AudioEncodeParams = AudioEncodeParams;
    }

    public StartStreamIngestRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartStreamIngestRequest(StartStreamIngestRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.SourceUrl != null) {
            this.SourceUrl = new String[source.SourceUrl.length];
            for (int i = 0; i < source.SourceUrl.length; i++) {
                this.SourceUrl[i] = new String(source.SourceUrl[i]);
            }
        }
        if (source.PrivateMapKey != null) {
            this.PrivateMapKey = new String(source.PrivateMapKey);
        }
        if (source.VideoEncodeParams != null) {
            this.VideoEncodeParams = new VideoEncodeParams(source.VideoEncodeParams);
        }
        if (source.AudioEncodeParams != null) {
            this.AudioEncodeParams = new AudioEncodeParams(source.AudioEncodeParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamArraySimple(map, prefix + "SourceUrl.", this.SourceUrl);
        this.setParamSimple(map, prefix + "PrivateMapKey", this.PrivateMapKey);
        this.setParamObj(map, prefix + "VideoEncodeParams.", this.VideoEncodeParams);
        this.setParamObj(map, prefix + "AudioEncodeParams.", this.AudioEncodeParams);

    }
}

