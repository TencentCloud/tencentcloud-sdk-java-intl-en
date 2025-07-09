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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QpsData extends AbstractModel {

    /**
    * Elastic QPS Default Value

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ElasticBillingDefault")
    @Expose
    private Long ElasticBillingDefault;

    /**
    * Elastic QPS Minimum Value

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ElasticBillingMin")
    @Expose
    private Long ElasticBillingMin;

    /**
    * Maximum Elastic QPS

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ElasticBillingMax")
    @Expose
    private Long ElasticBillingMax;

    /**
    * Maximum QPS for Business Expansion Package

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QPSExtendMax")
    @Expose
    private Long QPSExtendMax;

    /**
    * Maximum QPS for Overseas Business Expansion Package

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QPSExtendIntlMax")
    @Expose
    private Long QPSExtendIntlMax;

    /**
     * Get Elastic QPS Default Value

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ElasticBillingDefault Elastic QPS Default Value

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getElasticBillingDefault() {
        return this.ElasticBillingDefault;
    }

    /**
     * Set Elastic QPS Default Value

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ElasticBillingDefault Elastic QPS Default Value

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setElasticBillingDefault(Long ElasticBillingDefault) {
        this.ElasticBillingDefault = ElasticBillingDefault;
    }

    /**
     * Get Elastic QPS Minimum Value

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ElasticBillingMin Elastic QPS Minimum Value

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getElasticBillingMin() {
        return this.ElasticBillingMin;
    }

    /**
     * Set Elastic QPS Minimum Value

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ElasticBillingMin Elastic QPS Minimum Value

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setElasticBillingMin(Long ElasticBillingMin) {
        this.ElasticBillingMin = ElasticBillingMin;
    }

    /**
     * Get Maximum Elastic QPS

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ElasticBillingMax Maximum Elastic QPS

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getElasticBillingMax() {
        return this.ElasticBillingMax;
    }

    /**
     * Set Maximum Elastic QPS

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ElasticBillingMax Maximum Elastic QPS

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setElasticBillingMax(Long ElasticBillingMax) {
        this.ElasticBillingMax = ElasticBillingMax;
    }

    /**
     * Get Maximum QPS for Business Expansion Package

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QPSExtendMax Maximum QPS for Business Expansion Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getQPSExtendMax() {
        return this.QPSExtendMax;
    }

    /**
     * Set Maximum QPS for Business Expansion Package

Note: This field may return null, indicating that no valid values can be obtained.
     * @param QPSExtendMax Maximum QPS for Business Expansion Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQPSExtendMax(Long QPSExtendMax) {
        this.QPSExtendMax = QPSExtendMax;
    }

    /**
     * Get Maximum QPS for Overseas Business Expansion Package

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QPSExtendIntlMax Maximum QPS for Overseas Business Expansion Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getQPSExtendIntlMax() {
        return this.QPSExtendIntlMax;
    }

    /**
     * Set Maximum QPS for Overseas Business Expansion Package

Note: This field may return null, indicating that no valid values can be obtained.
     * @param QPSExtendIntlMax Maximum QPS for Overseas Business Expansion Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQPSExtendIntlMax(Long QPSExtendIntlMax) {
        this.QPSExtendIntlMax = QPSExtendIntlMax;
    }

    public QpsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QpsData(QpsData source) {
        if (source.ElasticBillingDefault != null) {
            this.ElasticBillingDefault = new Long(source.ElasticBillingDefault);
        }
        if (source.ElasticBillingMin != null) {
            this.ElasticBillingMin = new Long(source.ElasticBillingMin);
        }
        if (source.ElasticBillingMax != null) {
            this.ElasticBillingMax = new Long(source.ElasticBillingMax);
        }
        if (source.QPSExtendMax != null) {
            this.QPSExtendMax = new Long(source.QPSExtendMax);
        }
        if (source.QPSExtendIntlMax != null) {
            this.QPSExtendIntlMax = new Long(source.QPSExtendIntlMax);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ElasticBillingDefault", this.ElasticBillingDefault);
        this.setParamSimple(map, prefix + "ElasticBillingMin", this.ElasticBillingMin);
        this.setParamSimple(map, prefix + "ElasticBillingMax", this.ElasticBillingMax);
        this.setParamSimple(map, prefix + "QPSExtendMax", this.QPSExtendMax);
        this.setParamSimple(map, prefix + "QPSExtendIntlMax", this.QPSExtendIntlMax);

    }
}

