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

public class StartAITranscriptionRequest extends AbstractModel {

    /**
    * TRTC's [SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid) is the same as the SdkAppId used by the room that starts the transcription task.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * TRTC's [RoomId](https://cloud.tencent.com/document/product/647/46351#roomid), which indicates the room number where the transcription task is started.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Parameters of the transcription robot.
    */
    @SerializedName("TranscriptionParams")
    @Expose
    private TranscriptionParams TranscriptionParams;

    /**
    * The unique ID passed by the caller is used by the server to deduplicate. Note: If this parameter is passed, the server will use it first to deduplicate. If this parameter is not passed, the server's deduplication strategy is as follows: 
- If the TranscriptionMode field is 0, only one task can be opened in a room
- If the TranscriptionMode field is 1, only one task can be opened in a TargetUserId
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * The type of TRTC room number. 0 represents a numeric room number, and 1 represents a string room number. If not filled in, the default is a numeric room number.
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * Speech recognition configuration.
    */
    @SerializedName("RecognizeConfig")
    @Expose
    private RecognizeConfig RecognizeConfig;

    /**
     * Get TRTC's [SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid) is the same as the SdkAppId used by the room that starts the transcription task. 
     * @return SdkAppId TRTC's [SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid) is the same as the SdkAppId used by the room that starts the transcription task.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC's [SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid) is the same as the SdkAppId used by the room that starts the transcription task.
     * @param SdkAppId TRTC's [SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid) is the same as the SdkAppId used by the room that starts the transcription task.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get TRTC's [RoomId](https://cloud.tencent.com/document/product/647/46351#roomid), which indicates the room number where the transcription task is started. 
     * @return RoomId TRTC's [RoomId](https://cloud.tencent.com/document/product/647/46351#roomid), which indicates the room number where the transcription task is started.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set TRTC's [RoomId](https://cloud.tencent.com/document/product/647/46351#roomid), which indicates the room number where the transcription task is started.
     * @param RoomId TRTC's [RoomId](https://cloud.tencent.com/document/product/647/46351#roomid), which indicates the room number where the transcription task is started.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Parameters of the transcription robot. 
     * @return TranscriptionParams Parameters of the transcription robot.
     */
    public TranscriptionParams getTranscriptionParams() {
        return this.TranscriptionParams;
    }

    /**
     * Set Parameters of the transcription robot.
     * @param TranscriptionParams Parameters of the transcription robot.
     */
    public void setTranscriptionParams(TranscriptionParams TranscriptionParams) {
        this.TranscriptionParams = TranscriptionParams;
    }

    /**
     * Get The unique ID passed by the caller is used by the server to deduplicate. Note: If this parameter is passed, the server will use it first to deduplicate. If this parameter is not passed, the server's deduplication strategy is as follows: 
- If the TranscriptionMode field is 0, only one task can be opened in a room
- If the TranscriptionMode field is 1, only one task can be opened in a TargetUserId 
     * @return SessionId The unique ID passed by the caller is used by the server to deduplicate. Note: If this parameter is passed, the server will use it first to deduplicate. If this parameter is not passed, the server's deduplication strategy is as follows: 
- If the TranscriptionMode field is 0, only one task can be opened in a room
- If the TranscriptionMode field is 1, only one task can be opened in a TargetUserId
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The unique ID passed by the caller is used by the server to deduplicate. Note: If this parameter is passed, the server will use it first to deduplicate. If this parameter is not passed, the server's deduplication strategy is as follows: 
- If the TranscriptionMode field is 0, only one task can be opened in a room
- If the TranscriptionMode field is 1, only one task can be opened in a TargetUserId
     * @param SessionId The unique ID passed by the caller is used by the server to deduplicate. Note: If this parameter is passed, the server will use it first to deduplicate. If this parameter is not passed, the server's deduplication strategy is as follows: 
- If the TranscriptionMode field is 0, only one task can be opened in a room
- If the TranscriptionMode field is 1, only one task can be opened in a TargetUserId
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get The type of TRTC room number. 0 represents a numeric room number, and 1 represents a string room number. If not filled in, the default is a numeric room number. 
     * @return RoomIdType The type of TRTC room number. 0 represents a numeric room number, and 1 represents a string room number. If not filled in, the default is a numeric room number.
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set The type of TRTC room number. 0 represents a numeric room number, and 1 represents a string room number. If not filled in, the default is a numeric room number.
     * @param RoomIdType The type of TRTC room number. 0 represents a numeric room number, and 1 represents a string room number. If not filled in, the default is a numeric room number.
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get Speech recognition configuration. 
     * @return RecognizeConfig Speech recognition configuration.
     */
    public RecognizeConfig getRecognizeConfig() {
        return this.RecognizeConfig;
    }

    /**
     * Set Speech recognition configuration.
     * @param RecognizeConfig Speech recognition configuration.
     */
    public void setRecognizeConfig(RecognizeConfig RecognizeConfig) {
        this.RecognizeConfig = RecognizeConfig;
    }

    public StartAITranscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartAITranscriptionRequest(StartAITranscriptionRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.TranscriptionParams != null) {
            this.TranscriptionParams = new TranscriptionParams(source.TranscriptionParams);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.RecognizeConfig != null) {
            this.RecognizeConfig = new RecognizeConfig(source.RecognizeConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamObj(map, prefix + "TranscriptionParams.", this.TranscriptionParams);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamObj(map, prefix + "RecognizeConfig.", this.RecognizeConfig);

    }
}

