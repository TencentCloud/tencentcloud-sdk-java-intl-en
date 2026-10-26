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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListRecordBackupPlanDevicesRequest extends AbstractModel {

    /**
    * Recording schedule ID (obtain from the ListRecordBackupPlans API for querying the recording cloud migration plan list)
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Query by device name (if empty, this parameter is not used for reference)
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Query by channel name (if empty, ignore this parameter)
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * Query by organization name (if empty, this parameter is not used for reference)
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * Maximum number of items per page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Page number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get Recording schedule ID (obtain from the ListRecordBackupPlans API for querying the recording cloud migration plan list) 
     * @return PlanId Recording schedule ID (obtain from the ListRecordBackupPlans API for querying the recording cloud migration plan list)
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Recording schedule ID (obtain from the ListRecordBackupPlans API for querying the recording cloud migration plan list)
     * @param PlanId Recording schedule ID (obtain from the ListRecordBackupPlans API for querying the recording cloud migration plan list)
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Query by device name (if empty, this parameter is not used for reference) 
     * @return DeviceName Query by device name (if empty, this parameter is not used for reference)
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Query by device name (if empty, this parameter is not used for reference)
     * @param DeviceName Query by device name (if empty, this parameter is not used for reference)
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Query by channel name (if empty, ignore this parameter) 
     * @return ChannelName Query by channel name (if empty, ignore this parameter)
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Query by channel name (if empty, ignore this parameter)
     * @param ChannelName Query by channel name (if empty, ignore this parameter)
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get Query by organization name (if empty, this parameter is not used for reference) 
     * @return OrganizationName Query by organization name (if empty, this parameter is not used for reference)
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set Query by organization name (if empty, this parameter is not used for reference)
     * @param OrganizationName Query by organization name (if empty, this parameter is not used for reference)
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get Maximum number of items per page 
     * @return PageSize Maximum number of items per page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Maximum number of items per page
     * @param PageSize Maximum number of items per page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Page number 
     * @return PageNumber Page number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number
     * @param PageNumber Page number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public ListRecordBackupPlanDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRecordBackupPlanDevicesRequest(ListRecordBackupPlanDevicesRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

