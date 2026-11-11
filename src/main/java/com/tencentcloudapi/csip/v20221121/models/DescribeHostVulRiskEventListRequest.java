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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostVulRiskEventListRequest extends AbstractModel {

    /**
    * <p>Pagination offset.<br>Value range: [0, +∞).<br>Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned items per page.<br>Value range: [1, 100].<br>Default value: 10.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Filter.Name supported by Filter criteria: VulName - fuzzy matching, search by vulnerability Name. Category - exact matching, Filter by vulnerability Category: LINUX-LINUX software vulnerability, WINDOWS-WINDOWS system patch vulnerability, WEB_CMS-WEB-CMS vulnerability, APPLICATION-APPLICATION vulnerability, EMERGENCY-URGENT vulnerability. RiskStatus - exact matching, Filter by risk status: PENDING-PENDING, HANDLED-processed, FIXED-FIXED, SCANNING-rechecking, IGNORED-IGNORED, NOT_REQUIRED-no action is REQUIRED, DELETED-DELETED, FIXING-in remediation, NEED_REBOOT-FIXED PENDING restart, FIX_FAILED-FIX failure. Level - exact matching, Filter by vulnerability severity Level: UNKNOWN-unavailable, LOW-LOW risk, MEDIUM-MEDIUM risk, HIGH-HIGH risk, CRITICAL-CRITICAL. CVSSLevel - exact matching, compatible field, equivalent to Level. VPRLevel - exact matching, Filter by VPR repair priority: DEFERRABLE-DEFERRABLE repair, PLANNED-PLANNED repair, SOON-repair as SOON as possible, URGENT-URGENT repair. - exact matching, Filter by vulnerability ID. InstanceID - exact matching, Filter by CVM instance ID. InstanceID - exact matching, compatible field, equivalent to InstanceID. UUID - exact matching, Filter by host security UUID. LatestScanTimeStart - range matching, latest scan time start, format: YYYY-MM-DD HH:MM:ss. LatestScanTimeEnd - range matching, latest scan time end, format: YYYY-MM-DD HH:MM:ss</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>Sorting order.<br>Enumeration values:<br>asc: ascending<br>desc: descending<br>Default value: desc.</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting field<br>Enumeration values:<br>LatestScanTime: sort by latest scan time<br>Level: sort by threat level<br>VPRLevel: sort by VPR rating<br>RiskStatus: sort by risk status<br>VulID: sort by vulnerability ID<br>InstanceID: sort by instance ID<br>Default value: LatestScanTime</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Pagination offset.<br>Value range: [0, +∞).<br>Default value: 0.</p> 
     * @return Offset <p>Pagination offset.<br>Value range: [0, +∞).<br>Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset.<br>Value range: [0, +∞).<br>Default value: 0.</p>
     * @param Offset <p>Pagination offset.<br>Value range: [0, +∞).<br>Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returned items per page.<br>Value range: [1, 100].<br>Default value: 10.</p> 
     * @return Limit <p>Number of returned items per page.<br>Value range: [1, 100].<br>Default value: 10.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned items per page.<br>Value range: [1, 100].<br>Default value: 10.</p>
     * @param Limit <p>Number of returned items per page.<br>Value range: [1, 100].<br>Default value: 10.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Filter.Name supported by Filter criteria: VulName - fuzzy matching, search by vulnerability Name. Category - exact matching, Filter by vulnerability Category: LINUX-LINUX software vulnerability, WINDOWS-WINDOWS system patch vulnerability, WEB_CMS-WEB-CMS vulnerability, APPLICATION-APPLICATION vulnerability, EMERGENCY-URGENT vulnerability. RiskStatus - exact matching, Filter by risk status: PENDING-PENDING, HANDLED-processed, FIXED-FIXED, SCANNING-rechecking, IGNORED-IGNORED, NOT_REQUIRED-no action is REQUIRED, DELETED-DELETED, FIXING-in remediation, NEED_REBOOT-FIXED PENDING restart, FIX_FAILED-FIX failure. Level - exact matching, Filter by vulnerability severity Level: UNKNOWN-unavailable, LOW-LOW risk, MEDIUM-MEDIUM risk, HIGH-HIGH risk, CRITICAL-CRITICAL. CVSSLevel - exact matching, compatible field, equivalent to Level. VPRLevel - exact matching, Filter by VPR repair priority: DEFERRABLE-DEFERRABLE repair, PLANNED-PLANNED repair, SOON-repair as SOON as possible, URGENT-URGENT repair. - exact matching, Filter by vulnerability ID. InstanceID - exact matching, Filter by CVM instance ID. InstanceID - exact matching, compatible field, equivalent to InstanceID. UUID - exact matching, Filter by host security UUID. LatestScanTimeStart - range matching, latest scan time start, format: YYYY-MM-DD HH:MM:ss. LatestScanTimeEnd - range matching, latest scan time end, format: YYYY-MM-DD HH:MM:ss</p> 
     * @return Filters <p>Filter.Name supported by Filter criteria: VulName - fuzzy matching, search by vulnerability Name. Category - exact matching, Filter by vulnerability Category: LINUX-LINUX software vulnerability, WINDOWS-WINDOWS system patch vulnerability, WEB_CMS-WEB-CMS vulnerability, APPLICATION-APPLICATION vulnerability, EMERGENCY-URGENT vulnerability. RiskStatus - exact matching, Filter by risk status: PENDING-PENDING, HANDLED-processed, FIXED-FIXED, SCANNING-rechecking, IGNORED-IGNORED, NOT_REQUIRED-no action is REQUIRED, DELETED-DELETED, FIXING-in remediation, NEED_REBOOT-FIXED PENDING restart, FIX_FAILED-FIX failure. Level - exact matching, Filter by vulnerability severity Level: UNKNOWN-unavailable, LOW-LOW risk, MEDIUM-MEDIUM risk, HIGH-HIGH risk, CRITICAL-CRITICAL. CVSSLevel - exact matching, compatible field, equivalent to Level. VPRLevel - exact matching, Filter by VPR repair priority: DEFERRABLE-DEFERRABLE repair, PLANNED-PLANNED repair, SOON-repair as SOON as possible, URGENT-URGENT repair. - exact matching, Filter by vulnerability ID. InstanceID - exact matching, Filter by CVM instance ID. InstanceID - exact matching, compatible field, equivalent to InstanceID. UUID - exact matching, Filter by host security UUID. LatestScanTimeStart - range matching, latest scan time start, format: YYYY-MM-DD HH:MM:ss. LatestScanTimeEnd - range matching, latest scan time end, format: YYYY-MM-DD HH:MM:ss</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter.Name supported by Filter criteria: VulName - fuzzy matching, search by vulnerability Name. Category - exact matching, Filter by vulnerability Category: LINUX-LINUX software vulnerability, WINDOWS-WINDOWS system patch vulnerability, WEB_CMS-WEB-CMS vulnerability, APPLICATION-APPLICATION vulnerability, EMERGENCY-URGENT vulnerability. RiskStatus - exact matching, Filter by risk status: PENDING-PENDING, HANDLED-processed, FIXED-FIXED, SCANNING-rechecking, IGNORED-IGNORED, NOT_REQUIRED-no action is REQUIRED, DELETED-DELETED, FIXING-in remediation, NEED_REBOOT-FIXED PENDING restart, FIX_FAILED-FIX failure. Level - exact matching, Filter by vulnerability severity Level: UNKNOWN-unavailable, LOW-LOW risk, MEDIUM-MEDIUM risk, HIGH-HIGH risk, CRITICAL-CRITICAL. CVSSLevel - exact matching, compatible field, equivalent to Level. VPRLevel - exact matching, Filter by VPR repair priority: DEFERRABLE-DEFERRABLE repair, PLANNED-PLANNED repair, SOON-repair as SOON as possible, URGENT-URGENT repair. - exact matching, Filter by vulnerability ID. InstanceID - exact matching, Filter by CVM instance ID. InstanceID - exact matching, compatible field, equivalent to InstanceID. UUID - exact matching, Filter by host security UUID. LatestScanTimeStart - range matching, latest scan time start, format: YYYY-MM-DD HH:MM:ss. LatestScanTimeEnd - range matching, latest scan time end, format: YYYY-MM-DD HH:MM:ss</p>
     * @param Filters <p>Filter.Name supported by Filter criteria: VulName - fuzzy matching, search by vulnerability Name. Category - exact matching, Filter by vulnerability Category: LINUX-LINUX software vulnerability, WINDOWS-WINDOWS system patch vulnerability, WEB_CMS-WEB-CMS vulnerability, APPLICATION-APPLICATION vulnerability, EMERGENCY-URGENT vulnerability. RiskStatus - exact matching, Filter by risk status: PENDING-PENDING, HANDLED-processed, FIXED-FIXED, SCANNING-rechecking, IGNORED-IGNORED, NOT_REQUIRED-no action is REQUIRED, DELETED-DELETED, FIXING-in remediation, NEED_REBOOT-FIXED PENDING restart, FIX_FAILED-FIX failure. Level - exact matching, Filter by vulnerability severity Level: UNKNOWN-unavailable, LOW-LOW risk, MEDIUM-MEDIUM risk, HIGH-HIGH risk, CRITICAL-CRITICAL. CVSSLevel - exact matching, compatible field, equivalent to Level. VPRLevel - exact matching, Filter by VPR repair priority: DEFERRABLE-DEFERRABLE repair, PLANNED-PLANNED repair, SOON-repair as SOON as possible, URGENT-URGENT repair. - exact matching, Filter by vulnerability ID. InstanceID - exact matching, Filter by CVM instance ID. InstanceID - exact matching, compatible field, equivalent to InstanceID. UUID - exact matching, Filter by host security UUID. LatestScanTimeStart - range matching, latest scan time start, format: YYYY-MM-DD HH:MM:ss. LatestScanTimeEnd - range matching, latest scan time end, format: YYYY-MM-DD HH:MM:ss</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Sorting order.<br>Enumeration values:<br>asc: ascending<br>desc: descending<br>Default value: desc.</p> 
     * @return Order <p>Sorting order.<br>Enumeration values:<br>asc: ascending<br>desc: descending<br>Default value: desc.</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting order.<br>Enumeration values:<br>asc: ascending<br>desc: descending<br>Default value: desc.</p>
     * @param Order <p>Sorting order.<br>Enumeration values:<br>asc: ascending<br>desc: descending<br>Default value: desc.</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting field<br>Enumeration values:<br>LatestScanTime: sort by latest scan time<br>Level: sort by threat level<br>VPRLevel: sort by VPR rating<br>RiskStatus: sort by risk status<br>VulID: sort by vulnerability ID<br>InstanceID: sort by instance ID<br>Default value: LatestScanTime</p> 
     * @return By <p>Sorting field<br>Enumeration values:<br>LatestScanTime: sort by latest scan time<br>Level: sort by threat level<br>VPRLevel: sort by VPR rating<br>RiskStatus: sort by risk status<br>VulID: sort by vulnerability ID<br>InstanceID: sort by instance ID<br>Default value: LatestScanTime</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting field<br>Enumeration values:<br>LatestScanTime: sort by latest scan time<br>Level: sort by threat level<br>VPRLevel: sort by VPR rating<br>RiskStatus: sort by risk status<br>VulID: sort by vulnerability ID<br>InstanceID: sort by instance ID<br>Default value: LatestScanTime</p>
     * @param By <p>Sorting field<br>Enumeration values:<br>LatestScanTime: sort by latest scan time<br>Level: sort by threat level<br>VPRLevel: sort by VPR rating<br>RiskStatus: sort by risk status<br>VulID: sort by vulnerability ID<br>InstanceID: sort by instance ID<br>Default value: LatestScanTime</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeHostVulRiskEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostVulRiskEventListRequest(DescribeHostVulRiskEventListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

