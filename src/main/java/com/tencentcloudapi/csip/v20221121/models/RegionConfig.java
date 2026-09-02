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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionConfig extends AbstractModel {

    /**
    * <p>Region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Region in Chinese</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>Outside Chinese Mainland or not</p>
    */
    @SerializedName("Foreign")
    @Expose
    private Long Foreign;

    /**
    * <p>Region code</p>
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * <p>Whether self-driving cloud</p>
    */
    @SerializedName("IsAutoDriveCloud")
    @Expose
    private Long IsAutoDriveCloud;

    /**
    * <p>nat support</p>
    */
    @SerializedName("IsSupportNat")
    @Expose
    private Long IsSupportNat;

    /**
    * <p>Region information</p>
    */
    @SerializedName("RegionArea")
    @Expose
    private String RegionArea;

    /**
    * <p>Region in English</p>
    */
    @SerializedName("RegionNameEN")
    @Expose
    private String RegionNameEN;

    /**
     * Get <p>Region.</p> 
     * @return Region <p>Region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region.</p>
     * @param Region <p>Region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Region in Chinese</p> 
     * @return RegionName <p>Region in Chinese</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>Region in Chinese</p>
     * @param RegionName <p>Region in Chinese</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>Outside Chinese Mainland or not</p> 
     * @return Foreign <p>Outside Chinese Mainland or not</p>
     */
    public Long getForeign() {
        return this.Foreign;
    }

    /**
     * Set <p>Outside Chinese Mainland or not</p>
     * @param Foreign <p>Outside Chinese Mainland or not</p>
     */
    public void setForeign(Long Foreign) {
        this.Foreign = Foreign;
    }

    /**
     * Get <p>Region code</p> 
     * @return Code <p>Region code</p>
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set <p>Region code</p>
     * @param Code <p>Region code</p>
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get <p>Whether self-driving cloud</p> 
     * @return IsAutoDriveCloud <p>Whether self-driving cloud</p>
     */
    public Long getIsAutoDriveCloud() {
        return this.IsAutoDriveCloud;
    }

    /**
     * Set <p>Whether self-driving cloud</p>
     * @param IsAutoDriveCloud <p>Whether self-driving cloud</p>
     */
    public void setIsAutoDriveCloud(Long IsAutoDriveCloud) {
        this.IsAutoDriveCloud = IsAutoDriveCloud;
    }

    /**
     * Get <p>nat support</p> 
     * @return IsSupportNat <p>nat support</p>
     */
    public Long getIsSupportNat() {
        return this.IsSupportNat;
    }

    /**
     * Set <p>nat support</p>
     * @param IsSupportNat <p>nat support</p>
     */
    public void setIsSupportNat(Long IsSupportNat) {
        this.IsSupportNat = IsSupportNat;
    }

    /**
     * Get <p>Region information</p> 
     * @return RegionArea <p>Region information</p>
     */
    public String getRegionArea() {
        return this.RegionArea;
    }

    /**
     * Set <p>Region information</p>
     * @param RegionArea <p>Region information</p>
     */
    public void setRegionArea(String RegionArea) {
        this.RegionArea = RegionArea;
    }

    /**
     * Get <p>Region in English</p> 
     * @return RegionNameEN <p>Region in English</p>
     */
    public String getRegionNameEN() {
        return this.RegionNameEN;
    }

    /**
     * Set <p>Region in English</p>
     * @param RegionNameEN <p>Region in English</p>
     */
    public void setRegionNameEN(String RegionNameEN) {
        this.RegionNameEN = RegionNameEN;
    }

    public RegionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionConfig(RegionConfig source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Foreign != null) {
            this.Foreign = new Long(source.Foreign);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.IsAutoDriveCloud != null) {
            this.IsAutoDriveCloud = new Long(source.IsAutoDriveCloud);
        }
        if (source.IsSupportNat != null) {
            this.IsSupportNat = new Long(source.IsSupportNat);
        }
        if (source.RegionArea != null) {
            this.RegionArea = new String(source.RegionArea);
        }
        if (source.RegionNameEN != null) {
            this.RegionNameEN = new String(source.RegionNameEN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Foreign", this.Foreign);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "IsAutoDriveCloud", this.IsAutoDriveCloud);
        this.setParamSimple(map, prefix + "IsSupportNat", this.IsSupportNat);
        this.setParamSimple(map, prefix + "RegionArea", this.RegionArea);
        this.setParamSimple(map, prefix + "RegionNameEN", this.RegionNameEN);

    }
}

