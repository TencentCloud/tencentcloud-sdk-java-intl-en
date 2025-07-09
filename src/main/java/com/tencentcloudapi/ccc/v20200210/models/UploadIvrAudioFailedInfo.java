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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadIvrAudioFailedInfo extends AbstractModel {

    /**
    * Filename.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Reason for failure.
    */
    @SerializedName("FailedMsg")
    @Expose
    private String FailedMsg;

    /**
     * Get Filename. 
     * @return FileName Filename.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename.
     * @param FileName Filename.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Reason for failure. 
     * @return FailedMsg Reason for failure.
     */
    public String getFailedMsg() {
        return this.FailedMsg;
    }

    /**
     * Set Reason for failure.
     * @param FailedMsg Reason for failure.
     */
    public void setFailedMsg(String FailedMsg) {
        this.FailedMsg = FailedMsg;
    }

    public UploadIvrAudioFailedInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadIvrAudioFailedInfo(UploadIvrAudioFailedInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FailedMsg != null) {
            this.FailedMsg = new String(source.FailedMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FailedMsg", this.FailedMsg);

    }
}

