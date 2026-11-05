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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppAuxiliaryInfo extends AbstractModel {

    /**
    * Appeal information.
    */
    @SerializedName("Appeal")
    @Expose
    private AppAppeal Appeal;

    /**
    * Search for resource status
    */
    @SerializedName("SearchResourceStatus")
    @Expose
    private SearchResourceStatusInfo SearchResourceStatus;

    /**
    * Special status information
    */
    @SerializedName("SpecialStatusInfo")
    @Expose
    private SpecialStatusInfo SpecialStatusInfo;

    /**
    * Sub-status information.
    */
    @SerializedName("SubStatus")
    @Expose
    private AppSubStatusInfo SubStatus;

    /**
     * Get Appeal information. 
     * @return Appeal Appeal information.
     */
    public AppAppeal getAppeal() {
        return this.Appeal;
    }

    /**
     * Set Appeal information.
     * @param Appeal Appeal information.
     */
    public void setAppeal(AppAppeal Appeal) {
        this.Appeal = Appeal;
    }

    /**
     * Get Search for resource status 
     * @return SearchResourceStatus Search for resource status
     */
    public SearchResourceStatusInfo getSearchResourceStatus() {
        return this.SearchResourceStatus;
    }

    /**
     * Set Search for resource status
     * @param SearchResourceStatus Search for resource status
     */
    public void setSearchResourceStatus(SearchResourceStatusInfo SearchResourceStatus) {
        this.SearchResourceStatus = SearchResourceStatus;
    }

    /**
     * Get Special status information 
     * @return SpecialStatusInfo Special status information
     */
    public SpecialStatusInfo getSpecialStatusInfo() {
        return this.SpecialStatusInfo;
    }

    /**
     * Set Special status information
     * @param SpecialStatusInfo Special status information
     */
    public void setSpecialStatusInfo(SpecialStatusInfo SpecialStatusInfo) {
        this.SpecialStatusInfo = SpecialStatusInfo;
    }

    /**
     * Get Sub-status information. 
     * @return SubStatus Sub-status information.
     */
    public AppSubStatusInfo getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set Sub-status information.
     * @param SubStatus Sub-status information.
     */
    public void setSubStatus(AppSubStatusInfo SubStatus) {
        this.SubStatus = SubStatus;
    }

    public AppAuxiliaryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppAuxiliaryInfo(AppAuxiliaryInfo source) {
        if (source.Appeal != null) {
            this.Appeal = new AppAppeal(source.Appeal);
        }
        if (source.SearchResourceStatus != null) {
            this.SearchResourceStatus = new SearchResourceStatusInfo(source.SearchResourceStatus);
        }
        if (source.SpecialStatusInfo != null) {
            this.SpecialStatusInfo = new SpecialStatusInfo(source.SpecialStatusInfo);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new AppSubStatusInfo(source.SubStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Appeal.", this.Appeal);
        this.setParamObj(map, prefix + "SearchResourceStatus.", this.SearchResourceStatus);
        this.setParamObj(map, prefix + "SpecialStatusInfo.", this.SpecialStatusInfo);
        this.setParamObj(map, prefix + "SubStatus.", this.SubStatus);

    }
}

