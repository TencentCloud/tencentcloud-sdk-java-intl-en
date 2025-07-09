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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTLogInfoResponse extends AbstractModel {

    /**
    * `NetworkNum`: Number of detected network scans
 `HandleNum`: Number of pending processing events
"BanNum": 
  `VulNum`: Number of vulnerability exploits
  "OutNum`: Number of compromised servers
"BruteForceNum": 0
    */
    @SerializedName("Data")
    @Expose
    private TLogInfo Data;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get `NetworkNum`: Number of detected network scans
 `HandleNum`: Number of pending processing events
"BanNum": 
  `VulNum`: Number of vulnerability exploits
  "OutNum`: Number of compromised servers
"BruteForceNum": 0 
     * @return Data `NetworkNum`: Number of detected network scans
 `HandleNum`: Number of pending processing events
"BanNum": 
  `VulNum`: Number of vulnerability exploits
  "OutNum`: Number of compromised servers
"BruteForceNum": 0
     */
    public TLogInfo getData() {
        return this.Data;
    }

    /**
     * Set `NetworkNum`: Number of detected network scans
 `HandleNum`: Number of pending processing events
"BanNum": 
  `VulNum`: Number of vulnerability exploits
  "OutNum`: Number of compromised servers
"BruteForceNum": 0
     * @param Data `NetworkNum`: Number of detected network scans
 `HandleNum`: Number of pending processing events
"BanNum": 
  `VulNum`: Number of vulnerability exploits
  "OutNum`: Number of compromised servers
"BruteForceNum": 0
     */
    public void setData(TLogInfo Data) {
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

    public DescribeTLogInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTLogInfoResponse(DescribeTLogInfoResponse source) {
        if (source.Data != null) {
            this.Data = new TLogInfo(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

