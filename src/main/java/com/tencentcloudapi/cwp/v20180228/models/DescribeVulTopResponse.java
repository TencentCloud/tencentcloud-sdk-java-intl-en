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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulTopResponse extends AbstractModel {

    /**
    * List of top vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulTopList")
    @Expose
    private VulTopInfo [] VulTopList;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of top vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulTopList List of top vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VulTopInfo [] getVulTopList() {
        return this.VulTopList;
    }

    /**
     * Set List of top vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulTopList List of top vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulTopList(VulTopInfo [] VulTopList) {
        this.VulTopList = VulTopList;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVulTopResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulTopResponse(DescribeVulTopResponse source) {
        if (source.VulTopList != null) {
            this.VulTopList = new VulTopInfo[source.VulTopList.length];
            for (int i = 0; i < source.VulTopList.length; i++) {
                this.VulTopList[i] = new VulTopInfo(source.VulTopList[i]);
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
        this.setParamArrayObj(map, prefix + "VulTopList.", this.VulTopList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
