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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LimitRule extends AbstractModel {

    /**
    * Request matching conditions
    */
    @SerializedName("Filters")
    @Expose
    private RuleFilter [] Filters;

    /**
    * Parameter throttling based on composite
    */
    @SerializedName("LimitBy")
    @Expose
    private KeyValue [] LimitBy;

    /**
    * Throttling threshold
    */
    @SerializedName("QpsThresholds")
    @Expose
    private QpsThreshold [] QpsThresholds;

    /**
    * Precise throttling threshold
    */
    @SerializedName("AccurateQpsThresholds")
    @Expose
    private AccurateQpsThreshold [] AccurateQpsThresholds;

    /**
     * Get Request matching conditions 
     * @return Filters Request matching conditions
     */
    public RuleFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Request matching conditions
     * @param Filters Request matching conditions
     */
    public void setFilters(RuleFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Parameter throttling based on composite 
     * @return LimitBy Parameter throttling based on composite
     */
    public KeyValue [] getLimitBy() {
        return this.LimitBy;
    }

    /**
     * Set Parameter throttling based on composite
     * @param LimitBy Parameter throttling based on composite
     */
    public void setLimitBy(KeyValue [] LimitBy) {
        this.LimitBy = LimitBy;
    }

    /**
     * Get Throttling threshold 
     * @return QpsThresholds Throttling threshold
     */
    public QpsThreshold [] getQpsThresholds() {
        return this.QpsThresholds;
    }

    /**
     * Set Throttling threshold
     * @param QpsThresholds Throttling threshold
     */
    public void setQpsThresholds(QpsThreshold [] QpsThresholds) {
        this.QpsThresholds = QpsThresholds;
    }

    /**
     * Get Precise throttling threshold 
     * @return AccurateQpsThresholds Precise throttling threshold
     */
    public AccurateQpsThreshold [] getAccurateQpsThresholds() {
        return this.AccurateQpsThresholds;
    }

    /**
     * Set Precise throttling threshold
     * @param AccurateQpsThresholds Precise throttling threshold
     */
    public void setAccurateQpsThresholds(AccurateQpsThreshold [] AccurateQpsThresholds) {
        this.AccurateQpsThresholds = AccurateQpsThresholds;
    }

    public LimitRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LimitRule(LimitRule source) {
        if (source.Filters != null) {
            this.Filters = new RuleFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RuleFilter(source.Filters[i]);
            }
        }
        if (source.LimitBy != null) {
            this.LimitBy = new KeyValue[source.LimitBy.length];
            for (int i = 0; i < source.LimitBy.length; i++) {
                this.LimitBy[i] = new KeyValue(source.LimitBy[i]);
            }
        }
        if (source.QpsThresholds != null) {
            this.QpsThresholds = new QpsThreshold[source.QpsThresholds.length];
            for (int i = 0; i < source.QpsThresholds.length; i++) {
                this.QpsThresholds[i] = new QpsThreshold(source.QpsThresholds[i]);
            }
        }
        if (source.AccurateQpsThresholds != null) {
            this.AccurateQpsThresholds = new AccurateQpsThreshold[source.AccurateQpsThresholds.length];
            for (int i = 0; i < source.AccurateQpsThresholds.length; i++) {
                this.AccurateQpsThresholds[i] = new AccurateQpsThreshold(source.AccurateQpsThresholds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "LimitBy.", this.LimitBy);
        this.setParamArrayObj(map, prefix + "QpsThresholds.", this.QpsThresholds);
        this.setParamArrayObj(map, prefix + "AccurateQpsThresholds.", this.AccurateQpsThresholds);

    }
}

