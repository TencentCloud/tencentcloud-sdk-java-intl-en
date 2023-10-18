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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoleListResponse extends AbstractModel {

    /**
    * Role details list
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("List")
    @Expose
    private RoleInfo [] List;

    /**
    * Total number of roles
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Role details list
Note: This field may return null, indicating that no valid value was found. 
     * @return List Role details list
Note: This field may return null, indicating that no valid value was found.
     */
    public RoleInfo [] getList() {
        return this.List;
    }

    /**
     * Set Role details list
Note: This field may return null, indicating that no valid value was found.
     * @param List Role details list
Note: This field may return null, indicating that no valid value was found.
     */
    public void setList(RoleInfo [] List) {
        this.List = List;
    }

    /**
     * Get Total number of roles 
     * @return TotalNum Total number of roles
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set Total number of roles
     * @param TotalNum Total number of roles
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
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

    public DescribeRoleListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoleListResponse(DescribeRoleListResponse source) {
        if (source.List != null) {
            this.List = new RoleInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new RoleInfo(source.List[i]);
            }
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

