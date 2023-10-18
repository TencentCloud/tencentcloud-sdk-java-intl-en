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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetGroupListResponse extends AbstractModel {

    /**
    * Returned group information
    */
    @SerializedName("GroupInfos")
    @Expose
    private GroupInfo [] GroupInfos;

    /**
    * Total number of groups
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Returned group information 
     * @return GroupInfos Returned group information
     */
    public GroupInfo [] getGroupInfos() {
        return this.GroupInfos;
    }

    /**
     * Set Returned group information
     * @param GroupInfos Returned group information
     */
    public void setGroupInfos(GroupInfo [] GroupInfos) {
        this.GroupInfos = GroupInfos;
    }

    /**
     * Get Total number of groups
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GroupNum Total number of groups
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Set Total number of groups
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GroupNum Total number of groups
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
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

    public GetGroupListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetGroupListResponse(GetGroupListResponse source) {
        if (source.GroupInfos != null) {
            this.GroupInfos = new GroupInfo[source.GroupInfos.length];
            for (int i = 0; i < source.GroupInfos.length; i++) {
                this.GroupInfos[i] = new GroupInfo(source.GroupInfos[i]);
            }
        }
        if (source.GroupNum != null) {
            this.GroupNum = new Long(source.GroupNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "GroupInfos.", this.GroupInfos);
        this.setParamSimple(map, prefix + "GroupNum", this.GroupNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

