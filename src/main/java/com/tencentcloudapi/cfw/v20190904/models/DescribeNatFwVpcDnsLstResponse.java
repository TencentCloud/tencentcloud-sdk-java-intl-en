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

public class DescribeNatFwVpcDnsLstResponse extends AbstractModel {

    /**
    * VPC DNS info array of NAT firewall
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("VpcDnsSwitchLst")
    @Expose
    private VpcDnsInfo [] VpcDnsSwitchLst;

    /**
    * Response parameter
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * Total number of toggles
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get VPC DNS info array of NAT firewall
Note: This field may return `null`, indicating that no valid value was found. 
     * @return VpcDnsSwitchLst VPC DNS info array of NAT firewall
Note: This field may return `null`, indicating that no valid value was found.
     */
    public VpcDnsInfo [] getVpcDnsSwitchLst() {
        return this.VpcDnsSwitchLst;
    }

    /**
     * Set VPC DNS info array of NAT firewall
Note: This field may return `null`, indicating that no valid value was found.
     * @param VpcDnsSwitchLst VPC DNS info array of NAT firewall
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setVpcDnsSwitchLst(VpcDnsInfo [] VpcDnsSwitchLst) {
        this.VpcDnsSwitchLst = VpcDnsSwitchLst;
    }

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
     * Get Total number of toggles
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Total Total number of toggles
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of toggles
Note: This field may return `null`, indicating that no valid value was found.
     * @param Total Total number of toggles
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeNatFwVpcDnsLstResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatFwVpcDnsLstResponse(DescribeNatFwVpcDnsLstResponse source) {
        if (source.VpcDnsSwitchLst != null) {
            this.VpcDnsSwitchLst = new VpcDnsInfo[source.VpcDnsSwitchLst.length];
            for (int i = 0; i < source.VpcDnsSwitchLst.length; i++) {
                this.VpcDnsSwitchLst[i] = new VpcDnsInfo(source.VpcDnsSwitchLst[i]);
            }
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VpcDnsSwitchLst.", this.VpcDnsSwitchLst);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

