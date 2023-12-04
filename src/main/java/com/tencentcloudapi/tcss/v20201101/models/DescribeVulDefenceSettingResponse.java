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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulDefenceSettingResponse extends AbstractModel {

    /**
    * Whether it is enabled. Valid values: `0` (disabled); `1` (enabled).
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * Scope of servers with exploit prevention enabled. Valid values: `0` (specified servers); `1` (all servers).
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * Number of servers with exploit prevention enabled
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Number of abnormal servers with exploit prevention enabled
    */
    @SerializedName("ExceptionHostCount")
    @Expose
    private Long ExceptionHostCount;

    /**
    * Specified servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostIDs")
    @Expose
    private String [] HostIDs;

    /**
    * Total number of servers with TCSS activated
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostTotalCount")
    @Expose
    private Long HostTotalCount;

    /**
    * Number of vulnerabilities that can be prevented
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportDefenseVulCount")
    @Expose
    private Long SupportDefenseVulCount;

    /**
    * Number of normal nodes
    */
    @SerializedName("HostNodeCount")
    @Expose
    private Long HostNodeCount;

    /**
    * Super node scope
    */
    @SerializedName("SuperScope")
    @Expose
    private Long SuperScope;

    /**
    * Number of super nodes
    */
    @SerializedName("SuperNodeCount")
    @Expose
    private Long SuperNodeCount;

    /**
    * List of super node IDs
    */
    @SerializedName("SuperNodeIds")
    @Expose
    private String [] SuperNodeIds;

    /**
    * Total number of super nodes with TCSS activated
    */
    @SerializedName("NodeTotalCount")
    @Expose
    private Long NodeTotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether it is enabled. Valid values: `0` (disabled); `1` (enabled). 
     * @return IsEnabled Whether it is enabled. Valid values: `0` (disabled); `1` (enabled).
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set Whether it is enabled. Valid values: `0` (disabled); `1` (enabled).
     * @param IsEnabled Whether it is enabled. Valid values: `0` (disabled); `1` (enabled).
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get Scope of servers with exploit prevention enabled. Valid values: `0` (specified servers); `1` (all servers). 
     * @return Scope Scope of servers with exploit prevention enabled. Valid values: `0` (specified servers); `1` (all servers).
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set Scope of servers with exploit prevention enabled. Valid values: `0` (specified servers); `1` (all servers).
     * @param Scope Scope of servers with exploit prevention enabled. Valid values: `0` (specified servers); `1` (all servers).
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Number of servers with exploit prevention enabled 
     * @return HostCount Number of servers with exploit prevention enabled
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of servers with exploit prevention enabled
     * @param HostCount Number of servers with exploit prevention enabled
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get Number of abnormal servers with exploit prevention enabled 
     * @return ExceptionHostCount Number of abnormal servers with exploit prevention enabled
     */
    public Long getExceptionHostCount() {
        return this.ExceptionHostCount;
    }

    /**
     * Set Number of abnormal servers with exploit prevention enabled
     * @param ExceptionHostCount Number of abnormal servers with exploit prevention enabled
     */
    public void setExceptionHostCount(Long ExceptionHostCount) {
        this.ExceptionHostCount = ExceptionHostCount;
    }

    /**
     * Get Specified servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostIDs Specified servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getHostIDs() {
        return this.HostIDs;
    }

    /**
     * Set Specified servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostIDs Specified servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostIDs(String [] HostIDs) {
        this.HostIDs = HostIDs;
    }

    /**
     * Get Total number of servers with TCSS activated
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostTotalCount Total number of servers with TCSS activated
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostTotalCount() {
        return this.HostTotalCount;
    }

    /**
     * Set Total number of servers with TCSS activated
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostTotalCount Total number of servers with TCSS activated
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostTotalCount(Long HostTotalCount) {
        this.HostTotalCount = HostTotalCount;
    }

    /**
     * Get Number of vulnerabilities that can be prevented
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportDefenseVulCount Number of vulnerabilities that can be prevented
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSupportDefenseVulCount() {
        return this.SupportDefenseVulCount;
    }

    /**
     * Set Number of vulnerabilities that can be prevented
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportDefenseVulCount Number of vulnerabilities that can be prevented
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportDefenseVulCount(Long SupportDefenseVulCount) {
        this.SupportDefenseVulCount = SupportDefenseVulCount;
    }

    /**
     * Get Number of normal nodes 
     * @return HostNodeCount Number of normal nodes
     */
    public Long getHostNodeCount() {
        return this.HostNodeCount;
    }

    /**
     * Set Number of normal nodes
     * @param HostNodeCount Number of normal nodes
     */
    public void setHostNodeCount(Long HostNodeCount) {
        this.HostNodeCount = HostNodeCount;
    }

    /**
     * Get Super node scope 
     * @return SuperScope Super node scope
     */
    public Long getSuperScope() {
        return this.SuperScope;
    }

    /**
     * Set Super node scope
     * @param SuperScope Super node scope
     */
    public void setSuperScope(Long SuperScope) {
        this.SuperScope = SuperScope;
    }

    /**
     * Get Number of super nodes 
     * @return SuperNodeCount Number of super nodes
     */
    public Long getSuperNodeCount() {
        return this.SuperNodeCount;
    }

    /**
     * Set Number of super nodes
     * @param SuperNodeCount Number of super nodes
     */
    public void setSuperNodeCount(Long SuperNodeCount) {
        this.SuperNodeCount = SuperNodeCount;
    }

    /**
     * Get List of super node IDs 
     * @return SuperNodeIds List of super node IDs
     */
    public String [] getSuperNodeIds() {
        return this.SuperNodeIds;
    }

    /**
     * Set List of super node IDs
     * @param SuperNodeIds List of super node IDs
     */
    public void setSuperNodeIds(String [] SuperNodeIds) {
        this.SuperNodeIds = SuperNodeIds;
    }

    /**
     * Get Total number of super nodes with TCSS activated 
     * @return NodeTotalCount Total number of super nodes with TCSS activated
     */
    public Long getNodeTotalCount() {
        return this.NodeTotalCount;
    }

    /**
     * Set Total number of super nodes with TCSS activated
     * @param NodeTotalCount Total number of super nodes with TCSS activated
     */
    public void setNodeTotalCount(Long NodeTotalCount) {
        this.NodeTotalCount = NodeTotalCount;
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

    public DescribeVulDefenceSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulDefenceSettingResponse(DescribeVulDefenceSettingResponse source) {
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.ExceptionHostCount != null) {
            this.ExceptionHostCount = new Long(source.ExceptionHostCount);
        }
        if (source.HostIDs != null) {
            this.HostIDs = new String[source.HostIDs.length];
            for (int i = 0; i < source.HostIDs.length; i++) {
                this.HostIDs[i] = new String(source.HostIDs[i]);
            }
        }
        if (source.HostTotalCount != null) {
            this.HostTotalCount = new Long(source.HostTotalCount);
        }
        if (source.SupportDefenseVulCount != null) {
            this.SupportDefenseVulCount = new Long(source.SupportDefenseVulCount);
        }
        if (source.HostNodeCount != null) {
            this.HostNodeCount = new Long(source.HostNodeCount);
        }
        if (source.SuperScope != null) {
            this.SuperScope = new Long(source.SuperScope);
        }
        if (source.SuperNodeCount != null) {
            this.SuperNodeCount = new Long(source.SuperNodeCount);
        }
        if (source.SuperNodeIds != null) {
            this.SuperNodeIds = new String[source.SuperNodeIds.length];
            for (int i = 0; i < source.SuperNodeIds.length; i++) {
                this.SuperNodeIds[i] = new String(source.SuperNodeIds[i]);
            }
        }
        if (source.NodeTotalCount != null) {
            this.NodeTotalCount = new Long(source.NodeTotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "ExceptionHostCount", this.ExceptionHostCount);
        this.setParamArraySimple(map, prefix + "HostIDs.", this.HostIDs);
        this.setParamSimple(map, prefix + "HostTotalCount", this.HostTotalCount);
        this.setParamSimple(map, prefix + "SupportDefenseVulCount", this.SupportDefenseVulCount);
        this.setParamSimple(map, prefix + "HostNodeCount", this.HostNodeCount);
        this.setParamSimple(map, prefix + "SuperScope", this.SuperScope);
        this.setParamSimple(map, prefix + "SuperNodeCount", this.SuperNodeCount);
        this.setParamArraySimple(map, prefix + "SuperNodeIds.", this.SuperNodeIds);
        this.setParamSimple(map, prefix + "NodeTotalCount", this.NodeTotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

