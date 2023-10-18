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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditRuleWithInstanceIdsResponse extends AbstractModel {

    /**
    * None
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Audit rule information of the instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Items")
    @Expose
    private InstanceAuditRule [] Items;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get None 
     * @return TotalCount None
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set None
     * @param TotalCount None
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Audit rule information of the instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Items Audit rule information of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceAuditRule [] getItems() {
        return this.Items;
    }

    /**
     * Set Audit rule information of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Items Audit rule information of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setItems(InstanceAuditRule [] Items) {
        this.Items = Items;
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

    public DescribeAuditRuleWithInstanceIdsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditRuleWithInstanceIdsResponse(DescribeAuditRuleWithInstanceIdsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new InstanceAuditRule[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new InstanceAuditRule(source.Items[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

