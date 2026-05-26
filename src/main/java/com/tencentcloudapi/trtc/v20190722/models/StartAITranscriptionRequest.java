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
    * [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId used by the room with transcription task enabled.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#RoomId) of TRTC refers to the room number that enables the transcription task.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Transcription robot parameters.
    */
    @SerializedName("TranscriptionParams")
    @Expose
    private TranscriptionParams TranscriptionParams;

    /**
    * Unique Id passed by the caller, used by the server for task deduplication. duplicate tasks will fail to initiate. the server uses SdkAppId+RoomId+RoomIdType+RobotUserId for deduplication by default. if SessionId is provided, it will also be used for deduplication.
Note:.
When TranscriptionMode is 0, ensure only one task is initiated in a room. if multiple tasks are initiated, robots will subscribe to each other. unless the task is stopped proactively, it will timeout exit after 10 hours. in such cases, it is advisable to fill in SessionId to ensure subsequent repeated tasks fail.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Type of the TRTC room number. 0 indicates digit room number, 1 indicates string room number. by default if left blank, it is digit room number.
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
    * Translate configuration details.
    */
    @SerializedName("TranslationConfig")
    @Expose
    private TranslationConfig TranslationConfig;

    /**
     * Get [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId used by the room with transcription task enabled. 
     * @return SdkAppId [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId used by the room with transcription task enabled.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId used by the room with transcription task enabled.
     * @param SdkAppId [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId used by the room with transcription task enabled.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#RoomId) of TRTC refers to the room number that enables the transcription task. 
     * @return RoomId [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#RoomId) of TRTC refers to the room number that enables the transcription task.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#RoomId) of TRTC refers to the room number that enables the transcription task.
     * @param RoomId [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#RoomId) of TRTC refers to the room number that enables the transcription task.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Transcription robot parameters. 
     * @return TranscriptionParams Transcription robot parameters.
     */
    public TranscriptionParams getTranscriptionParams() {
        return this.TranscriptionParams;
    }

    /**
     * Set Transcription robot parameters.
     * @param TranscriptionParams Transcription robot parameters.
     */
    public void setTranscriptionParams(TranscriptionParams TranscriptionParams) {
        this.TranscriptionParams = TranscriptionParams;
    }

    /**
     * Get Unique Id passed by the caller, used by the server for task deduplication. duplicate tasks will fail to initiate. the server uses SdkAppId+RoomId+RoomIdType+RobotUserId for deduplication by default. if SessionId is provided, it will also be used for deduplication.
Note:.
When TranscriptionMode is 0, ensure only one task is initiated in a room. if multiple tasks are initiated, robots will subscribe to each other. unless the task is stopped proactively, it will timeout exit after 10 hours. in such cases, it is advisable to fill in SessionId to ensure subsequent repeated tasks fail. 
     * @return SessionId Unique Id passed by the caller, used by the server for task deduplication. duplicate tasks will fail to initiate. the server uses SdkAppId+RoomId+RoomIdType+RobotUserId for deduplication by default. if SessionId is provided, it will also be used for deduplication.
Note:.
When TranscriptionMode is 0, ensure only one task is initiated in a room. if multiple tasks are initiated, robots will subscribe to each other. unless the task is stopped proactively, it will timeout exit after 10 hours. in such cases, it is advisable to fill in SessionId to ensure subsequent repeated tasks fail.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Unique Id passed by the caller, used by the server for task deduplication. duplicate tasks will fail to initiate. the server uses SdkAppId+RoomId+RoomIdType+RobotUserId for deduplication by default. if SessionId is provided, it will also be used for deduplication.
Note:.
When TranscriptionMode is 0, ensure only one task is initiated in a room. if multiple tasks are initiated, robots will subscribe to each other. unless the task is stopped proactively, it will timeout exit after 10 hours. in such cases, it is advisable to fill in SessionId to ensure subsequent repeated tasks fail.
     * @param SessionId Unique Id passed by the caller, used by the server for task deduplication. duplicate tasks will fail to initiate. the server uses SdkAppId+RoomId+RoomIdType+RobotUserId for deduplication by default. if SessionId is provided, it will also be used for deduplication.
Note:.
When TranscriptionMode is 0, ensure only one task is initiated in a room. if multiple tasks are initiated, robots will subscribe to each other. unless the task is stopped proactively, it will timeout exit after 10 hours. in such cases, it is advisable to fill in SessionId to ensure subsequent repeated tasks fail.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Type of the TRTC room number. 0 indicates digit room number, 1 indicates string room number. by default if left blank, it is digit room number. 
     * @return RoomIdType Type of the TRTC room number. 0 indicates digit room number, 1 indicates string room number. by default if left blank, it is digit room number.
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set Type of the TRTC room number. 0 indicates digit room number, 1 indicates string room number. by default if left blank, it is digit room number.
     * @param RoomIdType Type of the TRTC room number. 0 indicates digit room number, 1 indicates string room number. by default if left blank, it is digit room number.
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

    /**
     * Get Translate configuration details. 
     * @return TranslationConfig Translate configuration details.
     */
    public TranslationConfig getTranslationConfig() {
        return this.TranslationConfig;
    }

    /**
     * Set Translate configuration details.
     * @param TranslationConfig Translate configuration details.
     */
    public void setTranslationConfig(TranslationConfig TranslationConfig) {
        this.TranslationConfig = TranslationConfig;
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
        if (source.TranslationConfig != null) {
            this.TranslationConfig = new TranslationConfig(source.TranslationConfig);
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
        this.setParamObj(map, prefix + "TranslationConfig.", this.TranslationConfig);

    }
}

