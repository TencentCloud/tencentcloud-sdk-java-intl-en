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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEdrAlertExportJobRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>PolicyType - int - required: no - policy typePolicyName - string - required: no - Policy NameDomain - string - required: no - Domain name (URL-encode the Domain name first, then base64-encode it)PolicyAction - int - required: no - policy actionIsEnabled - int - required: no - whether it takes effect</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilter [] Filters;

    /**
    * <p>Limit entries. Default: 10. Maximum: 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting method: [ASC: Ascending | DESC: Descending]</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Optional sorting column: [LatestDetectTime]</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * <p>Custom task name, allowing duplicates. If empty, a default name alert_{appid}_{timestamp} will be automatically generated (for example, alert_1234567890_20260501114522). It supports only numbers, letters, underscores, hyphens, and Chinese, up to 100 characters (counted by character/rune, with each Chinese character counted as 1). If validation fails, InvalidParameter will be returned (copywriting: TextEdrExportJobNameInvalid).</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>PolicyType - int - required: no - policy typePolicyName - string - required: no - Policy NameDomain - string - required: no - Domain name (URL-encode the Domain name first, then base64-encode it)PolicyAction - int - required: no - policy actionIsEnabled - int - required: no - whether it takes effect</p> 
     * @return Filters <p>PolicyType - int - required: no - policy typePolicyName - string - required: no - Policy NameDomain - string - required: no - Domain name (URL-encode the Domain name first, then base64-encode it)PolicyAction - int - required: no - policy actionIsEnabled - int - required: no - whether it takes effect</p>
     */
    public EDRFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>PolicyType - int - required: no - policy typePolicyName - string - required: no - Policy NameDomain - string - required: no - Domain name (URL-encode the Domain name first, then base64-encode it)PolicyAction - int - required: no - policy actionIsEnabled - int - required: no - whether it takes effect</p>
     * @param Filters <p>PolicyType - int - required: no - policy typePolicyName - string - required: no - Policy NameDomain - string - required: no - Domain name (URL-encode the Domain name first, then base64-encode it)PolicyAction - int - required: no - policy actionIsEnabled - int - required: no - whether it takes effect</p>
     */
    public void setFilters(EDRFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Limit entries. Default: 10. Maximum: 100</p> 
     * @return Limit <p>Limit entries. Default: 10. Maximum: 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Limit entries. Default: 10. Maximum: 100</p>
     * @param Limit <p>Limit entries. Default: 10. Maximum: 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset. Default value: 0.</p> 
     * @return Offset <p>Offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value: 0.</p>
     * @param Offset <p>Offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting method: [ASC: Ascending | DESC: Descending]</p> 
     * @return Order <p>Sorting method: [ASC: Ascending | DESC: Descending]</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting method: [ASC: Ascending | DESC: Descending]</p>
     * @param Order <p>Sorting method: [ASC: Ascending | DESC: Descending]</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Optional sorting column: [LatestDetectTime]</p> 
     * @return By <p>Optional sorting column: [LatestDetectTime]</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Optional sorting column: [LatestDetectTime]</p>
     * @param By <p>Optional sorting column: [LatestDetectTime]</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get <p>Custom task name, allowing duplicates. If empty, a default name alert_{appid}_{timestamp} will be automatically generated (for example, alert_1234567890_20260501114522). It supports only numbers, letters, underscores, hyphens, and Chinese, up to 100 characters (counted by character/rune, with each Chinese character counted as 1). If validation fails, InvalidParameter will be returned (copywriting: TextEdrExportJobNameInvalid).</p> 
     * @return JobName <p>Custom task name, allowing duplicates. If empty, a default name alert_{appid}_{timestamp} will be automatically generated (for example, alert_1234567890_20260501114522). It supports only numbers, letters, underscores, hyphens, and Chinese, up to 100 characters (counted by character/rune, with each Chinese character counted as 1). If validation fails, InvalidParameter will be returned (copywriting: TextEdrExportJobNameInvalid).</p>
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set <p>Custom task name, allowing duplicates. If empty, a default name alert_{appid}_{timestamp} will be automatically generated (for example, alert_1234567890_20260501114522). It supports only numbers, letters, underscores, hyphens, and Chinese, up to 100 characters (counted by character/rune, with each Chinese character counted as 1). If validation fails, InvalidParameter will be returned (copywriting: TextEdrExportJobNameInvalid).</p>
     * @param JobName <p>Custom task name, allowing duplicates. If empty, a default name alert_{appid}_{timestamp} will be automatically generated (for example, alert_1234567890_20260501114522). It supports only numbers, letters, underscores, hyphens, and Chinese, up to 100 characters (counted by character/rune, with each Chinese character counted as 1). If validation fails, InvalidParameter will be returned (copywriting: TextEdrExportJobNameInvalid).</p>
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    public CreateEdrAlertExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEdrAlertExportJobRequest(CreateEdrAlertExportJobRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "JobName", this.JobName);

    }
}

