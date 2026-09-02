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

public class DspmIdentifyRefComplianceInfo extends AbstractModel {

    /**
    * <p>Identification template ID</p>
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * <p>Recognition template name.</p>
    */
    @SerializedName("ComplianceName")
    @Expose
    private String ComplianceName;

    /**
    * <p>Identification template type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
    */
    @SerializedName("ComplianceType")
    @Expose
    private Long ComplianceType;

    /**
     * Get <p>Identification template ID</p> 
     * @return ComplianceId <p>Identification template ID</p>
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set <p>Identification template ID</p>
     * @param ComplianceId <p>Identification template ID</p>
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get <p>Recognition template name.</p> 
     * @return ComplianceName <p>Recognition template name.</p>
     */
    public String getComplianceName() {
        return this.ComplianceName;
    }

    /**
     * Set <p>Recognition template name.</p>
     * @param ComplianceName <p>Recognition template name.</p>
     */
    public void setComplianceName(String ComplianceName) {
        this.ComplianceName = ComplianceName;
    }

    /**
     * Get <p>Identification template type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul> 
     * @return ComplianceType <p>Identification template type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     */
    public Long getComplianceType() {
        return this.ComplianceType;
    }

    /**
     * Set <p>Identification template type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     * @param ComplianceType <p>Identification template type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     */
    public void setComplianceType(Long ComplianceType) {
        this.ComplianceType = ComplianceType;
    }

    public DspmIdentifyRefComplianceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyRefComplianceInfo(DspmIdentifyRefComplianceInfo source) {
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
        if (source.ComplianceName != null) {
            this.ComplianceName = new String(source.ComplianceName);
        }
        if (source.ComplianceType != null) {
            this.ComplianceType = new Long(source.ComplianceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamSimple(map, prefix + "ComplianceName", this.ComplianceName);
        this.setParamSimple(map, prefix + "ComplianceType", this.ComplianceType);

    }
}

