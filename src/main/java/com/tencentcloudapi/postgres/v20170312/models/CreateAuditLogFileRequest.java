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

public class CreateAuditLogFileRequest extends AbstractModel {

    /**
    * <p>Instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Start time</p><p>Parameter format: 2026-03-25 00:00:00</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time</p><p>Parameter format: 2026-03-25 01:00:00</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Product name</p><p>Input parameter limit: postgres</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>Filter criteria</p>
    */
    @SerializedName("Filter")
    @Expose
    private AuditLogFilter Filter;

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
     * Get <p>Start time</p><p>Parameter format: 2026-03-25 00:00:00</p> 
     * @return StartTime <p>Start time</p><p>Parameter format: 2026-03-25 00:00:00</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time</p><p>Parameter format: 2026-03-25 00:00:00</p>
     * @param StartTime <p>Start time</p><p>Parameter format: 2026-03-25 00:00:00</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time</p><p>Parameter format: 2026-03-25 01:00:00</p> 
     * @return EndTime <p>End time</p><p>Parameter format: 2026-03-25 01:00:00</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time</p><p>Parameter format: 2026-03-25 01:00:00</p>
     * @param EndTime <p>End time</p><p>Parameter format: 2026-03-25 01:00:00</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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

    /**
     * Get <p>Filter criteria</p> 
     * @return Filter <p>Filter criteria</p>
     */
    public AuditLogFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>Filter criteria</p>
     * @param Filter <p>Filter criteria</p>
     */
    public void setFilter(AuditLogFilter Filter) {
        this.Filter = Filter;
    }

    public CreateAuditLogFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuditLogFileRequest(CreateAuditLogFileRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Filter != null) {
            this.Filter = new AuditLogFilter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

