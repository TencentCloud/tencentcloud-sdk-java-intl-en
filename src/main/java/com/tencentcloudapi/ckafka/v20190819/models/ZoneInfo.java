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
    * Availability zone
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Whether it is an internal application.
    */
    @SerializedName("IsInternalApp")
    @Expose
    private Long IsInternalApp;

    /**
    * Application identifier
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Indicates whether the AZ is sold out. true indicates sold out. false indicates not sold out.
    */
    @SerializedName("Flag")
    @Expose
    private Boolean Flag;

    /**
    * Availability zone name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Availability zone status. enumerates example: 3: enable, 4: disable. availability zone status is subject to SoldOut.
    */
    @SerializedName("ZoneStatus")
    @Expose
    private Long ZoneStatus;

    /**
    * Extra flag
    */
    @SerializedName("Exflag")
    @Expose
    private String Exflag;

    /**
    * Specifies whether the item is sold-out. valid values: true (sold-out), false (not sold out).
    */
    @SerializedName("SoldOut")
    @Expose
    private String SoldOut;

    /**
    * Specifies the sell-out information of the standard version.
    */
    @SerializedName("SalesInfo")
    @Expose
    private SaleInfo [] SalesInfo;

    /**
    * Additional flag.
    */
    @SerializedName("ExtraFlag")
    @Expose
    private String ExtraFlag;

    /**
     * Get Availability zone 
     * @return ZoneId Availability zone
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Availability zone
     * @param ZoneId Availability zone
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Whether it is an internal application. 
     * @return IsInternalApp Whether it is an internal application.
     */
    public Long getIsInternalApp() {
        return this.IsInternalApp;
    }

    /**
     * Set Whether it is an internal application.
     * @param IsInternalApp Whether it is an internal application.
     */
    public void setIsInternalApp(Long IsInternalApp) {
        this.IsInternalApp = IsInternalApp;
    }

    /**
     * Get Application identifier 
     * @return AppId Application identifier
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Application identifier
     * @param AppId Application identifier
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Indicates whether the AZ is sold out. true indicates sold out. false indicates not sold out. 
     * @return Flag Indicates whether the AZ is sold out. true indicates sold out. false indicates not sold out.
     */
    public Boolean getFlag() {
        return this.Flag;
    }

    /**
     * Set Indicates whether the AZ is sold out. true indicates sold out. false indicates not sold out.
     * @param Flag Indicates whether the AZ is sold out. true indicates sold out. false indicates not sold out.
     */
    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }

    /**
     * Get Availability zone name. 
     * @return ZoneName Availability zone name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Availability zone name.
     * @param ZoneName Availability zone name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Availability zone status. enumerates example: 3: enable, 4: disable. availability zone status is subject to SoldOut. 
     * @return ZoneStatus Availability zone status. enumerates example: 3: enable, 4: disable. availability zone status is subject to SoldOut.
     */
    public Long getZoneStatus() {
        return this.ZoneStatus;
    }

    /**
     * Set Availability zone status. enumerates example: 3: enable, 4: disable. availability zone status is subject to SoldOut.
     * @param ZoneStatus Availability zone status. enumerates example: 3: enable, 4: disable. availability zone status is subject to SoldOut.
     */
    public void setZoneStatus(Long ZoneStatus) {
        this.ZoneStatus = ZoneStatus;
    }

    /**
     * Get Extra flag 
     * @return Exflag Extra flag
     * @deprecated
     */
    @Deprecated
    public String getExflag() {
        return this.Exflag;
    }

    /**
     * Set Extra flag
     * @param Exflag Extra flag
     * @deprecated
     */
    @Deprecated
    public void setExflag(String Exflag) {
        this.Exflag = Exflag;
    }

    /**
     * Get Specifies whether the item is sold-out. valid values: true (sold-out), false (not sold out). 
     * @return SoldOut Specifies whether the item is sold-out. valid values: true (sold-out), false (not sold out).
     */
    public String getSoldOut() {
        return this.SoldOut;
    }

    /**
     * Set Specifies whether the item is sold-out. valid values: true (sold-out), false (not sold out).
     * @param SoldOut Specifies whether the item is sold-out. valid values: true (sold-out), false (not sold out).
     */
    public void setSoldOut(String SoldOut) {
        this.SoldOut = SoldOut;
    }

    /**
     * Get Specifies the sell-out information of the standard version. 
     * @return SalesInfo Specifies the sell-out information of the standard version.
     */
    public SaleInfo [] getSalesInfo() {
        return this.SalesInfo;
    }

    /**
     * Set Specifies the sell-out information of the standard version.
     * @param SalesInfo Specifies the sell-out information of the standard version.
     */
    public void setSalesInfo(SaleInfo [] SalesInfo) {
        this.SalesInfo = SalesInfo;
    }

    /**
     * Get Additional flag. 
     * @return ExtraFlag Additional flag.
     */
    public String getExtraFlag() {
        return this.ExtraFlag;
    }

    /**
     * Set Additional flag.
     * @param ExtraFlag Additional flag.
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

