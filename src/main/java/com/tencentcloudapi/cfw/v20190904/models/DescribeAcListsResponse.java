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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAcListsResponse extends AbstractModel{

    /**
    * Total entries
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Access control list data
    */
    @SerializedName("Data")
    @Expose
    private AcListsData [] Data;

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
     * Get Total entries 
     * @return Total Total entries
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total entries
     * @param Total Total entries
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Access control list data 
     * @return Data Access control list data
     */
    public AcListsData [] getData() {
        return this.Data;
    }

    /**
     * Set Access control list data
     * @param Data Access control list data
     */
    public void setData(AcListsData [] Data) {
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

    public DescribeAcListsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAcListsResponse(DescribeAcListsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new AcListsData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new AcListsData(source.Data[i]);
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

