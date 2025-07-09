/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class DescribeNatFwInfoCountResponse extends AbstractModel {

    /**
    * Response parameter
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * Number of NAT instances of the current tenant
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("NatFwInsCount")
    @Expose
    private Long NatFwInsCount;

    /**
    * Number of subnets connected by the current tenant
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SubnetCount")
    @Expose
    private Long SubnetCount;

    /**
    * Number of firewalls enabled
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("OpenSwitchCount")
    @Expose
    private Long OpenSwitchCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Response parameter
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ReturnMsg Response parameter
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set Response parameter
Note: This field may return `null`, indicating that no valid value was found.
     * @param ReturnMsg Response parameter
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get Number of NAT instances of the current tenant
Note: This field may return `null`, indicating that no valid value was found. 
     * @return NatFwInsCount Number of NAT instances of the current tenant
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getNatFwInsCount() {
        return this.NatFwInsCount;
    }

    /**
     * Set Number of NAT instances of the current tenant
Note: This field may return `null`, indicating that no valid value was found.
     * @param NatFwInsCount Number of NAT instances of the current tenant
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setNatFwInsCount(Long NatFwInsCount) {
        this.NatFwInsCount = NatFwInsCount;
    }

    /**
     * Get Number of subnets connected by the current tenant
Note: This field may return `null`, indicating that no valid value was found. 
     * @return SubnetCount Number of subnets connected by the current tenant
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getSubnetCount() {
        return this.SubnetCount;
    }

    /**
     * Set Number of subnets connected by the current tenant
Note: This field may return `null`, indicating that no valid value was found.
     * @param SubnetCount Number of subnets connected by the current tenant
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSubnetCount(Long SubnetCount) {
        this.SubnetCount = SubnetCount;
    }

    /**
     * Get Number of firewalls enabled
Note: This field may return `null`, indicating that no valid value was found. 
     * @return OpenSwitchCount Number of firewalls enabled
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getOpenSwitchCount() {
        return this.OpenSwitchCount;
    }

    /**
     * Set Number of firewalls enabled
Note: This field may return `null`, indicating that no valid value was found.
     * @param OpenSwitchCount Number of firewalls enabled
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setOpenSwitchCount(Long OpenSwitchCount) {
        this.OpenSwitchCount = OpenSwitchCount;
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

    public DescribeNatFwInfoCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatFwInfoCountResponse(DescribeNatFwInfoCountResponse source) {
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.NatFwInsCount != null) {
            this.NatFwInsCount = new Long(source.NatFwInsCount);
        }
        if (source.SubnetCount != null) {
            this.SubnetCount = new Long(source.SubnetCount);
        }
        if (source.OpenSwitchCount != null) {
            this.OpenSwitchCount = new Long(source.OpenSwitchCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "NatFwInsCount", this.NatFwInsCount);
        this.setParamSimple(map, prefix + "SubnetCount", this.SubnetCount);
        this.setParamSimple(map, prefix + "OpenSwitchCount", this.OpenSwitchCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

