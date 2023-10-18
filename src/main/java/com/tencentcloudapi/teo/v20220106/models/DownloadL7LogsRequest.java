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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadL7LogsRequest extends AbstractModel {

    /**
    * Start time. It must conform to the RFC3339 standard.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time. It must conform to the RFC3339 standard.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Number of entries per page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Current page
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * Array of site names
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Array of subdomain names
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
     * Get Start time. It must conform to the RFC3339 standard. 
     * @return StartTime Start time. It must conform to the RFC3339 standard.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. It must conform to the RFC3339 standard.
     * @param StartTime Start time. It must conform to the RFC3339 standard.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. It must conform to the RFC3339 standard. 
     * @return EndTime End time. It must conform to the RFC3339 standard.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. It must conform to the RFC3339 standard.
     * @param EndTime End time. It must conform to the RFC3339 standard.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of entries per page 
     * @return PageSize Number of entries per page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page
     * @param PageSize Number of entries per page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Current page 
     * @return PageNo Current page
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set Current page
     * @param PageNo Current page
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get Array of site names 
     * @return Zones Array of site names
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Array of site names
     * @param Zones Array of site names
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Array of subdomain names 
     * @return Domains Array of subdomain names
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Array of subdomain names
     * @param Domains Array of subdomain names
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    public DownloadL7LogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadL7LogsRequest(DownloadL7LogsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);

    }
}

