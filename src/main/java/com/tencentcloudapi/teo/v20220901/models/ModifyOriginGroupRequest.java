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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOriginGroupRequest extends AbstractModel {

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The ID of the origin group.
    */
    @SerializedName("OriginGroupId")
    @Expose
    private String OriginGroupId;

    /**
    * The origin type. Values:
<li>`self`: Customer origin</li>
<li>`third_party`: Third-party origin</li>
<li>`cos`: Tencent Cloud COS origin</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * The name of the origin group.
    */
    @SerializedName("OriginGroupName")
    @Expose
    private String OriginGroupName;

    /**
    * The origin configuration type when `OriginType=self`. Values:
<li>`area`: Configure by region.</li>
<li>`weight`: Configure by weight.</li>
<li>`proto`: Configure by HTTP protocol.</li> When `OriginType=third_party/cos`, leave this field empty.
    */
    @SerializedName("ConfigurationType")
    @Expose
    private String ConfigurationType;

    /**
    * Details of the origin record.
    */
    @SerializedName("OriginRecords")
    @Expose
    private OriginRecord [] OriginRecords;

    /**
    * The origin domain. This field can be specified only when `OriginType=self`.
If it is left empty, the existing configuration is used.
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The ID of the origin group. 
     * @return OriginGroupId The ID of the origin group.
     */
    public String getOriginGroupId() {
        return this.OriginGroupId;
    }

    /**
     * Set The ID of the origin group.
     * @param OriginGroupId The ID of the origin group.
     */
    public void setOriginGroupId(String OriginGroupId) {
        this.OriginGroupId = OriginGroupId;
    }

    /**
     * Get The origin type. Values:
<li>`self`: Customer origin</li>
<li>`third_party`: Third-party origin</li>
<li>`cos`: Tencent Cloud COS origin</li> 
     * @return OriginType The origin type. Values:
<li>`self`: Customer origin</li>
<li>`third_party`: Third-party origin</li>
<li>`cos`: Tencent Cloud COS origin</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set The origin type. Values:
<li>`self`: Customer origin</li>
<li>`third_party`: Third-party origin</li>
<li>`cos`: Tencent Cloud COS origin</li>
     * @param OriginType The origin type. Values:
<li>`self`: Customer origin</li>
<li>`third_party`: Third-party origin</li>
<li>`cos`: Tencent Cloud COS origin</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get The name of the origin group. 
     * @return OriginGroupName The name of the origin group.
     */
    public String getOriginGroupName() {
        return this.OriginGroupName;
    }

    /**
     * Set The name of the origin group.
     * @param OriginGroupName The name of the origin group.
     */
    public void setOriginGroupName(String OriginGroupName) {
        this.OriginGroupName = OriginGroupName;
    }

    /**
     * Get The origin configuration type when `OriginType=self`. Values:
<li>`area`: Configure by region.</li>
<li>`weight`: Configure by weight.</li>
<li>`proto`: Configure by HTTP protocol.</li> When `OriginType=third_party/cos`, leave this field empty. 
     * @return ConfigurationType The origin configuration type when `OriginType=self`. Values:
<li>`area`: Configure by region.</li>
<li>`weight`: Configure by weight.</li>
<li>`proto`: Configure by HTTP protocol.</li> When `OriginType=third_party/cos`, leave this field empty.
     */
    public String getConfigurationType() {
        return this.ConfigurationType;
    }

    /**
     * Set The origin configuration type when `OriginType=self`. Values:
<li>`area`: Configure by region.</li>
<li>`weight`: Configure by weight.</li>
<li>`proto`: Configure by HTTP protocol.</li> When `OriginType=third_party/cos`, leave this field empty.
     * @param ConfigurationType The origin configuration type when `OriginType=self`. Values:
<li>`area`: Configure by region.</li>
<li>`weight`: Configure by weight.</li>
<li>`proto`: Configure by HTTP protocol.</li> When `OriginType=third_party/cos`, leave this field empty.
     */
    public void setConfigurationType(String ConfigurationType) {
        this.ConfigurationType = ConfigurationType;
    }

    /**
     * Get Details of the origin record. 
     * @return OriginRecords Details of the origin record.
     */
    public OriginRecord [] getOriginRecords() {
        return this.OriginRecords;
    }

    /**
     * Set Details of the origin record.
     * @param OriginRecords Details of the origin record.
     */
    public void setOriginRecords(OriginRecord [] OriginRecords) {
        this.OriginRecords = OriginRecords;
    }

    /**
     * Get The origin domain. This field can be specified only when `OriginType=self`.
If it is left empty, the existing configuration is used. 
     * @return HostHeader The origin domain. This field can be specified only when `OriginType=self`.
If it is left empty, the existing configuration is used.
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set The origin domain. This field can be specified only when `OriginType=self`.
If it is left empty, the existing configuration is used.
     * @param HostHeader The origin domain. This field can be specified only when `OriginType=self`.
If it is left empty, the existing configuration is used.
     */
    public void setHostHeader(String HostHeader) {
        this.HostHeader = HostHeader;
    }

    public ModifyOriginGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOriginGroupRequest(ModifyOriginGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.OriginGroupId != null) {
            this.OriginGroupId = new String(source.OriginGroupId);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.OriginGroupName != null) {
            this.OriginGroupName = new String(source.OriginGroupName);
        }
        if (source.ConfigurationType != null) {
            this.ConfigurationType = new String(source.ConfigurationType);
        }
        if (source.OriginRecords != null) {
            this.OriginRecords = new OriginRecord[source.OriginRecords.length];
            for (int i = 0; i < source.OriginRecords.length; i++) {
                this.OriginRecords[i] = new OriginRecord(source.OriginRecords[i]);
            }
        }
        if (source.HostHeader != null) {
            this.HostHeader = new String(source.HostHeader);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "OriginGroupId", this.OriginGroupId);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "OriginGroupName", this.OriginGroupName);
        this.setParamSimple(map, prefix + "ConfigurationType", this.ConfigurationType);
        this.setParamArrayObj(map, prefix + "OriginRecords.", this.OriginRecords);
        this.setParamSimple(map, prefix + "HostHeader", this.HostHeader);

    }
}

