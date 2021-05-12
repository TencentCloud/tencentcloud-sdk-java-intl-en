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

public class MetricSet extends AbstractModel{

    /**
    * Namespace. Each Tencent Cloud product has a namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Metric Name
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Unit used by the metric
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Unit used by the metric
    */
    @SerializedName("UnitCname")
    @Expose
    private String UnitCname;

    /**
    * Statistical period in seconds supported by the metric, such as 60 and 300
    */
    @SerializedName("Period")
    @Expose
    private Long [] Period;

    /**
    * Metric method during the statistical period
    */
    @SerializedName("Periods")
    @Expose
    private PeriodsSt [] Periods;

    /**
    * Meaning of the statistical metric
    */
    @SerializedName("Meaning")
    @Expose
    private MetricObjectMeaning Meaning;

    /**
    * Dimension description
    */
    @SerializedName("Dimensions")
    @Expose
    private DimensionsDesc [] Dimensions;

    /**
     * Get Namespace. Each Tencent Cloud product has a namespace 
     * @return Namespace Namespace. Each Tencent Cloud product has a namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace. Each Tencent Cloud product has a namespace
     * @param Namespace Namespace. Each Tencent Cloud product has a namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Metric Name 
     * @return MetricName Metric Name
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric Name
     * @param MetricName Metric Name
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Unit used by the metric 
     * @return Unit Unit used by the metric
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Unit used by the metric
     * @param Unit Unit used by the metric
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Unit used by the metric 
     * @return UnitCname Unit used by the metric
     */
    public String getUnitCname() {
        return this.UnitCname;
    }

    /**
     * Set Unit used by the metric
     * @param UnitCname Unit used by the metric
     */
    public void setUnitCname(String UnitCname) {
        this.UnitCname = UnitCname;
    }

    /**
     * Get Statistical period in seconds supported by the metric, such as 60 and 300 
     * @return Period Statistical period in seconds supported by the metric, such as 60 and 300
     */
    public Long [] getPeriod() {
        return this.Period;
    }

    /**
     * Set Statistical period in seconds supported by the metric, such as 60 and 300
     * @param Period Statistical period in seconds supported by the metric, such as 60 and 300
     */
    public void setPeriod(Long [] Period) {
        this.Period = Period;
    }

    /**
     * Get Metric method during the statistical period 
     * @return Periods Metric method during the statistical period
     */
    public PeriodsSt [] getPeriods() {
        return this.Periods;
    }

    /**
     * Set Metric method during the statistical period
     * @param Periods Metric method during the statistical period
     */
    public void setPeriods(PeriodsSt [] Periods) {
        this.Periods = Periods;
    }

    /**
     * Get Meaning of the statistical metric 
     * @return Meaning Meaning of the statistical metric
     */
    public MetricObjectMeaning getMeaning() {
        return this.Meaning;
    }

    /**
     * Set Meaning of the statistical metric
     * @param Meaning Meaning of the statistical metric
     */
    public void setMeaning(MetricObjectMeaning Meaning) {
        this.Meaning = Meaning;
    }

    /**
     * Get Dimension description 
     * @return Dimensions Dimension description
     */
    public DimensionsDesc [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Dimension description
     * @param Dimensions Dimension description
     */
    public void setDimensions(DimensionsDesc [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    public MetricSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricSet(MetricSet source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.UnitCname != null) {
            this.UnitCname = new String(source.UnitCname);
        }
        if (source.Period != null) {
            this.Period = new Long[source.Period.length];
            for (int i = 0; i < source.Period.length; i++) {
                this.Period[i] = new Long(source.Period[i]);
            }
        }
        if (source.Periods != null) {
            this.Periods = new PeriodsSt[source.Periods.length];
            for (int i = 0; i < source.Periods.length; i++) {
                this.Periods[i] = new PeriodsSt(source.Periods[i]);
            }
        }
        if (source.Meaning != null) {
            this.Meaning = new MetricObjectMeaning(source.Meaning);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new DimensionsDesc[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new DimensionsDesc(source.Dimensions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "UnitCname", this.UnitCname);
        this.setParamArraySimple(map, prefix + "Period.", this.Period);
        this.setParamArrayObj(map, prefix + "Periods.", this.Periods);
        this.setParamObj(map, prefix + "Meaning.", this.Meaning);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);

    }
}

