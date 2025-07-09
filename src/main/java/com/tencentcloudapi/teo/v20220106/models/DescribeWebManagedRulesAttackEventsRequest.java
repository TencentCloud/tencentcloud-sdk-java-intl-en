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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWebManagedRulesAttackEventsRequest extends AbstractModel {

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Number of items
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Current page
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * List of DDoS policy group IDs
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * Site set
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * List of subdomain names
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Whether to show details. Valid values: Y (yes), N (no).
    */
    @SerializedName("IsShowDetail")
    @Expose
    private String IsShowDetail;

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of items 
     * @return PageSize Number of items
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items
     * @param PageSize Number of items
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Current page 
     * @return PageNo Current page
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set Current page
     * @param PageNo Current page
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get List of DDoS policy group IDs 
     * @return PolicyIds List of DDoS policy group IDs
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set List of DDoS policy group IDs
     * @param PolicyIds List of DDoS policy group IDs
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get Site set 
     * @return ZoneIds Site set
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site set
     * @param ZoneIds Site set
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get List of subdomain names 
     * @return Domains List of subdomain names
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set List of subdomain names
     * @param Domains List of subdomain names
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Whether to show details. Valid values: Y (yes), N (no). 
     * @return IsShowDetail Whether to show details. Valid values: Y (yes), N (no).
     */
    public String getIsShowDetail() {
        return this.IsShowDetail;
    }

    /**
     * Set Whether to show details. Valid values: Y (yes), N (no).
     * @param IsShowDetail Whether to show details. Valid values: Y (yes), N (no).
     */
    public void setIsShowDetail(String IsShowDetail) {
        this.IsShowDetail = IsShowDetail;
    }

    public DescribeWebManagedRulesAttackEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebManagedRulesAttackEventsRequest(DescribeWebManagedRulesAttackEventsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new Long[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new Long(source.PolicyIds[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.IsShowDetail != null) {
            this.IsShowDetail = new String(source.IsShowDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "IsShowDetail", this.IsShowDetail);

    }
}

