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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogUserHostStatsResponse extends AbstractModel{

    /**
    * Total number of source addresses.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Detailed list of the proportion of slow logs from each source address.
    */
    @SerializedName("Items")
    @Expose
    private SlowLogHost [] Items;

    /**
    * Detailed list of the percentages of slow logs from different source usernames
    */
    @SerializedName("UserNameItems")
    @Expose
    private SlowLogUser [] UserNameItems;

    /**
    * The number of source users
    */
    @SerializedName("UserTotalCount")
    @Expose
    private Long UserTotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of source addresses. 
     * @return TotalCount Total number of source addresses.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of source addresses.
     * @param TotalCount Total number of source addresses.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Detailed list of the proportion of slow logs from each source address. 
     * @return Items Detailed list of the proportion of slow logs from each source address.
     */
    public SlowLogHost [] getItems() {
        return this.Items;
    }

    /**
     * Set Detailed list of the proportion of slow logs from each source address.
     * @param Items Detailed list of the proportion of slow logs from each source address.
     */
    public void setItems(SlowLogHost [] Items) {
        this.Items = Items;
    }

    /**
     * Get Detailed list of the percentages of slow logs from different source usernames 
     * @return UserNameItems Detailed list of the percentages of slow logs from different source usernames
     */
    public SlowLogUser [] getUserNameItems() {
        return this.UserNameItems;
    }

    /**
     * Set Detailed list of the percentages of slow logs from different source usernames
     * @param UserNameItems Detailed list of the percentages of slow logs from different source usernames
     */
    public void setUserNameItems(SlowLogUser [] UserNameItems) {
        this.UserNameItems = UserNameItems;
    }

    /**
     * Get The number of source users 
     * @return UserTotalCount The number of source users
     */
    public Long getUserTotalCount() {
        return this.UserTotalCount;
    }

    /**
     * Set The number of source users
     * @param UserTotalCount The number of source users
     */
    public void setUserTotalCount(Long UserTotalCount) {
        this.UserTotalCount = UserTotalCount;
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

    public DescribeSlowLogUserHostStatsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogUserHostStatsResponse(DescribeSlowLogUserHostStatsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new SlowLogHost[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new SlowLogHost(source.Items[i]);
            }
        }
        if (source.UserNameItems != null) {
            this.UserNameItems = new SlowLogUser[source.UserNameItems.length];
            for (int i = 0; i < source.UserNameItems.length; i++) {
                this.UserNameItems[i] = new SlowLogUser(source.UserNameItems[i]);
            }
        }
        if (source.UserTotalCount != null) {
            this.UserTotalCount = new Long(source.UserTotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamArrayObj(map, prefix + "UserNameItems.", this.UserNameItems);
        this.setParamSimple(map, prefix + "UserTotalCount", this.UserTotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

