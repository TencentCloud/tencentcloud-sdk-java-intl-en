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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDevicesRequest extends AbstractModel {

    /**
    * Display records per page. When both PageSize and PageNumber are -1, match all devices with unlimited entries on one page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Currently viewed page number. When PageSize and PageNumber are both -1, match all devices with unlimited entries on one page.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Search for a device by keyword (ID or device name). Leave it empty to match all devices.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * DeviceType
Leave it blank: Return all devices.
1: Your own equipment;
2: Third-party device
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
     * Get Display records per page. When both PageSize and PageNumber are -1, match all devices with unlimited entries on one page. 
     * @return PageSize Display records per page. When both PageSize and PageNumber are -1, match all devices with unlimited entries on one page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Display records per page. When both PageSize and PageNumber are -1, match all devices with unlimited entries on one page.
     * @param PageSize Display records per page. When both PageSize and PageNumber are -1, match all devices with unlimited entries on one page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Currently viewed page number. When PageSize and PageNumber are both -1, match all devices with unlimited entries on one page. 
     * @return PageNumber Currently viewed page number. When PageSize and PageNumber are both -1, match all devices with unlimited entries on one page.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Currently viewed page number. When PageSize and PageNumber are both -1, match all devices with unlimited entries on one page.
     * @param PageNumber Currently viewed page number. When PageSize and PageNumber are both -1, match all devices with unlimited entries on one page.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Search for a device by keyword (ID or device name). Leave it empty to match all devices. 
     * @return Keyword Search for a device by keyword (ID or device name). Leave it empty to match all devices.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Search for a device by keyword (ID or device name). Leave it empty to match all devices.
     * @param Keyword Search for a device by keyword (ID or device name). Leave it empty to match all devices.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get DeviceType
Leave it blank: Return all devices.
1: Your own equipment;
2: Third-party device 
     * @return DeviceType DeviceType
Leave it blank: Return all devices.
1: Your own equipment;
2: Third-party device
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set DeviceType
Leave it blank: Return all devices.
1: Your own equipment;
2: Third-party device
     * @param DeviceType DeviceType
Leave it blank: Return all devices.
1: Your own equipment;
2: Third-party device
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    public GetDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDevicesRequest(GetDevicesRequest source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

