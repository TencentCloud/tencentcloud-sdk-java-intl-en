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

public class UsagePlanInfo extends AbstractModel {

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
    * Number of initialization calls.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InitQuota")
    @Expose
    private Long InitQuota;

    /**
    * Limit of requests per second.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxRequestNumPreSec")
    @Expose
    private Long MaxRequestNumPreSec;

    /**
    * Maximum number of calls.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxRequestNum")
    @Expose
    private Long MaxRequestNum;

    /**
    * Whether to hide.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsHide")
    @Expose
    private Long IsHide;

    /**
    * Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * Number of bound keys.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindSecretIdTotalCount")
    @Expose
    private Long BindSecretIdTotalCount;

    /**
    * Details of bound keys.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindSecretIds")
    @Expose
    private String [] BindSecretIds;

    /**
    * Number of bound environments.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindEnvironmentTotalCount")
    @Expose
    private Long BindEnvironmentTotalCount;

    /**
    * Details of bound environments.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindEnvironments")
    @Expose
    private UsagePlanBindEnvironment [] BindEnvironments;

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
     * Get Number of initialization calls.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InitQuota Number of initialization calls.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getInitQuota() {
        return this.InitQuota;
    }

    /**
     * Set Number of initialization calls.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InitQuota Number of initialization calls.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInitQuota(Long InitQuota) {
        this.InitQuota = InitQuota;
    }

    /**
     * Get Limit of requests per second.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxRequestNumPreSec Limit of requests per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxRequestNumPreSec() {
        return this.MaxRequestNumPreSec;
    }

    /**
     * Set Limit of requests per second.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxRequestNumPreSec Limit of requests per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxRequestNumPreSec(Long MaxRequestNumPreSec) {
        this.MaxRequestNumPreSec = MaxRequestNumPreSec;
    }

    /**
     * Get Maximum number of calls.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxRequestNum Maximum number of calls.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxRequestNum() {
        return this.MaxRequestNum;
    }

    /**
     * Set Maximum number of calls.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxRequestNum Maximum number of calls.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxRequestNum(Long MaxRequestNum) {
        this.MaxRequestNum = MaxRequestNum;
    }

    /**
     * Get Whether to hide.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsHide Whether to hide.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsHide() {
        return this.IsHide;
    }

    /**
     * Set Whether to hide.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsHide Whether to hide.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsHide(Long IsHide) {
        this.IsHide = IsHide;
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
     * Get Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ModifiedTime Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ModifiedTime Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Number of bound keys.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BindSecretIdTotalCount Number of bound keys.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBindSecretIdTotalCount() {
        return this.BindSecretIdTotalCount;
    }

    /**
     * Set Number of bound keys.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BindSecretIdTotalCount Number of bound keys.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBindSecretIdTotalCount(Long BindSecretIdTotalCount) {
        this.BindSecretIdTotalCount = BindSecretIdTotalCount;
    }

    /**
     * Get Details of bound keys.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BindSecretIds Details of bound keys.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBindSecretIds() {
        return this.BindSecretIds;
    }

    /**
     * Set Details of bound keys.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BindSecretIds Details of bound keys.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBindSecretIds(String [] BindSecretIds) {
        this.BindSecretIds = BindSecretIds;
    }

    /**
     * Get Number of bound environments.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BindEnvironmentTotalCount Number of bound environments.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBindEnvironmentTotalCount() {
        return this.BindEnvironmentTotalCount;
    }

    /**
     * Set Number of bound environments.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BindEnvironmentTotalCount Number of bound environments.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBindEnvironmentTotalCount(Long BindEnvironmentTotalCount) {
        this.BindEnvironmentTotalCount = BindEnvironmentTotalCount;
    }

    /**
     * Get Details of bound environments.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BindEnvironments Details of bound environments.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public UsagePlanBindEnvironment [] getBindEnvironments() {
        return this.BindEnvironments;
    }

    /**
     * Set Details of bound environments.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BindEnvironments Details of bound environments.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBindEnvironments(UsagePlanBindEnvironment [] BindEnvironments) {
        this.BindEnvironments = BindEnvironments;
    }

    public UsagePlanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsagePlanInfo(UsagePlanInfo source) {
        if (source.UsagePlanId != null) {
            this.UsagePlanId = new String(source.UsagePlanId);
        }
        if (source.UsagePlanName != null) {
            this.UsagePlanName = new String(source.UsagePlanName);
        }
        if (source.UsagePlanDesc != null) {
            this.UsagePlanDesc = new String(source.UsagePlanDesc);
        }
        if (source.InitQuota != null) {
            this.InitQuota = new Long(source.InitQuota);
        }
        if (source.MaxRequestNumPreSec != null) {
            this.MaxRequestNumPreSec = new Long(source.MaxRequestNumPreSec);
        }
        if (source.MaxRequestNum != null) {
            this.MaxRequestNum = new Long(source.MaxRequestNum);
        }
        if (source.IsHide != null) {
            this.IsHide = new Long(source.IsHide);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.BindSecretIdTotalCount != null) {
            this.BindSecretIdTotalCount = new Long(source.BindSecretIdTotalCount);
        }
        if (source.BindSecretIds != null) {
            this.BindSecretIds = new String[source.BindSecretIds.length];
            for (int i = 0; i < source.BindSecretIds.length; i++) {
                this.BindSecretIds[i] = new String(source.BindSecretIds[i]);
            }
        }
        if (source.BindEnvironmentTotalCount != null) {
            this.BindEnvironmentTotalCount = new Long(source.BindEnvironmentTotalCount);
        }
        if (source.BindEnvironments != null) {
            this.BindEnvironments = new UsagePlanBindEnvironment[source.BindEnvironments.length];
            for (int i = 0; i < source.BindEnvironments.length; i++) {
                this.BindEnvironments[i] = new UsagePlanBindEnvironment(source.BindEnvironments[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsagePlanId", this.UsagePlanId);
        this.setParamSimple(map, prefix + "UsagePlanName", this.UsagePlanName);
        this.setParamSimple(map, prefix + "UsagePlanDesc", this.UsagePlanDesc);
        this.setParamSimple(map, prefix + "InitQuota", this.InitQuota);
        this.setParamSimple(map, prefix + "MaxRequestNumPreSec", this.MaxRequestNumPreSec);
        this.setParamSimple(map, prefix + "MaxRequestNum", this.MaxRequestNum);
        this.setParamSimple(map, prefix + "IsHide", this.IsHide);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "BindSecretIdTotalCount", this.BindSecretIdTotalCount);
        this.setParamArraySimple(map, prefix + "BindSecretIds.", this.BindSecretIds);
        this.setParamSimple(map, prefix + "BindEnvironmentTotalCount", this.BindEnvironmentTotalCount);
        this.setParamArrayObj(map, prefix + "BindEnvironments.", this.BindEnvironments);

    }
}

