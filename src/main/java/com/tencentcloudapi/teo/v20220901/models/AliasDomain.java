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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AliasDomain extends AbstractModel {

    /**
    * Alias domain name.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Target domain name.
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * Status of the alias domain name. Valid values:
<li> active: effective; </li>
<li> pending: deploying.</li>
<li> conflict: Retrieved. </li>
<li> stop: deactivated;</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Blocking mode. Valid values:
<li>`0`: not blocked;</li>
<li> 11: Block due to regulatory compliance;</li>
<li> 14: Banned for non-filing.</li>
    */
    @SerializedName("ForbidMode")
    @Expose
    private Long ForbidMode;

    /**
    * Alias domain creation time.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Alias domain name modification time.
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get Alias domain name. 
     * @return AliasName Alias domain name.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Alias domain name.
     * @param AliasName Alias domain name.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Target domain name. 
     * @return TargetName Target domain name.
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set Target domain name.
     * @param TargetName Target domain name.
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get Status of the alias domain name. Valid values:
<li> active: effective; </li>
<li> pending: deploying.</li>
<li> conflict: Retrieved. </li>
<li> stop: deactivated;</li> 
     * @return Status Status of the alias domain name. Valid values:
<li> active: effective; </li>
<li> pending: deploying.</li>
<li> conflict: Retrieved. </li>
<li> stop: deactivated;</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the alias domain name. Valid values:
<li> active: effective; </li>
<li> pending: deploying.</li>
<li> conflict: Retrieved. </li>
<li> stop: deactivated;</li>
     * @param Status Status of the alias domain name. Valid values:
<li> active: effective; </li>
<li> pending: deploying.</li>
<li> conflict: Retrieved. </li>
<li> stop: deactivated;</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Blocking mode. Valid values:
<li>`0`: not blocked;</li>
<li> 11: Block due to regulatory compliance;</li>
<li> 14: Banned for non-filing.</li> 
     * @return ForbidMode Blocking mode. Valid values:
<li>`0`: not blocked;</li>
<li> 11: Block due to regulatory compliance;</li>
<li> 14: Banned for non-filing.</li>
     */
    public Long getForbidMode() {
        return this.ForbidMode;
    }

    /**
     * Set Blocking mode. Valid values:
<li>`0`: not blocked;</li>
<li> 11: Block due to regulatory compliance;</li>
<li> 14: Banned for non-filing.</li>
     * @param ForbidMode Blocking mode. Valid values:
<li>`0`: not blocked;</li>
<li> 11: Block due to regulatory compliance;</li>
<li> 14: Banned for non-filing.</li>
     */
    public void setForbidMode(Long ForbidMode) {
        this.ForbidMode = ForbidMode;
    }

    /**
     * Get Alias domain creation time. 
     * @return CreatedOn Alias domain creation time.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Alias domain creation time.
     * @param CreatedOn Alias domain creation time.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Alias domain name modification time. 
     * @return ModifiedOn Alias domain name modification time.
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set Alias domain name modification time.
     * @param ModifiedOn Alias domain name modification time.
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    public AliasDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AliasDomain(AliasDomain source) {
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ForbidMode != null) {
            this.ForbidMode = new Long(source.ForbidMode);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ForbidMode", this.ForbidMode);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

