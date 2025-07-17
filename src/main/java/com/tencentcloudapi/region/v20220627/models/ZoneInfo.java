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
package com.tencentcloudapi.region.v20220627.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * Availability zone name, for example, ap-guangzhou-3.

The names of availability zones across the network are as follows:.
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-seoul-2 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<Li> ap-guangzhou-1 (sold-out)</li>.
<Li> ap-guangzhou-2 (resource out of stock)</li>.
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-guangzhou-6 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-singapore-2 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<Li> ap-shanghai-1 (resource out of stock) </li>.
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-shanghai-5 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> ap-beijing-5 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-ashburn-1 </li>
<li> na-ashburn-2 </li>
<li> ap-nanjing-1 </li>
<li> ap-nanjing-2 </li>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Availability zone description, such as Guangzhou Zone 3.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * AZ ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Availability zone status, including AVAILABLE and UNAVAILABLE. AVAILABLE indicates available, and UNAVAILABLE indicates unavailable.
    */
    @SerializedName("ZoneState")
    @Expose
    private String ZoneState;

    /**
    * Parent zone.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParentZone")
    @Expose
    private String ParentZone;

    /**
    * Parent availability zone ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParentZoneId")
    @Expose
    private String ParentZoneId;

    /**
    * Describes the parent availability zone.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParentZoneName")
    @Expose
    private String ParentZoneName;

    /**
    * zone type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneType")
    @Expose
    private String ZoneType;

    /**
    * Console type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineRoomTypeMC")
    @Expose
    private String MachineRoomTypeMC;

    /**
    * Same as ZoneId. suitable for console invocation.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneIdMC")
    @Expose
    private String ZoneIdMC;

    /**
     * Get Availability zone name, for example, ap-guangzhou-3.

The names of availability zones across the network are as follows:.
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-seoul-2 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<Li> ap-guangzhou-1 (sold-out)</li>.
<Li> ap-guangzhou-2 (resource out of stock)</li>.
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-guangzhou-6 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-singapore-2 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<Li> ap-shanghai-1 (resource out of stock) </li>.
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-shanghai-5 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> ap-beijing-5 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-ashburn-1 </li>
<li> na-ashburn-2 </li>
<li> ap-nanjing-1 </li>
<li> ap-nanjing-2 </li> 
     * @return Zone Availability zone name, for example, ap-guangzhou-3.

The names of availability zones across the network are as follows:.
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-seoul-2 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<Li> ap-guangzhou-1 (sold-out)</li>.
<Li> ap-guangzhou-2 (resource out of stock)</li>.
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-guangzhou-6 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-singapore-2 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<Li> ap-shanghai-1 (resource out of stock) </li>.
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-shanghai-5 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> ap-beijing-5 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-ashburn-1 </li>
<li> na-ashburn-2 </li>
<li> ap-nanjing-1 </li>
<li> ap-nanjing-2 </li>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone name, for example, ap-guangzhou-3.

The names of availability zones across the network are as follows:.
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-seoul-2 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<Li> ap-guangzhou-1 (sold-out)</li>.
<Li> ap-guangzhou-2 (resource out of stock)</li>.
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-guangzhou-6 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-singapore-2 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<Li> ap-shanghai-1 (resource out of stock) </li>.
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-shanghai-5 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> ap-beijing-5 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-ashburn-1 </li>
<li> na-ashburn-2 </li>
<li> ap-nanjing-1 </li>
<li> ap-nanjing-2 </li>
     * @param Zone Availability zone name, for example, ap-guangzhou-3.

The names of availability zones across the network are as follows:.
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-seoul-2 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<Li> ap-guangzhou-1 (sold-out)</li>.
<Li> ap-guangzhou-2 (resource out of stock)</li>.
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-guangzhou-6 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-singapore-2 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<Li> ap-shanghai-1 (resource out of stock) </li>.
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-shanghai-5 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> ap-beijing-5 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-ashburn-1 </li>
<li> na-ashburn-2 </li>
<li> ap-nanjing-1 </li>
<li> ap-nanjing-2 </li>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Availability zone description, such as Guangzhou Zone 3. 
     * @return ZoneName Availability zone description, such as Guangzhou Zone 3.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Availability zone description, such as Guangzhou Zone 3.
     * @param ZoneName Availability zone description, such as Guangzhou Zone 3.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get AZ ID 
     * @return ZoneId AZ ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID
     * @param ZoneId AZ ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Availability zone status, including AVAILABLE and UNAVAILABLE. AVAILABLE indicates available, and UNAVAILABLE indicates unavailable. 
     * @return ZoneState Availability zone status, including AVAILABLE and UNAVAILABLE. AVAILABLE indicates available, and UNAVAILABLE indicates unavailable.
     */
    public String getZoneState() {
        return this.ZoneState;
    }

    /**
     * Set Availability zone status, including AVAILABLE and UNAVAILABLE. AVAILABLE indicates available, and UNAVAILABLE indicates unavailable.
     * @param ZoneState Availability zone status, including AVAILABLE and UNAVAILABLE. AVAILABLE indicates available, and UNAVAILABLE indicates unavailable.
     */
    public void setZoneState(String ZoneState) {
        this.ZoneState = ZoneState;
    }

    /**
     * Get Parent zone.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParentZone Parent zone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParentZone() {
        return this.ParentZone;
    }

    /**
     * Set Parent zone.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParentZone Parent zone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParentZone(String ParentZone) {
        this.ParentZone = ParentZone;
    }

    /**
     * Get Parent availability zone ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParentZoneId Parent availability zone ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParentZoneId() {
        return this.ParentZoneId;
    }

    /**
     * Set Parent availability zone ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParentZoneId Parent availability zone ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParentZoneId(String ParentZoneId) {
        this.ParentZoneId = ParentZoneId;
    }

    /**
     * Get Describes the parent availability zone.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParentZoneName Describes the parent availability zone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParentZoneName() {
        return this.ParentZoneName;
    }

    /**
     * Set Describes the parent availability zone.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParentZoneName Describes the parent availability zone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParentZoneName(String ParentZoneName) {
        this.ParentZoneName = ParentZoneName;
    }

    /**
     * Get zone type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneType zone type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneType() {
        return this.ZoneType;
    }

    /**
     * Set zone type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneType zone type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneType(String ZoneType) {
        this.ZoneType = ZoneType;
    }

    /**
     * Get Console type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineRoomTypeMC Console type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMachineRoomTypeMC() {
        return this.MachineRoomTypeMC;
    }

    /**
     * Set Console type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineRoomTypeMC Console type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineRoomTypeMC(String MachineRoomTypeMC) {
        this.MachineRoomTypeMC = MachineRoomTypeMC;
    }

    /**
     * Get Same as ZoneId. suitable for console invocation.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneIdMC Same as ZoneId. suitable for console invocation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneIdMC() {
        return this.ZoneIdMC;
    }

    /**
     * Set Same as ZoneId. suitable for console invocation.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneIdMC Same as ZoneId. suitable for console invocation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneIdMC(String ZoneIdMC) {
        this.ZoneIdMC = ZoneIdMC;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneState != null) {
            this.ZoneState = new String(source.ZoneState);
        }
        if (source.ParentZone != null) {
            this.ParentZone = new String(source.ParentZone);
        }
        if (source.ParentZoneId != null) {
            this.ParentZoneId = new String(source.ParentZoneId);
        }
        if (source.ParentZoneName != null) {
            this.ParentZoneName = new String(source.ParentZoneName);
        }
        if (source.ZoneType != null) {
            this.ZoneType = new String(source.ZoneType);
        }
        if (source.MachineRoomTypeMC != null) {
            this.MachineRoomTypeMC = new String(source.MachineRoomTypeMC);
        }
        if (source.ZoneIdMC != null) {
            this.ZoneIdMC = new String(source.ZoneIdMC);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneState", this.ZoneState);
        this.setParamSimple(map, prefix + "ParentZone", this.ParentZone);
        this.setParamSimple(map, prefix + "ParentZoneId", this.ParentZoneId);
        this.setParamSimple(map, prefix + "ParentZoneName", this.ParentZoneName);
        this.setParamSimple(map, prefix + "ZoneType", this.ZoneType);
        this.setParamSimple(map, prefix + "MachineRoomTypeMC", this.MachineRoomTypeMC);
        this.setParamSimple(map, prefix + "ZoneIdMC", this.ZoneIdMC);

    }
}

