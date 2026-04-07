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

public class CreateCloudTranscriptionRequest extends AbstractModel {

    /**
    * [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid) of TRTC, which is the same as the SdkAppId corresponding to the transcribed room.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid) of TRTC, which is the RoomId corresponding to the transcribed TRTC room. Note: The room ID type defaults to integer. If the room ID type is string, specify it via RoomIdType.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Room information RoomType must be the same as the RoomId type of the corresponding transcribed room. 0 indicates an integer type room ID, and 1 indicates a string Room Number.
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * Parameters for transcribe service to join TRTC room.
    */
    @SerializedName("TranscriptionParam")
    @Expose
    private TranscriptionParam TranscriptionParam;

    /**
    * Parameters used by the ASR transcribe service.
    */
    @SerializedName("AsrParam")
    @Expose
    private AsrParam AsrParam;

    /**
    * Translation parameters used for transcription.
    */
    @SerializedName("TranslationParam")
    @Expose
    private TranslationParam TranslationParam;

    /**
     * Get [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid) of TRTC, which is the same as the SdkAppId corresponding to the transcribed room. 
     * @return SdkAppId [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid) of TRTC, which is the same as the SdkAppId corresponding to the transcribed room.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid) of TRTC, which is the same as the SdkAppId corresponding to the transcribed room.
     * @param SdkAppId [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid) of TRTC, which is the same as the SdkAppId corresponding to the transcribed room.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid) of TRTC, which is the RoomId corresponding to the transcribed TRTC room. Note: The room ID type defaults to integer. If the room ID type is string, specify it via RoomIdType. 
     * @return RoomId [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid) of TRTC, which is the RoomId corresponding to the transcribed TRTC room. Note: The room ID type defaults to integer. If the room ID type is string, specify it via RoomIdType.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid) of TRTC, which is the RoomId corresponding to the transcribed TRTC room. Note: The room ID type defaults to integer. If the room ID type is string, specify it via RoomIdType.
     * @param RoomId [RoomId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid) of TRTC, which is the RoomId corresponding to the transcribed TRTC room. Note: The room ID type defaults to integer. If the room ID type is string, specify it via RoomIdType.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Room information RoomType must be the same as the RoomId type of the corresponding transcribed room. 0 indicates an integer type room ID, and 1 indicates a string Room Number. 
     * @return RoomIdType Room information RoomType must be the same as the RoomId type of the corresponding transcribed room. 0 indicates an integer type room ID, and 1 indicates a string Room Number.
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set Room information RoomType must be the same as the RoomId type of the corresponding transcribed room. 0 indicates an integer type room ID, and 1 indicates a string Room Number.
     * @param RoomIdType Room information RoomType must be the same as the RoomId type of the corresponding transcribed room. 0 indicates an integer type room ID, and 1 indicates a string Room Number.
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get Parameters for transcribe service to join TRTC room. 
     * @return TranscriptionParam Parameters for transcribe service to join TRTC room.
     */
    public TranscriptionParam getTranscriptionParam() {
        return this.TranscriptionParam;
    }

    /**
     * Set Parameters for transcribe service to join TRTC room.
     * @param TranscriptionParam Parameters for transcribe service to join TRTC room.
     */
    public void setTranscriptionParam(TranscriptionParam TranscriptionParam) {
        this.TranscriptionParam = TranscriptionParam;
    }

    /**
     * Get Parameters used by the ASR transcribe service. 
     * @return AsrParam Parameters used by the ASR transcribe service.
     */
    public AsrParam getAsrParam() {
        return this.AsrParam;
    }

    /**
     * Set Parameters used by the ASR transcribe service.
     * @param AsrParam Parameters used by the ASR transcribe service.
     */
    public void setAsrParam(AsrParam AsrParam) {
        this.AsrParam = AsrParam;
    }

    /**
     * Get Translation parameters used for transcription. 
     * @return TranslationParam Translation parameters used for transcription.
     */
    public TranslationParam getTranslationParam() {
        return this.TranslationParam;
    }

    /**
     * Set Translation parameters used for transcription.
     * @param TranslationParam Translation parameters used for transcription.
     */
    public void setTranslationParam(TranslationParam TranslationParam) {
        this.TranslationParam = TranslationParam;
    }

    public CreateCloudTranscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudTranscriptionRequest(CreateCloudTranscriptionRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.TranscriptionParam != null) {
            this.TranscriptionParam = new TranscriptionParam(source.TranscriptionParam);
        }
        if (source.AsrParam != null) {
            this.AsrParam = new AsrParam(source.AsrParam);
        }
        if (source.TranslationParam != null) {
            this.TranslationParam = new TranslationParam(source.TranslationParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamObj(map, prefix + "TranscriptionParam.", this.TranscriptionParam);
        this.setParamObj(map, prefix + "AsrParam.", this.AsrParam);
        this.setParamObj(map, prefix + "TranslationParam.", this.TranslationParam);

    }
}

