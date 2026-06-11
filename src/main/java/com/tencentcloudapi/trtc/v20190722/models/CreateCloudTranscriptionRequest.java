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
    * <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid">SdkAppId</a> of TRTC is the same as the SdkAppId corresponding to the transcribe room.</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid">RoomId</a> of TRTC, which is the RoomId corresponding to the transcribed TRTC room. Note: The room ID type defaults to integer. If the room ID type is string, specify it through RoomIdType.</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>The room information RoomType must be identical to the data type of the RoomId corresponding to the transcribed room. 0 indicates an integer room number, and 1 indicates a string Room Number.</p>
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * <p>Parameters for the transcribe service to join TRTC room.</p>
    */
    @SerializedName("TranscriptionParam")
    @Expose
    private TranscriptionParam TranscriptionParam;

    /**
    * <p>Parameters used by the ASR transcribe service.</p>
    */
    @SerializedName("AsrParam")
    @Expose
    private AsrParam AsrParam;

    /**
    * <p>Parameters used to transcribe the translation service.</p>
    */
    @SerializedName("TranslationParam")
    @Expose
    private TranslationParam TranslationParam;

    /**
    * <p>Parameters used by the TTS transcribe service.</p>
    */
    @SerializedName("TTSParam")
    @Expose
    private TTSParam [] TTSParam;

    /**
     * Get <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid">SdkAppId</a> of TRTC is the same as the SdkAppId corresponding to the transcribe room.</p> 
     * @return SdkAppId <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid">SdkAppId</a> of TRTC is the same as the SdkAppId corresponding to the transcribe room.</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid">SdkAppId</a> of TRTC is the same as the SdkAppId corresponding to the transcribe room.</p>
     * @param SdkAppId <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid">SdkAppId</a> of TRTC is the same as the SdkAppId corresponding to the transcribe room.</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid">RoomId</a> of TRTC, which is the RoomId corresponding to the transcribed TRTC room. Note: The room ID type defaults to integer. If the room ID type is string, specify it through RoomIdType.</p> 
     * @return RoomId <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid">RoomId</a> of TRTC, which is the RoomId corresponding to the transcribed TRTC room. Note: The room ID type defaults to integer. If the room ID type is string, specify it through RoomIdType.</p>
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid">RoomId</a> of TRTC, which is the RoomId corresponding to the transcribed TRTC room. Note: The room ID type defaults to integer. If the room ID type is string, specify it through RoomIdType.</p>
     * @param RoomId <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#roomid">RoomId</a> of TRTC, which is the RoomId corresponding to the transcribed TRTC room. Note: The room ID type defaults to integer. If the room ID type is string, specify it through RoomIdType.</p>
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>The room information RoomType must be identical to the data type of the RoomId corresponding to the transcribed room. 0 indicates an integer room number, and 1 indicates a string Room Number.</p> 
     * @return RoomIdType <p>The room information RoomType must be identical to the data type of the RoomId corresponding to the transcribed room. 0 indicates an integer room number, and 1 indicates a string Room Number.</p>
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set <p>The room information RoomType must be identical to the data type of the RoomId corresponding to the transcribed room. 0 indicates an integer room number, and 1 indicates a string Room Number.</p>
     * @param RoomIdType <p>The room information RoomType must be identical to the data type of the RoomId corresponding to the transcribed room. 0 indicates an integer room number, and 1 indicates a string Room Number.</p>
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get <p>Parameters for the transcribe service to join TRTC room.</p> 
     * @return TranscriptionParam <p>Parameters for the transcribe service to join TRTC room.</p>
     */
    public TranscriptionParam getTranscriptionParam() {
        return this.TranscriptionParam;
    }

    /**
     * Set <p>Parameters for the transcribe service to join TRTC room.</p>
     * @param TranscriptionParam <p>Parameters for the transcribe service to join TRTC room.</p>
     */
    public void setTranscriptionParam(TranscriptionParam TranscriptionParam) {
        this.TranscriptionParam = TranscriptionParam;
    }

    /**
     * Get <p>Parameters used by the ASR transcribe service.</p> 
     * @return AsrParam <p>Parameters used by the ASR transcribe service.</p>
     */
    public AsrParam getAsrParam() {
        return this.AsrParam;
    }

    /**
     * Set <p>Parameters used by the ASR transcribe service.</p>
     * @param AsrParam <p>Parameters used by the ASR transcribe service.</p>
     */
    public void setAsrParam(AsrParam AsrParam) {
        this.AsrParam = AsrParam;
    }

    /**
     * Get <p>Parameters used to transcribe the translation service.</p> 
     * @return TranslationParam <p>Parameters used to transcribe the translation service.</p>
     */
    public TranslationParam getTranslationParam() {
        return this.TranslationParam;
    }

    /**
     * Set <p>Parameters used to transcribe the translation service.</p>
     * @param TranslationParam <p>Parameters used to transcribe the translation service.</p>
     */
    public void setTranslationParam(TranslationParam TranslationParam) {
        this.TranslationParam = TranslationParam;
    }

    /**
     * Get <p>Parameters used by the TTS transcribe service.</p> 
     * @return TTSParam <p>Parameters used by the TTS transcribe service.</p>
     */
    public TTSParam [] getTTSParam() {
        return this.TTSParam;
    }

    /**
     * Set <p>Parameters used by the TTS transcribe service.</p>
     * @param TTSParam <p>Parameters used by the TTS transcribe service.</p>
     */
    public void setTTSParam(TTSParam [] TTSParam) {
        this.TTSParam = TTSParam;
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
        if (source.TTSParam != null) {
            this.TTSParam = new TTSParam[source.TTSParam.length];
            for (int i = 0; i < source.TTSParam.length; i++) {
                this.TTSParam[i] = new TTSParam(source.TTSParam[i]);
            }
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
        this.setParamArrayObj(map, prefix + "TTSParam.", this.TTSParam);

    }
}

