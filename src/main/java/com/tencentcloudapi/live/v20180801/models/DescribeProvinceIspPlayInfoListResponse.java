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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProvinceIspPlayInfoListResponse extends AbstractModel {

    /**
    * Playback information list.
    */
    @SerializedName("DataInfoList")
    @Expose
    private PlayStatInfo [] DataInfoList;

    /**
    * Statistics type, which is the same as the input parameter.
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Playback information list. 
     * @return DataInfoList Playback information list.
     */
    public PlayStatInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set Playback information list.
     * @param DataInfoList Playback information list.
     */
    public void setDataInfoList(PlayStatInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
    }

    /**
     * Get Statistics type, which is the same as the input parameter. 
     * @return StatType Statistics type, which is the same as the input parameter.
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set Statistics type, which is the same as the input parameter.
     * @param StatType Statistics type, which is the same as the input parameter.
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
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

    public DescribeProvinceIspPlayInfoListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProvinceIspPlayInfoListResponse(DescribeProvinceIspPlayInfoListResponse source) {
        if (source.DataInfoList != null) {
            this.DataInfoList = new PlayStatInfo[source.DataInfoList.length];
            for (int i = 0; i < source.DataInfoList.length; i++) {
                this.DataInfoList[i] = new PlayStatInfo(source.DataInfoList[i]);
            }
        }
        if (source.StatType != null) {
            this.StatType = new String(source.StatType);
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
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

