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

public class ListRecordPlanDevicesRequest extends AbstractModel {

    /**
    * Cloud migration plan ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Maximum number of items per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Which page.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Query by device name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Query by channel name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes.
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * Query by organization name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes.
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
     * Get Cloud migration plan ID 
     * @return PlanId Cloud migration plan ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Cloud migration plan ID
     * @param PlanId Cloud migration plan ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Maximum number of items per page. 
     * @return PageSize Maximum number of items per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Maximum number of items per page.
     * @param PageSize Maximum number of items per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Which page. 
     * @return PageNumber Which page.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Which page.
     * @param PageNumber Which page.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Query by device name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes. 
     * @return DeviceName Query by device name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Query by device name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes.
     * @param DeviceName Query by device name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Query by channel name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes. 
     * @return ChannelName Query by channel name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes.
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Query by channel name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes.
     * @param ChannelName Query by channel name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes.
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get Query by organization name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes. 
     * @return OrganizationName Query by organization name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes.
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set Query by organization name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes.
     * @param OrganizationName Query by organization name. If it is empty, ignore this parameter.
Only one of the channel name, device name, and organization name is valid at the same time. If multiple fields have values at the same time, query by the priority order of channel name, device name, and organization name. If all are empty, perform a full query. The length cannot exceed 32 bytes.
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    public ListRecordPlanDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRecordPlanDevicesRequest(ListRecordPlanDevicesRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);

    }
}

