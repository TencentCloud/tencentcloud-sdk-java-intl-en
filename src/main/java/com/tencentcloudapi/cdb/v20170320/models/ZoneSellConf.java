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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneSellConf extends AbstractModel{

    /**
    * AZ status used to indicate whether instances are purchasable. Value range: `1` (purchasable), `3` (not purchasable), `4` (AZ not displayed)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * AZ name
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Whether it is a custom instance type
    */
    @SerializedName("IsCustom")
    @Expose
    private Boolean IsCustom;

    /**
    * Whether disaster recovery is supported
    */
    @SerializedName("IsSupportDr")
    @Expose
    private Boolean IsSupportDr;

    /**
    * Whether VPC is supported
    */
    @SerializedName("IsSupportVpc")
    @Expose
    private Boolean IsSupportVpc;

    /**
    * Maximum purchasable quantity of hourly billed instances
    */
    @SerializedName("HourInstanceSaleMaxNum")
    @Expose
    private Long HourInstanceSaleMaxNum;

    /**
    * Whether it is a default AZ
    */
    @SerializedName("IsDefaultZone")
    @Expose
    private Boolean IsDefaultZone;

    /**
    * Whether it is a BM zone
    */
    @SerializedName("IsBm")
    @Expose
    private Boolean IsBm;

    /**
    * Supported billing method. Value range: 0 (monthly subscribed), 1 (hourly), 2 (postpaid)
    */
    @SerializedName("PayType")
    @Expose
    private String [] PayType;

    /**
    * Data replication type. Value range: 0 (async), 1 (semi-sync), 2 (strong sync)
    */
    @SerializedName("ProtectMode")
    @Expose
    private String [] ProtectMode;

    /**
    * AZ name
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Array of purchasable instance types
    */
    @SerializedName("SellType")
    @Expose
    private SellType [] SellType;

    /**
    * Multi-AZ information
    */
    @SerializedName("ZoneConf")
    @Expose
    private ZoneConf ZoneConf;

    /**
    * Information of the supported disaster recovery AZ
    */
    @SerializedName("DrZone")
    @Expose
    private String [] DrZone;

    /**
    * Whether cross-AZ read-only access is supported
    */
    @SerializedName("IsSupportRemoteRo")
    @Expose
    private Boolean IsSupportRemoteRo;

    /**
    * Information of supported cross-AZ read-only zone
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RemoteRoZone")
    @Expose
    private String [] RemoteRoZone;

    /**
    * AZ status used to indicate whether dedicated instances are purchasable. Valid values: `1 (purchasable), `3` (not purchasable), `4` (AZ not displayed)
    */
    @SerializedName("ExClusterStatus")
    @Expose
    private Long ExClusterStatus;

    /**
    * AZ information of the cross-AZ deployed read-only instances which are associated with a dedicated instance
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExClusterRemoteRoZone")
    @Expose
    private String [] ExClusterRemoteRoZone;

    /**
    * AZ information of a multi-AZ deployed dedicated instance.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExClusterZoneConf")
    @Expose
    private ZoneConf ExClusterZoneConf;

    /**
     * Get AZ status used to indicate whether instances are purchasable. Value range: `1` (purchasable), `3` (not purchasable), `4` (AZ not displayed) 
     * @return Status AZ status used to indicate whether instances are purchasable. Value range: `1` (purchasable), `3` (not purchasable), `4` (AZ not displayed)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set AZ status used to indicate whether instances are purchasable. Value range: `1` (purchasable), `3` (not purchasable), `4` (AZ not displayed)
     * @param Status AZ status used to indicate whether instances are purchasable. Value range: `1` (purchasable), `3` (not purchasable), `4` (AZ not displayed)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get AZ name 
     * @return ZoneName AZ name
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set AZ name
     * @param ZoneName AZ name
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Whether it is a custom instance type 
     * @return IsCustom Whether it is a custom instance type
     */
    public Boolean getIsCustom() {
        return this.IsCustom;
    }

    /**
     * Set Whether it is a custom instance type
     * @param IsCustom Whether it is a custom instance type
     */
    public void setIsCustom(Boolean IsCustom) {
        this.IsCustom = IsCustom;
    }

    /**
     * Get Whether disaster recovery is supported 
     * @return IsSupportDr Whether disaster recovery is supported
     */
    public Boolean getIsSupportDr() {
        return this.IsSupportDr;
    }

    /**
     * Set Whether disaster recovery is supported
     * @param IsSupportDr Whether disaster recovery is supported
     */
    public void setIsSupportDr(Boolean IsSupportDr) {
        this.IsSupportDr = IsSupportDr;
    }

    /**
     * Get Whether VPC is supported 
     * @return IsSupportVpc Whether VPC is supported
     */
    public Boolean getIsSupportVpc() {
        return this.IsSupportVpc;
    }

    /**
     * Set Whether VPC is supported
     * @param IsSupportVpc Whether VPC is supported
     */
    public void setIsSupportVpc(Boolean IsSupportVpc) {
        this.IsSupportVpc = IsSupportVpc;
    }

    /**
     * Get Maximum purchasable quantity of hourly billed instances 
     * @return HourInstanceSaleMaxNum Maximum purchasable quantity of hourly billed instances
     */
    public Long getHourInstanceSaleMaxNum() {
        return this.HourInstanceSaleMaxNum;
    }

    /**
     * Set Maximum purchasable quantity of hourly billed instances
     * @param HourInstanceSaleMaxNum Maximum purchasable quantity of hourly billed instances
     */
    public void setHourInstanceSaleMaxNum(Long HourInstanceSaleMaxNum) {
        this.HourInstanceSaleMaxNum = HourInstanceSaleMaxNum;
    }

    /**
     * Get Whether it is a default AZ 
     * @return IsDefaultZone Whether it is a default AZ
     */
    public Boolean getIsDefaultZone() {
        return this.IsDefaultZone;
    }

    /**
     * Set Whether it is a default AZ
     * @param IsDefaultZone Whether it is a default AZ
     */
    public void setIsDefaultZone(Boolean IsDefaultZone) {
        this.IsDefaultZone = IsDefaultZone;
    }

    /**
     * Get Whether it is a BM zone 
     * @return IsBm Whether it is a BM zone
     */
    public Boolean getIsBm() {
        return this.IsBm;
    }

    /**
     * Set Whether it is a BM zone
     * @param IsBm Whether it is a BM zone
     */
    public void setIsBm(Boolean IsBm) {
        this.IsBm = IsBm;
    }

    /**
     * Get Supported billing method. Value range: 0 (monthly subscribed), 1 (hourly), 2 (postpaid) 
     * @return PayType Supported billing method. Value range: 0 (monthly subscribed), 1 (hourly), 2 (postpaid)
     */
    public String [] getPayType() {
        return this.PayType;
    }

    /**
     * Set Supported billing method. Value range: 0 (monthly subscribed), 1 (hourly), 2 (postpaid)
     * @param PayType Supported billing method. Value range: 0 (monthly subscribed), 1 (hourly), 2 (postpaid)
     */
    public void setPayType(String [] PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Data replication type. Value range: 0 (async), 1 (semi-sync), 2 (strong sync) 
     * @return ProtectMode Data replication type. Value range: 0 (async), 1 (semi-sync), 2 (strong sync)
     */
    public String [] getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set Data replication type. Value range: 0 (async), 1 (semi-sync), 2 (strong sync)
     * @param ProtectMode Data replication type. Value range: 0 (async), 1 (semi-sync), 2 (strong sync)
     */
    public void setProtectMode(String [] ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get AZ name 
     * @return Zone AZ name
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ name
     * @param Zone AZ name
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Array of purchasable instance types 
     * @return SellType Array of purchasable instance types
     */
    public SellType [] getSellType() {
        return this.SellType;
    }

    /**
     * Set Array of purchasable instance types
     * @param SellType Array of purchasable instance types
     */
    public void setSellType(SellType [] SellType) {
        this.SellType = SellType;
    }

    /**
     * Get Multi-AZ information 
     * @return ZoneConf Multi-AZ information
     */
    public ZoneConf getZoneConf() {
        return this.ZoneConf;
    }

    /**
     * Set Multi-AZ information
     * @param ZoneConf Multi-AZ information
     */
    public void setZoneConf(ZoneConf ZoneConf) {
        this.ZoneConf = ZoneConf;
    }

    /**
     * Get Information of the supported disaster recovery AZ 
     * @return DrZone Information of the supported disaster recovery AZ
     */
    public String [] getDrZone() {
        return this.DrZone;
    }

    /**
     * Set Information of the supported disaster recovery AZ
     * @param DrZone Information of the supported disaster recovery AZ
     */
    public void setDrZone(String [] DrZone) {
        this.DrZone = DrZone;
    }

    /**
     * Get Whether cross-AZ read-only access is supported 
     * @return IsSupportRemoteRo Whether cross-AZ read-only access is supported
     */
    public Boolean getIsSupportRemoteRo() {
        return this.IsSupportRemoteRo;
    }

    /**
     * Set Whether cross-AZ read-only access is supported
     * @param IsSupportRemoteRo Whether cross-AZ read-only access is supported
     */
    public void setIsSupportRemoteRo(Boolean IsSupportRemoteRo) {
        this.IsSupportRemoteRo = IsSupportRemoteRo;
    }

    /**
     * Get Information of supported cross-AZ read-only zone
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RemoteRoZone Information of supported cross-AZ read-only zone
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getRemoteRoZone() {
        return this.RemoteRoZone;
    }

    /**
     * Set Information of supported cross-AZ read-only zone
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RemoteRoZone Information of supported cross-AZ read-only zone
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRemoteRoZone(String [] RemoteRoZone) {
        this.RemoteRoZone = RemoteRoZone;
    }

    /**
     * Get AZ status used to indicate whether dedicated instances are purchasable. Valid values: `1 (purchasable), `3` (not purchasable), `4` (AZ not displayed) 
     * @return ExClusterStatus AZ status used to indicate whether dedicated instances are purchasable. Valid values: `1 (purchasable), `3` (not purchasable), `4` (AZ not displayed)
     */
    public Long getExClusterStatus() {
        return this.ExClusterStatus;
    }

    /**
     * Set AZ status used to indicate whether dedicated instances are purchasable. Valid values: `1 (purchasable), `3` (not purchasable), `4` (AZ not displayed)
     * @param ExClusterStatus AZ status used to indicate whether dedicated instances are purchasable. Valid values: `1 (purchasable), `3` (not purchasable), `4` (AZ not displayed)
     */
    public void setExClusterStatus(Long ExClusterStatus) {
        this.ExClusterStatus = ExClusterStatus;
    }

    /**
     * Get AZ information of the cross-AZ deployed read-only instances which are associated with a dedicated instance
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ExClusterRemoteRoZone AZ information of the cross-AZ deployed read-only instances which are associated with a dedicated instance
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getExClusterRemoteRoZone() {
        return this.ExClusterRemoteRoZone;
    }

    /**
     * Set AZ information of the cross-AZ deployed read-only instances which are associated with a dedicated instance
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ExClusterRemoteRoZone AZ information of the cross-AZ deployed read-only instances which are associated with a dedicated instance
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExClusterRemoteRoZone(String [] ExClusterRemoteRoZone) {
        this.ExClusterRemoteRoZone = ExClusterRemoteRoZone;
    }

    /**
     * Get AZ information of a multi-AZ deployed dedicated instance.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ExClusterZoneConf AZ information of a multi-AZ deployed dedicated instance.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public ZoneConf getExClusterZoneConf() {
        return this.ExClusterZoneConf;
    }

    /**
     * Set AZ information of a multi-AZ deployed dedicated instance.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ExClusterZoneConf AZ information of a multi-AZ deployed dedicated instance.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExClusterZoneConf(ZoneConf ExClusterZoneConf) {
        this.ExClusterZoneConf = ExClusterZoneConf;
    }

    public ZoneSellConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneSellConf(ZoneSellConf source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.IsCustom != null) {
            this.IsCustom = new Boolean(source.IsCustom);
        }
        if (source.IsSupportDr != null) {
            this.IsSupportDr = new Boolean(source.IsSupportDr);
        }
        if (source.IsSupportVpc != null) {
            this.IsSupportVpc = new Boolean(source.IsSupportVpc);
        }
        if (source.HourInstanceSaleMaxNum != null) {
            this.HourInstanceSaleMaxNum = new Long(source.HourInstanceSaleMaxNum);
        }
        if (source.IsDefaultZone != null) {
            this.IsDefaultZone = new Boolean(source.IsDefaultZone);
        }
        if (source.IsBm != null) {
            this.IsBm = new Boolean(source.IsBm);
        }
        if (source.PayType != null) {
            this.PayType = new String[source.PayType.length];
            for (int i = 0; i < source.PayType.length; i++) {
                this.PayType[i] = new String(source.PayType[i]);
            }
        }
        if (source.ProtectMode != null) {
            this.ProtectMode = new String[source.ProtectMode.length];
            for (int i = 0; i < source.ProtectMode.length; i++) {
                this.ProtectMode[i] = new String(source.ProtectMode[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SellType != null) {
            this.SellType = new SellType[source.SellType.length];
            for (int i = 0; i < source.SellType.length; i++) {
                this.SellType[i] = new SellType(source.SellType[i]);
            }
        }
        if (source.ZoneConf != null) {
            this.ZoneConf = new ZoneConf(source.ZoneConf);
        }
        if (source.DrZone != null) {
            this.DrZone = new String[source.DrZone.length];
            for (int i = 0; i < source.DrZone.length; i++) {
                this.DrZone[i] = new String(source.DrZone[i]);
            }
        }
        if (source.IsSupportRemoteRo != null) {
            this.IsSupportRemoteRo = new Boolean(source.IsSupportRemoteRo);
        }
        if (source.RemoteRoZone != null) {
            this.RemoteRoZone = new String[source.RemoteRoZone.length];
            for (int i = 0; i < source.RemoteRoZone.length; i++) {
                this.RemoteRoZone[i] = new String(source.RemoteRoZone[i]);
            }
        }
        if (source.ExClusterStatus != null) {
            this.ExClusterStatus = new Long(source.ExClusterStatus);
        }
        if (source.ExClusterRemoteRoZone != null) {
            this.ExClusterRemoteRoZone = new String[source.ExClusterRemoteRoZone.length];
            for (int i = 0; i < source.ExClusterRemoteRoZone.length; i++) {
                this.ExClusterRemoteRoZone[i] = new String(source.ExClusterRemoteRoZone[i]);
            }
        }
        if (source.ExClusterZoneConf != null) {
            this.ExClusterZoneConf = new ZoneConf(source.ExClusterZoneConf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "IsCustom", this.IsCustom);
        this.setParamSimple(map, prefix + "IsSupportDr", this.IsSupportDr);
        this.setParamSimple(map, prefix + "IsSupportVpc", this.IsSupportVpc);
        this.setParamSimple(map, prefix + "HourInstanceSaleMaxNum", this.HourInstanceSaleMaxNum);
        this.setParamSimple(map, prefix + "IsDefaultZone", this.IsDefaultZone);
        this.setParamSimple(map, prefix + "IsBm", this.IsBm);
        this.setParamArraySimple(map, prefix + "PayType.", this.PayType);
        this.setParamArraySimple(map, prefix + "ProtectMode.", this.ProtectMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "SellType.", this.SellType);
        this.setParamObj(map, prefix + "ZoneConf.", this.ZoneConf);
        this.setParamArraySimple(map, prefix + "DrZone.", this.DrZone);
        this.setParamSimple(map, prefix + "IsSupportRemoteRo", this.IsSupportRemoteRo);
        this.setParamArraySimple(map, prefix + "RemoteRoZone.", this.RemoteRoZone);
        this.setParamSimple(map, prefix + "ExClusterStatus", this.ExClusterStatus);
        this.setParamArraySimple(map, prefix + "ExClusterRemoteRoZone.", this.ExClusterRemoteRoZone);
        this.setParamObj(map, prefix + "ExClusterZoneConf.", this.ExClusterZoneConf);

    }
}

