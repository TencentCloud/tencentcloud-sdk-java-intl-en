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

public class StartMCUMixTranscodeByStrRoomIdRequest extends AbstractModel{

    /**
    * `SDKAppId` of TRTC
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Room ID in string type
    */
    @SerializedName("StrRoomId")
    @Expose
    private String StrRoomId;

    /**
    * On-Cloud MixTranscoding output parameters
    */
    @SerializedName("OutputParams")
    @Expose
    private OutputParams OutputParams;

    /**
    * On-Cloud MixTranscoding output encoding parameters
    */
    @SerializedName("EncodeParams")
    @Expose
    private EncodeParams EncodeParams;

    /**
    * On-Cloud MixTranscoding output layout parameters
    */
    @SerializedName("LayoutParams")
    @Expose
    private LayoutParams LayoutParams;

    /**
    * Relayed push parameters of a non-Tencent Cloud CDN
    */
    @SerializedName("PublishCdnParams")
    @Expose
    private PublishCdnParams PublishCdnParams;

    /**
     * Get `SDKAppId` of TRTC 
     * @return SdkAppId `SDKAppId` of TRTC
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set `SDKAppId` of TRTC
     * @param SdkAppId `SDKAppId` of TRTC
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Room ID in string type 
     * @return StrRoomId Room ID in string type
     */
    public String getStrRoomId() {
        return this.StrRoomId;
    }

    /**
     * Set Room ID in string type
     * @param StrRoomId Room ID in string type
     */
    public void setStrRoomId(String StrRoomId) {
        this.StrRoomId = StrRoomId;
    }

    /**
     * Get On-Cloud MixTranscoding output parameters 
     * @return OutputParams On-Cloud MixTranscoding output parameters
     */
    public OutputParams getOutputParams() {
        return this.OutputParams;
    }

    /**
     * Set On-Cloud MixTranscoding output parameters
     * @param OutputParams On-Cloud MixTranscoding output parameters
     */
    public void setOutputParams(OutputParams OutputParams) {
        this.OutputParams = OutputParams;
    }

    /**
     * Get On-Cloud MixTranscoding output encoding parameters 
     * @return EncodeParams On-Cloud MixTranscoding output encoding parameters
     */
    public EncodeParams getEncodeParams() {
        return this.EncodeParams;
    }

    /**
     * Set On-Cloud MixTranscoding output encoding parameters
     * @param EncodeParams On-Cloud MixTranscoding output encoding parameters
     */
    public void setEncodeParams(EncodeParams EncodeParams) {
        this.EncodeParams = EncodeParams;
    }

    /**
     * Get On-Cloud MixTranscoding output layout parameters 
     * @return LayoutParams On-Cloud MixTranscoding output layout parameters
     */
    public LayoutParams getLayoutParams() {
        return this.LayoutParams;
    }

    /**
     * Set On-Cloud MixTranscoding output layout parameters
     * @param LayoutParams On-Cloud MixTranscoding output layout parameters
     */
    public void setLayoutParams(LayoutParams LayoutParams) {
        this.LayoutParams = LayoutParams;
    }

    /**
     * Get Relayed push parameters of a non-Tencent Cloud CDN 
     * @return PublishCdnParams Relayed push parameters of a non-Tencent Cloud CDN
     */
    public PublishCdnParams getPublishCdnParams() {
        return this.PublishCdnParams;
    }

    /**
     * Set Relayed push parameters of a non-Tencent Cloud CDN
     * @param PublishCdnParams Relayed push parameters of a non-Tencent Cloud CDN
     */
    public void setPublishCdnParams(PublishCdnParams PublishCdnParams) {
        this.PublishCdnParams = PublishCdnParams;
    }

    public StartMCUMixTranscodeByStrRoomIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartMCUMixTranscodeByStrRoomIdRequest(StartMCUMixTranscodeByStrRoomIdRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StrRoomId != null) {
            this.StrRoomId = new String(source.StrRoomId);
        }
        if (source.OutputParams != null) {
            this.OutputParams = new OutputParams(source.OutputParams);
        }
        if (source.EncodeParams != null) {
            this.EncodeParams = new EncodeParams(source.EncodeParams);
        }
        if (source.LayoutParams != null) {
            this.LayoutParams = new LayoutParams(source.LayoutParams);
        }
        if (source.PublishCdnParams != null) {
            this.PublishCdnParams = new PublishCdnParams(source.PublishCdnParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StrRoomId", this.StrRoomId);
        this.setParamObj(map, prefix + "OutputParams.", this.OutputParams);
        this.setParamObj(map, prefix + "EncodeParams.", this.EncodeParams);
        this.setParamObj(map, prefix + "LayoutParams.", this.LayoutParams);
        this.setParamObj(map, prefix + "PublishCdnParams.", this.PublishCdnParams);

    }
}

