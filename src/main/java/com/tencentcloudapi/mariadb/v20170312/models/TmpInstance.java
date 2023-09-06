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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TmpInstance extends AbstractModel{

    /**
    * Application ID
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Creation time
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Instance remarks
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceRemark")
    @Expose
    private String InstanceRemark;

    /**
    * Whether it is a temp instance. Valid values: `0` (non-temp instance), `1` (invalid temp instance), `2` (valid temp rollback instance).
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("TempType")
    @Expose
    private Long TempType;

    /**
    * Instance status. Valid values: `0` (to be initialized), `1` (in process), `2` (running), `-1` (isolated), `-2` (eliminated).
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance ID in the format of `tdsql-ow728lmc`
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Virtual instance IP
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Virtual instance port
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Validity end time
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * Source instance ID in the format of `tdsql-ow728lmc`
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * Instance status description
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Instance region
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * AZ of the instance
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Virtual IPv6 of the instance
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("Vipv6")
    @Expose
    private String Vipv6;

    /**
    * Instance IPv6 flag
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
     * Get Application ID
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return AppId Application ID
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Application ID
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param AppId Application ID
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Creation time
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Instance remarks
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return InstanceRemark Instance remarks
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getInstanceRemark() {
        return this.InstanceRemark;
    }

    /**
     * Set Instance remarks
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param InstanceRemark Instance remarks
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setInstanceRemark(String InstanceRemark) {
        this.InstanceRemark = InstanceRemark;
    }

    /**
     * Get Whether it is a temp instance. Valid values: `0` (non-temp instance), `1` (invalid temp instance), `2` (valid temp rollback instance).
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return TempType Whether it is a temp instance. Valid values: `0` (non-temp instance), `1` (invalid temp instance), `2` (valid temp rollback instance).
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Long getTempType() {
        return this.TempType;
    }

    /**
     * Set Whether it is a temp instance. Valid values: `0` (non-temp instance), `1` (invalid temp instance), `2` (valid temp rollback instance).
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param TempType Whether it is a temp instance. Valid values: `0` (non-temp instance), `1` (invalid temp instance), `2` (valid temp rollback instance).
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setTempType(Long TempType) {
        this.TempType = TempType;
    }

    /**
     * Get Instance status. Valid values: `0` (to be initialized), `1` (in process), `2` (running), `-1` (isolated), `-2` (eliminated).
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return Status Instance status. Valid values: `0` (to be initialized), `1` (in process), `2` (running), `-1` (isolated), `-2` (eliminated).
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: `0` (to be initialized), `1` (in process), `2` (running), `-1` (isolated), `-2` (eliminated).
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param Status Instance status. Valid values: `0` (to be initialized), `1` (in process), `2` (running), `-1` (isolated), `-2` (eliminated).
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance ID in the format of `tdsql-ow728lmc`
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID in the format of `tdsql-ow728lmc`
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of `tdsql-ow728lmc`
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID in the format of `tdsql-ow728lmc`
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Virtual instance IP
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return Vip Virtual instance IP
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Virtual instance IP
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param Vip Virtual instance IP
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Virtual instance port
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return Vport Virtual instance port
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Virtual instance port
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param Vport Virtual instance port
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Validity end time
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return PeriodEndTime Validity end time
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set Validity end time
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param PeriodEndTime Validity end time
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get Source instance ID in the format of `tdsql-ow728lmc`
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return SrcInstanceId Source instance ID in the format of `tdsql-ow728lmc`
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set Source instance ID in the format of `tdsql-ow728lmc`
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param SrcInstanceId Source instance ID in the format of `tdsql-ow728lmc`
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get Instance status description
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return StatusDesc Instance status description
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Instance status description
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param StatusDesc Instance status description
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Instance region
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return Region Instance region
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param Region Instance region
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get AZ of the instance
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return Zone AZ of the instance
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ of the instance
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param Zone AZ of the instance
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Virtual IPv6 of the instance
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return Vipv6 Virtual IPv6 of the instance
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getVipv6() {
        return this.Vipv6;
    }

    /**
     * Set Virtual IPv6 of the instance
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param Vipv6 Virtual IPv6 of the instance
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setVipv6(String Vipv6) {
        this.Vipv6 = Vipv6;
    }

    /**
     * Get Instance IPv6 flag
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return Ipv6Flag Instance IPv6 flag
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set Instance IPv6 flag
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param Ipv6Flag Instance IPv6 flag
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    public TmpInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TmpInstance(TmpInstance source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InstanceRemark != null) {
            this.InstanceRemark = new String(source.InstanceRemark);
        }
        if (source.TempType != null) {
            this.TempType = new Long(source.TempType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Vipv6 != null) {
            this.Vipv6 = new String(source.Vipv6);
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceRemark", this.InstanceRemark);
        this.setParamSimple(map, prefix + "TempType", this.TempType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Vipv6", this.Vipv6);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);

    }
}

