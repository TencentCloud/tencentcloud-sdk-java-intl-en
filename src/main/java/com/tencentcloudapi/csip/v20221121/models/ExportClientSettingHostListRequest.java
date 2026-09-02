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

public class ExportClientSettingHostListRequest extends AbstractModel {

    /**
    * <p>Export business type PreventUninstall Uninstall prevention host list export LoginType QR code login host list export ProcessDaemon Process daemon host list export</p>
    */
    @SerializedName("BusiType")
    @Expose
    private String BusiType;

    /**
    * <p>Group account member id.</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Filter parameter</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilters [] Filters;

    /**
     * Get <p>Export business type PreventUninstall Uninstall prevention host list export LoginType QR code login host list export ProcessDaemon Process daemon host list export</p> 
     * @return BusiType <p>Export business type PreventUninstall Uninstall prevention host list export LoginType QR code login host list export ProcessDaemon Process daemon host list export</p>
     */
    public String getBusiType() {
        return this.BusiType;
    }

    /**
     * Set <p>Export business type PreventUninstall Uninstall prevention host list export LoginType QR code login host list export ProcessDaemon Process daemon host list export</p>
     * @param BusiType <p>Export business type PreventUninstall Uninstall prevention host list export LoginType QR code login host list export ProcessDaemon Process daemon host list export</p>
     */
    public void setBusiType(String BusiType) {
        this.BusiType = BusiType;
    }

    /**
     * Get <p>Group account member id.</p> 
     * @return MemberId <p>Group account member id.</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id.</p>
     * @param MemberId <p>Group account member id.</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Filter parameter</p> 
     * @return Filters <p>Filter parameter</p>
     */
    public EDRFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter parameter</p>
     * @param Filters <p>Filter parameter</p>
     */
    public void setFilters(EDRFilters [] Filters) {
        this.Filters = Filters;
    }

    public ExportClientSettingHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportClientSettingHostListRequest(ExportClientSettingHostListRequest source) {
        if (source.BusiType != null) {
            this.BusiType = new String(source.BusiType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusiType", this.BusiType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

