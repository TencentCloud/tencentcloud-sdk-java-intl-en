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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveTranscodeTotalInfoResponse extends AbstractModel {

    /**
    * List of transcoding data
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("DataInfoList")
    @Expose
    private TranscodeTotalInfo [] DataInfoList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of transcoding data
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return DataInfoList List of transcoding data
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public TranscodeTotalInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set List of transcoding data
Note: This field may return `null`, indicating that no valid value can be found.
     * @param DataInfoList List of transcoding data
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setDataInfoList(TranscodeTotalInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
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

    public DescribeLiveTranscodeTotalInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveTranscodeTotalInfoResponse(DescribeLiveTranscodeTotalInfoResponse source) {
        if (source.DataInfoList != null) {
            this.DataInfoList = new TranscodeTotalInfo[source.DataInfoList.length];
            for (int i = 0; i < source.DataInfoList.length; i++) {
                this.DataInfoList[i] = new TranscodeTotalInfo(source.DataInfoList[i]);
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
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

