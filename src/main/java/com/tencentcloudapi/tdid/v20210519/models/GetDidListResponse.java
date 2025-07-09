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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDidListResponse extends AbstractModel {

    /**
    * A list of DIDs.
    */
    @SerializedName("DataList")
    @Expose
    private DidData [] DataList;

    /**
    * The total number of records.
    */
    @SerializedName("AllCount")
    @Expose
    private Long AllCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get A list of DIDs. 
     * @return DataList A list of DIDs.
     */
    public DidData [] getDataList() {
        return this.DataList;
    }

    /**
     * Set A list of DIDs.
     * @param DataList A list of DIDs.
     */
    public void setDataList(DidData [] DataList) {
        this.DataList = DataList;
    }

    /**
     * Get The total number of records. 
     * @return AllCount The total number of records.
     */
    public Long getAllCount() {
        return this.AllCount;
    }

    /**
     * Set The total number of records.
     * @param AllCount The total number of records.
     */
    public void setAllCount(Long AllCount) {
        this.AllCount = AllCount;
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

    public GetDidListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDidListResponse(GetDidListResponse source) {
        if (source.DataList != null) {
            this.DataList = new DidData[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new DidData(source.DataList[i]);
            }
        }
        if (source.AllCount != null) {
            this.AllCount = new Long(source.AllCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DataList.", this.DataList);
        this.setParamSimple(map, prefix + "AllCount", this.AllCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

