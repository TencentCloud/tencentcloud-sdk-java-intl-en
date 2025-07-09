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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDevicesRequest extends AbstractModel {

    /**
    * ID of the product whose devices are queried
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * Offset, which starts from 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page size. Value range: 10-250
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Device firmware version. If no value is passed in, devices of all firmware versions are returned. If `None-FirmwareVersion` is passed in, devices without version numbers are returned.
    */
    @SerializedName("FirmwareVersion")
    @Expose
    private String FirmwareVersion;

    /**
    * Device name to query
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Whether to query enabled or disabled devices. `0`: disabled devices; `1`: enabled devices. By default, both enabled and disabled devices are queried.
    */
    @SerializedName("EnableState")
    @Expose
    private Long EnableState;

    /**
     * Get ID of the product whose devices are queried 
     * @return ProductId ID of the product whose devices are queried
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set ID of the product whose devices are queried
     * @param ProductId ID of the product whose devices are queried
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Offset, which starts from 0 
     * @return Offset Offset, which starts from 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which starts from 0
     * @param Offset Offset, which starts from 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page size. Value range: 10-250 
     * @return Limit Page size. Value range: 10-250
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page size. Value range: 10-250
     * @param Limit Page size. Value range: 10-250
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Device firmware version. If no value is passed in, devices of all firmware versions are returned. If `None-FirmwareVersion` is passed in, devices without version numbers are returned. 
     * @return FirmwareVersion Device firmware version. If no value is passed in, devices of all firmware versions are returned. If `None-FirmwareVersion` is passed in, devices without version numbers are returned.
     */
    public String getFirmwareVersion() {
        return this.FirmwareVersion;
    }

    /**
     * Set Device firmware version. If no value is passed in, devices of all firmware versions are returned. If `None-FirmwareVersion` is passed in, devices without version numbers are returned.
     * @param FirmwareVersion Device firmware version. If no value is passed in, devices of all firmware versions are returned. If `None-FirmwareVersion` is passed in, devices without version numbers are returned.
     */
    public void setFirmwareVersion(String FirmwareVersion) {
        this.FirmwareVersion = FirmwareVersion;
    }

    /**
     * Get Device name to query 
     * @return DeviceName Device name to query
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name to query
     * @param DeviceName Device name to query
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Whether to query enabled or disabled devices. `0`: disabled devices; `1`: enabled devices. By default, both enabled and disabled devices are queried. 
     * @return EnableState Whether to query enabled or disabled devices. `0`: disabled devices; `1`: enabled devices. By default, both enabled and disabled devices are queried.
     */
    public Long getEnableState() {
        return this.EnableState;
    }

    /**
     * Set Whether to query enabled or disabled devices. `0`: disabled devices; `1`: enabled devices. By default, both enabled and disabled devices are queried.
     * @param EnableState Whether to query enabled or disabled devices. `0`: disabled devices; `1`: enabled devices. By default, both enabled and disabled devices are queried.
     */
    public void setEnableState(Long EnableState) {
        this.EnableState = EnableState;
    }

    public DescribeDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDevicesRequest(DescribeDevicesRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FirmwareVersion != null) {
            this.FirmwareVersion = new String(source.FirmwareVersion);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.EnableState != null) {
            this.EnableState = new Long(source.EnableState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FirmwareVersion", this.FirmwareVersion);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "EnableState", this.EnableState);

    }
}

