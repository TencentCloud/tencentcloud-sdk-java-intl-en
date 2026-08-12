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

public class DescribeVulRiskRelateHostRequest extends AbstractModel {

    /**
    * <p>p>KB patch internal ID (kb_info.id)</p>
    */
    @SerializedName("KBID")
    @Expose
    private Long KBID;

    /**
    * <p>Vulnerability ID (vul_vuls.id)</p>
    */
    @SerializedName("VulID")
    @Expose
    private Long VulID;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Filter conditions array. Multi-condition with each other is AND relationship<br>Supported Filter.Name:<br>Keyword: Keyword fuzzy search (fuzzy matching for host name/IP/InstanceID)<br>CloudTag: Cloud tag<br>Tag: Security center tag</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting order<br>Enumeration value:<br>ASC: Ascending<br>DESC: Descending order<br>Default value: DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting field<br>Enumeration value:<br>LatestScanTime: Latest scan time<br>VPRLevel: VPR rating<br>RiskStatus: Remediation status<br>Default value: LatestScanTime</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>p>KB patch internal ID (kb_info.id)</p> 
     * @return KBID <p>p>KB patch internal ID (kb_info.id)</p>
     */
    public Long getKBID() {
        return this.KBID;
    }

    /**
     * Set <p>p>KB patch internal ID (kb_info.id)</p>
     * @param KBID <p>p>KB patch internal ID (kb_info.id)</p>
     */
    public void setKBID(Long KBID) {
        this.KBID = KBID;
    }

    /**
     * Get <p>Vulnerability ID (vul_vuls.id)</p> 
     * @return VulID <p>Vulnerability ID (vul_vuls.id)</p>
     */
    public Long getVulID() {
        return this.VulID;
    }

    /**
     * Set <p>Vulnerability ID (vul_vuls.id)</p>
     * @param VulID <p>Vulnerability ID (vul_vuls.id)</p>
     */
    public void setVulID(Long VulID) {
        this.VulID = VulID;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Filter conditions array. Multi-condition with each other is AND relationship<br>Supported Filter.Name:<br>Keyword: Keyword fuzzy search (fuzzy matching for host name/IP/InstanceID)<br>CloudTag: Cloud tag<br>Tag: Security center tag</p> 
     * @return Filters <p>Filter conditions array. Multi-condition with each other is AND relationship<br>Supported Filter.Name:<br>Keyword: Keyword fuzzy search (fuzzy matching for host name/IP/InstanceID)<br>CloudTag: Cloud tag<br>Tag: Security center tag</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter conditions array. Multi-condition with each other is AND relationship<br>Supported Filter.Name:<br>Keyword: Keyword fuzzy search (fuzzy matching for host name/IP/InstanceID)<br>CloudTag: Cloud tag<br>Tag: Security center tag</p>
     * @param Filters <p>Filter conditions array. Multi-condition with each other is AND relationship<br>Supported Filter.Name:<br>Keyword: Keyword fuzzy search (fuzzy matching for host name/IP/InstanceID)<br>CloudTag: Cloud tag<br>Tag: Security center tag</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p> 
     * @return Limit <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
     * @param Limit <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p> 
     * @return Offset <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
     * @param Offset <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting order<br>Enumeration value:<br>ASC: Ascending<br>DESC: Descending order<br>Default value: DESC</p> 
     * @return Order <p>Sorting order<br>Enumeration value:<br>ASC: Ascending<br>DESC: Descending order<br>Default value: DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting order<br>Enumeration value:<br>ASC: Ascending<br>DESC: Descending order<br>Default value: DESC</p>
     * @param Order <p>Sorting order<br>Enumeration value:<br>ASC: Ascending<br>DESC: Descending order<br>Default value: DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting field<br>Enumeration value:<br>LatestScanTime: Latest scan time<br>VPRLevel: VPR rating<br>RiskStatus: Remediation status<br>Default value: LatestScanTime</p> 
     * @return By <p>Sorting field<br>Enumeration value:<br>LatestScanTime: Latest scan time<br>VPRLevel: VPR rating<br>RiskStatus: Remediation status<br>Default value: LatestScanTime</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting field<br>Enumeration value:<br>LatestScanTime: Latest scan time<br>VPRLevel: VPR rating<br>RiskStatus: Remediation status<br>Default value: LatestScanTime</p>
     * @param By <p>Sorting field<br>Enumeration value:<br>LatestScanTime: Latest scan time<br>VPRLevel: VPR rating<br>RiskStatus: Remediation status<br>Default value: LatestScanTime</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeVulRiskRelateHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulRiskRelateHostRequest(DescribeVulRiskRelateHostRequest source) {
        if (source.KBID != null) {
            this.KBID = new Long(source.KBID);
        }
        if (source.VulID != null) {
            this.VulID = new Long(source.VulID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KBID", this.KBID);
        this.setParamSimple(map, prefix + "VulID", this.VulID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

