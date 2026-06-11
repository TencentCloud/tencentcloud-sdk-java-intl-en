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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CanFixVulInfo extends AbstractModel {

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Information on hosts where this vulnerability can be fixed
    */
    @SerializedName("HostList")
    @Expose
    private VulInfoHostInfo [] HostList;

    /**
    * Fixing prompt tag
    */
    @SerializedName("FixTag")
    @Expose
    private String [] FixTag;

    /**
    * Vulnerability category. 1: web CMS vulnerability, 2: application vulnerability, 4: Linux software vulnerability, 5 Windows system vulnerability.
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
     * Get Vulnerability ID 
     * @return VulId Vulnerability ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
     * @param VulId Vulnerability ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Vulnerability name 
     * @return VulName Vulnerability name
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
     * @param VulName Vulnerability name
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Information on hosts where this vulnerability can be fixed 
     * @return HostList Information on hosts where this vulnerability can be fixed
     */
    public VulInfoHostInfo [] getHostList() {
        return this.HostList;
    }

    /**
     * Set Information on hosts where this vulnerability can be fixed
     * @param HostList Information on hosts where this vulnerability can be fixed
     */
    public void setHostList(VulInfoHostInfo [] HostList) {
        this.HostList = HostList;
    }

    /**
     * Get Fixing prompt tag 
     * @return FixTag Fixing prompt tag
     */
    public String [] getFixTag() {
        return this.FixTag;
    }

    /**
     * Set Fixing prompt tag
     * @param FixTag Fixing prompt tag
     */
    public void setFixTag(String [] FixTag) {
        this.FixTag = FixTag;
    }

    /**
     * Get Vulnerability category. 1: web CMS vulnerability, 2: application vulnerability, 4: Linux software vulnerability, 5 Windows system vulnerability. 
     * @return VulCategory Vulnerability category. 1: web CMS vulnerability, 2: application vulnerability, 4: Linux software vulnerability, 5 Windows system vulnerability.
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set Vulnerability category. 1: web CMS vulnerability, 2: application vulnerability, 4: Linux software vulnerability, 5 Windows system vulnerability.
     * @param VulCategory Vulnerability category. 1: web CMS vulnerability, 2: application vulnerability, 4: Linux software vulnerability, 5 Windows system vulnerability.
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    public CanFixVulInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CanFixVulInfo(CanFixVulInfo source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.HostList != null) {
            this.HostList = new VulInfoHostInfo[source.HostList.length];
            for (int i = 0; i < source.HostList.length; i++) {
                this.HostList[i] = new VulInfoHostInfo(source.HostList[i]);
            }
        }
        if (source.FixTag != null) {
            this.FixTag = new String[source.FixTag.length];
            for (int i = 0; i < source.FixTag.length; i++) {
                this.FixTag[i] = new String(source.FixTag[i]);
            }
        }
        if (source.VulCategory != null) {
            this.VulCategory = new Long(source.VulCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamArrayObj(map, prefix + "HostList.", this.HostList);
        this.setParamArraySimple(map, prefix + "FixTag.", this.FixTag);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);

    }
}

