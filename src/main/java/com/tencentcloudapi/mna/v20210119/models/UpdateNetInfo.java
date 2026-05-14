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

public class UpdateNetInfo extends AbstractModel {

    /**
    * Network type:
Data
1:Wi-Fi
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Enable or disable.
    */
    @SerializedName("DataEnable")
    @Expose
    private Boolean DataEnable;

    /**
    * Uplink speed limit: bit
    */
    @SerializedName("UploadLimit")
    @Expose
    private Long UploadLimit;

    /**
    * Downstream speed limit: bit.
    */
    @SerializedName("DownloadLimit")
    @Expose
    private Long DownloadLimit;

    /**
    * NIC Name
    */
    @SerializedName("NetInfoName")
    @Expose
    private String NetInfoName;

    /**
     * Get Network type:
Data
1:Wi-Fi 
     * @return Type Network type:
Data
1:Wi-Fi
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Network type:
Data
1:Wi-Fi
     * @param Type Network type:
Data
1:Wi-Fi
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Enable or disable. 
     * @return DataEnable Enable or disable.
     */
    public Boolean getDataEnable() {
        return this.DataEnable;
    }

    /**
     * Set Enable or disable.
     * @param DataEnable Enable or disable.
     */
    public void setDataEnable(Boolean DataEnable) {
        this.DataEnable = DataEnable;
    }

    /**
     * Get Uplink speed limit: bit 
     * @return UploadLimit Uplink speed limit: bit
     */
    public Long getUploadLimit() {
        return this.UploadLimit;
    }

    /**
     * Set Uplink speed limit: bit
     * @param UploadLimit Uplink speed limit: bit
     */
    public void setUploadLimit(Long UploadLimit) {
        this.UploadLimit = UploadLimit;
    }

    /**
     * Get Downstream speed limit: bit. 
     * @return DownloadLimit Downstream speed limit: bit.
     */
    public Long getDownloadLimit() {
        return this.DownloadLimit;
    }

    /**
     * Set Downstream speed limit: bit.
     * @param DownloadLimit Downstream speed limit: bit.
     */
    public void setDownloadLimit(Long DownloadLimit) {
        this.DownloadLimit = DownloadLimit;
    }

    /**
     * Get NIC Name 
     * @return NetInfoName NIC Name
     */
    public String getNetInfoName() {
        return this.NetInfoName;
    }

    /**
     * Set NIC Name
     * @param NetInfoName NIC Name
     */
    public void setNetInfoName(String NetInfoName) {
        this.NetInfoName = NetInfoName;
    }

    public UpdateNetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateNetInfo(UpdateNetInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.DataEnable != null) {
            this.DataEnable = new Boolean(source.DataEnable);
        }
        if (source.UploadLimit != null) {
            this.UploadLimit = new Long(source.UploadLimit);
        }
        if (source.DownloadLimit != null) {
            this.DownloadLimit = new Long(source.DownloadLimit);
        }
        if (source.NetInfoName != null) {
            this.NetInfoName = new String(source.NetInfoName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DataEnable", this.DataEnable);
        this.setParamSimple(map, prefix + "UploadLimit", this.UploadLimit);
        this.setParamSimple(map, prefix + "DownloadLimit", this.DownloadLimit);
        this.setParamSimple(map, prefix + "NetInfoName", this.NetInfoName);

    }
}

