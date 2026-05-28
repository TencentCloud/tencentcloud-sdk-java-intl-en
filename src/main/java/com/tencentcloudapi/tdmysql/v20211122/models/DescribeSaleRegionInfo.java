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

public class DescribeSaleRegionInfo extends AbstractModel {

    /**
    * <p>English string of Region</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Purchasable Zone list</p>
    */
    @SerializedName("ZoneList")
    @Expose
    private DescribeSaleZonesInfo [] ZoneList;

    /**
    * <p>Region Chinese character string</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>Whether to sell. 1: sell, 0: do not sell</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>Optional quantity of multiple availability</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailableZoneNum")
    @Expose
    private Long AvailableZoneNum;

    /**
    * <p>Whether to allow usage log replica</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSupportedLogReplica")
    @Expose
    private Boolean IsSupportedLogReplica;

    /**
    * <p>Availability zone combination</p>
    */
    @SerializedName("ZoneGroup")
    @Expose
    private DescribeSaleZonesGroup [] ZoneGroup;

    /**
    * <p>Whether serverless is supported</p>
    */
    @SerializedName("IsSupportServerless")
    @Expose
    private Boolean IsSupportServerless;

    /**
     * Get <p>English string of Region</p> 
     * @return Region <p>English string of Region</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>English string of Region</p>
     * @param Region <p>English string of Region</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Purchasable Zone list</p> 
     * @return ZoneList <p>Purchasable Zone list</p>
     */
    public DescribeSaleZonesInfo [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set <p>Purchasable Zone list</p>
     * @param ZoneList <p>Purchasable Zone list</p>
     */
    public void setZoneList(DescribeSaleZonesInfo [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get <p>Region Chinese character string</p> 
     * @return RegionName <p>Region Chinese character string</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>Region Chinese character string</p>
     * @param RegionName <p>Region Chinese character string</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>Whether to sell. 1: sell, 0: do not sell</p> 
     * @return Enable <p>Whether to sell. 1: sell, 0: do not sell</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Whether to sell. 1: sell, 0: do not sell</p>
     * @param Enable <p>Whether to sell. 1: sell, 0: do not sell</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Optional quantity of multiple availability</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AvailableZoneNum <p>Optional quantity of multiple availability</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAvailableZoneNum() {
        return this.AvailableZoneNum;
    }

    /**
     * Set <p>Optional quantity of multiple availability</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AvailableZoneNum <p>Optional quantity of multiple availability</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAvailableZoneNum(Long AvailableZoneNum) {
        this.AvailableZoneNum = AvailableZoneNum;
    }

    /**
     * Get <p>Whether to allow usage log replica</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSupportedLogReplica <p>Whether to allow usage log replica</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsSupportedLogReplica() {
        return this.IsSupportedLogReplica;
    }

    /**
     * Set <p>Whether to allow usage log replica</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSupportedLogReplica <p>Whether to allow usage log replica</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSupportedLogReplica(Boolean IsSupportedLogReplica) {
        this.IsSupportedLogReplica = IsSupportedLogReplica;
    }

    /**
     * Get <p>Availability zone combination</p> 
     * @return ZoneGroup <p>Availability zone combination</p>
     */
    public DescribeSaleZonesGroup [] getZoneGroup() {
        return this.ZoneGroup;
    }

    /**
     * Set <p>Availability zone combination</p>
     * @param ZoneGroup <p>Availability zone combination</p>
     */
    public void setZoneGroup(DescribeSaleZonesGroup [] ZoneGroup) {
        this.ZoneGroup = ZoneGroup;
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

    public DescribeSaleRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSaleRegionInfo(DescribeSaleRegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ZoneList != null) {
            this.ZoneList = new DescribeSaleZonesInfo[source.ZoneList.length];
            for (int i = 0; i < source.ZoneList.length; i++) {
                this.ZoneList[i] = new DescribeSaleZonesInfo(source.ZoneList[i]);
            }
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.AvailableZoneNum != null) {
            this.AvailableZoneNum = new Long(source.AvailableZoneNum);
        }
        if (source.IsSupportedLogReplica != null) {
            this.IsSupportedLogReplica = new Boolean(source.IsSupportedLogReplica);
        }
        if (source.ZoneGroup != null) {
            this.ZoneGroup = new DescribeSaleZonesGroup[source.ZoneGroup.length];
            for (int i = 0; i < source.ZoneGroup.length; i++) {
                this.ZoneGroup[i] = new DescribeSaleZonesGroup(source.ZoneGroup[i]);
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
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "AvailableZoneNum", this.AvailableZoneNum);
        this.setParamSimple(map, prefix + "IsSupportedLogReplica", this.IsSupportedLogReplica);
        this.setParamArrayObj(map, prefix + "ZoneGroup.", this.ZoneGroup);
        this.setParamSimple(map, prefix + "IsSupportServerless", this.IsSupportServerless);

    }
}

