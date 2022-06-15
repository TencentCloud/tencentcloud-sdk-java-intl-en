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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlvSpecialParam extends AbstractModel{

    /**
    * Whether to enable upload while recording. This parameter is only valid for FLV recording.
    */
    @SerializedName("UploadInRecording")
    @Expose
    private Boolean UploadInRecording;

    /**
     * Get Whether to enable upload while recording. This parameter is only valid for FLV recording. 
     * @return UploadInRecording Whether to enable upload while recording. This parameter is only valid for FLV recording.
     */
    public Boolean getUploadInRecording() {
        return this.UploadInRecording;
    }

    /**
     * Set Whether to enable upload while recording. This parameter is only valid for FLV recording.
     * @param UploadInRecording Whether to enable upload while recording. This parameter is only valid for FLV recording.
     */
    public void setUploadInRecording(Boolean UploadInRecording) {
        this.UploadInRecording = UploadInRecording;
    }

    public FlvSpecialParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlvSpecialParam(FlvSpecialParam source) {
        if (source.UploadInRecording != null) {
            this.UploadInRecording = new Boolean(source.UploadInRecording);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UploadInRecording", this.UploadInRecording);

    }
}

