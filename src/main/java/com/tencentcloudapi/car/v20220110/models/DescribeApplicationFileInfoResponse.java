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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationFileInfoResponse extends AbstractModel {

    /**
    * Application file data list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileInfoList")
    @Expose
    private UserApplicationFileInfo [] FileInfoList;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Application file data list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileInfoList Application file data list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UserApplicationFileInfo [] getFileInfoList() {
        return this.FileInfoList;
    }

    /**
     * Set Application file data list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileInfoList Application file data list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileInfoList(UserApplicationFileInfo [] FileInfoList) {
        this.FileInfoList = FileInfoList;
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

    public DescribeApplicationFileInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationFileInfoResponse(DescribeApplicationFileInfoResponse source) {
        if (source.FileInfoList != null) {
            this.FileInfoList = new UserApplicationFileInfo[source.FileInfoList.length];
            for (int i = 0; i < source.FileInfoList.length; i++) {
                this.FileInfoList[i] = new UserApplicationFileInfo(source.FileInfoList[i]);
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
        this.setParamArrayObj(map, prefix + "FileInfoList.", this.FileInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

