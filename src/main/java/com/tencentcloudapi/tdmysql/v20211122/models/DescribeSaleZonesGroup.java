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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSaleZonesGroup extends AbstractModel {

    /**
    * <p>Number of availability zones</p>
    */
    @SerializedName("ZoneNum")
    @Expose
    private Long ZoneNum;

    /**
    * <p>Availability zone combination</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>Supported types</p>
    */
    @SerializedName("SupportTypes")
    @Expose
    private String [] SupportTypes;

    /**
    * <p>Supported disk</p><p>Enumeration value:</p><ul><li>CLOUD_TCS: Local disk</li><li>CLOUD_HSSD: Enhanced cloud disk</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailableDiskTypes")
    @Expose
    private String [] AvailableDiskTypes;

    /**
    * <p>Whether serverless is supported</p>
    */
    @SerializedName("IsSupportServerless")
    @Expose
    private Boolean IsSupportServerless;

    /**
     * Get <p>Number of availability zones</p> 
     * @return ZoneNum <p>Number of availability zones</p>
     */
    public Long getZoneNum() {
        return this.ZoneNum;
    }

    /**
     * Set <p>Number of availability zones</p>
     * @param ZoneNum <p>Number of availability zones</p>
     */
    public void setZoneNum(Long ZoneNum) {
        this.ZoneNum = ZoneNum;
    }

    /**
     * Get <p>Availability zone combination</p> 
     * @return Zones <p>Availability zone combination</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>Availability zone combination</p>
     * @param Zones <p>Availability zone combination</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>Supported types</p> 
     * @return SupportTypes <p>Supported types</p>
     */
    public String [] getSupportTypes() {
        return this.SupportTypes;
    }

    /**
     * Set <p>Supported types</p>
     * @param SupportTypes <p>Supported types</p>
     */
    public void setSupportTypes(String [] SupportTypes) {
        this.SupportTypes = SupportTypes;
    }

    /**
     * Get <p>Supported disk</p><p>Enumeration value:</p><ul><li>CLOUD_TCS: Local disk</li><li>CLOUD_HSSD: Enhanced cloud disk</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AvailableDiskTypes <p>Supported disk</p><p>Enumeration value:</p><ul><li>CLOUD_TCS: Local disk</li><li>CLOUD_HSSD: Enhanced cloud disk</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAvailableDiskTypes() {
        return this.AvailableDiskTypes;
    }

    /**
     * Set <p>Supported disk</p><p>Enumeration value:</p><ul><li>CLOUD_TCS: Local disk</li><li>CLOUD_HSSD: Enhanced cloud disk</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AvailableDiskTypes <p>Supported disk</p><p>Enumeration value:</p><ul><li>CLOUD_TCS: Local disk</li><li>CLOUD_HSSD: Enhanced cloud disk</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAvailableDiskTypes(String [] AvailableDiskTypes) {
        this.AvailableDiskTypes = AvailableDiskTypes;
    }

    /**
     * Get <p>Whether serverless is supported</p> 
     * @return IsSupportServerless <p>Whether serverless is supported</p>
     */
    public Boolean getIsSupportServerless() {
        return this.IsSupportServerless;
    }

    /**
     * Set <p>Whether serverless is supported</p>
     * @param IsSupportServerless <p>Whether serverless is supported</p>
     */
    public void setIsSupportServerless(Boolean IsSupportServerless) {
        this.IsSupportServerless = IsSupportServerless;
    }

    public DescribeSaleZonesGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSaleZonesGroup(DescribeSaleZonesGroup source) {
        if (source.ZoneNum != null) {
            this.ZoneNum = new Long(source.ZoneNum);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.SupportTypes != null) {
            this.SupportTypes = new String[source.SupportTypes.length];
            for (int i = 0; i < source.SupportTypes.length; i++) {
                this.SupportTypes[i] = new String(source.SupportTypes[i]);
            }
        }
        if (source.AvailableDiskTypes != null) {
            this.AvailableDiskTypes = new String[source.AvailableDiskTypes.length];
            for (int i = 0; i < source.AvailableDiskTypes.length; i++) {
                this.AvailableDiskTypes[i] = new String(source.AvailableDiskTypes[i]);
            }
        }
        if (source.IsSupportServerless != null) {
            this.IsSupportServerless = new Boolean(source.IsSupportServerless);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneNum", this.ZoneNum);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArraySimple(map, prefix + "SupportTypes.", this.SupportTypes);
        this.setParamArraySimple(map, prefix + "AvailableDiskTypes.", this.AvailableDiskTypes);
        this.setParamSimple(map, prefix + "IsSupportServerless", this.IsSupportServerless);

    }
}

