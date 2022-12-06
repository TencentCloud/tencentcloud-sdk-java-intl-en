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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanVoiceResponse extends AbstractModel{

    /**
    * Voice moderation result. <li>`DataId`: Corresponding `DataId` in request.</li>
<li>`TaskID`: Moderation task ID, which is used to poll the voice detection result.</li>
    */
    @SerializedName("Data")
    @Expose
    private ScanVoiceResult [] Data;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Voice moderation result. <li>`DataId`: Corresponding `DataId` in request.</li>
<li>`TaskID`: Moderation task ID, which is used to poll the voice detection result.</li> 
     * @return Data Voice moderation result. <li>`DataId`: Corresponding `DataId` in request.</li>
<li>`TaskID`: Moderation task ID, which is used to poll the voice detection result.</li>
     */
    public ScanVoiceResult [] getData() {
        return this.Data;
    }

    /**
     * Set Voice moderation result. <li>`DataId`: Corresponding `DataId` in request.</li>
<li>`TaskID`: Moderation task ID, which is used to poll the voice detection result.</li>
     * @param Data Voice moderation result. <li>`DataId`: Corresponding `DataId` in request.</li>
<li>`TaskID`: Moderation task ID, which is used to poll the voice detection result.</li>
     */
    public void setData(ScanVoiceResult [] Data) {
        this.Data = Data;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ScanVoiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanVoiceResponse(ScanVoiceResponse source) {
        if (source.Data != null) {
            this.Data = new ScanVoiceResult[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ScanVoiceResult(source.Data[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

