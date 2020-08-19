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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDirectConnectsResponse extends AbstractModel{

    /**
    * List of connections.
    */
    @SerializedName("DirectConnectSet")
    @Expose
    private DirectConnect [] DirectConnectSet;

    /**
    * Number of eligible connection lists.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Whether all connections under the account have the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("AllSignLaw")
    @Expose
    private Boolean AllSignLaw;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of connections. 
     * @return DirectConnectSet List of connections.
     */
    public DirectConnect [] getDirectConnectSet() {
        return this.DirectConnectSet;
    }

    /**
     * Set List of connections.
     * @param DirectConnectSet List of connections.
     */
    public void setDirectConnectSet(DirectConnect [] DirectConnectSet) {
        this.DirectConnectSet = DirectConnectSet;
    }

    /**
     * Get Number of eligible connection lists. 
     * @return TotalCount Number of eligible connection lists.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible connection lists.
     * @param TotalCount Number of eligible connection lists.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Whether all connections under the account have the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return AllSignLaw Whether all connections under the account have the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Boolean getAllSignLaw() {
        return this.AllSignLaw;
    }

    /**
     * Set Whether all connections under the account have the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param AllSignLaw Whether all connections under the account have the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setAllSignLaw(Boolean AllSignLaw) {
        this.AllSignLaw = AllSignLaw;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DirectConnectSet.", this.DirectConnectSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "AllSignLaw", this.AllSignLaw);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

