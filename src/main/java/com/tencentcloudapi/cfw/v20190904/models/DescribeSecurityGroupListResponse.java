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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityGroupListResponse extends AbstractModel {

    /**
    * Total rules in the list
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Security group rule list data
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupListData [] Data;

    /**
    * Total entries excluding the filtered ones
    */
    @SerializedName("AllTotal")
    @Expose
    private Long AllTotal;

    /**
    * All access control rules enabled/disabled
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total rules in the list 
     * @return Total Total rules in the list
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total rules in the list
     * @param Total Total rules in the list
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Security group rule list data 
     * @return Data Security group rule list data
     */
    public SecurityGroupListData [] getData() {
        return this.Data;
    }

    /**
     * Set Security group rule list data
     * @param Data Security group rule list data
     */
    public void setData(SecurityGroupListData [] Data) {
        this.Data = Data;
    }

    /**
     * Get Total entries excluding the filtered ones 
     * @return AllTotal Total entries excluding the filtered ones
     */
    public Long getAllTotal() {
        return this.AllTotal;
    }

    /**
     * Set Total entries excluding the filtered ones
     * @param AllTotal Total entries excluding the filtered ones
     */
    public void setAllTotal(Long AllTotal) {
        this.AllTotal = AllTotal;
    }

    /**
     * Get All access control rules enabled/disabled
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Enable All access control rules enabled/disabled
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set All access control rules enabled/disabled
Note: This field may return `null`, indicating that no valid value was found.
     * @param Enable All access control rules enabled/disabled
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
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

    public DescribeSecurityGroupListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupListResponse(DescribeSecurityGroupListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new SecurityGroupListData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SecurityGroupListData(source.Data[i]);
            }
        }
        if (source.AllTotal != null) {
            this.AllTotal = new Long(source.AllTotal);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "AllTotal", this.AllTotal);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

