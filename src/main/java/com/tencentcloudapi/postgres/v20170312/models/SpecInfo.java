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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecInfo extends AbstractModel {

    /**
    * Region abbreviation, which corresponds to the `Region` field of `RegionSet`
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * AZ abbreviate, which corresponds to the `Zone` field of `ZoneSet`
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Specification details list
    */
    @SerializedName("SpecItemInfoList")
    @Expose
    private SpecItemInfo [] SpecItemInfoList;

    /**
    * Regions where KMS is supported
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SupportKMSRegions")
    @Expose
    private String [] SupportKMSRegions;

    /**
     * Get Region abbreviation, which corresponds to the `Region` field of `RegionSet` 
     * @return Region Region abbreviation, which corresponds to the `Region` field of `RegionSet`
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region abbreviation, which corresponds to the `Region` field of `RegionSet`
     * @param Region Region abbreviation, which corresponds to the `Region` field of `RegionSet`
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get AZ abbreviate, which corresponds to the `Zone` field of `ZoneSet` 
     * @return Zone AZ abbreviate, which corresponds to the `Zone` field of `ZoneSet`
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ abbreviate, which corresponds to the `Zone` field of `ZoneSet`
     * @param Zone AZ abbreviate, which corresponds to the `Zone` field of `ZoneSet`
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Specification details list 
     * @return SpecItemInfoList Specification details list
     */
    public SpecItemInfo [] getSpecItemInfoList() {
        return this.SpecItemInfoList;
    }

    /**
     * Set Specification details list
     * @param SpecItemInfoList Specification details list
     */
    public void setSpecItemInfoList(SpecItemInfo [] SpecItemInfoList) {
        this.SpecItemInfoList = SpecItemInfoList;
    }

    /**
     * Get Regions where KMS is supported
Note: This field may return `null`, indicating that no valid value was found. 
     * @return SupportKMSRegions Regions where KMS is supported
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getSupportKMSRegions() {
        return this.SupportKMSRegions;
    }

    /**
     * Set Regions where KMS is supported
Note: This field may return `null`, indicating that no valid value was found.
     * @param SupportKMSRegions Regions where KMS is supported
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSupportKMSRegions(String [] SupportKMSRegions) {
        this.SupportKMSRegions = SupportKMSRegions;
    }

    public SpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecInfo(SpecInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SpecItemInfoList != null) {
            this.SpecItemInfoList = new SpecItemInfo[source.SpecItemInfoList.length];
            for (int i = 0; i < source.SpecItemInfoList.length; i++) {
                this.SpecItemInfoList[i] = new SpecItemInfo(source.SpecItemInfoList[i]);
            }
        }
        if (source.SupportKMSRegions != null) {
            this.SupportKMSRegions = new String[source.SupportKMSRegions.length];
            for (int i = 0; i < source.SupportKMSRegions.length; i++) {
                this.SupportKMSRegions[i] = new String(source.SupportKMSRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "SpecItemInfoList.", this.SpecItemInfoList);
        this.setParamArraySimple(map, prefix + "SupportKMSRegions.", this.SupportKMSRegions);

    }
}

