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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpAccessControlRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Count identifier
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Action. 40 for querying the allowlist, 42 for querying the blocklist
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * Timestamp of the minimum valid time
    */
    @SerializedName("VtsMin")
    @Expose
    private Long VtsMin;

    /**
    * Timestamp of the maximum valid time
    */
    @SerializedName("VtsMax")
    @Expose
    private Long VtsMax;

    /**
    * Timestamp for minimum creation time
    */
    @SerializedName("CtsMin")
    @Expose
    private Long CtsMin;

    /**
    * Timestamp for Maximum Creation Time
    */
    @SerializedName("CtsMax")
    @Expose
    private Long CtsMax;

    /**
    * Paging offset, a multiple of limit. The minimum value is 0, and the maximum value is Total/Limit rounded up.
    */
    @SerializedName("OffSet")
    @Expose
    private Long OffSet;

    /**
    * Number of records returned per page, which is 20 by default.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Source.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Sort parameters
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Effective status.
    */
    @SerializedName("ValidStatus")
    @Expose
    private Long ValidStatus;

    /**
    * Timestamp of the minimum valid time
    */
    @SerializedName("ValidTimeStampMin")
    @Expose
    private String ValidTimeStampMin;

    /**
    * Timestamp of the maximum valid time
    */
    @SerializedName("ValidTimeStampMax")
    @Expose
    private String ValidTimeStampMax;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Filter by scheduled task type. Valid values: 0, 1, 2, 3, 4.
    */
    @SerializedName("TimerType")
    @Expose
    private Long TimerType;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Count identifier 
     * @return Count Count identifier
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Count identifier
     * @param Count Count identifier
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Action. 40 for querying the allowlist, 42 for querying the blocklist 
     * @return ActionType Action. 40 for querying the allowlist, 42 for querying the blocklist
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set Action. 40 for querying the allowlist, 42 for querying the blocklist
     * @param ActionType Action. 40 for querying the allowlist, 42 for querying the blocklist
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Timestamp of the minimum valid time 
     * @return VtsMin Timestamp of the minimum valid time
     * @deprecated
     */
    @Deprecated
    public Long getVtsMin() {
        return this.VtsMin;
    }

    /**
     * Set Timestamp of the minimum valid time
     * @param VtsMin Timestamp of the minimum valid time
     * @deprecated
     */
    @Deprecated
    public void setVtsMin(Long VtsMin) {
        this.VtsMin = VtsMin;
    }

    /**
     * Get Timestamp of the maximum valid time 
     * @return VtsMax Timestamp of the maximum valid time
     * @deprecated
     */
    @Deprecated
    public Long getVtsMax() {
        return this.VtsMax;
    }

    /**
     * Set Timestamp of the maximum valid time
     * @param VtsMax Timestamp of the maximum valid time
     * @deprecated
     */
    @Deprecated
    public void setVtsMax(Long VtsMax) {
        this.VtsMax = VtsMax;
    }

    /**
     * Get Timestamp for minimum creation time 
     * @return CtsMin Timestamp for minimum creation time
     */
    public Long getCtsMin() {
        return this.CtsMin;
    }

    /**
     * Set Timestamp for minimum creation time
     * @param CtsMin Timestamp for minimum creation time
     */
    public void setCtsMin(Long CtsMin) {
        this.CtsMin = CtsMin;
    }

    /**
     * Get Timestamp for Maximum Creation Time 
     * @return CtsMax Timestamp for Maximum Creation Time
     */
    public Long getCtsMax() {
        return this.CtsMax;
    }

    /**
     * Set Timestamp for Maximum Creation Time
     * @param CtsMax Timestamp for Maximum Creation Time
     */
    public void setCtsMax(Long CtsMax) {
        this.CtsMax = CtsMax;
    }

    /**
     * Get Paging offset, a multiple of limit. The minimum value is 0, and the maximum value is Total/Limit rounded up. 
     * @return OffSet Paging offset, a multiple of limit. The minimum value is 0, and the maximum value is Total/Limit rounded up.
     */
    public Long getOffSet() {
        return this.OffSet;
    }

    /**
     * Set Paging offset, a multiple of limit. The minimum value is 0, and the maximum value is Total/Limit rounded up.
     * @param OffSet Paging offset, a multiple of limit. The minimum value is 0, and the maximum value is Total/Limit rounded up.
     */
    public void setOffSet(Long OffSet) {
        this.OffSet = OffSet;
    }

    /**
     * Get Number of records returned per page, which is 20 by default. 
     * @return Limit Number of records returned per page, which is 20 by default.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of records returned per page, which is 20 by default.
     * @param Limit Number of records returned per page, which is 20 by default.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Source. 
     * @return Source Source.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Source.
     * @param Source Source.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Sort parameters 
     * @return Sort Sort parameters
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sort parameters
     * @param Sort Sort parameters
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get IP 
     * @return Ip IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP
     * @param Ip IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Effective status. 
     * @return ValidStatus Effective status.
     */
    public Long getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set Effective status.
     * @param ValidStatus Effective status.
     */
    public void setValidStatus(Long ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    /**
     * Get Timestamp of the minimum valid time 
     * @return ValidTimeStampMin Timestamp of the minimum valid time
     */
    public String getValidTimeStampMin() {
        return this.ValidTimeStampMin;
    }

    /**
     * Set Timestamp of the minimum valid time
     * @param ValidTimeStampMin Timestamp of the minimum valid time
     */
    public void setValidTimeStampMin(String ValidTimeStampMin) {
        this.ValidTimeStampMin = ValidTimeStampMin;
    }

    /**
     * Get Timestamp of the maximum valid time 
     * @return ValidTimeStampMax Timestamp of the maximum valid time
     */
    public String getValidTimeStampMax() {
        return this.ValidTimeStampMax;
    }

    /**
     * Set Timestamp of the maximum valid time
     * @param ValidTimeStampMax Timestamp of the maximum valid time
     */
    public void setValidTimeStampMax(String ValidTimeStampMax) {
        this.ValidTimeStampMax = ValidTimeStampMax;
    }

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Filter by scheduled task type. Valid values: 0, 1, 2, 3, 4. 
     * @return TimerType Filter by scheduled task type. Valid values: 0, 1, 2, 3, 4.
     */
    public Long getTimerType() {
        return this.TimerType;
    }

    /**
     * Set Filter by scheduled task type. Valid values: 0, 1, 2, 3, 4.
     * @param TimerType Filter by scheduled task type. Valid values: 0, 1, 2, 3, 4.
     */
    public void setTimerType(Long TimerType) {
        this.TimerType = TimerType;
    }

    public DescribeIpAccessControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIpAccessControlRequest(DescribeIpAccessControlRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.VtsMin != null) {
            this.VtsMin = new Long(source.VtsMin);
        }
        if (source.VtsMax != null) {
            this.VtsMax = new Long(source.VtsMax);
        }
        if (source.CtsMin != null) {
            this.CtsMin = new Long(source.CtsMin);
        }
        if (source.CtsMax != null) {
            this.CtsMax = new Long(source.CtsMax);
        }
        if (source.OffSet != null) {
            this.OffSet = new Long(source.OffSet);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.ValidStatus != null) {
            this.ValidStatus = new Long(source.ValidStatus);
        }
        if (source.ValidTimeStampMin != null) {
            this.ValidTimeStampMin = new String(source.ValidTimeStampMin);
        }
        if (source.ValidTimeStampMax != null) {
            this.ValidTimeStampMax = new String(source.ValidTimeStampMax);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.TimerType != null) {
            this.TimerType = new Long(source.TimerType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "VtsMin", this.VtsMin);
        this.setParamSimple(map, prefix + "VtsMax", this.VtsMax);
        this.setParamSimple(map, prefix + "CtsMin", this.CtsMin);
        this.setParamSimple(map, prefix + "CtsMax", this.CtsMax);
        this.setParamSimple(map, prefix + "OffSet", this.OffSet);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);
        this.setParamSimple(map, prefix + "ValidTimeStampMin", this.ValidTimeStampMin);
        this.setParamSimple(map, prefix + "ValidTimeStampMax", this.ValidTimeStampMax);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "TimerType", this.TimerType);

    }
}

