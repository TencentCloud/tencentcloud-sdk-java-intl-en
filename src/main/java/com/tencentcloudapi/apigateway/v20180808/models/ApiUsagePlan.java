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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiUsagePlan extends AbstractModel{

    /**
    * Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Unique API ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * API path.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API method.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Unique usage plan ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsagePlanId")
    @Expose
    private String UsagePlanId;

    /**
    * Usage plan name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsagePlanName")
    @Expose
    private String UsagePlanName;

    /**
    * Usage plan description.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsagePlanDesc")
    @Expose
    private String UsagePlanDesc;

    /**
    * Service environment bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * Used quota.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InUseRequestNum")
    @Expose
    private Long InUseRequestNum;

    /**
    * Total number of requests allowed. `-1` indicates no limit.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxRequestNum")
    @Expose
    private Long MaxRequestNum;

    /**
    * Request QPS upper limit. `-1` indicates no limit.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxRequestNumPreSec")
    @Expose
    private Long MaxRequestNumPreSec;

    /**
    * Usage plan creation time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Last modified time of usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * Service name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
     * Get Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceId Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceId Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Unique API ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiId Unique API ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set Unique API ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiId Unique API ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiName API name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiName API name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get API path.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Path API path.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API path.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Path API path.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API method.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Method API method.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API method.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Method API method.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Unique usage plan ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UsagePlanId Unique usage plan ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUsagePlanId() {
        return this.UsagePlanId;
    }

    /**
     * Set Unique usage plan ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UsagePlanId Unique usage plan ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUsagePlanId(String UsagePlanId) {
        this.UsagePlanId = UsagePlanId;
    }

    /**
     * Get Usage plan name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UsagePlanName Usage plan name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUsagePlanName() {
        return this.UsagePlanName;
    }

    /**
     * Set Usage plan name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UsagePlanName Usage plan name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUsagePlanName(String UsagePlanName) {
        this.UsagePlanName = UsagePlanName;
    }

    /**
     * Get Usage plan description.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UsagePlanDesc Usage plan description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUsagePlanDesc() {
        return this.UsagePlanDesc;
    }

    /**
     * Set Usage plan description.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UsagePlanDesc Usage plan description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUsagePlanDesc(String UsagePlanDesc) {
        this.UsagePlanDesc = UsagePlanDesc;
    }

    /**
     * Get Service environment bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Environment Service environment bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Service environment bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Environment Service environment bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get Used quota.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InUseRequestNum Used quota.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getInUseRequestNum() {
        return this.InUseRequestNum;
    }

    /**
     * Set Used quota.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InUseRequestNum Used quota.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInUseRequestNum(Long InUseRequestNum) {
        this.InUseRequestNum = InUseRequestNum;
    }

    /**
     * Get Total number of requests allowed. `-1` indicates no limit.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxRequestNum Total number of requests allowed. `-1` indicates no limit.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxRequestNum() {
        return this.MaxRequestNum;
    }

    /**
     * Set Total number of requests allowed. `-1` indicates no limit.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxRequestNum Total number of requests allowed. `-1` indicates no limit.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxRequestNum(Long MaxRequestNum) {
        this.MaxRequestNum = MaxRequestNum;
    }

    /**
     * Get Request QPS upper limit. `-1` indicates no limit.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxRequestNumPreSec Request QPS upper limit. `-1` indicates no limit.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxRequestNumPreSec() {
        return this.MaxRequestNumPreSec;
    }

    /**
     * Set Request QPS upper limit. `-1` indicates no limit.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxRequestNumPreSec Request QPS upper limit. `-1` indicates no limit.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxRequestNumPreSec(Long MaxRequestNumPreSec) {
        this.MaxRequestNumPreSec = MaxRequestNumPreSec;
    }

    /**
     * Get Usage plan creation time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Usage plan creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Usage plan creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Usage plan creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Last modified time of usage plan.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ModifiedTime Last modified time of usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Last modified time of usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ModifiedTime Last modified time of usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Service name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceName Service name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceName Service name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public ApiUsagePlan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiUsagePlan(ApiUsagePlan source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.UsagePlanId != null) {
            this.UsagePlanId = new String(source.UsagePlanId);
        }
        if (source.UsagePlanName != null) {
            this.UsagePlanName = new String(source.UsagePlanName);
        }
        if (source.UsagePlanDesc != null) {
            this.UsagePlanDesc = new String(source.UsagePlanDesc);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.InUseRequestNum != null) {
            this.InUseRequestNum = new Long(source.InUseRequestNum);
        }
        if (source.MaxRequestNum != null) {
            this.MaxRequestNum = new Long(source.MaxRequestNum);
        }
        if (source.MaxRequestNumPreSec != null) {
            this.MaxRequestNumPreSec = new Long(source.MaxRequestNumPreSec);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "UsagePlanId", this.UsagePlanId);
        this.setParamSimple(map, prefix + "UsagePlanName", this.UsagePlanName);
        this.setParamSimple(map, prefix + "UsagePlanDesc", this.UsagePlanDesc);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "InUseRequestNum", this.InUseRequestNum);
        this.setParamSimple(map, prefix + "MaxRequestNum", this.MaxRequestNum);
        this.setParamSimple(map, prefix + "MaxRequestNumPreSec", this.MaxRequestNumPreSec);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);

    }
}

