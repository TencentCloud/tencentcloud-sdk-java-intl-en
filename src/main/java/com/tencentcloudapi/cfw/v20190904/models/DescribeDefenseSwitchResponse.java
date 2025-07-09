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

public class DescribeDefenseSwitchResponse extends AbstractModel {

    /**
    * Whether to enable the Basic Protection feature
    */
    @SerializedName("BasicRuleSwitch")
    @Expose
    private Long BasicRuleSwitch;

    /**
    * Whether to enable the Security Baseline feature
    */
    @SerializedName("BaselineAllSwitch")
    @Expose
    private Long BaselineAllSwitch;

    /**
    * Whether to enable the Treat Intelligence feature
    */
    @SerializedName("TiSwitch")
    @Expose
    private Long TiSwitch;

    /**
    * Whether to enable the Virtual Patch feature
    */
    @SerializedName("VirtualPatchSwitch")
    @Expose
    private Long VirtualPatchSwitch;

    /**
    * Whether it has been enabled before
    */
    @SerializedName("HistoryOpen")
    @Expose
    private Long HistoryOpen;

    /**
    * Status code. `0`: Succeeded. Others: Failed
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * Status message. `success` and `fail.
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether to enable the Basic Protection feature 
     * @return BasicRuleSwitch Whether to enable the Basic Protection feature
     */
    public Long getBasicRuleSwitch() {
        return this.BasicRuleSwitch;
    }

    /**
     * Set Whether to enable the Basic Protection feature
     * @param BasicRuleSwitch Whether to enable the Basic Protection feature
     */
    public void setBasicRuleSwitch(Long BasicRuleSwitch) {
        this.BasicRuleSwitch = BasicRuleSwitch;
    }

    /**
     * Get Whether to enable the Security Baseline feature 
     * @return BaselineAllSwitch Whether to enable the Security Baseline feature
     */
    public Long getBaselineAllSwitch() {
        return this.BaselineAllSwitch;
    }

    /**
     * Set Whether to enable the Security Baseline feature
     * @param BaselineAllSwitch Whether to enable the Security Baseline feature
     */
    public void setBaselineAllSwitch(Long BaselineAllSwitch) {
        this.BaselineAllSwitch = BaselineAllSwitch;
    }

    /**
     * Get Whether to enable the Treat Intelligence feature 
     * @return TiSwitch Whether to enable the Treat Intelligence feature
     */
    public Long getTiSwitch() {
        return this.TiSwitch;
    }

    /**
     * Set Whether to enable the Treat Intelligence feature
     * @param TiSwitch Whether to enable the Treat Intelligence feature
     */
    public void setTiSwitch(Long TiSwitch) {
        this.TiSwitch = TiSwitch;
    }

    /**
     * Get Whether to enable the Virtual Patch feature 
     * @return VirtualPatchSwitch Whether to enable the Virtual Patch feature
     */
    public Long getVirtualPatchSwitch() {
        return this.VirtualPatchSwitch;
    }

    /**
     * Set Whether to enable the Virtual Patch feature
     * @param VirtualPatchSwitch Whether to enable the Virtual Patch feature
     */
    public void setVirtualPatchSwitch(Long VirtualPatchSwitch) {
        this.VirtualPatchSwitch = VirtualPatchSwitch;
    }

    /**
     * Get Whether it has been enabled before 
     * @return HistoryOpen Whether it has been enabled before
     */
    public Long getHistoryOpen() {
        return this.HistoryOpen;
    }

    /**
     * Set Whether it has been enabled before
     * @param HistoryOpen Whether it has been enabled before
     */
    public void setHistoryOpen(Long HistoryOpen) {
        this.HistoryOpen = HistoryOpen;
    }

    /**
     * Get Status code. `0`: Succeeded. Others: Failed 
     * @return ReturnCode Status code. `0`: Succeeded. Others: Failed
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set Status code. `0`: Succeeded. Others: Failed
     * @param ReturnCode Status code. `0`: Succeeded. Others: Failed
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get Status message. `success` and `fail. 
     * @return ReturnMsg Status message. `success` and `fail.
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set Status message. `success` and `fail.
     * @param ReturnMsg Status message. `success` and `fail.
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
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

    public DescribeDefenseSwitchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDefenseSwitchResponse(DescribeDefenseSwitchResponse source) {
        if (source.BasicRuleSwitch != null) {
            this.BasicRuleSwitch = new Long(source.BasicRuleSwitch);
        }
        if (source.BaselineAllSwitch != null) {
            this.BaselineAllSwitch = new Long(source.BaselineAllSwitch);
        }
        if (source.TiSwitch != null) {
            this.TiSwitch = new Long(source.TiSwitch);
        }
        if (source.VirtualPatchSwitch != null) {
            this.VirtualPatchSwitch = new Long(source.VirtualPatchSwitch);
        }
        if (source.HistoryOpen != null) {
            this.HistoryOpen = new Long(source.HistoryOpen);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BasicRuleSwitch", this.BasicRuleSwitch);
        this.setParamSimple(map, prefix + "BaselineAllSwitch", this.BaselineAllSwitch);
        this.setParamSimple(map, prefix + "TiSwitch", this.TiSwitch);
        this.setParamSimple(map, prefix + "VirtualPatchSwitch", this.VirtualPatchSwitch);
        this.setParamSimple(map, prefix + "HistoryOpen", this.HistoryOpen);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

