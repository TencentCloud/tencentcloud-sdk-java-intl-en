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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingDataRequest extends AbstractModel{

    /**
    * Query start time, e.g., 2018-09-04 10:40:00. The returned result will be later than or equal to the specified time
The time will be rounded forward based on the granularity parameter `Interval`. For example, if the query start time is 2018-09-04 10:40:00 and the query time granularity is 1-hour, the time for the first returned entry will be 2018-09-04 10:00:00
The range between the start time and end time should be less than or equal to 90 days
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time, e.g. 2018-09-04 10:40:00. The returned result will be earlier than or equal to the specified time
The time will be rounded forward based on the granularity parameter `Interval`. For example, if the query end time is 2018-09-04 10:40:00 and the query time granularity is 1-hour, the time for the last returned entry will be 2018-09-04 10:00:00
The range between the start time and end time should be less than or equal to 90 days
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Time granularity, which can be:
`min`: 1-minute granularity. The query period cannot exceed 24 hours.
`5min`: 5-minute granularity. The query range cannot exceed 31 days.
`hour`: 1-hour granularity. The query period cannot exceed 31 days.
`day`: 1-day granularity. The query period cannot exceed 31 days.

Querying 1-minute granularity data is not supported if the `Area` field is `overseas`.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Domain name whose billing data is to be queried
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Project ID, which can be viewed [here](https://console.cloud.tencent.com/project)
If the `Domain` parameter is populated with specific domain name information, then the billing data of this domain name instead of the specified project will be returned
    */
    @SerializedName("Project")
    @Expose
    private Long Project;

    /**
    * Acceleration region whose billing data is to be queried:
mainland: in the mainland of China
overseas: outside the mainland of China
If this parameter is left empty, `mainland` will be used by default
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Country/region to be queried if `Area` is `overseas`
For district or country/region codes, please see [District Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E7.9C.81.E4.BB.BD.E6.98.A0.E5.B0.84)
If this parameter is left empty, all countries/regions will be queried
    */
    @SerializedName("District")
    @Expose
    private Long District;

    /**
    * Billing statistics type
flux: bill-by-traffic
bandwidth: bill-by-bandwidth
Default value: `bandwidth`
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Specifies the product to query, either `cdn` (default) or `ecdn`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Query start time, e.g., 2018-09-04 10:40:00. The returned result will be later than or equal to the specified time
The time will be rounded forward based on the granularity parameter `Interval`. For example, if the query start time is 2018-09-04 10:40:00 and the query time granularity is 1-hour, the time for the first returned entry will be 2018-09-04 10:00:00
The range between the start time and end time should be less than or equal to 90 days 
     * @return StartTime Query start time, e.g., 2018-09-04 10:40:00. The returned result will be later than or equal to the specified time
The time will be rounded forward based on the granularity parameter `Interval`. For example, if the query start time is 2018-09-04 10:40:00 and the query time granularity is 1-hour, the time for the first returned entry will be 2018-09-04 10:00:00
The range between the start time and end time should be less than or equal to 90 days
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time, e.g., 2018-09-04 10:40:00. The returned result will be later than or equal to the specified time
The time will be rounded forward based on the granularity parameter `Interval`. For example, if the query start time is 2018-09-04 10:40:00 and the query time granularity is 1-hour, the time for the first returned entry will be 2018-09-04 10:00:00
The range between the start time and end time should be less than or equal to 90 days
     * @param StartTime Query start time, e.g., 2018-09-04 10:40:00. The returned result will be later than or equal to the specified time
The time will be rounded forward based on the granularity parameter `Interval`. For example, if the query start time is 2018-09-04 10:40:00 and the query time granularity is 1-hour, the time for the first returned entry will be 2018-09-04 10:00:00
The range between the start time and end time should be less than or equal to 90 days
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time, e.g. 2018-09-04 10:40:00. The returned result will be earlier than or equal to the specified time
The time will be rounded forward based on the granularity parameter `Interval`. For example, if the query end time is 2018-09-04 10:40:00 and the query time granularity is 1-hour, the time for the last returned entry will be 2018-09-04 10:00:00
The range between the start time and end time should be less than or equal to 90 days 
     * @return EndTime Query end time, e.g. 2018-09-04 10:40:00. The returned result will be earlier than or equal to the specified time
The time will be rounded forward based on the granularity parameter `Interval`. For example, if the query end time is 2018-09-04 10:40:00 and the query time granularity is 1-hour, the time for the last returned entry will be 2018-09-04 10:00:00
The range between the start time and end time should be less than or equal to 90 days
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time, e.g. 2018-09-04 10:40:00. The returned result will be earlier than or equal to the specified time
The time will be rounded forward based on the granularity parameter `Interval`. For example, if the query end time is 2018-09-04 10:40:00 and the query time granularity is 1-hour, the time for the last returned entry will be 2018-09-04 10:00:00
The range between the start time and end time should be less than or equal to 90 days
     * @param EndTime Query end time, e.g. 2018-09-04 10:40:00. The returned result will be earlier than or equal to the specified time
The time will be rounded forward based on the granularity parameter `Interval`. For example, if the query end time is 2018-09-04 10:40:00 and the query time granularity is 1-hour, the time for the last returned entry will be 2018-09-04 10:00:00
The range between the start time and end time should be less than or equal to 90 days
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Time granularity, which can be:
`min`: 1-minute granularity. The query period cannot exceed 24 hours.
`5min`: 5-minute granularity. The query range cannot exceed 31 days.
`hour`: 1-hour granularity. The query period cannot exceed 31 days.
`day`: 1-day granularity. The query period cannot exceed 31 days.

Querying 1-minute granularity data is not supported if the `Area` field is `overseas`. 
     * @return Interval Time granularity, which can be:
`min`: 1-minute granularity. The query period cannot exceed 24 hours.
`5min`: 5-minute granularity. The query range cannot exceed 31 days.
`hour`: 1-hour granularity. The query period cannot exceed 31 days.
`day`: 1-day granularity. The query period cannot exceed 31 days.

Querying 1-minute granularity data is not supported if the `Area` field is `overseas`.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity, which can be:
`min`: 1-minute granularity. The query period cannot exceed 24 hours.
`5min`: 5-minute granularity. The query range cannot exceed 31 days.
`hour`: 1-hour granularity. The query period cannot exceed 31 days.
`day`: 1-day granularity. The query period cannot exceed 31 days.

Querying 1-minute granularity data is not supported if the `Area` field is `overseas`.
     * @param Interval Time granularity, which can be:
`min`: 1-minute granularity. The query period cannot exceed 24 hours.
`5min`: 5-minute granularity. The query range cannot exceed 31 days.
`hour`: 1-hour granularity. The query period cannot exceed 31 days.
`day`: 1-day granularity. The query period cannot exceed 31 days.

Querying 1-minute granularity data is not supported if the `Area` field is `overseas`.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Domain name whose billing data is to be queried 
     * @return Domain Domain name whose billing data is to be queried
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name whose billing data is to be queried
     * @param Domain Domain name whose billing data is to be queried
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Project ID, which can be viewed [here](https://console.cloud.tencent.com/project)
If the `Domain` parameter is populated with specific domain name information, then the billing data of this domain name instead of the specified project will be returned 
     * @return Project Project ID, which can be viewed [here](https://console.cloud.tencent.com/project)
If the `Domain` parameter is populated with specific domain name information, then the billing data of this domain name instead of the specified project will be returned
     */
    public Long getProject() {
        return this.Project;
    }

    /**
     * Set Project ID, which can be viewed [here](https://console.cloud.tencent.com/project)
If the `Domain` parameter is populated with specific domain name information, then the billing data of this domain name instead of the specified project will be returned
     * @param Project Project ID, which can be viewed [here](https://console.cloud.tencent.com/project)
If the `Domain` parameter is populated with specific domain name information, then the billing data of this domain name instead of the specified project will be returned
     */
    public void setProject(Long Project) {
        this.Project = Project;
    }

    /**
     * Get Acceleration region whose billing data is to be queried:
mainland: in the mainland of China
overseas: outside the mainland of China
If this parameter is left empty, `mainland` will be used by default 
     * @return Area Acceleration region whose billing data is to be queried:
mainland: in the mainland of China
overseas: outside the mainland of China
If this parameter is left empty, `mainland` will be used by default
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region whose billing data is to be queried:
mainland: in the mainland of China
overseas: outside the mainland of China
If this parameter is left empty, `mainland` will be used by default
     * @param Area Acceleration region whose billing data is to be queried:
mainland: in the mainland of China
overseas: outside the mainland of China
If this parameter is left empty, `mainland` will be used by default
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Country/region to be queried if `Area` is `overseas`
For district or country/region codes, please see [District Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E7.9C.81.E4.BB.BD.E6.98.A0.E5.B0.84)
If this parameter is left empty, all countries/regions will be queried 
     * @return District Country/region to be queried if `Area` is `overseas`
For district or country/region codes, please see [District Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E7.9C.81.E4.BB.BD.E6.98.A0.E5.B0.84)
If this parameter is left empty, all countries/regions will be queried
     */
    public Long getDistrict() {
        return this.District;
    }

    /**
     * Set Country/region to be queried if `Area` is `overseas`
For district or country/region codes, please see [District Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E7.9C.81.E4.BB.BD.E6.98.A0.E5.B0.84)
If this parameter is left empty, all countries/regions will be queried
     * @param District Country/region to be queried if `Area` is `overseas`
For district or country/region codes, please see [District Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E7.9C.81.E4.BB.BD.E6.98.A0.E5.B0.84)
If this parameter is left empty, all countries/regions will be queried
     */
    public void setDistrict(Long District) {
        this.District = District;
    }

    /**
     * Get Billing statistics type
flux: bill-by-traffic
bandwidth: bill-by-bandwidth
Default value: `bandwidth` 
     * @return Metric Billing statistics type
flux: bill-by-traffic
bandwidth: bill-by-bandwidth
Default value: `bandwidth`
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Billing statistics type
flux: bill-by-traffic
bandwidth: bill-by-bandwidth
Default value: `bandwidth`
     * @param Metric Billing statistics type
flux: bill-by-traffic
bandwidth: bill-by-bandwidth
Default value: `bandwidth`
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Specifies the product to query, either `cdn` (default) or `ecdn`. 
     * @return Product Specifies the product to query, either `cdn` (default) or `ecdn`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Specifies the product to query, either `cdn` (default) or `ecdn`.
     * @param Product Specifies the product to query, either `cdn` (default) or `ecdn`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeBillingDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillingDataRequest(DescribeBillingDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Project != null) {
            this.Project = new Long(source.Project);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.District != null) {
            this.District = new Long(source.District);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Project", this.Project);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

