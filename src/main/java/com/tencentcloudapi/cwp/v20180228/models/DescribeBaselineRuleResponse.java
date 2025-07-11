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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineRuleResponse extends AbstractModel {

    /**
    * Total number of pagination query records
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Baseline check item list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BaselineRuleList")
    @Expose
    private BaselineRuleInfo [] BaselineRuleList;

    /**
    * Whether to display the description column. True: yes; false: no.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShowRuleRemark")
    @Expose
    private Boolean ShowRuleRemark;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of pagination query records 
     * @return TotalCount Total number of pagination query records
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of pagination query records
     * @param TotalCount Total number of pagination query records
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Baseline check item list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BaselineRuleList Baseline check item list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BaselineRuleInfo [] getBaselineRuleList() {
        return this.BaselineRuleList;
    }

    /**
     * Set Baseline check item list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BaselineRuleList Baseline check item list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBaselineRuleList(BaselineRuleInfo [] BaselineRuleList) {
        this.BaselineRuleList = BaselineRuleList;
    }

    /**
     * Get Whether to display the description column. True: yes; false: no.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShowRuleRemark Whether to display the description column. True: yes; false: no.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getShowRuleRemark() {
        return this.ShowRuleRemark;
    }

    /**
     * Set Whether to display the description column. True: yes; false: no.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShowRuleRemark Whether to display the description column. True: yes; false: no.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShowRuleRemark(Boolean ShowRuleRemark) {
        this.ShowRuleRemark = ShowRuleRemark;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBaselineRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineRuleResponse(DescribeBaselineRuleResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BaselineRuleList != null) {
            this.BaselineRuleList = new BaselineRuleInfo[source.BaselineRuleList.length];
            for (int i = 0; i < source.BaselineRuleList.length; i++) {
                this.BaselineRuleList[i] = new BaselineRuleInfo(source.BaselineRuleList[i]);
            }
        }
        if (source.ShowRuleRemark != null) {
            this.ShowRuleRemark = new Boolean(source.ShowRuleRemark);
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
        this.setParamArrayObj(map, prefix + "BaselineRuleList.", this.BaselineRuleList);
        this.setParamSimple(map, prefix + "ShowRuleRemark", this.ShowRuleRemark);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

