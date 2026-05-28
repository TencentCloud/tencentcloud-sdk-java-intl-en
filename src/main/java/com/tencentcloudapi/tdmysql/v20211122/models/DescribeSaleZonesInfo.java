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

public class DescribeSaleZonesInfo extends AbstractModel {

    /**
    * <p>English string of Zone</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Zone Chinese character string</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>Whether to sell, 1: sell; 0: do not sell</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>Whether the default primary AZ is used. 0 means no, 1 means yes.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDefaultMaster")
    @Expose
    private Long IsDefaultMaster;

    /**
    * <p>Selectable disk types in availability zones</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailableDiskTypes")
    @Expose
    private String [] AvailableDiskTypes;

    /**
    * <p>Whether it is an exclusive availability zone</p>
    */
    @SerializedName("SupportTypes")
    @Expose
    private String [] SupportTypes;

    /**
    * <p>Whether serverless is supported</p>
    */
    @SerializedName("IsSupportServerless")
    @Expose
    private Boolean IsSupportServerless;

    /**
     * Get <p>English string of Zone</p> 
     * @return Zone <p>English string of Zone</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>English string of Zone</p>
     * @param Zone <p>English string of Zone</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Zone Chinese character string</p> 
     * @return ZoneName <p>Zone Chinese character string</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>Zone Chinese character string</p>
     * @param ZoneName <p>Zone Chinese character string</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>Whether to sell, 1: sell; 0: do not sell</p> 
     * @return Enable <p>Whether to sell, 1: sell; 0: do not sell</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Whether to sell, 1: sell; 0: do not sell</p>
     * @param Enable <p>Whether to sell, 1: sell; 0: do not sell</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Whether the default primary AZ is used. 0 means no, 1 means yes.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDefaultMaster <p>Whether the default primary AZ is used. 0 means no, 1 means yes.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDefaultMaster() {
        return this.IsDefaultMaster;
    }

    /**
     * Set <p>Whether the default primary AZ is used. 0 means no, 1 means yes.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDefaultMaster <p>Whether the default primary AZ is used. 0 means no, 1 means yes.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDefaultMaster(Long IsDefaultMaster) {
        this.IsDefaultMaster = IsDefaultMaster;
    }

    /**
     * Get <p>Selectable disk types in availability zones</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AvailableDiskTypes <p>Selectable disk types in availability zones</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAvailableDiskTypes() {
        return this.AvailableDiskTypes;
    }

    /**
     * Set <p>Selectable disk types in availability zones</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AvailableDiskTypes <p>Selectable disk types in availability zones</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAvailableDiskTypes(String [] AvailableDiskTypes) {
        this.AvailableDiskTypes = AvailableDiskTypes;
    }

    /**
     * Get <p>Whether it is an exclusive availability zone</p> 
     * @return SupportTypes <p>Whether it is an exclusive availability zone</p>
     */
    public String [] getSupportTypes() {
        return this.SupportTypes;
    }

    /**
     * Set <p>Whether it is an exclusive availability zone</p>
     * @param SupportTypes <p>Whether it is an exclusive availability zone</p>
     */
    public void setSupportTypes(String [] SupportTypes) {
        this.SupportTypes = SupportTypes;
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

    public DescribeSaleZonesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSaleZonesInfo(DescribeSaleZonesInfo source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.IsDefaultMaster != null) {
            this.IsDefaultMaster = new Long(source.IsDefaultMaster);
        }
        if (source.AvailableDiskTypes != null) {
            this.AvailableDiskTypes = new String[source.AvailableDiskTypes.length];
            for (int i = 0; i < source.AvailableDiskTypes.length; i++) {
                this.AvailableDiskTypes[i] = new String(source.AvailableDiskTypes[i]);
            }
        }
        if (source.SupportTypes != null) {
            this.SupportTypes = new String[source.SupportTypes.length];
            for (int i = 0; i < source.SupportTypes.length; i++) {
                this.SupportTypes[i] = new String(source.SupportTypes[i]);
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
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "IsDefaultMaster", this.IsDefaultMaster);
        this.setParamArraySimple(map, prefix + "AvailableDiskTypes.", this.AvailableDiskTypes);
        this.setParamArraySimple(map, prefix + "SupportTypes.", this.SupportTypes);
        this.setParamSimple(map, prefix + "IsSupportServerless", this.IsSupportServerless);

    }
}

