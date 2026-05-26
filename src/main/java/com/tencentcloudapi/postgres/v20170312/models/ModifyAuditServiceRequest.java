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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAuditServiceRequest extends AbstractModel {

    /**
    * <p>Instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Log retention duration (days)</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li><li>90: 90 days</li><li>180: 180 days</li><li>365: 365 days</li><li>1095: 1095 days</li><li>1825: 1825 days</li></ul>
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * <p>High-frequency storage duration (days)</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li><li>90: 90 days</li><li>180: 180 days</li><li>365: 365 days</li><li>1095: 1095 days</li><li>1825: 1825 days</li></ul>
    */
    @SerializedName("HotLogExpireDay")
    @Expose
    private Long HotLogExpireDay;

    /**
    * <p>Audit type</p><p>Enumeration value:</p><ul><li>complex: Granular audit. The audit log is more comprehensive, including object types and objects. Once enabled, it has a certain impact on performance.</li><li>simple: Fast Audit. The audit log covers most fields. When enabled, it has a smaller impact on performance.</li></ul>
    */
    @SerializedName("AuditType")
    @Expose
    private String AuditType;

    /**
    * <p>Product name</p><p>Input parameter limit: postgres</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get <p>Instance ID</p> 
     * @return InstanceId <p>Instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID</p>
     * @param InstanceId <p>Instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Log retention duration (days)</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li><li>90: 90 days</li><li>180: 180 days</li><li>365: 365 days</li><li>1095: 1095 days</li><li>1825: 1825 days</li></ul> 
     * @return LogExpireDay <p>Log retention duration (days)</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li><li>90: 90 days</li><li>180: 180 days</li><li>365: 365 days</li><li>1095: 1095 days</li><li>1825: 1825 days</li></ul>
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set <p>Log retention duration (days)</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li><li>90: 90 days</li><li>180: 180 days</li><li>365: 365 days</li><li>1095: 1095 days</li><li>1825: 1825 days</li></ul>
     * @param LogExpireDay <p>Log retention duration (days)</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li><li>90: 90 days</li><li>180: 180 days</li><li>365: 365 days</li><li>1095: 1095 days</li><li>1825: 1825 days</li></ul>
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get <p>High-frequency storage duration (days)</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li><li>90: 90 days</li><li>180: 180 days</li><li>365: 365 days</li><li>1095: 1095 days</li><li>1825: 1825 days</li></ul> 
     * @return HotLogExpireDay <p>High-frequency storage duration (days)</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li><li>90: 90 days</li><li>180: 180 days</li><li>365: 365 days</li><li>1095: 1095 days</li><li>1825: 1825 days</li></ul>
     */
    public Long getHotLogExpireDay() {
        return this.HotLogExpireDay;
    }

    /**
     * Set <p>High-frequency storage duration (days)</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li><li>90: 90 days</li><li>180: 180 days</li><li>365: 365 days</li><li>1095: 1095 days</li><li>1825: 1825 days</li></ul>
     * @param HotLogExpireDay <p>High-frequency storage duration (days)</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li><li>90: 90 days</li><li>180: 180 days</li><li>365: 365 days</li><li>1095: 1095 days</li><li>1825: 1825 days</li></ul>
     */
    public void setHotLogExpireDay(Long HotLogExpireDay) {
        this.HotLogExpireDay = HotLogExpireDay;
    }

    /**
     * Get <p>Audit type</p><p>Enumeration value:</p><ul><li>complex: Granular audit. The audit log is more comprehensive, including object types and objects. Once enabled, it has a certain impact on performance.</li><li>simple: Fast Audit. The audit log covers most fields. When enabled, it has a smaller impact on performance.</li></ul> 
     * @return AuditType <p>Audit type</p><p>Enumeration value:</p><ul><li>complex: Granular audit. The audit log is more comprehensive, including object types and objects. Once enabled, it has a certain impact on performance.</li><li>simple: Fast Audit. The audit log covers most fields. When enabled, it has a smaller impact on performance.</li></ul>
     */
    public String getAuditType() {
        return this.AuditType;
    }

    /**
     * Set <p>Audit type</p><p>Enumeration value:</p><ul><li>complex: Granular audit. The audit log is more comprehensive, including object types and objects. Once enabled, it has a certain impact on performance.</li><li>simple: Fast Audit. The audit log covers most fields. When enabled, it has a smaller impact on performance.</li></ul>
     * @param AuditType <p>Audit type</p><p>Enumeration value:</p><ul><li>complex: Granular audit. The audit log is more comprehensive, including object types and objects. Once enabled, it has a certain impact on performance.</li><li>simple: Fast Audit. The audit log covers most fields. When enabled, it has a smaller impact on performance.</li></ul>
     */
    public void setAuditType(String AuditType) {
        this.AuditType = AuditType;
    }

    /**
     * Get <p>Product name</p><p>Input parameter limit: postgres</p> 
     * @return Product <p>Product name</p><p>Input parameter limit: postgres</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>Product name</p><p>Input parameter limit: postgres</p>
     * @param Product <p>Product name</p><p>Input parameter limit: postgres</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public ModifyAuditServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAuditServiceRequest(ModifyAuditServiceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HotLogExpireDay != null) {
            this.HotLogExpireDay = new Long(source.HotLogExpireDay);
        }
        if (source.AuditType != null) {
            this.AuditType = new String(source.AuditType);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HotLogExpireDay", this.HotLogExpireDay);
        this.setParamSimple(map, prefix + "AuditType", this.AuditType);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

