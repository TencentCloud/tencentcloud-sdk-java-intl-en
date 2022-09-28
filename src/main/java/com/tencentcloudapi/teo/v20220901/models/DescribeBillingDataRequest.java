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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingDataRequest extends AbstractModel{

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Time granularity. Values:
<ul>
<li>`min`: One minute</li>
<li>`5min`: Five minutes</li>
<li>`hour`: One hour</li>
<li>`day`: One day</li>
</ul>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Metric item. Values:
<ul>
<li>`acc_flux`: Content acceleration traffic;</li>
<li>`quic_request`: QUIC requests;</li>
<li>`sec_flux`: Security traffic;</li>
<li>`sec_request_clean`: Clean security requests.</li>
</ul>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Filter item. Values:
<ul>
<li>`zone`: Site;</li>
<li>`plan`: Service plan;</li>
<li>`service`: L4 or L7;</li>
<li>`tagKey`: Tag key;</li>
<li>`tagValue`: Tag value.</li>
</ul>
    */
    @SerializedName("Filters")
    @Expose
    private BillingDataFilter [] Filters;

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Time granularity. Values:
<ul>
<li>`min`: One minute</li>
<li>`5min`: Five minutes</li>
<li>`hour`: One hour</li>
<li>`day`: One day</li>
</ul> 
     * @return Interval Time granularity. Values:
<ul>
<li>`min`: One minute</li>
<li>`5min`: Five minutes</li>
<li>`hour`: One hour</li>
<li>`day`: One day</li>
</ul>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity. Values:
<ul>
<li>`min`: One minute</li>
<li>`5min`: Five minutes</li>
<li>`hour`: One hour</li>
<li>`day`: One day</li>
</ul>
     * @param Interval Time granularity. Values:
<ul>
<li>`min`: One minute</li>
<li>`5min`: Five minutes</li>
<li>`hour`: One hour</li>
<li>`day`: One day</li>
</ul>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Metric item. Values:
<ul>
<li>`acc_flux`: Content acceleration traffic;</li>
<li>`quic_request`: QUIC requests;</li>
<li>`sec_flux`: Security traffic;</li>
<li>`sec_request_clean`: Clean security requests.</li>
</ul> 
     * @return MetricName Metric item. Values:
<ul>
<li>`acc_flux`: Content acceleration traffic;</li>
<li>`quic_request`: QUIC requests;</li>
<li>`sec_flux`: Security traffic;</li>
<li>`sec_request_clean`: Clean security requests.</li>
</ul>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric item. Values:
<ul>
<li>`acc_flux`: Content acceleration traffic;</li>
<li>`quic_request`: QUIC requests;</li>
<li>`sec_flux`: Security traffic;</li>
<li>`sec_request_clean`: Clean security requests.</li>
</ul>
     * @param MetricName Metric item. Values:
<ul>
<li>`acc_flux`: Content acceleration traffic;</li>
<li>`quic_request`: QUIC requests;</li>
<li>`sec_flux`: Security traffic;</li>
<li>`sec_request_clean`: Clean security requests.</li>
</ul>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Filter item. Values:
<ul>
<li>`zone`: Site;</li>
<li>`plan`: Service plan;</li>
<li>`service`: L4 or L7;</li>
<li>`tagKey`: Tag key;</li>
<li>`tagValue`: Tag value.</li>
</ul> 
     * @return Filters Filter item. Values:
<ul>
<li>`zone`: Site;</li>
<li>`plan`: Service plan;</li>
<li>`service`: L4 or L7;</li>
<li>`tagKey`: Tag key;</li>
<li>`tagValue`: Tag value.</li>
</ul>
     */
    public BillingDataFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter item. Values:
<ul>
<li>`zone`: Site;</li>
<li>`plan`: Service plan;</li>
<li>`service`: L4 or L7;</li>
<li>`tagKey`: Tag key;</li>
<li>`tagValue`: Tag value.</li>
</ul>
     * @param Filters Filter item. Values:
<ul>
<li>`zone`: Site;</li>
<li>`plan`: Service plan;</li>
<li>`service`: L4 or L7;</li>
<li>`tagKey`: Tag key;</li>
<li>`tagValue`: Tag value.</li>
</ul>
     */
    public void setFilters(BillingDataFilter [] Filters) {
        this.Filters = Filters;
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
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Filters != null) {
            this.Filters = new BillingDataFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new BillingDataFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

