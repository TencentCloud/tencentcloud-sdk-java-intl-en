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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeRegionConf extends AbstractModel {

    /**
    * Region name, such as Guangzhou
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Region ID, such as ap-guangzhou
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region name, such as South China
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Whether it is the default region. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDefaultRegion")
    @Expose
    private Long IsDefaultRegion;

    /**
    * Purchasable status of current region. 1: normal, 2: beta test, 3: not purchasable
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Region name, such as Guangzhou
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RegionName Region name, such as Guangzhou
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name, such as Guangzhou
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RegionName Region name, such as Guangzhou
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Region ID, such as ap-guangzhou
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Region Region ID, such as ap-guangzhou
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region ID, such as ap-guangzhou
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Region Region ID, such as ap-guangzhou
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region name, such as South China
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Area Region name, such as South China
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Region name, such as South China
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Area Region name, such as South China
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Whether it is the default region. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsDefaultRegion Whether it is the default region. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDefaultRegion() {
        return this.IsDefaultRegion;
    }

    /**
     * Set Whether it is the default region. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsDefaultRegion Whether it is the default region. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDefaultRegion(Long IsDefaultRegion) {
        this.IsDefaultRegion = IsDefaultRegion;
    }

    /**
     * Get Purchasable status of current region. 1: normal, 2: beta test, 3: not purchasable
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Purchasable status of current region. 1: normal, 2: beta test, 3: not purchasable
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Purchasable status of current region. 1: normal, 2: beta test, 3: not purchasable
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Purchasable status of current region. 1: normal, 2: beta test, 3: not purchasable
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SubscribeRegionConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeRegionConf(SubscribeRegionConf source) {
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.IsDefaultRegion != null) {
            this.IsDefaultRegion = new Long(source.IsDefaultRegion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "IsDefaultRegion", this.IsDefaultRegion);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

