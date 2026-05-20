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

public class VoicePrint extends AbstractModel {

    /**
    * The default is 0, which means voiceprint is not enabled. 1 means voiceprint is enabled, at which point you need to fill in the voiceprint id.
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * VoicePrint Mode requires filling in when set to 1. currently only support a VoicePrint id.
    */
    @SerializedName("IdList")
    @Expose
    private String [] IdList;

    /**
     * Get The default is 0, which means voiceprint is not enabled. 1 means voiceprint is enabled, at which point you need to fill in the voiceprint id. 
     * @return Mode The default is 0, which means voiceprint is not enabled. 1 means voiceprint is enabled, at which point you need to fill in the voiceprint id.
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set The default is 0, which means voiceprint is not enabled. 1 means voiceprint is enabled, at which point you need to fill in the voiceprint id.
     * @param Mode The default is 0, which means voiceprint is not enabled. 1 means voiceprint is enabled, at which point you need to fill in the voiceprint id.
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get VoicePrint Mode requires filling in when set to 1. currently only support a VoicePrint id. 
     * @return IdList VoicePrint Mode requires filling in when set to 1. currently only support a VoicePrint id.
     */
    public String [] getIdList() {
        return this.IdList;
    }

    /**
     * Set VoicePrint Mode requires filling in when set to 1. currently only support a VoicePrint id.
     * @param IdList VoicePrint Mode requires filling in when set to 1. currently only support a VoicePrint id.
     */
    public void setIdList(String [] IdList) {
        this.IdList = IdList;
    }

    public VoicePrint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoicePrint(VoicePrint source) {
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.IdList != null) {
            this.IdList = new String[source.IdList.length];
            for (int i = 0; i < source.IdList.length; i++) {
                this.IdList[i] = new String(source.IdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);

    }
}

