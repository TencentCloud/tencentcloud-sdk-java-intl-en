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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordLineListResponse extends AbstractModel {

    /**
    * List of split zones.
    */
    @SerializedName("LineList")
    @Expose
    private LineInfo [] LineList;

    /**
    * List of split zone groups.
    */
    @SerializedName("LineGroupList")
    @Expose
    private LineGroupInfo [] LineGroupList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of split zones. 
     * @return LineList List of split zones.
     */
    public LineInfo [] getLineList() {
        return this.LineList;
    }

    /**
     * Set List of split zones.
     * @param LineList List of split zones.
     */
    public void setLineList(LineInfo [] LineList) {
        this.LineList = LineList;
    }

    /**
     * Get List of split zone groups. 
     * @return LineGroupList List of split zone groups.
     */
    public LineGroupInfo [] getLineGroupList() {
        return this.LineGroupList;
    }

    /**
     * Set List of split zone groups.
     * @param LineGroupList List of split zone groups.
     */
    public void setLineGroupList(LineGroupInfo [] LineGroupList) {
        this.LineGroupList = LineGroupList;
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

    public DescribeRecordLineListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordLineListResponse(DescribeRecordLineListResponse source) {
        if (source.LineList != null) {
            this.LineList = new LineInfo[source.LineList.length];
            for (int i = 0; i < source.LineList.length; i++) {
                this.LineList[i] = new LineInfo(source.LineList[i]);
            }
        }
        if (source.LineGroupList != null) {
            this.LineGroupList = new LineGroupInfo[source.LineGroupList.length];
            for (int i = 0; i < source.LineGroupList.length; i++) {
                this.LineGroupList[i] = new LineGroupInfo(source.LineGroupList[i]);
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
        this.setParamArrayObj(map, prefix + "LineList.", this.LineList);
        this.setParamArrayObj(map, prefix + "LineGroupList.", this.LineGroupList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

