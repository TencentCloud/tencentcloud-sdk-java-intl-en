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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * <p>Availability zone</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Whether the APP is internal</p><p>Enumeration value:</p><ul><li>0: Public</li><li>1: Internal</li></ul><p>Default value: 0</p>
    */
    @SerializedName("IsInternalApp")
    @Expose
    private Long IsInternalApp;

    /**
    * <p>AppID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Flag indicating whether the availability zone is sold out. true indicates sold out, false indicates not sold out.</p>
    */
    @SerializedName("Flag")
    @Expose
    private Boolean Flag;

    /**
    * <p>Availability zone name</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>Availability zone status</p><p>Enumeration value:</p><ul><li>3: Enable</li><li>4: Disable</li></ul><p>AZ status is subject to SoldOut</p>
    */
    @SerializedName("ZoneStatus")
    @Expose
    private Long ZoneStatus;

    /**
    * <p>Additional flag</p>
    */
    @SerializedName("Exflag")
    @Expose
    private String Exflag;

    /**
    * <p>true indicates sold out, false indicates not sold out.</p>
    */
    @SerializedName("SoldOut")
    @Expose
    private String SoldOut;

    /**
    * <p>Standard version sell-out information</p>
    */
    @SerializedName("SalesInfo")
    @Expose
    private SaleInfo [] SalesInfo;

    /**
    * <p>Additional flag</p>
    */
    @SerializedName("ExtraFlag")
    @Expose
    private String ExtraFlag;

    /**
     * Get <p>Availability zone</p> 
     * @return ZoneId <p>Availability zone</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Availability zone</p>
     * @param ZoneId <p>Availability zone</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Whether the APP is internal</p><p>Enumeration value:</p><ul><li>0: Public</li><li>1: Internal</li></ul><p>Default value: 0</p> 
     * @return IsInternalApp <p>Whether the APP is internal</p><p>Enumeration value:</p><ul><li>0: Public</li><li>1: Internal</li></ul><p>Default value: 0</p>
     */
    public Long getIsInternalApp() {
        return this.IsInternalApp;
    }

    /**
     * Set <p>Whether the APP is internal</p><p>Enumeration value:</p><ul><li>0: Public</li><li>1: Internal</li></ul><p>Default value: 0</p>
     * @param IsInternalApp <p>Whether the APP is internal</p><p>Enumeration value:</p><ul><li>0: Public</li><li>1: Internal</li></ul><p>Default value: 0</p>
     */
    public void setIsInternalApp(Long IsInternalApp) {
        this.IsInternalApp = IsInternalApp;
    }

    /**
     * Get <p>AppID</p> 
     * @return AppId <p>AppID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>AppID</p>
     * @param AppId <p>AppID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Flag indicating whether the availability zone is sold out. true indicates sold out, false indicates not sold out.</p> 
     * @return Flag <p>Flag indicating whether the availability zone is sold out. true indicates sold out, false indicates not sold out.</p>
     */
    public Boolean getFlag() {
        return this.Flag;
    }

    /**
     * Set <p>Flag indicating whether the availability zone is sold out. true indicates sold out, false indicates not sold out.</p>
     * @param Flag <p>Flag indicating whether the availability zone is sold out. true indicates sold out, false indicates not sold out.</p>
     */
    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }

    /**
     * Get <p>Availability zone name</p> 
     * @return ZoneName <p>Availability zone name</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>Availability zone name</p>
     * @param ZoneName <p>Availability zone name</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>Availability zone status</p><p>Enumeration value:</p><ul><li>3: Enable</li><li>4: Disable</li></ul><p>AZ status is subject to SoldOut</p> 
     * @return ZoneStatus <p>Availability zone status</p><p>Enumeration value:</p><ul><li>3: Enable</li><li>4: Disable</li></ul><p>AZ status is subject to SoldOut</p>
     */
    public Long getZoneStatus() {
        return this.ZoneStatus;
    }

    /**
     * Set <p>Availability zone status</p><p>Enumeration value:</p><ul><li>3: Enable</li><li>4: Disable</li></ul><p>AZ status is subject to SoldOut</p>
     * @param ZoneStatus <p>Availability zone status</p><p>Enumeration value:</p><ul><li>3: Enable</li><li>4: Disable</li></ul><p>AZ status is subject to SoldOut</p>
     */
    public void setZoneStatus(Long ZoneStatus) {
        this.ZoneStatus = ZoneStatus;
    }

    /**
     * Get <p>Additional flag</p> 
     * @return Exflag <p>Additional flag</p>
     * @deprecated
     */
    @Deprecated
    public String getExflag() {
        return this.Exflag;
    }

    /**
     * Set <p>Additional flag</p>
     * @param Exflag <p>Additional flag</p>
     * @deprecated
     */
    @Deprecated
    public void setExflag(String Exflag) {
        this.Exflag = Exflag;
    }

    /**
     * Get <p>true indicates sold out, false indicates not sold out.</p> 
     * @return SoldOut <p>true indicates sold out, false indicates not sold out.</p>
     */
    public String getSoldOut() {
        return this.SoldOut;
    }

    /**
     * Set <p>true indicates sold out, false indicates not sold out.</p>
     * @param SoldOut <p>true indicates sold out, false indicates not sold out.</p>
     */
    public void setSoldOut(String SoldOut) {
        this.SoldOut = SoldOut;
    }

    /**
     * Get <p>Standard version sell-out information</p> 
     * @return SalesInfo <p>Standard version sell-out information</p>
     */
    public SaleInfo [] getSalesInfo() {
        return this.SalesInfo;
    }

    /**
     * Set <p>Standard version sell-out information</p>
     * @param SalesInfo <p>Standard version sell-out information</p>
     */
    public void setSalesInfo(SaleInfo [] SalesInfo) {
        this.SalesInfo = SalesInfo;
    }

    /**
     * Get <p>Additional flag</p> 
     * @return ExtraFlag <p>Additional flag</p>
     */
    public String getExtraFlag() {
        return this.ExtraFlag;
    }

    /**
     * Set <p>Additional flag</p>
     * @param ExtraFlag <p>Additional flag</p>
     */
    public void setExtraFlag(String ExtraFlag) {
        this.ExtraFlag = ExtraFlag;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.IsInternalApp != null) {
            this.IsInternalApp = new Long(source.IsInternalApp);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Flag != null) {
            this.Flag = new Boolean(source.Flag);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ZoneStatus != null) {
            this.ZoneStatus = new Long(source.ZoneStatus);
        }
        if (source.Exflag != null) {
            this.Exflag = new String(source.Exflag);
        }
        if (source.SoldOut != null) {
            this.SoldOut = new String(source.SoldOut);
        }
        if (source.SalesInfo != null) {
            this.SalesInfo = new SaleInfo[source.SalesInfo.length];
            for (int i = 0; i < source.SalesInfo.length; i++) {
                this.SalesInfo[i] = new SaleInfo(source.SalesInfo[i]);
            }
        }
        if (source.ExtraFlag != null) {
            this.ExtraFlag = new String(source.ExtraFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "IsInternalApp", this.IsInternalApp);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneStatus", this.ZoneStatus);
        this.setParamSimple(map, prefix + "Exflag", this.Exflag);
        this.setParamSimple(map, prefix + "SoldOut", this.SoldOut);
        this.setParamArrayObj(map, prefix + "SalesInfo.", this.SalesInfo);
        this.setParamSimple(map, prefix + "ExtraFlag", this.ExtraFlag);

    }
}

