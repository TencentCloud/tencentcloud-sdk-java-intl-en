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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPStrategy extends AbstractModel {

    /**
    * Unique policy ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * Custom policy name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Policy type. Valid values: WHITE (allowlist), BLACK (blocklist).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * IP list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyData")
    @Expose
    private String StrategyData;

    /**
    * Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Modification time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Number of APIs bound to policy.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindApiTotalCount")
    @Expose
    private Long BindApiTotalCount;

    /**
    * Bound API details.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindApis")
    @Expose
    private DesApisStatus [] BindApis;

    /**
     * Get Unique policy ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StrategyId Unique policy ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Unique policy ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StrategyId Unique policy ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Custom policy name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StrategyName Custom policy name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Custom policy name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StrategyName Custom policy name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Policy type. Valid values: WHITE (allowlist), BLACK (blocklist).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StrategyType Policy type. Valid values: WHITE (allowlist), BLACK (blocklist).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set Policy type. Valid values: WHITE (allowlist), BLACK (blocklist).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StrategyType Policy type. Valid values: WHITE (allowlist), BLACK (blocklist).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get IP list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StrategyData IP list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStrategyData() {
        return this.StrategyData;
    }

    /**
     * Set IP list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StrategyData IP list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyData(String StrategyData) {
        this.StrategyData = StrategyData;
    }

    /**
     * Get Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Modification time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ModifiedTime Modification time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Modification time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ModifiedTime Modification time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceId Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceId Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Number of APIs bound to policy.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BindApiTotalCount Number of APIs bound to policy.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBindApiTotalCount() {
        return this.BindApiTotalCount;
    }

    /**
     * Set Number of APIs bound to policy.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BindApiTotalCount Number of APIs bound to policy.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBindApiTotalCount(Long BindApiTotalCount) {
        this.BindApiTotalCount = BindApiTotalCount;
    }

    /**
     * Get Bound API details.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BindApis Bound API details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DesApisStatus [] getBindApis() {
        return this.BindApis;
    }

    /**
     * Set Bound API details.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BindApis Bound API details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBindApis(DesApisStatus [] BindApis) {
        this.BindApis = BindApis;
    }

    public IPStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPStrategy(IPStrategy source) {
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.StrategyData != null) {
            this.StrategyData = new String(source.StrategyData);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.BindApiTotalCount != null) {
            this.BindApiTotalCount = new Long(source.BindApiTotalCount);
        }
        if (source.BindApis != null) {
            this.BindApis = new DesApisStatus[source.BindApis.length];
            for (int i = 0; i < source.BindApis.length; i++) {
                this.BindApis[i] = new DesApisStatus(source.BindApis[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "StrategyData", this.StrategyData);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "BindApiTotalCount", this.BindApiTotalCount);
        this.setParamArrayObj(map, prefix + "BindApis.", this.BindApis);

    }
}

