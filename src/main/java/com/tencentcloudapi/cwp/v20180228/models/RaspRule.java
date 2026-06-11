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

public class RaspRule extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Regular expression for a custom request URL range. If this parameter is left blank, saving fails.
    */
    @SerializedName("URLRegexp")
    @Expose
    private String URLRegexp;

    /**
    * Vulnerability ID
    */
    @SerializedName("VulVulsID")
    @Expose
    private Long VulVulsID;

    /**
    * Vulnerability name
    */
    @SerializedName("VulVulsName")
    @Expose
    private String VulVulsName;

    /**
    * cve_id
    */
    @SerializedName("CveID")
    @Expose
    private String CveID;

    /**
    * Vulnerability defense type, which comes from the vulnerability table. 1: component vulnerability defense supported, with component vulnerabilities not allowlisted through a regular expression; 2: regular expression defense supported.
    */
    @SerializedName("SupportDefense")
    @Expose
    private Long SupportDefense;

    /**
    * Allowlisting scope. 0: Allowlist all requests; 1: Allowlist requests within a custom request scope.
    */
    @SerializedName("WhiteType")
    @Expose
    private Long WhiteType;

    /**
    * Status. 0: valid.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Rule ID 
     * @return Id Rule ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
     * @param Id Rule ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Regular expression for a custom request URL range. If this parameter is left blank, saving fails. 
     * @return URLRegexp Regular expression for a custom request URL range. If this parameter is left blank, saving fails.
     */
    public String getURLRegexp() {
        return this.URLRegexp;
    }

    /**
     * Set Regular expression for a custom request URL range. If this parameter is left blank, saving fails.
     * @param URLRegexp Regular expression for a custom request URL range. If this parameter is left blank, saving fails.
     */
    public void setURLRegexp(String URLRegexp) {
        this.URLRegexp = URLRegexp;
    }

    /**
     * Get Vulnerability ID 
     * @return VulVulsID Vulnerability ID
     */
    public Long getVulVulsID() {
        return this.VulVulsID;
    }

    /**
     * Set Vulnerability ID
     * @param VulVulsID Vulnerability ID
     */
    public void setVulVulsID(Long VulVulsID) {
        this.VulVulsID = VulVulsID;
    }

    /**
     * Get Vulnerability name 
     * @return VulVulsName Vulnerability name
     */
    public String getVulVulsName() {
        return this.VulVulsName;
    }

    /**
     * Set Vulnerability name
     * @param VulVulsName Vulnerability name
     */
    public void setVulVulsName(String VulVulsName) {
        this.VulVulsName = VulVulsName;
    }

    /**
     * Get cve_id 
     * @return CveID cve_id
     */
    public String getCveID() {
        return this.CveID;
    }

    /**
     * Set cve_id
     * @param CveID cve_id
     */
    public void setCveID(String CveID) {
        this.CveID = CveID;
    }

    /**
     * Get Vulnerability defense type, which comes from the vulnerability table. 1: component vulnerability defense supported, with component vulnerabilities not allowlisted through a regular expression; 2: regular expression defense supported. 
     * @return SupportDefense Vulnerability defense type, which comes from the vulnerability table. 1: component vulnerability defense supported, with component vulnerabilities not allowlisted through a regular expression; 2: regular expression defense supported.
     */
    public Long getSupportDefense() {
        return this.SupportDefense;
    }

    /**
     * Set Vulnerability defense type, which comes from the vulnerability table. 1: component vulnerability defense supported, with component vulnerabilities not allowlisted through a regular expression; 2: regular expression defense supported.
     * @param SupportDefense Vulnerability defense type, which comes from the vulnerability table. 1: component vulnerability defense supported, with component vulnerabilities not allowlisted through a regular expression; 2: regular expression defense supported.
     */
    public void setSupportDefense(Long SupportDefense) {
        this.SupportDefense = SupportDefense;
    }

    /**
     * Get Allowlisting scope. 0: Allowlist all requests; 1: Allowlist requests within a custom request scope. 
     * @return WhiteType Allowlisting scope. 0: Allowlist all requests; 1: Allowlist requests within a custom request scope.
     */
    public Long getWhiteType() {
        return this.WhiteType;
    }

    /**
     * Set Allowlisting scope. 0: Allowlist all requests; 1: Allowlist requests within a custom request scope.
     * @param WhiteType Allowlisting scope. 0: Allowlist all requests; 1: Allowlist requests within a custom request scope.
     */
    public void setWhiteType(Long WhiteType) {
        this.WhiteType = WhiteType;
    }

    /**
     * Get Status. 0: valid. 
     * @return Status Status. 0: valid.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: valid.
     * @param Status Status. 0: valid.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public RaspRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspRule(RaspRule source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.URLRegexp != null) {
            this.URLRegexp = new String(source.URLRegexp);
        }
        if (source.VulVulsID != null) {
            this.VulVulsID = new Long(source.VulVulsID);
        }
        if (source.VulVulsName != null) {
            this.VulVulsName = new String(source.VulVulsName);
        }
        if (source.CveID != null) {
            this.CveID = new String(source.CveID);
        }
        if (source.SupportDefense != null) {
            this.SupportDefense = new Long(source.SupportDefense);
        }
        if (source.WhiteType != null) {
            this.WhiteType = new Long(source.WhiteType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "URLRegexp", this.URLRegexp);
        this.setParamSimple(map, prefix + "VulVulsID", this.VulVulsID);
        this.setParamSimple(map, prefix + "VulVulsName", this.VulVulsName);
        this.setParamSimple(map, prefix + "CveID", this.CveID);
        this.setParamSimple(map, prefix + "SupportDefense", this.SupportDefense);
        this.setParamSimple(map, prefix + "WhiteType", this.WhiteType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

