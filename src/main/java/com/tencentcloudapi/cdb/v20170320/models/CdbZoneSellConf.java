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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdbZoneSellConf extends AbstractModel {

    /**
    * AZ status, which is used to indicate whether instances are purchasable. Valid values: `1` (purchasable), `3` (not purchasable), `4` (AZ not displayed)
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
    * Supported billing method. Valid values: `0` (monthly subscribed), `1` (hourly billed), `2` (pay-as-you-go)
    */
    @SerializedName("PayType")
    @Expose
    private String [] PayType;

    /**
    * Data replication type. Valid values: `0` (async), `1` (semi-sync), `2` (strong sync)
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
    * Multi-AZ information
    */
    @SerializedName("ZoneConf")
    @Expose
    private ZoneConf ZoneConf;

    /**
    * Information of supported disaster recovery AZs
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
    */
    @SerializedName("RemoteRoZone")
    @Expose
    private String [] RemoteRoZone;

    /**
    * AZ status, which is used to indicate whether dedicated instances are purchasable. Valid values: `1 (purchasable), `3` (not purchasable), `4` (AZ not displayed)
    */
    @SerializedName("ExClusterStatus")
    @Expose
    private Long ExClusterStatus;

    /**
    * Information of cross-AZ read-only zones supported by a dedicated instance
    */
    @SerializedName("ExClusterRemoteRoZone")
    @Expose
    private String [] ExClusterRemoteRoZone;

    /**
    * AZ information of a multi-AZ deployed dedicated instance.
    */
    @SerializedName("ExClusterZoneConf")
    @Expose
    private ZoneConf ExClusterZoneConf;

    /**
    * Array of purchasable instance types. The value of `configIds` and `configs` have a one-to-one correspondence.
    */
    @SerializedName("SellType")
    @Expose
    private CdbSellType [] SellType;

    /**
    * AZ ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Whether IPv6 is supported
    */
    @SerializedName("IsSupportIpv6")
    @Expose
    private Boolean IsSupportIpv6;

    /**
    * Supported engine types for purchasable database
    */
    @SerializedName("EngineType")
    @Expose
    private String [] EngineType;

    /**
     * Get AZ status, which is used to indicate whether instances are purchasable. Valid values: `1` (purchasable), `3` (not purchasable), `4` (AZ not displayed) 
     * @return Status AZ status, which is used to indicate whether instances are purchasable. Valid values: `1` (purchasable), `3` (not purchasable), `4` (AZ not displayed)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set AZ status, which is used to indicate whether instances are purchasable. Valid values: `1` (purchasable), `3` (not purchasable), `4` (AZ not displayed)
     * @param Status AZ status, which is used to indicate whether instances are purchasable. Valid values: `1` (purchasable), `3` (not purchasable), `4` (AZ not displayed)
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
     * Get Supported billing method. Valid values: `0` (monthly subscribed), `1` (hourly billed), `2` (pay-as-you-go) 
     * @return PayType Supported billing method. Valid values: `0` (monthly subscribed), `1` (hourly billed), `2` (pay-as-you-go)
     */
    public String [] getPayType() {
        return this.PayType;
    }

    /**
     * Set Supported billing method. Valid values: `0` (monthly subscribed), `1` (hourly billed), `2` (pay-as-you-go)
     * @param PayType Supported billing method. Valid values: `0` (monthly subscribed), `1` (hourly billed), `2` (pay-as-you-go)
     */
    public void setPayType(String [] PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Data replication type. Valid values: `0` (async), `1` (semi-sync), `2` (strong sync) 
     * @return ProtectMode Data replication type. Valid values: `0` (async), `1` (semi-sync), `2` (strong sync)
     */
    public String [] getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set Data replication type. Valid values: `0` (async), `1` (semi-sync), `2` (strong sync)
     * @param ProtectMode Data replication type. Valid values: `0` (async), `1` (semi-sync), `2` (strong sync)
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
     * Get Information of supported disaster recovery AZs 
     * @return DrZone Information of supported disaster recovery AZs
     */
    public String [] getDrZone() {
        return this.DrZone;
    }

    /**
     * Set Information of supported disaster recovery AZs
     * @param DrZone Information of supported disaster recovery AZs
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
     * @return RemoteRoZone Information of supported cross-AZ read-only zone
     */
    public String [] getRemoteRoZone() {
        return this.RemoteRoZone;
    }

    /**
     * Set Information of supported cross-AZ read-only zone
     * @param RemoteRoZone Information of supported cross-AZ read-only zone
     */
    public void setRemoteRoZone(String [] RemoteRoZone) {
        this.RemoteRoZone = RemoteRoZone;
    }

    /**
     * Get AZ status, which is used to indicate whether dedicated instances are purchasable. Valid values: `1 (purchasable), `3` (not purchasable), `4` (AZ not displayed) 
     * @return ExClusterStatus AZ status, which is used to indicate whether dedicated instances are purchasable. Valid values: `1 (purchasable), `3` (not purchasable), `4` (AZ not displayed)
     */
    public Long getExClusterStatus() {
        return this.ExClusterStatus;
    }

    /**
     * Set AZ status, which is used to indicate whether dedicated instances are purchasable. Valid values: `1 (purchasable), `3` (not purchasable), `4` (AZ not displayed)
     * @param ExClusterStatus AZ status, which is used to indicate whether dedicated instances are purchasable. Valid values: `1 (purchasable), `3` (not purchasable), `4` (AZ not displayed)
     */
    public void setExClusterStatus(Long ExClusterStatus) {
        this.ExClusterStatus = ExClusterStatus;
    }

    /**
     * Get Information of cross-AZ read-only zones supported by a dedicated instance 
     * @return ExClusterRemoteRoZone Information of cross-AZ read-only zones supported by a dedicated instance
     */
    public String [] getExClusterRemoteRoZone() {
        return this.ExClusterRemoteRoZone;
    }

    /**
     * Set Information of cross-AZ read-only zones supported by a dedicated instance
     * @param ExClusterRemoteRoZone Information of cross-AZ read-only zones supported by a dedicated instance
     */
    public void setExClusterRemoteRoZone(String [] ExClusterRemoteRoZone) {
        this.ExClusterRemoteRoZone = ExClusterRemoteRoZone;
    }

    /**
     * Get AZ information of a multi-AZ deployed dedicated instance. 
     * @return ExClusterZoneConf AZ information of a multi-AZ deployed dedicated instance.
     */
    public ZoneConf getExClusterZoneConf() {
        return this.ExClusterZoneConf;
    }

    /**
     * Set AZ information of a multi-AZ deployed dedicated instance.
     * @param ExClusterZoneConf AZ information of a multi-AZ deployed dedicated instance.
     */
    public void setExClusterZoneConf(ZoneConf ExClusterZoneConf) {
        this.ExClusterZoneConf = ExClusterZoneConf;
    }

    /**
     * Get Array of purchasable instance types. The value of `configIds` and `configs` have a one-to-one correspondence. 
     * @return SellType Array of purchasable instance types. The value of `configIds` and `configs` have a one-to-one correspondence.
     */
    public CdbSellType [] getSellType() {
        return this.SellType;
    }

    /**
     * Set Array of purchasable instance types. The value of `configIds` and `configs` have a one-to-one correspondence.
     * @param SellType Array of purchasable instance types. The value of `configIds` and `configs` have a one-to-one correspondence.
     */
    public void setSellType(CdbSellType [] SellType) {
        this.SellType = SellType;
    }

    /**
     * Get AZ ID 
     * @return ZoneId AZ ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID
     * @param ZoneId AZ ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Whether IPv6 is supported 
     * @return IsSupportIpv6 Whether IPv6 is supported
     */
    public Boolean getIsSupportIpv6() {
        return this.IsSupportIpv6;
    }

    /**
     * Set Whether IPv6 is supported
     * @param IsSupportIpv6 Whether IPv6 is supported
     */
    public void setIsSupportIpv6(Boolean IsSupportIpv6) {
        this.IsSupportIpv6 = IsSupportIpv6;
    }

    /**
     * Get Supported engine types for purchasable database 
     * @return EngineType Supported engine types for purchasable database
     */
    public String [] getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Supported engine types for purchasable database
     * @param EngineType Supported engine types for purchasable database
     */
    public void setEngineType(String [] EngineType) {
        this.EngineType = EngineType;
    }

    public CdbZoneSellConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdbZoneSellConf(CdbZoneSellConf source) {
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
        if (source.SellType != null) {
            this.SellType = new CdbSellType[source.SellType.length];
            for (int i = 0; i < source.SellType.length; i++) {
                this.SellType[i] = new CdbSellType(source.SellType[i]);
            }
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.IsSupportIpv6 != null) {
            this.IsSupportIpv6 = new Boolean(source.IsSupportIpv6);
        }
        if (source.EngineType != null) {
            this.EngineType = new String[source.EngineType.length];
            for (int i = 0; i < source.EngineType.length; i++) {
                this.EngineType[i] = new String(source.EngineType[i]);
            }
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
        this.setParamObj(map, prefix + "ZoneConf.", this.ZoneConf);
        this.setParamArraySimple(map, prefix + "DrZone.", this.DrZone);
        this.setParamSimple(map, prefix + "IsSupportRemoteRo", this.IsSupportRemoteRo);
        this.setParamArraySimple(map, prefix + "RemoteRoZone.", this.RemoteRoZone);
        this.setParamSimple(map, prefix + "ExClusterStatus", this.ExClusterStatus);
        this.setParamArraySimple(map, prefix + "ExClusterRemoteRoZone.", this.ExClusterRemoteRoZone);
        this.setParamObj(map, prefix + "ExClusterZoneConf.", this.ExClusterZoneConf);
        this.setParamArrayObj(map, prefix + "SellType.", this.SellType);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "IsSupportIpv6", this.IsSupportIpv6);
        this.setParamArraySimple(map, prefix + "EngineType.", this.EngineType);

    }
}

