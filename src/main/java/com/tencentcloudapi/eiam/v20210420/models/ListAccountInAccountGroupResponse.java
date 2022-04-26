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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAccountInAccountGroupResponse extends AbstractModel{

    /**
    * List of accounts returned for the query.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountList")
    @Expose
    private AppAccountInfo [] AccountList;

    /**
    * Total number of accounts returned for the query.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Account group ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of accounts returned for the query.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AccountList List of accounts returned for the query.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AppAccountInfo [] getAccountList() {
        return this.AccountList;
    }

    /**
     * Set List of accounts returned for the query.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AccountList List of accounts returned for the query.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountList(AppAccountInfo [] AccountList) {
        this.AccountList = AccountList;
    }

    /**
     * Get Total number of accounts returned for the query.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of accounts returned for the query.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of accounts returned for the query.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of accounts returned for the query.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Account group ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AccountGroupId Account group ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set Account group ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AccountGroupId Account group ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
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

    public ListAccountInAccountGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAccountInAccountGroupResponse(ListAccountInAccountGroupResponse source) {
        if (source.AccountList != null) {
            this.AccountList = new AppAccountInfo[source.AccountList.length];
            for (int i = 0; i < source.AccountList.length; i++) {
                this.AccountList[i] = new AppAccountInfo(source.AccountList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AccountList.", this.AccountList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

