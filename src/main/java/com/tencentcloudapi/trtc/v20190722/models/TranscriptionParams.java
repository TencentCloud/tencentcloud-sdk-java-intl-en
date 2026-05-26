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

public class TranscriptionParams extends AbstractModel {

    /**
    * The transcription robot's UserId is used to enter the room and trigger a transcription task. note that this UserId cannot be the same as the host or audience [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#UserId) in the current room. if multiple transcription tasks are initiated in a room, the robot's UserId must also be unique to avoid interrupting the previous task. ensure the transcription robot's UserId is unique in the room.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Verification signature corresponding to the transcription bot's UserId, namely, the UserId and UserSig serve as the login password for the transcription bot to enter the room. for specific calculation methods, see TRTC solution for calculating.
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * After all push users exit the room and exceed MaxIdleTime seconds, the backend automation shuts down the transcription task. default value is 60s.
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * 1 means the robot subscribes to the stream of an individual, and 0 means the robot subscribes to the stream of the entire room. if left empty, it defaults to subscribing to the stream of the entire room.
    */
    @SerializedName("TranscriptionMode")
    @Expose
    private Long TranscriptionMode;

    /**
    * Required when TranscriptionMode is 1, the robot only pulls streams from this userid and ignores other users in the room.
    */
    @SerializedName("TargetUserId")
    @Expose
    private String TargetUserId;

    /**
    * Voiceprint configuration.
    */
    @SerializedName("VoicePrint")
    @Expose
    private VoicePrint VoicePrint;

    /**
    * Semantic sentence segmentation detection.
    */
    @SerializedName("TurnDetection")
    @Expose
    private TurnDetection TurnDetection;

    /**
     * Get The transcription robot's UserId is used to enter the room and trigger a transcription task. note that this UserId cannot be the same as the host or audience [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#UserId) in the current room. if multiple transcription tasks are initiated in a room, the robot's UserId must also be unique to avoid interrupting the previous task. ensure the transcription robot's UserId is unique in the room. 
     * @return UserId The transcription robot's UserId is used to enter the room and trigger a transcription task. note that this UserId cannot be the same as the host or audience [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#UserId) in the current room. if multiple transcription tasks are initiated in a room, the robot's UserId must also be unique to avoid interrupting the previous task. ensure the transcription robot's UserId is unique in the room.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The transcription robot's UserId is used to enter the room and trigger a transcription task. note that this UserId cannot be the same as the host or audience [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#UserId) in the current room. if multiple transcription tasks are initiated in a room, the robot's UserId must also be unique to avoid interrupting the previous task. ensure the transcription robot's UserId is unique in the room.
     * @param UserId The transcription robot's UserId is used to enter the room and trigger a transcription task. note that this UserId cannot be the same as the host or audience [UserId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#UserId) in the current room. if multiple transcription tasks are initiated in a room, the robot's UserId must also be unique to avoid interrupting the previous task. ensure the transcription robot's UserId is unique in the room.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Verification signature corresponding to the transcription bot's UserId, namely, the UserId and UserSig serve as the login password for the transcription bot to enter the room. for specific calculation methods, see TRTC solution for calculating. 
     * @return UserSig Verification signature corresponding to the transcription bot's UserId, namely, the UserId and UserSig serve as the login password for the transcription bot to enter the room. for specific calculation methods, see TRTC solution for calculating.
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set Verification signature corresponding to the transcription bot's UserId, namely, the UserId and UserSig serve as the login password for the transcription bot to enter the room. for specific calculation methods, see TRTC solution for calculating.
     * @param UserSig Verification signature corresponding to the transcription bot's UserId, namely, the UserId and UserSig serve as the login password for the transcription bot to enter the room. for specific calculation methods, see TRTC solution for calculating.
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get After all push users exit the room and exceed MaxIdleTime seconds, the backend automation shuts down the transcription task. default value is 60s. 
     * @return MaxIdleTime After all push users exit the room and exceed MaxIdleTime seconds, the backend automation shuts down the transcription task. default value is 60s.
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set After all push users exit the room and exceed MaxIdleTime seconds, the backend automation shuts down the transcription task. default value is 60s.
     * @param MaxIdleTime After all push users exit the room and exceed MaxIdleTime seconds, the backend automation shuts down the transcription task. default value is 60s.
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get 1 means the robot subscribes to the stream of an individual, and 0 means the robot subscribes to the stream of the entire room. if left empty, it defaults to subscribing to the stream of the entire room. 
     * @return TranscriptionMode 1 means the robot subscribes to the stream of an individual, and 0 means the robot subscribes to the stream of the entire room. if left empty, it defaults to subscribing to the stream of the entire room.
     */
    public Long getTranscriptionMode() {
        return this.TranscriptionMode;
    }

    /**
     * Set 1 means the robot subscribes to the stream of an individual, and 0 means the robot subscribes to the stream of the entire room. if left empty, it defaults to subscribing to the stream of the entire room.
     * @param TranscriptionMode 1 means the robot subscribes to the stream of an individual, and 0 means the robot subscribes to the stream of the entire room. if left empty, it defaults to subscribing to the stream of the entire room.
     */
    public void setTranscriptionMode(Long TranscriptionMode) {
        this.TranscriptionMode = TranscriptionMode;
    }

    /**
     * Get Required when TranscriptionMode is 1, the robot only pulls streams from this userid and ignores other users in the room. 
     * @return TargetUserId Required when TranscriptionMode is 1, the robot only pulls streams from this userid and ignores other users in the room.
     */
    public String getTargetUserId() {
        return this.TargetUserId;
    }

    /**
     * Set Required when TranscriptionMode is 1, the robot only pulls streams from this userid and ignores other users in the room.
     * @param TargetUserId Required when TranscriptionMode is 1, the robot only pulls streams from this userid and ignores other users in the room.
     */
    public void setTargetUserId(String TargetUserId) {
        this.TargetUserId = TargetUserId;
    }

    /**
     * Get Voiceprint configuration. 
     * @return VoicePrint Voiceprint configuration.
     */
    public VoicePrint getVoicePrint() {
        return this.VoicePrint;
    }

    /**
     * Set Voiceprint configuration.
     * @param VoicePrint Voiceprint configuration.
     */
    public void setVoicePrint(VoicePrint VoicePrint) {
        this.VoicePrint = VoicePrint;
    }

    /**
     * Get Semantic sentence segmentation detection. 
     * @return TurnDetection Semantic sentence segmentation detection.
     */
    public TurnDetection getTurnDetection() {
        return this.TurnDetection;
    }

    /**
     * Set Semantic sentence segmentation detection.
     * @param TurnDetection Semantic sentence segmentation detection.
     */
    public void setTurnDetection(TurnDetection TurnDetection) {
        this.TurnDetection = TurnDetection;
    }

    public TranscriptionParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscriptionParams(TranscriptionParams source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.TranscriptionMode != null) {
            this.TranscriptionMode = new Long(source.TranscriptionMode);
        }
        if (source.TargetUserId != null) {
            this.TargetUserId = new String(source.TargetUserId);
        }
        if (source.VoicePrint != null) {
            this.VoicePrint = new VoicePrint(source.VoicePrint);
        }
        if (source.TurnDetection != null) {
            this.TurnDetection = new TurnDetection(source.TurnDetection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "TranscriptionMode", this.TranscriptionMode);
        this.setParamSimple(map, prefix + "TargetUserId", this.TargetUserId);
        this.setParamObj(map, prefix + "VoicePrint.", this.VoicePrint);
        this.setParamObj(map, prefix + "TurnDetection.", this.TurnDetection);

    }
}

