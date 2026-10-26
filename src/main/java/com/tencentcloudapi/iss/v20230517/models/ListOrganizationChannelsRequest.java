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

public class ListOrganizationChannelsRequest extends AbstractModel {

    /**
    * Organization ID
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * Maximum number of items per page
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
    * Query condition. Query by device name.
Only one query condition can take effect at a time. Length not exceeding 32 bytes.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Query condition. Proceed to query by channel name.
Only one query condition can take effect at a time. Length not exceeding 32 bytes.
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
     * Get Organization ID 
     * @return OrganizationId Organization ID
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set Organization ID
     * @param OrganizationId Organization ID
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
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
     * Get Query condition. Query by device name.
Only one query condition can take effect at a time. Length not exceeding 32 bytes. 
     * @return DeviceName Query condition. Query by device name.
Only one query condition can take effect at a time. Length not exceeding 32 bytes.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Query condition. Query by device name.
Only one query condition can take effect at a time. Length not exceeding 32 bytes.
     * @param DeviceName Query condition. Query by device name.
Only one query condition can take effect at a time. Length not exceeding 32 bytes.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Query condition. Proceed to query by channel name.
Only one query condition can take effect at a time. Length not exceeding 32 bytes. 
     * @return ChannelName Query condition. Proceed to query by channel name.
Only one query condition can take effect at a time. Length not exceeding 32 bytes.
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Query condition. Proceed to query by channel name.
Only one query condition can take effect at a time. Length not exceeding 32 bytes.
     * @param ChannelName Query condition. Proceed to query by channel name.
Only one query condition can take effect at a time. Length not exceeding 32 bytes.
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    public ListOrganizationChannelsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOrganizationChannelsRequest(ListOrganizationChannelsRequest source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);

    }
}

