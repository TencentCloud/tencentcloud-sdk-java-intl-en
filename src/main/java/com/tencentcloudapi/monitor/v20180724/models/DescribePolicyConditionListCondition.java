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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListCondition extends AbstractModel{

    /**
    * Policy view name.
    */
    @SerializedName("PolicyViewName")
    @Expose
    private String PolicyViewName;

    /**
    * Event alarm conditions.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("EventMetrics")
    @Expose
    private DescribePolicyConditionListEventMetric [] EventMetrics;

    /**
    * Whether to support multiple regions.
    */
    @SerializedName("IsSupportMultiRegion")
    @Expose
    private Boolean IsSupportMultiRegion;

    /**
    * Metric alarm conditions.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Metrics")
    @Expose
    private DescribePolicyConditionListMetric [] Metrics;

    /**
    * Policy type name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Sorting ID.
    */
    @SerializedName("SortId")
    @Expose
    private Long SortId;

    /**
    * Whether to support default policies.
    */
    @SerializedName("SupportDefault")
    @Expose
    private Boolean SupportDefault;

    /**
    * List of regions that support this policy type.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("SupportRegions")
    @Expose
    private String [] SupportRegions;

    /**
     * Get Policy view name. 
     * @return PolicyViewName Policy view name.
     */
    public String getPolicyViewName() {
        return this.PolicyViewName;
    }

    /**
     * Set Policy view name.
     * @param PolicyViewName Policy view name.
     */
    public void setPolicyViewName(String PolicyViewName) {
        this.PolicyViewName = PolicyViewName;
    }

    /**
     * Get Event alarm conditions.
Note: This field may return null, indicating that no valid value was found. 
     * @return EventMetrics Event alarm conditions.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyConditionListEventMetric [] getEventMetrics() {
        return this.EventMetrics;
    }

    /**
     * Set Event alarm conditions.
Note: This field may return null, indicating that no valid value was found.
     * @param EventMetrics Event alarm conditions.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setEventMetrics(DescribePolicyConditionListEventMetric [] EventMetrics) {
        this.EventMetrics = EventMetrics;
    }

    /**
     * Get Whether to support multiple regions. 
     * @return IsSupportMultiRegion Whether to support multiple regions.
     */
    public Boolean getIsSupportMultiRegion() {
        return this.IsSupportMultiRegion;
    }

    /**
     * Set Whether to support multiple regions.
     * @param IsSupportMultiRegion Whether to support multiple regions.
     */
    public void setIsSupportMultiRegion(Boolean IsSupportMultiRegion) {
        this.IsSupportMultiRegion = IsSupportMultiRegion;
    }

    /**
     * Get Metric alarm conditions.
Note: This field may return null, indicating that no valid value was found. 
     * @return Metrics Metric alarm conditions.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyConditionListMetric [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Metric alarm conditions.
Note: This field may return null, indicating that no valid value was found.
     * @param Metrics Metric alarm conditions.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setMetrics(DescribePolicyConditionListMetric [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get Policy type name. 
     * @return Name Policy type name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Policy type name.
     * @param Name Policy type name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Sorting ID. 
     * @return SortId Sorting ID.
     */
    public Long getSortId() {
        return this.SortId;
    }

    /**
     * Set Sorting ID.
     * @param SortId Sorting ID.
     */
    public void setSortId(Long SortId) {
        this.SortId = SortId;
    }

    /**
     * Get Whether to support default policies. 
     * @return SupportDefault Whether to support default policies.
     */
    public Boolean getSupportDefault() {
        return this.SupportDefault;
    }

    /**
     * Set Whether to support default policies.
     * @param SupportDefault Whether to support default policies.
     */
    public void setSupportDefault(Boolean SupportDefault) {
        this.SupportDefault = SupportDefault;
    }

    /**
     * Get List of regions that support this policy type.
Note: This field may return null, indicating that no valid value was found. 
     * @return SupportRegions List of regions that support this policy type.
Note: This field may return null, indicating that no valid value was found.
     */
    public String [] getSupportRegions() {
        return this.SupportRegions;
    }

    /**
     * Set List of regions that support this policy type.
Note: This field may return null, indicating that no valid value was found.
     * @param SupportRegions List of regions that support this policy type.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setSupportRegions(String [] SupportRegions) {
        this.SupportRegions = SupportRegions;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyViewName", this.PolicyViewName);
        this.setParamArrayObj(map, prefix + "EventMetrics.", this.EventMetrics);
        this.setParamSimple(map, prefix + "IsSupportMultiRegion", this.IsSupportMultiRegion);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "SupportDefault", this.SupportDefault);
        this.setParamArraySimple(map, prefix + "SupportRegions.", this.SupportRegions);

    }
}

