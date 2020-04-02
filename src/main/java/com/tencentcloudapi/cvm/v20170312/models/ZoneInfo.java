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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel{

    /**
    * Availability zone name, such as ap-guangzhou-3.
The following is a list of all availability zones:
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<li> ap-guangzhou-1 (sold out)</li>
<li> ap-guangzhou-2 (sold out)</li>
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<li> ap-shanghai-1 (sold out) </li>
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> eu-moscow-1 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-toronto-1 </li>
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
    * Availability zone ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Availability zone status. Valid values: `AVAILABLE`: available; `UNAVAILABLE`: unavailable.
    */
    @SerializedName("ZoneState")
    @Expose
    private String ZoneState;

    /**
     * Get Availability zone name, such as ap-guangzhou-3.
The following is a list of all availability zones:
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<li> ap-guangzhou-1 (sold out)</li>
<li> ap-guangzhou-2 (sold out)</li>
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<li> ap-shanghai-1 (sold out) </li>
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> eu-moscow-1 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-toronto-1 </li>
<li> na-ashburn-1 </li>
<li> na-ashburn-2 </li>
<li> ap-nanjing-1 </li>
<li> ap-nanjing-2 </li> 
     * @return Zone Availability zone name, such as ap-guangzhou-3.
The following is a list of all availability zones:
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<li> ap-guangzhou-1 (sold out)</li>
<li> ap-guangzhou-2 (sold out)</li>
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<li> ap-shanghai-1 (sold out) </li>
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> eu-moscow-1 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-toronto-1 </li>
<li> na-ashburn-1 </li>
<li> na-ashburn-2 </li>
<li> ap-nanjing-1 </li>
<li> ap-nanjing-2 </li>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone name, such as ap-guangzhou-3.
The following is a list of all availability zones:
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<li> ap-guangzhou-1 (sold out)</li>
<li> ap-guangzhou-2 (sold out)</li>
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<li> ap-shanghai-1 (sold out) </li>
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> eu-moscow-1 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-toronto-1 </li>
<li> na-ashburn-1 </li>
<li> na-ashburn-2 </li>
<li> ap-nanjing-1 </li>
<li> ap-nanjing-2 </li>
     * @param Zone Availability zone name, such as ap-guangzhou-3.
The following is a list of all availability zones:
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<li> ap-guangzhou-1 (sold out)</li>
<li> ap-guangzhou-2 (sold out)</li>
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<li> ap-shanghai-1 (sold out) </li>
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> eu-moscow-1 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-toronto-1 </li>
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
     * Get Availability zone ID 
     * @return ZoneId Availability zone ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Availability zone ID
     * @param ZoneId Availability zone ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Availability zone status. Valid values: `AVAILABLE`: available; `UNAVAILABLE`: unavailable. 
     * @return ZoneState Availability zone status. Valid values: `AVAILABLE`: available; `UNAVAILABLE`: unavailable.
     */
    public String getZoneState() {
        return this.ZoneState;
    }

    /**
     * Set Availability zone status. Valid values: `AVAILABLE`: available; `UNAVAILABLE`: unavailable.
     * @param ZoneState Availability zone status. Valid values: `AVAILABLE`: available; `UNAVAILABLE`: unavailable.
     */
    public void setZoneState(String ZoneState) {
        this.ZoneState = ZoneState;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneState", this.ZoneState);

    }
}

