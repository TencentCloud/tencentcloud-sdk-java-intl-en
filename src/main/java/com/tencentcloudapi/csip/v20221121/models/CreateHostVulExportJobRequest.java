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

public class CreateHostVulExportJobRequest extends AbstractModel {

    /**
    * <p>Exported action</p><p>Enumeration value:</p><ul><li>LinuxHostVulRiskList: linux vulnerability risk list</li><li>WebCmsHostVulRiskList: WebCms vulnerability risk list</li><li>AppHostVulRiskList: App vulnerability risk list</li><li>EmergencyHostVulRiskList: Emergency vulnerability risk list</li><li>KBRiskList: Windows kb risk list</li><li>RelateHostList: Associated host list</li><li>WhiteList: Vulnerability allowlist</li></ul>
    */
    @SerializedName("BusinessAction")
    @Expose
    private String BusinessAction;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Filter conditions array, multi-condition with each other is AND relationship<br>Supported Filter.Name:<br>KbID: KB risk associated server in the current situation needs to add KB Risk ID<br>VulID: Vulnerability risk associated server in the current situation needs to add vul Risk ID</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get <p>Exported action</p><p>Enumeration value:</p><ul><li>LinuxHostVulRiskList: linux vulnerability risk list</li><li>WebCmsHostVulRiskList: WebCms vulnerability risk list</li><li>AppHostVulRiskList: App vulnerability risk list</li><li>EmergencyHostVulRiskList: Emergency vulnerability risk list</li><li>KBRiskList: Windows kb risk list</li><li>RelateHostList: Associated host list</li><li>WhiteList: Vulnerability allowlist</li></ul> 
     * @return BusinessAction <p>Exported action</p><p>Enumeration value:</p><ul><li>LinuxHostVulRiskList: linux vulnerability risk list</li><li>WebCmsHostVulRiskList: WebCms vulnerability risk list</li><li>AppHostVulRiskList: App vulnerability risk list</li><li>EmergencyHostVulRiskList: Emergency vulnerability risk list</li><li>KBRiskList: Windows kb risk list</li><li>RelateHostList: Associated host list</li><li>WhiteList: Vulnerability allowlist</li></ul>
     */
    public String getBusinessAction() {
        return this.BusinessAction;
    }

    /**
     * Set <p>Exported action</p><p>Enumeration value:</p><ul><li>LinuxHostVulRiskList: linux vulnerability risk list</li><li>WebCmsHostVulRiskList: WebCms vulnerability risk list</li><li>AppHostVulRiskList: App vulnerability risk list</li><li>EmergencyHostVulRiskList: Emergency vulnerability risk list</li><li>KBRiskList: Windows kb risk list</li><li>RelateHostList: Associated host list</li><li>WhiteList: Vulnerability allowlist</li></ul>
     * @param BusinessAction <p>Exported action</p><p>Enumeration value:</p><ul><li>LinuxHostVulRiskList: linux vulnerability risk list</li><li>WebCmsHostVulRiskList: WebCms vulnerability risk list</li><li>AppHostVulRiskList: App vulnerability risk list</li><li>EmergencyHostVulRiskList: Emergency vulnerability risk list</li><li>KBRiskList: Windows kb risk list</li><li>RelateHostList: Associated host list</li><li>WhiteList: Vulnerability allowlist</li></ul>
     */
    public void setBusinessAction(String BusinessAction) {
        this.BusinessAction = BusinessAction;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Filter conditions array, multi-condition with each other is AND relationship<br>Supported Filter.Name:<br>KbID: KB risk associated server in the current situation needs to add KB Risk ID<br>VulID: Vulnerability risk associated server in the current situation needs to add vul Risk ID</p> 
     * @return Filters <p>Filter conditions array, multi-condition with each other is AND relationship<br>Supported Filter.Name:<br>KbID: KB risk associated server in the current situation needs to add KB Risk ID<br>VulID: Vulnerability risk associated server in the current situation needs to add vul Risk ID</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter conditions array, multi-condition with each other is AND relationship<br>Supported Filter.Name:<br>KbID: KB risk associated server in the current situation needs to add KB Risk ID<br>VulID: Vulnerability risk associated server in the current situation needs to add vul Risk ID</p>
     * @param Filters <p>Filter conditions array, multi-condition with each other is AND relationship<br>Supported Filter.Name:<br>KbID: KB risk associated server in the current situation needs to add KB Risk ID<br>VulID: Vulnerability risk associated server in the current situation needs to add vul Risk ID</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public CreateHostVulExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHostVulExportJobRequest(CreateHostVulExportJobRequest source) {
        if (source.BusinessAction != null) {
            this.BusinessAction = new String(source.BusinessAction);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessAction", this.BusinessAction);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

